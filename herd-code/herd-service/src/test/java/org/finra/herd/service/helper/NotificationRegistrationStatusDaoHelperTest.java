/*
* Copyright 2015 herd contributors
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.finra.herd.service.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import org.finra.herd.model.ObjectNotFoundException;
import org.finra.herd.model.jpa.NotificationRegistrationStatusEntity;
import org.finra.herd.service.AbstractServiceTest;

public class NotificationRegistrationStatusDaoHelperTest extends AbstractServiceTest
{
    @Test
    public void testGetNotificationRegistrationStatusAssertReturnEntityWhenEntityExists()
    {
        NotificationRegistrationStatusEntity notificationRegistrationStatus =
            notificationRegistrationStatusDaoHelper.getNotificationRegistrationStatusEntity("ENABLED");
        assertNotNull(notificationRegistrationStatus);
        assertEquals("ENABLED", notificationRegistrationStatus.getCode());
    }

    @Test
    public void testGetNotificationRegistrationStatusAssertThrowWhenEntityNotExist()
    {
        try
        {
            notificationRegistrationStatusDaoHelper.getNotificationRegistrationStatusEntity("DOES_NOT_EXIST");
            fail();
        }
        catch (Exception e)
        {
            assertEquals(ObjectNotFoundException.class, e.getClass());
            assertEquals("The notification registration status \"DOES_NOT_EXIST\" doesn't exist.", e.getMessage());
        }
    }
}
