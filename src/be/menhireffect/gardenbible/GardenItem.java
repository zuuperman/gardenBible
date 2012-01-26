package be.menhireffect.gardenbible;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class GardenItem {

	private String strName;
	private Bitmap bmpImage;

	public GardenItem() {
	}

	public GardenItem(String name, String image) {
		this.strName = name;
		try {
		  this.bmpImage = BitmapFactory.decodeStream((InputStream)new URL(image).getContent());
		} catch (MalformedURLException e) {
		  e.printStackTrace();
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}

	public void setName(String name) {
		this.strName = name;
	}

	public void setImage(Bitmap image) {
		this.bmpImage = image;
	}

	public String getName() {
		return this.strName;
	}

	public Bitmap getImage() {
		return this.bmpImage;
	}

}
