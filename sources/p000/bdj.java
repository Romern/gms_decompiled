package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: bdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdj {

    /* renamed from: a */
    static final bed f3037a = bed.m2754a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: b */
    private static final Interpolator f3038b = new LinearInterpolator();

    /* renamed from: c */
    private static C1246ol f3039c;

    bdj() {
    }

    /* renamed from: a */
    private static beo m2731a(axw axw, bef bef, float f, bea bea) {
        Interpolator interpolator;
        WeakReference weakReference;
        bef bef2 = bef;
        float f2 = f;
        bea bea2 = bea;
        bef.mo3024c();
        Interpolator interpolator2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        Object obj = null;
        Object obj2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3037a)) {
                case 0:
                    f3 = (float) bef.mo3031j();
                    break;
                case 1:
                    obj = bea2.mo2999a(bef2, f2);
                    break;
                case 2:
                    obj2 = bea2.mo2999a(bef2, f2);
                    break;
                case 3:
                    pointF = bdi.m2730b(bef, f);
                    break;
                case 4:
                    pointF2 = bdi.m2730b(bef, f);
                    break;
                case 5:
                    if (bef.mo3032k() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF4 = bdi.m2730b(bef, f);
                    break;
                case 7:
                    pointF3 = bdi.m2730b(bef, f);
                    break;
                default:
                    bef.mo3033l();
                    break;
            }
        }
        bef.mo3025d();
        if (z) {
            interpolator = f3038b;
            obj2 = obj;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f3038b;
        } else {
            float f4 = -f2;
            pointF.x = bem.m2826b(pointF.x, f4, f2);
            pointF.y = bem.m2826b(pointF.y, -100.0f, 100.0f);
            pointF2.x = bem.m2826b(pointF2.x, f4, f2);
            pointF2.y = bem.m2826b(pointF2.y, -100.0f, 100.0f);
            int a = ben.m2831a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            synchronized (bdj.class) {
                if (f3039c == null) {
                    f3039c = new C1246ol();
                }
                weakReference = (WeakReference) f3039c.mo15646f(a);
            }
            if (weakReference != null) {
                interpolator2 = (Interpolator) weakReference.get();
            }
            if (weakReference == null || interpolator2 == null) {
                interpolator2 = C1316ra.m20056a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                try {
                    WeakReference weakReference2 = new WeakReference(interpolator2);
                    synchronized (bdj.class) {
                        f3039c.mo15637a(a, weakReference2);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
            interpolator = interpolator2;
        }
        beo beo = new beo(axw, obj, obj2, interpolator, f3, null);
        beo.f3112k = pointF4;
        beo.f3113l = pointF3;
        return beo;
    }

    /* renamed from: a */
    static beo m2732a(bef bef, axw axw, float f, bea bea, boolean z) {
        if (!z) {
            return new beo(bea.mo2999a(bef, f));
        }
        return m2731a(axw, bef, f, bea);
    }
}
