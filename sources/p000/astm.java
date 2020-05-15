package p000;

import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.List;

/* renamed from: astm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astm implements astt {

    /* renamed from: c */
    private static final srn f89694c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: d */
    private static final asum[] f89695d = {new asus(), new asup(), new asul(), new astr()};

    /* renamed from: a */
    public final asqw f89696a;

    /* renamed from: e */
    private final asug f89697e;

    /* renamed from: f */
    private final List f89698f;

    /* renamed from: g */
    private final bnhe f89699g;

    public astm(asqw asqw, List list, bnhe bnhe) {
        this.f89696a = asqw;
        this.f89698f = list;
        this.f89699g = bnhe;
        this.f89697e = new asug(list);
    }

    /* renamed from: a */
    private final void m74767a(Context context) {
        if (m74772j() != null && mo49484g() != null) {
            m74772j().mo49388c();
            if (!mo49479b()) {
                bnsl a = f89694c.mo26019b(aske.m74275a());
                a.mo68432a("astm", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("closePaymentApplet: session not started");
                return;
            }
            asqw asqw = this.f89696a;
            new atbu(new askf(asqw.f89440d, asqw.f89441e, asqw.f89439c, context)).mo49791a(m74772j(), mo49484g());
            new atkm(context).mo50012a((String) null);
            asqu b = m74772j().mo49387b();
            this.f89696a.f89454r = m74772j().mo49390e();
            bnsl bnsl = (bnsl) f89694c.mo68388c();
            bnsl.mo68432a("astm", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Close payment session %s", this.f89696a.f89437a);
            bnsl a2 = f89694c.mo26019b(aske.m74275a());
            a2.mo68432a("astm", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68426a("closePaymentApplet isTransit: %b, failureReason: %d, isHVT: %b, cvm: %s", Boolean.valueOf(b.f89411g), Integer.valueOf(this.f89696a.f89454r), Boolean.valueOf(b.f89409e), b.f89410f);
            if (this.f89696a.f89454r == -1) {
                if (cgwn.m147265o()) {
                    astb.m74743d(this.f89696a.f89451o);
                } else {
                    astb.m74739b(this.f89696a.f89451o + 2000);
                }
                if (!b.f89411g) {
                    new atkm(context).mo50009a();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m74770h() {
        int b;
        if (this.f89696a.f89454r == 12 || this.f89696a.f89454r == 39) {
            bngx bngx = astt.f89714b;
            List list = this.f89696a.f89438b;
            int size = list.size();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i < size) {
                    try {
                        astc b2 = astc.m74748b(((asqt) list.get(i)).f89400a);
                        if (b2 != null) {
                            if (m74772j() != null && Arrays.asList(m74772j().mo49386a()).contains(b2)) {
                                bnsl bnsl = (bnsl) f89694c.mo68388c();
                                bnsl.mo68432a("astm", "i", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
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
                    this.f89696a.f89454r = 27;
                    this.f89696a.f89433J = 3;
                } else if (z2) {
                    this.f89696a.f89454r = 30;
                }
            }
        }
        if ((this.f89696a.f89454r == 19 || this.f89696a.f89454r == 21) && (b = bqcn.m112585b(cgxr.m147490c())) > 0) {
            bnsl a = f89694c.mo26019b(aske.m74275a());
            a.mo68432a("astm", "h", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68409a("onDeactivate: processing throttled for %ss", b);
            if (!cgwn.m147265o()) {
                astb.m74739b(this.f89696a.f89451o + ((long) (b * 1000)));
            }
        }
    }

    /* renamed from: i */
    private final void m74771i() {
        if (this.f89696a.f89454r == 12 || this.f89696a.f89454r == 39) {
            bngx bngx = astt.f89714b;
            List list = this.f89696a.f89438b;
            int size = list.size();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                try {
                    astc b = astc.m74748b(((asqt) list.get(i)).f89400a);
                    if (b == null) {
                        continue;
                    } else if (m74772j() != null && Arrays.asList(m74772j().mo49386a()).contains(b)) {
                        bnsl bnsl = (bnsl) f89694c.mo68388c();
                        bnsl.mo68432a("astm", "i", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
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
                this.f89696a.f89454r = 27;
                this.f89696a.f89433J = 3;
            } else if (z2) {
                this.f89696a.f89454r = 30;
            }
        }
    }

    /* renamed from: j */
    private final asqs m74772j() {
        asqr a = this.f89697e.mo49508a();
        if (a instanceof asqs) {
            return (asqs) a;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo49473a(long j) {
        this.f89696a.f89450n = j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ astt mo49477b(Context context, int i, long j) {
        this.f89696a.f89451o = j;
        m74770h();
        m74768a(context, i);
        asqw c = this.f89696a.mo49398c();
        if (m74772j() != null && (m74772j().mo49391f() instanceof aszu)) {
            ((aszu) m74772j().mo49391f()).f89926a = c;
        }
        return new astm(c, this.f89698f, this.f89699g);
    }

    /* renamed from: b */
    public final void mo49478b(long j) {
        this.f89696a.f89426C = j;
    }

    /* renamed from: c */
    public final boolean mo49480c() {
        return this.f89696a.f89426C > 0 && SystemClock.elapsedRealtime() >= this.f89696a.f89426C;
    }

    /* renamed from: d */
    public final String mo49481d() {
        if (mo49484g() != null) {
            return mo49484g().f108340a;
        }
        return null;
    }

    /* renamed from: e */
    public final asqw mo49482e() {
        return this.f89696a;
    }

    /* renamed from: f */
    public final asqq mo49483f() {
        if (m74772j() != null) {
            return m74772j().mo49391f();
        }
        return null;
    }

    /* renamed from: g */
    public final CardInfo mo49484g() {
        if (m74772j() != null) {
            return (CardInfo) this.f89699g.get(m74772j().mo49392g());
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo49479b() {
        return this.f89696a.mo49396a();
    }

    /* renamed from: a */
    private final void m74768a(Context context, int i) {
        m74769a(new astk(this, context, i));
    }

    /* renamed from: a */
    private static void m74769a(astl astl) {
        asum[] asumArr = f89695d;
        int length = asumArr.length;
        for (int i = 0; i < 4; i++) {
            try {
                astl.mo49472a(asumArr[i]);
            } catch (RuntimeException e) {
            }
        }
    }

    /* renamed from: a */
    public final void mo49474a(Context context, int i, long j) {
        this.f89696a.f89451o = j;
        if (!(m74772j() == null || mo49484g() == null)) {
            m74772j().mo49388c();
            if (!mo49479b()) {
                bnsl a = f89694c.mo26019b(aske.m74275a());
                a.mo68432a("astm", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a.mo68405a("closePaymentApplet: session not started");
            } else {
                asqw asqw = this.f89696a;
                new atbu(new askf(asqw.f89440d, asqw.f89441e, asqw.f89439c, context)).mo49791a(m74772j(), mo49484g());
                new atkm(context).mo50012a((String) null);
                asqu b = m74772j().mo49387b();
                this.f89696a.f89454r = m74772j().mo49390e();
                bnsl bnsl = (bnsl) f89694c.mo68388c();
                bnsl.mo68432a("astm", "a", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Close payment session %s", this.f89696a.f89437a);
                bnsl a2 = f89694c.mo26019b(aske.m74275a());
                a2.mo68432a("astm", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a2.mo68426a("closePaymentApplet isTransit: %b, failureReason: %d, isHVT: %b, cvm: %s", Boolean.valueOf(b.f89411g), Integer.valueOf(this.f89696a.f89454r), Boolean.valueOf(b.f89409e), b.f89410f);
                if (this.f89696a.f89454r == -1) {
                    if (cgwn.m147265o()) {
                        astb.m74743d(this.f89696a.f89451o);
                    } else {
                        astb.m74739b(this.f89696a.f89451o + 2000);
                    }
                    if (!b.f89411g) {
                        new atkm(context).mo50009a();
                    }
                }
            }
        }
        m74770h();
        m74768a(context, i);
    }

    /* renamed from: a */
    public final void mo49475a(Context context, byte[] bArr, long j, asud asud) {
        astf astf;
        bnsl a = f89694c.mo26019b(aske.m74275a());
        a.mo68432a("astm", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Processing command APDU: %s", asti.m74760a(bArr));
        asqw asqw = this.f89696a;
        if (asqw.f89427D <= 0 || asqw.mo49399d() < this.f89696a.f89427D) {
            astf = this.f89697e.mo49509a(bArr);
        } else {
            astf = astf.m74754a(0);
        }
        int i = astf.f89655a;
        if (i != 0) {
            asud.sendResponseApdu(astf.mo49462b());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        bnsl a2 = f89694c.mo26019b(aske.m74275a());
        a2.mo68432a("astm", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a2.mo68416a("Sent response APDU in %s ms with status %04x", elapsedRealtime, i);
        asqt asqt = new asqt(bArr, astf, j, elapsedRealtime);
        this.f89696a.mo49395a(asqt);
        if (m74772j() != null) {
            this.f89696a.f89454r = m74772j().mo49390e();
            this.f89696a.f89457u = mo49484g();
            this.f89696a.f89456t = m74772j().mo49387b();
        }
        this.f89697e.mo49508a();
        m74769a(new astj(this, context, asqt));
        if (cgwn.m147256f() && m74772j() != null && mo49484g() != null && !mo49476a()) {
            new atkm(context).mo50012a(mo49484g().f108340a);
        }
    }

    /* renamed from: a */
    public final boolean mo49476a() {
        if (m74772j() != null) {
            return m74772j().mo49390e() == 12;
        }
        for (asqr asqr : this.f89698f) {
            if (asqr instanceof asqs) {
                return true;
            }
        }
        return false;
    }
}
