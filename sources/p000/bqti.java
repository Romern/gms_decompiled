package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: bqti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqti extends bqnp {
    public bqti(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqrt bqrt = (bqrt) bxxc;
        byte[] a = bqwf.m113516a(32);
        bqvj bqvj = new bqvj(bqvg.m113464a(bqvg.m113467b(a)), a);
        bxvd da = bqrv.f141488c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqrv) da.f164949b).f141490a = 0;
        byte[] bArr = bqvj.f141683a;
        ByteString a2 = ByteString.m123261a(Arrays.copyOf(bArr, bArr.length));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((bqrv) da.f164949b).f141491b = a2;
        bqrv bqrv = (bqrv) da.mo74062i();
        bxvd da2 = bqru.f141483d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bqru) da2.f164949b).f141485a = 0;
        byte[] bArr2 = bqvj.f141684b;
        ByteString a3 = ByteString.m123261a(Arrays.copyOf(bArr2, bArr2.length));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bqru bqru = (bqru) da2.f164949b;
        a3.getClass();
        bqru.f141486b = a3;
        bqrv.getClass();
        bqru.f141487c = bqrv;
        return (bqru) da2.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqrt bqrt = bqrt.f141481a;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqrt.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqrt) GeneratedMessageLite;
        } catch (IOException e) {
            if (!(e.getCause() instanceof bxwf)) {
                throw new bxwf(e.getMessage());
            }
            throw ((bxwf) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        } catch (bxwf e3) {
            throw e3;
        } catch (bxwf e4) {
            throw e4;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69294a(bxxc bxxc) {
        bqrt bqrt = (bqrt) bxxc;
    }
}
