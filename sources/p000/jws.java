package p000;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.security.KeyChainException;
import android.webkit.ClientCertRequest;

/* renamed from: jws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jws implements KeyChainAliasCallback {

    /* renamed from: a */
    final /* synthetic */ ClientCertRequest f23419a;

    /* renamed from: b */
    final /* synthetic */ Context f23420b;

    public jws(ClientCertRequest clientCertRequest, Context context) {
        this.f23419a = clientCertRequest;
        this.f23420b = context;
    }

    public final void alias(String str) {
        if (str != null) {
            try {
                this.f23419a.proceed(KeyChain.getPrivateKey(this.f23420b, str), KeyChain.getCertificateChain(this.f23420b, str));
            } catch (KeyChainException | InterruptedException e) {
                jwx.f23423a.mo25415d("Error retrieving keychain information", e, new Object[0]);
                this.f23419a.ignore();
            }
        } else {
            this.f23419a.cancel();
        }
    }
}
