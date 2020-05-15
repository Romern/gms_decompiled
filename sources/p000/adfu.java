package p000;

import android.content.Context;

/* renamed from: adfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfu {
    /* renamed from: a */
    public static void m50331a(Context context, String str, Throwable th, adfs adfs) {
        String str2;
        Object[] objArr = new Object[1];
        if (str == null) {
            str2 = "null";
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        adfs.mo33425a(th, "%s", objArr);
        if (Math.random() <= cepl.f183185a.mo6606a().mo79525I()) {
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms.instantapps";
            wwv.f51499d = "com.google.android.gms.instantapps.SILENT_FEEDBACK";
            wwv.mo29496b();
            if (str != null) {
                wwv.f51498c = str;
            }
            wvu.m42361a(context).mo29488b(wwv.mo29490a()).mo50371a(new adft(adfs));
        }
    }
}
