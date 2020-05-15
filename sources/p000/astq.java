package p000;

import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.Arrays;
import java.util.List;

/* renamed from: astq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astq implements astt {

    /* renamed from: c */
    private static final srn f89706c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: d */
    private static final asum[] f89707d = {new asus(), new asup(), new asul(), new astr()};

    /* renamed from: a */
    public final asqw f89708a;

    /* renamed from: e */
    private final asug f89709e;

    /* renamed from: f */
    private final List f89710f;

    /* renamed from: g */
    private final asqs f89711g;

    /* renamed from: h */
    private final CardInfo f89712h;

    public astq(asqw asqw, List list, asqs asqs, CardInfo cardInfo) {
        this.f89708a = asqw;
        this.f89710f = list;
        this.f89711g = asqs;
        this.f89712h = cardInfo;
        this.f89709e = new asug(list);
    }

    /* renamed from: a */
    private final void m74788a(Context context) {
        asqs asqs = this.f89711g;
        if (asqs != null && this.f89712h != null) {
            asqs.mo49388c();
            if (!mo49479b()) {
                bnsl a = f89706c.mo26019b(aske.m74275a());
                a.mo68432a("astq", "a", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("closePaymentApplet: session not started");
                return;
            }
            asqw asqw = this.f89708a;
            new atbu(new askf(asqw.f89440d, asqw.f89441e, asqw.f89439c, context)).mo49791a(this.f89711g, this.f89712h);
            new atkm(context).mo50012a((String) null);
            asqu b = this.f89711g.mo49387b();
            this.f89708a.f89454r = this.f89711g.mo49390e();
            bnsl bnsl = (bnsl) f89706c.mo68388c();
            bnsl.mo68432a("astq", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Close payment session %s", this.f89708a.f89437a);
            bnsl a2 = f89706c.mo26019b(aske.m74275a());
            a2.mo68432a("astq", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68426a("closePaymentApplet isTransit: %b, failureReason: %d, isHVT: %b, cvm: %s", Boolean.valueOf(b.f89411g), Integer.valueOf(this.f89708a.f89454r), Boolean.valueOf(b.f89409e), b.f89410f);
            if (this.f89708a.f89454r == -1) {
                if (cgwn.m147265o()) {
                    astb.m74743d(this.f89708a.f89451o);
                } else {
                    astb.m74739b(this.f89708a.f89451o + 2000);
                }
                if (!b.f89411g) {
                    new atkm(context).mo50009a();
                }
            }
        }
    }

    /* renamed from: g */
    private final void m74791g() {
        int b;
        if (this.f89711g != null && this.f89708a.f89454r == 12) {
            bngx bngx = astt.f89714b;
            List list = this.f89708a.f89438b;
            int size = list.size();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i < size) {
                    try {
                        astc b2 = astc.m74748b(((asqt) list.get(i)).f89400a);
                        if (b2 != null) {
                            if (Arrays.asList(this.f89711g.mo49386a()).contains(b2)) {
                                bnsl bnsl = (bnsl) f89706c.mo68388c();
                                bnsl.mo68432a("astq", "h", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Payment not started, but the applet %s was selected", b2);
                                break;
                            } else if (!b2.equals(astc.f89631a)) {
                                int size2 = bngx.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size2) {
                                        break;
                                    }
                                    int i3 = i2 + 1;
                                    if (b2.mo49454a((astc) bngx.get(i2))) {
                                        z = true;
                                        break;
                                    }
                                    i2 = i3;
                                }
                            } else {
                                z2 = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (RuntimeException e) {
                    }
                    i++;
                } else if (z) {
                    this.f89708a.f89454r = 27;
                    this.f89708a.f89433J = 3;
                } else if (z2) {
                    this.f89708a.f89454r = 30;
                }
            }
        }
        if ((this.f89708a.f89454r == 19 || this.f89708a.f89454r == 21) && (b = bqcn.m112585b(cgxr.m147490c())) > 0) {
            bnsl a = f89706c.mo26019b(aske.m74275a());
            a.mo68432a("astq", "g", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68409a("onDeactivate: processing throttled for %ss", b);
            if (!cgwn.m147265o()) {
                astb.m74739b(this.f89708a.f89451o + ((long) (b * 1000)));
            }
        }
    }

    /* renamed from: h */
    private final void m74792h() {
        if (this.f89711g != null && this.f89708a.f89454r == 12) {
            bngx bngx = astt.f89714b;
            List list = this.f89708a.f89438b;
            int size = list.size();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                try {
                    astc b = astc.m74748b(((asqt) list.get(i)).f89400a);
                    if (b == null) {
                        continue;
                    } else if (Arrays.asList(this.f89711g.mo49386a()).contains(b)) {
                        bnsl bnsl = (bnsl) f89706c.mo68388c();
                        bnsl.mo68432a("astq", "h", 269, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Payment not started, but the applet %s was selected", b);
                        return;
                    } else if (!b.equals(astc.f89631a)) {
                        int size2 = bngx.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size2) {
                                break;
                            }
                            int i3 = i2 + 1;
                            if (b.mo49454a((astc) bngx.get(i2))) {
                                z = true;
                                break;
                            }
                            i2 = i3;
                        }
                    } else {
                        z2 = true;
                    }
                } catch (RuntimeException e) {
                }
            }
            if (z) {
                this.f89708a.f89454r = 27;
                this.f89708a.f89433J = 3;
            } else if (z2) {
                this.f89708a.f89454r = 30;
            }
        }
    }

    /* renamed from: a */
    public final void mo49473a(long j) {
        this.f89708a.f89450n = j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ astt mo49477b(Context context, int i, long j) {
        this.f89708a.f89451o = j;
        m74791g();
        m74789a(context, i);
        asqw c = this.f89708a.mo49398c();
        asqs asqs = this.f89711g;
        if (asqs != null && (asqs.mo49391f() instanceof aszu)) {
            ((aszu) this.f89711g.mo49391f()).f89926a = c;
        }
        return new astq(c, this.f89710f, this.f89711g, this.f89712h);
    }

    /* renamed from: b */
    public final void mo49478b(long j) {
        this.f89708a.f89426C = j;
    }

    /* renamed from: c */
    public final boolean mo49480c() {
        return this.f89708a.f89426C > 0 && SystemClock.elapsedRealtime() >= this.f89708a.f89426C;
    }

    /* renamed from: d */
    public final String mo49481d() {
        CardInfo cardInfo = this.f89712h;
        if (cardInfo != null) {
            return cardInfo.f108340a;
        }
        return null;
    }

    /* renamed from: e */
    public final asqw mo49482e() {
        return this.f89708a;
    }

    /* renamed from: f */
    public final asqq mo49483f() {
        asqs asqs = this.f89711g;
        if (asqs != null) {
            return asqs.mo49391f();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo49479b() {
        return this.f89708a.mo49396a();
    }

    /* renamed from: a */
    private final void m74789a(Context context, int i) {
        m74790a(new asto(this, context, i));
    }

    /* renamed from: a */
    private static void m74790a(astp astp) {
        asum[] asumArr = f89707d;
        int length = asumArr.length;
        for (int i = 0; i < 4; i++) {
            try {
                astp.mo49485a(asumArr[i]);
            } catch (RuntimeException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo49474a(Context context, int i, long j) {
        this.f89708a.f89451o = j;
        asqs asqs = this.f89711g;
        if (!(asqs == null || this.f89712h == null)) {
            asqs.mo49388c();
            if (!mo49479b()) {
                bnsl a = f89706c.mo26019b(aske.m74275a());
                a.mo68432a("astq", "a", 196, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("closePaymentApplet: session not started");
            } else {
                asqw asqw = this.f89708a;
                new atbu(new askf(asqw.f89440d, asqw.f89441e, asqw.f89439c, context)).mo49791a(this.f89711g, this.f89712h);
                new atkm(context).mo50012a((String) null);
                asqu b = this.f89711g.mo49387b();
                this.f89708a.f89454r = this.f89711g.mo49390e();
                bnsl bnsl = (bnsl) f89706c.mo68388c();
                bnsl.mo68432a("astq", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Close payment session %s", this.f89708a.f89437a);
                bnsl a2 = f89706c.mo26019b(aske.m74275a());
                a2.mo68432a("astq", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a2.mo68426a("closePaymentApplet isTransit: %b, failureReason: %d, isHVT: %b, cvm: %s", Boolean.valueOf(b.f89411g), Integer.valueOf(this.f89708a.f89454r), Boolean.valueOf(b.f89409e), b.f89410f);
                if (this.f89708a.f89454r == -1) {
                    if (cgwn.m147265o()) {
                        astb.m74743d(this.f89708a.f89451o);
                    } else {
                        astb.m74739b(this.f89708a.f89451o + 2000);
                    }
                    if (!b.f89411g) {
                        new atkm(context).mo50009a();
                    }
                }
            }
        }
        m74791g();
        m74789a(context, i);
    }

    /* renamed from: a */
    public final void mo49475a(Context context, byte[] bArr, long j, asud asud) {
        astf astf;
        bnsl a = f89706c.mo26019b(aske.m74275a());
        a.mo68432a("astq", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Processing command APDU: %s", asti.m74760a(bArr));
        asqw asqw = this.f89708a;
        if (asqw.f89427D <= 0 || asqw.mo49399d() < this.f89708a.f89427D) {
            astf = this.f89709e.mo49509a(bArr);
        } else {
            astf = astf.m74754a(0);
        }
        int i = astf.f89655a;
        if (i != 0) {
            asud.sendResponseApdu(astf.mo49462b());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        bnsl a2 = f89706c.mo26019b(aske.m74275a());
        a2.mo68432a("astq", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68416a("Sent response APDU in %s ms with status %04x", elapsedRealtime, i);
        asqt asqt = new asqt(bArr, astf, j, elapsedRealtime);
        this.f89708a.mo49395a(asqt);
        asqs asqs = this.f89711g;
        if (asqs != null) {
            this.f89708a.f89454r = asqs.mo49390e();
        }
        this.f89709e.mo49508a();
        m74790a(new astn(this, context, asqt));
        if (cgwn.m147256f() && this.f89711g != null && this.f89712h != null && !mo49476a()) {
            new atkm(context).mo50012a(this.f89712h.f108340a);
        }
    }

    /* renamed from: a */
    public final boolean mo49476a() {
        asqs asqs = this.f89711g;
        return asqs != null && asqs.mo49390e() == 12;
    }
}
