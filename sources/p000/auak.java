package p000;

import android.view.View;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: auak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auak implements View.OnClickListener {

    /* renamed from: a */
    private final deu f91322a;

    /* renamed from: b */
    private final auaj f91323b;

    public auak(deu deu, Fragment fragment) {
        bmxy.m108601b(fragment instanceof auaj, "Fragment must implement TokenDeleter");
        this.f91322a = deu;
        this.f91323b = (auaj) fragment;
    }

    public void onClick(View view) {
        auao.m76657a(this.f91322a.getSupportFragmentManager(), this.f91323b, (CardInfo) view.getTag(), asjw.m74255a());
    }
}
