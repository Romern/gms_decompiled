package p000;

import android.text.TextUtils;

/* renamed from: sew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sew {
    /* renamed from: a */
    static final boolean m35103a(String str) {
        String a = cdly.f181215a.mo6606a().mo77875a();
        if (!TextUtils.isEmpty(a)) {
            for (String str2 : a.split(",")) {
                if (str2.trim().equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
