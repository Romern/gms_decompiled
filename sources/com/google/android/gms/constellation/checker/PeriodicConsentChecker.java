package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicConsentChecker extends IntentOperation {

    /* renamed from: a */
    private static final sek f30497a = tea.m36798a("periodic_consent_checker");

    /* renamed from: d */
    private static final int f30498d = 5;

    /* renamed from: b */
    private Context f30499b;

    /* renamed from: c */
    private tds f30500c;

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        long j;
        this.f30499b = getApplicationContext().getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (cdfw.f180710a.mo6606a().mo77453h()) {
            long d = szq.m36667a(this.f30499b).mo26293d();
            if (d <= 0) {
                if (cdfw.m133048c() > 0) {
                    j = szq.m36667a(this.f30499b).f45525b.getLong("jittered_timestamp_for_initial_consent_check_millis", -1);
                    if (j <= 0) {
                        long c = cdfw.m133048c();
                        if (c > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i2 = Build.VERSION.SDK_INT;
                            j = ThreadLocalRandom.current().nextLong(c) + currentTimeMillis;
                            SharedPreferences.Editor edit = szq.m36667a(this.f30499b).f45525b.edit();
                            edit.putLong("jittered_timestamp_for_initial_consent_check_millis", j);
                            edit.apply();
                        }
                    }
                }
                j = System.currentTimeMillis();
            } else {
                j = d + (cdfw.m133047b() * 1000);
            }
            if (j <= System.currentTimeMillis()) {
                this.f30500c = tds.m36774a(this.f30499b);
                UUID randomUUID = UUID.randomUUID();
                if (!syo.m36599a(szq.m36667a(this.f30499b))) {
                    tdi.m36751a(this.f30499b);
                    if (!tdi.m36752b(this.f30499b)) {
                        tds.m36774a(getApplicationContext()).mo26404a(randomUUID, f30498d, new tdw(54, false));
                    }
                    sns sns = new sns(10);
                    this.f30500c.mo26401a(randomUUID, f30498d);
                    sxt.m36563a();
                    sxt.m36568b(this.f30499b, randomUUID, 1, new syn(this.f30500c, f30497a, randomUUID, bqjr.m112930a(f30498d), new snr(sns), false));
                }
                szq.m36667a(this.f30499b).mo26284a(System.currentTimeMillis());
                return;
            }
            return;
        }
        f30497a.mo25414c("periodic consent checker is disabled.", new Object[0]);
    }
}
