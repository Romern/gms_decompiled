package p000;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import java.util.regex.Pattern;

/* renamed from: axbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbm extends axbs {

    /* renamed from: t */
    private static final Pattern f95695t = Pattern.compile("[  •]+");

    /* renamed from: a */
    LinearLayout f95696a;

    public axbm(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52986a(Context context) {
        super.mo52986a(context);
        this.f95696a = (LinearLayout) findViewById(C0126R.C0129id.end_icons_holder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bmno mo52984c() {
        bmno bmno = ((bmgk) this.f124136q).f129256j;
        return bmno == null ? bmno.f130138m : bmno;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo52985d() {
        bmgk bmgk = (bmgk) this.f124136q;
        if ((bmgk.f129247a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return false;
        }
        bmno bmno = bmgk.f129256j;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        if (!bmno.f130142c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void setEnabled(boolean z) {
        boolean z2 = false;
        if (z && awia.m80002c((bmgk) this.f124136q)) {
            z2 = true;
        }
        super.setEnabled(z2);
    }

    /* renamed from: a */
    public final void mo52987a(bmgk bmgk) {
        String str;
        super.mo52996a((bxxc) bmgk);
        setId(bqcr.m112590a(bmgk.f129248b));
        this.f95726d.setText(bmgk.f129251e);
        TextView textView = this.f95726d;
        if (((bmgk) this.f124136q).f129251e.isEmpty()) {
            str = ((bmgk) this.f124136q).f129251e;
        } else {
            str = f95695t.matcher(((bmgk) this.f124136q).f129251e).replaceAll("-");
        }
        textView.setContentDescription(str);
        if (bmgk.f129252f.size() > 0) {
            this.f95727e.setText(bkfr.m105555a(getResources(), bmgk.f129252f));
            this.f95728f.setText(bkfr.m105558a(bmgk.f129252f));
        }
        this.f95729g.setText(bmgk.f129253g);
        int childCount = this.f95696a.getChildCount();
        if (childCount > 1) {
            this.f95696a.removeViews(1, childCount - 1);
        }
        for (int size = bmgk.f129257k.size() - 1; size >= 0; size--) {
            LinearLayout linearLayout = this.f95696a;
            ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(getContext());
            imageWithCaptionView.mo71992a((bmno) bmgk.f129257k.get(size), awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) getResources().getDimension(C0126R.dimen.wallet_instrument_description_icon_height));
            C1260oz.m19823b(layoutParams, (int) getResources().getDimension(C0126R.dimen.wallet_margin_touchable));
            imageWithCaptionView.setAdjustViewBounds(true);
            linearLayout.addView(imageWithCaptionView, 1, layoutParams);
        }
        setEnabled(true);
    }

    /* renamed from: a */
    public final void mo52923a(String str) {
        super.mo52923a(str);
        int childCount = this.f95696a.getChildCount();
        for (int i = 1; i < childCount; i++) {
            this.f95696a.getChildAt(i).setTag(C0126R.C0129id.summary_expander_transition_name, str);
        }
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        boolean z3;
        int i;
        super.mo52924a(z, z2);
        int i2 = 0;
        if (!this.f124130k.isChecked()) {
            z3 = true;
        } else {
            z3 = z;
        }
        if (!z3) {
            i = 8;
        } else {
            i = 0;
        }
        if (((bmgk) this.f124136q).f129252f.size() > 0) {
            TextView textView = this.f95727e;
            if (z3) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            this.f95728f.setVisibility(i);
        }
        if (!((bmgk) this.f124136q).f129253g.isEmpty()) {
            this.f95729g.setVisibility(i);
        }
        int childCount = this.f95696a.getChildCount();
        for (int i3 = 1; i3 < childCount; i3++) {
            this.f95696a.getChildAt(i3).setVisibility(i);
        }
    }

    /* renamed from: a */
    public final boolean mo52925a() {
        return awia.m80002c((bmgk) this.f124136q);
    }
}
