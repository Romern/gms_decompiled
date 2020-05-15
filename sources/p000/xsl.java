package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsl extends dcj implements xsn {
    public xsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* renamed from: a */
    public final void mo30102a(xoh xoh) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xoh);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30103a(xoh xoh, String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30104a(xsk xsk, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30105a(xsk xsk, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, xsk);
        dcl.m8165a(bj, publicKeyCredentialRequestOptions);
        mo8528b(2, bj);
    }
}
