package p000;

import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: asre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asre implements asqs {

    /* renamed from: b */
    private static final srn f89485b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public atch f89486a;

    /* renamed from: c */
    private final asqq f89487c;

    /* renamed from: d */
    private final byte[] f89488d;

    /* renamed from: e */
    private final String f89489e;

    /* renamed from: f */
    private bgm f89490f;

    /* renamed from: g */
    private final asqu f89491g;

    /* renamed from: h */
    private int f89492h = 12;

    /* renamed from: i */
    private long f89493i;

    /* renamed from: j */
    private boolean f89494j = false;

    /* renamed from: k */
    private boolean f89495k = false;

    public asre(atch atch, asqq asqq, byte[] bArr, String str) {
        this.f89486a = atch;
        this.f89487c = asqq;
        this.f89488d = bArr;
        this.f89489e = str;
        asqu asqu = new asqu();
        this.f89491g = asqu;
        asqu.f89416l = bozu.AMEX_MSD;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgx.a(byte[], short, short):short
     arg types: [byte[], int, short]
     candidates:
      bgx.a(java.lang.String, int, int):java.lang.String
      bgx.a(byte[], int, int):java.lang.String
      bgx.a(byte[], short, byte):short
      bgx.a(byte[], byte[], short):short
      bgx.a(byte[], short, short):short */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014f, code lost:
        if (r0.equals("14") != false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0181  */
    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        Throwable th;
        bfr bfr;
        int hashCode;
        int i;
        String str;
        byte[] bArr2;
        int i2;
        String str2;
        String str3;
        String str4;
        boolean z;
        astc b;
        boolean z2 = true;
        if (!this.f89495k && (b = astc.m74748b(bArr)) != null) {
            this.f89495k = true;
            boolean a = b.mo49454a(astc.f89640j);
            this.f89491g.f89411g = a;
            if (a) {
                if (!this.f89487c.mo49382a()) {
                    this.f89494j = true;
                }
            } else if (!this.f89487c.mo49382a()) {
                this.f89492h = 21;
                return astf.m74756a(new byte[0], 0);
            }
        }
        if (this.f89490f == null) {
            bgq bgq = !this.f89487c.mo49383b() ? bgq.TAP_PAYMENT : bgq.PAYMENT;
            try {
                bgm a2 = atcg.m75537a(this.f89486a);
                this.f89490f = a2;
                a2.mo3116a(bgq, "ignored");
                bnsl a3 = f89485b.mo26019b(aske.m74275a());
                a3.mo68432a("asre", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68405a("Start transaction");
            } catch (atcz e) {
                throw new IllegalStateException("SDK locked for 10 seconds during payment", e);
            }
        }
        bha bha = bha.NO_FURTHER_ACTION_REQUIRED;
        bfr bfr2 = new bfr();
        char c = 4;
        try {
            if (bArr.length < 4) {
                throw new bfq(bha.INVALID_DATA);
            } else if (bgp.OPERATION.f3179b == null || (!bgq.PAYMENT.equals(bgp.OPERATION.f3179b) && !bgq.TAP_PAYMENT.equals(bgp.OPERATION.f3179b))) {
                throw new bfq(bha.OPERATION_NOT_SUPPORTED);
            } else {
                bgr bgr = bgs.f3191a;
                bgr.mo3121a("COMMAND_APDU_BYTES", bArr);
                new bey().mo3074a();
                bfr = (bfr) bgr.mo3119a("RESPONSE_APDU", true);
                try {
                    bgo.m2984a(bfr, (bha) bgr.mo3119a("OPERATION_STATUS", false), "07");
                    bgs.f3191a.mo3120a();
                } catch (Exception e2) {
                    bfr2 = bfr;
                    e = e2;
                    try {
                        bfr2.f3127b = 28416;
                        Log.e("core-hceclient", "::tokenAPDU::catch::", e);
                        bgo.m2984a(bfr2, bgo.m2983a(e), "07");
                        bgs.f3191a.mo3120a();
                        bfr = bfr2;
                        String str5 = bfr.f3134c;
                        hashCode = str5.hashCode();
                        int i3 = 2;
                        if (hashCode != 1568) {
                        }
                        c = 65535;
                        switch (c) {
                        }
                        this.f89492h = i;
                        if (i == -1) {
                        }
                        str = bfr.f3136e;
                        int indexOf = str.indexOf(44);
                        Map a4 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                        str2 = (String) a4.get("MERCHANT_NAME");
                        if (str2 != null) {
                        }
                        str3 = (String) a4.get("MERCHANT_CODE");
                        if (str3 != null) {
                        }
                        str4 = (String) a4.get("AMOUNT");
                        if (str4 != null) {
                        }
                        if (this.f89494j) {
                        }
                        bArr2 = bfr.f3126a;
                        if (bArr2 != null) {
                        }
                        byte[] bArr3 = new byte[i3];
                        if (bArr2 != null) {
                        }
                        return astf.m74755a(bArr3);
                    } catch (Throwable th2) {
                        th = th2;
                        bgo.m2984a(bfr2, bha, "07");
                        bgs.f3191a.mo3120a();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bfr2 = bfr;
                    bgo.m2984a(bfr2, bha, "07");
                    bgs.f3191a.mo3120a();
                    throw th;
                }
                String str52 = bfr.f3134c;
                hashCode = str52.hashCode();
                int i32 = 2;
                if (hashCode != 1568) {
                    if (hashCode != 1569) {
                        if (hashCode != 1571) {
                            if (hashCode != 1572) {
                                switch (hashCode) {
                                    case 1536:
                                        if (str52.equals("00")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case 1537:
                                        if (str52.equals("01")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str52.equals("02")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str52.equals("03")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        i = 11;
                                        break;
                                    case 1:
                                        i = 19;
                                        break;
                                    case 2:
                                    case 3:
                                        i = -1;
                                        break;
                                    case 4:
                                    case 5:
                                        i = 26;
                                        break;
                                    case 6:
                                        i = 29;
                                        break;
                                    case 7:
                                        i = 15;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                this.f89492h = i;
                                if (i == -1) {
                                    this.f89491g.f89409e = str52.equals(bha.TXN_AMOUNT_HIGH.f3219r);
                                }
                                str = bfr.f3136e;
                                int indexOf2 = str.indexOf(44);
                                if (indexOf2 != -1 && (i2 = indexOf2 + 1) < str.length()) {
                                    Map a42 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                                    str2 = (String) a42.get("MERCHANT_NAME");
                                    if (str2 != null) {
                                        new String(asti.m74762a(str2), StandardCharsets.US_ASCII).trim();
                                    }
                                    str3 = (String) a42.get("MERCHANT_CODE");
                                    if (str3 != null) {
                                        short a5 = (short) ((int) asuv.m74875a(asti.m74762a(str3)));
                                        asqu asqu = this.f89491g;
                                        if (!asqu.f89411g || !asqu.m74486a(a5)) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        asqu.f89411g = z;
                                    }
                                    str4 = (String) a42.get("AMOUNT");
                                    if (str4 != null) {
                                        this.f89493i = asuv.m74875a(asti.m74762a(str4));
                                        this.f89491g.f89416l = bozu.AMEX_EMV;
                                        asqu asqu2 = this.f89491g;
                                        if (!asqu2.f89411g || this.f89493i > cgxi.m147450c()) {
                                            z2 = false;
                                        }
                                        asqu2.f89411g = z2;
                                    }
                                }
                                if (this.f89494j && !this.f89491g.f89411g) {
                                    this.f89492h = 21;
                                    return astf.m74754a(27266);
                                }
                                bArr2 = bfr.f3126a;
                                if (bArr2 != null) {
                                    i32 = 2 + bArr2.length;
                                }
                                byte[] bArr32 = new byte[i32];
                                if (bArr2 != null) {
                                    System.arraycopy(bArr2, 0, bArr32, 0, bArr2.length);
                                    bgx.m3008a(bArr32, (short) bfr.f3126a.length, bfr.f3127b);
                                } else {
                                    bgx.m3008a(bArr32, (short) 0, bfr.f3127b);
                                }
                                return astf.m74755a(bArr32);
                            } else if (str52.equals("15")) {
                                c = 5;
                                switch (c) {
                                }
                                this.f89492h = i;
                                if (i == -1) {
                                }
                                str = bfr.f3136e;
                                int indexOf22 = str.indexOf(44);
                                Map a422 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                                str2 = (String) a422.get("MERCHANT_NAME");
                                if (str2 != null) {
                                }
                                str3 = (String) a422.get("MERCHANT_CODE");
                                if (str3 != null) {
                                }
                                str4 = (String) a422.get("AMOUNT");
                                if (str4 != null) {
                                }
                                if (this.f89494j) {
                                    this.f89492h = 21;
                                    return astf.m74754a(27266);
                                }
                                bArr2 = bfr.f3126a;
                                if (bArr2 != null) {
                                }
                                byte[] bArr322 = new byte[i32];
                                if (bArr2 != null) {
                                }
                                return astf.m74755a(bArr322);
                            }
                        }
                    } else if (str52.equals("12")) {
                        c = 6;
                        switch (c) {
                        }
                        this.f89492h = i;
                        if (i == -1) {
                        }
                        str = bfr.f3136e;
                        int indexOf222 = str.indexOf(44);
                        Map a4222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                        str2 = (String) a4222.get("MERCHANT_NAME");
                        if (str2 != null) {
                        }
                        str3 = (String) a4222.get("MERCHANT_CODE");
                        if (str3 != null) {
                        }
                        str4 = (String) a4222.get("AMOUNT");
                        if (str4 != null) {
                        }
                        if (this.f89494j) {
                        }
                        bArr2 = bfr.f3126a;
                        if (bArr2 != null) {
                        }
                        byte[] bArr3222 = new byte[i32];
                        if (bArr2 != null) {
                        }
                        return astf.m74755a(bArr3222);
                    }
                } else if (str52.equals("11")) {
                    c = 7;
                    switch (c) {
                    }
                    this.f89492h = i;
                    if (i == -1) {
                    }
                    str = bfr.f3136e;
                    int indexOf2222 = str.indexOf(44);
                    Map a42222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                    str2 = (String) a42222.get("MERCHANT_NAME");
                    if (str2 != null) {
                    }
                    str3 = (String) a42222.get("MERCHANT_CODE");
                    if (str3 != null) {
                    }
                    str4 = (String) a42222.get("AMOUNT");
                    if (str4 != null) {
                    }
                    if (this.f89494j) {
                    }
                    bArr2 = bfr.f3126a;
                    if (bArr2 != null) {
                    }
                    byte[] bArr32222 = new byte[i32];
                    if (bArr2 != null) {
                    }
                    return astf.m74755a(bArr32222);
                }
                c = 65535;
                switch (c) {
                }
                this.f89492h = i;
                if (i == -1) {
                }
                str = bfr.f3136e;
                int indexOf22222 = str.indexOf(44);
                Map a422222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
                str2 = (String) a422222.get("MERCHANT_NAME");
                if (str2 != null) {
                }
                str3 = (String) a422222.get("MERCHANT_CODE");
                if (str3 != null) {
                }
                str4 = (String) a422222.get("AMOUNT");
                if (str4 != null) {
                }
                if (this.f89494j) {
                }
                bArr2 = bfr.f3126a;
                if (bArr2 != null) {
                }
                byte[] bArr322222 = new byte[i32];
                if (bArr2 != null) {
                }
                return astf.m74755a(bArr322222);
            }
        } catch (Exception e3) {
            e = e3;
            bfr2.f3127b = 28416;
            Log.e("core-hceclient", "::tokenAPDU::catch::", e);
            bgo.m2984a(bfr2, bgo.m2983a(e), "07");
            bgs.f3191a.mo3120a();
            bfr = bfr2;
            String str522 = bfr.f3134c;
            hashCode = str522.hashCode();
            int i322 = 2;
            if (hashCode != 1568) {
            }
            c = 65535;
            switch (c) {
            }
            this.f89492h = i;
            if (i == -1) {
            }
            str = bfr.f3136e;
            int indexOf222222 = str.indexOf(44);
            Map a4222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i2));
            str2 = (String) a4222222.get("MERCHANT_NAME");
            if (str2 != null) {
            }
            str3 = (String) a4222222.get("MERCHANT_CODE");
            if (str3 != null) {
            }
            str4 = (String) a4222222.get("AMOUNT");
            if (str4 != null) {
            }
            if (this.f89494j) {
            }
            bArr2 = bfr.f3126a;
            if (bArr2 != null) {
            }
            byte[] bArr3222222 = new byte[i322];
            if (bArr2 != null) {
            }
            return astf.m74755a(bArr3222222);
        } catch (Throwable th4) {
            th = th4;
            bgo.m2984a(bfr2, bha, "07");
            bgs.f3191a.mo3120a();
            throw th;
        }
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89491g;
    }

    /* renamed from: c */
    public final void mo49388c() {
        asqu asqu = this.f89491g;
        boolean z = false;
        if (asqu.f89411g && asqu.f89416l == bozu.AMEX_EMV) {
            z = true;
        }
        asqu.f89411g = z;
        bgm bgm = this.f89490f;
        if (bgm != null) {
            try {
                bft a = bgm.mo3115a();
                atcg.m75538a(a);
                this.f89491g.f89414j = a.f3129a;
            } catch (atcf e) {
                bnsl bnsl = (bnsl) f89485b.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("asre", "c", 258, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error closing amex token");
                asqu asqu2 = this.f89491g;
                String valueOf = String.valueOf(e.f90078a.f3136e);
                asqu2.f89405a = valueOf.length() == 0 ? new String("Status: ") : "Status: ".concat(valueOf);
            } finally {
                atcg.m75539a(this.f89490f);
                this.f89490f = null;
            }
        } else {
            this.f89486a = null;
        }
    }

    /* renamed from: d */
    public final List mo49389d() {
        ArrayList arrayList = new ArrayList();
        try {
            for (assu assu : assu.m74713a(this.f89488d).mo49448c().mo49438a(165, 48908).mo49448c().mo49440b()) {
                if (assu.f89619b != 97) {
                    bnsl bnsl = (bnsl) f89485b.mo68388c();
                    bnsl.mo68432a("asre", "d", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("PPSE response not correct: %s", asti.m74760a(this.f89488d));
                } else {
                    try {
                        arrayList.add(assu.mo49448c());
                    } catch (assx e) {
                        bnsl bnsl2 = (bnsl) f89485b.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("asre", "d", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("PPSE response not correct TLV: %s", asti.m74760a(this.f89488d));
                    }
                }
            }
        } catch (assv e2) {
            bnsl bnsl3 = (bnsl) f89485b.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("asre", "d", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("PPSE response not correct TLV: %s", asti.m74760a(this.f89488d));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final int mo49390e() {
        return this.f89492h;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89487c;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89489e;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 2;
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        try {
            ArrayList arrayList = new ArrayList(2);
            for (assu assu : assu.m74713a(this.f89488d).mo49448c().mo49438a(165, 48908).mo49448c().mo49440b()) {
                if (assu.f89619b == 97) {
                    arrayList.add(astc.m74747a(assu.mo49448c().mo49438a(79).mo49442h()));
                }
            }
            return (astc[]) arrayList.toArray(new astc[0]);
        } catch (assv e) {
            bnsl bnsl = (bnsl) f89485b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asre", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PPSE FCI malformed: %s", asti.m74760a(this.f89488d));
            return new astc[0];
        }
    }
}
