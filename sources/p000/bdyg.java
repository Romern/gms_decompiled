package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: bdyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyg {

    /* renamed from: a */
    private final Map f106625a;

    public bdyg(Map map) {
        this.f106625a = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3 != null) goto L_0x000a;
     */
    /* renamed from: a */
    public final String mo58439a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        }
        Map map = (Map) this.f106625a.get(str);
        if (map != null) {
            if (str2 != null) {
                String valueOf = String.valueOf(str3);
                str3 = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
            }
            return (String) map.get(str3);
        }
        return null;
    }
}
