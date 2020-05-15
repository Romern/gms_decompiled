package p000;

import android.hardware.SensorEventListener;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zkh {

    /* renamed from: a */
    public final zgg f55298a;

    /* renamed from: b */
    public final SensorEventListener f55299b;

    /* renamed from: c */
    public final List f55300c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final yqe f55301d;

    /* renamed from: e */
    public final long f55302e;

    /* renamed from: f */
    public final long f55303f;

    /* renamed from: g */
    public final long f55304g;

    public zkh(zkg zkg) {
        zgg zgg = zkg.f55292a;
        bmxy.m108581a(zgg);
        this.f55298a = zgg;
        this.f55299b = zkg.f55293b;
        this.f55301d = zkg.f55294c;
        this.f55304g = zkg.f55297f;
        this.f55302e = zkg.f55295d;
        this.f55303f = zkg.f55296e;
    }

    /* renamed from: a */
    public static String m45660a(long j) {
        return String.format(Locale.US, "%1$tF %1$tT", Long.valueOf(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof zkh) && this.f55298a.equals(((zkh) obj).f55298a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f55298a.hashCode();
    }

    public final String toString() {
        return String.format("ListenerRegistration{listener=%s, dataSources=%s, hardwareListener=%s, subscription=%s, created=%s}", this.f55298a, this.f55300c, this.f55299b, this.f55301d, m45660a(this.f55304g));
    }

    /* renamed from: a */
    public final void mo31200a(caae caae) {
        this.f55300c.add(caae);
    }
}
