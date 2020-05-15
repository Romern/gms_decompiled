package p000;

/* renamed from: bfmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmo {
    /* renamed from: a */
    public static bfmn m97271a(long j, long j2) {
        bunf bunf;
        int a = bunf.m120042a(j2, 0, 15, 1, 5);
        if (a == 1) {
            bunf = new bund(bund.m120026a(j2), bund.m120028b(j2), bund.m120029c(j2), bund.m120030d(j2));
            if (bunf.f154305a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for GSM key types.");
            }
        } else if (a == 2) {
            bunf = new bunh(bunh.m120053a(j2), bunh.m120055b(j2), bunh.m120056c(j2));
            if (bunf.f154305a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for UMTS key types.");
            }
        } else if (a == 3) {
            bunf = new bunc(bunc.m120019a(j2), bunc.m120021b(j2), bunc.m120022c(j2));
            if (bunf.f154305a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for CDMA key types");
            }
        } else if (a == 4) {
            bunf = new bune(bune.m120035a(j2), bune.m120037b(j2), bune.m120038c(j2));
            if (bunf.f154305a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for LTE key types.");
            }
        } else if (a == 5) {
            bunf = new bung(bung.m120046a(j2), bung.m120048b(j2), bung.m120049c(j2));
            if (bunf.f154305a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for NR(5G) key types.");
            }
        } else {
            throw new IllegalArgumentException("Primitive long key is invalid for all mobile communication key types.");
        }
        if (bunf instanceof bund) {
            bund bund = (bund) bunf;
            return new bfmv(j, 1, bund.mo72876d(), bund.mo72873a(), bund.mo72874b(), bund.mo72875c(), 0, -9999, bfmn.f114411a);
        } else if (bunf instanceof bunh) {
            bunh bunh = (bunh) bunf;
            return new bfmv(j, 3, bunh.mo72890c(), bunh.mo72888a(), bunh.mo72889b(), -1, 0, -9999, bfmn.f114411a);
        } else if (bunf instanceof bunc) {
            bunc bunc = (bunc) bunf;
            return new bfmk(j, bunc.mo72871c(), bunc.mo72869a(), bunc.mo72870b(), -9999, bfmn.f114411a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else if (bunf instanceof bune) {
            bune bune = (bune) bunf;
            return new bfna(j, bune.mo72878a(), bune.mo72879b(), bune.mo72880c(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -9999, bfmn.f114411a);
        } else if (bunf instanceof bung) {
            bung bung = (bung) bunf;
            return new bfnd(j, bung.mo72884a(), bung.mo72885b(), bung.mo72886c(), Integer.MAX_VALUE, Integer.MAX_VALUE, -9999, bfmn.f114411a);
        } else {
            String valueOf = String.valueOf(bunf.getClass().getSimpleName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("New cell type is ") : "New cell type is ".concat(valueOf));
        }
    }
}
