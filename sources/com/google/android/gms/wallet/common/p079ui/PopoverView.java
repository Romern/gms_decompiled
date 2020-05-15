package com.google.android.gms.wallet.common.p079ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.common.ui.PopoverView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PopoverView extends FrameLayout {

    /* renamed from: A */
    public int f110087A = 0;

    /* renamed from: B */
    public ViewOutlineProvider f110088B;

    /* renamed from: C */
    public ViewOutlineProvider f110089C;

    /* renamed from: D */
    public boolean f110090D = true;

    /* renamed from: E */
    public int f110091E = 1;

    /* renamed from: F */
    private int f110092F;

    /* renamed from: G */
    private int f110093G;

    /* renamed from: H */
    private int f110094H;

    /* renamed from: a */
    public View f110095a;

    /* renamed from: b */
    public FrameLayout f110096b;

    /* renamed from: c */
    public FrameLayout f110097c;

    /* renamed from: d */
    LinearLayout f110098d;

    /* renamed from: e */
    public awhb f110099e;

    /* renamed from: f */
    public awgr f110100f;

    /* renamed from: g */
    public View f110101g;

    /* renamed from: h */
    public View f110102h;

    /* renamed from: i */
    public View f110103i;

    /* renamed from: j */
    public View f110104j;

    /* renamed from: k */
    public View f110105k;

    /* renamed from: l */
    public LinearLayout f110106l;

    /* renamed from: m */
    public int f110107m;

    /* renamed from: n */
    public boolean f110108n = true;

    /* renamed from: o */
    public int f110109o = 0;

    /* renamed from: p */
    public boolean f110110p;

    /* renamed from: q */
    public float f110111q = 0.0f;

    /* renamed from: r */
    public boolean f110112r = true;

    /* renamed from: s */
    public boolean f110113s = true;

    /* renamed from: t */
    public boolean f110114t = false;

    /* renamed from: u */
    public boolean f110115u = true;

    /* renamed from: v */
    public double f110116v;

    /* renamed from: w */
    public double f110117w;

    /* renamed from: x */
    public int f110118x = 0;

    /* renamed from: y */
    public int f110119y = 0;

    /* renamed from: z */
    public boolean f110120z = false;

    public PopoverView(Context context) {
        super(context);
        m93900a(context, (AttributeSet) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.gms.wallet.common.ui.PopoverView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93900a(Context context, AttributeSet attributeSet) {
        View view;
        Window window;
        LayoutInflater from = LayoutInflater.from(context);
        int i = awia.m80003d(context).y;
        this.f110116v = ((Double) awih.f94446g.mo58455c()).doubleValue();
        this.f110117w = ((Double) awih.f94447h.mo58455c()).doubleValue();
        int i2 = Build.VERSION.SDK_INT;
        boolean booleanValue = ((Boolean) awih.f94445f.mo58455c()).booleanValue();
        this.f110120z = booleanValue;
        if (booleanValue) {
            this.f110087A = getResources().getDimensionPixelSize(C0126R.dimen.wallet_popover_corner_radius);
            this.f110088B = new awgu(this);
            this.f110089C = new awgv(this);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15411w);
        this.f110093G = obtainStyledAttributes.getColor(2, context.getResources().getColor(17170443));
        this.f110094H = obtainStyledAttributes.getColor(1, context.getResources().getColor(17170445));
        this.f110112r = obtainStyledAttributes.getBoolean(4, this.f110112r);
        this.f110090D = obtainStyledAttributes.getBoolean(0, this.f110090D);
        this.f110113s = obtainStyledAttributes.getBoolean(6, this.f110113s);
        this.f110119y = obtainStyledAttributes.getDimensionPixelOffset(3, this.f110119y);
        this.f110118x = obtainStyledAttributes.getDimensionPixelOffset(8, this.f110118x);
        this.f110109o = obtainStyledAttributes.getInt(7, this.f110109o);
        this.f110092F = obtainStyledAttributes.getResourceId(5, 0);
        obtainStyledAttributes.recycle();
        if ((getContext() instanceof Activity) && (window = ((Activity) getContext()).getWindow()) != null) {
            this.f110101g = window.findViewById(C0126R.C0129id.action_bar_container);
        }
        TypedValue typedValue = new TypedValue();
        View view2 = this.f110101g;
        if (view2 == null || view2.getVisibility() != 0 || !getContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
            this.f110107m = 0;
        } else {
            this.f110107m = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        awhb awhb = new awhb(context, this);
        this.f110099e = awhb;
        awhb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f110098d = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        this.f110098d.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f110106l = linearLayout2;
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f110106l.setOrientation(0);
        View view3 = new View(context);
        this.f110095a = view3;
        view3.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f110096b = frameLayout;
        frameLayout.setId(C0126R.C0129id.popover_content_holder);
        this.f110096b.setLayoutParams(layoutParams);
        this.f110096b.setMinimumHeight(i);
        this.f110096b.setBackgroundColor(this.f110093G);
        int i3 = this.f110092F;
        if (i3 != 0) {
            this.f110105k = from.inflate(i3, (ViewGroup) this, false);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 49;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f110097c = frameLayout2;
        frameLayout2.setLayoutParams(layoutParams2);
        this.f110097c.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, this.f110107m);
        layoutParams3.gravity = 49;
        View view4 = new View(context);
        this.f110104j = view4;
        view4.setBackgroundColor(this.f110094H);
        this.f110104j.setLayoutParams(layoutParams3);
        this.f110104j.setVisibility(4);
        this.f110106l.addView(this.f110098d);
        this.f110098d.addView(this.f110095a);
        this.f110098d.addView(this.f110096b);
        this.f110099e.addView(this.f110106l);
        addView(this.f110099e);
        View view5 = this.f110105k;
        if (view5 != null) {
            addView(view5);
        }
        addView(this.f110104j);
        mo59874b();
        this.f110104j.setPivotY((float) this.f110107m);
        if (this.f110090D && (view = this.f110101g) != null) {
            view.setAlpha(0.0f);
        }
        View view6 = this.f110105k;
        if (view6 != null) {
            view6.setTranslationY((float) i);
        }
        this.f110097c.setTranslationY((float) i);
    }

    /* renamed from: a */
    public final void mo59869a(double d, double d2) {
        if (d > 0.0d) {
            this.f110116v = d;
        }
        if (d2 > 0.0d) {
            this.f110117w = d2;
        }
    }

    /* renamed from: b */
    public final void mo59874b() {
        FrameLayout frameLayout = this.f110097c;
        if (frameLayout != null) {
            if (frameLayout.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f110097c.getParent()).removeView(this.f110097c);
            }
            int i = this.f110109o;
            if (i == 0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 49;
                this.f110097c.setLayoutParams(layoutParams);
                addView(this.f110097c);
            } else if (i == 1) {
                this.f110097c.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                this.f110106l.addView(this.f110097c, 0);
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected StickyStyle %d", Integer.valueOf(this.f110109o)));
            }
            if (this.f110102h == null) {
                awhb awhb = this.f110099e;
                int i2 = awhb.f94326n;
                awhb.mo52154e();
                return;
            }
            awhb awhb2 = this.f110099e;
            int i3 = awhb.f94326n;
            awhb2.mo52153d();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v1, types: [awgw], assign insn: PHI: (r0v1 ?) = (r0v7 ?), (r0v8 ?) binds: [B:2:0x0008, B:1:0x0005] */
    /* JADX WARN: Type inference failed for: r0v7, assign insn: 0x0008: MOVE  (r0v7 ? I:?[OBJECT, ARRAY]) = (0 ?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r0v8, assign insn: ?: MOVE  (r0v8 ?) = (r0v0 android.view.View) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    public final void mo59877c() {
        View view = this.f110103i;
        boolean z = view instanceof awgw;
        ? r0 = view;
        if (!z) {
            r0 = 0;
        }
        this.f110097c.removeAllViews();
        if (this.f110108n && r0 != 0) {
            View a = r0.mo52141a(this.f110109o);
            this.f110102h = a;
            if (this.f110109o == 1) {
                a.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            }
            this.f110097c.addView(this.f110102h);
            awhb awhb = this.f110099e;
            int i = awhb.f94326n;
            awhb.mo52153d();
            this.f110099e.mo52150b();
            return;
        }
        this.f110102h = null;
        awhb awhb2 = this.f110099e;
        int i2 = awhb.f94326n;
        awhb2.mo52154e();
    }

    /* renamed from: d */
    public final boolean mo59879d() {
        View view = this.f110101g;
        return view != null && this.f110107m > 0 && view.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean mo59880e() {
        return (this.f110103i == null || this.f110102h == null) ? false : true;
    }

    /* renamed from: f */
    public final int mo59881f() {
        return this.f110095a.getHeight() - this.f110107m;
    }

    /* renamed from: g */
    public final int mo59882g() {
        return Math.max(0, this.f110095a.getHeight() - getHeight());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f110105k;
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f110105k.getLayoutParams();
            if (this.f110109o == 1) {
                C1260oz.m19821a(marginLayoutParams, this.f110097c.getWidth());
            } else {
                C1260oz.m19821a(marginLayoutParams, 0);
            }
            this.f110105k.setLayoutParams(marginLayoutParams);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
            this.f110099e.f94342k = bundle.getBoolean("pendingFullScreenState");
            this.f110099e.f94343l = bundle.getBoolean("fullScreenState");
            this.f110099e.f94338g = bundle.getBoolean("notifiedOffscreen");
            awhb awhb = this.f110099e;
            int i = awhb.f94326n;
            awhb.f94335d = true;
            this.f110091E = bphx.m111944a(bundle.getInt("popoverExitAction"));
            this.f110110p = bundle.getBoolean("programmaticDismiss");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        awhb awhb = this.f110099e;
        boolean z = true;
        if (!awhb.f94342k && !awhb.f94343l) {
            z = false;
        }
        bundle.putBoolean("pendingFullScreenState", z);
        bundle.putBoolean("fullScreenState", this.f110099e.f94343l);
        bundle.putBoolean("notifiedOffscreen", this.f110099e.f94338g);
        int i = this.f110091E;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("popoverExitAction", i2);
            bundle.putBoolean("programmaticDismiss", this.f110110p);
            return bundle;
        }
        throw null;
    }

    public final void scrollTo(int i, int i2) {
        awhb awhb = this.f110099e;
        awgs awgs = new awgs(this, i, i2);
        int i3 = awhb.f94326n;
        awhb.mo52149a(awgs);
    }

    public PopoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93900a(context, attributeSet);
    }

    public PopoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93900a(context, attributeSet);
    }

    public PopoverView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m93900a(context, attributeSet);
    }

    /* renamed from: c */
    public final void mo59878c(boolean z) {
        this.f110115u = z;
        awhb awhb = this.f110099e;
        if (awhb != null) {
            boolean z2 = false;
            if (z && this.f110108n) {
                z2 = true;
            }
            awhb.mo71903a(z2);
        }
    }

    /* renamed from: b */
    public final void mo59875b(int i) {
        this.f110091E = i;
        this.f110110p = true;
        awhb awhb = this.f110099e;
        awhb.f94338g = false;
        if (awhb.f94339h || awhb.getScrollY() > mo59882g()) {
            awhb awhb2 = this.f110099e;
            int i2 = awhb.f94326n;
            awhb2.mo52156g();
            return;
        }
        this.f110099e.mo52155f();
    }

    /* renamed from: b */
    public final void mo59876b(boolean z) {
        awhb awhb = this.f110099e;
        if (!awhb.f94342k && !awhb.f94343l && !awhb.f94339h) {
            awhb.f94342k = true;
            mo59872a(z);
        }
    }

    /* renamed from: a */
    public static void m93901a(Activity activity) {
        Window window = activity.getWindow();
        int i = Build.VERSION.SDK_INT;
        window.setStatusBarColor(activity.getResources().getColor(17170444));
    }

    /* renamed from: a */
    public final void mo59870a(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.data;
        this.f110094H = i2;
        View view = this.f110104j;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    /* renamed from: a */
    public final void mo59871a(View view) {
        this.f110103i = view;
        mo59877c();
    }

    /* renamed from: a */
    public final void mo59872a(boolean z) {
        awhb awhb = this.f110099e;
        awgt awgt = new awgt(this, z);
        int i = awhb.f94326n;
        awhb.mo52149a(awgt);
    }

    /* renamed from: a */
    public final boolean mo59873a() {
        return this.f110099e.f94343l;
    }
}
