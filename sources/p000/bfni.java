package p000;

import java.util.Locale;

/* renamed from: bfni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfni {

    /* renamed from: a */
    static final Float f114478a = Float.valueOf(Float.NEGATIVE_INFINITY);

    /* renamed from: e */
    public static final buaz f114479e = new bfng();

    /* renamed from: b */
    public final int f114480b;

    /* renamed from: c */
    public final int f114481c;

    /* renamed from: d */
    public final int f114482d;

    public bfni(int i, int i2, int i3) {
        this.f114480b = i;
        this.f114481c = i2;
        this.f114482d = i3;
    }

    /* renamed from: a */
    public static void m97320a(StringBuilder sb, bfni bfni) {
        if (bfni == null) {
            sb.append("null");
        } else {
            sb.append(bfni);
        }
    }

    /* renamed from: a */
    public final boolean mo61980a() {
        return this.f114482d >= 0;
    }

    /* renamed from: b */
    public boolean mo61981b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo61982c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo61983d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo61984e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo61985f() {
        return false;
    }

    /* renamed from: g */
    public float mo61986g() {
        return f114478a.floatValue();
    }

    /* renamed from: h */
    public float mo61987h() {
        return -1.0f;
    }

    /* renamed from: i */
    public String mo61988i() {
        return "";
    }

    /* renamed from: j */
    public int mo61989j() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: k */
    public String mo61990k() {
        return "";
    }

    /* renamed from: l */
    public final bfnh mo61991l() {
        bfnh bfnh = new bfnh(this.f114480b, this.f114481c, this.f114482d);
        bfnh.mo61978a(mo61986g(), mo61987h());
        bfnh.mo61979a(mo61988i());
        bfnh.f114470a = mo61989j();
        bfnh.f114471b = mo61990k();
        return bfnh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position [latE7=");
        sb.append(this.f114480b);
        sb.append(", lngE7=");
        sb.append(this.f114481c);
        sb.append(", acc=");
        sb.append(this.f114482d);
        sb.append("mm");
        if (mo61981b()) {
            sb.append(", elevationWgs84M=");
            sb.append(mo61986g());
        }
        if (mo61982c()) {
            sb.append(", verticalAccuracyMeters=");
            sb.append(String.format(Locale.US, "%.1f", Float.valueOf(mo61987h())));
        }
        if (mo61983d()) {
            sb.append(", levelId=");
            sb.append(mo61988i());
        }
        if (mo61984e()) {
            sb.append(", levelNumberE3=");
            sb.append(mo61989j());
        }
        if (mo61985f()) {
            sb.append(", floorLabel=");
            sb.append(mo61990k());
        }
        sb.append("]");
        return sb.toString();
    }
}
