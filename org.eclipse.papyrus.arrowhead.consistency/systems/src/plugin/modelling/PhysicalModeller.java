package plugin.modelling;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;

import plugin.pojo.DeployedEntity;
import plugin.pojo.InterfaceDesignDescription;
import plugin.pojo.LocalCloudDesignDescription;
import plugin.pojo.SystemDesignDescription;

/**
 * 
 * This class adds or updates the physical elements of the model, which are those blocks implementing
 * the LocalCloudDesignDescription or DeployedEntity stereotypes.
 * 
 * @author fernand0labra
 *
 */
public class PhysicalModeller {
	
	// UML stereotypes implemented by each class
	public static EList<Stereotype> localCloudDescriptionStereotypeList = null;
	
	/**
	 * Adds a local cloud to the model from the LocalCloudDesignDescription object that describes it
	 * 
	 * @param newLocalCloud The LocalCloudDesignDescription object describing the new local cloud
	 * @param umlModel The UML Model object
	 * @return The UML PackageableElement describing the local cloud
	 */
	public static PackageableElement addLocalCloud(LocalCloudDesignDescription newLocalCloud, Model umlModel) {
		return null; // TODO Complete
	}
	
	/**
	 * Updates the values of a modelled LocalCloudDesignDescription 
	 * 
	 * @param newDeployedEntityList A list of the new DeployedEntity objects of the system
	 * @param oldLocalCloud The PackageableElement containing the old local cloud
	 * @return A PackageableElement containing the new local cloud
	 */
	public static PackageableElement updateLocalCloud(ArrayList<DeployedEntity> newDeployedEntityList, PackageableElement oldLocalCloud) {
		return null; // TODO Complete
	}
	
	/**
	 * Updates the internal parameters of a modelled LocalCloudDesignDescription
	 * 
	 * @param newLocalCloud The LocalCloudDesignDescription object describing the new local cloud
	 * @param oldLocalCloud The PackageableElement containingthe old local cloud
	 */
	public static void updateInternalLocalCloud(LocalCloudDesignDescription newLocalCloud, PackageableElement oldLocalCloud) {
		// TODO Complete
	}
	
	/**
	 * Adds a deployed entity to the model from the DeployedEntity object that describes it
	 * 
	 * @param newDeployedEntity The DeployedEntity object describing the new deployed entity
	 * @param umlModel umlModel The UML Model object
	 * @return The UML PackageableElement describing the deployed entity
	 */
	public static PackageableElement addDeployedEntity(DeployedEntity newDeployedEntity, Model umlModel) {
		return null; // TODO Complete
	}
	
	/**
	 * Updates the values of a modelled DeployedEntity
	 * 
	 * @param newSystem The SystemDesignDescription object describing the new system
	 * @param newInterfaceList A list of the new InterfaceDesignDescription objects of the system
	 * @param oldDeployedEntity The PackageableElement containing the old deployed entity
	 * @return A PackageableElement containing the new deployed entity
	 */
	public static PackageableElement updateDeployedEntity(SystemDesignDescription newSystem, ArrayList<InterfaceDesignDescription> newInterfaceList, PackageableElement oldDeployedEntity) {
		return null; // TODO Complete
	}
	
	/**
	 * Updates the internal parameters of a modelled DeployedEntity
	 * 
	 * @param newDeployedEntity The DeployedEntity object describing the new deployed entity
	 * @param oldDeployedEntity The PackageableElement containing the old deployed entity
	 */
	public static void updateInternalDeployedEntity(DeployedEntity newDeployedEntity, PackageableElement oldDeployedEntity) {
		// TODO Complete
	}
}
