package p000;

import java.util.Arrays;

/* renamed from: yqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqi {

    /* renamed from: a */
    public final caae f54390a;

    /* renamed from: b */
    public final long f54391b;

    /* renamed from: c */
    public final long f54392c;

    /* renamed from: d */
    public final String f54393d;

    public yqi(caae caae, long j, long j2, String str) {
        this.f54390a = caae;
        this.f54391b = j;
        this.f54392c = j2;
        this.f54393d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yqi) {
            yqi yqi = (yqi) obj;
            return this.f54390a.equals(yqi.f54390a) && this.f54391b == yqi.f54391b && this.f54392c == yqi.f54392c && bmxi.m108538a(this.f54393d, yqi.f54393d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54390a, Long.valueOf(this.f54391b), Long.valueOf(this.f54392c), this.f54393d});
    }

    public final String toString() {
        return String.format("SyncStatus{dataSource=%s, lastSyncTimestamp=%s, minContiguousTimeNanos=%s, syncToken=%s}", this.f54390a.f172326b, Long.valueOf(this.f54391b), Long.valueOf(this.f54392c), this.f54393d);
    }
}
