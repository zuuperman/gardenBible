package be.menhireffect.gardenbible;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GardenItemAdapter extends BaseAdapter {

	private Context mContext;
	private int resourceId;
	private List<GardenItem> items;

	public GardenItemAdapter(Context context, int resourceId) {
		this.mContext = context;
		this.items = new ArrayList<GardenItem>();
	}

	public GardenItemAdapter(Context context, int resourceId,
			List<GardenItem> items) {
		this.mContext = context;
		this.resourceId = resourceId;
		this.items = items;
	}

	public int getCount() {
		return this.items.size();
	}

	public GardenItem getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new View for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {

		GardenItem currItem = this.items.get(position);
		View listView;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			listView = inflater.inflate(resourceId, parent, false);
		} else {
			listView = (View) convertView;
		}

		ImageView imgPicture = (ImageView)listView.findViewById(R.id.bmpGardenItemImage);
		imgPicture.setLayoutParams(new LinearLayout.LayoutParams(85, 85));
		imgPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imgPicture.setPadding(8, 8, 8, 8);

		TextView txtName = (TextView) listView
				.findViewById(R.id.txtGardenItemName);
		txtName.setText(currItem.getName());

		return listView;
	}

}
