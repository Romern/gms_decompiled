package p000;

import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.List;

/* renamed from: xqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqy {

    /* renamed from: a */
    public static final /* synthetic */ int f52953a = 0;

    /* renamed from: b */
    private static final sek f52954b = new sek(new String[]{"AuthenticatorSelector"}, (short[]) null);

    /* renamed from: a */
    public static xqx m43291a(xwj xwj, RequestOptions requestOptions, xdx xdx, xwg xwg) {
        boolean z;
        Attachment attachment;
        bmxy.m108581a(requestOptions);
        bmxy.m108581a(xdx);
        bmxy.m108581a(xwg);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = requestOptions instanceof PublicKeyCredentialCreationOptions ? (PublicKeyCredentialCreationOptions) requestOptions : requestOptions instanceof BrowserPublicKeyCredentialCreationOptions ? ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a : null;
        if (publicKeyCredentialCreationOptions != null) {
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = publicKeyCredentialCreationOptions.f31770g;
            if (authenticatorSelectionCriteria == null || (attachment = authenticatorSelectionCriteria.f31729a) == null) {
                return xqx.ALL;
            }
            if (attachment == Attachment.PLATFORM) {
                return xqx.PLATFORM_ATTACHED;
            }
            if (authenticatorSelectionCriteria.f31729a == Attachment.CROSS_PLATFORM) {
                return xqx.CROSS_PLATFORM;
            }
        }
        if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
            publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions;
        } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a;
        }
        String str = publicKeyCredentialRequestOptions.f31783c;
        List list = publicKeyCredentialRequestOptions.f31784d;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108588a(z);
        if (bnjd.m109596d(list, xqw.f52948a)) {
            f52954b.mo25412b("Default to platform authenticator because allow credentials are internal only", new Object[0]);
            return xqx.PLATFORM_ATTACHED;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                xkb xkb = new xkb(((PublicKeyCredentialDescriptor) list.get(i)).f31776a);
                if (!xdx.mo29673a(str, xkb)) {
                    if (cdvq.m135120b() && xkb.mo29857c().length == 32) {
                        if (!str.equals("google.com")) {
                        }
                    }
                    i++;
                }
                return xqx.PLATFORM_ATTACHED;
            } catch (xma e) {
                f52954b.mo25417e("Error during locating allowed credentials in ESK KeyStore", e, new Object[0]);
                xwg.mo30184a(xwj, e);
            }
        }
        return xqx.CROSS_PLATFORM;
    }
}
