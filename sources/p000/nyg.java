package p000;

/* renamed from: nyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nyg {

    /* renamed from: a */
    final int f36919a;

    /* renamed from: b */
    final long f36920b;

    /* renamed from: c */
    final int f36921c;

    /* renamed from: d */
    final int f36922d;

    /* renamed from: e */
    final int f36923e;

    /* renamed from: f */
    int f36924f = 0;

    public nyg(int i) {
        this.f36919a = i;
        this.f36920b = 0;
        this.f36921c = 0;
        this.f36922d = 0;
        this.f36923e = 0;
    }

    public final String toString() {
        String str;
        String hexString = Integer.toHexString(hashCode());
        String b = nyh.m28165b(this.f36919a);
        long j = this.f36920b;
        int i = this.f36921c;
        int i2 = this.f36924f;
        if (i > 0) {
            String b2 = nyh.m28165b(this.f36922d);
            int i3 = this.f36923e;
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 49);
            sb.append(", nextStateAfterMax=");
            sb.append(b2);
            sb.append(", delayMsAfterMax=");
            sb.append(i3);
            str = sb.toString();
        } else {
            str = "";
        }
        int length = String.valueOf(hexString).length();
        StringBuilder sb2 = new StringBuilder(length + 94 + String.valueOf(b).length() + String.valueOf(str).length());
        sb2.append("Transition@");
        sb2.append(hexString);
        sb2.append("[nextState=");
        sb2.append(b);
        sb2.append(", delayMs=");
        sb2.append(j);
        sb2.append(", maxCount=");
        sb2.append(i);
        sb2.append(", count=");
        sb2.append(i2);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    public nyg(int i, int i2) {
        this.f36919a = i;
        this.f36920b = (long) i2;
        this.f36921c = 0;
        this.f36922d = 0;
        this.f36923e = 0;
    }

    public nyg(int i, int i2, int i3, int i4) {
        this.f36919a = i;
        this.f36920b = 0;
        this.f36921c = i2;
        this.f36922d = i3;
        this.f36923e = i4;
    }
}
