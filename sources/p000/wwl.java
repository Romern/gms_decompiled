package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: wwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwl extends aeaa {

    /* renamed from: a */
    final /* synthetic */ Intent f51479a;

    /* renamed from: b */
    final /* synthetic */ FeedbackChimeraActivity f51480b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wwl(FeedbackChimeraActivity feedbackChimeraActivity, String str, Intent intent) {
        super(str);
        this.f51480b = feedbackChimeraActivity;
        this.f51479a = intent;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f51480b.f31586n = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        wzb wzb;
        FeedbackChimeraActivity feedbackChimeraActivity = this.f51480b;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
            wzb = queryLocalInterface instanceof wzb ? (wzb) queryLocalInterface : new wyz(iBinder);
        } else {
            wzb = null;
        }
        feedbackChimeraActivity.f31586n = wzb;
        FeedbackChimeraActivity feedbackChimeraActivity2 = this.f51480b;
        feedbackChimeraActivity2.setContentView(feedbackChimeraActivity2.mo18608e());
        this.f51480b.mo18603b(this.f51479a);
    }
}
