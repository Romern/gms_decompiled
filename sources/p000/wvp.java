package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wvp extends wvt {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f51430a;

    /* renamed from: b */
    final /* synthetic */ Context f51431b;

    /* renamed from: c */
    final /* synthetic */ long f51432c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvp(rkb rkb, FeedbackOptions feedbackOptions, Context context, long j) {
        super(rkb);
        this.f51430a = feedbackOptions;
        this.f51431b = context;
        this.f51432c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        wvd wvd;
        wyw wyw = (wyw) rjd;
        FeedbackOptions feedbackOptions = this.f51430a;
        if (feedbackOptions == null || (wvd = feedbackOptions.f31606q) == null) {
            wzg.m42520a(feedbackOptions);
            wyw.mo29576a(feedbackOptions);
            ((wze) wyw.mo25289B()).mo29477a(new ErrorReport(feedbackOptions, wyw.f51585a.getCacheDir()));
            mo17716a((rkk) Status.f30107a);
            return;
        }
        wzg.m42518a(this.f51431b, wvd, this.f51432c);
        FeedbackOptions feedbackOptions2 = this.f51430a;
        long j = this.f51432c;
        wzg.m42520a(feedbackOptions2);
        wyw.mo29576a(feedbackOptions2);
        ((wze) wyw.mo25289B()).mo29474a(new ErrorReport(feedbackOptions2, wyw.f51585a.getCacheDir()), j);
        mo17716a((rkk) Status.f30107a);
    }
}
