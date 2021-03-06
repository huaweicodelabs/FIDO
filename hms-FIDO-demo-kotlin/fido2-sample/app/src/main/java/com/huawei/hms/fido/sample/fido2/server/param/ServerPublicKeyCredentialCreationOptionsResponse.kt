/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.huawei.hms.fido.sample.fido2.server.param

import java.util.HashMap

/**
 * Server Public Key Credential Creation Options Response
 *
 * @author Huawei HMS
 * @since 2020-03-08
 */
class ServerPublicKeyCredentialCreationOptionsResponse : ServerResponse() {
    var rp: ServerPublicKeyCredentialRpEntity? = null

    var user: ServerPublicKeyCredentialUserEntity? = null

    var challenge: String? = null

    var pubKeyCredParams: Array<ServerPublicKeyCredentialParameters>? = null

    var timeout: Long = 0

    var excludeCredentials: Array<ServerPublicKeyCredentialDescriptor>? = null

    var authenticatorSelection: ServerAuthenticatorSelectionCriteria? = null

    var attestation: String? = null

    private var extensions: HashMap<String, Any>? = null

    var rpId: String? = null

    var allowCredentials: Array<ServerPublicKeyCredentialDescriptor>? = null

    var userVerification: String? = null

    fun getExtensions(): HashMap<String, Any>? {
        return extensions
    }

    fun setExtensions(extensions: HashMap<String, Any>) {
        this.extensions = extensions
    }
}
