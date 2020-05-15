package com.google.android.gms.trustlet.place.internal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeofenceLogsChimeraService extends Service {

    /* renamed from: a */
    public rkb f109268a;

    /* renamed from: b */
    public Set f109269b;

    /* renamed from: c */
    public Set f109270c;

    /* renamed from: d */
    public final bmzi f109271d = bmzn.m108681a(auwp.f92665a);

    /* renamed from: e */
    private rjz f109272e;

    /* renamed from: f */
    private rka f109273f;

    /* renamed from: a */
    public final void mo59578a() {
        this.f109268a.mo24803g();
        this.f109268a.mo24796b(this.f109272e);
        this.f109268a.mo24797b(this.f109273f);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("auth_trust_agent_trusted_places_id_list_key");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("auth_trust_agent_entered_trusted_places_id_list_key");
            this.f109269b = new HashSet();
            for (String str : stringArrayExtra) {
                this.f109269b.add(str);
            }
            this.f109270c = new HashSet();
            for (String str2 : stringArrayExtra2) {
                this.f109270c.add(str2);
            }
            rjy rjy = new rjy(this);
            rjy.mo24780a(aema.f63501a, auxe.f92682b);
            rjy.mo24779a(aeie.f63411a);
            this.f109268a = rjy.mo24784b();
            auwr auwr = new auwr(this);
            this.f109272e = auwr;
            this.f109268a.mo24790a((rjz) auwr);
            auws auws = new auws(this);
            this.f109273f = auws;
            this.f109268a.mo24791a((rka) auws);
            this.f109268a.mo24801e();
            return 2;
        }
        stopSelf();
        return 2;
    }
}
