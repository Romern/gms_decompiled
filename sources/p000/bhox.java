package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhox {

    /* renamed from: a */
    public final Context f119228a;

    /* renamed from: b */
    public final TextInputLayout f119229b;

    /* renamed from: c */
    public Animator f119230c;

    /* renamed from: d */
    public int f119231d;

    /* renamed from: e */
    public int f119232e;

    /* renamed from: f */
    public CharSequence f119233f;

    /* renamed from: g */
    public boolean f119234g;

    /* renamed from: h */
    public TextView f119235h;

    /* renamed from: i */
    public CharSequence f119236i;

    /* renamed from: j */
    public int f119237j;

    /* renamed from: k */
    public ColorStateList f119238k;

    /* renamed from: l */
    public CharSequence f119239l;

    /* renamed from: m */
    public boolean f119240m;

    /* renamed from: n */
    public TextView f119241n;

    /* renamed from: o */
    public int f119242o;

    /* renamed from: p */
    public ColorStateList f119243p;

    /* renamed from: q */
    private LinearLayout f119244q;

    /* renamed from: r */
    private int f119245r;

    /* renamed from: s */
    private FrameLayout f119246s;

    /* renamed from: t */
    private int f119247t;

    /* renamed from: u */
    private final float f119248u;

    public bhox(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f119228a = context;
        this.f119229b = textInputLayout;
        this.f119248u = (float) context.getResources().getDimensionPixelSize(C0126R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    private static final void m101256a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    static final boolean m101258c(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: d */
    private final TextView m101259d(int i) {
        if (i == 1) {
            return this.f119235h;
        }
        if (i != 2) {
            return null;
        }
        return this.f119241n;
    }

    /* renamed from: b */
    public final void mo64111b() {
        Animator animator = this.f119230c;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: e */
    public final int mo64117e() {
        TextView textView = this.f119235h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: a */
    private final void m101257a(List list, boolean z, TextView textView, int i, int i2, int i3) {
        float f;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 != i) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(bhdl.f118327a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f119248u, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(bhdl.f118330d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64112b(int i) {
        this.f119242o = i;
        TextView textView = this.f119241n;
        if (textView != null) {
            C1334rs.m20104a(textView, i);
        }
    }

    /* renamed from: c */
    public final void mo64115c() {
        EditText editText;
        LinearLayout linearLayout = this.f119244q;
        if (linearLayout != null && (editText = this.f119229b.f151297a) != null) {
            C1280ps.m19885a(linearLayout, C1280ps.m19925i(editText), 0, C1280ps.m19927j(this.f119229b.f151297a), 0);
        }
    }

    /* renamed from: d */
    public final boolean mo64116d() {
        if (this.f119232e != 1 || this.f119235h == null || TextUtils.isEmpty(this.f119233f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo64113b(ColorStateList colorStateList) {
        this.f119243p = colorStateList;
        TextView textView = this.f119241n;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: b */
    public final void mo64114b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f119244q != null) {
            if (!m101258c(i) || (frameLayout = this.f119246s) == null) {
                this.f119244q.removeView(textView);
            } else {
                int i2 = this.f119247t - 1;
                this.f119247t = i2;
                m101256a(frameLayout, i2);
                this.f119246s.removeView(textView);
            }
            int i3 = this.f119245r - 1;
            this.f119245r = i3;
            m101256a(this.f119244q, i3);
        }
    }

    /* renamed from: a */
    public final void mo64104a() {
        this.f119233f = null;
        mo64111b();
        if (this.f119231d == 1) {
            this.f119232e = (!this.f119240m || TextUtils.isEmpty(this.f119239l)) ? 0 : 2;
        }
        mo64106a(this.f119231d, this.f119232e, mo64110a(this.f119235h, (CharSequence) null));
    }

    /* renamed from: a */
    public final void mo64105a(int i) {
        this.f119237j = i;
        TextView textView = this.f119235h;
        if (textView != null) {
            this.f119229b.mo71256a(textView, i);
        }
    }

    /* renamed from: a */
    public final void mo64106a(int i, int i2, boolean z) {
        TextView d;
        TextView d2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f119230c = animatorSet;
                ArrayList arrayList = new ArrayList();
                m101257a(arrayList, this.f119240m, this.f119241n, 2, i, i2);
                m101257a(arrayList, this.f119234g, this.f119235h, 1, i, i2);
                bhdm.m100677a(animatorSet, arrayList);
                animatorSet.addListener(new bhow(this, i2, m101259d(i), i, m101259d(i2)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (d2 = m101259d(i2)) == null)) {
                    d2.setVisibility(0);
                    d2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (d = m101259d(i)) == null)) {
                    d.setVisibility(4);
                    if (i3 == 1) {
                        d.setText((CharSequence) null);
                    }
                }
                this.f119231d = i4;
            }
            this.f119229b.mo71268c();
            this.f119229b.mo71260a(z2);
            this.f119229b.mo71291h();
        }
    }

    /* renamed from: a */
    public final void mo64107a(ColorStateList colorStateList) {
        this.f119238k = colorStateList;
        TextView textView = this.f119235h;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: a */
    public final void mo64108a(TextView textView, int i) {
        if (this.f119244q == null && this.f119246s == null) {
            LinearLayout linearLayout = new LinearLayout(this.f119228a);
            this.f119244q = linearLayout;
            linearLayout.setOrientation(0);
            this.f119229b.addView(this.f119244q, -1, -2);
            this.f119246s = new FrameLayout(this.f119228a);
            this.f119244q.addView(this.f119246s, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f119229b.f151297a != null) {
                mo64115c();
            }
        }
        if (m101258c(i)) {
            this.f119246s.setVisibility(0);
            this.f119246s.addView(textView);
            this.f119247t++;
        } else {
            this.f119244q.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f119244q.setVisibility(0);
        this.f119245r++;
    }

    /* renamed from: a */
    public final void mo64109a(CharSequence charSequence) {
        this.f119236i = charSequence;
        TextView textView = this.f119235h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: a */
    public final boolean mo64110a(TextView textView, CharSequence charSequence) {
        if (!C1280ps.m19868C(this.f119229b) || !this.f119229b.isEnabled() || (this.f119232e == this.f119231d && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }
}
