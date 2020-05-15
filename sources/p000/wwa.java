package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwa extends aeaa {

    /* renamed from: a */
    final /* synthetic */ FeedbackOptions f51454a;

    /* renamed from: b */
    final /* synthetic */ Context f51455b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wwa(String str, FeedbackOptions feedbackOptions, Context context) {
        super(str);
        this.f51454a = feedbackOptions;
        this.f51455b = context;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        wzb wzb;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
                wzb = !(queryLocalInterface instanceof wzb) ? new wyz(iBinder) : (wzb) queryLocalInterface;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", e.getMessage());
            } catch (Throwable th) {
                skh.m35531a().mo25689a(this.f51455b, this);
                throw th;
            }
        } else {
            wzb = null;
        }
        wzb.mo29579a(this.f51454a);
        Intent className = new Intent().setClassName(this.f51455b, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID", this.f51454a.f31603n);
        long j = this.f51454a.f31605p;
        if (j != 0) {
            className.putExtra("ASYNC_PSD_START_TICK_NANOS", j);
        }
        className.addFlags(268435456);
        this.f51455b.startActivity(className);
        skh.m35531a().mo25689a(this.f51455b, this);
    }
}
