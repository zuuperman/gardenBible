package be.menhireffect.gardenbible;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class OfflineItemListFragment extends Fragment {

	private GardenItemAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.offline_items_fragment, container,
				false);
		GridView grdOfflineItems = (GridView) v.findViewById(R.id.grdItemList);
		grdOfflineItems.setAdapter(this.adapter);

		return v;

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		List<GardenItem> items = new ArrayList<GardenItem>();
		items.add(new GardenItem("Testing", "http://www.menhireffect.be/sites/all/themes/obelix/images/announcements.gif"));
		items.add(new GardenItem("Testing 2", "http://www.menhireffect.be/sites/all/themes/obelix/images/announcements.gif"));
		items.add(new GardenItem("Testing 3", "http://www.menhireffect.be/sites/all/themes/obelix/images/announcements.gif"));

		super.onCreate(savedInstanceState);
		adapter = new GardenItemAdapter(getActivity().getApplicationContext(),
				R.layout.garden_item_teaser, items);
	}

}