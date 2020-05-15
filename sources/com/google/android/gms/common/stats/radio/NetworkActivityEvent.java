package com.google.android.gms.common.stats.radio;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NetworkActivityEvent {
    public final int deviceState;
    public final long eventTimeMillis;
    public final boolean isNetworkActive;
    public final int networkType;
    public final int tag;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public @interface NetworkType {
        public static final int MOBILE = 0;
        public static final int NONE = -1;
        public static final int WIFI = 1;
    }

    public NetworkActivityEvent(long j, int i, int i2, int i3, boolean z) {
        this.eventTimeMillis = j;
        this.networkType = getNetworkType(i);
        this.tag = i2;
        this.deviceState = i3;
        this.isNetworkActive = z;
    }

    public static int getNetworkType(int i) {
        if (i != 0) {
            return i != 1 ? -1 : 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            NetworkActivityEvent networkActivityEvent = (NetworkActivityEvent) obj;
            return networkActivityEvent.eventTimeMillis == this.eventTimeMillis && networkActivityEvent.networkType == this.networkType && networkActivityEvent.tag == this.tag && networkActivityEvent.deviceState == this.deviceState && networkActivityEvent.isNetworkActive == this.isNetworkActive;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.eventTimeMillis), Integer.valueOf(this.networkType), Integer.valueOf(this.tag), Integer.valueOf(this.deviceState), Boolean.valueOf(this.isNetworkActive)});
    }

    public String toString() {
        return String.format("[%d, %d, %d, %d, %b]", Long.valueOf(this.eventTimeMillis), Integer.valueOf(this.networkType), Integer.valueOf(this.tag), Integer.valueOf(this.deviceState), Boolean.valueOf(this.isNetworkActive));
    }
}
