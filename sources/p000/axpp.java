package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: axpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axpp extends Service implements axot, axok {

    /* renamed from: a */
    private IBinder f96253a;

    /* renamed from: b */
    public ComponentName f96254b;

    /* renamed from: c */
    public axpe f96255c;

    /* renamed from: d */
    public Intent f96256d;

    /* renamed from: e */
    public final Object f96257e = new Object();

    /* renamed from: f */
    public boolean f96258f;

    /* renamed from: g */
    public final axqe f96259g = new axqe(new axol());

    /* renamed from: h */
    private Looper f96260h;

    /* renamed from: a */
    public void mo19177a() {
    }

    /* renamed from: a */
    public void mo53375a(axoj axoj) {
    }

    /* renamed from: a */
    public final void mo53308a(Channel channel) {
    }

    /* renamed from: a */
    public void mo7590a(MessageEventParcelable messageEventParcelable) {
    }

    /* renamed from: a */
    public void mo19178a(rtx rtx) {
    }

    /* renamed from: b */
    public void mo19179b() {
    }

    /* renamed from: b */
    public final void mo53309b(Channel channel) {
    }

    /* renamed from: c */
    public final void mo53310c(Channel channel) {
    }

    /* renamed from: d */
    public final void mo53311d(Channel channel) {
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.f96253a;
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f96254b = new ComponentName(this, getContainerService().getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f96254b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb.append("onCreate: ");
            sb.append(valueOf);
            Log.d("WearableLS", sb.toString());
        }
        if (this.f96260h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f96260h = handlerThread.getLooper();
        }
        this.f96255c = new axpe(this, this.f96260h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f96256d = intent;
        intent.setComponent(this.f96254b);
        this.f96253a = new axpo(this);
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f96254b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("onDestroy: ");
            sb.append(valueOf);
            Log.d("WearableLS", sb.toString());
        }
        synchronized (this.f96257e) {
            this.f96258f = true;
            axpe axpe = this.f96255c;
            if (axpe != null) {
                axpe.getLooper().quit();
                axpe.mo53356a("quit");
            } else {
                String valueOf2 = String.valueOf(this.f96254b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 111);
                sb2.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        super.onDestroy();
    }
}
