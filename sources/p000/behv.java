package p000;

import java.io.OutputStream;

/* renamed from: behv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behv implements beez {

    /* renamed from: a */
    private final byte[] f111573a;

    private behv(byte[] bArr) {
        this.f111573a = bArr;
    }

    /* renamed from: a */
    public static behv m95070a(byte[] bArr) {
        return new behv(bArr);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        OutputStream b = behw.m95073b(beey);
        try {
            b.write(this.f111573a);
            for (beer beer : beey.f111473g) {
                beer.mo60626a();
            }
            if (b == null) {
                return null;
            }
            b.close();
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
