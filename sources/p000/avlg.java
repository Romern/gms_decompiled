package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: avlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avlg extends aeaa {
    public avlg(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        Log.i("SystemUpdateClient", "Unexpectedly disconnected from ChimeraSystemUpdateService.");
        synchronized (avlh.f93307c) {
            avlh.f93305a = null;
            avlh.f93306b = false;
            avlh.f93308d.clear();
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        avkg avkg;
        Log.i("SystemUpdateClient", "Connected to ChimeraSystemUpdateService.");
        synchronized (avlh.f93307c) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.update.ISystemUpdateService");
                    avkg = !(queryLocalInterface instanceof avkg) ? new avke(iBinder) : (avkg) queryLocalInterface;
                } catch (InterruptedException e) {
                    Log.e("SystemUpdateClient", "bindService post connection run is interrupted!");
                    Thread.currentThread().interrupt();
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("bindService post connection run has exception:");
                    sb.append(valueOf);
                    Log.e("SystemUpdateClient", sb.toString());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                avkg = null;
            }
            avlh.f93305a = avkg;
            if (avlh.f93305a != null) {
                avlh.f93306b = true;
                avlh.f93307c.notifyAll();
                while (!avlh.f93308d.isEmpty()) {
                    ((Runnable) avlh.f93308d.take()).run();
                }
            } else {
                Log.e("SystemUpdateClient", "Failed to connect to SystemUpdateService");
                return;
            }
        }
        avmj.m78803a();
        throw null;
    }
}
