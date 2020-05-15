package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzc extends dcj implements wze {
    public wzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    /* renamed from: a */
    public final void mo29473a(Bundle bundle, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        bj.writeLong(j);
        mo8528b(4, bj);
    }

    /* renamed from: b */
    public final boolean mo29478b(ErrorReport errorReport) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, errorReport);
        Parcel a = mo8526a(3, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo29474a(ErrorReport errorReport, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, errorReport);
        bj.writeLong(j);
        mo8530c(6, bj);
    }

    /* renamed from: b */
    public final boolean mo29479b(FeedbackOptions feedbackOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, feedbackOptions);
        Parcel a = mo8526a(7, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo29475a(FeedbackOptions feedbackOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, feedbackOptions);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo29476a(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, feedbackOptions);
        dcl.m8165a(bj, bundle);
        bj.writeLong(j);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final boolean mo29477a(ErrorReport errorReport) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, errorReport);
        Parcel a = mo8526a(1, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
