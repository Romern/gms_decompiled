package p000;

/* renamed from: casj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casj {

    /* renamed from: a */
    public final byte f175766a;

    private casj(byte b) {
        this.f175766a = b;
    }

    /* renamed from: a */
    public static casj m127093a(byte b) {
        return new casj(b);
    }

    /* renamed from: a */
    public final boolean mo74819a() {
        return (this.f175766a & 2) == 2;
    }

    /* renamed from: b */
    public final boolean mo74820b() {
        return (this.f175766a & 3) != 0;
    }

    /* renamed from: a */
    public static casj m127094a(caon caon) {
        byte[] a = caon.mo74730a("9F7E");
        byte b = 0;
        if (a != null && a.length > 0) {
            b = a[0];
        }
        return m127093a(b);
    }
}
