package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;

/* renamed from: bken */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bken extends RelativeLayout {

    /* renamed from: a */
    private final bkem f124092a;

    /* renamed from: b */
    private bjxv f124093b;

    public bken(Context context) {
        super(context);
        this.f124092a = new bkem(context, getViewTreeObserver());
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2;
        bkem bkem = this.f124092a;
        if (this.f124093b == null) {
            this.f124093b = bjxv.m104861c();
        }
        View a = bkem.mo65899a(view, this, this.f124093b);
        if (layoutParams == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
        }
        if (i > 1) {
            layoutParams2.addRule(3, getChildAt(i - 1).getId());
        } else if (i == -1 && getChildCount() > 1) {
            layoutParams2.addRule(3, getChildAt(getChildCount() - 1).getId());
        }
        a.setLayoutParams(layoutParams2);
        if (i < getChildCount() && i != -1) {
            ((RelativeLayout.LayoutParams) getChildAt(i).getLayoutParams()).addRule(3, a.getId());
        }
        super.addView(a, i, layoutParams2);
    }

    public final int indexOfChild(View view) {
        return super.indexOfChild(this.f124092a.mo65898a(view));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedState"));
        this.f124093b = bjxv.m104860b(bundle);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedState", super.onSaveInstanceState());
        bjxv bjxv = this.f124093b;
        if (bjxv != null) {
            bjxv.mo65615a(bundle);
        }
        return bundle;
    }

    public final void removeAllViews() {
        this.f124092a.mo65900a();
        super.removeAllViews();
    }

    public final void removeView(View view) {
        super.removeView(this.f124092a.mo65898a(view));
        this.f124092a.mo65901b(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        if (childAt instanceof MaterialFieldLayout) {
            this.f124092a.mo65901b(((MaterialFieldLayout) childAt).f152147b);
        }
        super.removeViewAt(i);
    }

    public bken(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f124092a = new bkem(context, getViewTreeObserver());
    }

    public bken(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f124092a = new bkem(context, getViewTreeObserver());
    }

    public bken(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f124092a = new bkem(context, getViewTreeObserver());
    }
}
