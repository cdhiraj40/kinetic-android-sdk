/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.TransactionErrorType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param logs 
 * @param message 
 * @param type 
 * @param instruction 
 */

data class TransactionError (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "logs")
    val logs: kotlin.collections.List<kotlin.String>,

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "type")
    val type: TransactionErrorType,

    @Json(name = "instruction")
    val instruction: kotlin.Int

)

