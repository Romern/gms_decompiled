package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: akql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akql {

    /* renamed from: a */
    public final float f72439a;

    /* renamed from: b */
    public final float f72440b;

    /* renamed from: c */
    public final Handler f72441c;

    /* renamed from: d */
    public final SensorManager f72442d;

    /* renamed from: e */
    public final Sensor f72443e;

    /* renamed from: f */
    public final ArrayList f72444f = new ArrayList();

    /* renamed from: g */
    public final akqk f72445g;

    /* renamed from: h */
    public final akqh f72446h;

    /* renamed from: i */
    public final aksc f72447i;

    /* renamed from: j */
    public float f72448j = Float.MAX_VALUE;

    /* renamed from: k */
    public float f72449k = 0.0f;

    /* renamed from: l */
    public int f72450l;

    /* renamed from: m */
    public int f72451m = 1;

    /* renamed from: n */
    private final akrj f72452n;

    public akql(SensorManager sensorManager, Sensor sensor, Handler handler, akrj akrj, bmzq bmzq, float f, float f2, aksc aksc) {
        this.f72442d = sensorManager;
        this.f72443e = sensor;
        this.f72441c = handler;
        this.f72452n = akrj;
        this.f72439a = f;
        this.f72440b = f2;
        this.f72447i = aksc;
        this.f72445g = new akqk(this);
        this.f72446h = new akqh(this);
        this.f72444f.add(new akqj(this, bmzq));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 3) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[LOOP:0: B:8:0x0018->B:10:0x0020, LOOP_END] */
    /* renamed from: a */
    public final void mo39704a(int i) {
        this.f72451m = i;
        if (i != 1) {
            if (i == 2) {
                this.f72452n.mo39723a(true);
            }
            for (int i2 = 0; i2 < this.f72444f.size(); i2++) {
                ((akqi) this.f72444f.get(i2)).mo39677a(i);
            }
        }
        this.f72452n.mo39723a(false);
        while (i2 < this.f72444f.size()) {
        }
    }
}
