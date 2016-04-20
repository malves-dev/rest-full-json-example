package com.malves.dev.model;

/**
 * 
 * @author MarioS
 *
 */
public class Artist {

	String title;
	String name;
	String year;
	String album;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Artist [album=" + album + " year=" + year + " title=" + title + ", name=" + name + "]";
	}

}
