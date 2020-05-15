package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbt extends abbz {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f57017a;

    /* renamed from: b */
    final /* synthetic */ Bundle f57018b;

    /* renamed from: c */
    final /* synthetic */ long f57019c;

    /* renamed from: m */
    final /* synthetic */ GoogleHelp f57020m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abbt(rkb rkb, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(rkb);
        this.f57017a = feedbackOptions;
        this.f57018b = bundle;
        this.f57019c = j;
        this.f57020m = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31997a(abci abci) {
        try {
            abci.mo32012a(this.f57017a, this.f57018b, this.f57019c, this.f57020m, new abbs(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            mo17719d(abca.f57032a);
        }
    }
}
