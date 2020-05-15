package p000;

/* renamed from: aebl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebl extends aebz {

    /* renamed from: a */
    public long f63070a = -1;

    /* renamed from: b */
    public long f63071b = -1;

    public aebl() {
        this.f63102n = true;
    }

    /* renamed from: a */
    public final aebm mo33974b() {
        super.mo34031d();
        long j = this.f63070a;
        if (j == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (j > 0) {
            long j2 = this.f63071b;
            if (j2 == -1) {
                this.f63071b = (long) (((float) j) * 0.1f);
            } else if (j2 > j) {
                this.f63071b = j;
            }
            mo34030c();
            return new aebm(this);
        } else {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Period set cannot be less than or equal to 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo34008a(long j, long j2, aebu aebu) {
        sdo.m34959a(aebu);
        if (j < 1) {
            throw new IllegalArgumentException("Must set period to a value > 0.");
        } else if (j2 >= 1) {
            this.f63070a = j;
            this.f63071b = j2;
        } else {
            throw new IllegalArgumentException("Must set flex to a value > 0.");
        }
    }

    /* renamed from: a */
    public final void mo34009a(aebh aebh) {
        long j = aebh.f63065r;
        double h = cdnj.m134212h();
        double d = (double) j;
        Double.isNaN(d);
        this.f63071b = (long) (h * d);
        this.f63070a = j;
    }
}
