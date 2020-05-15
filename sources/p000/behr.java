package p000;

import java.io.InputStream;

/* renamed from: behr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behr implements beez {

    /* renamed from: a */
    public bxus f111571a = bxus.m123743b();

    /* renamed from: b */
    private final bxxk f111572b;

    public behr(bxxk bxxk) {
        this.f111572b = bxxk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        InputStream b = behs.m95064b(beey);
        try {
            bxxc bxxc = (bxxc) this.f111572b.mo73665d(b, this.f111571a);
            if (b != null) {
                b.close();
            }
            return bxxc;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
