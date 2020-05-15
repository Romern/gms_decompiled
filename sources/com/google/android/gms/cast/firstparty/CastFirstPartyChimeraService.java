package com.google.android.gms.cast.firstparty;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastFirstPartyChimeraService extends zzx {

    /* renamed from: a */
    private static final String f29874a = ccxs.m132042c();

    /* renamed from: b */
    private static final String f29875b = ccxs.f180178a.mo6606a().mo76995c();

    /* renamed from: k */
    private pes f29876k;

    /* renamed from: l */
    private aaag f29877l;

    /* renamed from: m */
    private alw f29878m;

    /* renamed from: n */
    private qbn f29879n;

    public CastFirstPartyChimeraService() {
        super(new int[]{122, 27}, new String[]{"com.google.android.gms.cast.firstparty.START", "com.google.android.gms.cast_mirroring.service.START"}, Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        int i = getServiceRequest.f30228b;
        if (i != 27) {
            if (i != 122) {
                aaac.mo16650a(1, (Bundle) null);
            } else if (str.equals(f29874a) || str.equals("com.google.android.gms.apitest") || str.equals("com.google.cast.test.wifipassword1p") || str.equals("com.google.android.gms") || cczm.f180308a.mo6606a().mo77104a().f165797a.contains(str)) {
                Context applicationContext = getApplicationContext();
                aaag aaag = this.f29877l;
                ssh a = ssh.m36213a(getApplicationContext());
                pes pes = this.f29876k;
                aaac.mo16652a(new pqp(applicationContext, aaag, a, pes.f38983g, pes.f38982f, pes.f38986j, str));
            } else {
                aaac.mo16650a(8, (Bundle) null);
            }
        } else if (ccxs.f180178a.mo6606a().mo76993a() || str.equals(f29874a) || str.equals(f29875b) || str.equals("com.google.android.apps.docs.editors.slides")) {
            if (this.f29879n == null) {
                Context applicationContext2 = getApplicationContext();
                ScheduledExecutorService a2 = pes.m30266a();
                pes pes2 = this.f29876k;
                this.f29879n = qbn.m31799a(applicationContext2, a2, pes2.f38984h, pes2.f38988l, this.f29878m);
            }
            aaac.mo16652a(new qbt(getServiceRequest.f30229c, this.f29877l, this.f29879n));
        } else {
            aaac.mo16650a(8, (Bundle) null);
        }
    }

    public final void onCreate() {
        this.f29876k = pes.m30267a(getApplicationContext(), "CastFirstPartyService");
        this.f29877l = new aaag(this, this.f56354e, pes.m30266a());
        this.f29878m = alw.m1050a(this);
    }

    public final void onDestroy() {
        if (this.f29879n != null) {
            qbn qbn = qbn.f40874d;
            synchronized (qbn.class) {
                qbn.f40875e--;
                if (qbn.f40875e == 0) {
                    qbn.f40874d = null;
                }
            }
            this.f29879n = null;
        }
        pes pes = this.f29876k;
        if (pes != null) {
            pes.mo22984a("CastFirstPartyService");
            this.f29876k = null;
        }
    }
}
