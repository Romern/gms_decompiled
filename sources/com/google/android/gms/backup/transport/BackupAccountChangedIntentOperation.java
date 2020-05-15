package com.google.android.gms.backup.transport;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAccountChangedIntentOperation extends lvz {

    /* renamed from: a */
    public static final lvn f29195a = new lvn("BackupAccountChangedIO");

    /* renamed from: b */
    private bjr f29196b;

    /* renamed from: c */
    private bjr f29197c;

    /* renamed from: d */
    private lsp f29198d;

    /* renamed from: e */
    private lvp f29199e;

    /* renamed from: a */
    public final void mo17242a(Intent intent) {
        if ((ccoa.f179599a.mo6606a().mo76510a() || mcl.m24877a()) && nau.m25856a(this)) {
            f29195a.mo25409a("Received intent, action = %s", intent.getAction());
            this.f29196b.mo3201b(0);
            this.f29197c.mo3201b(0);
            this.f29198d.mo19591a();
            this.f29199e.mo19641a(BackupTransportChimeraService.m21997e(), new myi(this, this.f29198d));
            return;
        }
        f29195a.mo25409a("Ignoring received intent, action = %s", intent.getAction());
    }

    public final void onCreate() {
        mym a = nec.m26008a(this);
        bjr b = nec.m26009b(this);
        lsp lsp = new lsp(this);
        lvp lvp = new lvp(this);
        this.f29196b = a;
        this.f29197c = b;
        this.f29198d = lsp;
        this.f29199e = lvp;
    }
}
