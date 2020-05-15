package com.google.android.wallet.p097ui.address;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: com.google.android.wallet.ui.address.DynamicAddressFieldsLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamicAddressFieldsLayout extends bken implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    View f151845a;

    /* renamed from: b */
    RelativeLayout f151846b;

    /* renamed from: c */
    public bkaj f151847c;

    /* renamed from: d */
    private ValueAnimator f151848d;

    /* renamed from: e */
    private ValueAnimator f151849e;

    /* renamed from: f */
    private ValueAnimator f151850f;

    /* renamed from: g */
    private int f151851g;

    /* renamed from: h */
    private ArrayList f151852h;

    /* renamed from: i */
    private boolean f151853i;

    /* renamed from: j */
    private SparseBooleanArray f151854j;

    /* renamed from: k */
    private final ArrayList f151855k;

    /* renamed from: l */
    private final ArrayList f151856l;

    public DynamicAddressFieldsLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m118373a(float f) {
        bkaj bkaj = this.f151847c;
        if (bkaj != null) {
            bkaf bkaf = (bkaf) bkaj;
            TextView textView = bkaf.f123775l;
            if (textView != null && textView.getVisibility() == 0) {
                bkaf.f123775l.setTranslationY(f);
            }
            View[] viewArr = bkaf.f123776m;
            for (View view : viewArr) {
                if (view.getVisibility() == 0) {
                    view.setTranslationY(f);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m118374b(int i) {
        int childCount = this.f151846b.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            this.f151846b.getChildAt(i2).setLayerType(i, null);
        }
    }

    /* renamed from: c */
    private final int m118375c() {
        return this.f151845a.getMeasuredHeight();
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        m118374b(0);
        this.f151850f.setStartDelay(0);
        int i = this.f151851g;
        int i2 = 8;
        if (i == 4) {
            this.f151851g = 2;
            int size = this.f151854j.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += this.f151854j.valueAt(i4) ^ true ? 1 : 0;
            }
            if (i3 != 0) {
                i2 = 4;
            }
            this.f151845a.setVisibility(i2);
        } else if (i == 3) {
            this.f151851g = 1;
            mo71809a(8);
        }
        ArrayList arrayList = this.f151852h;
        if (arrayList != null) {
            mo71811a(arrayList);
            this.f151852h = null;
        }
        int size2 = this.f151855k.size();
        for (int i5 = 0; i5 < size2; i5++) {
            mo71810a((View) this.f151855k.get(i5), (View) this.f151856l.get(i5));
        }
        this.f151855k.clear();
        this.f151856l.clear();
        if (this.f151853i && this.f151851g == 1) {
            this.f151853i = false;
            ValueAnimator valueAnimator = this.f151850f;
            ValueAnimator valueAnimator2 = this.f151848d;
            if (valueAnimator == valueAnimator2) {
                this.f151850f = this.f151849e;
            } else {
                this.f151850f = valueAnimator2;
            }
            mo71808a();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        m118374b(2);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int childCount = this.f151846b.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = this.f151846b.getChildAt(i);
            childAt.setAlpha(floatValue);
            childAt.setY(((float) childAt.getTop()) * floatValue);
        }
        float f = 1.0f - floatValue;
        this.f151845a.setAlpha(f);
        m118373a(f * ((float) (m118375c() - getMeasuredHeight())));
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f151845a = ((ViewStub) findViewById(C0126R.C0129id.progress_bar)).inflate();
        this.f151846b = (RelativeLayout) findViewById(C0126R.C0129id.dynamic_address_fields_container);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f);
        this.f151848d = ofFloat;
        ofFloat.addUpdateListener(this);
        this.f151848d.addListener(this);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f);
        this.f151849e = ofFloat2;
        ofFloat2.addUpdateListener(this);
        this.f151849e.addListener(this);
        this.f151850f = this.f151848d;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m118373a((1.0f - ((Float) this.f151850f.getAnimatedValue()).floatValue()) * ((float) (m118375c() - i2)));
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo71812b() {
        int i = this.f151851g;
        if (i == 2) {
            this.f151851g = 3;
            this.f151845a.setVisibility(0);
            this.f151850f.setFloatValues(1.0f, 0.0f);
            this.f151850f.setStartDelay(200);
            this.f151850f.setCurrentPlayTime(0);
            this.f151850f.start();
        } else if (i == 4) {
            this.f151851g = 3;
            this.f151850f.reverse();
        }
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f151851g = 1;
        this.f151855k = new ArrayList();
        this.f151856l = new ArrayList();
    }

    /* renamed from: a */
    public final void mo71808a() {
        int i = this.f151851g;
        if (i == 1) {
            mo71809a(0);
            this.f151851g = 4;
            this.f151850f.setFloatValues(0.0f, 1.0f);
            this.f151850f.start();
        } else if (i == 3) {
            this.f151853i = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71813b(ArrayList arrayList) {
        RelativeLayout relativeLayout = this.f151846b;
        relativeLayout.removeViews(1, relativeLayout.getChildCount() - 1);
        int size = arrayList.size();
        this.f151854j = new SparseBooleanArray(size);
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (i > 0) {
                bkfr.m105592b();
                layoutParams.addRule(3, ((View) arrayList.get(i - 1)).getId());
            }
            this.f151854j.put(view.getId(), view.getVisibility() != 0);
            this.f151846b.addView(view, layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71809a(int i) {
        int childCount = this.f151846b.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            View childAt = this.f151846b.getChildAt(i2);
            if (!this.f151854j.get(childAt.getId())) {
                childAt.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo71810a(View view, View view2) {
        int i = this.f151851g;
        if (i == 4 || i == 3) {
            this.f151855k.add(view);
            this.f151856l.add(view2);
            return;
        }
        int indexOfChild = this.f151846b.indexOfChild(view);
        if (indexOfChild < 0) {
            String valueOf = String.valueOf(view);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("oldView: ");
            sb.append(valueOf);
            sb.append(" is not present in the fields container");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f151846b.indexOfChild(view2) < 0) {
            if (indexOfChild > 1) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                bkfr.m105592b();
                layoutParams.addRule(3, this.f151846b.getChildAt(indexOfChild - 1).getId());
                view2.setLayoutParams(layoutParams);
                if (indexOfChild < this.f151846b.getChildCount() - 1) {
                    bkfr.m105592b();
                    ((RelativeLayout.LayoutParams) this.f151846b.getChildAt(indexOfChild + 1).getLayoutParams()).addRule(3, view2.getId());
                }
            }
            this.f151846b.removeViewAt(indexOfChild);
            this.f151846b.addView(view2, indexOfChild);
        } else {
            String valueOf2 = String.valueOf(view2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52);
            sb2.append("newView: ");
            sb2.append(valueOf2);
            sb2.append(" is already present in the fields container");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo71811a(ArrayList arrayList) {
        int i = this.f151851g;
        if (i == 1) {
            mo71813b(arrayList);
            mo71809a(8);
        } else if (i == 2) {
            mo71813b(arrayList);
        } else if (i == 3 || i == 4) {
            this.f151852h = arrayList;
            if (!this.f151855k.isEmpty()) {
                this.f151855k.clear();
                this.f151856l.clear();
            }
        }
    }
}
