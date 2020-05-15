package p000;

/* renamed from: bhwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwq {

    /* renamed from: a */
    public final long f119743a;

    /* renamed from: b */
    public final long f119744b;

    /* renamed from: c */
    public final String f119745c;

    /* renamed from: d */
    public final int f119746d;

    /* renamed from: e */
    public final short f119747e;

    public bhwq(long j, int i, String str, short s, long j2) {
        this.f119743a = j2;
        this.f119744b = j;
        this.f119746d = i;
        this.f119745c = str == null ? "" : str;
        this.f119747e = s;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof bhwq) && this.f119744b == ((bhwq) obj).f119744b;
    }

    public final int hashCode() {
        long j = this.f119744b;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final String toString() {
        long j = this.f119744b;
        int i = this.f119746d;
        String str = this.f119745c;
        short s = this.f119747e;
        long j2 = this.f119743a;
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
