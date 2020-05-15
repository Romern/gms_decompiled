package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wvs extends wvt {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f51436a;

    /* renamed from: b */
    final /* synthetic */ Bundle f51437b;

    /* renamed from: c */
    final /* synthetic */ long f51438c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvs(rkb rkb, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(rkb);
        this.f51436a = feedbackOptions;
        this.f51437b = bundle;
        this.f51438c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        wyw wyw = (wyw) rjd;
        try {
            FeedbackOptions feedbackOptions = this.f51436a;
            Bundle bundle = this.f51437b;
            long j = this.f51438c;
            wzg.m42519a(bundle);
            wzg.m42520a(feedbackOptions);
            ((wze) wyw.mo25289B()).mo29476a(feedbackOptions, bundle, j);
            mo17716a((rkk) Status.f30107a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            mo17719d(wvu.f51439a);
        }
    }
}
