package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bkpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpy {

    /* renamed from: a */
    public final int f125108a;

    /* renamed from: b */
    public final long f125109b;

    /* renamed from: c */
    public final List f125110c;

    public bkpy(int i, long j, Collection collection) {
        boolean z;
        this.f125108a = i;
        this.f125109b = j;
        this.f125110c = Collections.unmodifiableList(new ArrayList(collection));
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106782a(z, "revision must be non-negative");
        bkww.m106782a(j >= 0 ? true : z2, "request number must be non-negative");
        bkww.m106781a(collection, "changes");
        bkww.m106782a(!collection.isEmpty(), "a change is required");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkpy)) {
            return false;
        }
        bkpy bkpy = (bkpy) obj;
        return bkwv.m106780a(Integer.valueOf(this.f125108a), Integer.valueOf(bkpy.f125108a), Long.valueOf(this.f125109b), Long.valueOf(bkpy.f125109b), this.f125110c, bkpy.f125110c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f125108a), Long.valueOf(this.f125109b), this.f125110c});
    }

    public final String toString() {
        int i = this.f125108a;
        long j = this.f125109b;
        String valueOf = String.valueOf(this.f125110c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80);
        sb.append("SaveRequest [revision=");
        sb.append(i);
        sb.append(", requestNumber=");
        sb.append(j);
        sb.append(", changes=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
