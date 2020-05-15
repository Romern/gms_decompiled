package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlifLayout extends bixl {

    /* renamed from: a */
    private boolean f151479a;

    /* renamed from: b */
    private ColorStateList f151480b;

    /* renamed from: g */
    public ColorStateList f151481g;

    /* renamed from: h */
    public boolean f151482h;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: a */
    private final void mo7880a() {
        int i;
        Drawable drawable;
        if (mo71345b((int) C0126R.C0129id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.f151480b;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.f151481g;
                i = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.f151479a) {
                drawable = new bizf(i);
            } else {
                drawable = new ColorDrawable(i);
            }
            ((biys) mo71342a(biys.class)).mo64891a(drawable);
        }
    }

    /* renamed from: b */
    private void m117812b(AttributeSet attributeSet, int i) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bizg.f122373g, i, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(4, false);
        if (!mo64840c()) {
            z = false;
        } else {
            z = z2;
        }
        this.f151482h = z;
        mo71343a(bjad.class, new bjad(this, attributeSet, i));
        mo71343a(bjae.class, new bjae(this, attributeSet, i));
        mo71343a(bjai.class, new bjai(this));
        bjas bjas = new bjas();
        mo71343a(bjas.class, bjas);
        View b = mo71345b((int) C0126R.C0129id.sud_scroll_view);
        ScrollView scrollView = b instanceof ScrollView ? (ScrollView) b : null;
        if (scrollView != null) {
            bjas.f122440b = new bjat(bjas, scrollView);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.f151481g = colorStateList;
            mo7880a();
            ((bjai) mo71342a(bjai.class)).mo64948a(colorStateList);
        }
        if (this.f151482h) {
            getRootView().setBackgroundColor(biyk.m102977a(getContext()).mo64868a(getContext(), biyj.CONFIG_LAYOUT_BACKGROUND_COLOR));
        }
        this.f151480b = obtainStyledAttributes.getColorStateList(0);
        mo7880a();
        this.f151479a = obtainStyledAttributes.getBoolean(1, true);
        mo7880a();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) mo71345b((int) C0126R.C0129id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void mo71365c(int i) {
        ((bjad) mo71342a(bjad.class)).mo64935a(i);
    }

    /* renamed from: e */
    public final TextView mo71366e() {
        return ((bjad) mo71342a(bjad.class)).mo64934a();
    }

    /* renamed from: f */
    public final CharSequence mo71367f() {
        TextView a = ((bjad) mo71342a(bjad.class)).mo64934a();
        if (a != null) {
            return a.getText();
        }
        return null;
    }

    /* renamed from: g */
    public final Drawable mo71368g() {
        ImageView a = ((bjae) mo71342a(bjae.class)).mo64938a();
        if (a != null) {
            return a.getDrawable();
        }
        return null;
    }

    /* renamed from: h */
    public final boolean mo71369h() {
        return ((bjai) mo71342a(bjai.class)).mo64950a();
    }

    /* renamed from: i */
    public final ProgressBar mo71370i() {
        return ((bjai) mo71342a(bjai.class)).mo64951b();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        TextView textView;
        ImageView imageView;
        int a;
        super.onFinishInflate();
        bjae bjae = (bjae) mo71342a(bjae.class);
        if (bjax.m103132a(bjae.f122406a) && (imageView = (ImageView) bjae.f122406a.mo71345b(C0126R.C0129id.sud_layout_icon)) != null && (a = bjax.m103131a(imageView.getContext())) != 0 && (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = a;
            imageView.setLayoutParams(layoutParams);
        }
        bjad bjad = (bjad) mo71342a(bjad.class);
        if (bjax.m103132a(bjad.f122405a)) {
            TextView textView2 = (TextView) bjad.f122405a.mo71345b(C0126R.C0129id.suc_layout_title);
            if (textView2 != null) {
                bjaz.m103133a(textView2, new bjay(biyj.CONFIG_HEADER_TEXT_COLOR, null, biyj.CONFIG_HEADER_TEXT_SIZE, biyj.CONFIG_HEADER_FONT_FAMILY, bjax.m103131a(textView2.getContext())));
            }
            LinearLayout linearLayout = (LinearLayout) bjad.f122405a.mo71345b(C0126R.C0129id.sud_layout_header);
            if (linearLayout != null) {
                Context context = linearLayout.getContext();
                linearLayout.setBackgroundColor(biyk.m102977a(context).mo64868a(context, biyj.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
            }
        }
        if (this.f151482h && (textView = (TextView) mo71345b((int) C0126R.C0129id.sud_layout_description)) != null) {
            bjaz.m103133a(textView, new bjay(biyj.CONFIG_DESCRIPTION_TEXT_COLOR, biyj.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, biyj.CONFIG_DESCRIPTION_TEXT_SIZE, biyj.CONFIG_DESCRIPTION_FONT_FAMILY, bjax.m103131a(textView.getContext())));
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.f151479a = true;
        this.f151482h = false;
        m117812b(null, C0126R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151479a = true;
        this.f151482h = false;
        m117812b(attributeSet, C0126R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f151479a = true;
        this.f151482h = false;
        m117812b(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo64837a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = C0126R.C0128layout.sud_glif_template;
        }
        return mo71341a(layoutInflater, 2132018260, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ViewGroup mo64838a(int i) {
        if (i == 0) {
            i = C0126R.C0129id.sud_layout_content;
        }
        return super.mo64838a(i);
    }

    /* renamed from: a */
    public final void mo71362a(Drawable drawable) {
        ImageView a = ((bjae) mo71342a(bjae.class)).mo64938a();
        if (a != null) {
            a.setImageDrawable(drawable);
            a.setVisibility(drawable != null ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo71363a(CharSequence charSequence) {
        ((bjad) mo71342a(bjad.class)).mo64937a(charSequence);
    }

    /* renamed from: b */
    public final void mo71364b(boolean z) {
        ((bjai) mo71342a(bjai.class)).mo64949a(z);
    }
}
