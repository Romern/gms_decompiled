package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjp extends aeaa {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93275a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avjp(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity, String str) {
        super(str);
        this.f93275a = chimeraUpdateFromSdCardActivity;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        Log.i("CmaUpdateFromSdCardA", "Unexpectedly disconnected from ChimeraUpdateFromSdCardService.");
        synchronized (this) {
            this.f93275a.f109425a = null;
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        avkm avkm;
        Log.i("CmaUpdateFromSdCardA", "Connected to ChimeraUpdateFromSdCardService.");
        synchronized (this) {
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = this.f93275a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.update.IUpdateFromSdCardService");
                avkm = !(queryLocalInterface instanceof avkm) ? new avkk(iBinder) : (avkm) queryLocalInterface;
            } else {
                avkm = null;
            }
            chimeraUpdateFromSdCardActivity.f109425a = avkm;
            notifyAll();
        }
        this.f93275a.mo59650b();
    }
}
