package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: avvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avvd extends avuo {

    /* renamed from: a */
    private final rlf f93957a;

    /* renamed from: a */
    public final void mo51622a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        if (!status.mo17710c()) {
            this.f93957a.mo9482a(new avuw(status, null));
        } else {
            this.f93957a.mo9482a(new avuw(Status.f30107a, usageReportingOptInOptions));
        }
    }

    public avvd(rlf rlf) {
        this.f93957a = rlf;
    }
}
