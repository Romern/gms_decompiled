package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicClientStateChecker extends IntentOperation {

    /* renamed from: a */
    private static final sek f30493a = tea.m36798a("periodic_client_state_checker");

    /* renamed from: d */
    private static final int f30494d = 6;

    /* renamed from: b */
    private Context f30495b;

    /* renamed from: c */
    private tds f30496c;

    public final void onHandleIntent(Intent intent) {
        long j;
        f30493a.mo25409a("onHandleIntent", new Object[0]);
        this.f30495b = getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (cdfw.f180710a.mo6606a().mo77452g()) {
            long f = szq.m36667a(this.f30495b).mo26295f();
            if (f > 0) {
                j = f + (cdfw.f180710a.mo6606a().mo77460o() * 1000);
            } else {
                j = System.currentTimeMillis();
            }
            if (j <= System.currentTimeMillis()) {
                if (syo.m36599a(szq.m36667a(this.f30495b))) {
                    this.f30496c = tds.m36774a(this.f30495b);
                    UUID randomUUID = UUID.randomUUID();
                    tdi.m36751a(this.f30495b);
                    if (!tdi.m36752b(this.f30495b)) {
                        tds.m36774a(getApplicationContext()).mo26404a(randomUUID, f30494d, new tdw(54, false));
                    }
                    this.f30496c.mo26401a(randomUUID, f30494d);
                    sxt.m36563a();
                    sxt.m36566a(this.f30495b, randomUUID, 3, new syn(this.f30496c, f30493a, randomUUID, bqjr.m112930a(f30494d), new snr(new sns(10)), true));
                }
                szq a = szq.m36667a(this.f30495b);
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = a.f45525b.edit();
                edit.putLong("last_client_state_check_timestamp_millis", currentTimeMillis);
                edit.apply();
                return;
            }
            return;
        }
        f30493a.mo25414c("periodic client state checker is disabled.", new Object[0]);
    }
}
