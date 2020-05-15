package p000;

import android.content.Context;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;

/* renamed from: wwe */
final /* synthetic */ class wwe implements wyt {

    /* renamed from: a */
    private final ErrorReport f51462a;

    public wwe(ErrorReport errorReport) {
        this.f51462a = errorReport;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        FeedbackAsyncChimeraService.m23358b((Context) obj, this.f51462a);
    }
}
