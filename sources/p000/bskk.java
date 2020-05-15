package p000;

/* renamed from: bskk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bskk {
    /* renamed from: a */
    public static bytv m115901a(String str) {
        bxvd da = bytv.f167717g.mo74144da();
        String b = m115902b(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bytv bytv = (bytv) da.f164949b;
        b.getClass();
        bytv.f167719a |= 1;
        bytv.f167720b = b;
        if (str.startsWith("android://")) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytv bytv2 = (bytv) da.f164949b;
            bytv2.f167721c = 2;
            bytv2.f167719a = 2 | bytv2.f167719a;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytv bytv3 = (bytv) da.f164949b;
            bytv3.f167721c = 1;
            bytv3.f167719a = 2 | bytv3.f167719a;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            String valueOf = String.valueOf(str);
            String str2 = valueOf.length() == 0 ? new String("https://s2.googleusercontent.com/s2/favicons?sz=48&domain_url=") : "https://s2.googleusercontent.com/s2/favicons?sz=48&domain_url=".concat(valueOf);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytv bytv4 = (bytv) da.f164949b;
            str2.getClass();
            int i = bytv4.f167719a | 4;
            bytv4.f167719a = i;
            bytv4.f167722d = str2;
            int i2 = i | 16;
            bytv4.f167719a = i2;
            bytv4.f167724f = 48;
            bytv4.f167719a = i2 | 8;
            bytv4.f167723e = 48;
        }
        return (bytv) da.mo74062i();
    }

    /* renamed from: b */
    public static String m115902b(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.startsWith("https://")) {
            return str.substring(8);
        }
        return str.startsWith("android://") ? bskb.m115884a(str) : str;
    }
}
