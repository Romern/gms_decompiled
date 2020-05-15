package p000;

import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ wwy f51489a;

    /* renamed from: b */
    final /* synthetic */ boolean f51490b;

    /* renamed from: c */
    final /* synthetic */ FeedbackChimeraActivity f51491c;

    public wwo(FeedbackChimeraActivity feedbackChimeraActivity, wwy wwy, boolean z) {
        this.f51491c = feedbackChimeraActivity;
        this.f51489a = wwy;
        this.f51490b = z;
    }

    public final void run() {
        this.f51491c.mo18600a(this.f51489a, this.f51490b);
    }
}
