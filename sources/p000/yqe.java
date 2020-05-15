package p000;

import java.util.Arrays;

/* renamed from: yqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqe {

    /* renamed from: a */
    public final String f54380a;

    /* renamed from: b */
    public final cadr f54381b;

    /* renamed from: c */
    public final long f54382c;

    /* renamed from: d */
    public final cadr f54383d;

    /* renamed from: e */
    public final int f54384e;

    public yqe(String str, cadr cadr, int i) {
        this(str, cadr, i, null, -1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof yqe)) {
                return false;
            }
            yqe yqe = (yqe) obj;
            if (!this.f54380a.equals(yqe.f54380a) || !this.f54381b.equals(yqe.f54381b) || !bmxi.m108538a(this.f54383d, yqe.f54383d)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54380a, this.f54381b});
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = this.f54380a;
        objArr[1] = yyo.m45045c(this.f54381b);
        objArr[2] = yyo.m45044b(this.f54383d);
        int i = this.f54384e;
        if (i == 1) {
            str = "LOCAL_AND_SERVER";
        } else if (i != 2) {
            str = "null";
        } else {
            str = "SERVER";
        }
        if (i != 0) {
            objArr[3] = str;
            return String.format("AppSubscription{package=%s, sub=%s, original=%s, type=%s}", objArr);
        }
        throw null;
    }

    public yqe(String str, cadr cadr, int i, cadr cadr2, long j) {
        bmxy.m108588a(!str.isEmpty());
        this.f54380a = str;
        bmxy.m108581a(cadr);
        this.f54381b = cadr;
        this.f54384e = i;
        this.f54383d = cadr2;
        this.f54382c = j;
    }
}
