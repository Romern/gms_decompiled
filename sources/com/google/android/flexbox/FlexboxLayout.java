package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FlexboxLayout extends ViewGroup implements enp {

    /* renamed from: a */
    public int f7722a;

    /* renamed from: b */
    private int f7723b;

    /* renamed from: c */
    private int f7724c;

    /* renamed from: d */
    private int f7725d;

    /* renamed from: e */
    private int f7726e;

    /* renamed from: f */
    private int f7727f;

    /* renamed from: g */
    private Drawable f7728g;

    /* renamed from: h */
    private Drawable f7729h;

    /* renamed from: i */
    private int f7730i;

    /* renamed from: j */
    private int f7731j;

    /* renamed from: k */
    private int f7732k;

    /* renamed from: l */
    private int f7733l;

    /* renamed from: m */
    private int[] f7734m;

    /* renamed from: n */
    private SparseIntArray f7735n;

    /* renamed from: o */
    private ent f7736o;

    /* renamed from: p */
    private List f7737p;

    /* renamed from: q */
    private enr f7738q;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator CREATOR = new enu();

        /* renamed from: a */
        public float f7739a = 0.0f;

        /* renamed from: b */
        public float f7740b = 1.0f;

        /* renamed from: c */
        public int f7741c = -1;

        /* renamed from: d */
        public float f7742d = -1.0f;

        /* renamed from: e */
        private int f7743e = 1;

        /* renamed from: f */
        private int f7744f;

        /* renamed from: g */
        private int f7745g;

        /* renamed from: h */
        private int f7746h = 16777215;

        /* renamed from: i */
        private int f7747i = 16777215;

        /* renamed from: j */
        private boolean f7748j;

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
        }

        /* renamed from: a */
        public final int mo6275a() {
            return this.width;
        }

        /* renamed from: b */
        public final int mo6276b() {
            return this.height;
        }

        /* renamed from: c */
        public final int mo6277c() {
            return this.f7743e;
        }

        /* renamed from: d */
        public final float mo6278d() {
            return this.f7739a;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final float mo6279e() {
            return this.f7740b;
        }

        /* renamed from: f */
        public final int mo6280f() {
            return this.f7741c;
        }

        /* renamed from: g */
        public final int mo6281g() {
            return this.f7744f;
        }

        /* renamed from: h */
        public final int mo6282h() {
            return this.f7745g;
        }

        /* renamed from: i */
        public final int mo6283i() {
            return this.f7746h;
        }

        /* renamed from: j */
        public final int mo6284j() {
            return this.f7747i;
        }

        /* renamed from: k */
        public final boolean mo6285k() {
            return this.f7748j;
        }

        /* renamed from: l */
        public final float mo6286l() {
            return this.f7742d;
        }

        /* renamed from: m */
        public final int mo6287m() {
            return this.leftMargin;
        }

        /* renamed from: n */
        public final int mo6288n() {
            return this.topMargin;
        }

        /* renamed from: o */
        public final int mo6289o() {
            return this.rightMargin;
        }

        /* renamed from: p */
        public final int mo6290p() {
            return this.bottomMargin;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7743e);
            parcel.writeFloat(this.f7739a);
            parcel.writeFloat(this.f7740b);
            parcel.writeInt(this.f7741c);
            parcel.writeFloat(this.f7742d);
            parcel.writeInt(this.f7744f);
            parcel.writeInt(this.f7745g);
            parcel.writeInt(this.f7746h);
            parcel.writeInt(this.f7747i);
            parcel.writeByte(this.f7748j ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, env.f15359b);
            this.f7743e = obtainStyledAttributes.getInt(8, 1);
            this.f7739a = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f7740b = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f7741c = obtainStyledAttributes.getInt(0, -1);
            this.f7742d = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f7744f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f7745g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f7746h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f7747i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f7748j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f7743e = parcel.readInt();
            this.f7739a = parcel.readFloat();
            this.f7740b = parcel.readFloat();
            this.f7741c = parcel.readInt();
            this.f7742d = parcel.readFloat();
            this.f7744f = parcel.readInt();
            this.f7745g = parcel.readInt();
            this.f7746h = parcel.readInt();
            this.f7747i = parcel.readInt();
            this.f7748j = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f7743e = layoutParams.f7743e;
            this.f7739a = layoutParams.f7739a;
            this.f7740b = layoutParams.f7740b;
            this.f7741c = layoutParams.f7741c;
            this.f7742d = layoutParams.f7742d;
            this.f7744f = layoutParams.f7744f;
            this.f7745g = layoutParams.f7745g;
            this.f7746h = layoutParams.f7746h;
            this.f7747i = layoutParams.f7747i;
            this.f7748j = layoutParams.f7748j;
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m4909a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = mo6314h() + getPaddingTop() + getPaddingBottom();
            i6 = mo6311g();
        } else if (i == 2 || i == 3) {
            i5 = mo6311g();
            i6 = mo6314h() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    /* renamed from: b */
    private final void m4914b(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f7728g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f7732k + i2);
            this.f7728g.draw(canvas);
        }
    }

    /* renamed from: e */
    private final boolean m4917e(int i) {
        if (i >= 0 && i < this.f7737p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((enq) this.f7737p.get(i2)).mo10328a() > 0) {
                    return mo6310f() ? (this.f7730i & 2) != 0 : (this.f7731j & 2) != 0;
                }
            }
            if (mo6310f()) {
                return (this.f7730i & 1) != 0;
            }
            if ((this.f7731j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m4918f(int i) {
        if (i >= 0 && i < this.f7737p.size()) {
            for (int i2 = i + 1; i2 < this.f7737p.size(); i2++) {
                if (((enq) this.f7737p.get(i2)).mo10328a() > 0) {
                    return false;
                }
            }
            if (mo6310f()) {
                return (this.f7730i & 4) != 0;
            }
            if ((this.f7731j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private final void mo60090l() {
        if (this.f7728g == null && this.f7729h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f7735n == null) {
            this.f7735n = new SparseIntArray(getChildCount());
        }
        ent ent = this.f7736o;
        SparseIntArray sparseIntArray = this.f7735n;
        int a = ent.f15356a.mo6291a();
        List a2 = ent.mo10333a(a);
        ens ens = new ens();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            ens.f15355b = 1;
        } else {
            ens.f15355b = ((FlexItem) layoutParams).mo6277c();
        }
        if (i == -1 || i == a) {
            ens.f15354a = a;
        } else if (i < ent.f15356a.mo6291a()) {
            ens.f15354a = i;
            for (int i2 = i; i2 < a; i2++) {
                ((ens) a2.get(i2)).f15354a++;
            }
        } else {
            ens.f15354a = a;
        }
        a2.add(ens);
        this.f7734m = ent.m10804a(a + 1, a2, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final int mo6299b() {
        return this.f7723b;
    }

    /* renamed from: c */
    public final int mo6303c() {
        return this.f7724c;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final int mo6306d() {
        return this.f7726e;
    }

    /* renamed from: e */
    public final int mo6308e() {
        return this.f7722a;
    }

    /* renamed from: e */
    public final void mo6309e(List list) {
        this.f7737p = list;
    }

    /* renamed from: f */
    public final boolean mo6310f() {
        int i = this.f7723b;
        return i == 0 || i == 1;
    }

    /* renamed from: g */
    public final int mo6311g() {
        List list = this.f7737p;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((enq) list.get(i2)).f15341e);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final int mo6314h() {
        int size = this.f7737p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            enq enq = (enq) this.f7737p.get(i2);
            if (m4917e(i2)) {
                if (mo6310f()) {
                    i += this.f7732k;
                } else {
                    i += this.f7733l;
                }
            }
            if (m4918f(i2)) {
                if (mo6310f()) {
                    i += this.f7732k;
                } else {
                    i += this.f7733l;
                }
            }
            i += enq.f15343g;
        }
        return i;
    }

    /* renamed from: i */
    public final int mo6315i() {
        return this.f7727f;
    }

    /* renamed from: j */
    public final List mo6316j() {
        return this.f7737p;
    }

    /* renamed from: k */
    public final int mo6317k() {
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.flexbox.FlexboxLayout.b(android.graphics.Canvas, boolean, boolean):void
     arg types: [android.graphics.Canvas, boolean, int]
     candidates:
      com.google.android.flexbox.FlexboxLayout.b(int, int, int):int
      enp.b(int, int, int):int
      com.google.android.flexbox.FlexboxLayout.b(android.graphics.Canvas, boolean, boolean):void */
    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f7729h != null || this.f7728g != null) {
            if (this.f7730i != 0 || this.f7731j != 0) {
                int h = C1280ps.m19923h(this);
                int i = this.f7723b;
                boolean z5 = false;
                boolean z6 = true;
                if (i == 0) {
                    if (h == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f7724c == 2) {
                        z5 = true;
                    }
                    m4911a(canvas, z, z5);
                } else if (i == 1) {
                    if (h != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f7724c == 2) {
                        z5 = true;
                    }
                    m4911a(canvas, z2, z5);
                } else if (i == 2) {
                    if (h == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.f7724c != 2) {
                        z6 = z3;
                    } else if (z3) {
                        z6 = false;
                    }
                    m4915b(canvas, z6, false);
                } else if (i == 3) {
                    if (h == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f7724c != 2) {
                        z5 = z4;
                    } else if (!z4) {
                        z5 = true;
                    }
                    m4915b(canvas, z5, true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int h = C1280ps.m19923h(this);
        int i5 = this.f7723b;
        if (i5 == 0) {
            if (h == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m4912a(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (h != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m4912a(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (h == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f7724c != 2) {
                z5 = z4;
            } else {
                z5 = !z4;
            }
            m4913a(z5, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (h == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.f7724c != 2) {
                z7 = z6;
            } else {
                z7 = !z6;
            }
            m4913a(z7, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f7723b);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dc  */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        if (this.f7735n == null) {
            this.f7735n = new SparseIntArray(getChildCount());
        }
        ent ent = this.f7736o;
        SparseIntArray sparseIntArray = this.f7735n;
        int a = ent.f15356a.mo6291a();
        if (sparseIntArray.size() == a) {
            int i6 = 0;
            while (true) {
                if (i6 < a) {
                    View a2 = ent.f15356a.mo6294a(i6);
                    if (a2 != null && ((FlexItem) a2.getLayoutParams()).mo6277c() != sparseIntArray.get(i6)) {
                        break;
                    }
                    i6++;
                } else {
                    break;
                }
            }
            i3 = this.f7723b;
            int i7 = 2;
            if (i3 != 0 || i3 == 1) {
                this.f7737p.clear();
                this.f7738q.mo10330a();
                this.f7736o.mo10339a(this.f7738q, i4, i5);
                this.f7737p = this.f7738q.f15352a;
                this.f7736o.mo10335a(i4, i5);
                if (this.f7722a == 3) {
                    List list = this.f7737p;
                    int size = list.size();
                    int i8 = 0;
                    while (i8 < size) {
                        enq enq = (enq) list.get(i8);
                        int i9 = Integer.MIN_VALUE;
                        int i10 = 0;
                        while (i10 < enq.f15344h) {
                            View c = mo6304c(enq.f15351o + i10);
                            if (!(c == null || c.getVisibility() == 8)) {
                                LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                                if (this.f7724c != i7) {
                                    i9 = Math.max(i9, c.getMeasuredHeight() + Math.max(enq.f15348l - c.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                                } else {
                                    int i11 = enq.f15348l;
                                    int measuredHeight = c.getMeasuredHeight();
                                    i9 = Math.max(i9, c.getMeasuredHeight() + layoutParams.topMargin + Math.max((i11 - measuredHeight) + c.getBaseline(), layoutParams.bottomMargin));
                                }
                            }
                            i10++;
                            i7 = 2;
                        }
                        enq.f15343g = i9;
                        i8++;
                        i7 = 2;
                    }
                }
                this.f7736o.mo10336a(i4, i5, getPaddingTop() + getPaddingBottom());
                this.f7736o.mo10334a();
                m4909a(this.f7723b, i4, i5, this.f7738q.f15353b);
            } else if (i3 == 2 || i3 == 3) {
                this.f7737p.clear();
                this.f7738q.mo10330a();
                this.f7736o.mo10339a(this.f7738q, i5, i4);
                this.f7737p = this.f7738q.f15352a;
                this.f7736o.mo10335a(i4, i5);
                this.f7736o.mo10336a(i4, i5, getPaddingLeft() + getPaddingRight());
                this.f7736o.mo10334a();
                m4909a(this.f7723b, i4, i5, this.f7738q.f15353b);
                return;
            } else {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f7723b);
            }
        }
        ent ent2 = this.f7736o;
        SparseIntArray sparseIntArray2 = this.f7735n;
        int a3 = ent2.f15356a.mo6291a();
        this.f7734m = ent.m10804a(a3, ent2.mo10333a(a3), sparseIntArray2);
        i3 = this.f7723b;
        int i72 = 2;
        if (i3 != 0) {
        }
        this.f7737p.clear();
        this.f7738q.mo10330a();
        this.f7736o.mo10339a(this.f7738q, i4, i5);
        this.f7737p = this.f7738q.f15352a;
        this.f7736o.mo10335a(i4, i5);
        if (this.f7722a == 3) {
        }
        this.f7736o.mo10336a(i4, i5, getPaddingTop() + getPaddingBottom());
        this.f7736o.mo10334a();
        m4909a(this.f7723b, i4, i5, this.f7738q.f15353b);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m4915b(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f7737p.size();
        for (int i5 = 0; i5 < size; i5++) {
            enq enq = (enq) this.f7737p.get(i5);
            for (int i6 = 0; i6 < enq.f15344h; i6++) {
                int i7 = enq.f15351o + i6;
                View c = mo6304c(i7);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m4916b(i7, i6)) {
                        if (!z2) {
                            i4 = (c.getTop() - layoutParams.topMargin) - this.f7732k;
                        } else {
                            i4 = c.getBottom() + layoutParams.bottomMargin;
                        }
                        m4914b(canvas, enq.f15337a, i4, enq.f15343g);
                    }
                    if (i6 == enq.f15344h - 1 && (this.f7730i & 4) > 0) {
                        if (z2) {
                            i3 = (c.getTop() - layoutParams.topMargin) - this.f7732k;
                        } else {
                            i3 = c.getBottom() + layoutParams.bottomMargin;
                        }
                        m4914b(canvas, enq.f15337a, i3, enq.f15343g);
                    }
                }
            }
            if (m4917e(i5)) {
                if (!z) {
                    i2 = enq.f15337a - this.f7733l;
                } else {
                    i2 = enq.f15339c;
                }
                m4910a(canvas, i2, paddingTop, max);
            }
            if (m4918f(i5) && (this.f7731j & 4) > 0) {
                if (z) {
                    i = enq.f15337a - this.f7733l;
                } else {
                    i = enq.f15339c;
                }
                m4910a(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: c */
    public final View mo6304c(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f7734m;
        if (i < iArr.length) {
            return getChildAt(iArr[i]);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo6307d(int i) {
        if (this.f7723b != i) {
            this.f7723b = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7727f = -1;
        this.f7736o = new ent(this);
        this.f7737p = new ArrayList();
        this.f7738q = new enr();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, env.f15358a, i, 0);
        this.f7723b = obtainStyledAttributes.getInt(5, 0);
        this.f7724c = obtainStyledAttributes.getInt(6, 0);
        this.f7725d = obtainStyledAttributes.getInt(7, 0);
        this.f7722a = obtainStyledAttributes.getInt(1, 4);
        this.f7726e = obtainStyledAttributes.getInt(0, 5);
        this.f7727f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            mo6296a(drawable);
            mo6302b(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            mo6296a(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            mo6302b(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.f7731j = i2;
            this.f7730i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.f7731j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.f7730i = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m4910a(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f7729h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f7733l + i, i3 + i2);
            this.f7729h.draw(canvas);
        }
    }

    /* renamed from: a */
    private final void m4911a(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f7737p.size();
        for (int i5 = 0; i5 < size; i5++) {
            enq enq = (enq) this.f7737p.get(i5);
            for (int i6 = 0; i6 < enq.f15344h; i6++) {
                int i7 = enq.f15351o + i6;
                View c = mo6304c(i7);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m4916b(i7, i6)) {
                        if (!z) {
                            i4 = (c.getLeft() - layoutParams.leftMargin) - this.f7733l;
                        } else {
                            i4 = c.getRight() + layoutParams.rightMargin;
                        }
                        m4910a(canvas, i4, enq.f15338b, enq.f15343g);
                    }
                    if (i6 == enq.f15344h - 1 && (this.f7731j & 4) > 0) {
                        if (z) {
                            i3 = (c.getLeft() - layoutParams.leftMargin) - this.f7733l;
                        } else {
                            i3 = c.getRight() + layoutParams.rightMargin;
                        }
                        m4910a(canvas, i3, enq.f15338b, enq.f15343g);
                    }
                }
            }
            if (m4917e(i5)) {
                if (!z2) {
                    i2 = enq.f15338b - this.f7732k;
                } else {
                    i2 = enq.f15340d;
                }
                m4914b(canvas, paddingLeft, i2, max);
            }
            if (m4918f(i5) && (this.f7730i & 4) > 0) {
                if (z2) {
                    i = enq.f15338b - this.f7732k;
                } else {
                    i = enq.f15340d;
                }
                m4914b(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: b */
    private final boolean m4916b(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View c = mo6304c(i - i3);
            if (c != null && c.getVisibility() != 8) {
                return mo6310f() ? (this.f7731j & 2) != 0 : (this.f7730i & 2) != 0;
            }
        }
        return mo6310f() ? (this.f7731j & 1) != 0 : (this.f7730i & 1) != 0;
    }

    /* renamed from: b */
    public final int mo6300b(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: b */
    public final View mo6301b(int i) {
        return mo6304c(i);
    }

    /* renamed from: b */
    public final void mo6302b(Drawable drawable) {
        if (drawable != this.f7729h) {
            this.f7729h = drawable;
            this.f7733l = drawable.getIntrinsicWidth();
            mo60090l();
            requestLayout();
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
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* renamed from: a */
    private final void m4912a(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        int i9;
        LayoutParams layoutParams;
        float f5;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f7737p.size();
        int i11 = 0;
        while (i11 < size) {
            enq enq = (enq) this.f7737p.get(i11);
            if (m4917e(i11)) {
                int i12 = this.f7732k;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = this.f7725d;
            int i14 = 4;
            if (i13 == 0) {
                f3 = (float) paddingLeft;
                f = (float) (i10 - paddingRight);
            } else if (i13 != 1) {
                if (i13 == 2) {
                    float f6 = ((float) (i10 - enq.f15341e)) / 2.0f;
                    f = ((float) (i10 - paddingRight)) - f6;
                    f3 = ((float) paddingLeft) + f6;
                    f2 = 0.0f;
                } else if (i13 == 3) {
                    f3 = (float) paddingLeft;
                    int a = enq.mo10328a();
                    if (a != 1) {
                        f5 = (float) (a - 1);
                    } else {
                        f5 = 1.0f;
                    }
                    f2 = ((float) (i10 - enq.f15341e)) / f5;
                    f = (float) (i10 - paddingRight);
                } else if (i13 == 4) {
                    int a2 = enq.mo10328a();
                    f2 = a2 != 0 ? ((float) (i10 - enq.f15341e)) / ((float) a2) : 0.0f;
                    float f7 = f2 / 2.0f;
                    f = ((float) (i10 - paddingRight)) - f7;
                    f3 = ((float) paddingLeft) + f7;
                } else if (i13 == 5) {
                    int a3 = enq.mo10328a();
                    f2 = a3 != 0 ? ((float) (i10 - enq.f15341e)) / ((float) (a3 + 1)) : 0.0f;
                    f3 = ((float) paddingLeft) + f2;
                    f = ((float) (i10 - paddingRight)) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f7725d);
                }
                float max = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < enq.f15344h) {
                    int i15 = enq.f15351o + i5;
                    View c = mo6304c(i15);
                    if (c == null || c.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i5;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) c.getLayoutParams();
                        float f8 = f3 + ((float) layoutParams2.leftMargin);
                        float f9 = f - ((float) layoutParams2.rightMargin);
                        if (m4916b(i15, i5)) {
                            int i16 = this.f7733l;
                            float f10 = (float) i16;
                            f8 += f10;
                            i8 = i16;
                            f4 = f9 - f10;
                        } else {
                            f4 = f9;
                            i8 = 0;
                        }
                        if (i5 != enq.f15344h - 1 || (this.f7731j & i14) <= 0) {
                            i9 = 0;
                        } else {
                            i9 = this.f7733l;
                        }
                        if (this.f7724c == 2) {
                            i6 = paddingLeft;
                            i7 = i5;
                            layoutParams = layoutParams2;
                            if (!z) {
                                this.f7736o.mo10337a(c, enq, Math.round(f8), paddingBottom - c.getMeasuredHeight(), Math.round(f8) + c.getMeasuredWidth(), paddingBottom);
                            } else {
                                this.f7736o.mo10337a(c, enq, Math.round(f4) - c.getMeasuredWidth(), paddingBottom - c.getMeasuredHeight(), Math.round(f4), paddingBottom);
                            }
                        } else if (!z) {
                            i7 = i5;
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            this.f7736o.mo10337a(c, enq, Math.round(f8), paddingTop, Math.round(f8) + c.getMeasuredWidth(), paddingTop + c.getMeasuredHeight());
                        } else {
                            i6 = paddingLeft;
                            i7 = i5;
                            layoutParams = layoutParams2;
                            this.f7736o.mo10337a(c, enq, Math.round(f4) - c.getMeasuredWidth(), paddingTop, Math.round(f4), paddingTop + c.getMeasuredHeight());
                        }
                        f3 = f8 + ((float) c.getMeasuredWidth()) + max + ((float) layoutParams.rightMargin);
                        float measuredWidth = f4 - ((((float) c.getMeasuredWidth()) + max) + ((float) layoutParams.leftMargin));
                        if (z) {
                            enq.mo10329a(c, i9, 0, i8, 0);
                        } else {
                            enq.mo10329a(c, i8, 0, i9, 0);
                        }
                        f = measuredWidth;
                    }
                    i5 = i7 + 1;
                    paddingLeft = i6;
                    i14 = 4;
                }
                int i17 = enq.f15343g;
                paddingTop += i17;
                paddingBottom -= i17;
                i11++;
                paddingLeft = paddingLeft;
            } else {
                int i18 = enq.f15341e;
                f = (float) (i18 - paddingLeft);
                f3 = (float) ((i10 - i18) + paddingRight);
            }
            f2 = 0.0f;
            float max2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < enq.f15344h) {
            }
            int i172 = enq.f15343g;
            paddingTop += i172;
            paddingBottom -= i172;
            i11++;
            paddingLeft = paddingLeft;
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
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* renamed from: a */
    private final void m4913a(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        int i8;
        float f6;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int i10 = (i3 - i) - paddingRight;
        int size = this.f7737p.size();
        for (int i11 = 0; i11 < size; i11++) {
            enq enq = (enq) this.f7737p.get(i11);
            if (m4917e(i11)) {
                int i12 = this.f7733l;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = this.f7725d;
            int i14 = 4;
            if (i13 == 0) {
                f3 = (float) paddingTop;
                f = (float) (i9 - paddingBottom);
            } else if (i13 != 1) {
                if (i13 == 2) {
                    float f7 = ((float) (i9 - enq.f15341e)) / 2.0f;
                    f = ((float) (i9 - paddingBottom)) - f7;
                    f3 = ((float) paddingTop) + f7;
                    f2 = 0.0f;
                } else if (i13 == 3) {
                    f3 = (float) paddingTop;
                    int a = enq.mo10328a();
                    if (a != 1) {
                        f6 = (float) (a - 1);
                    } else {
                        f6 = 1.0f;
                    }
                    f2 = ((float) (i9 - enq.f15341e)) / f6;
                    f = (float) (i9 - paddingBottom);
                } else if (i13 == 4) {
                    int a2 = enq.mo10328a();
                    f2 = a2 != 0 ? ((float) (i9 - enq.f15341e)) / ((float) a2) : 0.0f;
                    float f8 = f2 / 2.0f;
                    f = ((float) (i9 - paddingBottom)) - f8;
                    f3 = ((float) paddingTop) + f8;
                } else if (i13 == 5) {
                    int a3 = enq.mo10328a();
                    f2 = a3 != 0 ? ((float) (i9 - enq.f15341e)) / ((float) (a3 + 1)) : 0.0f;
                    f3 = ((float) paddingTop) + f2;
                    f = ((float) (i9 - paddingBottom)) - f2;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f7725d);
                }
                float max = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < enq.f15344h) {
                    int i15 = enq.f15351o + i5;
                    View c = mo6304c(i15);
                    if (c == null || c.getVisibility() == 8) {
                        i6 = i5;
                    } else {
                        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                        float f9 = f3 + ((float) layoutParams.topMargin);
                        float f10 = f - ((float) layoutParams.bottomMargin);
                        if (m4916b(i15, i5)) {
                            int i16 = this.f7732k;
                            float f11 = (float) i16;
                            f5 = f9 + f11;
                            i7 = i16;
                            f4 = f10 - f11;
                        } else {
                            f5 = f9;
                            f4 = f10;
                            i7 = 0;
                        }
                        if (i5 != enq.f15344h - 1 || (this.f7730i & i14) <= 0) {
                            i8 = 0;
                        } else {
                            i8 = this.f7732k;
                        }
                        if (z) {
                            i6 = i5;
                            if (!z2) {
                                this.f7736o.mo10338a(c, enq, true, i10 - c.getMeasuredWidth(), Math.round(f5), i10, Math.round(f5) + c.getMeasuredHeight());
                            } else {
                                this.f7736o.mo10338a(c, enq, true, i10 - c.getMeasuredWidth(), Math.round(f4) - c.getMeasuredHeight(), i10, Math.round(f4));
                            }
                        } else if (!z2) {
                            i6 = i5;
                            this.f7736o.mo10338a(c, enq, false, paddingLeft, Math.round(f5), paddingLeft + c.getMeasuredWidth(), Math.round(f5) + c.getMeasuredHeight());
                        } else {
                            i6 = i5;
                            this.f7736o.mo10338a(c, enq, false, paddingLeft, Math.round(f4) - c.getMeasuredHeight(), paddingLeft + c.getMeasuredWidth(), Math.round(f4));
                        }
                        float measuredHeight = f5 + ((float) c.getMeasuredHeight()) + max + ((float) layoutParams.bottomMargin);
                        float measuredHeight2 = f4 - ((((float) c.getMeasuredHeight()) + max) + ((float) layoutParams.topMargin));
                        if (z2) {
                            enq.mo10329a(c, 0, i8, 0, i7);
                        } else {
                            enq.mo10329a(c, 0, i7, 0, i8);
                        }
                        f3 = measuredHeight;
                        f = measuredHeight2;
                    }
                    i5 = i6 + 1;
                    i14 = 4;
                }
                int i17 = enq.f15343g;
                paddingLeft += i17;
                i10 -= i17;
            } else {
                int i18 = enq.f15341e;
                f = (float) (i18 - paddingTop);
                f3 = (float) ((i9 - i18) + paddingBottom);
            }
            f2 = 0.0f;
            float max2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < enq.f15344h) {
            }
            int i172 = enq.f15343g;
            paddingLeft += i172;
            i10 -= i172;
        }
    }

    /* renamed from: a */
    public final int mo6291a() {
        return getChildCount();
    }

    /* renamed from: a */
    public final int mo6292a(int i, int i2) {
        int i3 = 0;
        if (mo6310f()) {
            if (m4916b(i, i2)) {
                i3 = this.f7733l;
            }
            if ((this.f7731j & 4) > 0) {
                return i3 + this.f7733l;
            }
        } else {
            if (m4916b(i, i2)) {
                i3 = this.f7732k;
            }
            if ((this.f7730i & 4) > 0) {
                return i3 + this.f7732k;
            }
        }
        return i3;
    }

    /* renamed from: a */
    public final int mo6293a(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: a */
    public final View mo6294a(int i) {
        return getChildAt(i);
    }

    /* renamed from: a */
    public final void mo6295a(int i, int i2, enq enq) {
        int i3;
        int i4;
        if (m4916b(i, i2)) {
            if (mo6310f()) {
                i3 = enq.f15341e;
                i4 = this.f7733l;
            } else {
                i3 = enq.f15341e;
                i4 = this.f7732k;
            }
            enq.f15341e = i3 + i4;
            enq.f15342f += i4;
        }
    }

    /* renamed from: a */
    public final void mo6296a(Drawable drawable) {
        if (drawable != this.f7728g) {
            this.f7728g = drawable;
            this.f7732k = drawable.getIntrinsicHeight();
            mo60090l();
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo6297a(enq enq) {
        int i;
        int i2;
        if (mo6310f()) {
            if ((this.f7731j & 4) > 0) {
                i = enq.f15341e;
                i2 = this.f7733l;
            } else {
                return;
            }
        } else if ((this.f7730i & 4) > 0) {
            i = enq.f15341e;
            i2 = this.f7732k;
        } else {
            return;
        }
        enq.f15341e = i + i2;
        enq.f15342f += i2;
    }
}
