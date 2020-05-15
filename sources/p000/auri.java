package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: auri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auri implements auoy {

    /* renamed from: a */
    public static final aunx f92318a = new aunx("TrustAgent", "RemoteTrustlet");

    /* renamed from: b */
    public final boolean f92319b;

    /* renamed from: c */
    public final boolean f92320c;

    /* renamed from: d */
    public final String f92321d;

    /* renamed from: e */
    public final auqn f92322e;

    public auri(auqn auqn, Bundle bundle) {
        this.f92322e = auqn;
        this.f92321d = bundle.getString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name");
        this.f92319b = bundle.getBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        this.f92320c = bundle.getBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
    }

    /* renamed from: a */
    public final boolean mo50821a() {
        try {
            return this.f92322e.mo50801a();
        } catch (RemoteException e) {
            f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo50822b() {
        try {
            return this.f92322e.mo50805e();
        } catch (RemoteException e) {
            f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo50823c() {
        try {
            return this.f92322e.mo50803c();
        } catch (RemoteException e) {
            f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
            return false;
        }
    }
}
