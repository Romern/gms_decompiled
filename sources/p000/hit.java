package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: hit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hit {
    /* renamed from: a */
    public static bomw m14429a(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        bxvd da = bomw.f133727d.mo74144da();
        boolean a = internalSignInCredentialWrapper.mo7477a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomw bomw = (bomw) da.f164949b;
        int i = 2;
        bomw.f133729a |= 2;
        bomw.f133731c = a;
        if (!TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10253f)) {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomw bomw2 = (bomw) da.f164949b;
        bomw2.f133730b = i - 1;
        bomw2.f133729a |= 1;
        return (bomw) da.mo74062i();
    }
}
