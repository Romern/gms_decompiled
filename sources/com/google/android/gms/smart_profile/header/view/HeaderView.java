package com.google.android.gms.smart_profile.header.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeaderView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    private int f107758A;

    /* renamed from: a */
    public final AvatarView f107759a;

    /* renamed from: b */
    public final ImageView f107760b;

    /* renamed from: c */
    public final View f107761c;

    /* renamed from: d */
    public final ViewGroup f107762d;

    /* renamed from: e */
    public final CircleView f107763e;

    /* renamed from: f */
    public final boolean f107764f;

    /* renamed from: g */
    public int f107765g;

    /* renamed from: h */
    public int f107766h;

    /* renamed from: i */
    public float f107767i;

    /* renamed from: j */
    public boolean f107768j;

    /* renamed from: k */
    public boolean f107769k;

    /* renamed from: l */
    public aqvo f107770l;

    /* renamed from: m */
    private final ViewGroup f107771m;

    /* renamed from: n */
    private final ViewGroup f107772n;

    /* renamed from: o */
    private final ViewGroup f107773o;

    /* renamed from: p */
    private final ViewGroup f107774p;

    /* renamed from: q */
    private final TextView f107775q;

    /* renamed from: r */
    private final TextView f107776r;

    /* renamed from: s */
    private final int f107777s;

    /* renamed from: t */
    private ValueAnimator f107778t;

    /* renamed from: u */
    private boolean f107779u;

    /* renamed from: v */
    private Path f107780v;

    /* renamed from: w */
    private float[] f107781w;

    /* renamed from: x */
    private float f107782x;

    /* renamed from: y */
    private RelativeLayout f107783y;

    /* renamed from: z */
    private int f107784z;

    public HeaderView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m92537a(int i, int i2, float f) {
        return (int) (((float) i) + (((float) (i2 - i)) * (1.0f - f)));
    }

    /* renamed from: b */
    private final void m92538b(int i) {
        if (cgnz.m146325b() && cgnt.m146316b() && cgnk.m146288b()) {
            if (this.f107783y.getBackground() instanceof GradientDrawable) {
                ((GradientDrawable) this.f107783y.getBackground()).setColor(i);
            } else {
                this.f107783y.setBackgroundColor(i);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: c */
    private static final float m92539c(float f) {
        float max = Math.max(Math.min(0.7f, 1.0f), 0.0f);
        if (f > max) {
            return (f - max) / (1.0f - max);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void mo59022d() {
        this.f107779u = true;
        this.f107774p.setVisibility(8);
    }

    /* renamed from: e */
    public final boolean mo59023e() {
        return this.f107767i == 1.0f;
    }

    /* renamed from: f */
    public final boolean mo59024f() {
        return this.f107767i == 0.0f;
    }

    public final void onGlobalLayout() {
        int i;
        int a = mo59014a((int) C0126R.dimen.profile_header_avatar_diameter);
        int a2 = mo59014a((int) C0126R.dimen.profile_header_expanded_avatar_vertical_spacing);
        int width = (getWidth() / 2) - (a / 2);
        int a3 = mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_margin_left);
        if (cgnz.m146325b()) {
            i = (this.f107777s - mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_diameter)) / 2;
        } else {
            i = mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_margin_top);
        }
        if (this.f107764f) {
            if (cgnz.m146325b()) {
                a2 = this.f107777s;
            }
            width = mo59014a((int) C0126R.dimen.avatar_side_space_bugfixed);
            if (C1280ps.m19923h(this) == 1) {
                width = (getWidth() - a) - width;
                ((RelativeLayout) this.f107772n).setGravity(5);
                this.f107775q.setGravity(5);
            }
        }
        if (C1280ps.m19923h(this) == 1) {
            a3 = (getWidth() - mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_margin_left)) - mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_diameter);
            this.f107776r.setGravity(8388613);
        }
        Path path = new Path();
        this.f107780v = path;
        float f = (float) width;
        path.moveTo(f, (float) a2);
        int i2 = i + i;
        this.f107780v.lineTo(f, (float) i2);
        this.f107780v.quadTo(f, 0.0f, (float) a3, (float) i);
        this.f107782x = (float) (a2 - i2);
        mo59020b(this.f107767i);
        int i3 = Build.VERSION.SDK_INT;
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        this.f107765g = this.f107773o.getMeasuredHeight();
        setMeasuredDimension(this.f107772n.getMeasuredWidth(), m92537a(this.f107777s, this.f107765g, this.f107767i));
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final int mo59014a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    /* renamed from: c */
    public final void mo59021c() {
        ValueAnimator valueAnimator = this.f107778t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107767i = 0.0f;
        boolean z = false;
        this.f107768j = false;
        this.f107769k = false;
        this.f107779u = false;
        this.f107781w = new float[2];
        if (cgnz.m146325b()) {
            if (!cgnt.m146316b() || !cgnk.m146288b()) {
                this.f107762d = (ViewGroup) inflate(getContext(), C0126R.C0128layout.gm_header_view, null);
            } else {
                this.f107762d = (ViewGroup) inflate(getContext(), C0126R.C0128layout.gm_header_view_fix, null);
            }
            Context context2 = getContext();
            TypedValue typedValue = new TypedValue();
            int complexToDimensionPixelSize = context2.getTheme().resolveAttribute(C0126R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()) : 0;
            this.f107777s = complexToDimensionPixelSize == 0 ? mo59014a((int) C0126R.dimen.profile_header_collapsed_height) : complexToDimensionPixelSize;
        } else {
            this.f107762d = (ViewGroup) inflate(getContext(), C0126R.C0128layout.profile_header_view, null);
            this.f107777s = mo59014a((int) C0126R.dimen.profile_header_collapsed_height);
        }
        addView(this.f107762d);
        ViewGroup viewGroup = (ViewGroup) this.f107762d.findViewById(C0126R.C0129id.profile_header_avatar_container);
        this.f107771m = viewGroup;
        viewGroup.setPivotY(0.0f);
        this.f107771m.setPivotX(0.0f);
        int i2 = Build.VERSION.SDK_INT;
        this.f107771m.setOutlineProvider(new aqvn(this));
        this.f107759a = (AvatarView) this.f107762d.findViewById(C0126R.C0129id.profile_header_avatar_view);
        this.f107760b = (ImageView) this.f107762d.findViewById(C0126R.C0129id.profile_header_default_avatar_icon);
        this.f107761c = this.f107762d.findViewById(C0126R.C0129id.profile_header_action_bar_container);
        this.f107772n = (ViewGroup) this.f107762d.findViewById(C0126R.C0129id.profile_header_action_bar_expanded_text);
        this.f107773o = (ViewGroup) this.f107762d.findViewById(C0126R.C0129id.profile_header_action_bar_content);
        this.f107774p = (ViewGroup) this.f107762d.findViewById(C0126R.C0129id.quick_actions_bar_container);
        this.f107775q = (TextView) this.f107762d.findViewById(C0126R.C0129id.profile_header_display_name);
        this.f107776r = (TextView) this.f107762d.findViewById(C0126R.C0129id.profile_header_action_bar_display_name);
        this.f107763e = (CircleView) this.f107762d.findViewById(C0126R.C0129id.profile_header_default_avatar_circle_view);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f107764f = getResources().getConfiguration().orientation == 2 ? true : z;
        if (cgnz.m146325b()) {
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                this.f107766h = getResources().getDimensionPixelSize(identifier);
            }
            if (cgnt.m146316b() && cgnk.m146288b()) {
                this.f107784z = thh.m36965a(getContext(), C0126R.attr.headerBackgroundCollapsedColor);
                this.f107758A = thh.m36965a(getContext(), C0126R.attr.headerBackgroundExpandedColor);
                if (this.f107764f) {
                    this.f107783y = (RelativeLayout) this.f107762d.findViewById(C0126R.C0129id.profile_header_action_bar_content);
                } else {
                    this.f107783y = (RelativeLayout) this.f107762d.findViewById(C0126R.C0129id.profile_header_bar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59015a() {
        mo59016a(0.0f);
    }

    /* renamed from: b */
    public final void mo59019b() {
        mo59016a(1.0f);
    }

    /* renamed from: a */
    public final void mo59016a(float f) {
        if (!mo59024f() && !mo59023e()) {
            this.f107778t = ValueAnimator.ofFloat(this.f107767i, f);
            this.f107778t.setInterpolator(new DecelerateInterpolator(1.5f));
            this.f107778t.addUpdateListener(new aqvl(this));
            this.f107778t.setDuration(250L).start();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: b */
    public final void mo59020b(float f) {
        int i;
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        this.f107767i = min;
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(this.f107780v, false);
        pathMeasure.getPosTan(pathMeasure.getLength() * this.f107767i, this.f107781w, null);
        this.f107771m.setX((float) ((int) this.f107781w[0]));
        this.f107771m.setY((float) ((int) this.f107781w[1]));
        float length = this.f107782x / pathMeasure.getLength();
        float f2 = this.f107767i;
        float f3 = f2 >= length ? (f2 - length) / (1.0f - length) : 0.0f;
        float a = 1.0f - ((1.0f - (((float) mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_diameter)) / ((float) mo59014a((int) C0126R.dimen.profile_header_avatar_diameter)))) * f3);
        this.f107771m.setScaleX(a);
        this.f107771m.setScaleY(a);
        int i3 = Build.VERSION.SDK_INT;
        double d = (double) f3;
        Double.isNaN(d);
        double sin = Math.sin(d * 3.141592653589793d);
        double min2 = Math.min(1.0d, sin + sin);
        int a2 = mo59014a((int) C0126R.dimen.profile_header_avatar_collapsed_diameter);
        ViewGroup viewGroup = this.f107771m;
        double d2 = (double) a2;
        Double.isNaN(d2);
        viewGroup.setTranslationZ((float) ((int) (min2 * d2)));
        requestLayout();
        if (!this.f107764f) {
            int i4 = this.f107765g;
            int i5 = -(i4 - m92537a(this.f107777s, i4, min));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f107773o.getLayoutParams();
            if (cgnz.m146325b()) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById(C0126R.C0129id.profile_header_action_bar_collapsed).getLayoutParams();
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, Math.max(i5, -mo59014a((int) C0126R.dimen.header_transparent_window_start_size)), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i5, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            this.f107773o.requestLayout();
        }
        float c = m92539c(min);
        float c2 = m92539c(1.0f - min);
        this.f107776r.setAlpha(c);
        this.f107772n.setAlpha(c2);
        TextView textView = this.f107776r;
        if (c == 0.0f) {
            i = 4;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        ViewGroup viewGroup2 = this.f107772n;
        if (c2 == 0.0f) {
            i2 = 4;
        }
        viewGroup2.setVisibility(i2);
        if (!this.f107779u) {
            this.f107774p.setAlpha(c2);
            this.f107774p.setVisibility(i2);
        }
        if (this.f107769k) {
            View findViewById = findViewById(C0126R.C0129id.domain_icon);
            findViewById.setAlpha(c2);
            findViewById.setVisibility(i2);
        }
        aqvo aqvo = this.f107770l;
        if (aqvo != null) {
            aqvo.mo48195a();
        }
        if (cgnz.m146325b() && cgnt.m146316b() && cgnk.m146288b()) {
            if (mo59023e()) {
                m92538b(this.f107784z);
            } else {
                m92538b(this.f107758A);
            }
        }
    }

    /* renamed from: a */
    public final void mo59017a(int i, String str) {
        TextView textView = (TextView) this.f107762d.findViewById(i);
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo59018a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f107775q.setContentDescription(str);
            this.f107776r.setContentDescription(str);
            this.f107776r.setText(str);
            this.f107775q.setText(str);
            this.f107775q.setOnLongClickListener(new aqvm(this, str));
        }
    }
}
