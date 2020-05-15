package p000;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: aahf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aahf implements aaif {

    /* renamed from: a */
    final /* synthetic */ aahg f28124a;

    public aahf(aahg aahg) {
        this.f28124a = aahg;
    }

    /* renamed from: a */
    public final boolean mo8474a(File file) {
        try {
            return this.f28124a.f28125a.mo28956a(file);
        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
