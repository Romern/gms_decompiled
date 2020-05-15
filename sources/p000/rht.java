package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: rht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rht extends acm {

    /* renamed from: s */
    final TextView f42998s;

    /* renamed from: t */
    final TextView f42999t;

    /* renamed from: u */
    final AccountParticleDisc f43000u;

    /* renamed from: v */
    final View f43001v;

    public rht(View view, bdej bdej) {
        super(view);
        this.f42998s = (TextView) view.findViewById(C0126R.C0129id.account_display_name);
        this.f42999t = (TextView) view.findViewById(C0126R.C0129id.account_name);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.account_profile_picture);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
        this.f43000u = accountParticleDisc;
        accountParticleDisc.mo60576a(bdej, aczd.class);
        this.f43001v = view.findViewById(C0126R.C0129id.container);
    }
}
