package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

/* renamed from: xsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsd extends dcj implements xsf {
    public xsd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* renamed from: a */
    public final void mo30098a(xoh xoh) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30099a(xsc xsc, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30100a(xsc xsc, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xsc);
        dcl.m8165a(bj, browserPublicKeyCredentialRequestOptions);
        mo8528b(2, bj);
    }
}
