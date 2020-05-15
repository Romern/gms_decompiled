package p000;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.VolleyError;

/* renamed from: tyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyv {

    /* renamed from: a */
    private static final bnic f46993a = bnic.m109490a((Object) 17, (Object) 28);

    /* renamed from: a */
    public static tzv m37777a(VolleyError volleyError) {
        if ((volleyError instanceof ParseError) || ((volleyError instanceof AuthFailureError) && volleyError.networkResponse == null)) {
            return new uag("Unrecoverable volley error", volleyError, false);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            int i = networkResponse.statusCode;
            if (vpg.m41007a(i)) {
                vpf a = vpg.m41003a(networkResponse);
                return new uaf(m37778a(i, a), i, a);
            }
        }
        return new uag("Recoverable volley error", volleyError, true);
    }

    /* renamed from: a */
    public static boolean m37778a(int i, vpf vpf) {
        if (i != 400) {
            return i != 403 ? i != 404 || vpf == null || !vpf.mo28720a(45) || !vpf.mo28721b(20) : vpf != null && f46993a.contains(vpf.f49708e);
        }
        return false;
    }
}
