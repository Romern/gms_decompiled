package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;

/* renamed from: sno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sno extends Service {

    /* renamed from: a */
    private volatile sns f44802a;

    /* renamed from: b */
    private volatile snn f44803b;

    /* renamed from: c */
    private final int f44804c;

    public sno() {
        this.f44804c = 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17286a(Intent intent);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.f44802a = new sns(this.f44804c);
        this.f44802a.start();
        this.f44803b = new snn(this, this.f44802a);
    }

    public void onDestroy() {
        this.f44802a.quit();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Message obtain = Message.obtain();
        obtain.arg1 = i2;
        obtain.obj = intent;
        this.f44803b.sendMessage(obtain);
        return 2;
    }

    public sno(int i) {
        this.f44804c = i;
    }
}
