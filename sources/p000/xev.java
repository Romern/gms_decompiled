package p000;

import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

/* renamed from: xev */
final /* synthetic */ class xev implements bmxj {

    /* renamed from: a */
    private final xew f52094a;

    public xev(xew xew) {
        this.f52094a = xew;
    }

    public final Object apply(Object obj) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity;
        xew xew = this.f52094a;
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            if (cdxa.f181860a.mo6606a().mo78410a()) {
                RequestOptions requestOptions = xew.f52095a;
                if (!(requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) && !(requestOptions instanceof PublicKeyCredentialRequestOptions)) {
                    if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
                        publicKeyCredentialRpEntity = ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a.f31764a;
                    } else {
                        publicKeyCredentialRpEntity = ((PublicKeyCredentialCreationOptions) requestOptions).f31764a;
                    }
                    if (!xey.m42799a(publicKeyCredentialRpEntity.f31791c)) {
                        throw adbe.m50106a(34002).mo33303c();
                    }
                }
            }
            return (String) bmxv.mo66814b();
        }
        throw adbe.m50106a(34002).mo33303c();
    }
}
