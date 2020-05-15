package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.firstparty.CastReceiver;
import com.google.android.gms.cast.firstparty.WifiRequestInfo;
import com.google.android.gms.common.api.Status;

/* renamed from: pqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqp extends pri implements aaai {

    /* renamed from: a */
    private final Context f40066a;

    /* renamed from: b */
    private final aaag f40067b;

    /* renamed from: c */
    private final ssh f40068c;

    /* renamed from: d */
    private final pnl f40069d;

    /* renamed from: e */
    private final phy f40070e;

    /* renamed from: f */
    private final pmh f40071f;

    /* renamed from: g */
    private final String f40072g;

    public pqp(Context context, aaag aaag, ssh ssh, pnl pnl, phy phy, pmh pmh, String str) {
        this.f40066a = context;
        this.f40067b = aaag;
        this.f40068c = ssh;
        this.f40069d = pnl;
        this.f40070e = phy;
        this.f40071f = pmh;
        this.f40072g = str;
    }

    /* renamed from: a */
    public final void mo23555a(String str) {
        pqb pqb = this.f40071f.f39678f;
        if (pqb != null) {
            pqb.f40053c.mo23535a(str);
        }
    }

    /* renamed from: b */
    public final void mo23562b(String str) {
        Context context = this.f40066a;
        if (pze.f40729a) {
            qay.m31785b(context).edit().putString("RELAY_CASTING_ACTIVE_ACCOUNT_NAME", str).commit();
        }
    }

    /* renamed from: a */
    public final void mo23556a(String str, int i) {
        this.f40071f.mo23411a(str, i);
    }

    /* renamed from: a */
    public final void mo23557a(String str, prf prf) {
        try {
            Status status = Status.f30109c;
            Parcel bj = prf.mo8529bj();
            dcl.m8165a(bj, status);
            bj.writeString(str);
            prf.mo8530c(2, bj);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23558a(String str, boolean z) {
        qay.m31785b(this.f40066a).edit().putBoolean(str, z).apply();
    }

    /* renamed from: a */
    public final void mo23559a(prg prg, WifiRequestInfo wifiRequestInfo, CastReceiver castReceiver) {
        this.f40067b.mo16658a(new prq(prg, wifiRequestInfo, castReceiver, (WifiManager) this.f40066a.getSystemService("wifi"), this.f40070e));
    }

    /* renamed from: a */
    public final void mo23560a(prm prm) {
        try {
            if (this.f40072g.equals("com.google.android.gms")) {
                this.f40067b.mo16658a(new prr(this.f40068c, this.f40069d, prm));
            } else {
                prm.mo23579a(Status.f30109c);
            }
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo23561a(prp prp) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("googlecast-isEnabled", qay.m31785b(this.f40066a).getBoolean("googlecast-isEnabled", !sre.m36084d(this.f40066a)));
        bundle.putBoolean("SETTINGS_RELAY_CASTING_ENABLED", pze.f40729a);
        prp.mo23581a(bundle);
    }
}
