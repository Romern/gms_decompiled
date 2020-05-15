package p000;

import java.util.Arrays;

/* renamed from: avlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlr {

    /* renamed from: a */
    public final int f93325a;

    /* renamed from: b */
    public final long f93326b;

    public avlr(int i, long j) {
        this.f93325a = i;
        this.f93326b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avlr) {
            avlr avlr = (avlr) obj;
            if (this.f93325a == avlr.f93325a && this.f93326b == avlr.f93326b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f93325a), Long.valueOf(this.f93326b)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", Integer.valueOf(this.f93325a));
        a.mo25396a("delayMillis", Long.valueOf(this.f93326b));
        return a.toString();
    }
}
