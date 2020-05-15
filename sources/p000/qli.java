package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: qli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qli {

    /* renamed from: a */
    public final SharedPreferences f41640a;

    /* renamed from: b */
    private final boolean f41641b;

    public qli(SharedPreferences sharedPreferences, boolean z) {
        this.f41640a = sharedPreferences;
        this.f41641b = z;
    }

    /* renamed from: a */
    public static qli m32351a(Context context) {
        return new qli(aytw.m84817d(context.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 0), false);
    }

    /* renamed from: b */
    public final Set mo24077b() {
        Set<String> stringSet = this.f41640a.getStringSet("Chimera.userModuleSetBlacklist", null);
        return stringSet == null ? Collections.emptySet() : Collections.unmodifiableSet(stringSet);
    }

    /* renamed from: c */
    public final qor mo24079c() {
        try {
            byte[] a = sqd.m35966a(this.f41640a.getString("Chimera.moduleSetJournal", ""));
            if (a != null) {
                return (qor) GeneratedMessageLite.m124016a(qor.f41889b, a, bxus.m123743b());
            }
            throw new bxwf("Module set journal bytes are invalid!");
        } catch (bxwf | IllegalArgumentException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not parse module set journal: ");
            sb.append(valueOf);
            Log.e("ChimeraPrefs", sb.toString());
            return qor.f41889b;
        }
    }

    /* renamed from: d */
    public final long mo24080d() {
        return this.f41640a.getLong("Chimera.lastHeterodyneChangeTime", 0);
    }

    /* renamed from: e */
    public final long mo24081e() {
        return this.f41640a.getLong("Chimera.lastHeterodyneServingVersion", -1);
    }

    /* renamed from: f */
    public final boolean mo24082f() {
        if (!this.f41641b) {
            return true;
        }
        Log.e("ChimeraPrefs", "Cannot write to shared prefs in read-only mode");
        return false;
    }

    /* renamed from: a */
    public final int mo24074a() {
        return this.f41640a.getInt("ChimeraConfigService.retryCount", 0);
    }

    /* renamed from: a */
    public final void mo24075a(long j) {
        if (mo24082f()) {
            this.f41640a.edit().putLong("Chimera.downloadFrom", j).commit();
        }
    }

    /* renamed from: b */
    public final void mo24078b(int i) {
        if (mo24082f()) {
            this.f41640a.edit().putInt("ChimeraConfigService.scheduledPeriodSec", i).commit();
        }
    }

    /* renamed from: a */
    public final boolean mo24076a(int i) {
        if (mo24082f()) {
            return this.f41640a.edit().putInt("ChimeraConfigService.retryCount", i).commit();
        }
        return false;
    }
}
