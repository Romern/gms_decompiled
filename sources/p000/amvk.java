package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: amvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvk {

    /* renamed from: a */
    private static amvk f76020a;

    /* renamed from: b */
    private final SharedPreferences f76021b;

    public amvk(SharedPreferences sharedPreferences) {
        this.f76021b = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized amvk m63380a(Context context) {
        amvk amvk;
        synchronized (amvk.class) {
            if (f76020a == null) {
                f76020a = new amvk(context.getSharedPreferences("gms.people.contactssync.optin", 0));
            }
            amvk = f76020a;
        }
        return amvk;
    }

    /* renamed from: a */
    public final amsd mo41383a() {
        sdo.m34973b((String) null);
        String string = this.f76021b.getString("backup_and_sync", "");
        bxvd da = amsd.f75840f.mo74144da();
        try {
            if (!string.isEmpty()) {
                da.mo73633b(Base64.decode(string, 0));
            }
        } catch (bxwf e) {
        }
        return (amsd) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo41384a(amsd amsd) {
        sdo.m34973b((String) null);
        this.f76021b.edit().putString("backup_and_sync", Base64.encodeToString(amsd.mo73642k(), 0)).apply();
    }
}
