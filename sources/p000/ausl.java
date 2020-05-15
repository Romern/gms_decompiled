package p000;

import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: ausl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ausl implements Callable {

    /* renamed from: a */
    private final int f92423a;

    /* renamed from: d */
    final Object[] f92424d;

    public ausl(int i, Object... objArr) {
        this.f92423a = i;
        this.f92424d = objArr;
    }

    /* renamed from: a */
    public abstract void mo50864a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ausl) {
            return Arrays.equals(this.f92424d, ((ausl) obj).f92424d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f92424d);
    }

    public final String toString() {
        int i = this.f92423a;
        return i != 3 ? i != 4 ? "disable notification operation" : "enable notification operation" : "check eid support operation";
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo50864a();
        return null;
    }
}
