package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aurq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurq extends aeaa {

    /* renamed from: b */
    private static final aunx f92373b = new aunx("TrustAgent", "TrustletServiceConnection");

    /* renamed from: a */
    public aurp f92374a;

    /* renamed from: c */
    private auqn f92375c;

    public aurq() {
        super("trustagent");
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        f92373b.mo50711a("onServiceDisconnected", new Object[0]);
        this.f92374a.mo50845d();
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        auqn auqn;
        f92373b.mo50711a("onServiceConnected", new Object[0]);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.ITrustletService");
            auqn = queryLocalInterface instanceof auqn ? (auqn) queryLocalInterface : new auql(iBinder);
        } else {
            auqn = null;
        }
        this.f92375c = auqn;
        this.f92374a.mo50841a(auqn);
    }
}
