package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p002v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1469ws extends ViewGroup {

    /* renamed from: a */
    protected final C1468wr f27532a;

    /* renamed from: b */
    protected final Context f27533b;

    /* renamed from: c */
    protected ActionMenuView f27534c;

    /* renamed from: d */
    protected C1485xh f27535d;

    /* renamed from: e */
    public int f27536e;

    /* renamed from: f */
    protected C1285px f27537f;

    /* renamed from: g */
    private boolean f27538g;

    /* renamed from: h */
    private boolean f27539h;

    C1469ws(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static int m20757a(int i, int i2, boolean z) {
        return !z ? i + i2 : i - i2;
    }

    /* renamed from: a */
    public void mo1241a(int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1390tu.f27192a, C0126R.attr.actionBarStyle, 0);
        mo1241a(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1485xh xhVar = this.f27535d;
        if (xhVar != null) {
            xhVar.f27567k = C1412up.m20487a(xhVar.f27362b).mo16089a();
            C1443vt vtVar = xhVar.f27363c;
            if (vtVar != null) {
                vtVar.mo16242b(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f27539h = false;
        }
        if (!this.f27539h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f27539h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f27539h = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f27538g = false;
        }
        if (!this.f27538g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f27538g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f27538g = false;
        }
        return true;
    }

    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C1285px pxVar = this.f27537f;
            if (pxVar != null) {
                pxVar.mo15707a();
            }
            super.setVisibility(i);
        }
    }

    public C1469ws(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    protected static final int m20758a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public C1469ws(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27532a = new C1468wr(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0126R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f27533b = context;
        } else {
            this.f27533b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static final int m20759a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    /* renamed from: a */
    public final C1285px mo16448a(int i, long j) {
        C1285px pxVar = this.f27537f;
        if (pxVar != null) {
            pxVar.mo15707a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1285px m = C1280ps.m19931m(this);
            m.mo15708a(1.0f);
            m.mo15709a(j);
            C1468wr wrVar = this.f27532a;
            wrVar.mo16447a(m, 0);
            m.mo15711a(wrVar);
            return m;
        }
        C1285px m2 = C1280ps.m19931m(this);
        m2.mo15708a(0.0f);
        m2.mo15709a(j);
        C1468wr wrVar2 = this.f27532a;
        wrVar2.mo16447a(m2, i);
        m2.mo15711a(wrVar2);
        return m2;
    }
}
