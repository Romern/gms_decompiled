package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: btxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxc {

    /* renamed from: e */
    private static final double[] f152788e = new double[0];

    /* renamed from: a */
    public final btxb f152789a;

    /* renamed from: b */
    public final double f152790b;

    /* renamed from: c */
    public double[] f152791c;

    /* renamed from: d */
    public double[] f152792d;

    public btxc(btxb btxb, Double d) {
        if (btxb != null) {
            this.f152789a = btxb;
            this.f152790b = d != null ? d.doubleValue() : Double.MIN_VALUE;
            double[] dArr = f152788e;
            this.f152791c = dArr;
            this.f152792d = dArr;
            return;
        }
        throw new IllegalArgumentException("activityRecognitionResult cannot be null");
    }

    /* renamed from: a */
    public final List mo72461a() {
        return this.f152789a.f152786a;
    }

    /* renamed from: b */
    public final boolean mo72462b() {
        return this.f152789a.mo72457a() && this.f152789a.mo72458b().f152784a == 1;
    }

    /* renamed from: c */
    public final int mo72463c() {
        if (this.f152789a.mo72457a()) {
            return this.f152789a.mo72458b().f152785b;
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo72464d() {
        return this.f152790b != Double.MIN_VALUE;
    }

    /* renamed from: e */
    public final long mo72465e() {
        return this.f152789a.f152787b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btxc) {
            btxc btxc = (btxc) obj;
            if (!this.f152789a.equals(btxc.f152789a) || Double.compare(this.f152790b, btxc.f152790b) != 0 || !Arrays.equals(this.f152791c, btxc.f152791c) || !Arrays.equals(this.f152792d, btxc.f152792d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f152789a.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f152790b);
        return (((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Arrays.hashCode(this.f152791c)) * 31) + Arrays.hashCode(this.f152792d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f152789a.f152786a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            btxa btxa = (btxa) list.get(i);
            sb.append(btwt.m118962a(btxa.f152784a));
            sb.append(" = ");
            sb.append(btxa.f152785b);
            sb.append("\n");
        }
        if (mo72464d()) {
            sb.append("GpsSpeed = ");
            sb.append(this.f152790b);
            sb.append("\n");
        }
        sb.append("Timemillis = ");
        sb.append(mo72465e());
        return sb.toString();
    }
}
