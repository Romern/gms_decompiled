package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* renamed from: burf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burf {

    /* renamed from: a */
    public busa f154760a;

    /* renamed from: b */
    public final Context f154761b;

    /* renamed from: c */
    public busc f154762c;

    /* renamed from: d */
    private final String f154763d;

    /* renamed from: e */
    private final bure f154764e;

    /* renamed from: f */
    private final ServiceConnection f154765f = new burd(this);

    public burf(Context context, String str, bure bure) {
        this.f154761b = context;
        this.f154763d = str;
        this.f154764e = bure;
    }

    /* renamed from: a */
    public final void mo73028a() {
        if (this.f154762c == null) {
            this.f154762c = new busc(this.f154761b, this.f154764e);
            Intent b = butb.m120417b(this.f154761b);
            b.setAction(this.f154763d);
            this.f154761b.bindService(b, this.f154765f, 1);
        }
    }

    /* renamed from: b */
    public final void mo73029b() {
        busc busc = this.f154762c;
        if (busc != null) {
            busa busa = this.f154760a;
            if (busa != null) {
                try {
                    busa.mo73075b(busc);
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("burf", "b", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("DevicesListActivity failed to unregister from the discovery service");
                }
            }
            this.f154761b.unbindService(this.f154765f);
            busc busc2 = this.f154762c;
            busc2.f154807a = null;
            busc2.f154808b = null;
            this.f154762c = null;
        }
    }
}
