package p000;

import java.io.IOException;

/* renamed from: bqou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqou extends bqnp {
    public bqou(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo69295b(bxxc bxxc) {
        bqqy bqqy = (bqqy) bxxc;
        bxvd da = bqqx.f141398d.mo74144da();
        bqqz bqqz = bqqy.f141405a;
        if (bqqz == null) {
            bqqz = bqqz.f141407b;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqqz.getClass();
        ((bqqx) da.f164949b).f141401b = bqqz;
        ByteString a = ByteString.m123261a(bqwf.m113516a(bqqy.f141406b));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqqx bqqx = (bqqx) da.f164949b;
        a.getClass();
        bqqx.f141402c = a;
        bqqx.f141400a = 0;
        return (bqqx) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69293a(ByteString bxtx) {
        bxus b = bxus.m123743b();
        bqqy bqqy = bqqy.f141403c;
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bqqy.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite);
            h.mo73787a(0);
            GeneratedMessageLite.m124027b(GeneratedMessageLite);
            return (bqqy) GeneratedMessageLite;
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
        bqqy bqqy = (bqqy) bxxc;
        bqwl.m113526a(bqqy.f141406b);
        bqqz bqqz = bqqy.f141405a;
        if (bqqz == null) {
            bqqz = bqqz.f141407b;
        }
        bqov.m113142a(bqqz);
    }
}
