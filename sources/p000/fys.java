package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: fys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fys extends ScrollView {

    /* renamed from: a */
    public abh f17650a;

    /* renamed from: b */
    public final ArrayList f17651b = new ArrayList();

    /* renamed from: c */
    public final LinearLayout f17652c;

    /* renamed from: d */
    public final fyr f17653d;

    /* renamed from: e */
    private final int f17654e;

    /* renamed from: f */
    private boolean f17655f;

    /* renamed from: g */
    private boolean f17656g;

    /* renamed from: h */
    private int f17657h;

    public fys(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842801});
        setBackgroundColor(obtainStyledAttributes.getColor(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17652c = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f17652c, new FrameLayout.LayoutParams(-1, -2));
        this.f17653d = new fyr(this);
        this.f17654e = context.getResources().getDimensionPixelSize(C0126R.dimen.appinvite_overscroll_resistance);
    }

    /* renamed from: a */
    public final void mo11520a() {
        this.f17652c.removeAllViews();
        this.f17651b.clear();
        for (int i = 0; i < this.f17650a.mo161a(); i++) {
            abh abh = this.f17650a;
            acm b = abh.mo172b(this, abh.mo162a(i));
            this.f17650a.mo176b(b, i);
            LinearLayout linearLayout = this.f17652c;
            View view = b.f201a;
            linearLayout.addView(view, view.getLayoutParams());
            this.f17651b.add(b);
        }
    }

    public final boolean canScrollVertically(int i) {
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            this.f17655f = false;
            if (getHeight() + getScrollY() >= this.f17652c.getHeight()) {
                z = true;
            } else {
                z = false;
            }
            this.f17656g = z;
            this.f17657h = 0;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f17655f || getVisibility() == 8) && (getParent() instanceof fyt)) {
            return ((fyt) getParent()).mo11527a(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f17655f || !(getParent() instanceof fyt)) {
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(0);
        return ((fyt) getParent()).mo11527a(obtain);
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (z && (getParent() instanceof fyt)) {
            if (i2 >= 0) {
                int i9 = (i2 + i4) - (i6 + i8);
                if (i9 > 0) {
                    int i10 = this.f17657h + i9;
                    this.f17657h = i10;
                    if (this.f17656g || i10 > this.f17654e) {
                        ((fyt) getParent()).f17664g.mo11432a(false);
                        this.f17655f = true;
                    }
                }
            } else {
                this.f17656g = false;
                this.f17657h = 0;
                if (i2 + i4 < i8) {
                    this.f17655f = true;
                }
            }
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
