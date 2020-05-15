package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: aeqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqo implements rkk {

    /* renamed from: a */
    public final Status f63633a;

    /* renamed from: b */
    public final ReportingState f63634b;

    public aeqo(Status status, ReportingState reportingState) {
        this.f63633a = status;
        if (status.f30115i == 0) {
            sdo.m34959a(reportingState);
        }
        this.f63634b = reportingState;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63633a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f63633a);
        String valueOf2 = String.valueOf(this.f63634b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("ReportingStateResultImpl{mStatus=");
        sb.append(valueOf);
        sb.append(", mReportingState=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
