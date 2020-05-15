package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChipGroup extends bhjg {

    /* renamed from: a */
    public boolean f151156a;

    /* renamed from: b */
    public boolean f151157b;

    /* renamed from: c */
    public final bhgg f151158c;

    /* renamed from: d */
    public int f151159d;

    /* renamed from: e */
    public boolean f151160e;

    /* renamed from: j */
    private int f151161j;

    /* renamed from: k */
    private int f151162k;

    /* renamed from: l */
    private bhgi f151163l;

    public ChipGroup(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo71117a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f151160e = true;
            ((Chip) findViewById).setChecked(z);
            this.f151160e = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.chip.ChipGroup.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bhjg.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.material.chip.ChipGroup.a(int, boolean):void */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f151159d;
                if (i2 != -1 && this.f151156a) {
                    mo71117a(i2, false);
                }
                this.f151159d = chip.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof bhgh);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bhgh();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bhgh(getContext(), attributeSet);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.chip.ChipGroup.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bhjg.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.material.chip.ChipGroup.a(int, boolean):void */
    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f151159d;
        if (i != -1) {
            mo71117a(i, true);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1301qm a = C1301qm.m20017a(accessibilityNodeInfo);
        if (this.f118835h) {
            i = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) instanceof Chip) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        int i4 = this.f118836i;
        if (!this.f151156a) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        a.mo15756a(C1299qk.m20013a(i4, i, i2));
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f151163l.f118595a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.chipGroupStyle);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new bhgh(layoutParams);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.material.chip.ChipGroup, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019487), attributeSet, i);
        this.f151158c = new bhgg(this);
        this.f151163l = new bhgi(this);
        this.f151159d = -1;
        this.f151160e = false;
        TypedArray a = bhki.m101052a(getContext(), attributeSet, bhgj.f118598b, i, 2132019487, new int[0]);
        int dimensionPixelOffset = a.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = a.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.f151161j != dimensionPixelOffset2) {
            this.f151161j = dimensionPixelOffset2;
            this.f118834g = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = a.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.f151162k != dimensionPixelOffset3) {
            this.f151162k = dimensionPixelOffset3;
            this.f118833f = dimensionPixelOffset3;
            requestLayout();
        }
        this.f118835h = a.getBoolean(5, false);
        boolean z = a.getBoolean(6, false);
        if (this.f151156a != z) {
            this.f151156a = z;
            this.f151160e = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f151160e = false;
            this.f151159d = -1;
        }
        this.f151157b = a.getBoolean(4, false);
        int resourceId = a.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f151159d = resourceId;
        }
        a.recycle();
        super.setOnHierarchyChangeListener(this.f151163l);
        C1280ps.m19906b((View) this, 1);
    }
}
