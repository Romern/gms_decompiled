package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Collections;
import java.util.List;

/* renamed from: faa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class faa extends fbv {

    /* renamed from: a */
    public fep f16136a;

    /* renamed from: b */
    public boolean f16137b;

    /* renamed from: c */
    public boolean f16138c;

    /* renamed from: d */
    private bsxn f16139d;

    public faa() {
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn = (bsxn) bsxl.f164949b;
        bsxn bsxn2 = bsxn.f147586d;
        bsxn.f147588a |= 1;
        bsxn.f147589b = 0;
        this.f16139d = (bsxn) bsxl.mo74062i();
    }

    /* renamed from: a */
    public static faa m11352a(bsxn bsxn) {
        return new faa(bsxn);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 3 && i2 == -1) {
            this.f16136a.mo10765e();
        }
        if (i == 13) {
            List d = soz.m35801d(getContext(), getContext().getPackageName());
            if (!d.isEmpty() && !stm.m36302d(((Account) d.get(0)).name)) {
                fep fep = this.f16136a;
                fep.f16405a.mo10681a(((Account) d.get(0)).name);
                fep.f16405a.mo10680a(fep.f16407c.mo10756b());
            }
        }
        if ((i == 6 || (cbro.m128204h() && i == 12)) && i2 == -1 && intent != null && intent.hasExtra("authAccount")) {
            String stringExtra = intent.getStringExtra("authAccount");
            fep fep2 = this.f16136a;
            if (!fep2.mo10763c().f16458a.equals(stringExtra)) {
                fep2.f16405a.mo10681a(stringExtra);
                fep2.f16405a.mo10680a(fep2.f16407c.mo10756b());
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ffg c = ((ffh) activity).mo6340c();
        fep fep = new fep(c.f16446a, c.f16447b, c.f16448c, c.f16453h);
        this.f16136a = fep;
        feo feo = fep.f16407c;
        C0052bk.m3245b(feo.f16404d, new fei(feo)).mo2445a(this, new ezs(this));
        feh feh = this.f16136a.f16406b;
        C0052bk.m3245b(feh.f16380d, new fea(feh)).mo2445a(this, new ezt(this));
        this.f16136a.f16406b.mo10750b().mo2445a(this, new ezu(this));
        this.f16136a.f16406b.f16381e.mo2445a(this, new ezv(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.as_main_fragment, viewGroup, false);
        if (bundle != null) {
            this.f16137b = bundle.getBoolean("outboundActivityStarted");
            this.f16138c = bundle.getBoolean("goBackOnResume");
        } else {
            feo feo = this.f16136a.f16407c;
            fel fel = (fel) feo.f16404d.mo2448b();
            fem fem = new fem(feo.f16401a.mo10686d(fel.f16388a), fel.f16389b, fel.f16390c, fel.f16391d);
            fby a = m11353a(fem);
            fbt.m11411a(a, fem.f16393b);
            fbt.m11410a(this, a, "inner", fbs.INSTANT);
        }
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f16136a.f16407c.f16402b.mo10739a().mo10789b();
    }

    public final void onResume() {
        super.onResume();
        if (!this.f16138c) {
            this.f16136a.f16407c.mo10757c();
            bsxn aU = mo10627a().mo10584aU();
            if (this.f16137b) {
                fcg fcg = this.f16136a.f16405a;
                fcg.f16263a.mo10452b(fcg.mo10683b());
                this.f16136a.mo10759a(aU);
                ffv a = this.f16136a.f16408d.mo10739a();
                bxvd da = bspa.f146461e.mo74144da();
                int i = aU.f147589b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspa bspa = (bspa) da.f164949b;
                bspa.f146463a |= 1;
                bspa.f146464b = i;
                int a2 = epu.m10944a(Collections.unmodifiableMap(aU.f147590c));
                if (a2 != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspa bspa2 = (bspa) da.f164949b;
                    bspa2.f146463a |= 4;
                    bspa2.f146465c = a2;
                }
                int b = epu.m10945b(Collections.unmodifiableMap(aU.f147590c));
                if (b != -1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bspa bspa3 = (bspa) da.f164949b;
                    bspa3.f146463a |= 8;
                    bspa3.f146466d = b;
                }
                bxvd da2 = bspq.f146567d.mo74144da();
                bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
                bxvd da3 = bsog.f146371f.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsog bsog = (bsog) da3.f164949b;
                bspa bspa4 = (bspa) da.mo74062i();
                bspa4.getClass();
                bsog.f146376d = bspa4;
                bsog.f146373a |= 4;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp = (bspp) bxvf.f164949b;
                bsog bsog2 = (bsog) da3.mo74062i();
                bsog2.getClass();
                bspp.f146565k = bsog2;
                bspp.f146555a |= 2048;
                bsof a3 = a.mo10784a();
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp2 = (bspp) bxvf.f164949b;
                a3.getClass();
                bspp2.f146562h = a3;
                bspp2.f146555a |= 64;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bspq bspq = (bspq) da2.f164949b;
                bspp bspp3 = (bspp) bxvf.mo74062i();
                bspp3.getClass();
                bspq.f146570b = bspp3;
                bspq.f146569a |= 1;
                a.mo10788a((bspq) da2.mo74062i());
                this.f16136a.mo10765e();
                this.f16137b = false;
            }
            this.f16136a.mo10762b(this.f16139d, aU);
            bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
            if (bsxl.f164950c) {
                bsxl.mo74035c();
                bsxl.f164950c = false;
            }
            bsxn bsxn = (bsxn) bsxl.f164949b;
            bsxn.f147588a |= 1;
            bsxn.f147589b = 0;
            this.f16139d = (bsxn) bsxl.mo74062i();
            return;
        }
        this.f16136a.mo10758a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("outboundActivityStarted", this.f16137b);
        bundle.putBoolean("goBackOnResume", this.f16138c);
    }

    /* renamed from: a */
    public static final fby m11353a(fem fem) {
        epq epq = fem.f16392a;
        bsxn bsxn = epq.f15491a.f147583d;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        bsul b = epq.mo10395b();
        bsxn h = epr.m10936h(b);
        if (h != null) {
            fcr a = fcr.m11488a(h);
            exf exf = new exf();
            exf.f15970b = fem;
            Bundle bundle = new Bundle();
            bundle.putByteArray("bottomNavKey", epr.m10927b(((fch) a).f16268a));
            exf.setArguments(bundle);
            return exf;
        } else if ((b.f147144a & 64) != 0) {
            return fbh.m11396a(ffa.m11580a(bsxn));
        } else {
            return ezm.m11332a(fdd.m11504a(epr.m10941m(b), epr.m10929c(b), epr.m10931d(b), epr.m10933e(b), epr.m10934f(b), epr.m10939k(b), epr.m10940l(b)), fem);
        }
    }

    public faa(bsxn bsxn) {
        this.f16139d = bsxn;
    }

    /* renamed from: a */
    public final fby mo10627a() {
        return (fby) getChildFragmentManager().findFragmentByTag("inner");
    }
}
