package p000;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: bdpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpv {

    /* renamed from: a */
    public static final bnrt f106238a = bnrt.m110178a("bdpv");

    /* renamed from: b */
    public final SharedPreferences f106239b;

    public bdpv(SharedPreferences sharedPreferences) {
        this.f106239b = sharedPreferences;
    }

    /* renamed from: a */
    public final bxxc mo58286a(String str, bxxk bxxk) {
        int length;
        byte[] decode = Base64.decode(this.f106239b.getString(str, ""), 0);
        if (!(decode == null || (length = decode.length) == 0)) {
            if (decode[0] == 1) {
                try {
                    return (bxxc) bxxk.mo73658a(decode, 1, length - 1);
                } catch (bxwf e) {
                    bnrq bnrq = (bnrq) f106238a.mo68388c();
                    bnrq.mo68437a(e);
                    bnrq.mo68432a("bdpv", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq.mo68405a("failure reading proto");
                }
            } else {
                bnrq bnrq2 = (bnrq) f106238a.mo68388c();
                bnrq2.mo68432a("bdpv", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68405a("wrong header");
            }
        }
        return null;
    }
}
