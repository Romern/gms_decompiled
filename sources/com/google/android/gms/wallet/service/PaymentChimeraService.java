package com.google.android.gms.wallet.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PaymentChimeraService extends sjh {

    /* renamed from: a */
    private awne f110332a;

    /* renamed from: i */
    private awwz f110333i;

    /* renamed from: j */
    private awrm f110334j;

    /* renamed from: k */
    private awtz f110335k;

    /* renamed from: l */
    private awxn f110336l;

    /* renamed from: m */
    private bjfr f110337m;

    public PaymentChimeraService() {
        super(new int[]{4}, new String[]{"com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.BIND", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService"}, Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final IBinder onBind(Intent intent) {
        char c;
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -2082527161:
                if (action.equals("com.google.android.gms.wallet.service.ow.IOwInternalService")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2035121334:
                if (action.equals("com.google.android.gms.wallet.service.orchestration.IOrchestrationService")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -463047518:
                if (action.equals("com.google.android.gms.wallet.service.ib.IIbService")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -233414813:
                if (action.equals("com.google.android.gms.wallet.service.BIND")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -216600674:
                if (action.equals("com.google.android.gms.wallet.service.reauth.IReauthService")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 866839314:
                if (action.equals("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return this.f110334j;
        }
        if (c == 1) {
            return new awph(this.f110332a, this);
        }
        if (c == 2) {
            return this.f110333i;
        }
        if (c == 3) {
            return this.f110335k;
        }
        if (c == 4) {
            return this.f110336l;
        }
        if (c != 5) {
            return null;
        }
        return this.f110337m;
    }

    public final void onCreate() {
        super.onCreate();
        awgj awgj = new awgj(rpr.m34216b().getRequestQueue());
        awxi awxi = new awxi(awgj);
        awra awra = new awra(this);
        this.f110333i = new awwv(this, new awxl(new awxc(this, awxi, awra)));
        awtl awtl = new awtl(this, new awvy(this, awgj, new awwt(this, rjx.m33696b(this))));
        this.f110335k = new awtq(this, new awwe(awtl));
        awrs awrs = new awrs(this, awra, rjx.m33696b(this), awtl);
        this.f110334j = new awrk(this, new awsx(awrs));
        awxf awxf = new awxf(this, awtl, rjx.m33696b(this), awrs, sjn.m35483a(this, this.f44565c, this.f44566d));
        if (stu.m36322h() == 13) {
            this.f110332a = new awww(this, new awxg(this, awxf));
        } else {
            this.f110332a = new awww(this, awxf);
        }
        this.f110336l = new awxn(this);
        this.f110337m = new awpp(this, new bjfb(new bjfl(new bjex[]{new awpx(this), new awpu(this), new bjfz(this, rpr.m34216b().getRequestQueue())}), new aweg()));
    }
}
