package com.cleoware.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SONG database table.
 * 
 */
@Entity
public class Song implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SONG_SONGID_GENERATOR", sequenceName="SONG_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SONG_SONGID_GENERATOR")
	@Column(name="SONG_ID")
	private long songId;

	@Column(name="SONG_NAME")
	private String songName;

	@Column(name="TRACK_NUMBER")
	private BigDecimal trackNumber;

	//bi-directional many-to-one association to Album
    @ManyToOne
	@JoinColumn(name="ALBUM_ID")
	private Album album;

    public Song() {
    }

	public long getSongId() {
		return this.songId;
	}

	public void setSongId(long songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return this.songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public BigDecimal getTrackNumber() {
		return this.trackNumber;
	}

	public void setTrackNumber(BigDecimal trackNumber) {
		this.trackNumber = trackNumber;
	}

	public Album getAlbum() {
		return this.album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}
	
}