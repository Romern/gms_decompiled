package p000;

/* renamed from: xlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlg {

    /* renamed from: a */
    public static final byte[] f52657a = {-96, 0, 0, 6, 71, 47, 0, 1};

    /* renamed from: b */
    public static final byte[] f52658b = {-96, 0, 0, 5, 39, 16, 2, 1};

    /* renamed from: c */
    public final int f52659c;

    /* renamed from: d */
    public final int f52660d;

    public xlg(int i) {
        this.f52660d = i;
        this.f52659c = xle.m43130a(i);
    }

    /* renamed from: a */
    public final xle mo29903a() {
        xle a = xle.m43131a((byte) 0, (byte) 3, this.f52660d);
        a.mo29897b(this.f52659c);
        return a;
    }

    /* renamed from: a */
    public final xle mo29904a(byte[] bArr, byte[] bArr2, boolean z) {
        byte b = !z ? (byte) 3 : -125;
        xle a = xle.m43131a((byte) 0, (byte) 1, this.f52660d);
        a.mo29894a(b);
        a.mo29895a(bArr2);
        a.mo29895a(bArr);
        a.mo29897b(this.f52659c);
        return a;
    }
}
