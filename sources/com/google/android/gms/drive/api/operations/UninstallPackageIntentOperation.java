package com.google.android.gms.drive.api.operations;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UninstallPackageIntentOperation extends qlg {

    /* renamed from: a */
    private static final sbw f30762a = new sbw("UninstallPackageIntentO", "");

    public UninstallPackageIntentOperation() {
        super(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17405a(String str, Intent intent) {
        uhj uhj;
        Context applicationContext = getApplicationContext();
        if (!spn.m35892g(applicationContext, str)) {
            try {
                tws.m37569b(applicationContext);
                vpu a = vpu.m41034a();
                uhn uhn = a.f49757d;
                uhj = ((ugx) uhn).f47578a;
                uhj.mo27476b();
                ((ugx) uhn).f47578a.mo27465a(uiq.f47724a, uip.PACKAGE_NAME.f47723j.mo27708b(str));
                ((ugz) uhn).mo27445g();
                uhj.mo27480f();
                ugz.f47585c.mo25369a("Uninstalled %s", str);
                uhj.mo27478d();
                a.f49769p.mo27275a();
            } catch (InterruptedException e) {
                f30762a.mo25378c("UninstallPackageIntentO", String.format("Interrupted while uninstalling %s", str), e);
            } catch (Throwable th) {
                uhj.mo27478d();
                throw th;
            }
        } else {
            f30762a.mo25374b("UninstallPackageIntentO", "Package still installed %s", str);
        }
    }
}
