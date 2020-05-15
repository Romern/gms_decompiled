package p000;

import com.android.volley.Response;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import java.util.List;

/* renamed from: abcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcz implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ List f57061a;

    /* renamed from: b */
    final /* synthetic */ ReportBatchedMetricsChimeraGcmTaskService f57062b;

    public abcz(ReportBatchedMetricsChimeraGcmTaskService reportBatchedMetricsChimeraGcmTaskService, List list) {
        this.f57062b = reportBatchedMetricsChimeraGcmTaskService;
        this.f57061a = list;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Integer num = (Integer) obj;
        this.f57062b.f78992a.mo32042a(this.f57061a);
    }
}
