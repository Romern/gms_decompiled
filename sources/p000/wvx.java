package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wvx */
final /* synthetic */ class wvx implements Runnable {

    /* renamed from: a */
    private final wvy f51447a;

    /* renamed from: b */
    private final IBinder f51448b;

    /* renamed from: c */
    private final FeedbackOptions f51449c;

    /* renamed from: d */
    private final Context f51450d;

    public wvx(wvy wvy, IBinder iBinder, FeedbackOptions feedbackOptions, Context context) {
        this.f51447a = wvy;
        this.f51448b = iBinder;
        this.f51449c = feedbackOptions;
        this.f51450d = context;
    }

    public final void run() {
        wzb wzb;
        wvy wvy = this.f51447a;
        IBinder iBinder = this.f51448b;
        FeedbackOptions feedbackOptions = this.f51449c;
        Context context = this.f51450d;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
                wzb = !(queryLocalInterface instanceof wzb) ? new wyz(iBinder) : (wzb) queryLocalInterface;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", e.getMessage());
            } catch (Throwable th) {
                skh.m35531a().mo25689a(context, wvy);
                throw th;
            }
        } else {
            wzb = null;
        }
        wzb.mo29580a(wzb.mo29579a(feedbackOptions));
        skh.m35531a().mo25689a(context, wvy);
    }
}
