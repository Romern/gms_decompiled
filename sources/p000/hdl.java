package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: hdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hdl extends hdo {

    /* renamed from: v */
    public static final /* synthetic */ int f19533v = 0;

    /* renamed from: s */
    final TextView f19534s;

    /* renamed from: t */
    final TextView f19535t;

    /* renamed from: u */
    final AccountParticleDisc f19536u;

    public hdl(View view, bdej bdej) {
        super(view);
        this.f19534s = (TextView) view.findViewById(C0126R.C0129id.account_display_name);
        this.f19535t = (TextView) view.findViewById(C0126R.C0129id.account_name);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
        this.f19536u = accountParticleDisc;
        accountParticleDisc.mo60576a(bdej, aczd.class);
    }

    /* renamed from: a */
    public final void mo12410a(aczd aczd, aczm aczm) {
        this.f19534s.setText(aczd.f61130d);
        this.f19535t.setText(aczd.f61129c);
        this.f19536u.mo60577a(aczd);
        this.f19540w.setOnClickListener(new hdk(aczm, aczd));
    }
}
