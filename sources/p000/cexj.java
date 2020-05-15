package p000;

/* renamed from: cexj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cexj implements cexi {
    public static final bdyx generateProtoFormatRecords;
    public static final bdyx geofencingLogRecordSize;
    public static final bdyx geofencingLogRecordTtlMillis;
    public static final bdyx logGeofencerInternalEvents;
    public static final bdyx logLocationAndArEvents;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        generateProtoFormatRecords = bdyx.m91610a(a, "GeofencerDumpsys__generate_proto_format_records", false);
        geofencingLogRecordSize = bdyx.m91607a(a, "geofencing_log_record_size", 0L);
        geofencingLogRecordTtlMillis = bdyx.m91607a(a, "geofencing_log_record_ttl", 0L);
        logGeofencerInternalEvents = bdyx.m91610a(a, "GeofencerDumpsys__log_geofencer_internal_events", false);
        logLocationAndArEvents = bdyx.m91610a(a, "GeofencerDumpsys__log_location_and_ar_events", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean generateProtoFormatRecords() {
        return ((Boolean) generateProtoFormatRecords.mo58455c()).booleanValue();
    }

    public long geofencingLogRecordSize() {
        return ((Long) geofencingLogRecordSize.mo58455c()).longValue();
    }

    public long geofencingLogRecordTtlMillis() {
        return ((Long) geofencingLogRecordTtlMillis.mo58455c()).longValue();
    }

    public boolean logGeofencerInternalEvents() {
        return ((Boolean) logGeofencerInternalEvents.mo58455c()).booleanValue();
    }

    public boolean logLocationAndArEvents() {
        return ((Boolean) logLocationAndArEvents.mo58455c()).booleanValue();
    }
}
