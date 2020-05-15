package p000;

import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.List;

/* renamed from: xez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xez {
    /* renamed from: a */
    public static boolean m42800a(RequestOptions requestOptions) {
        return (requestOptions instanceof PublicKeyCredentialCreationOptions) || (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions);
    }

    /* renamed from: b */
    public static boolean m42801b(RequestOptions requestOptions) {
        return (requestOptions instanceof PublicKeyCredentialRequestOptions) || (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions);
    }

    /* renamed from: c */
    public static boolean m42802c(RequestOptions requestOptions) {
        return (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) || (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions);
    }

    /* renamed from: d */
    public static String m42803d(RequestOptions requestOptions) {
        if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
            return ((PublicKeyCredentialCreationOptions) requestOptions).f31764a.f31789a;
        }
        if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
            return ((PublicKeyCredentialRequestOptions) requestOptions).f31783c;
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            return ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a.f31764a.f31789a;
        }
        if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            return ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a.f31783c;
        }
        throw new IllegalArgumentException("Unknown type of request options.");
    }

    /* renamed from: e */
    public static bngx m42804e(RequestOptions requestOptions) {
        if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
            List<PublicKeyCredentialDescriptor> list = ((PublicKeyCredentialCreationOptions) requestOptions).f31769f;
            if (list == null) {
                list = bngx.m109376e();
            }
            bngs j = bngx.m109377j();
            for (PublicKeyCredentialDescriptor publicKeyCredentialDescriptor : list) {
                j.mo67668c(publicKeyCredentialDescriptor.f31776a);
            }
            return j.mo67664a();
        } else if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
            List<PublicKeyCredentialDescriptor> list2 = ((PublicKeyCredentialRequestOptions) requestOptions).f31784d;
            if (list2 == null) {
                list2 = bngx.m109376e();
            }
            bngs j2 = bngx.m109377j();
            for (PublicKeyCredentialDescriptor publicKeyCredentialDescriptor2 : list2) {
                j2.mo67668c(publicKeyCredentialDescriptor2.f31776a);
            }
            return j2.mo67664a();
        } else if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            List<PublicKeyCredentialDescriptor> list3 = ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a.f31769f;
            if (list3 == null) {
                list3 = bngx.m109376e();
            }
            bngs j3 = bngx.m109377j();
            for (PublicKeyCredentialDescriptor publicKeyCredentialDescriptor3 : list3) {
                j3.mo67668c(publicKeyCredentialDescriptor3.f31776a);
            }
            return j3.mo67664a();
        } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            List<PublicKeyCredentialDescriptor> list4 = ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a.f31784d;
            if (list4 == null) {
                list4 = bngx.m109376e();
            }
            bngs j4 = bngx.m109377j();
            for (PublicKeyCredentialDescriptor publicKeyCredentialDescriptor4 : list4) {
                j4.mo67668c(publicKeyCredentialDescriptor4.f31776a);
            }
            return j4.mo67664a();
        } else {
            throw new IllegalArgumentException("Unknown type of request options.");
        }
    }
}
