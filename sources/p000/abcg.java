package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* renamed from: abcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abcg extends dcj implements abci {
    public abcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    /* renamed from: a */
    public final void mo32011a(Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        bj.writeLong(j);
        dcl.m8165a(bj, googleHelp);
        dcl.m8164a(bj, abcf);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo32013a(GoogleHelp googleHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32014a(GoogleHelp googleHelp, String str, String str2, abcf abcf) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32015a(InProductHelp inProductHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: a */
    public final void mo32016a(SupportRequestHelp supportRequestHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32017b(Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        bj.writeLong(j);
        dcl.m8165a(bj, googleHelp);
        dcl.m8164a(bj, abcf);
        mo8530c(9, bj);
    }

    /* renamed from: b */
    public final void mo32018b(GoogleHelp googleHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32019b(GoogleHelp googleHelp, String str, String str2, abcf abcf) {
        throw null;
    }

    /* renamed from: b */
    public final void mo32020b(SupportRequestHelp supportRequestHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: c */
    public final void mo32021c(GoogleHelp googleHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: d */
    public final void mo32022d(GoogleHelp googleHelp, abcf abcf) {
        throw null;
    }

    /* renamed from: e */
    public final void mo32023e(GoogleHelp googleHelp, abcf abcf) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, googleHelp);
        dcl.m8165a(bj, (Parcelable) null);
        dcl.m8164a(bj, abcf);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo32012a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, abcf abcf) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, feedbackOptions);
        dcl.m8165a(bj, bundle);
        bj.writeLong(j);
        dcl.m8165a(bj, googleHelp);
        dcl.m8164a(bj, abcf);
        mo8530c(10, bj);
    }
}
