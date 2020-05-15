package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* renamed from: sps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sps {

    /* renamed from: a */
    public final Handler f44948a;

    /* renamed from: b */
    public final Object f44949b = new Object();

    /* renamed from: c */
    protected spr f44950c;

    protected sps(Handler handler) {
        this.f44948a = handler;
    }

    /* renamed from: a */
    public static sps m35913a(Context context, Handler handler) {
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        return new spu((ActivityManager) applicationContext.getSystemService("activity"), svr.m36484b(applicationContext), handler);
    }

    /* renamed from: a */
    public abstract boolean mo25946a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25947b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo25948c();

    /* renamed from: a */
    public final void mo25944a() {
        synchronized (this.f44949b) {
            if (this.f44950c != null) {
                mo25948c();
                this.f44950c = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo25945a(spr spr) {
        boolean z;
        synchronized (this.f44949b) {
            sdo.m34959a(spr);
            if (this.f44950c == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f44950c = spr;
            mo25947b();
        }
    }
}
