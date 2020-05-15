package p000;

import android.content.Context;
import com.google.android.chimera.Activity;

/* renamed from: arqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqh {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: a */
    public static C1349sg m73304a(Context context) {
        char c;
        String a = stn.m36304a("setupwizard.theme", "glif_light");
        int hashCode = a.hashCode();
        if (hashCode != -1241052239) {
            if (hashCode == 115650330 && a.equals("glif_v3")) {
                c = 1;
                if (c == 0) {
                    return new C1349sg(context, 2132018154);
                }
                if (c != 1) {
                    return new C1349sg(context);
                }
                return new C1349sg(context, 2132018153);
            }
        } else if (a.equals("glif_v3_light")) {
            c = 0;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    /* renamed from: a */
    public static void m73305a(Activity activity) {
        String a = stn.m36304a("setupwizard.theme", "glif_light");
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = false;
        int a2 = bjbb.mo64964a().mo64966a(a);
        bjbb bjbb2 = new bjbb(bjbc.m103136a());
        bjbb2.f122457a = a2;
        bjbb2.f122458b = false;
        activity.setTheme(bjbb2.mo64964a().mo64965a(activity.getIntent()));
    }
}
