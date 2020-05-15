package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.service.UdcContextInitChimeraService;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GServiceFlagsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f109371a = ssv.m36267a("com.google.android.gms.udc");

    /* renamed from: b */
    private final bmzi f109372b;

    /* renamed from: c */
    private final bmzi f109373c;

    public GServiceFlagsChangedIntentOperation() {
        this.f109372b = new avcw(this);
        this.f109373c = new avcx(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (chbh.f188248a.mo6606a().mo84924F()) {
                if (chbh.m148019q()) {
                    ((bboa) this.f109373c.mo6606a()).mo56267c().mo56224a(auzv.FLAG_CHANGE);
                }
                try {
                    ((bbjm) this.f109372b.mo6606a()).mo34087e(aval.SYNC_ID_CUSTOM_CACHE).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
            ((bbjm) this.f109372b.mo6606a()).mo34078a().get();
        }
        if (!chbh.m148017o() && intent != null) {
            String action = intent.getAction();
            if (!"com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) && ((!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !f109371a.equals(action)) || !"com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                return;
            }
            if (chbh.m148004b() == UdcContextInitChimeraService.m93665b(getBaseContext())) {
                chbh.m148004b();
                UdcContextInitChimeraService.m93665b(getBaseContext());
                return;
            }
            UdcContextInitChimeraService.m93661a(getBaseContext());
        }
    }

    GServiceFlagsChangedIntentOperation(bmzi bmzi) {
        this.f109372b = bmzi;
        this.f109373c = new avcy(this);
    }
}
