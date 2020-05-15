package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.gms.wallet.common.ui.BottomSheetView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BottomSheetView extends FrameLayout implements View.OnLayoutChangeListener, awgb {

    /* renamed from: a */
    static int f110045a;

    /* renamed from: b */
    public static int f110046b;

    /* renamed from: c */
    public boolean f110047c = false;

    /* renamed from: d */
    public boolean f110048d = false;

    /* renamed from: e */
    boolean f110049e = false;

    /* renamed from: f */
    public double f110050f = 0.0d;

    /* renamed from: g */
    public FrameLayout f110051g;

    /* renamed from: h */
    public FocusedViewToTopScrollView f110052h;

    /* renamed from: i */
    public BottomSheetBehavior f110053i;

    /* renamed from: j */
    View f110054j;

    /* renamed from: k */
    public awgr f110055k;

    /* renamed from: l */
    public int f110056l = 1;

    public BottomSheetView(Context context) {
        super(context);
        m93879a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
     arg types: [android.content.res.XmlResourceParser, com.google.android.gms.wallet.common.ui.BottomSheetView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93879a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        int[] iArr = {16842801, C0126R.attr.bottomSheetCornerRadius};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, 16842801), -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.bottomSheetCornerRadius), 0);
        obtainStyledAttributes.recycle();
        f110045a = awia.m80003d(context).y;
        FocusedViewToTopScrollView focusedViewToTopScrollView = new FocusedViewToTopScrollView(context);
        this.f110052h = focusedViewToTopScrollView;
        focusedViewToTopScrollView.setId(C0126R.C0129id.content_scroll_view);
        this.f110052h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f110052h.setFillViewport(true);
        this.f110052h.mo71903a(true);
        FocusedViewToTopScrollView focusedViewToTopScrollView2 = this.f110052h;
        focusedViewToTopScrollView2.f151970r = this.f110049e;
        focusedViewToTopScrollView2.setVerticalScrollBarEnabled(false);
        this.f110052h.setHorizontalScrollBarEnabled(false);
        this.f110052h.setSmoothScrollingEnabled(false);
        addView(this.f110052h);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f110051g = frameLayout;
        frameLayout.setId(C0126R.C0129id.popover_content_holder);
        this.f110051g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f110051g.setBackgroundColor(color);
        this.f110052h.addView(this.f110051g);
        int i = Build.VERSION.SDK_INT;
        if (dimensionPixelSize > 0) {
            this.f110051g.setOutlineProvider(new awgm(this, dimensionPixelSize));
            this.f110051g.setClipToOutline(true);
        }
        View inflate = from.inflate((XmlPullParser) getResources().getLayout(C0126R.C0128layout.wallet_view_progress_spinner), (ViewGroup) this, false);
        this.f110054j = inflate;
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f110054j);
        addOnLayoutChangeListener(this);
    }

    /* renamed from: a */
    public final void mo59839a(boolean z) {
        this.f110049e = z;
        if (this.f110053i.f151099m == 3) {
            this.f110052h.f151970r = z;
        }
    }

    /* renamed from: b */
    public final void mo59840b() {
        this.f110053i.mo71025a(f110045a);
        this.f110053i.mo71035b(false);
        awgr awgr = this.f110055k;
        if (awgr != null) {
            awgr.mo52136v();
        }
        int i = Build.VERSION.SDK_INT;
        this.f110051g.setOutlineProvider(null);
        this.f110051g.setClipToOutline(false);
    }

    /* renamed from: c */
    public final void mo59842c() {
        this.f110054j.getLayoutParams().height = f110046b - getTop();
        this.f110054j.requestLayout();
    }

    /* renamed from: h */
    public final void mo52066h(Bundle bundle) {
        if (TextUtils.equals(awgc.m79889a(bundle), "verticallyCenterSpinner")) {
            mo59842c();
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        removeOnLayoutChangeListener(this);
        int height = getHeight();
        f110046b = height;
        if (!this.f110047c) {
            double d = this.f110050f;
            if (d != 0.0d) {
                BottomSheetBehavior bottomSheetBehavior = this.f110053i;
                double d2 = (double) height;
                Double.isNaN(d2);
                bottomSheetBehavior.mo71025a((int) (d2 * d));
            } else {
                this.f110053i.mo71025a(-1);
            }
        } else {
            this.f110053i.mo71025a(f110045a);
        }
        post(awgc.m79888a(this, "verticallyCenterSpinner"));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i = bundle.getInt("bottomSheetState");
            if (i == 3) {
                mo59838a();
            } else {
                this.f110053i.mo71037c(i);
            }
            this.f110056l = bphx.m111944a(bundle.getInt("popoverExitAction"));
            super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        if (!this.f110047c) {
            i = this.f110053i.f151099m;
        } else {
            i = 3;
        }
        bundle.putInt("bottomSheetState", i);
        int i2 = this.f110056l;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bundle.putInt("popoverExitAction", i3);
            return bundle;
        }
        throw null;
    }

    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93879a(context);
    }

    public BottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93879a(context);
    }

    /* renamed from: b */
    public final void mo59841b(boolean z) {
        this.f110052h.mo71903a(z);
    }

    /* renamed from: a */
    public final void mo59838a() {
        this.f110047c = true;
        this.f110052h.f151970r = this.f110049e;
        this.f110053i.mo71037c(3);
        mo59840b();
    }
}
