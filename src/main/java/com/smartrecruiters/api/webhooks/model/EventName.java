/*
 * Webhooks
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 201907.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.webhooks.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EventName
 */
@JsonAdapter(EventName.Adapter.class)
public enum EventName {
  
  JOB_CREATED("job.created"),
  
  JOB_UPDATED("job.updated"),
  
  JOB_STATUS_UPDATED("job.status.updated"),
  
  JOB_HIRING_TEAM_UPDATED("job.hiring-team.updated"),
  
  APPLICATION_CREATED("application.created"),
  
  APPLICATION_STATUS_UPDATED("application.status.updated"),
  
  APPLICATION_FIELDS_UPDATED("application.fields.updated"),
  
  APPLICATION_ONBOARDING_STATUS_UPDATED("application.onboarding-status.updated"),
  
  APPLICATION_ATTACHMENT_CREATED("application.attachment.created"),
  
  APPLICATION_SCREENING_ANSWERS_UPDATED("application.screening-answers.updated"),
  
  CANDIDATE_CREATED("candidate.created"),
  
  CANDIDATE_UPDATED("candidate.updated"),
  
  CANDIDATE_DELETED("candidate.deleted");

  private String value;

  EventName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventName fromValue(String value) {
    for (EventName b : EventName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventName> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventName.fromValue(value);
    }
  }
}

