package p000;

import android.content.Intent;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwk {

    /* renamed from: a */
    final /* synthetic */ ErrorReport f51476a;

    /* renamed from: b */
    final /* synthetic */ Intent f51477b;

    /* renamed from: c */
    final /* synthetic */ FeedbackChimeraActivity f51478c;

    public wwk(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Intent intent) {
        this.f51478c = feedbackChimeraActivity;
        this.f51476a = errorReport;
        this.f51477b = intent;
    }

    /* renamed from: a */
    public final void mo29481a() {
        mo29482a(120, this.f51476a);
        this.f51478c.mo18603b(this.f51477b);
    }

    /* renamed from: a */
    public final void mo29482a(int i, ErrorReport errorReport) {
        this.f51478c.mo18593a(i, errorReport);
    }
}
