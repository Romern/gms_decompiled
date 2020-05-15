package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.fitness.service.base.PersistentBrokerService$PersistentBrokerReceiver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: zme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zme extends zmb implements Handler.Callback {

    /* renamed from: i */
    public static final /* synthetic */ int f55442i = 0;

    /* renamed from: g */
    public final Set f55443g = new HashSet();

    /* renamed from: h */
    public final String f55444h;

    /* renamed from: j */
    private boolean f55445j = false;

    /* renamed from: k */
    private PersistentBrokerService$PersistentBrokerReceiver f55446k;

    static {
        zvt.m46581a();
    }

    protected zme(String str) {
        this.f55444h = str;
    }

    /* renamed from: a */
    private final void m45748a(int i) {
        this.f55436d.sendEmptyMessage(i);
    }

    /* renamed from: c */
    public final void mo31241c(String str) {
        super.mo31241c(str);
        for (zmd zmd : this.f55433a.values()) {
            if (!zmd.mo31245d()) {
                mo31250a(zmd);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19173d() {
        mo31253e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo31253e() {
        m45748a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo31254f() {
        if (this.f55445j) {
            for (zmd zmd : this.f55433a.values()) {
                zmd.mo31244c();
            }
        } else {
            for (String str : this.f55434b.mo30715b()) {
                zmd zmd2 = (zmd) mo31240b(str);
                if (zmd2.mo31243b()) {
                    this.f55443g.add(zmd2);
                }
            }
        }
        if (!mo31251c()) {
            stopSelf();
        }
        this.f55445j = true;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            mo31254f();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Iterator it = this.f55433a.values().iterator();
            while (it.hasNext()) {
                zmd zmd = (zmd) it.next();
                if (!zmd.mo31245d()) {
                    it.remove();
                    this.f55443g.remove(zmd);
                }
            }
            return true;
        }
    }

    public void onDestroy() {
        unregisterReceiver(this.f55446k);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && i != 2) {
            return 1;
        }
        mo31239b();
        zvo.f56032a.set(System.currentTimeMillis());
        mo19173d();
        return 1;
    }

    public final boolean onUnbind(Intent intent) {
        m45748a(2);
        return false;
    }

    /* renamed from: a */
    public static void m45749a(Context context, String str) {
        Intent intent = new Intent("com.google.android.gms.fitness.INITIALIZE", (Uri) null);
        intent.setClassName(context, str);
        context.startService(intent);
    }

    /* renamed from: d */
    public final void mo31252d(String str) {
        for (zmd zmd : this.f55433a.values()) {
            zmd.mo31242b(str);
            if (!zmd.mo31245d()) {
                mo31250a(zmd);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31249a(int i, Object obj) {
        this.f55436d.obtainMessage(i, obj).sendToTarget();
    }

    /* renamed from: c */
    public final boolean mo31251c() {
        return !this.f55443g.isEmpty();
    }

    /* renamed from: a */
    public void mo19171a(yzs yzs, sns sns, snr snr, ExecutorService executorService) {
        super.mo19171a(yzs, sns, snr, executorService);
        PersistentBrokerService$PersistentBrokerReceiver persistentBrokerService$PersistentBrokerReceiver = new PersistentBrokerService$PersistentBrokerReceiver(this);
        this.f55446k = persistentBrokerService$PersistentBrokerReceiver;
        registerReceiver(persistentBrokerService$PersistentBrokerReceiver, yub.m44842a(), null, snr);
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
        registerReceiver(this.f55446k, intentFilter, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", snr);
    }

    /* renamed from: a */
    public final void mo31250a(zmd zmd) {
        getClass().getSimpleName();
        if (this.f55443g.remove(zmd) && !mo31251c()) {
            stopSelf();
        }
    }
}
