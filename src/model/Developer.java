package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sarra on 13/02/17.
 */
public class Developer {
    private String login;
    private Long ID;
    private ArrayList<Repository> repositories;
    private ArrayList<Commit> commits;
    private ArrayList<Commit> authoredCommits;
    private String mail;
    private ArrayList<Issue> createdIssues;
    private ArrayList<Issue> assignedIssues;

    public static HashMap<Long,Developer> developersMap =new HashMap<>();

    private Developer(String login, Long ID) {
        this.login = login;
        this.ID = ID;
        this.repositories=new ArrayList<>();
        this.commits=new ArrayList<>();
        this.authoredCommits=new ArrayList<>();
        this.createdIssues=new ArrayList<>();
        this.assignedIssues=new ArrayList<>();
    }

    public static Developer createDeveloper(String login, Long ID){
        Developer developer=new Developer(login, ID);
        developersMap.put(ID,developer);
        return developer;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }


    public ArrayList<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(ArrayList<Repository> repositories) {
        this.repositories = repositories;
    }

    public void addRepository(Repository repository){
        this.repositories.add(repository);
    }

    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public void addAuthoredCommit(Commit commit){
        this.authoredCommits.add(commit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;

        Developer developer = (Developer) o;

        if (login != null ? !login.equals(developer.login) : developer.login != null) return false;
        return ID.equals(developer.ID);
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    public void print(){
        System.out.println("login: "+ this.login);
        System.out.println("id: "+this.ID);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Issue> getCreatedIssues() {
        return createdIssues;
    }

    public void addCreatedIssue(Issue issue){
        this.createdIssues.add(issue);
    }

    public ArrayList<Issue> getAssignedIssues() {
        return assignedIssues;
    }
    public void addAssignedIssue(Issue issue){
        this.assignedIssues.add(issue);
    }


}
