package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: dii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dii {

    /* renamed from: a */
    public int f13222a = 1;

    /* renamed from: b */
    public long f13223b;

    /* renamed from: c */
    public final SparseArray f13224c;

    /* renamed from: d */
    public final ComponentName f13225d;

    /* renamed from: e */
    public int f13226e = 0;

    public dii(ComponentName componentName) {
        this.f13225d = componentName;
        this.f13224c = new SparseArray();
        mo9096a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo9095a(Context context, String str, long j) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(j);
        return newWakeLock;
    }

    /* renamed from: a */
    public final void mo9096a() {
        this.f13223b = SystemClock.uptimeMillis();
        do {
        } while (SystemClock.uptimeMillis() == this.f13223b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9097a(Object obj) {
        if (obj != null) {
            bmxy.m108588a(obj instanceof PowerManager.WakeLock);
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        }
    }
}
