package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvy extends aeaa {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f51451a;

    /* renamed from: b */
    final /* synthetic */ Context f51452b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wvy(String str, FeedbackOptions feedbackOptions, Context context) {
        super(str);
        this.f51451a = feedbackOptions;
        this.f51452b = context;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        FeedbackAsyncChimeraService.f31572b.execute(new wvx(this, iBinder, this.f51451a, this.f51452b));
    }
}
