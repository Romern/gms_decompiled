package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.identifier.settings.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0283a {
    /* renamed from: a */
    public static rex m5190a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                int i = rfy.f42893b;
                rfy.m33555l(context);
                rex rex = new rex();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (skh.m35531a().mo25690a(context, intent, rex, 1)) {
                    return rex;
                }
                throw new IOException("Connection failure");
            } catch (rfv e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new rfv(9);
        }
    }
}
