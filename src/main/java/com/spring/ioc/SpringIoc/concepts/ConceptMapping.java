package com.spring.ioc.SpringIoc.concepts;

import java.util.HashMap;

public class ConceptMapping {
    private HashMap<String, String> definitions;

    public static final String BASIC_BEAN_DEFINITION = "basic_bean_definitions";
    public static final String IMPORT_BEAN_DEFINITION = "import_bean_definitions";
    public static final String REGISTER_BEAN_USING_CODE = "register_bean_using_code";
    public static final String NAMING_BEAN_DEFINITION = "naming_bean_definition";
    public static final String INSTANTIATING_BEAN_DEFINITION = "instantiating_bean_definition";
    public static final String DI_BEAN_DEFINITION = "dependency_injection_bean_definition";
    public static final String DEPENDS_ON_BEAN_DEFINITION = "depends_on_bean_definition";
    public static final String LAZY_EAGER_INITIALIZATION_BEAN_DEFINITION = "lazy_eager_initialization_definition";
    public static final String AUTO_WIRING_COLLABORATORS_BEAN_DEFINITION = "autowiring_collaborators_bean_definition";
    public static final String METHOD_INJECTION_BEAN_DEFINITION = "method_injection_bean_definition";
    public static final String LIFECYCLE_CALLBACKS_BEAN_DEFINITION = "lifecycle_callbacks_bean_definition";
    public static final String START_STOP_CALLBACKS_BEAN_DEFINITION = "start_stop_callbacks_bean_definition";

    public static final String APP_AWARE_BEAN_DEFINITION = "application_ware_interface_bean_definition";
    public static final String BEAN_AWARE_BEAN_DEFINITION = "bean_ware_interface_bean_definition";

    public static final String INHERITANCE_BEAN_DEFINITION = "inheritance_bean_definition";

    public static final String CUSTOMIZATION_BEAN_POST_PROCESSOR_DEFINITION = "extension_bean_post_processor_bean_definition";
    public static final String CUSTOMIZATION_BEAN_FACTORY_POST_PROCESSOR_DEFINITION = "extension_bean_factory_post_processor_bean_definition";
    public static final String CUSTOMIZATION_PROPERTY_PLACEHOLDER_CONFIGURER_DEFINITION = "extenstion_property_placeholder_configurer_bean_definition";
    public static final String CUSTOMIZATION_PROPERTY_OVERRIDE_CONFIGURER_DEFINITION = "extenstion_property_override_configurer_bean_definition";
    public static final String CUSTOMIZATION_FACTORY_BEAN_DEFINITION = "extenstion_factory_bean_definition";

    public static final String REQUIRED_ANNOTATION = "required_annotation";
    public static final String AUTO_WIRE_ANNOTATION = "auto_wired_annotation";


    public ConceptMapping() {
        loadConceptsMappings();
    }

    private void loadConceptsMappings() {
        definitions = new HashMap<>();
        definitions.put(BASIC_BEAN_DEFINITION, "definitions/basic-bean-definition.xml");
        definitions.put(IMPORT_BEAN_DEFINITION, "definitions/import-bean-definitions.xml");
        definitions.put(REGISTER_BEAN_USING_CODE, null);
        definitions.put(NAMING_BEAN_DEFINITION, "definitions/naming-bean-definition.xml");
        definitions.put(INSTANTIATING_BEAN_DEFINITION, "definitions/instantiating-bean-types-definition.xml");
        definitions.put(DI_BEAN_DEFINITION, "definitions/dependency-injection-definition.xml");
        definitions.put(DEPENDS_ON_BEAN_DEFINITION, "definitions/depends-on-bean-definition.xml");
        definitions.put(LAZY_EAGER_INITIALIZATION_BEAN_DEFINITION,
                "definitions/lazy-eager-initialization-bean-definition.xml");
        definitions.put(AUTO_WIRING_COLLABORATORS_BEAN_DEFINITION,
                "definitions/autowiring-collaborators-definition.xml");
        definitions.put(METHOD_INJECTION_BEAN_DEFINITION,
                "definitions/look-up-method-bean-definition.xml");
        definitions.put(LIFECYCLE_CALLBACKS_BEAN_DEFINITION,
                "definitions/lifecycle-callbacks-bean-definition.xml");
        definitions.put(START_STOP_CALLBACKS_BEAN_DEFINITION,
                "definitions/lifecycle/start-stop-callbacks-bean-definition.xml");
        definitions.put(APP_AWARE_BEAN_DEFINITION,
                "definitions/aware-interfaces/application-aware-interface-bean-definition.xml");
        definitions.put(BEAN_AWARE_BEAN_DEFINITION,
                "definitions/aware-interfaces/bean-aware-interface-bean-definition.xml");
        definitions.put(INHERITANCE_BEAN_DEFINITION,
                "definitions/bean-inheritance/inheritance-bean-definition.xml");
        definitions.put(CUSTOMIZATION_BEAN_POST_PROCESSOR_DEFINITION,
                "definitions/bean-customization/customization-bean-post-processor.xml");
        definitions.put(CUSTOMIZATION_BEAN_FACTORY_POST_PROCESSOR_DEFINITION,
                "definitions/bean-customization/customization-bean-factory-post-processor.xml");
        definitions.put(CUSTOMIZATION_PROPERTY_PLACEHOLDER_CONFIGURER_DEFINITION,
                "definitions/bean-customization/customization-property-placeholder-configurer.xml");
        definitions.put(CUSTOMIZATION_PROPERTY_OVERRIDE_CONFIGURER_DEFINITION,
                "definitions/bean-customization/customization-property-override-configurer.xml");
        definitions.put(CUSTOMIZATION_FACTORY_BEAN_DEFINITION,
                "definitions/bean-customization/customization-factory-bean-definition.xml");
        definitions.put(REQUIRED_ANNOTATION,
                "definitions/annotation-config/required-annotation-definition.xml");
        definitions.put(AUTO_WIRE_ANNOTATION,
                "definitions/annotation-config/auto-wire-annotation-definition.xml");

    }

    public String getBeanMetaDataForConcept(String conceptName) {
        return definitions.get(conceptName);
    }
}
