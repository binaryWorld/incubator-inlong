/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.dao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class StreamSource implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer taskType;
    private String inlongGroupId;
    private String inlongStreamId;
    private String agentIp;
    private String uuid;
    private String serverName;
    private Integer isHybridSource;
    private Integer isTableMapping;
    private Integer dateOffset;
    private String dateOffsetUnit;
    private String taskConfig;
    private Integer status;
    private Integer previousStatus;
    private Integer isDeleted;
    private String creator;
    private String modifier;
    private Date createTime;
    private Date modifyTime;
    private String tempView;
    private String netTag;
}
