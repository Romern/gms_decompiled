package p000;

import java.util.Arrays;

/* renamed from: bfas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfas implements Comparable {

    /* renamed from: a */
    public final int f113257a;

    /* renamed from: b */
    public final int f113258b;

    public bfas(int i, int i2) {
        this.f113257a = i;
        this.f113258b = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bfas bfas = (bfas) obj;
        return bneu.f131545b.mo67471a(this.f113257a, bfas.f113257a).mo67471a(this.f113258b, bfas.f113258b).mo67470a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfas) {
            bfas bfas = (bfas) obj;
            if (bfas.f113257a == this.f113257a && bfas.f113258b == this.f113258b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f113257a), Integer.valueOf(this.f113258b)});
    }
}
