package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: aqur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqur implements View.OnClickListener {

    /* renamed from: a */
    public final boolean f86849a;

    /* renamed from: b */
    public aqul f86850b;

    /* renamed from: c */
    public final int f86851c;

    /* renamed from: d */
    private final BaseCardView f86852d;

    /* renamed from: e */
    private final boolean f86853e;

    /* renamed from: f */
    private final tim f86854f;

    /* renamed from: g */
    private View f86855g;

    public aqur(BaseCardView baseCardView, aqun aqun, aqul aqul, boolean z, boolean z2, int i, int i2, tim tim) {
        this.f86852d = baseCardView;
        this.f86853e = z2;
        this.f86851c = i2;
        boolean z3 = baseCardView.getResources().getBoolean(C0126R.bool.is_tablet);
        this.f86849a = z3;
        this.f86854f = tim;
        i = z3 ? (i + 1) / 2 : i;
        if (aqun != null) {
            ((ViewGroup) baseCardView.findViewById(C0126R.C0129id.card_content)).addView(aqun.f86844c);
        }
        if (aqul != null) {
            ((ViewGroup) baseCardView.findViewById(C0126R.C0129id.card_content)).addView(aqul.f86844c);
            this.f86850b = aqul;
        }
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) baseCardView.findViewById(C0126R.C0129id.card_content);
            View inflate = LayoutInflater.from(baseCardView.getContext()).inflate((int) C0126R.C0128layout.reporting_chain_warning, (ViewGroup) null);
            this.f86855g = inflate;
            C1334rs.m20107b((TextView) inflate.findViewById(C0126R.C0129id.warning_message), tey.m36888a(C1391tv.m20459b(baseCardView.getContext(), C0126R.C0127drawable.quantum_ic_error_vd_theme_24), C1133kh.m17843b(baseCardView.getContext(), C0126R.color.card_entry_light_text_color)), null, null, null);
            viewGroup.addView(this.f86855g, viewGroup.getChildCount());
        }
        if (z && aqul != null) {
            aqul.mo48137b();
            if (i > 3) {
                aqul.mo48160a(i);
                m72117b();
                return;
            }
            m72116a();
        }
    }

    /* renamed from: a */
    private final void m72116a() {
        View view;
        m72118c();
        if (this.f86853e && (view = this.f86855g) != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    private final void m72117b() {
        View view;
        m72118c();
        if (!this.f86850b.mo48162d() && this.f86853e && (view = this.f86855g) != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: c */
    private final void m72118c() {
        String str;
        if (this.f86850b.mo48162d()) {
            BaseCardView baseCardView = this.f86852d;
            if (this.f86850b.f86840a.size() - this.f86850b.f86841b >= this.f86852d.getContext().getResources().getInteger(C0126R.integer.reporting_chain_max_num_rows_to_expand_at_once)) {
                str = this.f86852d.getContext().getString(C0126R.string.reporting_chain_see_more, 20);
            } else {
                str = this.f86852d.getContext().getString(C0126R.string.reporting_chain_see_all, Integer.valueOf(this.f86851c));
            }
            baseCardView.mo59011a(str, (int) C0126R.C0127drawable.quantum_ic_expand_more_vd_theme_24, this);
            return;
        }
        this.f86852d.mo59012b(C0126R.string.profile_see_less, C0126R.C0127drawable.quantum_ic_expand_less_vd_theme_24, this);
    }

    public void onClick(View view) {
        if (this.f86850b.mo48162d()) {
            this.f86854f.mo26568a(tio.SEE_MORE_BUTTON, tio.REPORTING_CHAIN_CARD);
            this.f86850b.mo48136a();
            m72117b();
            return;
        }
        this.f86854f.mo26568a(tio.SEE_LESS_BUTTON, tio.REPORTING_CHAIN_CARD);
        this.f86850b.mo48137b();
        m72116a();
    }
}
