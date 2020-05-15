package com.google.android.gms.common.stats.radio;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkLatencyEvent {
    public final int deviceState;
    public final long eventTimeMillis;
    public final long latencyMillis;
    public final int networkType;
    public final boolean successful;
    public final int tag;

    public NetworkLatencyEvent(long j, long j2, int i, int i2, int i3, boolean z) {
        this.eventTimeMillis = j;
        this.latencyMillis = j2;
        this.networkType = NetworkActivityEvent.getNetworkType(i);
        this.tag = i2;
        this.deviceState = i3;
        this.successful = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            NetworkLatencyEvent networkLatencyEvent = (NetworkLatencyEvent) obj;
            return networkLatencyEvent.eventTimeMillis == this.eventTimeMillis && networkLatencyEvent.latencyMillis == this.latencyMillis && networkLatencyEvent.networkType == this.networkType && networkLatencyEvent.tag == this.tag && networkLatencyEvent.deviceState == this.deviceState && networkLatencyEvent.successful == this.successful;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.eventTimeMillis), Long.valueOf(this.latencyMillis), Integer.valueOf(this.networkType), Integer.valueOf(this.tag), Integer.valueOf(this.deviceState), Boolean.valueOf(this.successful)});
    }

    public String toString() {
        return String.format("[%d, %d, %d, %d, %d, %b]", Long.valueOf(this.eventTimeMillis), Long.valueOf(this.latencyMillis), Integer.valueOf(this.networkType), Integer.valueOf(this.tag), Integer.valueOf(this.deviceState), Boolean.valueOf(this.successful));
    }
}
