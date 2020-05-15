package p000;

import android.view.MotionEvent;
import java.util.Arrays;
import java.util.List;

/* renamed from: oeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oeq {

    /* renamed from: a */
    public static final Object f37397a = new Object();

    /* renamed from: b */
    public static int f37398b;

    /* renamed from: c */
    public static oeq f37399c;

    /* renamed from: h */
    private static final Object f37400h = new Object();

    /* renamed from: i */
    private static MotionEvent.PointerCoords[] f37401i;

    /* renamed from: j */
    private static MotionEvent.PointerProperties[] f37402j;

    /* renamed from: d */
    public oeq f37403d;

    /* renamed from: e */
    public int f37404e;

    /* renamed from: f */
    public int f37405f;

    /* renamed from: g */
    public oep[] f37406g = new oep[1];

    /* renamed from: a */
    public static MotionEvent m28606a(long j, long j2, int i, List list, int i2, int i3, int i4, int i5) {
        MotionEvent obtain;
        int i6;
        int size = list.size();
        synchronized (f37400h) {
            if (f37401i == null || f37401i.length < size) {
                if (f37401i != null) {
                    i6 = f37401i.length;
                } else {
                    i6 = 8;
                }
                while (i6 < size) {
                    i6 += i6;
                }
                MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
                }
                f37401i = pointerCoordsArr;
                MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i6];
                for (int i8 = 0; i8 < i6; i8++) {
                    pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
                }
                f37402j = pointerPropertiesArr;
            }
            MotionEvent.PointerProperties[] pointerPropertiesArr2 = f37402j;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = f37401i;
            for (int i9 = size - 1; i9 >= 0; i9--) {
                oep oep = (oep) list.get(i9);
                pointerPropertiesArr2[i9].id = oep.f37396g;
                pointerPropertiesArr2[i9].toolType = i5;
                pointerCoordsArr2[i9].x = (float) (oep.f37394e + i2);
                pointerCoordsArr2[i9].y = (float) (oep.f37395f + i3);
                pointerCoordsArr2[i9].pressure = 0.8f;
            }
            obtain = MotionEvent.obtain(j, j2, i, size, pointerPropertiesArr2, pointerCoordsArr2, 0, 0, 1.0f, 1.0f, 0, 0, i4, 0);
        }
        return obtain;
    }

    public final String toString() {
        return "ProjectionTouchEvent{action=" + this.f37404e + ",actionIndex=" + this.f37405f + ",pointers=" + Arrays.toString(this.f37406g) + "}";
    }
}
