package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: bbfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfd {
    /* renamed from: a */
    public static Uri m87916a(Context context, int i, bmxv bmxv) {
        int i2 = i - 1;
        return m87918a(context, bmxv).buildUpon().appendPath(i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public").build();
    }

    /* renamed from: a */
    public static Uri m87917a(Context context, int i, String str, bawt bawt, bmxv bmxv) {
        try {
            return m87916a(context, i, bmxv).buildUpon().appendPath(str).build();
        } catch (Exception e) {
            bbev.m87908a(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            bawt.mo55999a("Unable to create mobstore uri for file", e);
            return null;
        }
    }

    /* renamed from: a */
    public static Uri m87918a(Context context, bmxv bmxv) {
        String str;
        befh a = befi.m94962a(context);
        if (bmxv != null && bmxv.mo66813a()) {
            str = (String) bmxv.mo66814b();
        } else {
            str = "datadownload";
        }
        a.mo60660a(str);
        if (bmxv != null && bmxv.mo66813a()) {
            a.mo60663b("datadownload");
        }
        return a.mo60657a();
    }
}
