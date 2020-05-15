package org.webrtc;

import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RTCStatsReport {

    /* renamed from: a */
    private final long f191994a;

    /* renamed from: b */
    private final Map f191995b;

    public RTCStatsReport(long j, Map map) {
        this.f191994a = j;
        this.f191995b = map;
    }

    private static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ");
        sb.append(this.f191994a);
        sb.append(", stats: [\n");
        boolean z = true;
        for (RTCStats rTCStats : this.f191995b.values()) {
            if (!z) {
                sb.append(",\n");
            }
            sb.append(rTCStats);
            z = false;
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
