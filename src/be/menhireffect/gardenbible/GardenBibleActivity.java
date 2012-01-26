package be.menhireffect.gardenbible;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GardenBibleActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
		// COUNTRIES));

		TextView tv = new TextView(this);
		tv.setText("hello world");
		setContentView(tv);
		// ListView lv = getListView();

	}
}