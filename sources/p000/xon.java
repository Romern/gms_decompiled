package p000;

import android.util.MutableBoolean;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: xon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xon implements Runnable {

    /* renamed from: a */
    private final xwj f52841a;

    /* renamed from: b */
    private final xea f52842b;

    /* renamed from: c */
    private final RequestOptions f52843c;

    /* renamed from: d */
    private final xwn f52844d;

    /* renamed from: e */
    private final String f52845e;

    /* renamed from: f */
    private final String f52846f;

    /* renamed from: g */
    private final xom f52847g;

    public xon(xwj xwj, xea xea, RequestOptions requestOptions, xwn xwn, String str, String str2, xom xom) {
        sdo.m34959a(xwj);
        this.f52841a = xwj;
        sdo.m34959a(xea);
        this.f52842b = xea;
        sdo.m34959a(requestOptions);
        this.f52843c = requestOptions;
        sdo.m34959a(xwn);
        this.f52844d = xwn;
        sdo.m34959a((Object) str);
        this.f52845e = str;
        sdo.m34959a((Object) str2);
        this.f52846f = str2;
        sdo.m34959a(xom);
        this.f52847g = xom;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public final void run() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions;
        Pair pair;
        String str;
        Object obj;
        xlp xlp;
        String str2;
        xon xon;
        RequestOptions requestOptions = this.f52843c;
        if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
            publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) requestOptions;
        } else if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            publicKeyCredentialCreationOptions = ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a;
        } else {
            RuntimeException runtimeException = new RuntimeException("Non-registration request is provided to RegistrationOperation");
            this.f52844d.mo30184a(this.f52841a, runtimeException);
            throw runtimeException;
        }
        List list = publicKeyCredentialCreationOptions.f31769f;
        ArrayList a = bnkn.m109661a();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(new xkb(((PublicKeyCredentialDescriptor) list.get(i)).f31776a));
            }
        }
        xea xea = this.f52842b;
        byte[] a2 = this.f52843c.mo18682a();
        String str3 = publicKeyCredentialCreationOptions.f31764a.f31789a;
        AttestationConveyancePreference attestationConveyancePreference = publicKeyCredentialCreationOptions.f31773j;
        String str4 = this.f52845e;
        String str5 = this.f52846f;
        xwn xwn = this.f52844d;
        sdo.m34966a(a2, "Challenge parameter cannot be null");
        sdo.m34966a((Object) str3, (Object) "Relying party identifier cannot be null");
        sdo.m34966a(a, "The list of registered key handles cannot be null");
        sdo.m34966a((Object) str4, (Object) "Origin cannot be null");
        sek sek = xea.f52044b;
        String a3 = boan.f132471e.mo68783a().mo68794a(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 44 + String.valueOf(str3).length());
        sb.append("Received request = challengeParameter:");
        sb.append(a3);
        sb.append(" rpId:");
        sb.append(str3);
        sek.mo25412b(sb.toString(), new Object[0]);
        int i2 = 1;
        boolean z = attestationConveyancePreference == null || AttestationConveyancePreference.NONE.equals(attestationConveyancePreference);
        int size2 = a.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                MessageDigest a4 = xid.m42997a();
                a4.update(str3.getBytes(StandardCharsets.UTF_8));
                byte[] digest = a4.digest();
                try {
                    xdw a5 = xea.f52055d.mo29671a(str3, xka.ANDROID_KEYSTORE, false);
                    xkb xkb = a5.f52030a;
                    xlx a6 = a5.mo29669a();
                    try {
                        byte[] bArr = new byte[i2];
                        bArr[0] = 0;
                        xpj xpj = (xpj) xea.mo29679a(str3, xkb, bArr, xwn).second;
                        xdx xdx = xea.f52055d;
                        xjz a7 = xjz.m43074a(str3, xkb);
                        sek sek2 = xdx.f52034d;
                        xpj xpj2 = xpj;
                        String valueOf = String.valueOf(a7);
                        str = str3;
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Clear usages for credential ");
                            sb2.append(valueOf);
                            sek2.mo25412b(sb2.toString(), new Object[0]);
                            bmxy.m108582a(a7, "identifier cannot be null");
                            bmxy.m108589a(!a7.mo29848b().trim().isEmpty(), "identifier cannot be empty");
                        } catch (InterruptedException | xma e) {
                            e = e;
                            obj = null;
                            xea.f52044b.mo25417e("Error during registration", e, new Object[0]);
                            xwn.mo30184a(xea.f52054c, e);
                            try {
                                xdx xdx2 = xea.f52055d;
                                bmxy.m108581a(str);
                                bmxy.m108581a(xkb);
                                xdx2.mo29672a(xjz.m43074a(str, xkb));
                            } catch (xma e2) {
                                xea.f52044b.mo25417e("Unable to delete key.", e2, new Object[0]);
                                xwn.mo30184a(xea.f52054c, e2);
                            }
                            xpf xpf = new xpf();
                            xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
                            xpf.f52860a = "Something went wrong during registration";
                            pair = new Pair(xpf.mo30000a(), obj);
                            xom xom = this.f52847g;
                            xrf.f52973q.mo25412b("onRegistrationResult", new Object[0]);
                            ((xrf) xom).mo30062b((AuthenticatorResponse) pair.first, (xpj) pair.second);
                        }
                        try {
                            xdx.f52035a.mo29660e(a7);
                            xpj xpj3 = xpj2;
                            xlw xlw = new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(a2), str4, str5, null);
                            try {
                                xlq xlq = new xlq(digest, (byte) 69, 0, new xln(z ? new byte[16] : boan.f132472f.mo68788c().mo68796b(cdus.m135078b()), xkb.mo29857c(), a6.mo29931b()));
                                if (z) {
                                    xlp = new xmb();
                                } else {
                                    try {
                                        xea.f52045a.mo29681a(xlq.mo29917a(), xlw.mo29927c());
                                        xlp = xea.f52045a.mo29680a();
                                    } catch (xma e3) {
                                        sek sek3 = xea.f52044b;
                                        String valueOf2 = String.valueOf(e3.getMessage());
                                        sek3.mo25417e(valueOf2.length() == 0 ? new String("Error during registration: ") : "Error during registration: ".concat(valueOf2), e3, new Object[0]);
                                        xwn.mo30184a(xea.f52054c, e3);
                                        xpf xpf2 = new xpf();
                                        xpf2.mo30001a(ErrorCode.UNKNOWN_ERR);
                                        xpf2.f52860a = "Something went wrong when creating SafetyNet-based attestation statement";
                                        pair = new Pair(xpf2.mo30000a(), null);
                                    }
                                }
                                try {
                                    xlo xlo = new xlo(xlq.mo29917a(), xlp.mo29916b(), xlp.mo29915a().mo74444c());
                                    xpd xpd = new xpd();
                                    xpd.mo29997c(xkb.mo29857c());
                                    xpd.mo29996b(xlw.mo29926b());
                                    xpd.mo29995a(xlo.mo29912a());
                                    pair = new Pair(xpd.mo29994a(), xpj3);
                                } catch (bypm | bypq | bypr e4) {
                                    xea.f52044b.mo25417e("Error converting attestation object to CBOR array", e4, new Object[0]);
                                    xwn.mo30184a(xea.f52054c, e4);
                                    xpf xpf3 = new xpf();
                                    xpf3.mo30001a(ErrorCode.ENCODING_ERR);
                                    xpf3.f52860a = "Something went wrong when converting attestation object to CBOR array";
                                    pair = new Pair(xpf3.mo30000a(), null);
                                }
                            } catch (IOException e5) {
                                sek sek4 = xea.f52044b;
                                String valueOf3 = String.valueOf(e5.getMessage());
                                sek4.mo25417e(valueOf3.length() == 0 ? new String("Error during registration: ") : "Error during registration: ".concat(valueOf3), e5, new Object[0]);
                                xwn.mo30184a(xea.f52054c, e5);
                                xpf xpf4 = new xpf();
                                xpf4.mo30001a(ErrorCode.ENCODING_ERR);
                                xpf4.f52860a = "Something went wrong when encoding credential public key";
                                pair = new Pair(xpf4.mo30000a(), null);
                            }
                        } catch (xdk e6) {
                            obj = null;
                            sek sek5 = xdx.f52034d;
                            String valueOf4 = String.valueOf(a7);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 37);
                            sb3.append("Error clearing usages for credential ");
                            sb3.append(valueOf4);
                            sek5.mo25418e(sb3.toString(), new Object[0]);
                            String valueOf5 = String.valueOf(a7);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 37);
                            sb4.append("Error clearing usages for credential ");
                            sb4.append(valueOf5);
                            throw new xma(sb4.toString(), e6);
                        } catch (InterruptedException | xma e7) {
                            e = e7;
                            xea.f52044b.mo25417e("Error during registration", e, new Object[0]);
                            xwn.mo30184a(xea.f52054c, e);
                            xdx xdx22 = xea.f52055d;
                            bmxy.m108581a(str);
                            bmxy.m108581a(xkb);
                            xdx22.mo29672a(xjz.m43074a(str, xkb));
                            xpf xpf5 = new xpf();
                            xpf5.mo30001a(ErrorCode.UNKNOWN_ERR);
                            xpf5.f52860a = "Something went wrong during registration";
                            pair = new Pair(xpf5.mo30000a(), obj);
                            xom xom2 = this.f52847g;
                            xrf.f52973q.mo25412b("onRegistrationResult", new Object[0]);
                            ((xrf) xom2).mo30062b((AuthenticatorResponse) pair.first, (xpj) pair.second);
                        }
                    } catch (InterruptedException | xma e8) {
                        e = e8;
                        str = str3;
                        obj = null;
                        xea.f52044b.mo25417e("Error during registration", e, new Object[0]);
                        xwn.mo30184a(xea.f52054c, e);
                        xdx xdx222 = xea.f52055d;
                        bmxy.m108581a(str);
                        bmxy.m108581a(xkb);
                        xdx222.mo29672a(xjz.m43074a(str, xkb));
                        xpf xpf52 = new xpf();
                        xpf52.mo30001a(ErrorCode.UNKNOWN_ERR);
                        xpf52.f52860a = "Something went wrong during registration";
                        pair = new Pair(xpf52.mo30000a(), obj);
                        xom xom22 = this.f52847g;
                        xrf.f52973q.mo25412b("onRegistrationResult", new Object[0]);
                        ((xrf) xom22).mo30062b((AuthenticatorResponse) pair.first, (xpj) pair.second);
                    }
                } catch (xma e9) {
                    xea.f52044b.mo25417e("Error during registration: unable to create key.", e9, new Object[0]);
                    xwn.mo30184a(xea.f52054c, e9);
                    xpf xpf6 = new xpf();
                    xpf6.mo30001a(ErrorCode.UNKNOWN_ERR);
                    xpf6.f52860a = "Unable to create key during registration";
                    pair = new Pair(xpf6.mo30000a(), null);
                }
            } else {
                String str6 = str3;
                try {
                    if (xea.f52055d.mo29673a(str6, (xkb) a.get(i3))) {
                        xea.f52044b.mo25412b("Re-register the device is not allowed.", new Object[0]);
                        if (!((Boolean) xmn.f52773w.mo58455c()).booleanValue()) {
                            xpf xpf7 = new xpf();
                            xpf7.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
                            xpf7.f52860a = "An excluded credential has already been registered with the device";
                            pair = new Pair(xpf7.mo30000a(), null);
                        } else {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            MutableBoolean mutableBoolean = new MutableBoolean(false);
                            xea.f52056e.mo29666a(xea.f52054c, bmvz.f131120a, new xdz(xea, mutableBoolean, xwn, countDownLatch), xwn);
                            try {
                                countDownLatch.await();
                            } catch (InterruptedException e10) {
                                xea.f52044b.mo25418e("Countdown latch was interrupted", new Object[0]);
                            }
                            if (!mutableBoolean.value) {
                                xpf xpf8 = new xpf();
                                xpf8.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
                                xpf8.f52860a = "User does not consent to create a new credential";
                                pair = new Pair(xpf8.mo30000a(), null);
                            } else {
                                xpf xpf9 = new xpf();
                                xpf9.mo30001a(ErrorCode.INVALID_STATE_ERR);
                                xpf9.f52860a = "One of the excluded credentials exists on the local device";
                                pair = new Pair(xpf9.mo30000a(), null);
                            }
                        }
                    } else {
                        xon = this;
                        str2 = str6;
                        i3++;
                        str3 = str2;
                        i2 = 1;
                    }
                } catch (xma e11) {
                    xon = this;
                    str2 = str6;
                    xea.f52044b.mo25417e("Error when looking up key in LegacyCredentialStore", e11, new Object[0]);
                    xwn.mo30184a(xea.f52054c, e11);
                }
            }
        }
        xom xom222 = this.f52847g;
        xrf.f52973q.mo25412b("onRegistrationResult", new Object[0]);
        ((xrf) xom222).mo30062b((AuthenticatorResponse) pair.first, (xpj) pair.second);
    }
}
