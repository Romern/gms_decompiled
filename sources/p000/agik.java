package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: agik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agik extends BroadcastReceiver {

    /* renamed from: a */
    public final agmn f65592a;

    /* renamed from: b */
    public boolean f65593b;

    /* renamed from: c */
    public boolean f65594c;

    static {
        agik.class.getName();
    }

    public agik(agmn agmn) {
        sdo.m34959a(agmn);
        this.f65592a = agmn;
    }

    /* renamed from: a */
    public final void mo35450a() {
        this.f65592a.mo35695s();
        this.f65592a.mo35694r();
        this.f65592a.mo35694r();
        if (this.f65593b) {
            mo35452c().f65572k.mo35435a("Unregistering connectivity change receiver");
            this.f65593b = false;
            this.f65594c = false;
            try {
                mo35451b().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                mo35452c().f65564c.mo35436a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: b */
    public final Context mo35451b() {
        return this.f65592a.mo35690n();
    }

    /* renamed from: c */
    public final agid mo35452c() {
        return this.f65592a.mo35497E();
    }

    public final void onReceive(Context context, Intent intent) {
        this.f65592a.mo35695s();
        String action = intent.getAction();
        mo35452c().f65572k.mo35436a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean c = this.f65592a.mo35683g().mo35448c();
            if (this.f65594c != c) {
                this.f65594c = c;
                this.f65592a.mo35498F().mo35492a(new agij(this));
                return;
            }
            return;
        }
        mo35452c().f65567f.mo35436a("NetworkBroadcastReceiver received unknown action", action);
    }
}
