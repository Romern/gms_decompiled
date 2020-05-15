package p000;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: gxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gxt extends adcf {

    /* renamed from: a */
    public View f19186a;

    /* renamed from: b */
    public TextView f19187b;

    /* renamed from: c */
    public TextView f19188c;

    /* renamed from: d */
    public TextView f19189d;

    /* renamed from: e */
    public AccountParticleDisc f19190e;

    /* renamed from: f */
    public gzz f19191f;

    /* renamed from: g */
    public hel f19192g;

    /* renamed from: h */
    public hek f19193h;

    /* renamed from: i */
    public CountDownTimer f19194i;

    /* renamed from: j */
    public hix f19195j;

    /* renamed from: k */
    public long f19196k;

    /* renamed from: a */
    public final void mo12301a() {
        CountDownTimer countDownTimer = this.f19194i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19192g = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        this.f19191f = (gzz) adcj.m50161a(activity).mo3444a(gzz.class);
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        bqgj a = snp.m35702a(9);
        bdej bdej = new bdej(adap);
        this.f19190e.mo60576a(bdej, hek.class);
        heo heo = new heo(this.f19191f.f19317f);
        AccountParticleDisc.m94876a(getContext(), bdej, a, heo, heo, hek.class);
        this.f19191f.f19332u.mo2445a(this, new gxo(this));
        this.f19186a.getViewTreeObserver().addOnGlobalLayoutListener(new gxs(this));
        this.f19195j = new hix(this, this.f19191f.f19321j, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new C1416ut(getActivity(), (int) C0126R.style.AppBottomSheetDialogTheme)).inflate((int) C0126R.C0128layout.credentials_assisted_signin_confirmation, viewGroup, false);
        this.f19186a = inflate.findViewById(C0126R.C0129id.confirmation_container);
        this.f19187b = (TextView) inflate.findViewById(C0126R.C0129id.header_text);
        this.f19190e = (AccountParticleDisc) inflate.findViewById(C0126R.C0129id.account_particle_disc);
        this.f19188c = (TextView) inflate.findViewById(C0126R.C0129id.account_display_name);
        this.f19189d = (TextView) inflate.findViewById(C0126R.C0129id.account_name);
        inflate.findViewById(C0126R.C0129id.cancel_signin_button).setOnClickListener(new gxq(this));
        return inflate;
    }

    public final void onPause() {
        mo12301a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f19196k = SystemClock.elapsedRealtime();
        this.f19191f.f19335x.mo2445a(this, new gxp(this));
    }
}
