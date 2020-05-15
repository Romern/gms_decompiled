package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* renamed from: afzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class afzn extends IntentOperation {
    /* renamed from: a */
    public static Intent m53750a(Context context, boolean z, cakk cakk) {
        return m53751a(context, z, cakk, cakk.UNKNOWN, afzq.m53764b(context), afzw.m53778a(context));
    }

    /* renamed from: a */
    public static Intent m53751a(Context context, boolean z, cakk cakk, cakk cakk2, boolean z2, boolean z3) {
        boolean z4;
        Context context2 = context;
        boolean z5 = z2;
        boolean z6 = z3;
        int intValue = ((Integer) afzd.f64987a.mo10351a()).intValue();
        String str = (String) afzd.f64988b.mo10351a();
        Boolean bool = (Boolean) afzd.f64989c.mo10351a();
        Boolean bool2 = (Boolean) afzd.f64990d.mo10351a();
        String a = aaks.m21407a(context);
        int intValue2 = ((Integer) afzd.f64996j.mo10351a()).intValue();
        skc skc = new skc(context2);
        Intent startIntent = IntentOperation.getStartIntent(context2, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
        if (intValue2 >= 200) {
            agac.m53790a("Exceeded maximum sitrep attempts; not trying again.", new Object[0]);
            afzf.m53701a(context2, skc);
            return null;
        } else if (soz.m35801d(context2, context.getPackageName()).isEmpty()) {
            agac.m53790a("No Google accounts; deferring server state update.", new Object[0]);
            return null;
        } else {
            if (startIntent == null) {
                startIntent = IntentOperation.getStartIntent(context2, "com.google.android.gms.mdm.services.SitrepChimeraService", "com.google.android.gms.mdm.services.SITREP");
            }
            if (startIntent == null) {
                return null;
            }
            startIntent.putExtra("reason", cakk.f175005o);
            startIntent.putExtra("retry_reason", cakk2.f175005o);
            int e = spn.m35881e(context);
            startIntent.putExtra("gms_core_version", e);
            boolean z7 = true;
            if (!z && e == intValue) {
                z4 = z;
            } else {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Sitrep forced or new GMS core version: ");
                sb.append(e);
                sb.toString();
                int i = eoa.f15378a;
                z4 = true;
            }
            if (z || !TextUtils.equals(str, a)) {
                String valueOf = String.valueOf(a);
                if (valueOf.length() != 0) {
                    "Sitrep forced or new GCM ID ".concat(valueOf);
                } else {
                    new String("Sitrep forced or new GCM ID ");
                }
                int i2 = eoa.f15378a;
                startIntent.putExtra("gcm_registration_id", a);
                z4 = true;
            }
            if (!z && bool != null && bool.booleanValue() == z5) {
                z7 = z4;
            } else {
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Sitrep forced or new admin state ");
                sb2.append(z5);
                sb2.toString();
                int i3 = eoa.f15378a;
                startIntent.putExtra("is_device_admin", z5);
            }
            if (z || bool2 == null || bool2.booleanValue() != z6) {
                StringBuilder sb3 = new StringBuilder(48);
                sb3.append("ADM: Sitrep forced or new lockscreen state ");
                sb3.append(z6);
                sb3.toString();
                int i4 = eoa.f15378a;
                startIntent.putExtra("lockscreen_enabled", z6);
            } else if (!z7) {
                return null;
            }
            return startIntent;
        }
    }

    /* renamed from: a */
    public static void m53752a() {
        afzd.f64996j.mo10353b();
        afzd.f64987a.mo10353b();
        afzd.f64988b.mo10353b();
        afzd.f64989c.mo10353b();
        afzd.f64990d.mo10353b();
    }
}
