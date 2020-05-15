package p000;

import android.content.Context;

/* renamed from: maa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class maa {
    /* renamed from: a */
    public static final String m24747a(Context context) {
        if (!sre.m36080a(context)) {
            return ccnf.f179489a.mo6606a().mo76451w();
        }
        if (!ccnf.f179489a.mo6606a().mo76428V()) {
            return ccnf.f179489a.mo6606a().mo76423Q();
        }
        return String.format("https://%s/backup", stn.m36304a("gms.backup.sw_domain", "android.googleapis.com"));
    }
}
