package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.cast.JGCastService;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, C1459wi, C1486xi {

    /* renamed from: b */
    public C1446vw f1085b;

    /* renamed from: c */
    public C1442vs f1086c;

    /* renamed from: d */
    public C1429vf f1087d;

    /* renamed from: e */
    private CharSequence f1088e;

    /* renamed from: f */
    private Drawable f1089f;

    /* renamed from: g */
    private C1551zt f1090g;

    /* renamed from: h */
    private boolean f1091h;

    /* renamed from: i */
    private int f1092i;

    /* renamed from: j */
    private int f1093j;

    /* renamed from: k */
    private int f1094k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private final boolean m1235f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    /* renamed from: g */
    private final void m1236g() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1088e);
        if (this.f1089f != null && ((this.f1085b.f27466m & 4) != 4 || !this.f1091h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f1088e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f1085b.f27464k;
        if (!TextUtils.isEmpty(charSequence4)) {
            setContentDescription(charSequence4);
        } else {
            if (!z3) {
                charSequence2 = this.f1085b.f27457d;
            } else {
                charSequence2 = null;
            }
            setContentDescription(charSequence2);
        }
        CharSequence charSequence5 = this.f1085b.f27465l;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.f1085b.f27457d;
            }
            aec.m594a(this, charSequence3);
            return;
        }
        aec.m594a(this, charSequence5);
    }

    /* renamed from: a */
    public final C1446vw mo1208a() {
        return this.f1085b;
    }

    /* renamed from: b */
    public final boolean mo1210b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo1211c() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: d */
    public final boolean mo1212d() {
        return mo1211c() && this.f1085b.getIcon() == null;
    }

    /* renamed from: e */
    public final boolean mo1213e() {
        return mo1211c();
    }

    public void onClick(View view) {
        C1442vs vsVar = this.f1086c;
        if (vsVar != null) {
            vsVar.mo1221a(this.f1085b);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1091h = m1235f();
        m1236g();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean c = mo1211c();
        if (c && (i4 = this.f1093j) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1092i);
        } else {
            i3 = this.f1092i;
        }
        if (mode != 1073741824 && this.f1092i > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, JGCastService.FLAG_PRIVATE_DISPLAY), i2);
        }
        if (!c && this.f1089f != null) {
            super.setPadding((getMeasuredWidth() - this.f1089f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1551zt ztVar;
        if (!this.f1085b.hasSubMenu() || (ztVar = this.f1090g) == null || !ztVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1093j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1209a(C1446vw vwVar) {
        this.f1085b = vwVar;
        Drawable icon = vwVar.getIcon();
        this.f1089f = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f1094k;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, null, null, null);
        m1236g();
        this.f1088e = vwVar.mo16278a((C1459wi) this);
        m1236g();
        setId(vwVar.f27454a);
        if (!vwVar.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(vwVar.isEnabled());
        if (vwVar.hasSubMenu() && this.f1090g == null) {
            this.f1090g = new C1428ve(this);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1091h = m1235f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27194c, i, 0);
        this.f1092i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1094k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1093j = -1;
        setSaveEnabled(false);
    }
}
