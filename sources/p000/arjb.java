package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: arjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arjb extends dck implements arjc {

    /* renamed from: a */
    public final areb f87787a;

    /* renamed from: b */
    protected Handler f87788b;

    public arjb() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
    }

    /* renamed from: a */
    public final void mo48590a() {
        this.f87788b.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public final void mo48596b(String str) {
        Handler handler = this.f87788b;
        handler.sendMessage(handler.obtainMessage(4, str));
    }

    /* renamed from: a */
    public final void mo48591a(int i) {
        Handler handler = this.f87788b;
        handler.sendMessage(handler.obtainMessage(5, Integer.valueOf(i)));
    }

    public arjb(areb areb) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
        this.f87788b = new arld(this, Looper.getMainLooper());
        this.f87787a = areb;
    }

    /* renamed from: a */
    public final void mo48592a(BootstrapCompletionResult bootstrapCompletionResult) {
        Handler handler = this.f87788b;
        handler.sendMessage(handler.obtainMessage(2, bootstrapCompletionResult));
    }

    /* renamed from: a */
    public final void mo48593a(TargetConnectionArgs targetConnectionArgs) {
        Handler handler = this.f87788b;
        handler.sendMessage(handler.obtainMessage(0, targetConnectionArgs));
    }

    /* renamed from: a */
    public final void mo48594a(String str) {
        Handler handler = this.f87788b;
        handler.sendMessage(handler.obtainMessage(3, str));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo48593a((TargetConnectionArgs) dcl.m8163a(parcel, TargetConnectionArgs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo48590a();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a = mo48595a((BootstrapProgressResult) dcl.m8163a(parcel, BootstrapProgressResult.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 4:
                this.f87788b.sendEmptyMessage(2);
                parcel2.writeNoException();
                return true;
            case 5:
                mo48594a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo48596b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 7:
                mo48591a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                mo48592a((BootstrapCompletionResult) dcl.m8163a(parcel, BootstrapCompletionResult.CREATOR));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo48595a(BootstrapProgressResult bootstrapProgressResult) {
        FutureTask futureTask = new FutureTask(new arle(this, bootstrapProgressResult));
        this.f87788b.post(futureTask);
        try {
            Log.v("SmartDevice", "Waiting on client onProgress() response.");
            boolean booleanValue = ((Boolean) futureTask.get()).booleanValue();
            StringBuilder sb = new StringBuilder(35);
            sb.append("Client returned onProgress(): ");
            sb.append(booleanValue);
            Log.v("SmartDevice", sb.toString());
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            return booleanValue;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("SmartDevice", "Failed while waiting for TargetBootstrapListener.onProgress()", e);
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            return false;
        } catch (Throwable th) {
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            throw th;
        }
    }
}
