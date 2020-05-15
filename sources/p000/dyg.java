package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.contextmanager.producer.module.BroadcastReceiverProducer$InternalBroadcastReceiver;

/* renamed from: dyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dyg extends dyd {

    /* renamed from: b */
    private final BroadcastReceiverProducer$InternalBroadcastReceiver f14399b;

    /* renamed from: j */
    public final boolean f14400j;

    public dyg(Context context, doh doh, dxr dxr, String str, dqb dqb) {
        this(context, doh, dxr, str, dqb, true);
    }

    /* renamed from: a */
    public abstract void mo9847a(Context context, Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract IntentFilter mo9849c();

    /* renamed from: e */
    public boolean mo9859e() {
        if (!super.mo9859e()) {
            return false;
        }
        IntentFilter c = mo9849c();
        if (c == null) {
            return true;
        }
        this.f14388d.registerReceiver(this.f14399b, c);
        return true;
    }

    /* renamed from: f */
    public void mo9860f() {
        try {
            this.f14388d.unregisterReceiver(this.f14399b);
        } catch (IllegalArgumentException e) {
        }
        super.mo9860f();
    }

    public dyg(Context context, doh doh, dxr dxr, String str, dqb dqb, boolean z) {
        super(context, doh, dxr, str, dqb);
        this.f14399b = new BroadcastReceiverProducer$InternalBroadcastReceiver(this);
        this.f14400j = z;
    }
}
