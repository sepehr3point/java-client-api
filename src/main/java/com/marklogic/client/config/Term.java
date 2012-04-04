/*
 * Copyright 2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.config;

import java.util.List;

public interface Term extends BoundQueryOption, TermOptions {

	public enum EmptyApply { ALL_RESULTS };
	
	public List<String> getTermOptions();
	public void setTermOptions(List<String> termOptions);

	public FunctionRef getTermFunction();
	public void setTermFunction(FunctionRef function);
	
	
	public FunctionRef getEmpty();
	public void setEmpty(FunctionRef function);
	public void setEmpty(EmptyApply apply);
	
	//TODO need more test cases/examples to flesh out full functionality?

}