package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by AhmedCo on 27/01/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

  public WordAdapter(Activity context, ArrayList<Word> words) {

    super(context, 0, words);
  }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
   // Check if the existing view is being reused, otherwise inflate the view
   View listItemView = convertView;
   if(listItemView == null) {
     listItemView = LayoutInflater.from(getContext()).inflate(
         R.layout.listview, parent, false);
   }

   // Get the {@link AndroidFlavor} object located at this position in the list
   Word currentWord = getItem(position);

   // Find the TextView in the list_item.xml layout with the ID version_name
   TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok);
   // Get the version name from the current AndroidFlavor object and
   // set this text on the name TextView
   nameTextView.setText(currentWord.getMiwokTranslation());

   // Find the TextView in the list_item.xml layout with the ID version_number
   TextView numberTextView = (TextView) listItemView.findViewById(R.id.english);
   // Get the version number from the current AndroidFlavor object and
   // set this text on the number TextView
   numberTextView.setText(currentWord.getDefaultTranslation());


   // Return the whole list item layout (containing 2 TextViews and an ImageView)
   // so that it can be shown in the ListView
   return listItemView;
 }
}
