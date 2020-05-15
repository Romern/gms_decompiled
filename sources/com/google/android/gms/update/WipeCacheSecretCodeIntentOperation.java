package com.google.android.gms.update;

import android.content.Intent;
import android.os.RecoverySystem;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WipeCacheSecretCodeIntentOperation extends qlh {

    /* renamed from: b */
    private static final sek f109488b = avpq.m79014a("WipeCacheSecretCodeIntentOperation");

    public WipeCacheSecretCodeIntentOperation() {
        super("947322243");
    }

    /* renamed from: a */
    public final void mo18633a(Intent intent) {
        if (cftb.f185675a.mo6606a().mo82696a()) {
            f109488b.mo25409a("wiping cache from SecretCodeIntentOperation", new Object[0]);
            try {
                if (!soz.m35811h(this)) {
                    f109488b.mo25412b("Can't reboot to wipe cache from non-primary user", new Object[0]);
                } else {
                    RecoverySystem.rebootWipeCache(this);
                }
            } catch (IOException e) {
                f109488b.mo25415d("failed to reboot to wipe cache:", e, new Object[0]);
            }
        } else {
            f109488b.mo25409a("Cache wiping is not enabled.", new Object[0]);
        }
    }
}
