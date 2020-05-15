package p000;

import java.util.Arrays;

/* renamed from: blgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blgu {

    /* renamed from: a */
    public static final blgu f126474a = new blgu();

    /* renamed from: b */
    public int f126475b = 0;

    /* renamed from: c */
    public int f126476c = 0;

    private blgu() {
    }

    /* renamed from: b */
    public static blgt m107150b() {
        return new blgt();
    }

    /* renamed from: a */
    public final blgt mo66509a() {
        return new blgt(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blgu) {
            blgu blgu = (blgu) obj;
            return bkwv.m106779a(Integer.valueOf(this.f126475b), Integer.valueOf(blgu.f126475b)) && bkwv.m106779a(Integer.valueOf(this.f126476c), Integer.valueOf(blgu.f126476c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f126475b), Integer.valueOf(this.f126476c)});
    }

    public blgu(blgt blgt) {
        this.f126475b = blgt.f126472a;
        this.f126476c = blgt.f126473b;
    }
}
