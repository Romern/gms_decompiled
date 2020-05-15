package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.wearable.node.NodeService$ListenerNotifyHandler$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: axzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzl extends adzt {

    /* renamed from: a */
    final /* synthetic */ axzm f96825a;

    /* renamed from: b */
    private final PendingIntent f96826b;

    /* renamed from: c */
    private final skc f96827c;

    /* renamed from: d */
    private long f96828d = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axzl(axzm axzm, Context context, Looper looper) {
        super(looper);
        this.f96825a = axzm;
        this.f96826b = PendingIntent.getBroadcast(context, 134217728, new Intent("com.google.android.gms.wearable.node.ALARM_PROCESS_CONNECTIVITY_CHANGES"), 0);
        this.f96827c = new skc(context);
        context.registerReceiver(new NodeService$ListenerNotifyHandler$1(this, "wearable"), new IntentFilter("com.google.android.gms.wearable.node.ALARM_PROCESS_CONNECTIVITY_CHANGES"));
    }

    /* renamed from: a */
    public final void mo53792a() {
        this.f96825a.f96838j.obtainMessage(3).sendToTarget();
    }

    public final void handleMessage(Message message) {
        Set c;
        Set c2;
        ArrayList arrayList;
        axzf axzf;
        int i = message.what;
        if (i == 2) {
            int i2 = message.arg1;
            if (Log.isLoggable("NodeService", 3)) {
                Log.d("NodeService", "schedule notifying listeners");
            }
            long ak = chnj.f188812a.mo6606a().mo85412ak() * 1000;
            long j = this.f96828d;
            if (j <= 0 || i2 == 1) {
                j = SystemClock.elapsedRealtime();
                this.f96828d = j;
            }
            this.f96827c.mo25675a("NodeService", 2, ak + j, this.f96826b, "com.google.android.gms");
        } else if (i == 3) {
            this.f96827c.mo25668a(this.f96826b);
            axzm axzm = this.f96825a;
            synchronized (axzm.f96831c) {
                c = axzm.f96833e.mo53830c();
                Iterator it = axzm.f96835g.iterator();
                while (it.hasNext()) {
                    axzk axzk = (axzk) it.next();
                    if (!axzk.f96821a) {
                        if (Log.isLoggable("NodeService", 3)) {
                            String valueOf = String.valueOf(axzk.f96824d);
                            Log.d("NodeService", valueOf.length() == 0 ? new String("processConnectivityChanges: removing connection from ") : "processConnectivityChanges: removing connection from ".concat(valueOf));
                        }
                        ayad ayad = (ayad) axzm.f96834f.get(axzk.f96824d);
                        if (ayad != null) {
                            axzf = ayad.f96891a;
                        } else {
                            axzf = null;
                        }
                        if (axzf != null) {
                            axzm.f96834f.remove(axzf.f96814a);
                        }
                    } else {
                        if (Log.isLoggable("NodeService", 3)) {
                            String valueOf2 = String.valueOf(axzk.f96822b.f96814a);
                            Log.d("NodeService", valueOf2.length() == 0 ? new String("processConnectivityChanges: adding connection to ") : "processConnectivityChanges: adding connection to ".concat(valueOf2));
                        }
                        Map map = axzm.f96834f;
                        axzf axzf2 = axzk.f96822b;
                        map.put(axzf2.f96814a, new ayad(axzf2, axzk.f96823c));
                    }
                }
                axzm.f96835g.clear();
                axzm.mo53796d();
                axzm.mo53795c();
                axzm.f96833e.mo53827a(axzm.f96840l.mo53808b(), axzm.f96839k, axzm.f96834f.values());
                c2 = axzm.f96833e.mo53830c();
                arrayList = new ArrayList(axzm.f96832d);
            }
            axzm.m83603a(arrayList, c, c2);
            axzm.f96837i.mo53571j();
            this.f96828d = -1;
        }
    }
}
