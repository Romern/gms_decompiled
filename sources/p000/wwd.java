package p000;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: wwd */
final /* synthetic */ class wwd implements wyt {

    /* renamed from: a */
    private final wwi f51459a;

    /* renamed from: b */
    private final ErrorReport f51460b;

    /* renamed from: c */
    private final long f51461c;

    public wwd(wwi wwi, ErrorReport errorReport, long j) {
        this.f51459a = wwi;
        this.f51460b = errorReport;
        this.f51461c = j;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        wwi wwi = this.f51459a;
        Context context = (Context) obj;
        context.startActivity(wwi.m42374a(wwi.f51471a, this.f51460b, Long.valueOf(this.f51461c)));
    }
}
