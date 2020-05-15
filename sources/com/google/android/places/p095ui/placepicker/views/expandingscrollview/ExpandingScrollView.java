package com.google.android.places.p095ui.placepicker.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import com.google.android.cast.JGCastService;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExpandingScrollView extends bino {

    /* renamed from: a */
    public int f151440a;

    /* renamed from: b */
    public binm f151441b;

    /* renamed from: c */
    public binq f151442c = binq.f121026a;

    /* renamed from: d */
    public binq f151443d;

    /* renamed from: e */
    public final Set f151444e = bnpf.m110060e();

    /* renamed from: f */
    final Set f151445f = bnpf.m110060e();

    /* renamed from: g */
    public View f151446g;

    /* renamed from: r */
    private final int f151447r;

    /* renamed from: s */
    private biny f151448s = biny.f121034a;

    /* renamed from: t */
    private biny f151449t = biny.f121034a;

    /* renamed from: u */
    private biny f151450u = biny.f121035b;

    /* renamed from: v */
    private binq f151451v;

    /* renamed from: w */
    private binq f151452w;

    /* renamed from: x */
    private final float[] f151453x = new float[binq.values().length];

    /* renamed from: y */
    private final int[] f151454y = new int[binq.values().length];

    /* renamed from: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new binl();

        /* renamed from: a */
        public final binq f151455a;

        /* renamed from: b */
        public final float[] f151456b;

        /* renamed from: c */
        public final int[] f151457c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f151455a = binq.m102623a(parcel.readString());
            this.f151456b = parcel.createFloatArray();
            this.f151457c = parcel.createIntArray();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f151455a.toString());
            parcel.writeFloatArray(this.f151456b);
            parcel.writeIntArray(this.f151457c);
        }

        public SavedState(Parcelable parcelable, binq binq, float[] fArr, int[] iArr) {
            super(parcelable);
            this.f151455a = binq;
            this.f151456b = fArr;
            this.f151457c = iArr;
        }
    }

    static {
        ExpandingScrollView.class.getSimpleName();
    }

    public ExpandingScrollView(Context context) {
        super(context);
        Resources resources = getResources();
        m117779a(resources.getConfiguration());
        this.f151441b = new binm(this, new binj(this), new bink(this));
        this.f151447r = (int) (resources.getDisplayMetrics().density * 400.0f);
        mo71324a();
        setClipChildren(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    /* renamed from: a */
    private final void m117779a(Configuration configuration) {
        biny biny;
        if (configuration.orientation == 2) {
            biny = this.f151450u;
        } else {
            biny = this.f151449t;
        }
        this.f151448s = biny;
        mo71326a(this.f151442c, false);
    }

    /* renamed from: e */
    private final void m117781e(binq binq) {
        binq binq2 = this.f151442c;
        this.f151442c = binq;
        mo71329b();
        if (this.f151442c != binq2) {
            for (bioa bioa : this.f151444e) {
                bioa.mo64779b(this.f151442c);
            }
        }
    }

    /* renamed from: f */
    private final void m117782f(binq binq) {
        int round = Math.round((((float) this.f151440a) * this.f151453x[binq.ordinal()]) / 100.0f);
        int ordinal = binq.ordinal();
        int[] iArr = this.f151454y;
        if (iArr[ordinal] != round) {
            iArr[ordinal] = round;
            for (int i = ordinal - 1; i >= 0; i--) {
                int[] iArr2 = this.f151454y;
                if (iArr2[i] > round) {
                    iArr2[i] = round;
                }
            }
            int i2 = ordinal + 1;
            while (true) {
                int[] iArr3 = this.f151454y;
                if (i2 >= iArr3.length) {
                    break;
                }
                if (iArr3[i2] < round) {
                    iArr3[i2] = round;
                }
                i2++;
            }
            mo71329b();
            if (this.f121022n) {
                int scrollY = getScrollY();
                while (scrollY < mo71328b(mo71331d(this.f151442c))) {
                    binq binq2 = this.f151442c;
                    if (binq2 == mo71331d(binq2)) {
                        break;
                    }
                    m117781e(mo71331d(this.f151442c));
                }
                while (scrollY > mo71328b(mo71330c(this.f151442c))) {
                    binq binq3 = this.f151442c;
                    if (binq3 != mo71330c(binq3)) {
                        m117781e(mo71330c(this.f151442c));
                    } else {
                        return;
                    }
                }
            } else if (this.f151442c == binq) {
                mo64806a(mo71328b(binq), true, this.f121024p);
            }
        }
    }

    /* renamed from: b */
    public final int mo71328b(binq binq) {
        return this.f151454y[binq.ordinal()];
    }

    /* renamed from: c */
    public final binq mo71330c(binq binq) {
        return this.f151448s.mo64816a(binq.f121032f);
    }

    /* renamed from: d */
    public final binq mo71331d(binq binq) {
        return this.f151448s.mo64817b(binq);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        binq binq = this.f151442c;
        m117779a(configuration);
        binq binq2 = this.f151442c;
        if (binq2 == binq) {
            binq binq3 = this.f151451v;
            if (binq3 != null && this.f151448s.f121037d.contains(binq3)) {
                if (this.f151442c == this.f151452w) {
                    mo71326a(this.f151451v, false);
                }
                binq2 = null;
                this.f151451v = null;
            } else {
                return;
            }
        } else {
            this.f151451v = binq;
        }
        this.f151452w = binq2;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = (i4 - i2) / 2;
        int i6 = this.f151440a;
        if (i6 != i5) {
            this.f151440a = i5;
            z2 = true;
        } else {
            i5 = i6;
            z2 = false;
        }
        int i7 = i3 - i;
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(getPaddingLeft(), i5, i7 - getPaddingRight(), measuredHeight);
            i8++;
            i5 = measuredHeight;
        }
        binq binq = binq.f121027b;
        if (binq == this.f151448s.mo64816a(binq)) {
            View view = this.f151446g;
            if (view instanceof biob) {
                ((biob) view).mo64820a();
            }
        }
        mo71329b();
        if (z2) {
            binq[] values = binq.values();
            for (binq binq2 : values) {
                if (this.f151453x[binq2.ordinal()] != -1.0f) {
                    m117782f(binq2);
                }
            }
            if (this.f121025q.isFinished()) {
                mo71326a(this.f151442c, false);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, makeMeasureSpec);
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + size);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f151442c = savedState.f151455a;
        for (int i = 0; i < binq.values().length; i++) {
            this.f151453x[i] = savedState.f151456b[i];
            this.f151454y[i] = savedState.f151457c[i];
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f151442c, this.f151453x, this.f151454y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        if (r0.f121002c.f151448s == p000.biny.f121036c) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r0.f121010k == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        if (r1 != null) goto L_0x0162;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019a  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        binm binm = this.f151441b;
        binq binq = binm.f121002c.f151442c;
        if (binq == binq.f121026a) {
            return false;
        }
        ExpandingScrollView expandingScrollView = binm.f121002c;
        int scrollY = expandingScrollView.f151440a - expandingScrollView.getScrollY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (binq != binq.f121028c || y >= ((float) scrollY) || motionEvent.getAction() != 1 || Math.abs(motionEvent.getX() - binm.f121005f) >= ((float) binm.f121000a) || Math.abs(motionEvent.getY() - binm.f121006g) >= ((float) binm.f121000a)) {
            if (motionEvent.getAction() == 0) {
                binm.f121005f = x;
                binm.f121006g = y;
                binm.f121007h = y - ((float) scrollY);
                binm.f121009j = -1.0f;
                binm.f121010k = false;
            }
            ExpandingScrollView expandingScrollView2 = binm.f121002c;
            int scrollY2 = expandingScrollView2.f151440a - expandingScrollView2.getScrollY();
            int action = motionEvent.getAction();
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (action == 0) {
                i = (y2 >= ((float) scrollY2) || binm.f121002c.f151442c == binq.f121028c) ? 2 : 1;
            } else {
                if (binm.f121011l == 2) {
                    float abs = Math.abs(x2 - binm.f121005f);
                    float abs2 = Math.abs(y2 - binm.f121006g);
                    float f = (float) binm.f121001b;
                    if (abs2 > ((float) binm.f121000a)) {
                        i = 4;
                    } else if (abs > f) {
                        i = 3;
                    }
                }
                i = binm.f121011l;
            }
            binm.f121011l = i;
            if (i == 1) {
                return false;
            }
            MotionEvent motionEvent2 = binm.f121004e.f120996a;
            if (binm.f121002c.f151446g != null) {
                int action2 = motionEvent.getAction();
                float y3 = motionEvent.getY();
                if (action2 != 0) {
                    if (action2 == 1) {
                        int i2 = binm.f121011l;
                        if (i2 != 2) {
                            if (i2 == 4) {
                            }
                        }
                    } else if (action2 == 2 && binm.f121011l == 4) {
                        if (binm.f121002c.getScrollY() >= binm.f121002c.mo71328b(binq.f121029d)) {
                            if (y3 >= binm.f121008i) {
                                if (!binm.m102611a(binm.f121002c.f151446g, (int) binm.f121005f, (int) binm.f121007h)) {
                                }
                            }
                        }
                    }
                }
                binm.f121003d.mo64796a();
                if (binm.f121011l != 4) {
                    float f2 = binm.f121009j;
                    if (f2 != -1.0f) {
                        motionEvent.offsetLocation(0.0f, f2 - y);
                        if (motionEvent2 != null && Math.abs(motionEvent.getY() - binm.f121009j) > ((float) binm.f121000a)) {
                            binm.f121010k = true;
                        }
                        if (binm.f121009j == -1.0f) {
                            binm.f121009j = motionEvent.getY();
                        }
                        binm.f121004e.mo64797a(motionEvent);
                        binm.f121008i = y;
                        return true;
                    }
                }
                motionEvent.offsetLocation(0.0f, (float) (-scrollY));
                binm.f121010k = true;
                if (binm.f121009j == -1.0f) {
                }
                binm.f121004e.mo64797a(motionEvent);
                binm.f121008i = y;
                return true;
            }
            binm.f121004e.mo64796a();
            binm.f121009j = -1.0f;
            binm.f121010k = false;
            binm.f121003d.mo64797a(motionEvent);
            binm.f121008i = y;
            return true;
        }
        Iterator it = binm.f121002c.f151445f.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((binz) it.next()).mo64818a()) {
                    break;
                }
            } else {
                binm.f121002c.mo71325a(binq.f121027b);
                break;
            }
        }
        for (binz binz : binm.f121002c.f151445f) {
            binz.mo64819b();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo71329b() {
        if (this.f151442c == binq.f121026a) {
            int b = mo71328b(binq.f121026a);
            mo64805a(b, b);
            return;
        }
        mo64805a(mo71328b((binq) Collections.min(this.f151448s.f121037d)), mo71328b((binq) Collections.max(this.f151448s.f121037d)));
    }

    /* renamed from: d */
    public final void mo64811d() {
        this.f151443d = null;
        for (bioa bioa : this.f151444e) {
            bioa.mo64776a(this.f151442c);
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (!this.f151444e.isEmpty()) {
            mo71327a(this.f151444e);
        }
    }

    /* renamed from: c */
    public final void mo64809c() {
        this.f151443d = this.f151442c;
        for (bioa bioa : this.f151444e) {
            bioa.mo64780c();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m117780a(ExpandingScrollView expandingScrollView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (expandingScrollView.f121021m == null) {
            expandingScrollView.f121021m = VelocityTracker.obtain();
        }
        expandingScrollView.f121021m.addMovement(motionEvent);
        if (expandingScrollView.f121022n) {
            if (action != 1) {
                if (action == 2) {
                    float f = expandingScrollView.f121016h[1];
                    expandingScrollView.mo64808b(motionEvent);
                    expandingScrollView.mo64804a(expandingScrollView.getScrollY() + Math.round(f - expandingScrollView.f121016h[1]));
                    expandingScrollView.f121023o = false;
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            expandingScrollView.f121022n = false;
            if (action == 3 || expandingScrollView.getChildCount() <= 0) {
                expandingScrollView.mo64803a(0.0f);
            } else {
                expandingScrollView.f121021m.computeCurrentVelocity(1000, (float) expandingScrollView.f121018j);
                float yVelocity = expandingScrollView.f121021m.getYVelocity();
                int i = expandingScrollView.f121019k;
                if (yVelocity <= ((float) i) && yVelocity >= ((float) (-i))) {
                    expandingScrollView.mo64803a(0.0f);
                } else {
                    float f2 = -yVelocity;
                    expandingScrollView.f121020l = f2;
                    int scrollX = expandingScrollView.getScrollX();
                    int scrollY = expandingScrollView.getScrollY();
                    Scroller scroller = expandingScrollView.f121025q;
                    int[] iArr = expandingScrollView.f121017i;
                    scroller.fling(scrollX, scrollY, 0, (int) f2, 0, 0, iArr[0], iArr[1]);
                    expandingScrollView.invalidate();
                }
            }
            VelocityTracker velocityTracker = expandingScrollView.f121021m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                expandingScrollView.f121021m = null;
            }
            expandingScrollView.f121023o = false;
        } else if (!super.mo64807a(motionEvent) && action == 1 && expandingScrollView.f121023o) {
            expandingScrollView.f121023o = false;
            expandingScrollView.performClick();
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        m117779a(resources.getConfiguration());
        this.f151441b = new binm(this, new binj(this), new bink(this));
        this.f151447r = (int) (resources.getDisplayMetrics().density * 400.0f);
        mo71324a();
        setClipChildren(false);
    }

    /* renamed from: a */
    public final void mo71324a() {
        boolean z;
        binq[] values = binq.values();
        for (binq binq : values) {
            float f = binq.f121033g;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "percentage may not be negative");
            this.f151453x[binq.ordinal()] = f;
            m117782f(binq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64803a(float f) {
        binq binq;
        if (this.f151442c != binq.f121026a) {
            if (Math.abs(f) > ((float) this.f151447r)) {
                int scrollY = (int) ((f * 0.3f) + ((float) getScrollY()));
                bngx bngx = this.f151448s.f121037d;
                int size = bngx.size();
                int i = 0;
                binq = null;
                int i2 = Integer.MAX_VALUE;
                while (i < size) {
                    binq binq2 = (binq) bngx.get(i);
                    int abs = Math.abs(mo71328b(binq2) - scrollY);
                    int i3 = abs < i2 ? abs : i2;
                    if (abs < i2) {
                        binq = binq2;
                    }
                    i++;
                    i2 = i3;
                }
            } else {
                binq = this.f151442c;
                binq c = getScrollY() > mo71328b(this.f151442c) ? mo71330c(this.f151442c) : mo71331d(this.f151442c);
                binq binq3 = this.f151442c;
                if (c != binq3) {
                    int b = mo71328b(binq3);
                    if (((float) (getScrollY() - b)) / ((float) (mo71328b(c) - b)) > 0.2f) {
                        binq = c;
                    }
                }
            }
            mo71325a(binq);
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        m117779a(resources.getConfiguration());
        this.f151441b = new binm(this, new binj(this), new bink(this));
        this.f151447r = (int) (resources.getDisplayMetrics().density * 400.0f);
        mo71324a();
        setClipChildren(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void
     arg types: [binq, int]
     candidates:
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView, android.view.MotionEvent):void
      bino.a(int, int):void
      com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView.a(binq, boolean):void */
    /* renamed from: a */
    public final void mo71325a(binq binq) {
        mo71326a(binq, true);
    }

    /* renamed from: a */
    public final void mo71326a(binq binq, boolean z) {
        int i;
        if (z) {
            i = this.f121024p;
        } else {
            i = 0;
        }
        binq a = this.f151448s.mo64816a(binq);
        m117781e(a);
        int b = mo71328b(a);
        if (i > 0) {
            mo64806a(b, false, i);
        } else {
            mo64804a(b);
        }
    }

    /* renamed from: a */
    public final void mo71327a(Iterable iterable) {
        binq binq;
        int scrollY = getScrollY();
        int i = 0;
        binq binq2 = binq.values()[0];
        if (this.f151440a > 0) {
            binq[] values = binq.values();
            int length = values.length;
            while (i < length) {
                binq binq3 = values[i];
                if (scrollY < mo71328b(binq3)) {
                    break;
                }
                i++;
                binq2 = binq3;
            }
        }
        float f = 0.0f;
        if (mo71328b(binq2) == this.f151440a) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((bioa) it.next()).mo64777a(binq2, 0.0f);
            }
            return;
        }
        int b = mo71328b(binq2);
        if (binq2 == binq.f121026a) {
            binq = binq.f121027b;
        } else {
            binq = mo71330c(binq2);
        }
        int b2 = mo71328b(binq);
        if (b2 != b) {
            f = (((float) scrollY) - ((float) b)) / ((float) (b2 - b));
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            ((bioa) it2.next()).mo64777a(binq2, f);
        }
    }
}
