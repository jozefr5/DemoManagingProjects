package j.r.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;
    @Version
    private Long version;
    private String projectId;
    private String name;
    private String abbreviation;
    private String customer;

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCustomer() {
        return customer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
