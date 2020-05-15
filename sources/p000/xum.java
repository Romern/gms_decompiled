package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.UUID;

/* renamed from: xum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xum extends xsr implements aaai {

    /* renamed from: a */
    private final Context f53167a;

    /* renamed from: b */
    private final aaag f53168b;

    /* renamed from: c */
    private final String f53169c;

    /* renamed from: d */
    private xeq f53170d;

    public xum(Context context, aaag aaag, String str) {
        this.f53167a = context;
        this.f53169c = str;
        this.f53168b = aaag;
    }

    /* renamed from: a */
    public final void mo30106a(String str, rnt rnt, StateUpdate stateUpdate) {
        xeq xeq = this.f53170d;
        if (xeq != null) {
            this.f53168b.mo16658a(new xun(xeq, UUID.fromString(str), rnt, stateUpdate));
        } else {
            rnt.mo11797a(new Status(10));
        }
    }

    /* renamed from: a */
    public final void mo30107a(String str, rnt rnt, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, xok xok) {
        boolean z;
        if (this.f53170d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        xul xul = new xul(xok);
        xwj a = xwj.m43508a(xwi.FIDO2_ZERO_PARTY, publicKeyCredentialCreationOptions.f31771h);
        this.f53170d = xeq.m42781b(this.f53167a, a, publicKeyCredentialCreationOptions, this.f53169c, xul);
        this.f53168b.mo16658a(new xuv(a, this.f53170d, UUID.fromString(str), rnt, publicKeyCredentialCreationOptions, xok, this.f53169c));
    }

    /* renamed from: a */
    public final void mo30108a(String str, rnt rnt, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, xok xok) {
        boolean z;
        if (this.f53170d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        xuk xuk = new xuk(xok);
        xwj a = xwj.m43508a(xwi.FIDO2_ZERO_PARTY, publicKeyCredentialRequestOptions.f31785e);
        this.f53170d = xeq.m42780a(this.f53167a, a, publicKeyCredentialRequestOptions, this.f53169c, xuk);
        this.f53168b.mo16658a(new xva(a, this.f53170d, UUID.fromString(str), rnt, publicKeyCredentialRequestOptions, xok, this.f53169c));
    }

    /* renamed from: a */
    public final void mo30109a(rnt rnt, int i, byte[] bArr, byte[] bArr2, xoe xoe) {
        this.f53168b.mo16658a(new xvb(rnt, i, bArr, bArr2));
    }
}
