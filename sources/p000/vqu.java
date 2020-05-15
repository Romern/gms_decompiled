package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: vqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vqu {

    /* renamed from: a */
    public String f49822a;

    public vqu(String str) {
        this.f49822a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo28753a(Map map) {
        String a = mo28754a(((bnhe) map).keySet());
        if (a != null) {
            return map.get(a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo28754a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f49822a.startsWith(str)) {
                this.f49822a = this.f49822a.substring(str.length());
                return str;
            }
        }
        return null;
    }
}
