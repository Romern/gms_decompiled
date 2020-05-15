package p000;

/* renamed from: aebi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebi extends aebz {

    /* renamed from: a */
    public long f63066a = -1;

    /* renamed from: b */
    public long f63067b = -1;

    public aebi() {
        this.f63102n = false;
    }

    /* renamed from: a */
    public final void mo34004a(long j, long j2) {
        this.f63066a = j;
        this.f63067b = j2;
    }

    /* renamed from: a */
    public final aebj mo33974b() {
        super.mo34031d();
        long j = this.f63066a;
        if (j != -1) {
            long j2 = this.f63067b;
            if (j2 != -1) {
                if (j < j2) {
                    mo34030c();
                    return new aebj(this);
                }
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
}
