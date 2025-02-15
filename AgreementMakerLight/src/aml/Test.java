/******************************************************************************
* Copyright 2013-2016 LASIGE                                                  *
*                                                                             *
* Licensed under the Apache License, Version 2.0 (the "License"); you may     *
* not use this file except in compliance with the License. You may obtain a   *
* copy of the License at http://www.apache.org/licenses/LICENSE-2.0           *
*                                                                             *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                              *
*                                                                             *
*******************************************************************************
* Test-runs AgreementMakerLight in Eclipse.                                   *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml;

import java.util.Set;

import aml.settings.EntityType;

public class Test
{

//Main Method
	
	public static void main(String[] args) throws Exception
	{
		//Path to input ontology files (edit manually)
		String sourcePath = "C:\\Alin\\Ontologias\\Anatomia\\human.owl";
		String targetPath = "C:\\Alin\\Ontologias\\Anatomia\\mouse.owl";
		String referencePath = "C:\\Alin\\Ontologias\\Anatomia\\reference.rdf";
		//Path to save output alignment (edit manually, or leave blank for no evaluation)
		String outputPath = "C:\\Alin\\Alin\\AML-human-mouse.rdf";
		
		
		AML aml = AML.getInstance();
		
		//202410
		aml.readConfigFileStandardization();
		
		aml.openOntologies(sourcePath, targetPath);
		
		//aml.matchAuto();
		
		aml.matchManual();
		
		if(!referencePath.equals(""))
		{
			aml.openReferenceAlignment(referencePath);
			aml.getReferenceAlignment();
			aml.evaluate();
			System.out.println(aml.getEvaluation());
		}
		if(!outputPath.equals(""))
			aml.saveAlignmentRDF(outputPath);
	}
}