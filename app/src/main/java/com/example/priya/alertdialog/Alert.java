package com.example.priya.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Priya on 11/24/2017.
 */

public class Alert extends DialogFragment {
// creates dialog fragment
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        return new AlertDialog.Builder(getActivity())

                //set dialog image
                .setIcon(R.drawable.untitled)

                //set dialog title
                .setTitle("Confirm Delete")

                // set Dialog message
                .setMessage("Are you sure you want to delete")

                // set Positive Response Button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Yes was Clicked", Toast.LENGTH_SHORT).show();
                    }
                })             // set Negative Response Button

                            .setNegativeButton("No",new DialogInterface.OnClickListener(){
                                @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getActivity(), "Yes was Clicked", Toast.LENGTH_SHORT).show();
                                }
                    }).create();






        }
    }



