/*
 * Copyright 2016 Busy, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.crashlytics.android.answers;

import java.util.Map;

/**
 * This class will serve to provide a means of collecting information about the answers objects.
 * Placed withing the same package, thus allowing us to reach into their package scope for analysis/verification.
 *
 * @author Trevor
 */
public class PackageScopeWrappedCalls
{
	public static Map<String, Object> getPredefinedAttributes(PredefinedEvent event)
	{
		if (event != null)
		{
			//noinspection unchecked
			return event.getPredefinedAttributes();
		}
		else
		{
			return null;
		}
	}

	public static Map<String, Object> getCustomAttributes(AnswersEvent event)
	{
		if (event != null)
		{
			//noinspection unchecked
			return event.getCustomAttributes();
		}
		else
		{
			return null;
		}
	}
}
