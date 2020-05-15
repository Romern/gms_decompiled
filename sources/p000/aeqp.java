package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: aeqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqp implements rkk {

    /* renamed from: a */
    public final Status f63635a;

    /* renamed from: b */
    private final long f63636b;

    public aeqp(Status status, long j) {
        this.f63635a = status;
        this.f63636b = j;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63635a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f63635a);
        long j = this.f63636b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("ReportingUploadResultImpl{mStatus=");
        sb.append(valueOf);
        sb.append(", mRequestId=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
