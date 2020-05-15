package p000;

import android.graphics.PointF;

/* renamed from: alcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcl {

    /* renamed from: a */
    public long f73468a = 0;

    /* renamed from: b */
    public PointF f73469b = new PointF(0.0f, 0.0f);

    /* renamed from: c */
    public PointF f73470c = new PointF(0.0f, 0.0f);

    /* renamed from: d */
    private alck f73471d = null;

    /* renamed from: a */
    public final synchronized void mo40126a() {
        this.f73471d = null;
    }

    /* renamed from: b */
    public final synchronized boolean mo40128b(PointF pointF) {
        boolean z;
        if (Math.hypot((double) this.f73470c.x, (double) this.f73470c.y) >= 100.0d) {
            this.f73471d = new alck(pointF, new PointF(this.f73470c.x * 0.125f, this.f73470c.y * 0.125f));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo40127a(PointF pointF) {
        if (this.f73471d != null) {
            double nanoTime = (double) (System.nanoTime() - this.f73471d.f73465a);
            Double.isNaN(nanoTime);
            double pow = 1.0d - Math.pow(1.0d - (nanoTime / 5.0E8d), 3.0d);
            if (pow < 1.0d) {
                float f = this.f73471d.f73466b.x;
                float f2 = this.f73471d.f73467c.x;
                float f3 = this.f73471d.f73466b.y;
                float f4 = this.f73471d.f73467c.y;
                double d = (double) f;
                double d2 = (double) f2;
                Double.isNaN(d2);
                Double.isNaN(d);
                pointF.x = (float) (d + (d2 * pow));
                double d3 = (double) f3;
                double d4 = (double) f4;
                Double.isNaN(d4);
                Double.isNaN(d3);
                pointF.y = (float) (d3 + (d4 * pow));
                return true;
            }
            this.f73471d = null;
        }
    }
}
