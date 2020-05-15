package p000;

import android.content.Context;

/* renamed from: amwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwz {
    /* renamed from: a */
    public static boolean m63595a(Context context) {
        amig.m62939a();
        if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo83029f()).booleanValue()) {
            return amus.m63325a(context);
        }
        if (cgbe.m144175d()) {
            return amur.m63322a(context).mo41357b();
        }
        if (!amus.m63326a(context, "android.permission.READ_CONTACTS") || !amus.m63326a(context, "android.permission.WRITE_CONTACTS")) {
            return false;
        }
        return true;
    }
}
