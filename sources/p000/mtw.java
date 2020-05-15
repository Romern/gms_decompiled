package p000;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: mtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtw {

    /* renamed from: a */
    public final String f34724a;

    /* renamed from: b */
    public final long f34725b;

    /* renamed from: c */
    public final Drawable f34726c;

    /* renamed from: d */
    private final long f34727d;

    public mtw(String str, long j, long j2, Drawable drawable) {
        this.f34724a = str;
        this.f34725b = j;
        this.f34727d = j2;
        this.f34726c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mtw) {
            mtw mtw = (mtw) obj;
            if (this.f34724a.equals(mtw.f34724a) && this.f34725b == mtw.f34725b && this.f34727d == mtw.f34727d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34724a, Long.valueOf(this.f34727d), Long.valueOf(this.f34725b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("mAppName", this.f34724a);
        a.mo25396a("mBackupSize", Long.valueOf(this.f34727d));
        a.mo25396a("mLastBackupEpochTime", Long.valueOf(this.f34725b));
        return a.toString();
    }
}
