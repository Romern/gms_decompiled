package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.felicanetworks.mfc.C0126R;
import java.util.List;
import java.util.Locale;

/* renamed from: bkfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkfd extends LinearLayout implements bkfc {

    /* renamed from: k */
    public RadioButton f124130k;

    /* renamed from: l */
    public ImageView f124131l;

    /* renamed from: m */
    public View f124132m;

    /* renamed from: n */
    public boolean f124133n = true;

    /* renamed from: o */
    public boolean f124134o = true;

    /* renamed from: p */
    protected bkfb f124135p;

    /* renamed from: q */
    public Object f124136q;

    /* renamed from: r */
    public long f124137r = 0;

    /* renamed from: s */
    public boolean f124138s = true;

    public bkfd(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo65945a(long j) {
        if (j != 0) {
            this.f124137r = j;
            return;
        }
        throw new IllegalStateException("Invalid UiReference set for option");
    }

    /* renamed from: a */
    public final void mo65939a(bkfb bkfb) {
        this.f124135p = bkfb;
    }

    /* renamed from: a */
    public boolean mo52925a() {
        return true;
    }

    /* renamed from: b */
    public final void mo65941b(boolean z, boolean z2) {
        RadioButton radioButton = this.f124130k;
        if (radioButton != null) {
            radioButton.setChecked(z);
            this.f124130k.invalidate();
        }
        if (z && z2) {
            bkfr.m105567a(this, mo52926b());
        }
    }

    /* renamed from: e */
    public final boolean mo65942e() {
        return this.f124134o;
    }

    /* renamed from: f */
    public final Object mo65943f() {
        return this.f124136q;
    }

    /* renamed from: g */
    public final long mo65944g() {
        return this.f124137r;
    }

    /* renamed from: h */
    public final boolean mo65946h() {
        RadioButton radioButton = this.f124130k;
        return radioButton != null && radioButton.isChecked();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo65947i() {
        ImageView imageView = this.f124131l;
        if (imageView != null) {
            Drawable mutate = imageView.getDrawable().mutate();
            int i = Build.VERSION.SDK_INT;
            C1173lt.m19601a(mutate, bkfr.m105588b(getContext()));
            this.f124131l.setImageDrawable(mutate);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.f124134o = bundle.getBoolean("shownByDependencyGraph", true);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("shownByDependencyGraph", this.f124134o);
        return bundle;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) != null) {
                getChildAt(i).setEnabled(z);
                bkfr.m105608d(getChildAt(i), z);
            }
        }
    }

    public final void setVisibility(int i) {
        if (!this.f124134o) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public bkfd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public bkfd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            if (i2 != 11) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bmmb.m108166a(bmmv.f130058d);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                throw new IllegalStateException(String.format(locale, "Invalid resulting action type %s", objArr));
            } else if (this.f124134o) {
                this.f124134o = false;
                bkfb bkfb = this.f124135p;
                if (bkfb != null) {
                    bkfb.mo65938g();
                }
            }
        } else if (!this.f124134o) {
            this.f124134o = true;
            bkfb bkfb2 = this.f124135p;
            if (bkfb2 != null) {
                bkfb2.mo65938g();
            }
        }
    }

    public bkfd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo52923a(String str) {
        RadioButton radioButton = this.f124130k;
        if (radioButton != null) {
            radioButton.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        }
        ImageView imageView = this.f124131l;
        if (imageView != null) {
            imageView.setTag(C0126R.C0129id.summary_expander_transition_name, str);
        }
    }

    /* renamed from: a */
    public final void mo65940a(boolean z) {
        this.f124138s = z;
        ImageView imageView = this.f124131l;
        if (imageView != null) {
            imageView.setVisibility(!z ? 8 : 0);
        }
    }

    /* renamed from: a */
    public void mo52924a(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        int i = 0;
        if (z || !mo65946h()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ImageView imageView = this.f124131l;
        if (imageView != null) {
            int i2 = 4;
            if (!z3 && this.f124138s) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
        if (this.f124132m != null) {
            if (!this.f124133n) {
                if (!z) {
                    z4 = false;
                } else if (z2) {
                    z4 = false;
                }
            } else if (!z && !mo65946h()) {
                z4 = false;
            }
            View view = this.f124132m;
            if (!z4) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
