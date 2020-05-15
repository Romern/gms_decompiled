package p000;

import android.content.Intent;

/* renamed from: bhar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhar {
    /* renamed from: a */
    public static boolean m100526a(deu deu) {
        if (!srs.m36151c(deu) || srs.m36149a(deu)) {
            return false;
        }
        deu.startActivityForResult(new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"), 137);
        return true;
    }
}
