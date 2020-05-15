package p000;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ini */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ini implements inc {

    /* renamed from: a */
    public static final sek f21384a = new sek("Auth", "PhenotypeConfigSyncer");

    /* renamed from: c */
    private static final String f21385c = rpr.m34216b().getPackageName();

    /* renamed from: b */
    public final aney f21386b;

    /* renamed from: d */
    private final jyj f21387d;

    /* renamed from: e */
    private final inf f21388e;

    /* renamed from: a */
    private static SharedPreferences m15756a() {
        return rpr.m34216b().getSharedPreferences("AuthConfigSyncSharedPrefs", 0);
    }

    public ini(aney aney, jyj jyj, inf inf) {
        this.f21386b = aney;
        this.f21387d = jyj;
        this.f21388e = inf;
    }

    /* renamed from: a */
    private final void m15757a(int i, long j, String str) {
        jyj jyj = this.f21387d;
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 47;
        boct.f132610a |= 1;
        int i2 = (int) j;
        bxvd da2 = bodg.f132676e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bodg bodg = (bodg) da2.f164949b;
        str.getClass();
        int i3 = bodg.f132678a | 1;
        bodg.f132678a = i3;
        bodg.f132679b = str;
        int i4 = i3 | 2;
        bodg.f132678a = i4;
        bodg.f132680c = i2;
        bodg.f132681d = i - 1;
        bodg.f132678a = i4 | 4;
        bodg bodg2 = (bodg) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct2 = (boct) da.f164949b;
        bodg2.getClass();
        boct2.f132608G = bodg2;
        boct2.f132611b |= 8192;
        jyj.mo14224a((boct) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo13156a(String str) {
        f21384a.mo25409a("Called doInitialConfigSync().", new Object[0]);
        String str2 = str != null ? str : f21385c;
        if (m15756a().getBoolean("AUTH_CONFIG_SYNC_FINISHED", false)) {
            f21384a.mo25412b("Already synced configs, returning early", new Object[0]);
            m15757a(3, 0, str2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f21388e.f21380a.getCurrentModule().moduleVersion;
        int i2 = 7;
        try {
            aucu.m76783a(this.f21386b.mo41762a(new RegistrationInfo[]{new RegistrationInfo("com.google.android.gms.auth_account", i, new String[]{"ANDROID_AUTH"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.auth_cryptauth", i, new String[]{"ANDROID_AUTH"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.auth_folsom", i, new String[]{"ANDROID_AUTH"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.auth_managed", i, new String[0], null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.droidguard", i, new String[]{"DROIDGUARD"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.fido", i, new String[]{"FIDO"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.setupservices", i, new String[]{"ANDROID_AUTH"}, null, true, null, f21385c), new RegistrationInfo("com.google.android.gms.smartdevice", i, new String[]{"SMART_DEVICE", "ANDROID_AUTH"}, null, true, null, f21385c)}).mo50366a(bqfb.INSTANCE, new ing(this, i)), 5000, TimeUnit.MILLISECONDS);
            f21384a.mo25414c("Successfully synced sidecar_aps configs", new Object[0]);
            m15756a().edit().putBoolean("AUTH_CONFIG_SYNC_FINISHED", true).commit();
            m15757a(2, System.currentTimeMillis() - currentTimeMillis, str2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f21384a.mo25417e("Encountered exception trying to sync sidecar_aps Phenotype configs", e, new Object[0]);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (e instanceof ExecutionException) {
                i2 = 5;
            } else if (e instanceof InterruptedException) {
                i2 = 6;
            } else if (e instanceof TimeoutException) {
                i2 = 4;
            }
            m15757a(i2, currentTimeMillis2, str2);
            throw new ina(e);
        }
    }
}
