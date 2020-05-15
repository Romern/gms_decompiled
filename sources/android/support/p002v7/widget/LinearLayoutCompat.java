package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: android.support.v7.widget.LinearLayoutCompat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f1209a;

    /* renamed from: b */
    private int f1210b;

    /* renamed from: c */
    private int f1211c;

    /* renamed from: d */
    private int f1212d;

    /* renamed from: e */
    private int f1213e;

    /* renamed from: f */
    public int f1214f;

    /* renamed from: g */
    public Drawable f1215g;

    /* renamed from: h */
    public int f1216h;

    /* renamed from: i */
    private float f1217i;

    /* renamed from: j */
    private boolean f1218j;

    /* renamed from: k */
    private int[] f1219k;

    /* renamed from: l */
    private int[] f1220l;

    /* renamed from: m */
    private int f1221m;

    /* renamed from: n */
    private int f1222n;

    /* renamed from: o */
    private int f1223o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static void m1305a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: b */
    public aac generateLayoutParams(AttributeSet attributeSet) {
        return new aac(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public aac generateDefaultLayoutParams() {
        int i = this.f1212d;
        if (i == 0) {
            return new aac(-2);
        }
        if (i == 1) {
            return new aac(-1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aac;
    }

    /* renamed from: d */
    public final void mo1410d(int i) {
        if (this.f1212d != i) {
            this.f1212d = i;
            requestLayout();
        }
    }

    /* renamed from: e */
    public final void mo1411e() {
        this.f1209a = false;
    }

    public final int getBaseline() {
        int i;
        if (this.f1210b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1210b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1211c;
                if (this.f1212d == 1 && (i = this.f1214f & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1213e) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1213e;
                    }
                }
                return i3 + ((aac) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1210b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f1215g != null) {
            int i4 = 0;
            if (this.f1212d != 1) {
                int childCount = getChildCount();
                boolean a = aek.m624a(this);
                while (i4 < childCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo1409c(i4))) {
                        aac aac = (aac) childAt.getLayoutParams();
                        if (a) {
                            i3 = childAt.getRight() + aac.rightMargin;
                        } else {
                            i3 = (childAt.getLeft() - aac.leftMargin) - this.f1216h;
                        }
                        mo1408b(canvas, i3);
                    }
                    i4++;
                }
                if (mo1409c(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 != null) {
                        aac aac2 = (aac) childAt2.getLayoutParams();
                        if (a) {
                            i2 = (childAt2.getLeft() - aac2.leftMargin) - this.f1216h;
                        } else {
                            i2 = childAt2.getRight() + aac2.rightMargin;
                        }
                    } else if (!a) {
                        i2 = (getWidth() - getPaddingRight()) - this.f1216h;
                    } else {
                        i2 = getPaddingLeft();
                    }
                    mo1408b(canvas, i2);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            while (i4 < childCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo1409c(i4))) {
                    mo1407a(canvas, (childAt3.getTop() - ((aac) childAt3.getLayoutParams()).topMargin) - this.f1221m);
                }
                i4++;
            }
            if (mo1409c(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    i = childAt4.getBottom() + ((aac) childAt4.getLayoutParams()).bottomMargin;
                } else {
                    i = (getHeight() - getPaddingBottom()) - this.f1221m;
                }
                mo1407a(canvas, i);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        int i19 = 5;
        if (this.f1212d != 1) {
            boolean a = aek.m624a(this);
            int paddingTop = getPaddingTop();
            int i20 = i4 - i2;
            int paddingBottom = i20 - getPaddingBottom();
            int paddingBottom2 = (i20 - paddingTop) - getPaddingBottom();
            int childCount = getChildCount();
            int i21 = this.f1214f;
            int i22 = i21 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            boolean z3 = this.f1209a;
            int[] iArr = this.f1219k;
            int[] iArr2 = this.f1220l;
            int a2 = C1256ov.m19815a(8388615 & i21, C1280ps.m19923h(this));
            if (a2 == 1) {
                i7 = getPaddingLeft() + (((i3 - i) - this.f1213e) / 2);
            } else if (a2 != 5) {
                i7 = getPaddingLeft();
            } else {
                i7 = ((getPaddingLeft() + i3) - i) - this.f1213e;
            }
            if (a) {
                i9 = childCount - 1;
                i8 = -1;
            } else {
                i9 = 0;
                i8 = 1;
            }
            int i23 = 0;
            while (i23 < childCount) {
                int i24 = i9 + (i8 * i23);
                View childAt = getChildAt(i24);
                if (childAt == null) {
                    i12 = i9;
                    z2 = z3;
                    i10 = childCount;
                    i11 = i8;
                    i13 = i22;
                } else {
                    i12 = i9;
                    if (childAt.getVisibility() != i18) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        i10 = childCount;
                        aac aac = (aac) childAt.getLayoutParams();
                        if (z3) {
                            z2 = z3;
                            i11 = i8;
                            if (aac.height != -1) {
                                i14 = childAt.getBaseline();
                                i15 = aac.f12h;
                                if (i15 < 0) {
                                    i15 = i22;
                                }
                                i16 = i15 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                i13 = i22;
                                if (i16 != 16) {
                                    i17 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + aac.topMargin) - aac.bottomMargin;
                                } else if (i16 == 48) {
                                    i17 = aac.topMargin + paddingTop;
                                    if (i14 != -1) {
                                        i17 += iArr[1] - i14;
                                    }
                                } else if (i16 != 80) {
                                    i17 = paddingTop;
                                } else {
                                    i17 = (paddingBottom - measuredHeight) - aac.bottomMargin;
                                    if (i14 != -1) {
                                        i17 -= iArr2[2] - (childAt.getMeasuredHeight() - i14);
                                    }
                                }
                                if (mo1409c(i24)) {
                                    i7 += this.f1216h;
                                }
                                int i25 = i7 + aac.leftMargin;
                                m1305a(childAt, i25, i17, measuredWidth, measuredHeight);
                                i7 = i25 + measuredWidth + aac.rightMargin;
                            }
                        } else {
                            z2 = z3;
                            i11 = i8;
                        }
                        i14 = -1;
                        i15 = aac.f12h;
                        if (i15 < 0) {
                        }
                        i16 = i15 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                        i13 = i22;
                        if (i16 != 16) {
                        }
                        if (mo1409c(i24)) {
                        }
                        int i252 = i7 + aac.leftMargin;
                        m1305a(childAt, i252, i17, measuredWidth, measuredHeight);
                        i7 = i252 + measuredWidth + aac.rightMargin;
                    } else {
                        z2 = z3;
                        i10 = childCount;
                        i11 = i8;
                        i13 = i22;
                    }
                }
                i23++;
                i9 = i12;
                i8 = i11;
                childCount = i10;
                z3 = z2;
                i22 = i13;
                i18 = 8;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i26 = i3 - i;
        int paddingRight = i26 - getPaddingRight();
        int paddingRight2 = (i26 - paddingLeft) - getPaddingRight();
        int childCount2 = getChildCount();
        int i27 = this.f1214f;
        int i28 = 8388615 & i27;
        int i29 = i27 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        if (i29 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f1213e) / 2);
        } else if (i29 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f1213e;
        }
        int i30 = i5;
        int i31 = 0;
        while (i31 < childCount2) {
            View childAt2 = getChildAt(i31);
            if (childAt2 != null) {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    aac aac2 = (aac) childAt2.getLayoutParams();
                    int i32 = aac2.f12h;
                    if (i32 < 0) {
                        i32 = i28;
                    }
                    int a3 = C1256ov.m19815a(i32, C1280ps.m19923h(this)) & 7;
                    if (a3 == 1) {
                        i6 = ((((paddingRight2 - measuredWidth2) / 2) + paddingLeft) + aac2.leftMargin) - aac2.rightMargin;
                    } else if (a3 != i19) {
                        i6 = aac2.leftMargin + paddingLeft;
                    } else {
                        i6 = (paddingRight - measuredWidth2) - aac2.rightMargin;
                    }
                    if (mo1409c(i31)) {
                        i30 += this.f1221m;
                    }
                    int i33 = i30 + aac2.topMargin;
                    m1305a(childAt2, i6, i33, measuredWidth2, measuredHeight2);
                    i30 = i33 + measuredHeight2 + aac2.bottomMargin;
                }
            }
            i31++;
            i19 = 5;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ad, code lost:
        if (r11.width == -1) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0201, code lost:
        if (r24 > 0.0f) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0848  */
    /* JADX WARNING: Removed duplicated region for block: B:420:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:422:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        float f2;
        int i9;
        int i10;
        int i11;
        int max;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        int i14;
        boolean z3;
        boolean z4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        aac aac;
        boolean z5;
        int i21;
        boolean z6;
        int i22;
        int i23;
        int i24;
        float f3;
        char c;
        int i25;
        aac aac2;
        int i26;
        int i27;
        float f4;
        int i28;
        boolean z7;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        aac aac3;
        int i34;
        boolean z8;
        boolean z9;
        char c2;
        int i35;
        int i36 = i;
        int i37 = i2;
        int i38 = this.f1212d;
        int i39 = -2;
        int i40 = 8;
        float f5 = 0.0f;
        int i41 = JGCastService.FLAG_PRIVATE_DISPLAY;
        if (i38 == 1) {
            this.f1213e = 0;
            int childCount = getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i42 = this.f1210b;
            boolean z10 = this.f1218j;
            int i43 = 0;
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            float f6 = 0.0f;
            int i47 = 0;
            int i48 = 0;
            while (i43 < childCount) {
                View childAt = getChildAt(i43);
                if (childAt == null || childAt.getVisibility() == i40) {
                    i31 = i42;
                    i30 = mode2;
                    i32 = mode;
                    i29 = childCount;
                } else {
                    if (mo1409c(i43)) {
                        this.f1213e += this.f1221m;
                    }
                    aac aac4 = (aac) childAt.getLayoutParams();
                    f6 += aac4.f11g;
                    if (mode2 == i41 && aac4.height == 0 && aac4.f11g > f5) {
                        int i49 = this.f1213e;
                        this.f1213e = Math.max(i49, aac4.topMargin + i49 + aac4.bottomMargin);
                        i31 = i42;
                        i30 = mode2;
                        i33 = mode;
                        i29 = childCount;
                        aac3 = aac4;
                        z13 = true;
                    } else {
                        if (aac4.height != 0 || aac4.f11g <= f5) {
                            c2 = 0;
                        } else {
                            aac4.height = i39;
                            c2 = 0;
                        }
                        if (f6 == f5) {
                            i35 = this.f1213e;
                        } else {
                            i35 = 0;
                        }
                        i31 = i42;
                        i30 = mode2;
                        i33 = mode;
                        i29 = childCount;
                        aac3 = aac4;
                        measureChildWithMargins(childAt, i, 0, i2, i35);
                        if (c2 != 0) {
                            aac3.height = 0;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i50 = this.f1213e;
                        this.f1213e = Math.max(i50, i50 + measuredHeight + aac3.topMargin + aac3.bottomMargin);
                        if (z10) {
                            i47 = Math.max(measuredHeight, i47);
                        }
                    }
                    if (i31 >= 0 && i31 == i43 + 1) {
                        this.f1211c = this.f1213e;
                    }
                    if (i43 >= i31 || aac3.f11g <= 0.0f) {
                        i32 = i33;
                        if (i32 == 1073741824) {
                            z8 = false;
                            i34 = -1;
                        } else {
                            i34 = -1;
                            if (aac3.width == -1) {
                                z8 = true;
                                z12 = true;
                            } else {
                                z8 = false;
                            }
                        }
                        int i51 = aac3.leftMargin + aac3.rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i51;
                        int max2 = Math.max(i48, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i44, childAt.getMeasuredState());
                        if (!z11 || aac3.width != i34) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (aac3.f11g <= 0.0f) {
                            if (!z8) {
                                i51 = measuredWidth;
                            }
                            i45 = Math.max(i45, i51);
                        } else {
                            int i52 = i45;
                            if (!z8) {
                                i51 = measuredWidth;
                            }
                            i46 = Math.max(i46, i51);
                            i45 = i52;
                        }
                        i48 = max2;
                        i44 = combineMeasuredStates;
                        z11 = z9;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i43++;
                mode = i32;
                i42 = i31;
                mode2 = i30;
                childCount = i29;
                i39 = -2;
                i40 = 8;
                f5 = 0.0f;
                i41 = JGCastService.FLAG_PRIVATE_DISPLAY;
            }
            int i53 = mode2;
            int i54 = mode;
            int i55 = childCount;
            int i56 = i44;
            int i57 = i45;
            int i58 = i46;
            int i59 = i47;
            int i60 = i48;
            if (this.f1213e > 0) {
                i26 = i55;
                if (mo1409c(i26)) {
                    this.f1213e += this.f1221m;
                }
            } else {
                i26 = i55;
            }
            if (!z10) {
                i27 = i53;
            } else {
                i27 = i53;
                if (i27 == Integer.MIN_VALUE || i27 == 0) {
                    this.f1213e = 0;
                    for (int i61 = 0; i61 < i26; i61++) {
                        View childAt2 = getChildAt(i61);
                        if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                            aac aac5 = (aac) childAt2.getLayoutParams();
                            int i62 = this.f1213e;
                            this.f1213e = Math.max(i62, i62 + i59 + aac5.topMargin + aac5.bottomMargin);
                        }
                    }
                }
            }
            int paddingTop = this.f1213e + getPaddingTop() + getPaddingBottom();
            this.f1213e = paddingTop;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i37, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f1213e;
            if (z13) {
                f4 = 0.0f;
            } else {
                if (i63 != 0) {
                    f4 = 0.0f;
                }
                i57 = Math.max(i57, i58);
                if (z10 && i27 != 1073741824) {
                    for (int i64 = 0; i64 < i26; i64++) {
                        View childAt3 = getChildAt(i64);
                        if (!(childAt3 == null || childAt3.getVisibility() == 8 || ((aac) childAt3.getLayoutParams()).f11g <= 0.0f)) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(i59, JGCastService.FLAG_PRIVATE_DISPLAY));
                        }
                    }
                }
                int i65 = i60;
                if (z11 || i54 == 1073741824) {
                    i57 = i65;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i57 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i36, i56), resolveSizeAndState);
                if (!z12) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY);
                    for (int i66 = 0; i66 < i26; i66++) {
                        View childAt4 = getChildAt(i66);
                        if (childAt4.getVisibility() != 8) {
                            aac aac6 = (aac) childAt4.getLayoutParams();
                            if (aac6.width == -1) {
                                int i67 = aac6.height;
                                aac6.height = childAt4.getMeasuredHeight();
                                measureChildWithMargins(childAt4, makeMeasureSpec, 0, i2, 0);
                                aac6.height = i67;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            float f7 = this.f1217i;
            if (f7 > f4) {
                f6 = f7;
            }
            this.f1213e = 0;
            for (int i68 = 0; i68 < i26; i68++) {
                View childAt5 = getChildAt(i68);
                if (childAt5.getVisibility() != 8) {
                    aac aac7 = (aac) childAt5.getLayoutParams();
                    float f8 = aac7.f11g;
                    if (f8 > 0.0f) {
                        int i69 = (int) ((((float) i63) * f8) / f6);
                        f6 -= f8;
                        int i70 = i63 - i69;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i36, getPaddingLeft() + getPaddingRight() + aac7.leftMargin + aac7.rightMargin, aac7.width);
                        if (aac7.height == 0 && i27 == 1073741824) {
                            if (i69 <= 0) {
                                i69 = 0;
                            }
                            childAt5.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i69, JGCastService.FLAG_PRIVATE_DISPLAY));
                        } else {
                            int measuredHeight2 = childAt5.getMeasuredHeight() + i69;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt5.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, JGCastService.FLAG_PRIVATE_DISPLAY));
                        }
                        i56 = View.combineMeasuredStates(i56, childAt5.getMeasuredState() & -256);
                        i63 = i70;
                    }
                    int i71 = aac7.leftMargin + aac7.rightMargin;
                    int measuredWidth2 = childAt5.getMeasuredWidth() + i71;
                    int max3 = Math.max(i60, measuredWidth2);
                    if (i54 != 1073741824) {
                        i28 = i63;
                    } else {
                        i28 = i63;
                    }
                    i71 = measuredWidth2;
                    int max4 = Math.max(i57, i71);
                    if (!z11 || aac7.width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    int i72 = this.f1213e;
                    this.f1213e = Math.max(i72, childAt5.getMeasuredHeight() + i72 + aac7.topMargin + aac7.bottomMargin);
                    i57 = max4;
                    z11 = z7;
                    i60 = max3;
                    i63 = i28;
                }
            }
            this.f1213e += getPaddingTop() + getPaddingBottom();
            int i652 = i60;
            i57 = i652;
            setMeasuredDimension(View.resolveSizeAndState(Math.max(i57 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i36, i56), resolveSizeAndState);
            if (!z12) {
            }
        } else {
            this.f1213e = 0;
            int childCount2 = getChildCount();
            int mode3 = View.MeasureSpec.getMode(i);
            int mode4 = View.MeasureSpec.getMode(i2);
            if (this.f1219k == null || this.f1220l == null) {
                this.f1219k = new int[4];
                this.f1220l = new int[4];
            }
            int[] iArr = this.f1219k;
            int[] iArr2 = this.f1220l;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            boolean z14 = this.f1209a;
            boolean z15 = this.f1218j;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            boolean z16 = true;
            boolean z17 = false;
            boolean z18 = false;
            float f9 = 0.0f;
            int i78 = 0;
            while (i76 < childCount2) {
                View childAt6 = getChildAt(i76);
                if (childAt6 == null) {
                    i17 = i73;
                    i16 = i74;
                } else {
                    i17 = i73;
                    i16 = i74;
                    if (childAt6.getVisibility() != 8) {
                        if (mo1409c(i76)) {
                            this.f1213e += this.f1216h;
                        }
                        aac aac8 = (aac) childAt6.getLayoutParams();
                        f9 += aac8.f11g;
                        if (mode3 != 1073741824) {
                            i24 = i75;
                            i23 = i76;
                        } else if (aac8.width != 0) {
                            i24 = i75;
                            i23 = i76;
                        } else if (aac8.f11g <= 0.0f) {
                            i24 = i75;
                            i23 = i76;
                        } else {
                            int i79 = i75;
                            int i80 = i76;
                            this.f1213e += aac8.leftMargin + aac8.rightMargin;
                            if (z14) {
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                                aac = aac8;
                                z3 = z14;
                                i18 = i17;
                                i20 = i16;
                                i19 = i79;
                                i15 = i80;
                            } else {
                                aac = aac8;
                                z3 = z14;
                                i18 = i17;
                                i20 = i16;
                                i19 = i79;
                                i15 = i80;
                                z18 = true;
                            }
                            z4 = z15;
                            if (mode4 == 1073741824) {
                                z5 = false;
                            } else if (aac.height == -1) {
                                z5 = true;
                                z17 = true;
                            } else {
                                z5 = false;
                            }
                            int i81 = aac.topMargin + aac.bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i81;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i19, childAt6.getMeasuredState());
                            if (z3) {
                                int baseline = childAt6.getBaseline();
                                if (baseline != -1) {
                                    int i82 = aac.f12h;
                                    if (i82 < 0) {
                                        i82 = this.f1214f;
                                    }
                                    int i83 = ((i82 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) >> 4) >> 1;
                                    i21 = i81;
                                    iArr[i83] = Math.max(iArr[i83], baseline);
                                    iArr2[i83] = Math.max(iArr2[i83], measuredHeight3 - baseline);
                                } else {
                                    i21 = i81;
                                }
                            } else {
                                i21 = i81;
                            }
                            int max5 = Math.max(i78, measuredHeight3);
                            if (z16 || aac.height != -1) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (aac.f11g <= 0.0f) {
                                if (z5) {
                                    measuredHeight3 = i21;
                                }
                                i22 = Math.max(i20, measuredHeight3);
                                i73 = i18;
                            } else {
                                int i84 = i20;
                                if (z5) {
                                    measuredHeight3 = i21;
                                }
                                int max6 = Math.max(i18, measuredHeight3);
                                i22 = i84;
                                i73 = max6;
                            }
                            i78 = max5;
                            i74 = i22;
                            i75 = combineMeasuredStates2;
                            z16 = z6;
                            i76 = i15 + 1;
                            z15 = z4;
                            z14 = z3;
                        }
                        if (aac8.width == 0) {
                            f3 = 0.0f;
                            if (aac8.f11g > 0.0f) {
                                aac8.width = -2;
                                c = 0;
                                if (f9 != f3) {
                                    i25 = this.f1213e;
                                } else {
                                    i25 = 0;
                                }
                                aac aac9 = aac8;
                                i20 = i16;
                                i18 = i17;
                                i19 = i24;
                                i15 = i23;
                                z4 = z15;
                                z3 = z14;
                                measureChildWithMargins(childAt6, i, i25, i2, 0);
                                if (c != 0) {
                                    aac2 = aac9;
                                } else {
                                    aac2 = aac9;
                                    aac2.width = 0;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (mode3 != 1073741824) {
                                    this.f1213e += aac.leftMargin + measuredWidth3 + aac.rightMargin;
                                } else {
                                    int i85 = this.f1213e;
                                    this.f1213e = Math.max(i85, i85 + measuredWidth3 + aac.leftMargin + aac.rightMargin);
                                }
                                if (z4) {
                                    i77 = Math.max(measuredWidth3, i77);
                                }
                                if (mode4 == 1073741824) {
                                }
                                int i812 = aac.topMargin + aac.bottomMargin;
                                int measuredHeight32 = childAt6.getMeasuredHeight() + i812;
                                int combineMeasuredStates22 = View.combineMeasuredStates(i19, childAt6.getMeasuredState());
                                if (z3) {
                                }
                                int max52 = Math.max(i78, measuredHeight32);
                                if (z16) {
                                }
                                z6 = false;
                                if (aac.f11g <= 0.0f) {
                                }
                                i78 = max52;
                                i74 = i22;
                                i75 = combineMeasuredStates22;
                                z16 = z6;
                                i76 = i15 + 1;
                                z15 = z4;
                                z14 = z3;
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        c = 0;
                        if (f9 != f3) {
                        }
                        aac aac92 = aac8;
                        i20 = i16;
                        i18 = i17;
                        i19 = i24;
                        i15 = i23;
                        z4 = z15;
                        z3 = z14;
                        measureChildWithMargins(childAt6, i, i25, i2, 0);
                        if (c != 0) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (mode3 != 1073741824) {
                        }
                        if (z4) {
                        }
                        if (mode4 == 1073741824) {
                        }
                        int i8122 = aac.topMargin + aac.bottomMargin;
                        int measuredHeight322 = childAt6.getMeasuredHeight() + i8122;
                        int combineMeasuredStates222 = View.combineMeasuredStates(i19, childAt6.getMeasuredState());
                        if (z3) {
                        }
                        int max522 = Math.max(i78, measuredHeight322);
                        if (z16) {
                        }
                        z6 = false;
                        if (aac.f11g <= 0.0f) {
                        }
                        i78 = max522;
                        i74 = i22;
                        i75 = combineMeasuredStates222;
                        z16 = z6;
                        i76 = i15 + 1;
                        z15 = z4;
                        z14 = z3;
                    }
                }
                z4 = z15;
                z3 = z14;
                i73 = i17;
                i74 = i16;
                i15 = i76;
                i76 = i15 + 1;
                z15 = z4;
                z14 = z3;
            }
            boolean z19 = z15;
            boolean z20 = z14;
            int i86 = i73;
            int i87 = i74;
            int i88 = i75;
            int i89 = i78;
            if (this.f1213e > 0 && mo1409c(childCount2)) {
                this.f1213e += this.f1216h;
            }
            int i90 = iArr[1];
            if (i90 == -1) {
                i3 = i88;
                if (iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
                    i4 = i87;
                    i5 = i89;
                    if (z19 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                        this.f1213e = 0;
                        for (i14 = 0; i14 < childCount2; i14++) {
                            View childAt7 = getChildAt(i14);
                            if (!(childAt7 == null || childAt7.getVisibility() == 8)) {
                                aac aac10 = (aac) childAt7.getLayoutParams();
                                int i91 = this.f1213e;
                                this.f1213e = Math.max(i91, i91 + i77 + aac10.leftMargin + aac10.rightMargin);
                            }
                        }
                    }
                    int paddingLeft = this.f1213e + getPaddingLeft() + getPaddingRight();
                    this.f1213e = paddingLeft;
                    int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i36, 0);
                    int i92 = (16777215 & resolveSizeAndState2) - this.f1213e;
                    if (!z18) {
                        f = 0.0f;
                    } else {
                        if (i92 == 0) {
                            i6 = resolveSizeAndState2;
                        } else {
                            f = 0.0f;
                            if (f9 <= 0.0f) {
                                i6 = resolveSizeAndState2;
                            }
                        }
                        i7 = Math.max(i4, i86);
                        if (z19 && mode3 != 1073741824) {
                            for (int i93 = 0; i93 < childCount2; i93++) {
                                View childAt8 = getChildAt(i93);
                                if (childAt8 != null) {
                                    if (childAt8.getVisibility() != 8) {
                                        if (((aac) childAt8.getLayoutParams()).f11g > 0.0f) {
                                            childAt8.measure(View.MeasureSpec.makeMeasureSpec(i77, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
                                        }
                                    }
                                }
                            }
                        }
                        i8 = i3;
                        if (z16 || mode4 == 1073741824) {
                            i7 = i5;
                        }
                        setMeasuredDimension(i6 | (-16777216 & i8), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i37, i8 << 16));
                        if (z17) {
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY);
                            for (int i94 = 0; i94 < childCount2; i94++) {
                                View childAt9 = getChildAt(i94);
                                if (childAt9.getVisibility() != 8) {
                                    aac aac11 = (aac) childAt9.getLayoutParams();
                                    if (aac11.height == -1) {
                                        int i95 = aac11.width;
                                        aac11.width = childAt9.getMeasuredWidth();
                                        measureChildWithMargins(childAt9, i, 0, makeMeasureSpec3, 0);
                                        aac11.width = i95;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    f2 = this.f1217i;
                    if (f2 > f) {
                        f9 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f1213e = 0;
                    i7 = i4;
                    int i96 = i3;
                    i9 = 0;
                    i10 = -1;
                    while (i9 < childCount2) {
                        View childAt10 = getChildAt(i9);
                        if (childAt10 == null) {
                            i12 = resolveSizeAndState2;
                        } else if (childAt10.getVisibility() != 8) {
                            aac aac12 = (aac) childAt10.getLayoutParams();
                            float f10 = aac12.f11g;
                            if (f10 > 0.0f) {
                                i12 = resolveSizeAndState2;
                                int i97 = (int) ((((float) i92) * f10) / f9);
                                f9 -= f10;
                                int i98 = i92 - i97;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i37, getPaddingTop() + getPaddingBottom() + aac12.topMargin + aac12.bottomMargin, aac12.height);
                                if (aac12.width == 0 && mode3 == 1073741824) {
                                    if (i97 <= 0) {
                                        i97 = 0;
                                    }
                                    childAt10.measure(View.MeasureSpec.makeMeasureSpec(i97, JGCastService.FLAG_PRIVATE_DISPLAY), childMeasureSpec2);
                                } else {
                                    int measuredWidth4 = i97 + childAt10.getMeasuredWidth();
                                    if (measuredWidth4 < 0) {
                                        measuredWidth4 = 0;
                                    }
                                    childAt10.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, JGCastService.FLAG_PRIVATE_DISPLAY), childMeasureSpec2);
                                }
                                i96 = View.combineMeasuredStates(i96, childAt10.getMeasuredState() & -16777216);
                                i92 = i98;
                            } else {
                                i12 = resolveSizeAndState2;
                            }
                            if (mode3 != 1073741824) {
                                int i99 = this.f1213e;
                                i13 = i92;
                                this.f1213e = Math.max(i99, childAt10.getMeasuredWidth() + i99 + aac12.leftMargin + aac12.rightMargin);
                            } else {
                                i13 = i92;
                                this.f1213e += childAt10.getMeasuredWidth() + aac12.leftMargin + aac12.rightMargin;
                            }
                            if (mode4 == 1073741824 || aac12.height != -1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            int i100 = aac12.topMargin + aac12.bottomMargin;
                            int measuredHeight4 = childAt10.getMeasuredHeight() + i100;
                            i10 = Math.max(i10, measuredHeight4);
                            if (!z) {
                                i100 = measuredHeight4;
                            }
                            int max7 = Math.max(i7, i100);
                            if (!z16 || aac12.height != -1) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z20) {
                                int baseline2 = childAt10.getBaseline();
                                if (baseline2 != -1) {
                                    int i101 = aac12.f12h;
                                    if (i101 < 0) {
                                        i101 = this.f1214f;
                                    }
                                    int i102 = ((i101 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) >> 4) >> 1;
                                    iArr[i102] = Math.max(iArr[i102], baseline2);
                                    iArr2[i102] = Math.max(iArr2[i102], measuredHeight4 - baseline2);
                                }
                            }
                            i7 = max7;
                            z16 = z2;
                            i92 = i13;
                        } else {
                            i12 = resolveSizeAndState2;
                        }
                        i9++;
                        resolveSizeAndState2 = i12;
                    }
                    this.f1213e += getPaddingLeft() + getPaddingRight();
                    i11 = iArr[1];
                    if (i11 != -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
                        max = i10;
                    } else {
                        max = Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                    }
                    i6 = resolveSizeAndState2;
                    i8 = i96;
                    i7 = i5;
                    setMeasuredDimension(i6 | (-16777216 & i8), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i37, i8 << 16));
                    if (z17) {
                    }
                }
            } else {
                i3 = i88;
            }
            i4 = i87;
            i5 = Math.max(i89, Math.max(iArr[3], Math.max(iArr[0], Math.max(i90, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            this.f1213e = 0;
            while (i14 < childCount2) {
            }
            int paddingLeft2 = this.f1213e + getPaddingLeft() + getPaddingRight();
            this.f1213e = paddingLeft2;
            int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingLeft2, getSuggestedMinimumWidth()), i36, 0);
            int i922 = (16777215 & resolveSizeAndState22) - this.f1213e;
            if (!z18) {
            }
            f2 = this.f1217i;
            if (f2 > f) {
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1213e = 0;
            i7 = i4;
            int i962 = i3;
            i9 = 0;
            i10 = -1;
            while (i9 < childCount2) {
            }
            this.f1213e += getPaddingLeft() + getPaddingRight();
            i11 = iArr[1];
            if (i11 != -1) {
            }
            max = Math.max(i10, Math.max(iArr[3], Math.max(iArr[0], Math.max(i11, iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            i6 = resolveSizeAndState22;
            i8 = i962;
            i7 = i5;
            setMeasuredDimension(i6 | (-16777216 & i8), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i37, i8 << 16));
            if (z17) {
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public aac generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aac(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1408b(Canvas canvas, int i) {
        this.f1215g.setBounds(i, getPaddingTop() + this.f1223o, this.f1216h + i, (getHeight() - getPaddingBottom()) - this.f1223o);
        this.f1215g.draw(canvas);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.f1209a = true;
        this.f1210b = -1;
        this.f1211c = 0;
        this.f1214f = 8388659;
        adr a = adr.m523a(context, attributeSet, C1390tu.f27205n, i, 0);
        C1280ps.m19886a(this, context, C1390tu.f27205n, attributeSet, a.f290b, i, 0);
        int a2 = a.mo448a(1, -1);
        if (a2 >= 0) {
            mo1410d(a2);
        }
        int a3 = a.mo448a(0, -1);
        if (a3 >= 0 && this.f1214f != a3) {
            a3 = (8388615 & a3) == 0 ? a3 | 8388611 : a3;
            this.f1214f = (a3 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) == 0 ? a3 | 48 : a3;
            requestLayout();
        }
        if (!a.mo451a(2, true)) {
            mo1411e();
        }
        this.f1217i = a.f290b.getFloat(4, -1.0f);
        this.f1210b = a.mo448a(3, -1);
        this.f1218j = a.mo451a(7, false);
        Drawable a4 = a.mo449a(5);
        if (a4 != this.f1215g) {
            this.f1215g = a4;
            if (a4 != null) {
                this.f1216h = a4.getIntrinsicWidth();
                this.f1221m = a4.getIntrinsicHeight();
            } else {
                this.f1216h = 0;
                this.f1221m = 0;
            }
            setWillNotDraw(a4 != null ? false : z);
            requestLayout();
        }
        this.f1222n = a.mo448a(8, 0);
        this.f1223o = a.mo456d(6, 0);
        a.mo450a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1407a(Canvas canvas, int i) {
        this.f1215g.setBounds(getPaddingLeft() + this.f1223o, i, (getWidth() - getPaddingRight()) - this.f1223o, this.f1221m + i);
        this.f1215g.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo1409c(int i) {
        if (i == 0) {
            return (this.f1222n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1222n & 4) != 0;
        }
        if ((this.f1222n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }
}
