package p000;

import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: amra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amra implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f75791a;

    /* renamed from: b */
    final /* synthetic */ amrb f75792b;

    public amra(amrb amrb, FeedbackOptions feedbackOptions) {
        this.f75792b = amrb;
        this.f75791a = feedbackOptions;
    }

    public final void run() {
        wvu.m42359a(this.f75792b.f75794b.f75796b, this.f75791a);
    }
}
