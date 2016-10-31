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
package org.finra.herd.model.dto;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Defines all the security functions.
 */
public class SecurityFunctions
{
    public static final String FN_BUILD_INFO_GET = "FN_BUILD_INFO_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_ALL_GET = "FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_ALL_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_DELETE = "FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_DELETE";

    public static final String FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_GET = "FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_POST = "FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_PUT = "FN_BUSINESS_OBJECT_DATA_ATTRIBUTES_PUT";

    public static final String FN_BUSINESS_OBJECT_DATA_AVAILABILITY_COLLECTION_POST = "FN_BUSINESS_OBJECT_DATA_AVAILABILITY_COLLECTION_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_AVAILABILITY_POST = "FN_BUSINESS_OBJECT_DATA_AVAILABILITY_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_DELETE = "FN_BUSINESS_OBJECT_DATA_DELETE";

    public static final String FN_BUSINESS_OBJECT_DATA_DOWNLOAD_CREDENTIAL_GET = "FN_BUSINESS_OBJECT_DATA_DOWNLOAD_CREDENTIAL_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_GENERATE_DDL_COLLECTION_POST = "FN_BUSINESS_OBJECT_DATA_GENERATE_DDL_COLLECTION_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_GENERATE_DDL_POST = "FN_BUSINESS_OBJECT_DATA_GENERATE_DDL_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_GET = "FN_BUSINESS_OBJECT_DATA_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_BY_NAMESPACE_GET =
        "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_BY_NAMESPACE_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_BY_NOTIFICATION_FILTER_GET =
        "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_BY_NOTIFICATION_FILTER_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_DELETE = "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_DELETE";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_GET = "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_POST = "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_PUT = "FN_BUSINESS_OBJECT_DATA_NOTIFICATION_REGISTRATIONS_PUT";

    public static final String FN_BUSINESS_OBJECT_DATA_POST = "FN_BUSINESS_OBJECT_DATA_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_RESTORE_POST = "FN_BUSINESS_OBJECT_DATA_RESTORE_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_S3_KEY_PREFIX_GET = "FN_BUSINESS_OBJECT_DATA_S3_KEY_PREFIX_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_SEARCH_POST = "FN_BUSINESS_OBJECT_DATA_SEARCH_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_STATUS_GET = "FN_BUSINESS_OBJECT_DATA_STATUS_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_STATUS_PUT = "FN_BUSINESS_OBJECT_DATA_STATUS_PUT";

    public static final String FN_BUSINESS_OBJECT_DATA_STORAGES_FILES_POST = "FN_BUSINESS_OBJECT_DATA_STORAGES_FILES_POST";

    public static final String FN_BUSINESS_OBJECT_DATA_UNREGISTERED_INVALIDATE = "FN_BUSINESS_OBJECT_DATA_UNREGISTERED_INVALIDATE";

    public static final String FN_BUSINESS_OBJECT_DATA_UPLOAD_CREDENTIAL_GET = "FN_BUSINESS_OBJECT_DATA_UPLOAD_CREDENTIAL_GET";

    public static final String FN_BUSINESS_OBJECT_DATA_VERSIONS_GET = "FN_BUSINESS_OBJECT_DATA_VERSIONS_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_ALL_GET = "FN_BUSINESS_OBJECT_DEFINITIONS_ALL_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_DELETE = "FN_BUSINESS_OBJECT_DEFINITIONS_DELETE";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_GET = "FN_BUSINESS_OBJECT_DEFINITIONS_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_POST = "FN_BUSINESS_OBJECT_DEFINITIONS_POST";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_PUT = "FN_BUSINESS_OBJECT_DEFINITIONS_PUT";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_TAGS_BY_BUSINESS_OBJECT_DEFINITION_GET =
        "FN_BUSINESS_OBJECT_DEFINITION_TAGS_BY_BUSINESS_OBJECT_DEFINITION_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_TAGS_BY_TAG_GET = "FN_BUSINESS_OBJECT_DEFINITION_TAGS_BY_TAG_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_TAGS_DELETE = "FN_BUSINESS_OBJECT_DEFINITION_TAGS_DELETE";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_TAGS_POST = "FN_BUSINESS_OBJECT_DEFINITION_TAGS_POST";

    public static final String FN_BUSINESS_OBJECT_DEFINITIONS_DESCRIPTIVE_INFO_PUT = "FN_BUSINESS_OBJECT_DEFINITIONS_DESCRIPTIVE_INFO_PUT";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_ALL_GET = "FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_ALL_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_DELETE = "FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_DELETE";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_GET = "FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_GET";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_POST = "FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_POST";

    public static final String FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_PUT = "FN_BUSINESS_OBJECT_DEFINITION_COLUMNS_PUT";

    public static final String FN_BUSINESS_OBJECT_FORMATS_ALL_GET = "FN_BUSINESS_OBJECT_FORMATS_ALL_GET";

    public static final String FN_BUSINESS_OBJECT_FORMATS_DELETE = "FN_BUSINESS_OBJECT_FORMATS_DELETE";

    public static final String FN_BUSINESS_OBJECT_FORMATS_GENERATE_DDL_COLLECTION_POST = "FN_BUSINESS_OBJECT_FORMATS_GENERATE_DDL_COLLECTION_POST";

    public static final String FN_BUSINESS_OBJECT_FORMATS_GENERATE_DDL_POST = "FN_BUSINESS_OBJECT_FORMATS_GENERATE_DDL_POST";

    public static final String FN_BUSINESS_OBJECT_FORMATS_GET = "FN_BUSINESS_OBJECT_FORMATS_GET";

    public static final String FN_BUSINESS_OBJECT_FORMATS_POST = "FN_BUSINESS_OBJECT_FORMATS_POST";

    public static final String FN_BUSINESS_OBJECT_FORMATS_PUT = "FN_BUSINESS_OBJECT_FORMATS_PUT";

    public static final String FN_BUSINESS_DEFINITION_SAMPLEFILE_GET = "FN_BUSINESS_DEFINITION_SAMPLEFILE_GET";
    
    public static final String FN_CUSTOM_DDLS_ALL_GET = "FN_CUSTOM_DDLS_ALL_GET";

    public static final String FN_CUSTOM_DDLS_DELETE = "FN_CUSTOM_DDLS_DELETE";

    public static final String FN_CUSTOM_DDLS_GET = "FN_CUSTOM_DDLS_GET";

    public static final String FN_CUSTOM_DDLS_POST = "FN_CUSTOM_DDLS_POST";

    public static final String FN_CUSTOM_DDLS_PUT = "FN_CUSTOM_DDLS_PUT";

    public static final String FN_DATA_PROVIDERS_ALL_GET = "FN_DATA_PROVIDERS_ALL_GET";

    public static final String FN_DATA_PROVIDERS_DELETE = "FN_DATA_PROVIDERS_DELETE";

    public static final String FN_DATA_PROVIDERS_GET = "FN_DATA_PROVIDERS_GET";

    public static final String FN_DATA_PROVIDERS_POST = "FN_DATA_PROVIDERS_POST";

    public static final String FN_DISPLAY_HERD_UI = "FN_DISPLAY_HERD_UI";

    public static final String FN_DOWNLOAD_GET = "FN_DOWNLOAD_GET";

    public static final String FN_EMR_CLUSTERS_DELETE = "FN_EMR_CLUSTERS_DELETE";

    public static final String FN_EMR_CLUSTERS_GET = "FN_EMR_CLUSTERS_GET";

    public static final String FN_EMR_CLUSTERS_POST = "FN_EMR_CLUSTERS_POST";

    public static final String FN_EMR_CLUSTER_DEFINITIONS_ALL_GET = "FN_EMR_CLUSTER_DEFINITIONS_ALL_GET";

    public static final String FN_EMR_CLUSTER_DEFINITIONS_DELETE = "FN_EMR_CLUSTER_DEFINITIONS_DELETE";

    public static final String FN_EMR_CLUSTER_DEFINITIONS_GET = "FN_EMR_CLUSTER_DEFINITIONS_GET";

    public static final String FN_EMR_CLUSTER_DEFINITIONS_POST = "FN_EMR_CLUSTER_DEFINITIONS_POST";

    public static final String FN_EMR_CLUSTER_DEFINITIONS_PUT = "FN_EMR_CLUSTER_DEFINITIONS_PUT";

    public static final String FN_EMR_HADOOP_JAR_STEPS_POST = "FN_EMR_HADOOP_JAR_STEPS_POST";

    public static final String FN_EMR_HIVE_STEPS_POST = "FN_EMR_HIVE_STEPS_POST";

    public static final String FN_EMR_MASTER_SECURITY_GROUPS_POST = "FN_EMR_MASTER_SECURITY_GROUPS_POST";

    public static final String FN_EMR_OOZIE_STEPS_POST = "FN_EMR_OOZIE_STEPS_POST";

    public static final String FN_EMR_OOZIE_WORKFLOW_GET = "FN_EMR_OOZIE_WORKFLOW_GET";

    public static final String FN_EMR_PIG_STEPS_POST = "FN_EMR_PIG_STEPS_POST";

    public static final String FN_EMR_SHELL_STEPS_POST = "FN_EMR_SHELL_STEPS_POST";

    public static final String FN_EXPECTED_PARTITION_VALUES_DELETE = "FN_EXPECTED_PARTITION_VALUES_DELETE";

    public static final String FN_EXPECTED_PARTITION_VALUES_GET = "FN_EXPECTED_PARTITION_VALUES_GET";

    public static final String FN_EXPECTED_PARTITION_VALUES_POST = "FN_EXPECTED_PARTITION_VALUES_POST";

    public static final String FN_FILE_TYPES_ALL_GET = "FN_FILE_TYPES_ALL_GET";

    public static final String FN_JOBS_DELETE = "FN_JOBS_DELETE";

    public static final String FN_JOBS_GET = "FN_JOBS_GET";

    public static final String FN_JOBS_GET_BY_ID = "FN_JOBS_GET_BY_ID";

    public static final String FN_JOBS_POST = "FN_JOBS_POST";

    public static final String FN_JOBS_PUT = "FN_JOBS_PUT";

    public static final String FN_JOBS_SIGNAL_POST = "FN_JOBS_SIGNAL_POST";

    public static final String FN_JOB_DEFINITIONS_GET = "FN_JOB_DEFINITIONS_GET";

    public static final String FN_JOB_DEFINITIONS_POST = "FN_JOB_DEFINITIONS_POST";

    public static final String FN_JOB_DEFINITIONS_PUT = "FN_JOB_DEFINITIONS_PUT";

    public static final String FN_NAMESPACES_ALL_GET = "FN_NAMESPACES_ALL_GET";

    public static final String FN_NAMESPACES_DELETE = "FN_NAMESPACES_DELETE";

    public static final String FN_NAMESPACES_GET = "FN_NAMESPACES_GET";

    public static final String FN_NAMESPACES_POST = "FN_NAMESPACES_POST";

    public static final String FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_ALL_GET = "FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_ALL_GET";

    public static final String FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_DELETE = "FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_DELETE";

    public static final String FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_GET = "FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_GET";

    public static final String FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_POST = "FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_POST";

    public static final String FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_PUT = "FN_NAMESPACE_IAM_ROLE_AUTHORIZATIONS_PUT";

    public static final String FN_NOTIFICATION_REGISTRATION_STATUS_PUT = "FN_NOTIFICATION_REGISTRATION_STATUS_PUT";

    public static final String FN_PARTITION_KEY_GROUPS_ALL_GET = "FN_PARTITION_KEY_GROUPS_ALL_GET";

    public static final String FN_PARTITION_KEY_GROUPS_DELETE = "FN_PARTITION_KEY_GROUPS_DELETE";

    public static final String FN_PARTITION_KEY_GROUPS_GET = "FN_PARTITION_KEY_GROUPS_GET";

    public static final String FN_PARTITION_KEY_GROUPS_POST = "FN_PARTITION_KEY_GROUPS_POST";

    public static final String FN_STORAGES_ALL_GET = "FN_STORAGES_ALL_GET";

    public static final String FN_STORAGES_DELETE = "FN_STORAGES_DELETE";

    public static final String FN_STORAGES_GET = "FN_STORAGES_GET";

    public static final String FN_STORAGES_POST = "FN_STORAGES_POST";

    public static final String FN_STORAGES_PUT = "FN_STORAGES_PUT";

    public static final String FN_STORAGE_PLATFORMS_ALL_GET = "FN_STORAGE_PLATFORMS_ALL_GET";

    public static final String FN_STORAGE_PLATFORMS_GET = "FN_STORAGE_PLATFORMS_GET";

    public static final String FN_STORAGE_POLICIES_GET = "FN_STORAGE_POLICIES_GET";

    public static final String FN_STORAGE_POLICIES_POST = "FN_STORAGE_POLICIES_POST";

    public static final String FN_STORAGE_POLICIES_PUT = "FN_STORAGE_POLICIES_PUT";

    public static final String FN_STORAGE_UNIT_DOWNLOAD_CREDENTIAL_GET = "FN_STORAGE_UNIT_DOWNLOAD_CREDENTIAL_GET";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_BY_NAMESPACE_GET = "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_BY_NAMESPACE_GET";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_BY_NOTIFICATION_FILTER_GET =
        "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_BY_NOTIFICATION_FILTER_GET";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_DELETE = "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_DELETE";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_GET = "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_GET";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_POST = "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_POST";

    public static final String FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_PUT = "FN_STORAGE_UNIT_NOTIFICATION_REGISTRATIONS_PUT";

    public static final String FN_STORAGE_UNIT_UPLOAD_CREDENTIAL_GET = "FN_STORAGE_UNIT_UPLOAD_CREDENTIAL_GET";

    public static final String FN_SYSTEM_JOBS_POST = "FN_SYSTEM_JOBS_POST";

    public static final String FN_UPLOAD_EXTEND_CREDENTIALS_GET = "FN_UPLOAD_EXTEND_CREDENTIALS_GET";

    public static final String FN_UPLOAD_POST = "FN_UPLOAD_POST";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_BY_NAMESPACE_GET = "FN_USER_NAMESPACE_AUTHORIZATIONS_BY_NAMESPACE_GET";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_BY_USERID_GET = "FN_USER_NAMESPACE_AUTHORIZATIONS_BY_USERID_GET";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_DELETE = "FN_USER_NAMESPACE_AUTHORIZATIONS_DELETE";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_GET = "FN_USER_NAMESPACE_AUTHORIZATIONS_GET";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_POST = "FN_USER_NAMESPACE_AUTHORIZATIONS_POST";

    public static final String FN_USER_NAMESPACE_AUTHORIZATIONS_PUT = "FN_USER_NAMESPACE_AUTHORIZATIONS_POST";

    public static final String FN_TAG_TYPES_ALL_GET = "FN_TAG_TYPES_ALL_GET";

    public static final String FN_TAG_TYPES_DELETE = "FN_TAG_TYPES_DELETE";

    public static final String FN_TAG_TYPES_GET = "FN_TAG_TYPES_GET";

    public static final String FN_TAG_TYPES_POST = "FN_TAG_TYPES_POST";

    public static final String FN_TAG_TYPES_PUT = "FN_TAG_TYPES_PUT";

    public static final String FN_TAGS_GET = "FN_TAGS_GET";

    public static final String FN_TAGS_DELETE = "FN_TAGS_DELETE";

    public static final String FN_TAGS_ALL_GET = "FN_TAGS_ALL_GET";

    public static final String FN_TAGS_POST = "FN_TAGS_POST";

    public static final String FN_TAGS_PUT = "FN_TAGS_PUT";

    /**
     * Returns all the functions sorted by function name.
     *
     * @return the list of all functions.
     */
    public static String[] getAllFunctions()
    {
        List<String> functions = new ArrayList<>();

        Field[] fields = SecurityFunctions.class.getDeclaredFields();
        for (Field f : fields)
        {
            if (Modifier.isStatic(f.getModifiers()) && Modifier.isFinal(f.getModifiers()))
            {
                functions.add(f.getName());
            }
        }
        String[] functionsArray = functions.toArray(new String[functions.size()]);
        Arrays.sort(functionsArray);

        return functionsArray;
    }
}
