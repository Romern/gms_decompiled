package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhoh extends bhov {

    /* renamed from: a */
    public final TextWatcher f119189a = new bhnz(this);

    /* renamed from: b */
    private final bhpm f119190b = new bhob(this);

    /* renamed from: c */
    private AnimatorSet f119191c;

    /* renamed from: d */
    private ValueAnimator f119192d;

    public bhoh(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private final ValueAnimator m101233a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(bhdl.f118327a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new bhof(this));
        return ofFloat;
    }

    /* renamed from: b */
    public final void mo64084b(boolean z) {
        boolean f = this.f119220k.mo71288f();
        if (z) {
            this.f119192d.cancel();
            this.f119191c.start();
            if (f) {
                this.f119191c.end();
                return;
            }
            return;
        }
        this.f119191c.cancel();
        this.f119192d.start();
        if (!f) {
            this.f119192d.end();
        }
    }

    /* renamed from: a */
    public static boolean m101234a(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: a */
    public final void mo64082a() {
        this.f119220k.mo71271c(C1391tv.m20459b(this.f119221l, C0126R.C0127drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f119220k;
        textInputLayout.mo71284e(textInputLayout.getResources().getText(C0126R.string.clear_text_end_icon_content_description));
        this.f119220k.mo71255a(new bhoc(this));
        this.f119220k.mo71258a(this.f119190b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(bhdl.f118330d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new bhog(this));
        ValueAnimator a = m101233a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f119191c = animatorSet;
        animatorSet.playTogether(ofFloat, a);
        this.f119191c.addListener(new bhod(this));
        ValueAnimator a2 = m101233a(1.0f, 0.0f);
        this.f119192d = a2;
        a2.addListener(new bhoe(this));
    }

    /* renamed from: a */
    public final void mo64083a(boolean z) {
        if (this.f119220k.f151334h != null) {
            mo64084b(z);
        }
    }
}
