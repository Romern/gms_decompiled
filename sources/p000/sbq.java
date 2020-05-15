package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: sbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbq {

    /* renamed from: f */
    private static final Object f44021f = new Object();

    /* renamed from: g */
    private static sbq f44022g;

    /* renamed from: a */
    public final HashMap f44023a;

    /* renamed from: b */
    public final Context f44024b;

    /* renamed from: c */
    public final Handler f44025c;

    /* renamed from: d */
    public final skh f44026d;

    /* renamed from: e */
    public final long f44027e;

    /* renamed from: h */
    private final long f44028h;

    public sbq() {
    }

    /* renamed from: a */
    public static sbq m34856a(Context context) {
        synchronized (f44021f) {
            if (f44022g == null) {
                f44022g = new sbq(context.getApplicationContext());
            }
        }
        return f44022g;
    }

    public sbq(Context context) {
        this.f44023a = new HashMap();
        this.f44024b = context.getApplicationContext();
        this.f44025c = new adzt(context.getMainLooper(), new sbs(this));
        this.f44026d = skh.m35531a();
        this.f44028h = 5000;
        this.f44027e = 300000;
    }

    /* renamed from: a */
    public final void mo25351a(ComponentName componentName, ServiceConnection serviceConnection) {
        mo25354a(new sbp(componentName), serviceConnection);
    }

    /* renamed from: a */
    public final void mo25352a(String str, ServiceConnection serviceConnection) {
        mo25354a(new sbp(str), serviceConnection);
    }

    /* renamed from: a */
    public final void mo25353a(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        mo25354a(new sbp(str, str2, i, z), serviceConnection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25354a(sbp sbp, ServiceConnection serviceConnection) {
        sdo.m34966a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f44023a) {
            sbr sbr = (sbr) this.f44023a.get(sbp);
            if (sbr == null) {
                String valueOf = String.valueOf(sbp);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (sbr.mo25361a(serviceConnection)) {
                sbr.f44029a.remove(serviceConnection);
                if (sbr.mo25360a()) {
                    this.f44025c.sendMessageDelayed(this.f44025c.obtainMessage(0, sbp), this.f44028h);
                }
            } else {
                String valueOf2 = String.valueOf(sbp);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25355a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo25357a(new sbp(componentName), serviceConnection, str);
    }

    /* renamed from: a */
    public final boolean mo25356a(String str, ServiceConnection serviceConnection, String str2) {
        return mo25357a(new sbp(str), serviceConnection, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25357a(sbp sbp, ServiceConnection serviceConnection, String str) {
        boolean z;
        sdo.m34966a(serviceConnection, "ServiceConnection must not be null");
        ServiceConnection a = sbu.m34868a(serviceConnection);
        synchronized (this.f44023a) {
            sbr sbr = (sbr) this.f44023a.get(sbp);
            if (sbr == null) {
                sbr = new sbr(this, sbp);
                sbr.mo25358a(serviceConnection, a);
                sbr.mo25359a(str);
                this.f44023a.put(sbp, sbr);
            } else {
                this.f44025c.removeMessages(0, sbp);
                if (!sbr.mo25361a(serviceConnection)) {
                    sbr.mo25358a(serviceConnection, a);
                    int i = sbr.f44030b;
                    if (i == 1) {
                        a.onServiceConnected(sbr.f44034f, sbr.f44032d);
                    } else if (i == 2) {
                        sbr.mo25359a(str);
                    }
                } else {
                    String valueOf = String.valueOf(sbp);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = sbr.f44031c;
        }
        return z;
    }
}
