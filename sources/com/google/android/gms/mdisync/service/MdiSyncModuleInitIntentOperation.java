package com.google.android.gms.mdisync.service;

import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdiSyncModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final bnsn f80043a = afvx.m53604b();

    /* renamed from: b */
    private final bmzi f80044b;

    public MdiSyncModuleInitIntentOperation() {
        this(afxc.f64906a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!cfgy.m139569f()) {
            bnsi d = f80043a.mo68390d();
            d.mo68432a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 38, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Disabled - skipping module initialization.");
            return;
        }
        bnsi d2 = f80043a.mo68390d();
        d2.mo68432a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("initializing module...");
        afxd afxd = (afxd) this.f80044b.mo6606a();
        try {
            afxd.f64907a.mo34078a().get();
            afxd.f64908b.mo35047b(2);
        } catch (ExecutionException e) {
            afxd.f64908b.mo35047b(4);
            bnsi c = afvx.m53603a().mo68388c();
            c.mo68402a((int) cfgy.m139566c());
            c.mo68437a(e.getCause());
            c.mo68432a("afxd", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to schedule periodic tasks.");
        } catch (InterruptedException e2) {
            afxd.f64908b.mo35047b(6);
            bnsi c2 = afvx.m53604b().mo68388c();
            c2.mo68432a("afxd", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        }
        bnsi d3 = f80043a.mo68390d();
        d3.mo68432a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68405a("module initialization completed");
    }

    public MdiSyncModuleInitIntentOperation(bmzi bmzi) {
        this.f80044b = bmzn.m108681a(bmzi);
    }
}
