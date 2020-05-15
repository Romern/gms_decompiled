package p000;

import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: ggf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ggf extends Service {

    /* renamed from: a */
    protected volatile gge f18126a;

    /* renamed from: b */
    protected int f18127b = Integer.MAX_VALUE;

    /* renamed from: c */
    protected int f18128c = 0;

    /* renamed from: d */
    protected adzt f18129d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract gge mo7340b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7341c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo7342d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo11787f() {
        this.f18128c = 0;
    }

    public IBinder onBind(Intent intent) {
        if (this.f18126a == null && mo7342d()) {
            this.f18126a = mo7340b();
        }
        this.f18129d.post(new gga(this));
        return null;
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("ReleasableService");
        handlerThread.start();
        this.f18129d = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f18129d.post(new gfz(this));
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f18129d.post(new gfy(this, i2));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        gge gge = this.f18126a;
        this.f18126a = null;
        this.f18129d.post(new ggb(this, gge));
        return false;
    }
}
