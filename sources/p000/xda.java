package p000;

import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xda */
final /* synthetic */ class xda implements bmxj {

    /* renamed from: a */
    private final xdc f51980a;

    public xda(xdc xdc) {
        this.f51980a = xdc;
    }

    public final Object apply(Object obj) {
        try {
            byte[] bArr = ((KeyHandleResult) ((bmxv) obj).mo66814b()).f10538b;
            return KeyData.m23436a(xdd.m42691a(bArr).f52779d, bArr);
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }
}
