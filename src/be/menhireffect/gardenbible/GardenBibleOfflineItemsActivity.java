package be.menhireffect.gardenbible;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class GardenBibleOfflineItemsActivity extends FragmentActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.offline_items);

		FragmentTransaction fragmentTransaction = getSupportFragmentManager()
				.beginTransaction();
		Fragment frOfflineList = new OfflineItemListFragment();
		fragmentTransaction.replace(R.id.mainFragement, frOfflineList);
		fragmentTransaction.commit();

	}

}
