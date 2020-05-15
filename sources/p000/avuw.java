package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: avuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avuw implements rkk {

    /* renamed from: a */
    public final Status f93945a;

    /* renamed from: b */
    public final UsageReportingOptInOptions f93946b;

    public avuw(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.f93945a = status;
        this.f93946b = usageReportingOptInOptions;
    }

    /* renamed from: b */
    public final boolean mo51635b() {
        sdo.m34959a(this.f93946b);
        return this.f93946b.f109538a == 1;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f93945a;
    }

    public final String toString() {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (this.f93946b.f109538a != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
