package p000;

import android.os.IInterface;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface xss extends IInterface {
    /* renamed from: a */
    void mo30106a(String str, rnt rnt, StateUpdate stateUpdate);

    /* renamed from: a */
    void mo30107a(String str, rnt rnt, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, xok xok);

    /* renamed from: a */
    void mo30108a(String str, rnt rnt, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, xok xok);

    /* renamed from: a */
    void mo30109a(rnt rnt, int i, byte[] bArr, byte[] bArr2, xoe xoe);
}
