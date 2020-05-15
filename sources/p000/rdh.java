package p000;

import java.util.Arrays;

/* renamed from: rdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdh {

    /* renamed from: a */
    public long f42727a;

    /* renamed from: b */
    public long f42728b;

    /* renamed from: c */
    public long f42729c;

    public rdh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdh) {
            rdh rdh = (rdh) obj;
            return this.f42727a == rdh.f42727a && this.f42728b == rdh.f42728b && this.f42729c == rdh.f42729c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f42727a), Long.valueOf(this.f42729c), Long.valueOf(this.f42728b)});
    }

    public rdh(long j) {
        this.f42727a = j;
        this.f42728b = 0;
        this.f42729c = 0;
    }
}
