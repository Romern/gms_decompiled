package p000;

import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: aqup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqup implements View.OnClickListener {

    /* renamed from: a */
    public final BaseCardView f86845a;

    /* renamed from: b */
    public boolean f86846b;

    /* renamed from: c */
    public aqun f86847c;

    /* renamed from: d */
    private final aquo f86848d;

    public aqup(BaseCardView baseCardView, aqun aqun, aquo aquo, boolean z, boolean z2) {
        this.f86845a = baseCardView;
        this.f86847c = aqun;
        this.f86848d = aquo;
        ((ViewGroup) baseCardView.findViewById(C0126R.C0129id.card_content)).addView(aqun.f86844c);
        mo48168a(z, z2);
    }

    /* renamed from: b */
    private final void m72110b() {
        this.f86846b = false;
        this.f86845a.mo59012b(C0126R.string.profile_see_more, C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24, this);
        this.f86847c.mo48137b();
    }

    /* renamed from: a */
    public final void mo48167a() {
        this.f86846b = true;
        this.f86845a.mo59012b(C0126R.string.profile_see_less, C0126R.C0127drawable.quantum_ic_expand_less_vd_theme_24, this);
        this.f86847c.mo48136a();
    }

    public void onClick(View view) {
        if (this.f86846b) {
            this.f86848d.mo48140b();
            m72110b();
            return;
        }
        this.f86848d.mo48139a();
        mo48167a();
    }

    /* renamed from: a */
    public final void mo48168a(boolean z, boolean z2) {
        if (!z) {
            return;
        }
        if (!z2) {
            m72110b();
        } else {
            mo48167a();
        }
    }
}
