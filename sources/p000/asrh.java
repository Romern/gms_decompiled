package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: asrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrh implements asqs {

    /* renamed from: a */
    public static final srn f89508a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    final asrk f89509b;

    /* renamed from: c */
    public final byte[] f89510c;

    /* renamed from: d */
    public final asqu f89511d;

    /* renamed from: e */
    public boolean f89512e = false;

    /* renamed from: f */
    public boolean f89513f;

    /* renamed from: g */
    public boolean f89514g;

    /* renamed from: h */
    public int f89515h = 12;

    /* renamed from: i */
    public final casa f89516i;

    /* renamed from: j */
    private final asqq f89517j;

    /* renamed from: k */
    private final String f89518k;

    /* renamed from: l */
    private final caof f89519l;

    /* renamed from: m */
    private final int f89520m;

    public asrh(casa casa, caou caou, asqq asqq, int i, String str) {
        this.f89516i = casa;
        String c = cgxi.f187963a.mo6606a().mo84672c();
        ArrayList arrayList = new ArrayList();
        bnsl a = f89508a.mo26019b(aske.m74275a());
        a.mo68432a("asrh", "i", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Adding default PDOL tags with g services flag.: %s", c);
        try {
            for (Map.Entry entry : asrd.m74511a(asti.m74762a(c)).entrySet()) {
                arrayList.add(new caol(String.format("%02X", Integer.valueOf(((Integer) entry.getKey()).intValue())), ((Integer) entry.getValue()).intValue()));
            }
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f89508a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asrh", "i", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not decode gservices flag for adding additional PDOL");
        }
        asrk asrk = new asrk(asqq, caou, new asrg(this));
        this.f89509b = asrk;
        this.f89519l = caog.m126869a(casa, asrk, asrk, asrk, asrk, arrayList);
        this.f89511d = new asqu();
        this.f89510c = caou.mo49410c();
        this.f89517j = asqq;
        this.f89520m = i;
        this.f89518k = str;
        try {
            this.f89519l.mo74719a(this.f89509b, new caoe());
        } catch (capg e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        this.f89515h = 11;
        byte[] a = this.f89519l.mo74720a(bArr);
        if (!this.f89513f || !this.f89514g || this.f89520m < 0) {
            return astf.m74755a(a);
        }
        bnsl a2 = f89508a.mo26019b(aske.m74275a());
        a2.mo68432a("asrh", "a", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68409a("Velocity Check response on V2 terminal: %02x", this.f89520m);
        return astf.m74754a(this.f89520m);
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89511d;
    }

    /* renamed from: c */
    public final void mo49388c() {
    }

    /* renamed from: d */
    public final List mo49389d() {
        return asso.m74698a(this.f89516i.f175729b.mo74800d());
    }

    /* renamed from: e */
    public final int mo49390e() {
        return this.f89515h;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89517j;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89518k;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 0;
    }

    /* renamed from: i */
    public final ArrayList mo49407i() {
        String c = cgxi.f187963a.mo6606a().mo84672c();
        ArrayList arrayList = new ArrayList();
        bnsl a = f89508a.mo26019b(aske.m74275a());
        a.mo68432a("asrh", "i", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Adding default PDOL tags with g services flag.: %s", c);
        try {
            for (Map.Entry entry : asrd.m74511a(asti.m74762a(c)).entrySet()) {
                arrayList.add(new caol(String.format("%02X", Integer.valueOf(((Integer) entry.getKey()).intValue())), ((Integer) entry.getValue()).intValue()));
            }
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f89508a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asrh", "i", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not decode gservices flag for adding additional PDOL");
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo49406a(caqu caqu) {
        int i;
        String a = asrk.m74556a(caqu, this.f89516i);
        bnsl a2 = f89508a.mo26019b(aske.m74275a());
        a2.mo68432a("asrh", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68420a("Transaction id is: %s", a);
        if (a != null) {
            this.f89511d.f89414j = a;
        }
        int i2 = caqu.f175619f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 0:
                case 1:
                case 4:
                    i = -1;
                    break;
                case 2:
                case 3:
                    if (this.f89513f) {
                        i = 21;
                        break;
                    } else {
                        i = 19;
                        break;
                    }
                case 5:
                    i = 15;
                    break;
                case 6:
                    i = 26;
                    break;
                default:
                    i = 0;
                    break;
            }
            this.f89515h = i;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        casb casb = this.f89516i.f175729b;
        carz h = casb.mo74804h();
        if (h == null || h.f175726d == null) {
            return new astc[]{astc.m74747a(casb.mo74801e())};
        }
        return new astc[]{astc.m74747a(casb.mo74801e()), astc.m74747a(h.f175726d)};
    }
}
