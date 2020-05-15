package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwh */
final /* synthetic */ class wwh implements wyt {

    /* renamed from: a */
    private final wwi f51467a;

    /* renamed from: b */
    private final long f51468b;

    /* renamed from: c */
    private final FeedbackOptions f51469c;

    /* renamed from: d */
    private final Bundle f51470d;

    public wwh(wwi wwi, long j, FeedbackOptions feedbackOptions, Bundle bundle) {
        this.f51467a = wwi;
        this.f51468b = j;
        this.f51469c = feedbackOptions;
        this.f51470d = bundle;
    }

    /* renamed from: a */
    public final void mo29471a(Object obj) {
        Context context = (Context) obj;
        aayh.m47243a(this.f51468b, this.f51469c, this.f51470d, context, this.f51467a.mo29472a());
    }
}
