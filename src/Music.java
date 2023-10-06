import java.util.Objects;

public class Music {
private Date releasedate;
private String title;
private Artist mfcartist;
private double duration;
private String genere;
private String albumname;

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getMfcartist() {
        return mfcartist;
    }

    public void setMfcartist(Artist mfcartist) {
        this.mfcartist = mfcartist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }

    public Music(Date releasedate, String title, Artist mfcartist, double duration, String genere, String albumname) {
        this.releasedate = releasedate;
        this.title = title;
        this.mfcartist = mfcartist;
        this.duration = duration;
        this.genere = genere;
        this.albumname = albumname;
    }

    @Override
    public String toString() {
        String musicmodifier = String.format("%s %s %s %.1f %s %s",releasedate,title,mfcartist,duration,genere,albumname);
        return musicmodifier;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Double.compare(duration, music.duration) == 0 && Objects.equals(releasedate, music.releasedate) && Objects.equals(title, music.title) && Objects.equals(mfcartist, music.mfcartist) && Objects.equals(genere, music.genere) && Objects.equals(albumname, music.albumname);
    }


}
