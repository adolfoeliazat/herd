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
package org.finra.herd.dao;

import static org.junit.Assert.assertEquals;

import com.amazonaws.services.sqs.model.SendMessageResult;
import org.junit.Test;

import org.finra.herd.model.dto.AwsParamsDto;

/**
 * This class tests the functionality of DAO for Amazon AWS SQS.
 */
public class SqsDaoTest extends AbstractDaoTest
{
    @Test
    public void testSendMessage()
    {
        // Send an SQS message using proxy.
        assertEquals(new SendMessageResult().withMessageId(MESSAGE_ID), sqsDao
            .sendMessage(new AwsParamsDto(NO_AWS_ACCESS_KEY, NO_AWS_SECRET_KEY, NO_SESSION_TOKEN, HTTP_PROXY_HOST, HTTP_PROXY_PORT), AWS_SQS_QUEUE_NAME,
                MESSAGE_TEXT));

        // Send an SQS message without proxy.
        assertEquals(new SendMessageResult().withMessageId(MESSAGE_ID), sqsDao.sendMessage(new AwsParamsDto(), AWS_SQS_QUEUE_NAME, MESSAGE_TEXT));
    }
}
