package com.google.android.gms.common.stats.radio;

import android.provider.BaseColumns;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkLatencyContract {
    public static final String CREATE_NETWORK_LATENCY_TABLE = "CREATE TABLE IF NOT EXISTS network_latency (_id INTEGER PRIMARY KEY, event_time_ms INTEGER, latency_ms INTEGER, network_type INTEGER, tag INTEGER, device_state INTEGER, successful INTEGER)";
    public static final String DATABASE_NAME = "network_latency.db";
    public static final int DATABASE_VERSION = 1;
    public static final String DROP_NETWORK_LATENCY_TABLE = "DROP TABLE IF EXISTS network_latency";

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class NetworkLatencyColumns implements BaseColumns {
        public static final String DEVICE_STATE = "device_state";
        public static final String LATENCY = "latency_ms";
        public static final String NETWORK_TYPE = "network_type";
        public static final String SUCCESSFUL = "successful";
        public static final String TABLE_NAME = "network_latency";
        public static final String TAG = "tag";
        public static final String TIME = "event_time_ms";
    }

    private NetworkLatencyContract() {
    }
}
