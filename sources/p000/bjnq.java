package p000;

import android.content.ContextWrapper;
import android.os.Build;
import android.webkit.CookieManager;
import java.util.Locale;

/* renamed from: bjnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnq extends bjjm implements bjnj, bjyh {

    /* renamed from: m */
    bjnk f123023m;

    public bjnq(bjgv bjgv) {
        super(bjgv, bjnn.class);
    }

    /* renamed from: E */
    public final void mo65299E() {
        ((bjnn) ((bjjm) this).f122830n).mo65256s();
    }

    /* renamed from: F */
    public final void mo65400F() {
        mo65169b("Server should already handle unsupported url.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo65303H() {
        int i = ((bjhu) ((bjnn) ((bjjm) this).f122830n)).f122751l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int i3 = ((bjhu) ((bjnn) ((bjjm) this).f122830n)).f122751l;
            int i4 = i3 - 1;
            if (i3 != 0) {
                objArr[0] = Integer.valueOf(i4);
                mo65169b(String.format(locale, "Unknown execution state: %s.", objArr));
                return;
            }
            throw null;
        } else if (i2 != 2) {
            if ((i2 == 3 || i2 == 4 || i2 == 5) && this.f122682g != null) {
                mo65192w();
            }
        } else if (mo65174h()) {
            mo65177j(this.f123023m);
        }
    }

    /* renamed from: a */
    public final void mo65401a(int i, String str) {
        ((bjnn) ((bjjm) this).f122830n).mo65256s();
    }

    /* renamed from: b */
    public final void mo65403b(String str, bjym bjym) {
        bjno bjno = (bjno) ((bjhy) ((bjnn) ((bjjm) this).f122830n)).f122754m;
        bjno.f123019d = str;
        if (bjym != null) {
            bjno.f123021f = bjym.mo65639a();
        }
        ((bjnn) ((bjjm) this).f122830n).mo65255r();
    }

    /* renamed from: f */
    public final void mo65404f(String str) {
        bjnn bjnn = (bjnn) ((bjjm) this).f122830n;
        ((bjno) ((bjhy) bjnn).f122754m).f123022g = str;
        bjnn.mo65255r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        if (((bjhu) ((bjnn) ((bjjm) this).f122830n)).f122751l == 3) {
            mo65177j(this.f123023m);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        if (this.f122682g != null) {
            mo65192w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        long j = bwxl2.f161386b;
        bjnn bjnn = (bjnn) ((bjjm) this).f122830n;
        bwsj bwsj = bjnn.f123018p;
        if ((bwsj.f160871a & 2) != 0) {
            ContextWrapper contextWrapper = this.f122676a.f122692a.f122732i;
            if (this.f123023m == null) {
                bjnk bjnk = new bjnk(contextWrapper);
                this.f123023m = bjnk;
                bjgw bjgw = (bjgw) this.f122676a.f122696e;
                if (bjgw.f122702e == null) {
                    bjgw.f122702e = new C1230nw();
                }
                bjxv bjxv = (bjxv) bjgw.f122702e.mo15535a(j, bjxv.m104861c());
                if (!bjgw.f122702e.mo15544d(j)) {
                    bjgw.f122702e.mo15540b(j, bjxv);
                }
                bjnk.setId(bjxv.mo65614a());
            }
            bjni bjni = new bjni(contextWrapper, this.f123023m, bwsj.f160874d, bwsj.f160875e, bwsj.f160876f);
            bjnk bjnk2 = this.f123023m;
            bjnk2.f123013f = this;
            bjnk2.f123008a = bjni;
            bjni.f123645l = bjnk2;
            bjni.f123642k = this;
            if ((bwsj.f160871a & 64) != 0) {
                int i = Build.VERSION.SDK_INT;
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f123023m, true);
            }
            if ((bwsj.f160871a & 32) != 0) {
                bjnk bjnk3 = this.f123023m;
                bjnk3.getSettings().setUserAgentString(bwsj.f160877g);
            }
            bjnk bjnk4 = this.f123023m;
            String str = bwsj.f160872b;
            String str2 = bwsj.f160873c;
            if (!bjnk4.f123012e) {
                bjnk4.f123009b = str;
                bjnk4.f123010c = str2;
                return;
            }
            bjnk4.mo65392a(str, str2);
            return;
        }
        bjnn.mo65256s();
    }

    /* renamed from: a */
    public final void mo65402a(String str, bjym bjym) {
        bjno bjno = (bjno) ((bjhy) ((bjnn) ((bjjm) this).f122830n)).f122754m;
        bjno.f123020e = str;
        if (bjym != null) {
            bjno.f123021f = bjym.mo65639a();
        }
        ((bjnn) ((bjjm) this).f122830n).mo65255r();
    }
}
