package info.androidhive.slidingmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersondetailFragment {
	public PersondetailFragment(){}
	

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_persondetail, container, false);
         
        return rootView;
    }
}
