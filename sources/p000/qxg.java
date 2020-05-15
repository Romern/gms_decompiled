package p000;

/* renamed from: qxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxg extends qxf {

    /* renamed from: b */
    private final long f42363b;

    public qxg(int i) {
        super(1);
        this.f42363b = (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final long mo24357a(long j) {
        return super.mo24357a(Math.max(Math.min(j, this.f42363b), 1L));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof qxg) && this.f42362a == ((qxg) obj).f42362a;
        }
        return true;
    }
}
