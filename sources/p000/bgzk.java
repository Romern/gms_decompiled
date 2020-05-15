package p000;

import java.util.Arrays;

/* renamed from: bgzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzk {

    /* renamed from: a */
    public final boolean f118160a;

    /* renamed from: b */
    public final int f118161b;

    public bgzk(boolean z, int i) {
        this.f118160a = z;
        this.f118161b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bgzk) {
            bgzk bgzk = (bgzk) obj;
            return this.f118160a == bgzk.f118160a && this.f118161b == bgzk.f118161b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f118160a), Integer.valueOf(this.f118161b)});
    }

    public final String toString() {
        boolean z = this.f118160a;
        int i = this.f118161b;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Result{moved=");
        sb.append(z);
        sb.append(", reason=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
