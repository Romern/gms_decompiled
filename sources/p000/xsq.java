package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xsq extends dcj implements xss {
    public xsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
    }

    /* renamed from: a */
    public final void mo30106a(String str, rnt rnt, StateUpdate stateUpdate) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, stateUpdate);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo30107a(String str, rnt rnt, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, xok xok) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30108a(String str, rnt rnt, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, xok xok) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, publicKeyCredentialRequestOptions);
        dcl.m8164a(bj, xok);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30109a(rnt rnt, int i, byte[] bArr, byte[] bArr2, xoe xoe) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(1);
        bj.writeByteArray(bArr);
        bj.writeByteArray(bArr2);
        dcl.m8164a(bj, xoe);
        mo8528b(1, bj);
    }
}
