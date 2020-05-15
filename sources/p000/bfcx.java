package p000;

/* renamed from: bfcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcx {

    /* renamed from: a */
    public final long f113446a;

    /* renamed from: b */
    public short f113447b;

    /* renamed from: c */
    public long f113448c;

    public bfcx(long j) {
        this.f113448c = -1;
        this.f113446a = j;
        this.f113447b = Short.MAX_VALUE;
    }

    /* renamed from: a */
    public static final short m96402a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        long floor = (long) Math.floor(d / 8.64E7d);
        if (Math.abs((86400000 * floor) - j) > 85800000) {
            floor++;
        }
        return (short) ((int) floor);
    }

    public final String toString() {
        long j = this.f113446a;
        StringBuilder sb = new StringBuilder(38);
        sb.append("SeenWifiAp: bssid ");
        sb.append(j);
        return sb.toString();
    }

    public bfcx(bsax bsax) {
        this(bsax.mo70124c(1));
        if (bsax.mo70137i(3)) {
            this.f113447b = (short) bsax.mo70114b(3);
        }
    }
}
