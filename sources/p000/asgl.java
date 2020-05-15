package p000;

import android.os.Build;

/* renamed from: asgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgl extends asgr {
    public asgl() {
        super("Fingerprintstats", "fingerprint", "FINGERPRINT_STATS", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        return new String[]{"--stats"};
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        if (!cgsf.f187633a.mo6606a().mo84388d()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgta.f187697a.mo6606a().mo84443b();
    }
}
