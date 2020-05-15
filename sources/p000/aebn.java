package p000;

/* renamed from: aebn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebn {

    /* renamed from: a */
    public int f63074a;

    /* renamed from: b */
    public int f63075b;

    /* renamed from: c */
    public int f63076c;

    /* renamed from: a */
    public final aebo mo34011a() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f63074a;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = i == 1;
        }
        sdo.m34975b(z, "Must provide a valid RetryPolicy.");
        if (this.f63074a != 0) {
            if (this.f63075b >= 10) {
                z3 = true;
            } else {
                z3 = false;
            }
            sdo.m34975b(z3, "RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
        } else {
            if (this.f63075b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34975b(z2, "RETRY_POLICY_EXPONENTIAL must have a positive initialBackoffSeconds.");
        }
        if (this.f63076c > this.f63075b) {
            z4 = true;
        }
        sdo.m34975b(z4, "MaximumBackoffSeconds must be greater than InitialBackoffSeconds.");
        return new aebo(this.f63074a, this.f63075b, this.f63076c);
    }
}
