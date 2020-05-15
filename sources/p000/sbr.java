package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.google.android.chimera.BoundService;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sbr implements ServiceConnection, sbt {

    /* renamed from: a */
    public final Map f44029a = new HashMap();

    /* renamed from: b */
    public int f44030b = 2;

    /* renamed from: c */
    public boolean f44031c;

    /* renamed from: d */
    public IBinder f44032d;

    /* renamed from: e */
    public final sbp f44033e;

    /* renamed from: f */
    public ComponentName f44034f;

    /* renamed from: g */
    final /* synthetic */ sbq f44035g;

    public sbr(sbq sbq, sbp sbp) {
        this.f44035g = sbq;
        this.f44033e = sbp;
    }

    /* renamed from: a */
    public final void mo25358a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f44029a.put(serviceConnection, serviceConnection2);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f44035g.f44023a) {
            this.f44035g.f44025c.removeMessages(1, this.f44033e);
            this.f44032d = iBinder;
            this.f44034f = componentName;
            for (ServiceConnection serviceConnection : this.f44029a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f44030b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f44035g.f44023a) {
            this.f44035g.f44025c.removeMessages(1, this.f44033e);
            this.f44032d = null;
            this.f44034f = componentName;
            for (ServiceConnection serviceConnection : this.f44029a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f44030b = 2;
        }
    }

    /* renamed from: a */
    public final void mo25359a(String str) {
        Intent intent;
        Bundle bundle;
        this.f44030b = 3;
        sbq sbq = this.f44035g;
        skh skh = sbq.f44026d;
        Context context = sbq.f44024b;
        sbp sbp = this.f44033e;
        if (sbp.f44016a == null) {
            intent = new Intent().setComponent(sbp.f44018c);
        } else {
            intent = null;
            if (sqr.m35998a()) {
                intent = BoundService.getStartIntent(context, sbp.f44016a);
            } else if (sbp.f44020e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", sbp.f44016a);
                try {
                    bundle = context.getContentResolver().call(sbp.f44015f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Dynamic intent resolution failed: ");
                    sb.append(valueOf);
                    Log.w("ConnectionStatusConfig", sb.toString());
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf2 = String.valueOf(sbp.f44016a);
                    Log.w("ConnectionStatusConfig", valueOf2.length() == 0 ? new String("Dynamic lookup for intent failed for action: ") : "Dynamic lookup for intent failed for action: ".concat(valueOf2));
                }
            }
            if (intent == null) {
                intent = new Intent(sbp.f44016a).setPackage(sbp.f44017b);
            }
        }
        boolean a = skh.mo25691a(context, str, intent, this, this.f44033e.f44019d);
        this.f44031c = a;
        if (a) {
            Message obtainMessage = this.f44035g.f44025c.obtainMessage(1, this.f44033e);
            sbq sbq2 = this.f44035g;
            sbq2.f44025c.sendMessageDelayed(obtainMessage, sbq2.f44027e);
            return;
        }
        this.f44030b = 2;
        try {
            sbq sbq3 = this.f44035g;
            sbq3.f44026d.mo25689a(sbq3.f44024b, this);
        } catch (IllegalArgumentException e2) {
        }
    }

    /* renamed from: a */
    public final boolean mo25360a() {
        return this.f44029a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo25361a(ServiceConnection serviceConnection) {
        return this.f44029a.containsKey(serviceConnection);
    }
}
