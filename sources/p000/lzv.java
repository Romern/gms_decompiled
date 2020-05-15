package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: lzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzv {

    /* renamed from: a */
    public final HashMap f33303a = new HashMap();

    /* renamed from: b */
    public final HashSet f33304b = new HashSet();

    /* renamed from: c */
    public final HashSet f33305c = new HashSet();

    /* renamed from: d */
    public String f33306d = null;

    /* renamed from: a */
    public final void mo19793a(String str) {
        Iterator it = this.f33303a.entrySet().iterator();
        while (it.hasNext()) {
            if (((String) ((Map.Entry) it.next()).getKey()).startsWith(str)) {
                it.remove();
            }
        }
        Iterator it2 = this.f33305c.iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).startsWith(str)) {
                it2.remove();
            }
        }
        this.f33304b.add(str);
    }

    /* renamed from: a */
    public final void mo19794a(String str, byte[] bArr) {
        this.f33303a.put(str, bArr);
        this.f33305c.remove(str);
    }
}
