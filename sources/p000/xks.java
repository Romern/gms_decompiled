package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xks extends xkh {

    /* renamed from: a */
    static final bypx f52583a = bypx.m125083a(1);

    /* renamed from: b */
    static final bypx f52584b = bypx.m125083a(2);

    /* renamed from: c */
    static final bypx f52585c = bypx.m125083a(3);

    /* renamed from: d */
    static final bypx f52586d = bypx.m125083a(4);

    /* renamed from: e */
    static final bypx f52587e = bypx.m125083a(5);

    /* renamed from: j */
    private static final bnic f52588j = bnic.m109490a(f52584b, f52585c);

    /* renamed from: k */
    private static final bnic f52589k = bnic.m109493a(f52583a, f52584b, f52585c, f52586d, f52587e);

    /* renamed from: m */
    private static final Logger f52590m = new Logger(new String[]{"AuthenticatorAssertionResponseData"}, (short[]) null);

    /* renamed from: f */
    public final PublicKeyCredentialDescriptor f52591f;

    /* renamed from: g */
    public final byte[] f52592g;

    /* renamed from: h */
    public final byte[] f52593h;

    /* renamed from: i */
    public final xls f52594i;

    /* renamed from: l */
    private final Integer f52595l;

    public xks(PublicKeyCredentialDescriptor publicKeyCredentialDescriptor, byte[] bArr, byte[] bArr2, xls xls, Integer num) {
        this.f52591f = publicKeyCredentialDescriptor;
        this.f52592g = bArr;
        this.f52593h = bArr2;
        this.f52594i = xls;
        this.f52595l = num;
    }

    /* renamed from: a */
    public static xks m43109a(bypx bypx, xkf xkf) {
        boolean z;
        List list;
        boolean z2 = xkf instanceof xkn;
        boolean z3 = false;
        if (!z2) {
            z = xkf instanceof xkp;
        } else {
            z = true;
        }
        sdo.m34974b(z);
        bnim a = xkc.m43083a(bypx, "Response data for AuthenticatorGet*Assertion not encoded in CBOR map");
        if (a.f131670c.containsAll(f52588j)) {
            bnrd a2 = bnpf.m110057c(a.f131670c, f52589k).iterator();
            while (a2.hasNext()) {
                f52590m.mo25414c("Unrecognized key present in response map: %s", (bypx) a2.next());
            }
            xkr xkr = new xkr();
            bypx bypx2 = (bypx) a.get(f52584b);
            String valueOf = String.valueOf(bypx2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 101);
            sb.append("Response map for AuthenticatorGet*Assertion contains a non-bytestring CBOR value: ");
            sb.append(valueOf);
            sb.append(" for authData label");
            xkr.mo29872a(xkc.m43084b(bypx2, sb.toString()));
            bypx bypx3 = (bypx) a.get(f52585c);
            String valueOf2 = String.valueOf(bypx3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 102);
            sb2.append("Response map for AuthenticatorGet*Assertion contains a non-bytestring CBOR value: ");
            sb2.append(valueOf2);
            sb2.append(" for signature label");
            xkr.mo29873b(xkc.m43084b(bypx3, sb2.toString()));
            if (a.containsKey(f52583a)) {
                try {
                    xkr.f52578a = PublicKeyCredentialDescriptor.m23481a((bypx) a.get(f52583a));
                } catch (xpz e) {
                    throw new xkk("Response data for AuthenticatorGet*Assertion included invalid high-level data structures", e);
                }
            } else {
                sdo.m34974b(z2 || (xkf instanceof xkp));
                if ((xkf instanceof xkp) || (list = ((xkn) xkf).f52572j) == null || list.size() != 1) {
                    throw new xkk("Response data for AuthenticatorGet*Assertion is missing the expected credential descriptor field");
                }
            }
            if (a.containsKey(f52586d)) {
                try {
                    xkr.f52579b = xls.m43150a((bypx) a.get(f52586d));
                } catch (IOException e2) {
                    throw new xkk("Response data for AuthenticatorGet*Assertion included invalid high-level data structures", e2);
                }
            }
            if (a.containsKey(f52587e)) {
                if (z2) {
                    bypx bypx4 = (bypx) a.get(f52587e);
                    xkn xkn = (xkn) xkf;
                    sdo.m34959a(xkn);
                    String valueOf3 = String.valueOf(bypx4);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 108);
                    sb3.append("Response map for AuthenticatorGetAssertion contains a non-integer CBOR value: ");
                    sb3.append(valueOf3);
                    sb3.append(" for numberOfCredentials label");
                    long d = xkc.m43086d(bypx4, sb3.toString());
                    if (d > 0) {
                        List list2 = xkn.f52572j;
                        if (list2 != null && d > ((long) list2.size())) {
                            String valueOf4 = String.valueOf(bypx4);
                            int size = xkn.f52572j.size();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                            sb4.append("Response map for AuthenticatorGetAssertion contains a numberOfCredentials parameter whose value: ");
                            sb4.append(valueOf4);
                            sb4.append(" exceeds the size of the allowList: ");
                            sb4.append(size);
                            throw new xkk(sb4.toString());
                        } else if (d <= 25) {
                            int i = (int) d;
                            if (i > 0 && ((long) i) <= 25) {
                                z3 = true;
                            }
                            sdo.m34974b(z3);
                            xkr.f52580c = Integer.valueOf(i);
                        } else {
                            String valueOf5 = String.valueOf(bypx4);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 110);
                            sb5.append("Response map for AuthenticatorGetAssertion contains an extremely large integer: ");
                            sb5.append(valueOf5);
                            sb5.append(" for numberOfCredentials label");
                            throw new xkk(sb5.toString());
                        }
                    } else {
                        String valueOf6 = String.valueOf(bypx4);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 106);
                        sb6.append("Response map for AuthenticatorGetAssertion contains a non-positive integer: ");
                        sb6.append(valueOf6);
                        sb6.append(" for numberOfCredentials label");
                        throw new xkk(sb6.toString());
                    }
                } else {
                    throw new xkk("Response data for AuthenticatorGet*Assertion included numberOfCredentials field when it was not appropriate to do so");
                }
            }
            return xkr.mo29871a();
        }
        throw new xkk("Response map for AuthenticatorGet*Assertion is missing one or more of the authData and signature required fields");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xks) {
            xks xks = (xks) obj;
            if (!Arrays.equals(this.f52592g, xks.f52592g) || !Arrays.equals(this.f52593h, xks.f52593h) || !bmxi.m108538a(this.f52595l, xks.f52595l) || !bmxi.m108538a(this.f52594i, xks.f52594i) || !bmxi.m108538a(this.f52591f, xks.f52591f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52592g)), Integer.valueOf(Arrays.hashCode(this.f52593h)), this.f52595l, this.f52594i, this.f52591f});
    }

    /* renamed from: a */
    public final bypu mo29865a() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bypt(f52584b, bypx.m125082a(this.f52592g)));
            arrayList.add(new bypt(f52585c, bypx.m125082a(this.f52593h)));
            if (this.f52591f != null) {
                arrayList.add(new bypt(f52583a, this.f52591f.mo18717a()));
            }
            if (this.f52595l != null) {
                arrayList.add(new bypt(f52587e, bypx.m125083a((long) this.f52595l.intValue())));
            }
            if (this.f52594i != null) {
                bypx bypx = f52586d;
                xls xls = this.f52594i;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new bypt(xqv.f52936a, bypx.m125082a(xls.f52688a)));
                if (xls.f52689b != null) {
                    arrayList2.add(new bypt(xqv.f52939d, bypx.m125085a(xls.f52689b)));
                }
                if (xls.f52691d != null) {
                    arrayList2.add(new bypt(xqv.f52941f, bypx.m125085a(xls.f52691d)));
                }
                if (xls.f52690c != null) {
                    arrayList2.add(new bypt(xqv.f52940e, bypx.m125085a(xls.f52690c)));
                }
                arrayList.add(new bypt(bypx, bypx.m125086b(arrayList2)));
            }
            return bypx.m125086b(arrayList);
        } catch (bypm e) {
            throw new RuntimeException(e);
        }
    }
}
