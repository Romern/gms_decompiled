package p000;

import android.content.Context;
import java.security.GeneralSecurityException;

/* renamed from: akmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akmx {
    /* renamed from: a */
    static final akmx m60041a(Context context) {
        if (!cfpd.f185332a.mo6606a().mo82445j()) {
            return new akmw();
        }
        try {
            return new akms();
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            eoa.m10825a("NetRec", e, "Could not instantiate Encrypter", new Object[0]);
            aknf.m60075a("ErrorsEncryption");
            aknj.m60083a(context).mo39585a("Could not instantiate Encrypter", e);
            return new akmw();
        }
    }

    /* renamed from: a */
    public abstract String mo39561a();

    /* renamed from: a */
    public abstract String mo39562a(String str);

    /* renamed from: b */
    public abstract String mo39563b(String str);
}
