package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.easysignin.EasySignInChimeraActivity;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wbi implements wbl {

    /* renamed from: A */
    private final cijl f50408A;

    /* renamed from: B */
    private final cijl f50409B;

    /* renamed from: C */
    private final cijl f50410C;

    /* renamed from: D */
    private final cijl f50411D;

    /* renamed from: E */
    private final cijl f50412E;

    /* renamed from: F */
    private final cijl f50413F;

    /* renamed from: G */
    private final cijl f50414G;

    /* renamed from: H */
    private final cijl f50415H;

    /* renamed from: I */
    private final cijl f50416I;

    /* renamed from: a */
    public final cijl f50417a;

    /* renamed from: b */
    public final cazn f50418b;

    /* renamed from: c */
    public final cazn f50419c;

    /* renamed from: d */
    public final cazn f50420d;

    /* renamed from: e */
    public final cazn f50421e;

    /* renamed from: f */
    public final cazn f50422f;

    /* renamed from: g */
    public final cazn f50423g;

    /* renamed from: h */
    public final cazn f50424h;

    /* renamed from: i */
    public final cazn f50425i;

    /* renamed from: j */
    public final cazn f50426j;

    /* renamed from: k */
    public final cazn f50427k;

    /* renamed from: l */
    public final cazn f50428l;

    /* renamed from: m */
    public final cazn f50429m;

    /* renamed from: n */
    private final Activity f50430n;

    /* renamed from: o */
    private final cijl f50431o;

    /* renamed from: p */
    private final cijl f50432p;

    /* renamed from: q */
    private final cijl f50433q;

    /* renamed from: r */
    private final cijl f50434r;

    /* renamed from: s */
    private final cijl f50435s;

    /* renamed from: t */
    private final cijl f50436t;

    /* renamed from: u */
    private final cijl f50437u;

    /* renamed from: v */
    private final cijl f50438v = cayx.m127579a(wbx.f50474a);

    /* renamed from: w */
    private final cijl f50439w;

    /* renamed from: x */
    private final cijl f50440x;

    /* renamed from: y */
    private final cijl f50441y;

    /* renamed from: z */
    private final cijl f50442z;

    public wbi(Activity activity, Bundle bundle) {
        this.f50430n = activity;
        cayy a = cayz.m127582a(bundle);
        this.f50431o = a;
        this.f50417a = cayx.m127579a(new wcr(a));
        cayy a2 = cayz.m127582a(activity);
        this.f50432p = a2;
        wbv wbv = new wbv(a2);
        this.f50433q = wbv;
        this.f50434r = cayx.m127579a(new wbw(wbv));
        wco wco = new wco(this.f50432p);
        this.f50435s = wco;
        wdo wdo = new wdo(this.f50417a, this.f50432p, wco);
        this.f50436t = wdo;
        this.f50437u = cayx.m127579a(new wcj(this.f50417a, this.f50434r, wdo));
        cijl a3 = cayx.m127579a(wcm.f50495a);
        this.f50439w = a3;
        this.f50440x = new wbc(a3, this.f50432p);
        cijl a4 = cayx.m127579a(wcc.f50481a);
        this.f50441y = a4;
        wca wca = new wca(this.f50432p, this.f50417a, a4);
        this.f50442z = wca;
        wcb wcb = new wcb(this.f50432p, wca);
        this.f50408A = wcb;
        wcp wcp = new wcp(wcb, this.f50417a, this.f50432p);
        this.f50409B = wcp;
        wbq wbq = new wbq(this.f50438v, this.f50439w, this.f50434r, this.f50433q, this.f50432p, this.f50440x, this.f50417a, this.f50441y, wcp, this.f50435s);
        this.f50410C = wbq;
        this.f50411D = cayx.m127579a(new wch(this.f50432p, wbq, this.f50417a));
        wbz wbz = new wbz(this.f50432p);
        this.f50412E = wbz;
        this.f50413F = cayx.m127579a(new wci(this.f50437u, wbz));
        wce wce = new wce(this.f50417a, this.f50434r);
        this.f50414G = wce;
        this.f50418b = cbac.m127645a(wce);
        this.f50419c = cbac.m127645a(this.f50439w);
        this.f50420d = cbac.m127645a(this.f50434r);
        this.f50421e = cbac.m127645a(this.f50411D);
        this.f50422f = cbac.m127645a(this.f50438v);
        this.f50423g = cbac.m127645a(this.f50435s);
        this.f50424h = cbac.m127645a(this.f50437u);
        this.f50425i = cbac.m127645a(this.f50432p);
        this.f50426j = cbac.m127645a(this.f50436t);
        this.f50427k = cbac.m127645a(this.f50417a);
        wcf wcf = new wcf(this.f50432p);
        this.f50415H = wcf;
        this.f50428l = cbac.m127645a(wcf);
        wcg wcg = new wcg(this.f50432p);
        this.f50416I = wcg;
        this.f50429m = cbac.m127645a(wcg);
    }

    /* renamed from: e */
    private final boolean m41716e() {
        return wce.m41751a((bycs) this.f50417a.mo6445a(), (Account[]) this.f50434r.mo6445a()).mo66813a();
    }

    /* renamed from: a */
    public final int mo29022a() {
        boolean e = m41716e();
        bycs bycs = (bycs) this.f50417a.mo6445a();
        if (e) {
            return C0126R.style.EasySignInFrictionless;
        }
        int a = bycq.m124660a(bycs.f165683b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i != 1) {
            return i != 2 ? C0126R.style.EasySignInFullscreen : C0126R.style.EasySignInDialog;
        } else {
            return C0126R.style.EasySignInBottomSheet;
        }
    }

    /* renamed from: b */
    public final void mo29024b() {
        int i;
        Activity activity = this.f50430n;
        boolean e = m41716e();
        bycs bycs = (bycs) this.f50417a.mo6445a();
        if (!e) {
            int a = bycq.m124660a(bycs.f165683b);
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i2 != 1) {
                i = i2 != 2 ? C0126R.C0128layout.easy_sign_in_fullscreen_layout : C0126R.C0128layout.easy_sign_in_dialog_layout;
            } else {
                i = C0126R.C0128layout.easy_sign_in_bottom_sheet_layout;
            }
        } else {
            i = C0126R.C0128layout.easy_sign_in_empty_layout;
        }
        boolean e2 = m41716e();
        cijl cijl = this.f50411D;
        cijl cijl2 = this.f50409B;
        bycs bycs2 = (bycs) this.f50417a.mo6445a();
        bqgy bqgy = (bqgy) this.f50439w.mo6445a();
        activity.setContentView(i);
        if (!e2) {
            int a2 = bycq.m124660a(bycs2.f165683b);
            int i3 = a2 - 1;
            if (a2 != 0) {
                if ((i3 == 1 || i3 == 2) && bycs2.f165699r) {
                    activity.findViewById(C0126R.C0129id.touch_outside).setOnClickListener(new wbs(bqgy, bycs2));
                }
                cijl.mo6445a();
                ((wcp) cijl2).mo29041b();
                return;
            }
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo29025c() {
        Void voidR = (Void) this.f50413F.mo6445a();
    }

    /* renamed from: d */
    public final void mo29026d() {
        Activity activity = this.f50430n;
        wbu.m41737a(wcb.m41747a(activity, wca.m41744a(activity, (bycs) this.f50417a.mo6445a(), (AtomicReference) this.f50441y.mo6445a())), (bycs) this.f50417a.mo6445a(), this.f50430n);
    }

    /* renamed from: a */
    public final void mo29023a(EasySignInChimeraActivity easySignInChimeraActivity) {
        easySignInChimeraActivity.f31257b = (bycs) this.f50417a.mo6445a();
        easySignInChimeraActivity.f31258c = new wbm(this);
        Activity activity = this.f50430n;
        easySignInChimeraActivity.f31259d = new wdn((bycs) this.f50417a.mo6445a(), activity, wco.m41760a(activity));
        easySignInChimeraActivity.f31260e = (Account[]) this.f50434r.mo6445a();
        easySignInChimeraActivity.f31261f = (bxvd) this.f50437u.mo6445a();
    }
}
