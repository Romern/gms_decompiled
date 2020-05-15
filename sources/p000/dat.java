package p000;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: dat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dat implements aaif {

    /* renamed from: a */
    final /* synthetic */ vyu f12702a;

    public dat(vyu vyu) {
        this.f12702a = vyu;
    }

    /* renamed from: a */
    public final boolean mo8474a(File file) {
        try {
            return this.f12702a.mo28956a(file);
        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
