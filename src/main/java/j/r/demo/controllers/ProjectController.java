package j.r.demo.controllers;

import j.r.demo.models.Project;
import j.r.demo.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET, value = "/projects")
    public String getAllProjects(Model model){
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }

    @RequestMapping("/project/new")
    public String newProject(Model model){
        model.addAttribute("project", new Project());
        return "projectform";
    }

    @RequestMapping("/project/edit/{id}")
    public String editProject(@PathVariable Long id, Model model){
        model.addAttribute("project", projectService.getProjectById(id));
        return "projectform";
    }

    @RequestMapping(method = RequestMethod.POST, value = "project")
    public String saveProject(Project project){
        projectService.saveProject(project);
        return "redirect:/projects";
    }

    @RequestMapping("/project/delete/{id}")
    public String deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
        return "redirect:/projects";
    }

}
