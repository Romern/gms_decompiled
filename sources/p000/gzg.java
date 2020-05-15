package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: gzg */
public final /* synthetic */ class gzg implements bmxz {

    /* renamed from: a */
    private final hek f19290a;

    public gzg(hek hek) {
        this.f19290a = hek;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        hek hek = this.f19290a;
        sek sek = gzz.f19315d;
        return TextUtils.equals(((InternalSignInCredentialWrapper) obj).f10233g.f10248a, hek.f19602b);
    }
}
