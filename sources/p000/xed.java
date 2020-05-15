package p000;

import android.content.Context;
import com.google.android.gms.safetynet.AttestationData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xed {

    /* renamed from: c */
    private static final Logger f52057c = new Logger(new String[]{"SafetyAttestation"}, (short[]) null);

    /* renamed from: a */
    private final Context f52058a;

    /* renamed from: b */
    private xmc f52059b;

    /* renamed from: d */
    private final rjx f52060d;

    public xed(Context context) {
        rfi rfi = rfi.f42868a;
        rjx a = apfp.m70157a(context);
        this.f52058a = context;
        this.f52060d = a;
    }

    /* renamed from: b */
    private final void m42755b() {
        f52057c.mo25418e("SafetyNet verification has failed", new Object[0]);
        this.f52059b = null;
    }

    /* renamed from: a */
    public final xmc mo29680a() {
        xmc xmc = this.f52059b;
        if (xmc != null) {
            return xmc;
        }
        throw new xma("Failed to get attestation statement.");
    }

    /* renamed from: a */
    public final void mo29681a(byte[] bArr, byte[] bArr2) {
        String str;
        try {
            byte[] digest = xid.m42997a().digest(bqce.m112562a(bArr, bArr2));
            if (digest != null) {
                if (digest.length >= 16) {
                    rkj rkj = (rkj) aucu.m76783a(sdl.m34955a(apgo.m70240a(this.f52060d.f43165D, digest, "AIzaSyDqVnJBjE5ymo--oBJt3On7HQx9xNm1RHA"), new rkj()), 10, TimeUnit.SECONDS);
                    if (rkj != null) {
                        f52057c.mo25412b("Successfully get SafetyNet verification result", new Object[0]);
                        AttestationData attestationData = ((apgf) rkj.f43190a).f84329a;
                        if (attestationData != null) {
                            str = attestationData.f107314a;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            f52057c.mo25418e("JWS result returned from SafetyNet attestation was empty", new Object[0]);
                            this.f52059b = null;
                            return;
                        }
                        this.f52059b = new xmc(String.valueOf(rfy.m33553j(this.f52058a)), str.getBytes());
                        return;
                    }
                    f52057c.mo25418e("The SafetyNet attestation result is null", new Object[0]);
                    m42755b();
                    return;
                }
            }
            f52057c.mo25418e("The nonce for SafetyNet attestation is not valid", new Object[0]);
            m42755b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f52057c.mo25417e("SafetyNet attestation failed", e, new Object[0]);
            m42755b();
        }
    }
}
