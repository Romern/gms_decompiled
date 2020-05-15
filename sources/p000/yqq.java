package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: yqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqq {

    /* renamed from: a */
    public final cacv f54423a;

    /* renamed from: b */
    public final String f54424b;

    /* renamed from: c */
    public final String f54425c;

    /* renamed from: d */
    public final String f54426d;

    /* renamed from: e */
    public final String f54427e;

    /* renamed from: f */
    public final String f54428f;

    /* renamed from: g */
    public final String f54429g;

    public yqq(cacv cacv, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f54423a = cacv;
        this.f54424b = str;
        this.f54425c = str2;
        this.f54426d = str3;
        this.f54427e = str4;
        this.f54428f = str5;
        this.f54429g = str6;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof yqq)) {
                return false;
            }
            yqq yqq = (yqq) obj;
            cacv cacv = this.f54423a;
            cacv cacv2 = yqq.f54423a;
            if ((cacv.equals(cacv2) || (bmxi.m108538a(cacv.f172631b, cacv2.f172631b) && bmxi.m108538a(cacv.f172632c, cacv2.f172632c) && bnic.m109495a((Collection) cacv.f172634e).equals(bnic.m109495a((Collection) cacv2.f172634e)) && bnic.m109495a((Collection) cacv.f172633d).equals(bnic.m109495a((Collection) cacv2.f172633d)))) && bmxi.m108538a(this.f54424b, yqq.f54424b) && bmxi.m108538a(this.f54425c, yqq.f54425c) && bmxi.m108538a(this.f54426d, yqq.f54426d) && bmxi.m108538a(this.f54427e, yqq.f54427e) && bmxi.m108538a(this.f54428f, yqq.f54428f) && bmxi.m108538a(this.f54429g, yqq.f54429g)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54423a});
    }

    public final String toString() {
        cacv cacv = this.f54423a;
        return String.format("ClaimedBleDevice{bleDevice=%s, deviceName='%s', modelNumber='%s', manufacturer='%s', hardwareRevision='%s', firmwareRevision='%s', softwareRevision='%s'}", String.format("BleDevice[address=%s, name=%s]", cacv.f172631b, cacv.f172632c), this.f54424b, this.f54425c, this.f54426d, this.f54427e, this.f54428f, this.f54429g);
    }
}
