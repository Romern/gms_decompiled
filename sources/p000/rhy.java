package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: rhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rhy extends acm {

    /* renamed from: s */
    final TextView f43005s;

    /* renamed from: t */
    final TextView f43006t;

    /* renamed from: u */
    final AccountParticleDisc f43007u;

    /* renamed from: v */
    final View f43008v;

    public rhy(View view, bdej bdej) {
        super(view);
        this.f43005s = (TextView) view.findViewById(C0126R.C0129id.selected_account_name);
        this.f43006t = (TextView) view.findViewById(C0126R.C0129id.selected_account_email);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) view.findViewById(C0126R.C0129id.account_particle_disc);
        this.f43007u = accountParticleDisc;
        accountParticleDisc.mo60576a(bdej, aczd.class);
        this.f43008v = view.findViewById(C0126R.C0129id.selected_account_container);
    }
}
