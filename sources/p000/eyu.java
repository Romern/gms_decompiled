package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.view.AppBarBehavior;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;

/* renamed from: eyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eyu {

    /* renamed from: a */
    public final Context f16047a;

    /* renamed from: b */
    public final AppBarLayout f16048b;

    /* renamed from: c */
    public int f16049c = Integer.MAX_VALUE;

    /* renamed from: d */
    public ProductLockupView f16050d;

    /* renamed from: e */
    public View f16051e;

    /* renamed from: f */
    public View f16052f;

    /* renamed from: g */
    public TextView f16053g;

    /* renamed from: h */
    public TextView f16054h;

    /* renamed from: i */
    public TextView f16055i;

    /* renamed from: j */
    public Chip f16056j;

    /* renamed from: k */
    public Toolbar f16057k;

    /* renamed from: l */
    public View f16058l;

    /* renamed from: m */
    public eyt f16059m;

    /* renamed from: n */
    public boolean f16060n;

    /* renamed from: o */
    public bhdz f16061o;

    /* renamed from: p */
    public bhdz f16062p;

    /* renamed from: q */
    public View.OnClickListener f16063q;

    /* renamed from: r */
    public int f16064r;

    /* renamed from: s */
    public float f16065s;

    /* renamed from: t */
    public float f16066t;

    /* renamed from: u */
    public final int f16067u;

    /* renamed from: v */
    public int f16068v;

    public eyu(Context context, AppBarLayout appBarLayout) {
        this.f16047a = context;
        this.f16048b = appBarLayout;
        ((AppBarBehavior) ((aip) appBarLayout.getLayoutParams()).f596a).f7780a = this;
        this.f16067u = context.getResources().getDimensionPixelSize(C0126R.dimen.as_collapsed_avatar_touch_view_size);
    }

    /* renamed from: a */
    public static final void m11304a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final boolean mo10597a() {
        eyt eyt = this.f16059m;
        return eyt != null && (eyt == eyt.COMPACT || this.f16059m == eyt.EXPANDABLE_MINIMIZED);
    }

    /* renamed from: b */
    public final boolean mo10598b() {
        eyt eyt = this.f16059m;
        return eyt != null && eyt.f16046e;
    }

    /* renamed from: c */
    public final void mo10599c() {
        if (adyf.m51386a(eot.f15436a)) {
            this.f16050d.mo60465b(2);
        }
        this.f16050d.mo60463a(adyg.m51405b(this.f16047a, C0126R.attr.asProductNameColor, C0126R.color.google_grey700));
    }

    /* renamed from: d */
    public final void mo10600d() {
        if (this.f16059m != null) {
            this.f16057k.mo1681b((Drawable) null);
            this.f16057k.mo1678a((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public final void mo10593a(int i) {
        ActionMenuView actionMenuView = (ActionMenuView) this.f16057k.findViewById(C0126R.C0129id.custom_menu);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionMenuView.getLayoutParams();
        if (evi.m11187a(this.f16047a)) {
            layoutParams.setMargins(i, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, i, 0);
        }
        layoutParams.gravity = 0;
        actionMenuView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo10594a(View.OnClickListener onClickListener, int i, int i2) {
        if (this.f16059m != null) {
            this.f16057k.mo1690d(i);
            this.f16057k.mo1684c(i2);
            this.f16057k.mo1678a(onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo10595a(View view) {
        if (this.f16048b.findViewWithTag("toolbar_tag") != null) {
            AppBarLayout appBarLayout = this.f16048b;
            appBarLayout.removeView(appBarLayout.findViewWithTag("toolbar_tag"));
        }
        view.setTag("toolbar_tag");
        this.f16048b.addView(view, 0);
    }

    /* renamed from: a */
    public final void mo10596a(String str) {
        int i;
        Toolbar toolbar;
        ProductLockupView productLockupView = this.f16050d;
        if (this.f16068v == 1) {
            sre.m36087g(this.f16047a);
            i = 0;
        } else {
            i = 8;
        }
        productLockupView.setVisibility(i);
        if (this.f16068v == 2 && this.f16059m == eyt.COMPACT) {
            this.f16055i.setVisibility(0);
            this.f16055i.setAlpha(1.0f);
            this.f16055i.setText(str);
        }
        if (this.f16068v == 3 && (toolbar = this.f16057k) != null) {
            toolbar.mo1679a(str);
        }
    }
}
