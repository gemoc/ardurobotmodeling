/**
 */
package org.gemoc.ardurobotml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.ardurobotml.RegionContainer#getOwnedRegions <em>Owned Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getRegionContainer()
 * @model abstract="true"
 * @generated
 */
public interface RegionContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Regions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ardurobotml.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Regions</em>' containment reference list.
	 * @see org.gemoc.ardurobotml.ArdurobotmlPackage#getRegionContainer_OwnedRegions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getOwnedRegions();

} // RegionContainer
