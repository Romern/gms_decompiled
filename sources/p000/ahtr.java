package p000;

import android.content.Context;
import java.security.NoSuchAlgorithmException;

/* renamed from: ahtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtr {

    /* renamed from: a */
    public static final /* synthetic */ int f68025a = 0;

    /* renamed from: b */
    private static final String[] f68026b = {"f00209", "f0020a", "f0020b", "f0020c", "f0020d", "f0020e", "f0020f", "f00210", "f00211", "f00212", "f00213", "f00214", "f00215", "f00400", "3e7f38", "750aca", "973e22", "b1f601", "1cc144", "641c2c", "6b1c64", "87bd86", "d46c23"};

    /* renamed from: a */
    public static ahtq m56642a(Context context, buqd buqd, byte[] bArr) {
        try {
            byte[] a = ayol.m84384a(context);
            String[] strArr = f68026b;
            for (String str : strArr) {
                byte[] a2 = ayol.m84385a(a, str);
                if (buqd.mo72979a(bqce.m112562a(a2, bArr))) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairPrototype: Found a match model id %s.", str);
                    return new ahtq(str, a2);
                }
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("FastPairPrototype: Can't generate key.");
            return null;
        }
    }
}
