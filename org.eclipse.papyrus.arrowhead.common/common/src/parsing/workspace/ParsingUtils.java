package parsing.workspace;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

import com.google.common.base.CaseFormat;

import dto.APXLocalCloudDesignDescription;

/**
 * This class offers a set of utils for the reading of files and folders.
 * 
 * @author fernand0labra
 *
 */
public class ParsingUtils {
	
	//=================================================================================================
	// methods
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Read workspace projects
	 * 
	 * @return List of the workspace projects
	 */
	public static IProject[] readWorkspace() {
		// Get the root of the workspace
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		System.out.println("WORKSPACE:"); // TODO Remove Trace
		
		IWorkspaceRoot root = workspace.getRoot();
		System.out.println(workspace.toString()); // TODO Remove Trace
		System.out.println(root.toString()); // TODO Remove Trace
		
		// Get all projects in the workspace
		IProject[] projects = root.getProjects();
		
		// Loop over all projects
		IPath path = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		String workspacePath = path.toString();
		System.out.println("Projects in the workspace:" + workspacePath); // TODO Remove Trace
		for (IProject project : projects) { // TODO Remove Trace
			System.out.println(project.getName());
			System.out.println(project.getLocation());
		}

		return projects;
	}
	
	//-------------------------------------------------------------------------------------------------
	/**
	 * Reads the workspace defined by the path and returns the folders or files
	 * in the given directory
	 * 
	 * @param path The path to the directory
	 * @param directoryCheck Check the folders when True
	 * @return A list of files or folders in the given directory
	 */
	public static String[] readWorkspace(String path, boolean directoryCheck)  {
		File file = new File(path);
		return directoryCheck
		
			? file.list(new FilenameFilter() { // Return a list of directories if directoryCheck
				@Override
				public boolean accept(File current, String name) {
					return new File(current, name).isDirectory();
				}
			})
					
			: file.list(); // Return a list of files if !directoryCheck
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Creates a new folder in the workspace
	 * 
	 * @param Directory The path to the directory
	 * @param FolderName The name of the folder
	 */
	public static void newFolder(String Directory, String FolderName) {
		String path = Directory + "/" + FolderName;
		File f1 = new File(path); // Instantiate the File class
		boolean bool = f1.mkdir(); // Creating a folder using mkdir() method
		System.out.println(bool ? "Folder is created successfully" : "Error Found!"); // TODO Remove Trace
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Transforms a string from UpperCamel to kebab-case
	 * 
	 * @param str The string to transforme
	 * @return The transformed string
	 */
	public static String toKebabCase(String str) {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, str);
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Transforms a string from kebab-case to snake_case
	 * 
	 * @param str The string to transforme
	 * @return The transformed string
	 */
	public static String toSnakeCase(String str) {
		return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_UNDERSCORE, str);
	}	
}
