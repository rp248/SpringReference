package com.spring.ioc.SpringIoc;

import com.spring.ioc.SpringIoc.concepts.Concept;
import com.spring.ioc.SpringIoc.concepts.ConceptFactory;
import com.spring.ioc.SpringIoc.concepts.ConceptMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringIocApplication.class, args);
		//Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.BASIC_BEAN_DEFINITION);
		//Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.IMPORT_BEAN_DEFINITION);
		//Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.REGISTER_BEAN_USING_CODE);
		//Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.NAMING_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.INSTANTIATING_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.DI_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.DEPENDS_ON_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.LAZY_EAGER_INITIALIZATION_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.AUTO_WIRING_COLLABORATORS_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.METHOD_INJECTION_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.LIFECYCLE_CALLBACKS_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.START_STOP_CALLBACKS_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.APP_AWARE_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.BEAN_AWARE_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.INHERITANCE_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.CUSTOMIZATION_BEAN_POST_PROCESSOR_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.CUSTOMIZATION_BEAN_FACTORY_POST_PROCESSOR_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.CUSTOMIZATION_PROPERTY_PLACEHOLDER_CONFIGURER_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.CUSTOMIZATION_PROPERTY_OVERRIDE_CONFIGURER_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.CUSTOMIZATION_FACTORY_BEAN_DEFINITION);
        //Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.REQUIRED_ANNOTATION);
        Concept concept = ConceptFactory.getInstance().makeConcept(ConceptMapping.AUTO_WIRE_ANNOTATION);
        concept.display();
    }
}
