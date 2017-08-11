package com.spring.ioc.SpringIoc.concepts;

import com.spring.ioc.SpringIoc.concepts.ioc.*;
import com.spring.ioc.SpringIoc.concepts.ioc.aware.interfaces.ApplicationAwareBeanDefinition;
import com.spring.ioc.SpringIoc.concepts.ioc.aware.interfaces.BeanAwareBeanDefinition;
import com.spring.ioc.SpringIoc.concepts.ioc.bean.customization.CustomizationBeanFactoryPostProcessor;
import com.spring.ioc.SpringIoc.concepts.ioc.bean.customization.CustomizationBeanPostProcessor;
import com.spring.ioc.SpringIoc.concepts.ioc.bean.inheritance.BeanInheritanceDefinition;
import com.spring.ioc.SpringIoc.concepts.ioc.lifecyle.StartStopCallbacksDefinition;

public class ConceptFactory {
    private static ConceptFactory ourInstance = new ConceptFactory();

    public static ConceptFactory getInstance() {
        return ourInstance;
    }

    private ConceptMapping concepts;

    private ConceptFactory() {
        concepts = new ConceptMapping();
    }

    public Concept makeConcept(String conceptName) {
        Concept concept = null;
         String definitionPath = concepts.getBeanMetaDataForConcept(conceptName);
         if (ConceptMapping.BASIC_BEAN_DEFINITION.equals(conceptName))
             concept = new BasicBeanDefinition(definitionPath);
         else if (ConceptMapping.IMPORT_BEAN_DEFINITION.equals(conceptName))
             concept = new ImportBeanDefinitions(definitionPath);
         else if (ConceptMapping.REGISTER_BEAN_USING_CODE.equals(conceptName))
             concept = new BeanRegistrationUsingCode();
         else if (ConceptMapping.NAMING_BEAN_DEFINITION.equals(conceptName))
             concept = new NamingBeanDefinition(definitionPath);
         else if (ConceptMapping.INSTANTIATING_BEAN_DEFINITION.equals(conceptName))
             concept = new InstantiatingBean(definitionPath);
         else if (ConceptMapping.DI_BEAN_DEFINITION.equals(conceptName))
             concept = new DependencyInjectionDefinition(definitionPath);
         else if (ConceptMapping.DEPENDS_ON_BEAN_DEFINITION.equals(conceptName))
             concept = new DependsOnBeanDefinition(definitionPath);
         else if (ConceptMapping.LAZY_EAGER_INITIALIZATION_BEAN_DEFINITION.equals(conceptName))
             concept = new LazyAndEagerBeanLoading(definitionPath);
         else if (ConceptMapping.AUTO_WIRING_COLLABORATORS_BEAN_DEFINITION.equals(conceptName))
             concept = new AutowiringCollaboratorsDefinition(definitionPath);
         else if (ConceptMapping.METHOD_INJECTION_BEAN_DEFINITION.equals(conceptName))
             concept = new LookUpMethodDefinition(definitionPath);
         else if (ConceptMapping.LIFECYCLE_CALLBACKS_BEAN_DEFINITION.equals(conceptName))
             concept = new LifecycleCallbacksBeanDefinition(definitionPath);
         else if (ConceptMapping.START_STOP_CALLBACKS_BEAN_DEFINITION.equals(conceptName))
             concept = new StartStopCallbacksDefinition(definitionPath);
         else if (ConceptMapping.APP_AWARE_BEAN_DEFINITION.equals(conceptName))
             concept = new ApplicationAwareBeanDefinition(definitionPath);
         else if (ConceptMapping.BEAN_AWARE_BEAN_DEFINITION.equals(conceptName))
             concept = new BeanAwareBeanDefinition(definitionPath);
         else if (ConceptMapping.INHERITANCE_BEAN_DEFINITION.equals(conceptName))
             concept = new BeanInheritanceDefinition(definitionPath);
         else if (ConceptMapping.CUSTOMIZATION_BEAN_POST_PROCESSOR_DEFINITION.equals(conceptName))
             concept = new CustomizationBeanPostProcessor(definitionPath);
         else if (ConceptMapping.CUSTOMIZATION_BEAN_FACTORY_POST_PROCESSOR_DEFINITION.equals(conceptName))
             concept = new CustomizationBeanFactoryPostProcessor(definitionPath);

         return concept;
    }
}
