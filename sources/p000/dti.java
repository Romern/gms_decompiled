package p000;

import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.Arrays;

/* renamed from: dti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dti {

    /* renamed from: a */
    public final String f13984a;

    /* renamed from: b */
    public final long f13985b;

    /* renamed from: c */
    public final long f13986c;

    private dti(String str, long j, long j2) {
        this.f13984a = str;
        this.f13985b = j;
        this.f13986c = j2;
    }

    /* renamed from: a */
    public static dti m9284a(UpdateFenceOperation updateFenceOperation) {
        return new dti(updateFenceOperation.f30667f, updateFenceOperation.f30668g, updateFenceOperation.f30669h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dti) {
            return this.f13984a.equals(((dti) obj).f13984a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13984a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("fenceKey", this.f13984a);
        a.mo25396a("resp", Long.valueOf(this.f13985b));
        a.mo25396a("ttl", Long.valueOf(this.f13986c));
        return a.toString();
    }
}
