package p000;

import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: aaol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaol {

    /* renamed from: c */
    private static aaol f28698c;

    /* renamed from: a */
    public final Random f28699a;

    /* renamed from: b */
    public final Map f28700b = new C1223np();

    public aaol(Random random) {
        this.f28699a = random;
    }

    /* renamed from: a */
    public static synchronized aaol m21762a() {
        aaol aaol;
        synchronized (aaol.class) {
            if (f28698c == null) {
                f28698c = new aaol(aaqx.f28952a);
            }
            aaol = f28698c;
        }
        return aaol;
    }

    /* renamed from: b */
    public static final boolean m21764b() {
        return cecz.f182285a.mo6606a().mo78786E() > 0;
    }

    /* renamed from: a */
    public static final String m21763a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if (host == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder(host);
            List<String> pathSegments = parse.getPathSegments();
            for (int i = 0; i < Math.min(pathSegments.size(), 2); i++) {
                sb.append("/");
                sb.append(pathSegments.get(i));
            }
            return sb.toString();
        } catch (Exception e) {
            Log.w("GCM.HTTP", str.length() == 0 ? new String("Error parsing url: ") : "Error parsing url: ".concat(str), e);
            return null;
        }
    }
}
