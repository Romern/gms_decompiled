package p000;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: chrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrp {

    /* renamed from: a */
    static final bmxr f189047a = bmxr.m108543a(',');

    /* renamed from: b */
    public static final chrp f189048b = new chrp().mo85576a(new chrb(), true).mo85576a(chrc.f189024a, false);

    /* renamed from: c */
    public final Map f189049c;

    /* renamed from: d */
    public final byte[] f189050d;

    private chrp() {
        this.f189049c = new LinkedHashMap(0);
        this.f189050d = new byte[0];
    }

    /* renamed from: a */
    public final chrp mo85576a(chrn chrn, boolean z) {
        return new chrp(chrn, z, this);
    }

    private chrp(chrn chrn, boolean z, chrp chrp) {
        String a = chrn.mo85559a();
        bmxy.m108589a(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = chrp.f189049c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!chrp.f189049c.containsKey(chrn.mo85559a()) ? size + 1 : size);
        for (chro chro : chrp.f189049c.values()) {
            String a2 = chro.f189045a.mo85559a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new chro(chro.f189045a, chro.f189046b));
            }
        }
        linkedHashMap.put(a, new chro(chrn, z));
        this.f189049c = Collections.unmodifiableMap(linkedHashMap);
        bmxr bmxr = f189047a;
        HashSet hashSet = new HashSet(this.f189049c.size());
        for (Map.Entry entry : this.f189049c.entrySet()) {
            if (((chro) entry.getValue()).f189046b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f189050d = bmxr.mo66874a((Iterable) Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
