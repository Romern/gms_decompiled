package p000;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjre extends bjjm {

    /* renamed from: m */
    bxal f123167m;

    /* renamed from: o */
    final LinearLayout f123168o;

    /* renamed from: p */
    final ImageView f123169p;

    /* renamed from: q */
    final ImageView f123170q = ((ImageView) this.f123168o.findViewById(C0126R.C0129id.dropdown_selector_option_end_icon));

    /* renamed from: r */
    final TextView f123171r = ((TextView) this.f123168o.findViewById(C0126R.C0129id.dropdown_selector_option_text));

    public bjre(bjgv bjgv) {
        super(bjgv, bjrd.class);
        LinearLayout linearLayout = (LinearLayout) this.f122676a.f122692a.mo65227a().inflate((int) C0126R.C0128layout.wallet_view_drop_down_option, (ViewGroup) null);
        this.f123168o = linearLayout;
        this.f123169p = (ImageView) linearLayout.findViewById(C0126R.C0129id.dropdown_selector_option_start_icon);
    }

    /* renamed from: E */
    private final void m104421E() {
        bxak bxak = ((bjrd) ((bjjm) this).f122830n).f123166m;
        ImageLoader imageLoader = this.f122676a.f122692a.f122728e;
        ((NetworkImageView) this.f123169p).setImageUrl(null, imageLoader);
        ((NetworkImageView) this.f123170q).setImageUrl(null, imageLoader);
        if ((bxak.f161708a & 1) != 0) {
            ImageView imageView = this.f123169p;
            bwtd bwtd = bxak.f161709b;
            if (bwtd == null) {
                bwtd = bwtd.f160938d;
            }
            bwtg bwtg = this.f123167m.f161715a;
            if (bwtg == null) {
                bwtg = bwtg.f160954e;
            }
            bjrs.m104482a(imageView, bwtd, imageLoader, bwtg);
        }
        if ((bxak.f161708a & 2) != 0) {
            ImageView imageView2 = this.f123170q;
            bwtd bwtd2 = bxak.f161710c;
            if (bwtd2 == null) {
                bwtd2 = bwtd.f160938d;
            }
            bwtg bwtg2 = this.f123167m.f161716b;
            if (bwtg2 == null) {
                bwtg2 = bwtg.f160954e;
            }
            bjrs.m104482a(imageView2, bwtd2, imageLoader, bwtg2);
        }
        this.f123171r.setText(bxak.f161711d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104421E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bxal.f161713d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123167m = (bxal) b;
        m104421E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo65184p() {
        super.mo65184p();
        mo65177j(this.f123168o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo65185q() {
        super.mo65185q();
        mo65192w();
    }
}
