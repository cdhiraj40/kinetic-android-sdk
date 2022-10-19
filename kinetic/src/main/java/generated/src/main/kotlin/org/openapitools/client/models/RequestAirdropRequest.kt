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

import org.openapitools.client.models.Commitment

import com.squareup.moshi.Json

/**
 * 
 *
 * @param account 
 * @param commitment 
 * @param environment 
 * @param index 
 * @param mint 
 * @param amount 
 */

data class RequestAirdropRequest (

    @Json(name = "account")
    val account: kotlin.String,

    @Json(name = "commitment")
    val commitment: Commitment,

    @Json(name = "environment")
    val environment: kotlin.String,

    @Json(name = "index")
    val index: kotlin.Int,

    @Json(name = "mint")
    val mint: kotlin.String,

    @Json(name = "amount")
    val amount: kotlin.String? = null

)

