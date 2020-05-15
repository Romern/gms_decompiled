package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: zgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zgh {

    /* renamed from: a */
    public final caae f55011a;

    /* renamed from: b */
    public final zgg f55012b;

    /* renamed from: c */
    public final long f55013c;

    /* renamed from: d */
    public final long f55014d;

    /* renamed from: e */
    public final long f55015e;

    /* renamed from: f */
    public final int f55016f;

    /* renamed from: g */
    public final long f55017g;

    /* renamed from: h */
    public final List f55018h;

    public zgh(caae caae, zgg zgg, long j, long j2, long j3, int i, List list, long j4) {
        bmxy.m108581a(caae);
        this.f55011a = caae;
        bmxy.m108581a(zgg);
        this.f55012b = zgg;
        this.f55013c = j;
        this.f55015e = j2;
        this.f55014d = j3;
        this.f55016f = i;
        this.f55018h = list;
        this.f55017g = j4;
    }

    /* renamed from: a */
    public final zgh mo31080a() {
        return new zgh(this.f55011a, this.f55012b, 0, 0, 0, this.f55016f, this.f55018h, this.f55017g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zgh)) {
                return false;
            }
            zgh zgh = (zgh) obj;
            if (!(this.f55011a.equals(zgh.f55011a) && this.f55013c == zgh.f55013c && this.f55015e == zgh.f55015e && this.f55014d == zgh.f55014d && this.f55016f == zgh.f55016f)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55011a, Long.valueOf(this.f55013c), Long.valueOf(this.f55015e), Long.valueOf(this.f55014d), Integer.valueOf(this.f55016f)});
    }

    public final String toString() {
        return String.format("SensorAdapterRequest{source %s interval %s fastest %s latency %s}", this.f55011a.f172326b, Long.valueOf(this.f55013c), Long.valueOf(this.f55015e), Long.valueOf(this.f55014d));
    }

    /* renamed from: a */
    public final zgh mo31081a(zgg zgg) {
        return new zgh(this.f55011a, zgg, this.f55013c, this.f55015e, this.f55014d, this.f55016f, this.f55018h, this.f55017g);
    }
}
