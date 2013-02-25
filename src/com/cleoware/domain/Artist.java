package com.cleoware.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ARTIST database table.
 * 
 */
@Entity
public class Artist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ARTIST_ARTISTID_GENERATOR", sequenceName="ARTIST_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ARTIST_ARTISTID_GENERATOR")
	@Column(name="ARTIST_ID")
	private String artistId;

	@Column(name="ARTIST_NAME")
	private String artistName;

	//bi-directional many-to-many association to Album
    @ManyToMany
	@JoinTable(
		name="ARTIST_ALBUM"
		, joinColumns={
			@JoinColumn(name="ARTIST_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ALBUM_ID")
			}
		)
	private List<Album> albums;

    public Artist() {
    }

	public String getArtistId() {
		return this.artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return this.artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Album> getAlbums() {
		return this.albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
}