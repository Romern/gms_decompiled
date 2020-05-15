package org.webrtc;

import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RTCStats {

    /* renamed from: a */
    private final long f191990a;

    /* renamed from: b */
    private final String f191991b;

    /* renamed from: c */
    private final String f191992c;

    /* renamed from: d */
    private final Map f191993d;

    public RTCStats(long j, String str, String str2, Map map) {
        this.f191990a = j;
        this.f191991b = str;
        this.f191992c = str2;
        this.f191993d = map;
    }

    /* renamed from: a */
    private static void m151194a(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                m151194a(sb, objArr[i]);
            }
            sb.append(']');
        } else if (obj instanceof String) {
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
        } else {
            sb.append(obj);
        }
    }

    static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ");
        sb.append(this.f191990a);
        sb.append(", type: ");
        sb.append(this.f191991b);
        sb.append(", id: ");
        sb.append(this.f191992c);
        for (Map.Entry entry : this.f191993d.entrySet()) {
            sb.append(", ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            m151194a(sb, entry.getValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
