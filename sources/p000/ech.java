package p000;

import java.util.List;

/* renamed from: ech */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ech {

    /* renamed from: a */
    public final long f14673a;

    /* renamed from: b */
    public final List f14674b;

    /* renamed from: c */
    public final List f14675c;

    /* renamed from: d */
    public final List f14676d;

    /* renamed from: e */
    public final List f14677e;

    public ech(long j, List list, List list2, List list3, List list4) {
        if (list.isEmpty() || list3.isEmpty() || list2.isEmpty() || list4.isEmpty()) {
            String valueOf = String.valueOf(list);
            String valueOf2 = String.valueOf(list2);
            String valueOf3 = String.valueOf(list3);
            String valueOf4 = String.valueOf(list4);
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(valueOf2).length();
            StringBuilder sb = new StringBuilder(length + 54 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("Expected non-empty feature sequences, but found ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(", ");
            sb.append(valueOf3);
            sb.append(", ");
            sb.append(valueOf4);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f14673a = j;
        this.f14674b = list;
        this.f14675c = list2;
        this.f14676d = list3;
        this.f14677e = list4;
    }

    public final String toString() {
        long j = this.f14673a;
        String valueOf = String.valueOf(this.f14674b);
        String valueOf2 = String.valueOf(this.f14675c);
        String valueOf3 = String.valueOf(this.f14676d);
        String valueOf4 = String.valueOf(this.f14677e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("WifiFeatureGroup{nanos=");
        sb.append(j);
        sb.append(", rssiLows=");
        sb.append(valueOf);
        sb.append(", rssiLowDiffs=");
        sb.append(valueOf2);
        sb.append(", rssiHighs=");
        sb.append(valueOf3);
        sb.append(", rssiHighDiffs=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
