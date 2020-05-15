package p000;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: wwb */
final /* synthetic */ class wwb implements wyt {

    /* renamed from: a */
    private final wwi f51456a;

    /* renamed from: b */
    private final ErrorReport f51457b;

    public wwb(wwi wwi, ErrorReport errorReport) {
        this.f51456a = wwi;
        this.f51457b = errorReport;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        wwi wwi = this.f51456a;
        Context context = (Context) obj;
        context.startActivity(wwi.m42374a(wwi.f51471a, this.f51457b, (Long) null));
    }
}
