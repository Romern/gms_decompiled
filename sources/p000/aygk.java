package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: aygk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygk extends aeaa {

    /* renamed from: a */
    final String f97531a;

    /* renamed from: b */
    final axue f97532b;

    /* renamed from: c */
    final Intent f97533c;

    /* renamed from: d */
    public final ArrayDeque f97534d = new ArrayDeque();

    /* renamed from: e */
    public final aygj f97535e;

    /* renamed from: f */
    public axrv f97536f;

    /* renamed from: g */
    public boolean f97537g;

    /* renamed from: h */
    private final aygg f97538h;

    public aygk(aygj aygj, String str, aygg aygg) {
        super("wearable");
        this.f97531a = str;
        this.f97532b = aygj.f97527e;
        this.f97533c = new Intent("com.google.android.gms.wearable.BIND_LISTENER").setComponent(new ComponentName(aygj.f97527e.f96378b, str));
        this.f97535e = aygj;
        this.f97538h = aygg;
    }

    /* renamed from: a */
    public final aygz mo54008a() {
        aygz aygz;
        synchronized (this.f97534d) {
            aygz = (aygz) this.f97534d.peek();
        }
        return aygz;
    }

    public final String toString() {
        int size;
        boolean z;
        String arrayDeque;
        synchronized (this.f97534d) {
            size = this.f97534d.size();
            z = this.f97537g;
            arrayDeque = this.f97534d.toString();
        }
        return "ServiceRecord[" + this.f97531a + ", events=" + size + ", bound=" + z + ", " + arrayDeque + "]";
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("WearableService", sb.toString());
        }
        this.f97538h.mo54002a(this, 3).sendToTarget();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("WearableService", sb.toString());
        }
        Message a = this.f97538h.mo54002a(this, 2);
        a.getData().putBinder("binder", iBinder);
        a.sendToTarget();
    }

    /* renamed from: a */
    public final void mo54009a(Context context) {
        if (this.f97537g) {
            try {
                context.unbindService(this);
            } catch (IllegalArgumentException e) {
            }
            this.f97537g = false;
        }
        this.f97536f = null;
    }

    /* renamed from: a */
    public final void mo54010a(aygz aygz) {
        synchronized (this.f97534d) {
            this.f97534d.addFirst(aygz);
        }
    }
}
