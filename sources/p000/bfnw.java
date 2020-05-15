package p000;

/* renamed from: bfnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfnw implements Comparable {

    /* renamed from: g */
    public static int f114518g = 0;

    /* renamed from: b */
    public final long f114519b;

    /* renamed from: c */
    public final String f114520c;

    /* renamed from: d */
    public final int f114521d;

    /* renamed from: e */
    public final short f114522e;

    /* renamed from: f */
    public final long f114523f;

    public bfnw(long j, int i, String str, short s, long j2) {
        this.f114519b = j;
        this.f114521d = i;
        this.f114520c = str == null ? "" : str;
        this.f114522e = s;
        this.f114523f = j2;
    }

    /* renamed from: a */
    public boolean mo62000a() {
        return false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((bfnw) obj).f114521d - this.f114521d;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof bfnw) && this.f114519b == ((bfnw) obj).f114519b;
    }

    public final int hashCode() {
        long j = this.f114519b;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final String toString() {
        long j = this.f114519b;
        int i = this.f114521d;
        String str = this.f114520c;
        short s = this.f114522e;
        long j2 = this.f114523f;
        StringBuilder sb = new StringBuilder(str.length() + 107);
        sb.append("Device [mac=");
        sb.append(j);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", ssid=");
        sb.append(str);
        sb.append(", frequency=");
        sb.append((int) s);
        sb.append(", scanTime=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
