package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wvq extends wvt {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f51433a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvq(rkb rkb, FeedbackOptions feedbackOptions) {
        super(rkb);
        this.f51433a = feedbackOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        wyw wyw = (wyw) rjd;
        FeedbackOptions feedbackOptions = this.f51433a;
        wzg.m42520a(feedbackOptions);
        ((wze) wyw.mo25289B()).mo29478b(new ErrorReport(feedbackOptions, wyw.f51585a.getCacheDir()));
        mo17716a((rkk) Status.f30107a);
    }
}
