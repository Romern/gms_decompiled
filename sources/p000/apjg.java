package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: apjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apjg extends aeaa {

    /* renamed from: a */
    private final Context f84532a;

    /* renamed from: b */
    private boolean f84533b = false;

    public apjg(Context context) {
        super("scheduler");
        this.f84532a = context;
    }

    /* renamed from: a */
    public final synchronized void mo47343a() {
        if (!this.f84533b) {
            try {
                skh.m35531a().mo25689a(this.f84532a, this);
                this.f84533b = true;
            } catch (IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Error while unbinding: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler.TID", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        try {
            if (apil.m70420a(iBinder)) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                new Messenger(iBinder).send(obtain);
            }
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Error sending init message: ");
            sb.append(valueOf);
            Log.e("NetworkScheduler.TID", sb.toString());
        } catch (Throwable th) {
            mo47343a();
            throw th;
        }
        mo47343a();
    }
}
