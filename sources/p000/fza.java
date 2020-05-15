package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.support.p002v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fza {

    /* renamed from: ab */
    private static final Property f17668ab = new fyw("left");

    /* renamed from: ac */
    private static final Property f17669ac = new fyx("top");

    /* renamed from: ad */
    private static final Property f17670ad = new fyy("right");

    /* renamed from: ae */
    private static final Property f17671ae = new fyz("bottom");

    /* renamed from: j */
    public static final /* synthetic */ int f17672j = 0;

    /* renamed from: k */
    private static final int[] f17673k = {16842919};

    /* renamed from: l */
    private static final int[] f17674l = new int[0];

    /* renamed from: m */
    private static final long f17675m = ((long) ViewConfiguration.getTapTimeout());

    /* renamed from: A */
    private final int f17676A;

    /* renamed from: B */
    private final int f17677B;

    /* renamed from: C */
    private final float f17678C;

    /* renamed from: D */
    private final ColorStateList f17679D;

    /* renamed from: E */
    private final Drawable f17680E;

    /* renamed from: F */
    private final Drawable f17681F;

    /* renamed from: G */
    private AnimatorSet f17682G;

    /* renamed from: H */
    private AnimatorSet f17683H;

    /* renamed from: I */
    private int f17684I = -1;

    /* renamed from: J */
    private int f17685J = -1;

    /* renamed from: K */
    private boolean f17686K;

    /* renamed from: L */
    private Object[] f17687L;

    /* renamed from: M */
    private boolean f17688M;

    /* renamed from: N */
    private boolean f17689N;

    /* renamed from: O */
    private SectionIndexer f17690O;

    /* renamed from: P */
    private boolean f17691P;

    /* renamed from: Q */
    private boolean f17692Q;

    /* renamed from: R */
    private final int f17693R;

    /* renamed from: S */
    private final boolean f17694S;

    /* renamed from: T */
    private float f17695T;

    /* renamed from: U */
    private long f17696U = -1;

    /* renamed from: V */
    private final int f17697V;

    /* renamed from: W */
    private int f17698W;

    /* renamed from: X */
    private final GradientDrawable f17699X;

    /* renamed from: Y */
    private GradientDrawable f17700Y;

    /* renamed from: Z */
    private final Runnable f17701Z = new fyu(this);

    /* renamed from: a */
    public final fzf f17702a;

    /* renamed from: aa */
    private final Animator.AnimatorListener f17703aa = new fyv(this);

    /* renamed from: b */
    public final int f17704b;

    /* renamed from: c */
    public boolean f17705c;

    /* renamed from: d */
    public long f17706d;

    /* renamed from: e */
    public int f17707e;

    /* renamed from: f */
    public abh f17708f;

    /* renamed from: g */
    public int f17709g;

    /* renamed from: h */
    public int f17710h;

    /* renamed from: i */
    public int f17711i;

    /* renamed from: n */
    private final Rect f17712n = new Rect();

    /* renamed from: o */
    private final Rect f17713o = new Rect();

    /* renamed from: p */
    private final Rect f17714p = new Rect();

    /* renamed from: q */
    private final TextView f17715q;

    /* renamed from: r */
    private final TextView f17716r;

    /* renamed from: s */
    private final ImageView f17717s;

    /* renamed from: t */
    private final ImageView f17718t;

    /* renamed from: u */
    private final View f17719u;

    /* renamed from: v */
    private final int[] f17720v = new int[2];

    /* renamed from: w */
    private final int f17721w;

    /* renamed from: x */
    private final int f17722x;

    /* renamed from: y */
    private final int f17723y;

    /* renamed from: z */
    private final int f17724z;

    public fza(ViewGroup viewGroup, fzf fzf) {
        int i;
        this.f17702a = fzf;
        this.f17710h = fzf.getAdapter() != null ? fzf.getAdapter().mo161a() : 0;
        this.f17711i = fzf.getChildCount();
        Context context = fzf.getContext();
        this.f17697V = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f17709g = fzf.getScrollBarStyle();
        this.f17707e = 1;
        this.f17694S = context.getApplicationInfo().targetSdkVersion >= 11;
        ImageView imageView = new ImageView(context);
        this.f17718t = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = new ImageView(context);
        this.f17717s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        View view = new View(context);
        this.f17719u = view;
        view.setAlpha(0.0f);
        this.f17715q = m12734a(context);
        this.f17716r = m12734a(context);
        this.f17721w = context.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_fast_scroller_minimum_touch_target);
        Resources resources = this.f17702a.getContext().getResources();
        this.f17676A = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_thumbMinWidth);
        this.f17677B = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_thumbMinHeight);
        this.f17678C = (float) resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_textSize);
        this.f17723y = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_minWidth);
        this.f17724z = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_minHeight);
        this.f17722x = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroller_padding);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroll_thumb_jb2_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0126R.dimen.appinvite_fastscroll_thumb_jb2_height);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f17699X = gradientDrawable;
        gradientDrawable.setShape(0);
        this.f17699X.setSize(dimensionPixelSize, dimensionPixelSize2);
        this.f17699X.setColor(this.f17698W);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize2);
        gradientDrawable2.setColor(resources.getColor(C0126R.color.appinvite_medium_black));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f17673k, this.f17699X);
        stateListDrawable.addState(f17674l, gradientDrawable2);
        this.f17680E = stateListDrawable;
        this.f17681F = resources.getDrawable(C0126R.C0127drawable.appinvite_fastscroll_track_material);
        int[] iArr = this.f17720v;
        iArr[1] = C0126R.C0127drawable.appinvite_fastscroll_label_right_material;
        iArr[0] = C0126R.C0127drawable.appinvite_fastscroll_label_left_material;
        this.f17693R = 2;
        this.f17679D = ColorStateList.valueOf(resources.getColor(17170433));
        this.f17718t.setImageDrawable(this.f17681F);
        Drawable drawable = this.f17681F;
        if (drawable != null) {
            i = Math.max(0, drawable.getIntrinsicWidth());
        } else {
            i = 0;
        }
        this.f17717s.setImageDrawable(this.f17680E);
        this.f17717s.setMinimumWidth(this.f17676A);
        this.f17717s.setMinimumHeight(this.f17677B);
        Drawable drawable2 = this.f17680E;
        this.f17704b = Math.max(drawable2 != null ? Math.max(i, drawable2.getIntrinsicWidth()) : i, this.f17676A);
        this.f17719u.setMinimumWidth(this.f17723y);
        this.f17719u.setMinimumHeight(this.f17724z);
        ColorStateList colorStateList = this.f17679D;
        if (colorStateList != null) {
            this.f17715q.setTextColor(colorStateList);
            this.f17716r.setTextColor(this.f17679D);
        }
        float f = this.f17678C;
        if (f > 0.0f) {
            this.f17715q.setTextSize(0, f);
            this.f17716r.setTextSize(0, this.f17678C);
        }
        int max = Math.max(0, this.f17724z);
        this.f17715q.setMinimumWidth(max);
        this.f17715q.setMinimumHeight(max);
        this.f17715q.setIncludeFontPadding(false);
        this.f17716r.setMinimumWidth(max);
        this.f17716r.setMinimumHeight(max);
        this.f17716r.setIncludeFontPadding(false);
        m12744f();
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(this.f17718t);
        overlay.add(this.f17717s);
        overlay.add(this.f17719u);
        overlay.add(this.f17715q);
        overlay.add(this.f17716r);
        m12747i();
        mo11541a(this.f17711i, this.f17710h);
        mo11545b(fzf.getVerticalScrollbarPosition());
        mo11547c();
    }

    /* renamed from: a */
    private static Animator m12732a(Property property, float f, View... viewArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int length = viewArr.length - 1; length >= 0; length--) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewArr[length], property, f);
            if (builder == null) {
                builder = animatorSet.play(ofFloat);
            } else {
                builder.with(ofFloat);
            }
        }
        return animatorSet;
    }

    /* renamed from: b */
    private static Animator m12739b(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, f);
    }

    /* renamed from: c */
    private final float m12742c(float f) {
        ImageView imageView = this.f17718t;
        float top = (float) imageView.getTop();
        float bottom = ((float) imageView.getBottom()) - top;
        if (bottom > 0.0f) {
            return fzi.m12778a((f - top) / bottom, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    /* renamed from: d */
    private final boolean m12743d(int i) {
        TextView textView;
        TextView textView2;
        Object obj;
        Object[] objArr = this.f17687L;
        String str = null;
        if (objArr != null && i >= 0 && i < objArr.length && (obj = objArr[i]) != null) {
            str = obj.toString();
        }
        Rect rect = this.f17712n;
        View view = this.f17719u;
        if (this.f17705c) {
            textView2 = this.f17715q;
            textView = this.f17716r;
        } else {
            textView2 = this.f17716r;
            textView = this.f17715q;
        }
        textView.setText(str);
        m12741b(textView, rect);
        m12735a(textView, rect);
        AnimatorSet animatorSet = this.f17683H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = m12739b(textView, 1.0f).setDuration(50);
        Animator duration2 = m12739b(textView2, 0.0f).setDuration(50);
        duration2.addListener(this.f17703aa);
        rect.left -= view.getPaddingLeft();
        rect.top -= view.getPaddingTop();
        rect.right += view.getPaddingRight();
        rect.bottom += view.getPaddingBottom();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofInt(f17668ab, rect.left), PropertyValuesHolder.ofInt(f17669ac, rect.top), PropertyValuesHolder.ofInt(f17670ad, rect.right), PropertyValuesHolder.ofInt(f17671ae, rect.bottom));
        ofPropertyValuesHolder.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17683H = animatorSet2;
        AnimatorSet.Builder with = animatorSet2.play(duration2).with(duration);
        with.with(ofPropertyValuesHolder);
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int width2 = textView.getWidth();
        if (width2 > width) {
            textView.setScaleX(((float) width) / ((float) width2));
            with.with(m12733a(textView, 1.0f).setDuration(100));
        } else {
            textView.setScaleX(1.0f);
        }
        int width3 = textView2.getWidth();
        if (width3 > width2) {
            with.with(m12733a(textView2, ((float) width2) / ((float) width3)).setDuration(100));
        }
        this.f17683H.start();
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: f */
    private final void m12744f() {
        boolean z = this.f17707e == 2;
        this.f17717s.setPressed(z);
        this.f17718t.setPressed(z);
    }

    /* renamed from: g */
    private final void m12745g() {
        AnimatorSet animatorSet = this.f17682G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = m12732a(View.ALPHA, 1.0f, this.f17717s, this.f17718t).setDuration(150);
        Animator duration2 = m12732a(View.ALPHA, 0.0f, this.f17719u, this.f17715q, this.f17716r).setDuration(300);
        Animator duration3 = m12732a(View.TRANSLATION_X, 0.0f, this.f17717s, this.f17718t).setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17682G = animatorSet2;
        animatorSet2.playTogether(duration, duration2, duration3);
        this.f17682G.start();
        this.f17689N = false;
    }

    /* renamed from: h */
    private final void m12746h() {
        AnimatorSet animatorSet = this.f17682G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Animator duration = m12732a(View.ALPHA, 1.0f, this.f17717s, this.f17718t, this.f17719u).setDuration(150);
        Animator duration2 = m12732a(View.TRANSLATION_X, 0.0f, this.f17717s, this.f17718t).setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17682G = animatorSet2;
        animatorSet2.playTogether(duration, duration2);
        this.f17682G.start();
        this.f17689N = true;
    }

    /* renamed from: i */
    private final void m12747i() {
        this.f17690O = null;
        abh adapter = this.f17702a.getAdapter();
        if (adapter instanceof SectionIndexer) {
            this.f17708f = adapter;
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.f17690O = sectionIndexer;
            this.f17687L = sectionIndexer.getSections();
            return;
        }
        this.f17708f = adapter;
        this.f17687L = null;
    }

    /* renamed from: j */
    private final void m12748j() {
        this.f17696U = -1;
    }

    /* renamed from: k */
    private final void m12749k() {
        this.f17696U = -1;
        mo11548c(2);
        if (this.f17708f == null && this.f17702a != null) {
            m12747i();
        }
        fzf fzf = this.f17702a;
        if (fzf != null) {
            fzf.requestDisallowInterceptTouchEvent(true);
            this.f17702a.mo11551a(1);
        }
        MotionEvent obtain = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0);
        this.f17702a.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public final boolean mo11542a() {
        return this.f17692Q && this.f17686K;
    }

    /* renamed from: d */
    public final void mo11549d() {
        this.f17708f = null;
    }

    /* renamed from: e */
    public final void mo11550e() {
        if (!this.f17692Q) {
            this.f17692Q = true;
            m12737a(true);
        }
    }

    /* renamed from: b */
    private final void m12740b(float f) {
        int i;
        int i2;
        int i3;
        float f2;
        int a = this.f17702a.getAdapter().mo161a();
        Object[] objArr = this.f17687L;
        int i4 = 0;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        int i5 = -1;
        if (this.f17702a.getAdapter() instanceof fxj) {
            fxj fxj = (fxj) this.f17702a.getAdapter();
            fxj.mo11476b(this.f17702a);
            int length = objArr != null ? objArr.length - 1 : 0;
            int h = (int) (((float) fxj.mo11482h(fxj.mo161a() - 1)) * f);
            while (true) {
                if (i4 >= a) {
                    i5 = length;
                    break;
                } else if (h <= fxj.mo11482h(i4)) {
                    this.f17702a.scrollToPosition(i4);
                    i5 = this.f17690O.getSectionForPosition(i4);
                    break;
                } else {
                    i4++;
                }
            }
        } else if (objArr != null && i > 1) {
            float f3 = (float) i;
            int i6 = i - 1;
            int a2 = fzi.m12779a((int) (f * f3), i6);
            int positionForSection = this.f17690O.getPositionForSection(a2);
            int i7 = a2 + 1;
            if (a2 < i6) {
                i2 = this.f17690O.getPositionForSection(i7);
            } else {
                i2 = a;
            }
            if (i2 != positionForSection) {
                i4 = a2;
                i3 = i4;
            } else {
                i3 = a2;
                int i8 = positionForSection;
                while (true) {
                    if (i3 > 0) {
                        i3--;
                        i8 = this.f17690O.getPositionForSection(i3);
                        if (i8 == positionForSection) {
                            if (i3 == 0) {
                                i3 = a2;
                                break;
                            }
                        } else {
                            i4 = i3;
                            break;
                        }
                    } else {
                        i4 = a2;
                        i3 = i4;
                        break;
                    }
                }
                positionForSection = i8;
            }
            int i9 = i7 + 1;
            while (i9 < i && this.f17690O.getPositionForSection(i9) == i2) {
                i9++;
                i7++;
            }
            float f4 = ((float) i3) / f3;
            float f5 = ((float) i7) / f3;
            if (a != 0) {
                f2 = 0.125f / ((float) a);
            } else {
                f2 = Float.MAX_VALUE;
            }
            if (i3 != a2 || f - f4 >= f2) {
                positionForSection += (int) ((((float) (i2 - positionForSection)) * (f - f4)) / (f5 - f4));
            }
            this.f17702a.scrollToPosition(fzi.m12779a(positionForSection, a - 1));
            i5 = i4;
        } else {
            this.f17702a.scrollToPosition(fzi.m12779a((int) (f * ((float) a)), a - 1));
        }
        if (this.f17684I != i5) {
            this.f17684I = i5;
            boolean d = m12743d(i5);
            boolean z = this.f17689N;
            if (!z && d) {
                m12746h();
            } else if (z && !d) {
                m12745g();
            }
        }
    }

    /* renamed from: c */
    public final void mo11547c() {
        this.f17702a.removeCallbacks(this.f17701Z);
        this.f17702a.postDelayed(this.f17701Z, 1500);
    }

    /* renamed from: c */
    public final void mo11548c(int i) {
        this.f17702a.removeCallbacks(this.f17701Z);
        if (i != this.f17707e) {
            if (i == 0) {
                AnimatorSet animatorSet = this.f17682G;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                Animator duration = m12732a(View.ALPHA, 0.0f, this.f17717s, this.f17718t, this.f17719u, this.f17715q, this.f17716r).setDuration(300);
                Animator duration2 = m12732a(View.TRANSLATION_X, (float) (!this.f17691P ? -this.f17717s.getWidth() : this.f17717s.getWidth()), this.f17717s, this.f17718t).setDuration(300);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f17682G = animatorSet2;
                animatorSet2.playTogether(duration, duration2);
                this.f17682G.start();
                this.f17689N = false;
            } else if (i == 1) {
                m12745g();
            } else if (m12743d(this.f17684I)) {
                m12746h();
            } else {
                m12745g();
            }
            this.f17707e = i;
            m12744f();
        }
    }

    /* renamed from: a */
    private static Animator m12733a(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.SCALE_X, f);
    }

    /* renamed from: a */
    private final TextView m12734a(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        TextView textView = new TextView(context);
        textView.setLayoutParams(layoutParams);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        textView.setLayoutDirection(this.f17702a.getLayoutDirection());
        return textView;
    }

    /* renamed from: a */
    private final void m12735a(View view, Rect rect) {
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.setPivotX(this.f17691P ? (float) (rect.right - rect.left) : 0.0f);
    }

    /* renamed from: a */
    private final void m12736a(View view, View view2, Rect rect, Rect rect2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (rect != null) {
            i3 = rect.left;
            i2 = rect.top;
            i = rect.right;
        } else {
            i = 0;
            i3 = 0;
            i2 = 0;
        }
        Rect rect3 = this.f17714p;
        int width = rect3.width();
        if (view2 != null) {
            if (!this.f17691P) {
                width -= view2.getRight();
            } else {
                width = view2.getLeft();
            }
        }
        int i6 = (width - i3) - i;
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(i6, view.getMeasuredWidth());
        if (!this.f17691P) {
            i4 = (view2 != null ? view2.getRight() : rect3.left) + i3;
            i5 = min + i4;
        } else {
            int left = (view2 != null ? view2.getLeft() : rect3.right) - i;
            int i7 = left - min;
            i5 = left;
            i4 = i7;
        }
        rect2.set(i4, i2, i5, view.getMeasuredHeight() + i2);
    }

    /* renamed from: b */
    private final void m12741b(View view, Rect rect) {
        int i;
        int i2;
        int i3;
        Rect rect2 = this.f17713o;
        rect2.left = this.f17719u.getPaddingLeft();
        rect2.top = this.f17719u.getPaddingTop();
        rect2.right = this.f17719u.getPaddingRight();
        rect2.bottom = this.f17719u.getPaddingBottom();
        if (this.f17693R == 0) {
            if (rect2 != null) {
                i2 = rect2.left;
                i = rect2.top;
                i3 = rect2.right;
            } else {
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            Rect rect3 = this.f17714p;
            int width = rect3.width();
            view.measure(View.MeasureSpec.makeMeasureSpec((width - i2) - i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int height = rect3.height();
            int measuredWidth = view.getMeasuredWidth();
            int i4 = (height / 10) + i + rect3.top;
            int measuredHeight = view.getMeasuredHeight();
            int i5 = ((width - measuredWidth) / 2) + rect3.left;
            rect.set(i5, i4, measuredWidth + i5, measuredHeight + i4);
            return;
        }
        m12736a(view, this.f17717s, rect2, rect);
    }

    /* renamed from: a */
    private final void m12737a(boolean z) {
        if (mo11542a()) {
            int i = this.f17707e;
            if (i == 2) {
                return;
            }
            if (i == 1) {
                mo11547c();
            } else if (z) {
                mo11548c(1);
                mo11547c();
            }
        } else {
            mo11548c(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r7 >= (((float) r6.f17717s.getLeft()) - r3)) goto L_0x0045;
     */
    /* renamed from: a */
    private final boolean m12738a(float f, float f2) {
        float translationX = this.f17717s.getTranslationX();
        int left = this.f17717s.getLeft();
        float right = ((float) this.f17721w) - ((((float) this.f17717s.getRight()) + translationX) - (((float) left) + translationX));
        float f3 = 0.0f;
        if (right <= 0.0f) {
            right = 0.0f;
        }
        if (!this.f17691P) {
            if (f > ((float) this.f17717s.getRight()) + right) {
                return false;
            }
            if (this.f17681F != null) {
                return true;
            }
            float translationY = this.f17717s.getTranslationY();
            float top = ((float) this.f17717s.getTop()) + translationY;
            float bottom = ((float) this.f17717s.getBottom()) + translationY;
            float f4 = ((float) this.f17721w) - (bottom - top);
            if (f4 > 0.0f) {
                f3 = f4 / 2.0f;
            }
            if (f2 < top - f3 || f2 > bottom + f3) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo11544b() {
        int i;
        if (!this.f17688M) {
            this.f17688M = true;
            fzf fzf = this.f17702a;
            Rect rect = this.f17714p;
            rect.left = 0;
            rect.top = 0;
            rect.right = fzf.getWidth();
            rect.bottom = fzf.getHeight();
            int i2 = this.f17709g;
            if (i2 == 16777216 || i2 == 0) {
                rect.left += fzf.getPaddingLeft();
                rect.top += fzf.getPaddingTop();
                rect.right -= fzf.getPaddingRight();
                rect.bottom -= fzf.getPaddingBottom();
                if (i2 == 16777216) {
                    int i3 = this.f17704b;
                    if (this.f17685J == 2) {
                        rect.right += i3;
                    } else {
                        rect.left -= i3;
                    }
                }
            }
            Rect rect2 = this.f17712n;
            m12736a(this.f17717s, null, null, rect2);
            m12735a(this.f17717s, rect2);
            ImageView imageView = this.f17718t;
            ImageView imageView2 = this.f17717s;
            Rect rect3 = this.f17714p;
            imageView.measure(View.MeasureSpec.makeMeasureSpec(rect3.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = imageView.getMeasuredWidth();
            if (imageView2 != null) {
                i = imageView2.getHeight() / 2;
            } else {
                i = 0;
            }
            int left = imageView2.getLeft() + ((imageView2.getWidth() - measuredWidth) / 2);
            imageView.layout(left, rect3.top + i, measuredWidth + left, rect3.bottom - i);
            Rect rect4 = this.f17712n;
            m12741b(this.f17715q, rect4);
            m12735a(this.f17715q, rect4);
            m12741b(this.f17716r, rect4);
            m12735a(this.f17716r, rect4);
            if (this.f17719u != null) {
                rect4.left -= this.f17719u.getPaddingLeft();
                rect4.top -= this.f17719u.getPaddingTop();
                rect4.right += this.f17719u.getPaddingRight();
                rect4.bottom += this.f17719u.getPaddingBottom();
                m12735a(this.f17719u, rect4);
            }
            this.f17688M = false;
        }
    }

    /* renamed from: a */
    public final float mo11538a(int i, int i2, int i3) {
        Object[] objArr;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2 = 0.0f;
        if (!(this.f17702a.getAdapter() instanceof fxj)) {
            if (this.f17690O == null || this.f17708f == null) {
                m12747i();
            }
            if (this.f17690O == null || (objArr = this.f17687L) == null || objArr.length <= 0 || !this.f17694S) {
                return ((float) i) / ((float) (i3 - i2));
            }
            if (i < 0) {
                return 0.0f;
            }
            View childAt = this.f17702a.getChildAt(0);
            if (childAt == null || childAt.getHeight() == 0) {
                f = 0.0f;
            } else {
                f = ((float) (this.f17702a.getPaddingTop() - childAt.getTop())) / ((float) childAt.getHeight());
            }
            int sectionForPosition = this.f17690O.getSectionForPosition(i);
            int positionForSection = this.f17690O.getPositionForSection(sectionForPosition);
            int length = this.f17687L.length;
            if (sectionForPosition < length - 1) {
                int i8 = sectionForPosition + 1;
                if (i8 < length) {
                    i7 = this.f17690O.getPositionForSection(i8);
                } else {
                    i7 = i3 - 1;
                }
                i4 = i7 - positionForSection;
            } else {
                i4 = i3 - positionForSection;
            }
            if (i4 != 0) {
                f2 = ((((float) i) + f) - ((float) positionForSection)) / ((float) i4);
            }
            float f3 = (((float) sectionForPosition) + f2) / ((float) length);
            if (i > 0 && i + i2 == i3) {
                View childAt2 = this.f17702a.getChildAt(i2 - 1);
                int paddingBottom = this.f17702a.getPaddingBottom();
                RecyclerView recyclerView = this.f17702a.getLayoutManager().f120r;
                if (recyclerView != null && recyclerView.mClipToPadding) {
                    i5 = childAt2.getHeight();
                    i6 = (this.f17702a.getHeight() - paddingBottom) - childAt2.getTop();
                } else {
                    i5 = childAt2.getHeight() + paddingBottom;
                    i6 = this.f17702a.getHeight() - childAt2.getTop();
                }
                if (i6 > 0 && i5 > 0) {
                    return f3 + ((1.0f - f3) * (((float) i6) / ((float) i5)));
                }
            }
            return f3;
        } else if (i3 <= 0 || i <= 0) {
            return 0.0f;
        } else {
            fxj fxj = (fxj) this.f17702a.getAdapter();
            fxj.mo11476b(this.f17702a);
            return fzi.m12778a(((float) fxj.mo11482h(i - 1)) / ((float) (fxj.mo11482h(i3 - 1) - this.f17702a.getHeight())), 0.0f, 1.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, assign insn: 0x0000: CONST  (r0v0 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean], assign insn: PHI: (r0v1 ?) = (r0v0 ?), (r0v7 ?) binds: [B:9:0x0014, B:10:0x0017] */
    /* JADX WARN: Type inference failed for: r0v7, assign insn: 0x0017: CONST  (r0v7 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* renamed from: b */
    public final void mo11545b(int i) {
        ? r0 = 1;
        if (i == 0) {
            if (this.f17702a.getLayoutDirection() == 1) {
                i = 1;
            } else {
                i = 2;
            }
        }
        if (this.f17685J != i) {
            this.f17685J = i;
            if (i == 1) {
                r0 = 0;
            }
            this.f17691P = r0;
            this.f17719u.setBackgroundResource(this.f17720v[r0]);
            Drawable background = this.f17719u.getBackground();
            if (background != null) {
                Rect rect = this.f17712n;
                background.getPadding(rect);
                int i2 = this.f17722x;
                rect.offset(i2, i2);
                this.f17719u.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                if (background instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    this.f17700Y = gradientDrawable;
                    gradientDrawable.setColor(this.f17698W);
                }
            }
            mo11544b();
        }
    }

    /* renamed from: b */
    public final boolean mo11546b(MotionEvent motionEvent) {
        if (!mo11542a()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            if (this.f17696U >= 0) {
                m12749k();
                float c = m12742c(motionEvent.getY());
                mo11539a(c);
                m12740b(c);
            }
            if (this.f17707e == 2) {
                fzf fzf = this.f17702a;
                if (fzf != null) {
                    fzf.requestDisallowInterceptTouchEvent(false);
                    this.f17702a.mo11551a(0);
                }
                mo11548c(1);
                mo11547c();
                return true;
            }
        } else if (actionMasked == 2) {
            if (this.f17696U >= 0 && Math.abs(motionEvent.getY() - this.f17695T) > ((float) this.f17697V)) {
                m12749k();
            }
            if (this.f17707e == 2) {
                float c2 = m12742c(motionEvent.getY());
                mo11539a(c2);
                m12740b(c2);
                return true;
            }
        } else if (actionMasked == 3) {
            m12748j();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11539a(float f) {
        Rect rect = this.f17714p;
        int i = rect.top;
        int i2 = rect.bottom;
        ImageView imageView = this.f17718t;
        ImageView imageView2 = this.f17717s;
        float top = (float) imageView.getTop();
        float bottom = (f * (((float) imageView.getBottom()) - top)) + top;
        imageView2.setTranslationY(bottom - ((float) (imageView2.getHeight() / 2)));
        View view = this.f17719u;
        float height = ((float) view.getHeight()) / 2.0f;
        int i3 = this.f17693R;
        if (i3 != 1) {
            if (i3 != 2) {
                bottom = 0.0f;
            } else {
                bottom -= height;
            }
        }
        float a = fzi.m12778a(bottom, ((float) i) + height, ((float) i2) - height) - height;
        view.setTranslationY(a);
        this.f17715q.setTranslationY(a);
        this.f17716r.setTranslationY(a);
    }

    /* renamed from: a */
    public final void mo11540a(int i) {
        this.f17698W = i;
        this.f17699X.setColor(i);
        GradientDrawable gradientDrawable = this.f17700Y;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.f17698W);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r4 < r5) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if ((r4 / r3.f17702a.getHeight()) >= 4) goto L_0x003a;
     */
    /* renamed from: a */
    public final void mo11541a(int i, int i2) {
        int i3;
        boolean z = true;
        if ((this.f17702a.getAdapter() instanceof fxj) && this.f17702a.getHeight() > 0) {
            fxj fxj = (fxj) this.f17702a.getAdapter();
            fxj.mo11477c(this.f17702a);
            if (i2 > 0) {
                i3 = fxj.mo11482h(i2 - 1);
            } else {
                i3 = 0;
            }
        }
        z = false;
        if (this.f17686K != z) {
            this.f17686K = z;
            m12737a(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r0 != 3) goto L_0x008b;
     */
    /* renamed from: a */
    public final boolean mo11543a(MotionEvent motionEvent) {
        if (!mo11542a()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (m12738a(motionEvent.getX(), motionEvent.getY())) {
                        long j = this.f17696U;
                        if (j >= 0 && j <= SystemClock.uptimeMillis()) {
                            m12749k();
                            m12740b(m12742c(this.f17695T));
                            return mo11546b(motionEvent);
                        }
                    } else {
                        m12748j();
                    }
                }
            }
            m12748j();
        } else if (m12738a(motionEvent.getX(), motionEvent.getY())) {
            ViewParent parent = this.f17702a.getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                if (!((ViewGroup) parent).shouldDelayChildPressedState()) {
                    parent = parent.getParent();
                } else {
                    m12749k();
                    return true;
                }
            }
            this.f17695T = motionEvent.getY();
            this.f17696U = SystemClock.uptimeMillis() + f17675m;
        }
        return false;
    }
}
