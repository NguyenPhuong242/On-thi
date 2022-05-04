public class Track{
  private String title;
  private String artist;
  private String album;
  private int year;
  public Track(private String title, private String artist, private String album,private int year){
    this.title = title;
    this.artist = artist;
    this album = album;
    this.year = year;
  }
  public String tostring{
    return title + artist + album + year;
  }
  public Track(Track track){
    this.title = track.title;
    this.artist = track.artist;
    this album = track.album;
    this.year = track.year;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setArtist(String artist){
    this.artist = artist;
  }
  public void setAlbum(String album){
    this.album = album;
  }
  public void setYear(int year){
    this.year = year;
  }
  public String getTitle(){
    return this.title ;
  }
  public String getArtist(){
    return this.artist ;
  }
  public String getAlbum(){
    retrun this.album ;
  }
  public String getYear(){
    return this.year ;
  }
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (!(obj instanceof Track)) return false;
    Track track = (Track) obj;
    if (!this.title.equals(track.title)) return false;
    if (!this.author.equals(track.author)) return false;
    if (!this.album.equals(track.album)) return false;
    if (this.year != track.year) return false;
    return true;
}
  
  
    
