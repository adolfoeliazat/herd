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
package org.finra.herd.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * A notification message.
 */
@Table(name = NotificationMessageEntity.TABLE_NAME)
@Entity
public class NotificationMessageEntity extends AuditableEntity
{
    public static final String TABLE_NAME = "ntfcn_msg";

    @Id
    @Column(name = TABLE_NAME + "_id")
    @GeneratedValue(generator = TABLE_NAME + "_seq")
    @SequenceGenerator(name = TABLE_NAME + "_seq", sequenceName = TABLE_NAME + "_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "msg_type_cd", referencedColumnName = "msg_type_cd", nullable = false)
    private MessageTypeEntity messageType;

    @Column(name = "msg_dstnt", nullable = false)
    private String messageDestination;

    @Column(name = "msg_tx")
    private String messageText;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public MessageTypeEntity getMessageType()
    {
        return messageType;
    }

    public void setMessageType(MessageTypeEntity messageType)
    {
        this.messageType = messageType;
    }

    public String getMessageDestination()
    {
        return messageDestination;
    }

    public void setMessageDestination(String messageDestination)
    {
        this.messageDestination = messageDestination;
    }

    public String getMessageText()
    {
        return messageText;
    }

    public void setMessageText(String messageText)
    {
        this.messageText = messageText;
    }
}
