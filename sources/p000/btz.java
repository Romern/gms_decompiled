package p000;

import java.io.InputStream;

/* renamed from: btz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btz extends bxd {
    private static final long serialVersionUID = 1;

    static {
        btz.class.getSimpleName();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqp mo3438a(InputStream inputStream) {
        btx btx = new btx();
        bxe.m3749a(inputStream, btx.f5591a);
        btx.f5592b = bxe.m3751a(inputStream);
        bxe.m3751a(inputStream);
        return btx;
    }

    /* renamed from: a */
    public final bxg mo3439a() {
        return bxg.INTERAC_FLASH;
    }

    /* renamed from: c */
    public final buk mo3496c() {
        byte[] bArr = this.f5953g;
        if (bArr != null) {
            return new buk(bpk.m3437a(bArr).mo3355b());
        }
        int i = cbd.f6383a;
        return new buk();
    }
}
