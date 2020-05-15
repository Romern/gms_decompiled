package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpu {

    /* renamed from: a */
    public final List f125094a;

    /* renamed from: b */
    public final bkpt f125095b;

    public bkpu(List list, bkpt bkpt) {
        this.f125094a = list;
        this.f125095b = bkpt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bkpu bkpu = (bkpu) obj;
        return bkwv.m106780a(this.f125095b, bkpu.f125095b, this.f125094a, bkpu.f125094a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125095b, this.f125094a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125095b);
        String valueOf2 = String.valueOf(this.f125094a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("Type: ");
        sb.append(valueOf);
        sb.append(", snapshot: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
