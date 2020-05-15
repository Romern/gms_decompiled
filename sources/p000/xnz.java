package p000;

import android.util.MutableBoolean;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: xnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xnz implements Runnable {

    /* renamed from: c */
    public static final Logger f52817c = new Logger(new String[]{"AuthenticationOperation"}, (short[]) null);

    /* renamed from: a */
    public final xwn f52818a;

    /* renamed from: b */
    public final xwj f52819b;

    /* renamed from: d */
    private final xdh f52820d;

    /* renamed from: e */
    private final xeh f52821e;

    /* renamed from: f */
    private final xdx f52822f;

    /* renamed from: g */
    private final RequestOptions f52823g;

    /* renamed from: h */
    private final String f52824h;

    /* renamed from: i */
    private final String f52825i;

    /* renamed from: j */
    private final xny f52826j;

    public xnz(xwj xwj, xdh xdh, xeh xeh, xdx xdx, RequestOptions requestOptions, xwn xwn, String str, String str2, xny xny) {
        sdo.m34959a(xdh);
        this.f52820d = xdh;
        sdo.m34959a(xeh);
        this.f52821e = xeh;
        sdo.m34959a(xdx);
        this.f52822f = xdx;
        sdo.m34959a(requestOptions);
        this.f52823g = requestOptions;
        sdo.m34959a(xwn);
        this.f52818a = xwn;
        this.f52819b = xwj;
        sdo.m34959a((Object) str);
        this.f52824h = str;
        sdo.m34959a((Object) str2);
        this.f52825i = str2;
        sdo.m34959a(xny);
        this.f52826j = xny;
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
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0222 A[LOOP:1: B:38:0x00c2->B:59:0x0222, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0218 A[SYNTHETIC] */
    public final void run() {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions;
        Pair pair;
        AuthenticatorResponse authenticatorResponse;
        xwn xwn;
        xlw xlw;
        xlq xlq;
        byte[][] bArr;
        RequestOptions requestOptions = this.f52823g;
        if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
            publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions;
        } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a;
        } else {
            RuntimeException runtimeException = new RuntimeException("Non-authentication request is provided to AuthenticationOperation");
            this.f52818a.mo30184a(this.f52819b, runtimeException);
            throw runtimeException;
        }
        List list = publicKeyCredentialRequestOptions.f31784d;
        if (list == null || list.isEmpty()) {
            ErrorCode errorCode = ErrorCode.NOT_ALLOWED_ERR;
            xny xny = this.f52826j;
            xpf xpf = new xpf();
            xpf.mo30001a(errorCode);
            xpf.f52860a = "Authentication request must have non-empty allowList";
            xny.mo29959a(xpf.mo30000a(), null);
            return;
        }
        ArrayList a = bnkn.m109661a();
        List list2 = publicKeyCredentialRequestOptions.f31784d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) list2.get(i);
            try {
                xkb xkb = new xkb(publicKeyCredentialDescriptor.f31776a);
                if (!this.f52822f.mo29673a(publicKeyCredentialRequestOptions.f31783c, xkb)) {
                    if (cdvq.m135120b()) {
                        if (xkb.mo29857c().length == 32) {
                            if (!publicKeyCredentialRequestOptions.f31783c.equals("google.com")) {
                            }
                        }
                    }
                }
                a.add(publicKeyCredentialDescriptor);
            } catch (xma e) {
                f52817c.mo25418e("Error checking the credential existence in local KeyStore or database", new Object[0]);
            }
        }
        if (a.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            MutableBoolean mutableBoolean = new MutableBoolean(false);
            this.f52821e.mo29666a(this.f52819b, bmvz.f131120a, new xnx(this, mutableBoolean, countDownLatch), this.f52818a);
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                f52817c.mo25418e("Countdown latch was interrupted", new Object[0]);
            }
            if (mutableBoolean.value) {
                xny xny2 = this.f52826j;
                xpf xpf2 = new xpf();
                xpf2.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
                xpf2.f52860a = "Cannot find credential in local KeyStore or database";
                xny2.mo29959a(xpf2.mo30000a(), null);
                return;
            }
            return;
        }
        int size2 = a.size();
        int i2 = 0;
        while (i2 < size2) {
            xdh xdh = this.f52820d;
            byte[] bArr2 = publicKeyCredentialRequestOptions.f31781a;
            String str = publicKeyCredentialRequestOptions.f31783c;
            xkb xkb2 = new xkb(((PublicKeyCredentialDescriptor) a.get(i2)).f31776a);
            String str2 = this.f52824h;
            String str3 = this.f52825i;
            xwn xwn2 = this.f52818a;
            sdo.checkIfNull(bArr2, "Challenge parameter cannot be null");
            sdo.checkIfNull((Object) str, (Object) "Relying party identifier cannot be null");
            sdo.checkIfNull(xkb2, "Key handle cannot be null");
            sdo.checkIfNull((Object) str2, (Object) "Origin cannot be null");
            sdo.checkIfNull(xwn2, "Event logger cannot be null");
            Logger Logger = xdh.f51995a;
            String a2 = boan.f132471e.mo68783a().mo68794a(bArr2);
            String a3 = boan.f132472f.mo68794a(xkb2.mo29857c());
            int length = String.valueOf(a2).length();
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = publicKeyCredentialRequestOptions;
            StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + String.valueOf(a3).length());
            sb.append("Received request = challengeParameter:");
            sb.append(a2);
            sb.append(" rpId:");
            sb.append(str);
            sb.append(" keyHandle:");
            sb.append(a3);
            Logger.mo25412b(sb.toString(), new Object[0]);
            try {
                long b = xdh.f52055d.mo29675b(str, xkb2);
                xwn = xwn2;
                try {
                    xlw = new xlw(xlv.WEBAUTHN_GET, boan.f132471e.mo68783a().mo68794a(bArr2), str2, str3, null);
                    MessageDigest a4 = xid.m42997a();
                    a4.update(str.getBytes(StandardCharsets.UTF_8));
                    xlq = new xlq(a4.digest(), (byte) 5, b, null);
                    bArr = new byte[2][];
                    bArr[0] = xlq.mo29917a();
                } catch (InterruptedException | xma e3) {
                    e = e3;
                    xdh.f51995a.mo25417e("Error during authentication execution", e, new Object[0]);
                    xwn.mo30184a(xdh.f52054c, e);
                    xpf xpf3 = new xpf();
                    xpf3.mo30001a(ErrorCode.UNKNOWN_ERR);
                    xpf3.f52860a = "Something went wrong during authentication";
                    pair = new Pair(xpf3.mo30000a(), null);
                    authenticatorResponse = (AuthenticatorResponse) pair.first;
                    i2++;
                    if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
                    }
                }
                try {
                    bArr[1] = xlw.mo29927c();
                    Pair a5 = xdh.mo29679a(str, xkb2, bqce.m112562a(bArr), xwn);
                    xpb xpb = new xpb();
                    xpb.mo29990c(xkb2.mo29857c());
                    xpb.mo29989b(xlw.mo29926b());
                    xpb.mo29988a(xlq.mo29917a());
                    xpb.mo29991d((byte[]) a5.first);
                    pair = new Pair(xpb.mo29987a(), (xpj) a5.second);
                } catch (InterruptedException | xma e4) {
                    e = e4;
                    xdh.f51995a.mo25417e("Error during authentication execution", e, new Object[0]);
                    xwn.mo30184a(xdh.f52054c, e);
                    xpf xpf32 = new xpf();
                    xpf32.mo30001a(ErrorCode.UNKNOWN_ERR);
                    xpf32.f52860a = "Something went wrong during authentication";
                    pair = new Pair(xpf32.mo30000a(), null);
                    authenticatorResponse = (AuthenticatorResponse) pair.first;
                    i2++;
                    if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
                    }
                }
            } catch (InterruptedException | xma e5) {
                e = e5;
                xwn = xwn2;
                xdh.f51995a.mo25417e("Error during authentication execution", e, new Object[0]);
                xwn.mo30184a(xdh.f52054c, e);
                xpf xpf322 = new xpf();
                xpf322.mo30001a(ErrorCode.UNKNOWN_ERR);
                xpf322.f52860a = "Something went wrong during authentication";
                pair = new Pair(xpf322.mo30000a(), null);
                authenticatorResponse = (AuthenticatorResponse) pair.first;
                i2++;
                if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
                }
            }
            authenticatorResponse = (AuthenticatorResponse) pair.first;
            i2++;
            if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
                this.f52826j.mo29959a(authenticatorResponse, (xpj) pair.second);
                return;
            }
            publicKeyCredentialRequestOptions = publicKeyCredentialRequestOptions2;
        }
        ErrorCode errorCode2 = ErrorCode.NOT_ALLOWED_ERR;
        xpf xpf4 = new xpf();
        xpf4.mo30001a(errorCode2);
        xpf4.f52860a = "None of the allowed credentials can be authenticated";
        this.f52826j.mo29959a(xpf4.mo30000a(), null);
    }
}
