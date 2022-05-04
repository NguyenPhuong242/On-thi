public class User{
  private final int id;
  Set<Track> likes = new HashSet<>();
  private String name;
  public User(int id, String name){
    this.id = id;
    this.name = name;
  }
  public void addLikes(Track track){
    likes.add(track);
  }
  public Set<Track> getLikes(){
    Set<Track> copy = new HashSet<>(likes);
    for (Track track : likes){
      
      copy.add(new Track (track));
    }
    return copy;
  }
  
  
