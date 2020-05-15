package com.google.android.gms.mdisync.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdiSyncFlagChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final bnsn f80039a = afvx.m53604b();

    /* renamed from: b */
    private final bmzi f80040b;

    public MdiSyncFlagChangeIntentOperation() {
        this(afww.f64898a);
    }

    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        afwx afwx;
        if (cfgy.m139569f()) {
            if (!(intent == null || (action = intent.getAction()) == null)) {
                int hashCode = action.hashCode();
                if (hashCode != -590801919) {
                    if (hashCode == -544318258 && action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                        c = 1;
                        if (c == 0 || (c == 1 && "com.google.android.gms.mdisync".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                            bnsi d = f80039a.mo68390d();
                            d.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d.mo68405a("handling relevant flag change...");
                            afwx = (afwx) this.f80040b.mo6606a();
                            afwx.f64899a.mo34078a().get();
                            afwx.f64900b.mo35045a(2);
                            bnsi d2 = f80039a.mo68390d();
                            d2.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d2.mo68405a("flag handling completed");
                            return;
                        }
                    }
                } else if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.mdisync.COMMITTED")) {
                    c = 0;
                    bnsi d3 = f80039a.mo68390d();
                    d3.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68405a("handling relevant flag change...");
                    afwx = (afwx) this.f80040b.mo6606a();
                    afwx.f64899a.mo34078a().get();
                    afwx.f64900b.mo35045a(2);
                    bnsi d22 = f80039a.mo68390d();
                    d22.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d22.mo68405a("flag handling completed");
                    return;
                }
                c = 65535;
                bnsi d32 = f80039a.mo68390d();
                d32.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d32.mo68405a("handling relevant flag change...");
                afwx = (afwx) this.f80040b.mo6606a();
                try {
                    afwx.f64899a.mo34078a().get();
                    afwx.f64900b.mo35045a(2);
                } catch (ExecutionException e) {
                    afwx.f64900b.mo35045a(4);
                    bnsi c2 = afvx.m53603a().mo68388c();
                    c2.mo68402a((int) cfgy.m139566c());
                    c2.mo68437a(e.getCause());
                    c2.mo68432a("afwx", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Failed to schedule periodic tasks.");
                } catch (InterruptedException e2) {
                    afwx.f64900b.mo35045a(6);
                    bnsi c3 = afvx.m53604b().mo68388c();
                    c3.mo68432a("afwx", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c3.mo68405a("Scheduling was interrupted.");
                    Thread.currentThread().interrupt();
                }
                bnsi d222 = f80039a.mo68390d();
                d222.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d222.mo68405a("flag handling completed");
                return;
            }
            bnsi d4 = f80039a.mo68390d();
            d4.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("flag handling is skipping irrelevant intent.");
            return;
        }
        bnsi d5 = f80039a.mo68390d();
        d5.mo68432a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d5.mo68405a("Disabled - skipping flag handling.");
    }

    public MdiSyncFlagChangeIntentOperation(bmzi bmzi) {
        this.f80040b = bmzn.m108681a(bmzi);
    }
}
