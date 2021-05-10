package android.studioprojects.everydayspells;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import android.studioprojects.everydayspells.Adapter.Adapter;
import android.studioprojects.everydayspells.Model.ListItem;

public class MainActivity extends AppCompatActivity {

private Dialog myDialog;
//Button dismissButton;
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundGradient();
        myDialog = new Dialog(this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i++) {
            ListItem item = new ListItem(
                    "Item " + (i+1),
                    "Description"
            );

            listItems.add(item);
        }

        adapter = new Adapter(this, listItems);
        recyclerView.setAdapter(adapter);


    }



    public void PopUp(View view){
        TextView spellIntroTV;
        spellIntroTV = findViewById(R.id.spellsIntroTxt);
        myDialog.setContentView(R.layout.activity_popup);
        myDialog.show();
    }

    public void popUpDismiss (View view){
        myDialog.setContentView(R.layout.activity_popup);
        myDialog.dismiss();
    }

    public void backgroundGradient() {

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(10000);
        animationDrawable.start();


    }

}