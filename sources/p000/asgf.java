package p000;

import android.content.Context;
import com.google.android.gms.appusage.AppUsageIntervals;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: asgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asgf extends aaab {

    /* renamed from: a */
    private final long f88910a;

    /* renamed from: b */
    private final long f88911b;

    /* renamed from: c */
    private final List f88912c;

    /* renamed from: d */
    private final gax f88913d;

    public asgf(gax gax, long j, long j2, List list) {
        super(193, "AppUsage");
        this.f88913d = gax;
        this.f88910a = j;
        this.f88911b = j2;
        this.f88912c = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        List list;
        if (this.f88910a > this.f88911b || ((list = this.f88912c) != null && list.isEmpty())) {
            throw new aaaj(10, "invalid parameters");
        }
        asgx asgx = new asgx(this.f88910a, this.f88911b, this.f88912c);
        asgx.mo49153a();
        this.f88913d.mo11605a(Status.f30107a, asgx.f88943b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f88913d.mo11605a(status, (AppUsageIntervals) null);
    }
}
