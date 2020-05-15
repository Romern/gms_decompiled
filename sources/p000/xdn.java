package p000;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyInfo;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;

/* renamed from: xdn */
final /* synthetic */ class xdn implements bmxz {

    /* renamed from: a */
    private final Context f52002a;

    public xdn(Context context) {
        this.f52002a = context;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        Context context = this.f52002a;
        sek sek = xdr.f52012a;
        String d = sqd.m35972d(((PublicKeyCredentialDescriptor) obj).f31776a);
        int i = Build.VERSION.SDK_INT;
        new xde(context);
        try {
            KeyInfo e = xde.m42699e(d);
            if (!e.isUserAuthenticationRequired() || e.getUserAuthenticationValidityDurationSeconds() != -1) {
                return false;
            }
            return true;
        } catch (adbe e2) {
            xdr.f52012a.mo25415d("Error when accessing KeyStore.", e2, new Object[0]);
        }
    }
}
