package com.google.android.gms.drive.p039ui.select.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: com.google.android.gms.drive.ui.select.view.FastScrollerSwipeRefreshLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastScrollerSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: m */
    public voj f31221m;

    public FastScrollerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        voj voj = this.f31221m;
        if (voj == null || voj.f49667r <= 0 || motionEvent.getAction() != 0 || !voj.mo28691a(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        voj.mo28690a(3);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0184  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (isEnabled()) {
            voj voj = this.f31221m;
            if (!(voj == null || voj.f49667r == 0)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (voj.mo28691a(motionEvent.getX(), motionEvent.getY())) {
                        voj.mo28690a(3);
                        if (voj.f49669t == null && voj.f49658i != null) {
                            voj.mo28696d();
                        }
                        MotionEvent obtain = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0);
                        voj.f49658i.onTouchEvent(obtain);
                        obtain.recycle();
                        return true;
                    }
                } else if (action == 1) {
                    if (voj.f49667r == 3) {
                        voj.mo28690a(2);
                        Handler handler = voj.f49668s;
                        handler.removeCallbacks(voj.f49666q);
                        handler.postDelayed(voj.f49666q, 1000);
                        return true;
                    }
                } else if (action == 2 && voj.f49667r == 3) {
                    int height = voj.f49658i.getHeight();
                    float y = motionEvent.getY();
                    int i6 = voj.f49653d;
                    int i7 = (((int) y) - i6) + 10;
                    if (i7 < 0) {
                        i7 = 0;
                    } else if (i7 + i6 > height) {
                        i7 = height - i6;
                    }
                    if (Math.abs(voj.f49655f - i7) < 2) {
                        return true;
                    }
                    voj.f49655f = i7;
                    if (!voj.f49659j && motionEvent.hashCode() == 0) {
                        return true;
                    }
                    float f = ((float) voj.f49655f) / ((float) (height - voj.f49653d));
                    int a = voj.f49658i.getAdapter().mo161a();
                    voj.f49659j = false;
                    float f2 = (float) a;
                    float f3 = (1.0f / f2) / 8.0f;
                    Object[] objArr = voj.f49663n;
                    if (objArr != null) {
                        int length = objArr.length;
                        if (length > 1) {
                            float f4 = (float) length;
                            int i8 = (int) (f * f4);
                            if (i8 >= length) {
                                i8 = length - 1;
                            }
                            i = voj.f49670u.getPositionForSection(i8);
                            int i9 = i8 + 1;
                            if (i8 < length - 1) {
                                i3 = voj.f49670u.getPositionForSection(i9);
                            } else {
                                i3 = a;
                            }
                            if (i3 != i) {
                                i5 = i8;
                                i4 = i5;
                            } else {
                                i4 = i8;
                                int i10 = i;
                                while (true) {
                                    if (i4 <= 0) {
                                        i5 = i8;
                                        i4 = i5;
                                        i = i10;
                                        break;
                                    }
                                    i4--;
                                    int positionForSection = voj.f49670u.getPositionForSection(i4);
                                    if (positionForSection != i) {
                                        i = positionForSection;
                                        i5 = i4;
                                        break;
                                    } else if (i4 == 0) {
                                        i = positionForSection;
                                        i5 = i8;
                                        i4 = 0;
                                        break;
                                    } else {
                                        i10 = positionForSection;
                                    }
                                }
                                if (i4 == 0) {
                                    i4 = voj.f49670u.getSectionForPosition(0);
                                }
                            }
                            int i11 = i9 + 1;
                            while (i11 < length && voj.f49670u.getPositionForSection(i11) == i3) {
                                i11++;
                                i9++;
                            }
                            float f5 = ((float) i5) / f4;
                            float f6 = ((float) i9) / f4;
                            if (i5 != i8 || f - f5 >= f3) {
                                i += (int) ((((float) (i3 - i)) * (f - f5)) / (f6 - f5));
                            }
                            int i12 = a - 1;
                            if (i > i12) {
                                i = i12;
                            }
                            i2 = i4;
                            if (!(voj.f49658i.getLayoutManager() instanceof aah)) {
                                ((aah) voj.f49658i.getLayoutManager()).mo63b(i, 0);
                            } else {
                                voj.f49658i.scrollToPosition(i);
                            }
                            if (i2 < 0) {
                                String obj = objArr[i2].toString();
                                voj.f49664o = obj;
                                voj.f49665p = !(obj.length() == 1 && obj.charAt(0) == ' ') && i2 < objArr.length;
                                return true;
                            }
                            voj.f49665p = false;
                            return true;
                        }
                    }
                    i = (int) (f * f2);
                    i2 = -1;
                    if (!(voj.f49658i.getLayoutManager() instanceof aah)) {
                    }
                    if (i2 < 0) {
                    }
                }
            }
        }
        if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public FastScrollerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnHierarchyChangeListener(new vok(this));
    }
}
