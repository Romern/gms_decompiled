package p000;

import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxg extends xxj {

    /* renamed from: e */
    private static final Logger f53327e = new Logger(new String[]{"RegisterRequestDataTracker"}, (short[]) null);

    /* renamed from: d */
    private byte[] f53328d;

    public xxg(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        super(browserPublicKeyCredentialCreationOptions);
    }

    /* renamed from: g */
    private final PublicKeyCredentialCreationOptions m43611g() {
        RequestOptions b = mo30222b();
        if (b instanceof PublicKeyCredentialCreationOptions) {
            return (PublicKeyCredentialCreationOptions) b;
        }
        return ((BrowserPublicKeyCredentialCreationOptions) b).f31732a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e1 A[Catch:{ IOException | CertificateException -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe A[Catch:{ IOException | CertificateException -> 0x0117 }] */
    /* renamed from: a */
    public final AuthenticatorResponse mo30216a(ResponseData responseData) {
        xlp xlp;
        String str;
        ResponseData responseData2 = responseData;
        if (responseData2 instanceof ErrorResponseData) {
            xpf xpf = new xpf();
            xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
            xpf.f52860a = String.format("Low level error 0x%s", Integer.toHexString(((ErrorResponseData) responseData2).f31908a.f31907g));
            return xpf.mo30000a();
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) responseData2;
        if (registerResponseData.f31932b.equals(ProtocolVersion.V2)) {
            byte[] bArr = new byte[65];
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(registerResponseData.f31931a));
            try {
                dataInputStream.readByte();
                dataInputStream.readFully(bArr);
                byte[] bArr2 = new byte[dataInputStream.readUnsignedByte()];
                dataInputStream.readFully(bArr2);
                byte[] encoded = CertificateFactory.getInstance("X.509").generateCertificate(dataInputStream).getEncoded();
                byte[] bArr3 = new byte[dataInputStream.available()];
                dataInputStream.readFully(bArr3);
                dataInputStream.close();
                AttestationConveyancePreference attestationConveyancePreference = m43611g().f31773j;
                try {
                    xlq xlq = new xlq(this.f53328d, (byte) 65, 0, new xln(new byte[16], bArr2, new xlz(xpr.ES256, xly.SECP256R1, new BigInteger(1, Arrays.copyOfRange(bArr, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArr, 33, 65))).mo29931b()));
                    if (attestationConveyancePreference != null) {
                        if (!attestationConveyancePreference.equals(AttestationConveyancePreference.NONE)) {
                            xlp = new xmd(encoded, bArr3);
                            xlo xlo = new xlo(xlq.mo29917a(), xlp.mo29916b(), xlp.mo29915a().mo74444c());
                            str = registerResponseData.f31933c;
                            if (str == null) {
                                xpd xpd = new xpd();
                                xpd.mo29995a(xlo.mo29912a());
                                xpd.mo29996b(str.getBytes(bmwy.f131158c));
                                xpd.mo29997c(bArr2);
                                return xpd.mo29994a();
                            }
                            xpf xpf2 = new xpf();
                            xpf2.mo30001a(ErrorCode.DATA_ERR);
                            xpf2.f52860a = String.format("ClientData not set.", new Object[0]);
                            return xpf2.mo30000a();
                        }
                    }
                    xlp = new xmb();
                    xlo xlo2 = new xlo(xlq.mo29917a(), xlp.mo29916b(), xlp.mo29915a().mo74444c());
                    str = registerResponseData.f31933c;
                    if (str == null) {
                    }
                } catch (IOException | CertificateException e) {
                    e = e;
                    f53327e.mo25417e("Error parsing AuthenticatorAttestationResponse from U2F RegisterResponseData.", e, new Object[0]);
                    xpf xpf3 = new xpf();
                    xpf3.mo30001a(ErrorCode.UNKNOWN_ERR);
                    return xpf3.mo30000a();
                }
            } catch (IOException | CertificateException e2) {
                e = e2;
                f53327e.mo25417e("Error parsing AuthenticatorAttestationResponse from U2F RegisterResponseData.", e, new Object[0]);
                xpf xpf32 = new xpf();
                xpf32.mo30001a(ErrorCode.UNKNOWN_ERR);
                return xpf32.mo30000a();
            }
        } else {
            xpf xpf4 = new xpf();
            xpf4.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
            xpf4.f52860a = "FIDO2 only supports V2 protocol for U2F.";
            return xpf4.mo30000a();
        }
    }

    public xxg(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        super(publicKeyCredentialCreationOptions);
    }

    public xxg(RegisterRequestParams registerRequestParams) {
        super(registerRequestParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final xfo mo30217a(MessageDigest messageDigest, String str, String str2) {
        ChannelIdValue channelIdValue;
        TokenBinding tokenBinding;
        RegisterRequestParams registerRequestParams;
        Long l;
        byte[] bArr;
        ByteString bxtx;
        bmxv bmxv;
        String str3;
        MessageDigest messageDigest2 = messageDigest;
        String str4 = str;
        RequestOptions b = mo30222b();
        int i = 0;
        if (b == null) {
            registerRequestParams = (RegisterRequestParams) mo30219a();
            ChannelIdValue channelIdValue2 = registerRequestParams.f31928f;
            if (channelIdValue2 == null) {
                channelIdValue2 = ChannelIdValue.f31891a;
            }
            channelIdValue = channelIdValue2;
            tokenBinding = null;
        } else {
            PublicKeyCredentialCreationOptions g = m43611g();
            ArrayList arrayList = new ArrayList();
            List list = g.f31769f;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) list.get(i2);
                    arrayList.add(new RegisteredKey(new KeyHandle(publicKeyCredentialDescriptor.f31776a, ProtocolVersion.UNKNOWN, publicKeyCredentialDescriptor.f31777b)));
                }
            }
            String str5 = g.f31764a.f31789a;
            if (cdxg.f181866a.mo6606a().mo78415b().f165797a.contains(str5)) {
                str5 = cdxg.f181866a.mo6606a().mo78414a();
            }
            xyi xyi = new xyi();
            xyi.f53363a = g.f31768e;
            xyi.f53366d = arrayList;
            xyi.f53364b = Uri.parse(str5);
            xyi.f53365c = bnkn.m109665a(new RegisterRequest(ProtocolVersion.V2, g.f31766c));
            registerRequestParams = new RegisterRequestParams(null, xyi.f53363a, xyi.f53364b, xyi.f53365c, xyi.f53366d, null, null);
            tokenBinding = mo30222b().mo18685d();
            channelIdValue = null;
        }
        ArrayList arrayList2 = new ArrayList(registerRequestParams.f31926d.size());
        Uri uri = registerRequestParams.f31925c;
        byte[] digest = uri != null ? messageDigest2.digest(uri.toString().getBytes()) : null;
        List list2 = registerRequestParams.f31926d;
        int size2 = list2.size();
        while (i < size2) {
            RegisterRequest registerRequest = (RegisterRequest) list2.get(i);
            ProtocolVersion protocolVersion = registerRequest.f31920b;
            String str6 = registerRequest.f31922d;
            if (str6 != null) {
                bArr = messageDigest2.digest(str6.getBytes());
            } else {
                bArr = digest;
            }
            this.f53328d = bArr;
            String a = xxj.m43616a(registerRequest.f31921c);
            ProtocolVersion protocolVersion2 = ProtocolVersion.UNKNOWN;
            byte[] bArr2 = digest;
            if (protocolVersion.ordinal() != 1) {
                if (b == null) {
                    xya a2 = xya.m43645a();
                    a2.f53355a = "navigator.id.finishEnrollment";
                    a2.f53358d = channelIdValue;
                    a2.f53357c = str4;
                    a2.f53356b = a;
                    str3 = a2.mo30246b().mo30248b();
                } else {
                    str3 = xxj.m43615a(a, str4, str2, tokenBinding, xlv.WEBAUTHN_CREATE);
                }
                bmxv = bmxv.m108566b(str3);
                bxtx = bxtx.m123261a(messageDigest2.digest(((String) ((bmyg) bmxv).f131198a).getBytes()));
            } else {
                bmxv = bmvz.f131120a;
                bxtx = bxtx.m123261a(registerRequest.f31921c);
            }
            arrayList2.add(new xfq(protocolVersion, bxtx.m123261a(bArr), bxtx, bmxv));
            i++;
            digest = bArr2;
        }
        Double d = registerRequestParams.f31924b;
        if (d != null) {
            l = Long.valueOf((long) (d.doubleValue() * 1000.0d));
        } else {
            l = null;
        }
        return new xfm(l, arrayList2, registerRequestParams.f31927e);
    }
}
