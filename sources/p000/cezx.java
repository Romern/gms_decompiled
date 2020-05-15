package p000;

/* renamed from: cezx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezx implements cezw {
    public static final bdyx quakeApiAccelHeadMs;
    public static final bdyx quakeApiAccelQuantizedLsbMs2;
    public static final bdyx quakeApiAccelTailMs;
    public static final bdyx quakeApiAccelTriggeringMs;
    public static final bdyx quakeApiAlarmManagerEnable;
    public static final bdyx quakeApiAlarmOnlineMs;
    public static final bdyx quakeApiBackoffEnable;
    public static final bdyx quakeApiBackoffMaxMs;
    public static final bdyx quakeApiClientIdExpireMs;
    public static final bdyx quakeApiDroidguardHandleTimeoutMs;
    public static final bdyx quakeApiDroidguardOfflineEnable;
    public static final bdyx quakeApiDroidguardOnlineEnable;
    public static final bdyx quakeApiDroidguardTriggeringEnable;
    public static final bdyx quakeApiEnable;
    public static final bdyx quakeApiScope;
    public static final bdyx quakeApiServerDeadlineMs;
    public static final bdyx quakeApiServerHost;
    public static final bdyx quakeApiSessionAccelMaxS;
    public static final bdyx quakeApiSessionCooldownS;
    public static final bdyx quakeApiSessionThrottlerConfig;
    public static final bdyx quakeApiUsePersistentThrottler;
    public static final bdyx quakeApiV2Enable;
    public static final bdyx quakeTimeExpireAgeMs;
    public static final bdyx seismicSendQuakeApiNodeOffline;
    public static final bdyx seismicSendQuakeApiNodeOnline;
    public static final bdyx seismicSendQuakeApiNodeTriggering;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        quakeApiAccelHeadMs = bdyx.m91607a(a, "quake_api_accel_head_ms", 15000L);
        quakeApiAccelQuantizedLsbMs2 = bdyx.m91605a(a, "quake_api_accel_quantized_lsb_ms2", 0.0015d);
        quakeApiAccelTailMs = bdyx.m91607a(a, "quake_api_accel_tail_ms", 15000L);
        quakeApiAccelTriggeringMs = bdyx.m91607a(a, "quake_api_accel_triggering_ms", 5000L);
        quakeApiAlarmManagerEnable = bdyx.m91610a(a, "quake_api_alarm_manager_enable", false);
        quakeApiAlarmOnlineMs = bdyx.m91607a(a, "quake_api_alarm_online_ms", 3600000L);
        quakeApiBackoffEnable = bdyx.m91610a(a, "quake_api_backoff_enable", false);
        quakeApiBackoffMaxMs = bdyx.m91607a(a, "quake_api_backoff_max_ms", 604800000L);
        quakeApiClientIdExpireMs = bdyx.m91607a(a, "quake_api_client_id_expire_ms", 259200000L);
        quakeApiDroidguardHandleTimeoutMs = bdyx.m91607a(a, "quake_api_droidguard_handle_timeout_ms", 60000L);
        quakeApiDroidguardOfflineEnable = bdyx.m91610a(a, "quake_api_droidguard_offline_enable", false);
        quakeApiDroidguardOnlineEnable = bdyx.m91610a(a, "quake_api_droidguard_online_enable", false);
        quakeApiDroidguardTriggeringEnable = bdyx.m91610a(a, "quake_api_droidguard_triggering_enable", false);
        quakeApiEnable = bdyx.m91610a(a, "quake_api_enable", false);
        quakeApiScope = bdyx.m91609a(a, "quake_api_scope", "https://www.googleapis.com/auth/lc.anonymous");
        quakeApiServerDeadlineMs = bdyx.m91607a(a, "quake_api_server_deadline_ms", 10000L);
        quakeApiServerHost = bdyx.m91609a(a, "quake_api_server_host", "quake-pa.googleapis.com");
        quakeApiSessionAccelMaxS = bdyx.m91607a(a, "quake_api_trigger_session_max_s", 120L);
        quakeApiSessionCooldownS = bdyx.m91607a(a, "quake_api_session_cooldown_s", 120L);
        quakeApiSessionThrottlerConfig = bdyx.m91609a(a, "quake_api_session_throttler_config", "120:2,900:4,3600:10,86400:50");
        quakeApiUsePersistentThrottler = bdyx.m91610a(a, "quake_api_use_persistent_throttler", false);
        quakeApiV2Enable = bdyx.m91610a(a, "quake_api_v2_enable", false);
        quakeTimeExpireAgeMs = bdyx.m91607a(a, "quake_time_expire_age_ms", 43200000L);
        seismicSendQuakeApiNodeOffline = bdyx.m91610a(a, "seismic_send_quake_api_node_offline", false);
        seismicSendQuakeApiNodeOnline = bdyx.m91610a(a, "seismic_send_quake_api_node_online", false);
        seismicSendQuakeApiNodeTriggering = bdyx.m91610a(a, "seismic_send_quake_api_node_triggering", false);
    }

    public boolean compiled() {
        return true;
    }

    public long quakeApiAccelHeadMs() {
        return ((Long) quakeApiAccelHeadMs.mo58455c()).longValue();
    }

    public double quakeApiAccelQuantizedLsbMs2() {
        return ((Double) quakeApiAccelQuantizedLsbMs2.mo58455c()).doubleValue();
    }

    public long quakeApiAccelTailMs() {
        return ((Long) quakeApiAccelTailMs.mo58455c()).longValue();
    }

    public long quakeApiAccelTriggeringMs() {
        return ((Long) quakeApiAccelTriggeringMs.mo58455c()).longValue();
    }

    public boolean quakeApiAlarmManagerEnable() {
        return ((Boolean) quakeApiAlarmManagerEnable.mo58455c()).booleanValue();
    }

    public long quakeApiAlarmOnlineMs() {
        return ((Long) quakeApiAlarmOnlineMs.mo58455c()).longValue();
    }

    public boolean quakeApiBackoffEnable() {
        return ((Boolean) quakeApiBackoffEnable.mo58455c()).booleanValue();
    }

    public long quakeApiBackoffMaxMs() {
        return ((Long) quakeApiBackoffMaxMs.mo58455c()).longValue();
    }

    public long quakeApiClientIdExpireMs() {
        return ((Long) quakeApiClientIdExpireMs.mo58455c()).longValue();
    }

    public long quakeApiDroidguardHandleTimeoutMs() {
        return ((Long) quakeApiDroidguardHandleTimeoutMs.mo58455c()).longValue();
    }

    public boolean quakeApiDroidguardOfflineEnable() {
        return ((Boolean) quakeApiDroidguardOfflineEnable.mo58455c()).booleanValue();
    }

    public boolean quakeApiDroidguardOnlineEnable() {
        return ((Boolean) quakeApiDroidguardOnlineEnable.mo58455c()).booleanValue();
    }

    public boolean quakeApiDroidguardTriggeringEnable() {
        return ((Boolean) quakeApiDroidguardTriggeringEnable.mo58455c()).booleanValue();
    }

    public boolean quakeApiEnable() {
        return ((Boolean) quakeApiEnable.mo58455c()).booleanValue();
    }

    public String quakeApiScope() {
        return (String) quakeApiScope.mo58455c();
    }

    public long quakeApiServerDeadlineMs() {
        return ((Long) quakeApiServerDeadlineMs.mo58455c()).longValue();
    }

    public String quakeApiServerHost() {
        return (String) quakeApiServerHost.mo58455c();
    }

    public long quakeApiSessionAccelMaxS() {
        return ((Long) quakeApiSessionAccelMaxS.mo58455c()).longValue();
    }

    public long quakeApiSessionCooldownS() {
        return ((Long) quakeApiSessionCooldownS.mo58455c()).longValue();
    }

    public String quakeApiSessionThrottlerConfig() {
        return (String) quakeApiSessionThrottlerConfig.mo58455c();
    }

    public boolean quakeApiUsePersistentThrottler() {
        return ((Boolean) quakeApiUsePersistentThrottler.mo58455c()).booleanValue();
    }

    public boolean quakeApiV2Enable() {
        return ((Boolean) quakeApiV2Enable.mo58455c()).booleanValue();
    }

    public long quakeTimeExpireAgeMs() {
        return ((Long) quakeTimeExpireAgeMs.mo58455c()).longValue();
    }

    public boolean seismicSendQuakeApiNodeOffline() {
        return ((Boolean) seismicSendQuakeApiNodeOffline.mo58455c()).booleanValue();
    }

    public boolean seismicSendQuakeApiNodeOnline() {
        return ((Boolean) seismicSendQuakeApiNodeOnline.mo58455c()).booleanValue();
    }

    public boolean seismicSendQuakeApiNodeTriggering() {
        return ((Boolean) seismicSendQuakeApiNodeTriggering.mo58455c()).booleanValue();
    }
}
