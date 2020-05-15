package p000;

import android.location.Location;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: afyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyu {
    /* renamed from: a */
    public static RequestQueue m53684a() {
        return rpr.m34216b().getRequestQueue();
    }

    /* renamed from: a */
    public static void m53685a(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        RequestQueue a = m53684a();
        bxvd da = cakh.f174981e.mo74144da();
        long a2 = spn.m35843a(rpr.m34216b());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cakh cakh = (cakh) da.f164949b;
        int i = cakh.f174983a | 1;
        cakh.f174983a = i;
        cakh.f174984b = a2;
        if (str != null) {
            str.getClass();
            cakh.f174983a = i | 2;
            cakh.f174985c = str;
        } else {
            cakh.f174983a = i | 4;
            cakh.f174986d = true;
        }
        a.add(afyv.m53688a(String.valueOf(cgko.m145918b()).concat("/nova/rename_device"), true, listener, errorListener, (bxxk) caki.f174987a.mo74142c(7), (cakh) da.mo74062i()));
    }

    /* renamed from: a */
    public static void m53686a(cake[] cakeArr, Location location, cajs cajs, cajt cajt, String str, cajz cajz, boolean z, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        cajs cajs2 = cajs;
        cajt cajt2 = cajt;
        String str3 = str;
        cajz cajz2 = cajz;
        String str4 = str2;
        agac.m53792b("sending remote payload: [%s, %s]", Arrays.toString(cakeArr), str3);
        RequestQueue a = m53684a();
        bxvd da = cakf.f174968j.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf = (cakf) da.f164949b;
            str.getClass();
            cakf.f174970a |= 2;
            cakf.f174972c = str3;
        }
        List<cake> asList = Arrays.asList(cakeArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cakf cakf2 = (cakf) da.f164949b;
        if (!cakf2.f174973d.mo73666a()) {
            cakf2.f174973d = bxvk.m124019a(cakf2.f174973d);
        }
        for (cake cake : asList) {
            cakf2.f174973d.mo74153d(cake.f174967z);
        }
        if (location != null) {
            bxvd da2 = cajw.f174883f.mo74144da();
            float accuracy = location.getAccuracy();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cajw cajw = (cajw) da2.f164949b;
            cajw.f174885a |= 4;
            cajw.f174888d = accuracy;
            double latitude = location.getLatitude();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cajw cajw2 = (cajw) da2.f164949b;
            cajw2.f174885a = 2 | cajw2.f174885a;
            cajw2.f174887c = latitude;
            double longitude = location.getLongitude();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cajw cajw3 = (cajw) da2.f164949b;
            cajw3.f174885a |= 1;
            cajw3.f174886b = longitude;
            long time = location.getTime();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cajw cajw4 = (cajw) da2.f164949b;
            cajw4.f174885a |= 16;
            cajw4.f174889e = time;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf3 = (cakf) da.f164949b;
            cajw cajw5 = (cajw) da2.mo74062i();
            cajw5.getClass();
            cakf3.f174971b = cajw5;
            cakf3.f174970a |= 1;
        }
        if (cajz2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf4 = (cakf) da.f164949b;
            cajz.getClass();
            cakf4.f174974e = cajz2;
            cakf4.f174970a |= 8;
        }
        if (cajs2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf5 = (cakf) da.f164949b;
            cajs.getClass();
            cakf5.f174975f = cajs2;
            cakf5.f174970a |= 16;
        }
        if (cajt2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf6 = (cakf) da.f164949b;
            cajt.getClass();
            cakf6.f174976g = cajt2;
            cakf6.f174970a |= 32;
        }
        if (str4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cakf cakf7 = (cakf) da.f164949b;
            str2.getClass();
            cakf7.f174970a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cakf7.f174978i = str4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cakf cakf8 = (cakf) da.f164949b;
        cakf8.f174970a |= 64;
        cakf8.f174977h = z;
        a.add(afyv.m53688a(cgko.f187173a.mo6606a().mo83994b(), false, listener, errorListener, (bxxk) cakg.f174979a.mo74142c(7), (cakf) da.mo74062i()));
    }

    /* renamed from: a */
    public static void m53687a(cake[] cakeArr, String str, boolean z, String str2) {
        m53686a(cakeArr, null, null, null, str, null, z, str2, null, null);
    }
}
