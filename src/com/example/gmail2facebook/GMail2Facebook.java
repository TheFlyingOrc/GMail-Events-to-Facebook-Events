package com.example.gmail2facebook;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GMail2Facebook extends Activity {
	static final int DIALOG_EXPORT_ID = 0;
	
	private OnClickListener exportListener = new OnClickListener() {
    	public void onClick(View v) {
    		showDialog(DIALOG_EXPORT_ID);
    	}
    };
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button exportButton = (Button)findViewById(R.id.button);
        exportButton.setOnClickListener(exportListener);
    }
    
    /** Called anytime Android receives a call to showDialog(int). */
    protected Dialog onCreateDialog(int id) {
    	Dialog dialog;
    	switch(id) {
    	case DIALOG_EXPORT_ID:
    		AlertDialog.Builder builder = new AlertDialog.Builder(this);
    		builder.setMessage("Event has been exported to Facebook!");
    		dialog = builder.create();
    		break;
    	default:
    		dialog = null;
    	}
    	return dialog;
    }
    
}