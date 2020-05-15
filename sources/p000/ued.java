package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ued */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ued extends uci {

    /* renamed from: f */
    private final SetPinnedDownloadPreferencesRequest f47339f;

    public ued(ubk ubk, SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, uto uto) {
        super("SetPinnedDownloadPreferencesOperation", ubk, uto, "378076965553");
        this.f47339f = setPinnedDownloadPreferencesRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.allOf(twt.class);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        boolean z;
        vff vff = vpu.m41034a().f49760g;
        if (this.f47339f.f30919a.mo18217a() == 2) {
            z = true;
        } else {
            z = false;
        }
        vfg vfg = (vfg) vff;
        boolean a = vfg.mo28384a();
        SharedPreferences d = vfg.mo28388d();
        if (!d.contains("drive_preferences.sync_over_wifi_only") || a != z) {
            d.edit().putBoolean("drive_preferences.sync_over_wifi_only", z).commit();
        }
        if (a != z) {
            for (vel vel : vfg.f49168b) {
                vel.mo28354a(vfg.m40284a(z));
            }
        }
        this.f47238b.mo27971a();
    }
}
