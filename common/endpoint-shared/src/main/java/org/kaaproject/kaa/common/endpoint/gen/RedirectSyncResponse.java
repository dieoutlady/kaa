/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RedirectSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RedirectSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"dnsName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String dnsName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public RedirectSyncResponse() {}

  /**
   * All-args constructor.
   */
  public RedirectSyncResponse(java.lang.String dnsName) {
    this.dnsName = dnsName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dnsName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dnsName = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dnsName' field.
   */
  public java.lang.String getDnsName() {
    return dnsName;
  }

  /**
   * Sets the value of the 'dnsName' field.
   * @param value the value to set.
   */
  public void setDnsName(java.lang.String value) {
    this.dnsName = value;
  }

  /** Creates a new RedirectSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder();
  }
  
  /** Creates a new RedirectSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder(other);
  }
  
  /** Creates a new RedirectSyncResponse RecordBuilder by copying an existing RedirectSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for RedirectSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RedirectSyncResponse>
    implements org.apache.avro.data.RecordBuilder<RedirectSyncResponse> {

    private java.lang.String dnsName;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dnsName)) {
        this.dnsName = data().deepCopy(fields()[0].schema(), other.dnsName);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RedirectSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.dnsName)) {
        this.dnsName = data().deepCopy(fields()[0].schema(), other.dnsName);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'dnsName' field */
    public java.lang.String getDnsName() {
      return dnsName;
    }
    
    /** Sets the value of the 'dnsName' field */
    public org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder setDnsName(java.lang.String value) {
      validate(fields()[0], value);
      this.dnsName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dnsName' field has been set */
    public boolean hasDnsName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dnsName' field */
    public org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse.Builder clearDnsName() {
      dnsName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public RedirectSyncResponse build() {
      try {
        RedirectSyncResponse record = new RedirectSyncResponse();
        record.dnsName = fieldSetFlags()[0] ? this.dnsName : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}