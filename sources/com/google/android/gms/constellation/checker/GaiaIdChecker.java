package com.google.android.gms.constellation.checker;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GaiaIdChecker extends IntentOperation {

    /* renamed from: a */
    private static final sek f30491a = tea.m36798a("gaia_id_checker");

    /* renamed from: b */
    private static final int f30492b = 8;

    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        if (!cdfw.f180710a.mo6606a().mo77450e()) {
            f30491a.mo25414c("GAIA id checker has been disabled.", new Object[0]);
        } else if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) || !intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            sek sek = f30491a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Get an unexpected intent:");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
        } else {
            UUID randomUUID = UUID.randomUUID();
            tds a = tds.m36774a(getApplicationContext());
            tdi.m36751a(getApplicationContext());
            if (!tdi.m36752b(getApplicationContext())) {
                tds.m36774a(getApplicationContext()).mo26404a(randomUUID, f30492b, new tdw(54, false));
            }
            a.mo26401a(randomUUID, f30492b);
            sns sns = new sns(10);
            sxt.m36563a();
            sxt.m36568b(getApplicationContext(), randomUUID, 4, new syn(a, f30491a, randomUUID, 6, new snr(sns), false));
        }
    }
}
