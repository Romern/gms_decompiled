package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: atzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzt extends acm {

    /* renamed from: s */
    public final TextView f91299s;

    /* renamed from: t */
    public final AccountParticleDisc f91300t;

    public atzt(View view, View.OnClickListener onClickListener) {
        super(view);
        this.f91299s = (TextView) view.findViewById(C0126R.C0129id.AccountName);
        this.f91300t = (AccountParticleDisc) view.findViewById(C0126R.C0129id.Avatar);
        bqgj a = snp.m35702a(9);
        bdej bdej = new bdej(a);
        this.f91300t.mo60576a(bdej, bddo.class);
        Context context = this.f91300t.getContext();
        bddp bddp = new bddp();
        Context context2 = this.f91300t.getContext();
        allp a2 = allq.m61232a();
        a2.f73626a = 80;
        AccountParticleDisc.m94876a(context, bdej, a, bddp, new bddr(context2, a, a2.mo40491a()), bddo.class);
        view.setOnClickListener(onClickListener);
    }
}
