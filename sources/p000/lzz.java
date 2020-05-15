package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: lzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzz {

    /* renamed from: a */
    public static final lvn f33319a = new lvn("VersionInfoHelper");

    /* renamed from: b */
    public final rtj f33320b;

    private lzz(rtj rtj, sqv sqv) {
        sdo.m34959a(rtj);
        this.f33320b = rtj;
        sdo.m34959a(sqv);
    }

    /* renamed from: a */
    public static lzz m24744a(Context context) {
        return new lzz(new rtj(context, "version_info_settings", true), srb.f45012a);
    }

    /* renamed from: b */
    private final void m24745b() {
        SharedPreferences.Editor edit = this.f33320b.edit();
        edit.remove("versionInfoToken");
        edit.remove("versionInfoTimestamp");
        edit.apply();
    }

    /* renamed from: a */
    public final bmxv mo19797a() {
        if (ccoj.m131012b()) {
            try {
                bmxv c = bmxv.m108567c(this.f33320b.getString("versionInfoToken", null));
                if (c.mo66813a()) {
                    try {
                        long j = this.f33320b.getLong("versionInfoTimestamp", -1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (j < 0) {
                            f33319a.mo25416d("Found version info but no timestamp in shared preferences. Clearing version info.", new Object[0]);
                            m24745b();
                            return bmvz.f131120a;
                        } else if (currentTimeMillis < j) {
                            f33319a.mo25412b("Clock has rolled backwards. Clearing version info from shared prefs", new Object[0]);
                            m24745b();
                        } else if (currentTimeMillis <= j + TimeUnit.SECONDS.toMillis(ccoj.f179626a.mo6606a().mo76535b())) {
                            return c;
                        } else {
                            f33319a.mo25412b("Version info in shared prefs expired. Clearing version info.", new Object[0]);
                            m24745b();
                            return bmvz.f131120a;
                        }
                    } catch (rti e) {
                        f33319a.mo25415d("Error reading version_info from shared preferences", e, new Object[0]);
                        return bmvz.f131120a;
                    }
                }
            } catch (rti e2) {
                f33319a.mo25415d("Error reading version_info from shared preferences", e2, new Object[0]);
                return bmvz.f131120a;
            }
        }
        return bmvz.f131120a;
    }
}
