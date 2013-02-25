package com.cleoware.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ALBUM database table.
 * 
 */
@Entity
public class Album implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ALBUM_ALBUMID_GENERATOR", sequenceName="ALBUM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ALBUM_ALBUMID_GENERATOR")
	@Column(name="ALBUM_ID")
	private long albumId;

	@Column(name="ALBUM_NAME")
	private String albumName;

	//bi-directional many-to-many association to Artist
	@ManyToMany(mappedBy="albums")
	private List<Artist> artists;

	//bi-directional many-to-one association to Song
	@OneToMany(mappedBy="album")
	private List<Song> songs;

    public Album() {
    }

	public long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return this.albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public List<Artist> getArtists() {
		return this.artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	
	public List<Song> getSongs() {
		return this.songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
}