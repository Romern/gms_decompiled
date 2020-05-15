package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PagerTabContainer extends FrameLayout {

    /* renamed from: a */
    public final PagerTabLayout f7815a;

    /* renamed from: b */
    private final ImageView f7816b;

    /* renamed from: c */
    private final float f7817c;

    /* renamed from: d */
    private final float f7818d;

    /* renamed from: e */
    private boolean f7819e;

    /* renamed from: f */
    private int f7820f;

    public PagerTabContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo6361a(int i) {
        if (this.f7819e && getChildCount() > 0) {
            int measuredWidth = this.f7815a.getChildAt(0).getMeasuredWidth() - this.f7815a.getMeasuredWidth();
            float f = this.f7817c + this.f7818d;
            if (evi.m11187a(getContext())) {
                float f2 = (float) i;
                float f3 = (float) measuredWidth;
                if (f2 < f3 - this.f7817c) {
                    float f4 = f3 - f;
                    if (f2 < f4) {
                        this.f7816b.setAlpha(0.0f);
                        if (this.f7820f == 2) {
                            this.f7819e = false;
                            return;
                        }
                        return;
                    }
                    this.f7816b.setAlpha((f2 - f4) / this.f7818d);
                    return;
                }
                this.f7816b.setAlpha(1.0f);
                return;
            }
            float f5 = (float) i;
            if (f5 <= this.f7817c) {
                this.f7816b.setAlpha(1.0f);
            } else if (f5 > f) {
                this.f7816b.setAlpha(0.0f);
                if (this.f7820f == 2) {
                    this.f7819e = false;
                }
            } else {
                this.f7816b.setAlpha((f - f5) / this.f7818d);
            }
        } else {
            this.f7816b.setAlpha(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo6362b(int i) {
        this.f7819e = true;
        this.f7820f = i;
        mo6361a(this.f7815a.getScrollX());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f7815a.getChildAt(0) != null) {
            int paddingLeft = ((i3 - i) - getPaddingLeft()) - getLeftPaddingOffset();
            int measuredWidth = this.f7815a.getChildAt(0).getMeasuredWidth();
            if (measuredWidth < paddingLeft) {
                PagerTabLayout pagerTabLayout = this.f7815a;
                if (pagerTabLayout.f151268w != 1) {
                    pagerTabLayout.mo71228b(1);
                    this.f7815a.mo71231c(1);
                    ViewGroup.LayoutParams layoutParams = this.f7815a.getLayoutParams();
                    layoutParams.width = -1;
                    this.f7815a.setLayoutParams(layoutParams);
                    return;
                }
            }
            if (measuredWidth >= paddingLeft) {
                PagerTabLayout pagerTabLayout2 = this.f7815a;
                if (pagerTabLayout2.f151268w != 0) {
                    pagerTabLayout2.mo71228b(0);
                    this.f7815a.mo71231c(0);
                    ViewGroup.LayoutParams layoutParams2 = this.f7815a.getLayoutParams();
                    layoutParams2.width = -2;
                    this.f7815a.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public PagerTabContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerTabContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7818d = (float) getContext().getResources().getDimensionPixelSize(C0126R.dimen.as_tabs_overlay_fade_distance);
        float dimensionPixelSize = (float) getContext().getResources().getDimensionPixelSize(C0126R.dimen.as_tabs_horizontal_padding);
        this.f7817c = dimensionPixelSize + dimensionPixelSize;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.as_pager_tab_container, this);
        PagerTabLayout pagerTabLayout = (PagerTabLayout) findViewById(C0126R.C0129id.tab_layout);
        this.f7815a = pagerTabLayout;
        pagerTabLayout.f7822b = new fhl(this);
        if (cbro.m128208l()) {
            PagerTabLayout pagerTabLayout2 = this.f7815a;
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.colorOnSurfaceVariant, C0126R.attr.colorPrimaryGoogle});
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{color2, color});
            if (pagerTabLayout2.f151257l != colorStateList) {
                pagerTabLayout2.f151257l = colorStateList;
                int size = pagerTabLayout2.f151248c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bhnu) pagerTabLayout2.f151248c.get(i2)).mo64063b();
                }
            }
        }
        this.f7816b = (ImageView) findViewById(C0126R.C0129id.overlay_end);
    }
}
