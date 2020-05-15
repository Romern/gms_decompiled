package p000;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwp */
final /* synthetic */ class wwp implements roo {

    /* renamed from: a */
    private final FeedbackOptions f51492a;

    /* renamed from: b */
    private final long f51493b;

    /* renamed from: c */
    private final Context f51494c;

    public wwp(FeedbackOptions feedbackOptions, long j, Context context) {
        this.f51492a = feedbackOptions;
        this.f51493b = j;
        this.f51494c = context;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        FeedbackOptions feedbackOptions = this.f51492a;
        long j = this.f51493b;
        Context context = this.f51494c;
        wyw wyw = (wyw) obj;
        wwu wwu = new wwu(feedbackOptions);
        wwu.f51503h = j;
        FeedbackOptions a = wwu.mo29490a();
        wvd wvd = a.f31606q;
        if (wvd != null) {
            wzg.m42518a(context, wvd, j);
        }
        wzg.m42520a(a);
        wyw.mo29576a(a);
        ((wze) wyw.mo25289B()).mo29475a(a);
        ((aucf) obj2).mo50391a((Object) null);
    }
}
