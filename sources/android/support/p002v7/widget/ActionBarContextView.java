package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: android.support.v7.widget.ActionBarContextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionBarContextView extends C1469ws {

    /* renamed from: g */
    public CharSequence f1123g;

    /* renamed from: h */
    public CharSequence f1124h;

    /* renamed from: i */
    public View f1125i;

    /* renamed from: j */
    public boolean f1126j;

    /* renamed from: k */
    private View f1127k;

    /* renamed from: l */
    private LinearLayout f1128l;

    /* renamed from: m */
    private TextView f1129m;

    /* renamed from: n */
    private TextView f1130n;

    /* renamed from: o */
    private int f1131o;

    /* renamed from: p */
    private int f1132p;

    /* renamed from: q */
    private int f1133q;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private final void m1252c() {
        if (this.f1128l == null) {
            LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1128l = linearLayout;
            this.f1129m = (TextView) linearLayout.findViewById(C0126R.C0129id.action_bar_title);
            this.f1130n = (TextView) this.f1128l.findViewById(C0126R.C0129id.action_bar_subtitle);
            if (this.f1131o != 0) {
                this.f1129m.setTextAppearance(getContext(), this.f1131o);
            }
            if (this.f1132p != 0) {
                this.f1130n.setTextAppearance(getContext(), this.f1132p);
            }
        }
        this.f1129m.setText(this.f1123g);
        this.f1130n.setText(this.f1124h);
        boolean z = !TextUtils.isEmpty(this.f1123g);
        boolean isEmpty = TextUtils.isEmpty(this.f1124h);
        boolean z2 = !isEmpty;
        int i = 8;
        this.f1130n.setVisibility(!isEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.f1128l;
        if (z) {
            i = 0;
        } else if (z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.f1128l.getParent() == null) {
            addView(this.f1128l);
        }
    }

    /* renamed from: a */
    public final void mo1240a() {
        removeAllViews();
        this.f1127k = null;
        this.f27534c = null;
    }

    /* renamed from: a */
    public final void mo1241a(int i) {
        this.f27536e = i;
    }

    /* renamed from: b */
    public final void mo1246b() {
        C1485xh xhVar = this.f27535d;
        if (xhVar != null) {
            xhVar.mo16470c();
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1485xh xhVar = this.f27535d;
        if (xhVar != null) {
            xhVar.mo16471d();
            this.f27535d.mo16476j();
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1123g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = aek.m624a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1125i;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1125i.getLayoutParams();
            int i5 = !a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i6 = !a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int a2 = C1469ws.m20757a(paddingRight, i5, a);
            paddingRight = C1469ws.m20757a(a2 + C1469ws.m20759a(this.f1125i, a2, paddingTop, paddingTop2, a), i6, a);
        }
        LinearLayout linearLayout = this.f1128l;
        if (!(linearLayout == null || this.f1127k != null || linearLayout.getVisibility() == 8)) {
            paddingRight += C1469ws.m20759a(this.f1128l, paddingRight, paddingTop, paddingTop2, a);
        }
        View view2 = this.f1127k;
        if (view2 != null) {
            C1469ws.m20759a(view2, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingRight2 = !a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        ActionMenuView actionMenuView = this.f27534c;
        if (actionMenuView != null) {
            C1469ws.m20759a(actionMenuView, paddingRight2, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i);
        int i6 = JGCastService.FLAG_PRIVATE_DISPLAY;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i7 = this.f27536e;
            if (i7 <= 0) {
                i7 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i8 = i7 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            View view = this.f1125i;
            if (view != null) {
                int a = C1469ws.m20758a(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1125i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f27534c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = C1469ws.m20758a(this.f27534c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1128l;
            if (linearLayout != null && this.f1127k == null) {
                if (this.f1126j) {
                    this.f1128l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1128l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        i4 = paddingLeft - measuredWidth;
                    } else {
                        i4 = paddingLeft;
                    }
                    LinearLayout linearLayout2 = this.f1128l;
                    if (measuredWidth > paddingLeft) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    linearLayout2.setVisibility(i5);
                    paddingLeft = i4;
                } else {
                    paddingLeft = C1469ws.m20758a(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1127k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams.width != -2) {
                    i3 = JGCastService.FLAG_PRIVATE_DISPLAY;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i8 = Math.min(layoutParams.height, i8);
                }
                this.f1127k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i8, i6));
            }
            if (this.f27536e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i7);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.actionModeStyle);
    }

    /* renamed from: b */
    public final void mo1247b(CharSequence charSequence) {
        this.f1124h = charSequence;
        m1252c();
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        adr a = adr.m523a(context, attributeSet, C1390tu.f27195d, i, 0);
        C1280ps.m19890a(this, a.mo449a(0));
        this.f1131o = a.mo460f(5, 0);
        this.f1132p = a.mo460f(4, 0);
        this.f27536e = a.mo458e(3, 0);
        this.f1133q = a.mo460f(2, C0126R.C0128layout.abc_action_mode_close_item_material);
        a.mo450a();
    }

    /* renamed from: a */
    public final void mo1242a(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1127k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1127k = view;
        if (!(view == null || (linearLayout = this.f1128l) == null)) {
            removeView(linearLayout);
            this.f1128l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void mo1243a(CharSequence charSequence) {
        this.f1123g = charSequence;
        m1252c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.support.v7.widget.ActionBarContextView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.support.v7.widget.ActionBarContextView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo1244a(C1414ur urVar) {
        View view = this.f1125i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1133q, (ViewGroup) this, false);
            this.f1125i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1125i);
        }
        this.f1125i.findViewById(C0126R.C0129id.action_mode_close_button).setOnClickListener(new C1471wu(urVar));
        C1443vt vtVar = (C1443vt) urVar.mo16027b();
        C1485xh xhVar = this.f27535d;
        if (xhVar != null) {
            xhVar.mo16473g();
        }
        this.f27535d = new C1485xh(getContext());
        this.f27535d.mo16475i();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        vtVar.mo16225a(this.f27535d, this.f27533b);
        C1485xh xhVar2 = this.f27535d;
        C1460wj wjVar = xhVar2.f27366f;
        if (xhVar2.f27366f == null) {
            xhVar2.f27366f = (C1460wj) xhVar2.f27364d.inflate((int) C0126R.C0128layout.abc_action_menu_layout, (ViewGroup) this, false);
            xhVar2.f27366f.mo1220a(xhVar2.f27363c);
            xhVar2.mo470a(true);
        }
        C1460wj wjVar2 = xhVar2.f27366f;
        if (wjVar != wjVar2) {
            ((ActionMenuView) wjVar2).mo1300a(xhVar2);
        }
        this.f27534c = (ActionMenuView) wjVar2;
        C1280ps.m19890a(this.f27534c, (Drawable) null);
        addView(this.f27534c, layoutParams);
    }

    /* renamed from: a */
    public final void mo1245a(boolean z) {
        if (z != this.f1126j) {
            requestLayout();
        }
        this.f1126j = z;
    }
}
