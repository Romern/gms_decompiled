package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvu {

    /* renamed from: a */
    public static final Status f51439a = new Status(13);

    /* renamed from: b */
    public static final rjo f51440b = new rjo("Feedback.API", f51442d, f51441c);

    /* renamed from: c */
    private static final rje f51441c = new rje();

    /* renamed from: d */
    private static final rjl f51442d = new wvo();

    /* renamed from: a */
    public static rke m42358a(rkb rkb, Bundle bundle, long j) {
        wvr wvr = new wvr(rkb, bundle, j);
        rkb.mo24787a((rle) wvr);
        return wvr;
    }

    @Deprecated
    /* renamed from: b */
    public static rke m42362b(rkb rkb, FeedbackOptions feedbackOptions) {
        wvq wvq = new wvq(rkb, feedbackOptions);
        rkb.mo24787a((rle) wvq);
        return wvq;
    }

    @Deprecated
    /* renamed from: a */
    public static rke m42359a(rkb rkb, FeedbackOptions feedbackOptions) {
        return rkb.mo24787a((rle) new wvp(rkb, feedbackOptions, rkb.mo24794b(), System.nanoTime()));
    }

    /* renamed from: a */
    public static rke m42360a(rkb rkb, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        wvs wvs = new wvs(rkb, feedbackOptions, bundle, j);
        rkb.mo24787a((rle) wvs);
        return wvs;
    }

    /* renamed from: a */
    public static wwr m42361a(Context context) {
        return new wwr(context);
    }
}
