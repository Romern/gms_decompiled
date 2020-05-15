package p000;

import android.accounts.Account;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Arrays;
import java.util.List;

/* renamed from: ezm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ezm extends fcb {

    /* renamed from: a */
    public fde f16100a;

    /* renamed from: b */
    public eyu f16101b;

    /* renamed from: c */
    public View f16102c;

    /* renamed from: d */
    public View f16103d;

    /* renamed from: e */
    public final ezl f16104e = new ezl();

    /* renamed from: f */
    public AccountParticleDisc f16105f;

    /* renamed from: g */
    public eva f16106g;

    /* renamed from: h */
    public View.OnClickListener f16107h;

    /* renamed from: i */
    public String f16108i;

    /* renamed from: j */
    public List f16109j = bngx.m109376e();

    /* renamed from: k */
    public bsxn f16110k;

    /* renamed from: n */
    private fem f16111n;

    /* renamed from: o */
    private AppBarLayout f16112o;

    /* renamed from: a */
    public static ezm m11332a(fdd fdd, fem fem) {
        ezm ezm = new ezm();
        ezm.f16111n = fem;
        Bundle bundle = new Bundle();
        fcj fcj = (fcj) fdd;
        int i = fcj.f16276g;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("headerType", i2);
            bundle.putByteArray("welcomeHeaderKey", epr.m10930c(fcj.f16270a));
            bundle.putByteArray("overflowMenuKey", epr.m10930c(fcj.f16271b));
            bundle.putByteArray("helpItemTarget", epr.m10930c(fcj.f16272c));
            bundle.putByteArray("leafScreenHeader", epr.m10923a(fcj.f16273d));
            bundle.putBoolean("closeButton", fcj.f16274e);
            bundle.putBoolean("hasTopNav", fcj.f16275f);
            ezm.setArguments(bundle);
            return ezm;
        }
        throw null;
    }

    /* renamed from: c */
    public final fek mo10624c() {
        fek c = mo10556a().mo10624c();
        c.f16387c = this.f16101b.mo10597a();
        return c;
    }

    /* renamed from: d */
    public final void mo10625d() {
        Intent intent;
        if (cbro.f178167a.mo6606a().mo75284d()) {
            Account account = new Account(this.f16100a.mo10733b().f16458a, "com.google");
            res res = new res();
            res.mo24564a(Arrays.asList("com.google"));
            res.f42827e = "com.google.android.gms";
            res.f42823a = account;
            res.f42825c = getString(C0126R.string.common_choose_account);
            res.f42828f = 1001;
            res.mo24566c();
            intent = rew.m33488a(res.mo24563a());
        } else {
            intent = rew.m33486a(null, null, new String[]{"com.google"}, true, null, false, 1, 2, null, true);
            if (!intent.hasExtra("realClientPackage")) {
                intent.putExtra("realClientPackage", "com.google.android.gms");
            }
            acyp a = acyq.m50010a();
            a.mo33245a(bmxv.m108566b(1001));
            a.mo33246b(bmxv.m108566b(getContext().getResources().getString(C0126R.string.common_choose_account)));
            intent.putExtra("first_party_options_bundle", a.mo33244a().f61085a);
        }
        startActivityForResult(intent, 10);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f16106g = new eva(this.f16105f, ((evc) getActivity()).mo6337a());
        this.f16100a.f16310c.f16266d.mo2445a(this, new ezg(this));
        this.f16100a.f16310c.f16264b.mo2445a(this, new ezh(this));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("authAccount");
            fde fde = this.f16100a;
            fde.f16309b.mo10740a(fde.f16312e.mo10756b().f147589b, 0, 11);
            fde.f16311d.mo10747a();
            fde.f16310c.mo10681a(stringExtra);
            fde.f16310c.mo10680a(fde.f16312e.mo10756b());
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle arguments = getArguments();
        fdd a = fdd.m11504a(new int[]{1, 2, 3}[arguments.getInt("headerType", 2)], epr.m10925b(arguments.getByteArray("welcomeHeaderKey")), epr.m10925b(arguments.getByteArray("overflowMenuKey")), epr.m10925b(arguments.getByteArray("helpItemTarget")), epr.m10928c(arguments.getByteArray("leafScreenHeader")), arguments.getBoolean("closeButton"), arguments.getBoolean("hasTopNav"));
        ffg c = ((ffh) activity).mo6340c();
        fde fde = new fde(a, c.f16446a, c.f16447b, c.f16448c, c.f16453h);
        this.f16100a = fde;
        fde.f16313f.mo2445a(this, new eyv(this));
        this.f16100a.f16314g.mo2445a(this, new ezb(this));
        this.f16110k = ((fcj) this.f16100a.f16308a).f16272c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fby fby;
        boolean z = false;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate((int) C0126R.C0128layout.as_header_frame_fragment, viewGroup, false);
        this.f16112o = (AppBarLayout) coordinatorLayout.findViewById(C0126R.C0129id.appbar);
        eyu eyu = new eyu(getContext(), this.f16112o);
        this.f16101b = eyu;
        eyu.f16063q = new ezc(this);
        this.f16102c = coordinatorLayout.findViewById(C0126R.C0129id.fragment_container);
        this.f16105f = (AccountParticleDisc) coordinatorLayout.findViewById(C0126R.C0129id.account_particle_disc);
        this.f16101b.f16062p = new ezd(this, coordinatorLayout);
        if (((fcj) this.f16100a.f16308a).f16275f) {
            int i = Build.VERSION.SDK_INT;
            this.f16112o.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C0126R.anim.as_appbar_not_elevated));
        }
        if (bundle == null) {
            ezl ezl = this.f16104e;
            fem fem = this.f16111n;
            fek fek = fem.f16393b;
            if (fek == null || !fek.f16387c) {
                z = true;
            }
            ezl.f16095b = z;
            epq epq = fem.f16392a;
            bsxn bsxn = epq.f15491a.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            bsul b = epq.mo10395b();
            bsxn g = epr.m10935g(b);
            if (g != null) {
                fet a = fet.m11571a(g);
                fas fas = new fas(null);
                fas.f16171b = fem;
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("topNavKey", epr.m10927b(((fcm) a).f16281a));
                fas.setArguments(bundle2);
                fby = fas;
            } else if ((b.f147144a & 32) == 0) {
                fdy a2 = fdy.m11537a(bsxn);
                fby = new ezr();
                Bundle bundle3 = new Bundle();
                bundle3.putByteArray("screenKey", epr.m10927b(((fck) a2).f16277a));
                fby.setArguments(bundle3);
            } else {
                fby = eyl.m11293a(fcz.m11498a(bsxn));
            }
            if (mo10661e()) {
                fby.mo10660b(this.f16242m);
            }
            fbt.m11411a(fby, this.f16111n.f16393b);
            fbt.m11410a(this, fby, "inner", fbs.INSTANT);
        } else {
            this.f16104e.f16095b = bundle.getBoolean("headerWasExpanded", false);
        }
        return coordinatorLayout;
    }

    public final void onDetach() {
        this.f16101b.f16062p = null;
        super.onDetach();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        ActionMenuView actionMenuView;
        super.onPrepareOptionsMenu(menu);
        Toolbar toolbar = this.f16101b.f16057k;
        if (toolbar != null) {
            actionMenuView = (ActionMenuView) toolbar.findViewById(C0126R.C0129id.custom_menu);
        } else {
            actionMenuView = null;
        }
        if (actionMenuView != null) {
            Menu a = actionMenuView.mo1296a();
            a.clear();
            bsxn bsxn = this.f16110k;
            if (!(bsxn == null || bsxn.f147589b == 90000)) {
                MenuItem add = a.add((int) C0126R.string.common_list_apps_menu_help_and_feedback);
                add.setShowAsAction(1);
                add.setIcon((int) C0126R.C0127drawable.quantum_ic_help_outline_vd_theme_24);
                add.setOnMenuItemClickListener(new eze(this));
            }
            for (bsww bsww : this.f16109j) {
                MenuItem add2 = a.add(bsww.f147507b);
                if ((bsww.f147506a & 2) != 0) {
                    add2.setOnMenuItemClickListener(new ezf(this, bsww));
                }
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("headerWasExpanded", !this.f16101b.mo10598b() ? this.f16104e.f16095b : !this.f16101b.mo10597a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final fby mo10556a() {
        return (fby) getChildFragmentManager().findFragmentByTag("inner");
    }

    /* renamed from: a */
    public final void mo10623a(View view, View.OnClickListener onClickListener, String str) {
        boolean z;
        int i = 1;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
        if (onClickListener == null) {
            i = 2;
        }
        C1280ps.m19906b(view, i);
        if (z && !stm.m36302d(str)) {
            C1280ps.m19894a(view, new ezk(this, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.equals(mo10584aU()) == false) goto L_0x0021;
     */
    /* renamed from: a */
    public final void mo10557a(fem fem) {
        epq epq = fem.f16392a;
        if (mo10558a(epq)) {
            bsxk bsxk = epq.f15491a;
            if ((bsxk.f147580a & 1) != 0) {
                bsxn bsxn = bsxk.f147583d;
                if (bsxn == null) {
                    bsxn = bsxn.f147586d;
                }
            }
            eyu eyu = this.f16101b;
            eyt eyt = eyu.f16059m;
            if (eyt != null && eyt.f16046e) {
                eyu.f16048b.mo70969a(false);
            }
            mo10556a().mo10557a(fem);
        }
    }

    /* renamed from: a */
    public final boolean mo10558a(epq epq) {
        boolean z;
        bsul b = epq.mo10395b();
        fdd fdd = this.f16100a.f16308a;
        if ((b.f147144a & 64) == 0) {
            fcj fcj = (fcj) fdd;
            if (sdg.m34949a(epr.m10929c(b), fcj.f16270a) && epr.m10939k(b) == fcj.f16274e && epr.m10940l(b) == fcj.f16275f) {
                if (epr.m10935g(epq.mo10395b()) == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z == (mo10556a() instanceof fas)) {
                    return mo10556a().mo10558a(epq);
                }
            }
        }
        return false;
    }
}
