package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: hei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hei extends acm {

    /* renamed from: s */
    final TextView f19593s;

    /* renamed from: t */
    final TextView f19594t;

    /* renamed from: u */
    final AccountParticleDisc f19595u;

    /* renamed from: v */
    final View f19596v;

    public hei(View view, bdej bdej) {
        super(view);
        this.f19593s = (TextView) view.findViewById(C0126R.C0129id.account_display_name);
        this.f19594t = (TextView) view.findViewById(C0126R.C0129id.account_name);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
        this.f19595u = accountParticleDisc;
        accountParticleDisc.mo60576a(bdej, hek.class);
        this.f19596v = view.findViewById(C0126R.C0129id.container);
    }
}
