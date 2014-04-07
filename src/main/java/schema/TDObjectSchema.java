package main.java.schema;

import main.java.engine.objects.TDObject;

public abstract class TDObjectSchema extends AbstractSchema	{
	
	private Class<? extends TDObject> myConcreteType;

	protected TDObjectSchema(Class<? extends TDObject> concreteType) {
		super();
		myConcreteType = concreteType;
	}

	public Class<? extends TDObject> getMyConcreteType() {
		return myConcreteType;
	}

	/**
	 * Add a new attribute and its value to the internal attributes map. Ensure
	 * attribute has toString method.
	 * 
	 * @param attributeName
	 * @param attributeValue
	 */
	@Override
	public void addAttribute(String attributeName, Object attributeValue) {
		myAttributesMap.put(attributeName, attributeValue.toString());
//		myAttributesMap.put(TDObject.NAME, defineName()); i don't think i need this -- jordan
	}
	
	/**
	 * Give me the name of the object to be created.
	 * @return Name of the object
	 */
	public abstract String defineName();
	
}