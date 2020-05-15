package p000;

import android.location.Location;

/* renamed from: bgjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjm {

    /* renamed from: a */
    public final Location f116615a;

    /* renamed from: b */
    public final long f116616b;

    /* renamed from: c */
    public final int f116617c;

    public bgjm(Location location, long j, int i) {
        if (location != null) {
            this.f116615a = location;
            this.f116616b = j;
            this.f116617c = i;
            return;
        }
        throw new IllegalArgumentException("Null location in RealLocation constructor");
    }

    /* renamed from: a */
    public final float mo62895a() {
        return this.f116615a.getAccuracy();
    }

    /* renamed from: b */
    public final double mo62896b() {
        return this.f116615a.getLatitude();
    }

    /* renamed from: c */
    public final double mo62897c() {
        return this.f116615a.getLongitude();
    }

    /* renamed from: d */
    public final float mo62898d() {
        return this.f116615a.getSpeed();
    }

    /* renamed from: e */
    public final long mo62899e() {
        return this.f116615a.getTime();
    }

    /* renamed from: f */
    public final double mo62900f() {
        return this.f116615a.getAltitude();
    }

    /* renamed from: g */
    public final float mo62901g() {
        return this.f116615a.getBearing();
    }

    /* renamed from: h */
    public final boolean mo62902h() {
        return this.f116615a.hasAltitude();
    }

    /* renamed from: i */
    public final boolean mo62903i() {
        return this.f116615a.hasBearing();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RealLocation [location=");
        sb.append(this.f116615a);
        sb.append(" satellites=");
        sb.append(this.f116617c);
        if (mo62903i()) {
            sb.append(" bearing=");
            sb.append(mo62901g());
        }
        if (mo62902h()) {
            sb.append(" altitude=");
            sb.append(mo62900f());
        }
        sb.append("]");
        return sb.toString();
    }
}
