package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hog */
final /* synthetic */ class hog implements bmxz {

    /* renamed from: a */
    private final hoh f20113a;

    public hog(hoh hoh) {
        this.f20113a = hoh;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        hoh hoh = this.f20113a;
        Credential credential = ((InternalCredentialWrapper) obj).f10139a;
        return !bmxx.m108577a(credential.f10097f) ? hoh.f20119f.contains(credential.f10097f) : hoh.f20118e;
    }
}
