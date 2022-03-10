package com.gain.java.knowledge.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is the Student model.
 */

@Schema(name = "Student", description = "This is the Student model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Student  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("section")
  private String section;

  @JsonProperty("city")
  private String city;

  @JsonProperty("name")
  private String name;

  public Student id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of Student.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of Student.", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Student firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The FirstName of student.
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "The FirstName of student.", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Student lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The LastName of Student.
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "The LastName of Student.", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Student section(String section) {
    this.section = section;
    return this;
  }

  /**
   * The Class Section of student.
   * @return section
  */
  
  @Schema(name = "section", description = "The Class Section of student.", required = false)
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public Student city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The City Name of Student.
   * @return city
  */
  
  @Schema(name = "city", description = "The City Name of Student.", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Full Name of student.
   * @return name
  */
  
  @Schema(name = "name", description = "The Full Name of student.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastName, student.lastName) &&
        Objects.equals(this.section, student.section) &&
        Objects.equals(this.city, student.city) &&
        Objects.equals(this.name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, section, city, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

