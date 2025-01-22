package projects.java.adapterPatterns;

public class LegacyStudent implements ILegacyStudent {
    private String id;
    private String fullName;

    @Override
    public String getId() { return id; }
    @Override
    public void setId(String id) { this.id = id; }
    @Override
    public String getFullName() { return fullName; }
    @Override
    public void setFullName(String fullName) { this.fullName = fullName; }
  }
