package p000;

import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeCompletedViewOptions;
import com.google.android.gms.fido.fido2.api.view.InternalTransportChallengeViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: xgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xgv extends xhb {

    /* renamed from: e */
    public static final Logger f52227e = new Logger(new String[]{"InternalTransportController"}, (short[]) null);

    /* renamed from: f */
    private static final byte[] f52228f = {0};

    /* renamed from: a */
    public final xce f52229a;

    /* renamed from: b */
    public final String f52230b;

    /* renamed from: c */
    public bmxv f52231c;

    /* renamed from: d */
    public long f52232d;

    /* renamed from: g */
    private final bqgy f52233g = bqgy.m112818c();

    /* renamed from: h */
    private final Context f52234h;

    /* renamed from: i */
    private final RequestOptions f52235i;

    /* renamed from: j */
    private final xhi f52236j;

    /* renamed from: k */
    private final xoo f52237k;

    /* renamed from: m */
    private final String f52238m;

    /* renamed from: n */
    private final String f52239n;

    /* renamed from: o */
    private bqgg f52240o;

    /* renamed from: p */
    private xlw f52241p;

    /* renamed from: q */
    private xlq f52242q;

    public xgv(Context context, RequestOptions requestOptions, xoo xoo, String str, String str2, xhi xhi, xce xce) {
        this.f52234h = context;
        this.f52235i = requestOptions;
        this.f52237k = xoo;
        this.f52238m = str;
        this.f52239n = str2;
        this.f52236j = xhi;
        this.f52230b = xez.m42803d(requestOptions);
        this.f52229a = xce;
    }

    /* renamed from: c */
    private final void m42897c(int i) {
        bqga.m112781a(this.f52240o, new xgu(this, i), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo29726a() {
        bqgg bqgg;
        if (xez.m42800a(this.f52235i)) {
            bngx e = xez.m42804e(this.f52235i);
            if (e.isEmpty()) {
                bqgg = this.f52229a.mo29628a(this.f52230b, xmq.KEYSTORE);
            } else {
                bngs j = bngx.m109377j();
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    j.mo67668c(this.f52229a.mo29629a(this.f52230b, (byte[]) e.get(i)));
                }
                bqgg = bqdx.m112674a(adax.m50091a(j.mo67664a(), xgq.f52221a), new xgp(this), bqfb.INSTANCE);
            }
        } else {
            bngx e2 = xez.m42804e(this.f52235i);
            if (e2.isEmpty()) {
                f52227e.mo25414c("Authentication request has empty allowList", new Object[0]);
                bqgg = bqga.m112775a(bmvz.f131120a);
            } else {
                bngs j2 = bngx.m109377j();
                bnre i2 = e2.listIterator();
                while (i2.hasNext()) {
                    j2.mo67668c(this.f52229a.mo29629a(this.f52230b, (byte[]) i2.next()));
                }
                bqgg = bqdx.m112674a(adax.m50091a(j2.mo67664a(), xgr.f52222a), new xgs(this), bqfb.INSTANCE);
            }
        }
        this.f52240o = bqgg;
        return this.f52233g;
    }

    /* renamed from: b */
    public final void mo29730b() {
    }

    /* renamed from: c */
    public final void mo29731c() {
    }

    /* renamed from: d */
    public final void mo29732d() {
        if (!this.f52233g.isDone()) {
            this.f52233g.mo69136a((Throwable) adbe.m50106a(34004));
        }
    }

    /* renamed from: e */
    public final Transport mo29733e() {
        return Transport.INTERNAL;
    }

    /* renamed from: f */
    public final void mo29734f() {
    }

    /* renamed from: b */
    public final void mo29738b(int i) {
        byte[] bArr;
        bmxv bmxv;
        String str = this.f52230b;
        if (this.f52231c.mo66813a()) {
            bArr = ((xch) this.f52231c.mo66814b()).mo29631b();
        } else {
            bArr = null;
        }
        if (!this.f52231c.mo66813a()) {
            bmxv = bmvz.f131120a;
        } else if (xez.m42800a(this.f52235i)) {
            bmxv = bmxv.m108566b(f52228f);
        } else {
            this.f52241p = new xlw(xlv.WEBAUTHN_GET, boan.f132471e.mo68783a().mo68794a(this.f52235i.mo18682a()), this.f52238m, this.f52239n, null);
            MessageDigest a = xid.m42997a();
            a.update(this.f52230b.getBytes(StandardCharsets.UTF_8));
            xlq xlq = new xlq(a.digest(), (byte) 5, this.f52232d, null);
            this.f52242q = xlq;
            bmxv = bmxv.m108566b(bqce.m112562a(xlq.mo29917a(), this.f52241p.mo29927c()));
        }
        bmxv a2 = this.f52236j.mo29745a(i, new InternalTransportChallengeViewOptions(str, bArr, (byte[]) bmxv.mo66815c()));
        if (a2.mo66813a()) {
            this.f52237k.mo14261a(((ViewOptions) a2.mo66814b()).toString());
        }
    }

    /* renamed from: a */
    public final void mo29727a(int i) {
        m42897c(i);
    }

    /* renamed from: a */
    public final void mo29728a(ViewOptions viewOptions) {
        AuthenticatorResponse authenticatorResponse;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions;
        byte[] bArr;
        xlp xlp;
        sdo.m34970a(Transport.INTERNAL.equals(viewOptions.mo18758b()));
        xrv xrv = xrv.MULTI_TRANSPORT;
        int ordinal = viewOptions.mo18759c().ordinal();
        if (ordinal == 9) {
            m42897c(3);
        } else if (ordinal != 11) {
            f52227e.mo25418e("Wrong ViewOptions used in onUserSelectedView", new Object[0]);
        } else {
            InternalTransportChallengeCompletedViewOptions internalTransportChallengeCompletedViewOptions = (InternalTransportChallengeCompletedViewOptions) viewOptions;
            bqgy bqgy = this.f52233g;
            int i = internalTransportChallengeCompletedViewOptions.f31827a;
            boolean z = true;
            if (i == 0) {
                byte[] bArr2 = internalTransportChallengeCompletedViewOptions.f31828b;
                if (bArr2 == null) {
                    authenticatorResponse = xez.m42801b(this.f52235i) ? xpv.m43283a(34015) : xpv.m43283a(34014);
                } else if (!xez.m42800a(this.f52235i)) {
                    xpb xpb = new xpb();
                    xpb.mo29991d(bArr2);
                    xpb.mo29988a(this.f52242q.mo29917a());
                    xpb.mo29989b(this.f52241p.mo29926b());
                    xpb.mo29990c(((xch) this.f52231c.mo66814b()).mo29631b());
                    authenticatorResponse = xpb.mo29987a();
                } else {
                    if (xez.m42802c(this.f52235i)) {
                        publicKeyCredentialCreationOptions = ((BrowserPublicKeyCredentialCreationOptions) this.f52235i).f31732a;
                    } else {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) this.f52235i;
                    }
                    xlw xlw = new xlw(xlv.WEBAUTHN_CREATE, boan.f132471e.mo68783a().mo68794a(this.f52235i.mo18682a()), this.f52238m, this.f52239n, null);
                    AttestationConveyancePreference attestationConveyancePreference = publicKeyCredentialCreationOptions.f31773j;
                    if (attestationConveyancePreference != null && !AttestationConveyancePreference.NONE.equals(attestationConveyancePreference)) {
                        z = false;
                    }
                    if (!z) {
                        bArr = boan.f132472f.mo68788c().mo68796b(cdus.m135078b());
                    } else {
                        bArr = new byte[16];
                    }
                    try {
                        byte[] b = ((xch) this.f52231c.mo66814b()).mo29631b();
                        PublicKey c = ((xch) this.f52231c.mo66814b()).mo29632c();
                        sdo.m34970a("EC".equals(c.getAlgorithm()));
                        ECPoint w = ((ECPublicKey) c).getW();
                        xln xln = new xln(bArr, b, new xlz(xpr.ES256, xly.SECP256R1, w.getAffineX(), w.getAffineY()).mo29931b());
                        MessageDigest a = xid.m42997a();
                        a.update(this.f52230b.getBytes(StandardCharsets.UTF_8));
                        xlq xlq = new xlq(a.digest(), (byte) 69, 0, xln);
                        if (!z) {
                            try {
                                xed xed = new xed(this.f52234h);
                                xed.mo29681a(xlq.mo29917a(), xlw.mo29927c());
                                xlp = xed.mo29680a();
                            } catch (xma e) {
                                f52227e.mo25417e("Unable to create SafetyNet-based attestation statement", e, new Object[0]);
                                authenticatorResponse = xpv.m43283a(34007);
                            }
                        } else {
                            xlp = new xmb();
                        }
                        try {
                            xlo xlo = new xlo(xlq.mo29917a(), xlp.mo29916b(), xlp.mo29915a().mo74444c());
                            xpd xpd = new xpd();
                            xpd.mo29997c(((xch) this.f52231c.mo66814b()).mo29631b());
                            xpd.mo29996b(xlw.mo29926b());
                            xpd.mo29995a(xlo.mo29912a());
                            authenticatorResponse = xpd.mo29994a();
                        } catch (bypm | bypq | bypr e2) {
                            f52227e.mo25417e("Unable to convert attestation object to CBOR array", e2, new Object[0]);
                            authenticatorResponse = xpv.m43283a(34006);
                        }
                    } catch (adbe | IOException e3) {
                        f52227e.mo25417e("Unable to encode credential public key", e3, new Object[0]);
                        authenticatorResponse = xpv.m43283a(34006);
                    }
                }
            } else if (i == 1) {
                authenticatorResponse = xpv.m43283a(34021);
            } else if (i != 2) {
                f52227e.mo25418e("Wrong status code used in InternalTransportChallengeCompletedViewOptions", new Object[0]);
                authenticatorResponse = xpv.m43283a(34007);
            } else {
                authenticatorResponse = xpv.m43283a(34022);
            }
            xpw xpw = new xpw();
            xpw.f52903a = authenticatorResponse;
            bqgy.mo69138b(xpw.mo30021a());
        }
    }
}
