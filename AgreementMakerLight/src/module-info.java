module AgreementMakerLight {
	exports aml;
	exports aml.util;
	exports aml.ontology;
	exports aml.ui;
	exports aml.ext;
	exports aml.knowledge;
	exports aml.filter;
	exports aml.settings;
	exports aml.match;
	exports aml.applications.skills;

	requires commons.lang;
	requires dom4j;
	requires elk;
//	requires gephi.toolkit;
	requires java.desktop;
	requires jaws;
	requires log4j;
	requires microsoft.translator;
	requires owlapi;
	requires simmetrics;
	requires swingx.all;
}