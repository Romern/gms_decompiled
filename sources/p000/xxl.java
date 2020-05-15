package p000;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxl extends xxj {
    public xxl(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        super(browserPublicKeyCredentialRequestOptions);
    }

    /* renamed from: a */
    protected static final String m43630a(String str, String str2, ChannelIdValue channelIdValue) {
        xya a = xya.m43645a();
        a.f53355a = "navigator.id.getAssertion";
        a.f53358d = channelIdValue;
        a.f53357c = str2;
        a.f53356b = str;
        return a.mo30246b().mo30248b();
    }

    public xxl(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        super(publicKeyCredentialRequestOptions);
    }

    public xxl(SignRequestParams signRequestParams) {
        super(signRequestParams);
    }

    /* renamed from: a */
    protected static final String m43631a(String str, String str2, String str3, TokenBinding tokenBinding) {
        return xxj.m43615a(str, str2, str3, tokenBinding, xlv.WEBAUTHN_GET);
    }

    /* renamed from: a */
    public final AuthenticatorResponse mo30216a(ResponseData responseData) {
        if (responseData instanceof ErrorResponseData) {
            xpf xpf = new xpf();
            xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
            xpf.f52860a = String.format("Low level error 0x%s", Integer.toHexString(((ErrorResponseData) responseData).f31908a.f31907g));
            return xpf.mo30000a();
        }
        SignResponseData signResponseData = (SignResponseData) responseData;
        byte[] bArr = signResponseData.f31947c;
        byte b = bArr[0];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 5);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
        byte[] a = bqce.m112562a(signResponseData.f31948d, new byte[]{(byte) (b & 3)}, copyOfRange);
        xpb xpb = new xpb();
        xpb.mo29991d(copyOfRange2);
        xpb.mo29988a(a);
        xpb.mo29989b(signResponseData.f31946b.getBytes(bmwy.f131158c));
        xpb.mo29990c(signResponseData.f31945a);
        return xpb.mo29987a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final xfo mo30217a(MessageDigest messageDigest, String str, String str2) {
        TokenBinding tokenBinding;
        ChannelIdValue channelIdValue;
        SignRequestParams signRequestParams;
        byte[] bArr;
        String str3;
        Long l;
        byte[] bArr2;
        bmxv bmxv;
        bxtx bxtx;
        String str4;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions;
        MessageDigest messageDigest2 = messageDigest;
        String str5 = str;
        String str6 = str2;
        RequestOptions b = mo30222b();
        int i = 0;
        if (b != null) {
            RequestOptions b2 = mo30222b();
            if (b2 instanceof PublicKeyCredentialRequestOptions) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) b2;
            } else {
                publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) b2).f31734a;
            }
            ArrayList arrayList = new ArrayList();
            List list = publicKeyCredentialRequestOptions.f31784d;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) list.get(i2);
                    arrayList.add(new RegisteredKey(new KeyHandle(publicKeyCredentialDescriptor.f31776a, ProtocolVersion.UNKNOWN, publicKeyCredentialDescriptor.f31777b)));
                }
            }
            xym xym = new xym();
            xym.f53368b = publicKeyCredentialRequestOptions.f31782b;
            xym.f53370d = publicKeyCredentialRequestOptions.f31781a;
            xym.f53371e = arrayList;
            xym.f53369c = Uri.parse(publicKeyCredentialRequestOptions.f31783c);
            signRequestParams = xym.mo30267a();
            tokenBinding = mo30222b().mo18685d();
            channelIdValue = null;
        } else {
            signRequestParams = (SignRequestParams) mo30219a();
            channelIdValue = mo30219a().mo18803d();
            if (channelIdValue == null) {
                channelIdValue = ChannelIdValue.f31891a;
            }
            tokenBinding = null;
        }
        ArrayList arrayList2 = new ArrayList(signRequestParams.f31941e.size());
        byte[] bArr3 = signRequestParams.f31940d;
        if (bArr3 != null) {
            String a = xxj.m43616a(bArr3);
            if (b != null) {
                str3 = m43631a(a, str5, str6, tokenBinding);
            } else {
                str3 = m43630a(a, str5, channelIdValue);
            }
            bArr = messageDigest2.digest(str3.getBytes());
        } else {
            str3 = null;
            bArr = null;
        }
        Uri uri = signRequestParams.f31939c;
        byte[] digest = uri != null ? messageDigest2.digest(uri.toString().getBytes()) : null;
        List list2 = signRequestParams.f31941e;
        int size2 = list2.size();
        while (i < size2) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i);
            KeyHandle keyHandle = registeredKey.f31934a;
            byte[] bArr4 = digest;
            String str7 = registeredKey.f31935b;
            if (str7 != null) {
                bArr2 = messageDigest2.digest(str7.getBytes());
            } else {
                bArr2 = bArr4;
            }
            String str8 = registeredKey.f31936c;
            if (str8 == null) {
                bmxv = bmxv.m108567c(str3);
                bxtx = bxtx.m123261a(bArr);
            } else {
                if (b == null) {
                    str4 = m43630a(str8, str5, channelIdValue);
                } else {
                    str4 = m43631a(str8, str5, str6, tokenBinding);
                }
                bmxv = bmxv.m108566b(str4);
                bxtx = bxtx.m123261a(messageDigest2.digest(((String) ((bmyg) bmxv).f131198a).getBytes()));
            }
            RequestOptions requestOptions = b;
            arrayList2.add(new xfr(keyHandle, bxtx.m123261a(bArr2), bxtx, bmxv));
            if (mo30223c() != null) {
                byte[] digest2 = messageDigest2.digest(mo30223c().getBytes());
                if (!Arrays.equals(digest2, bArr2)) {
                    arrayList2.add(new xfr(keyHandle, bxtx.m123261a(digest2), bxtx, bmxv));
                }
            }
            i++;
            str5 = str;
            str6 = str2;
            digest = bArr4;
            b = requestOptions;
        }
        Double d = signRequestParams.f31938b;
        if (d != null) {
            l = Long.valueOf((long) (d.doubleValue() * 1000.0d));
        } else {
            l = null;
        }
        return new xfp(l, arrayList2);
    }
}
