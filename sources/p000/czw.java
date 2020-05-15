package p000;

/* renamed from: czw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czw {

    /* renamed from: a */
    private final byte[] f12469a;

    public czw(byte[] bArr) {
        this.f12469a = bArr;
    }

    /* renamed from: a */
    public final boolean mo8463a(czv czv) {
        int a = czv.mo8461a();
        byte[] bArr = this.f12469a;
        return bArr.length > a && czm.m8010a(bArr[a], czv.mo8462b());
    }
}
