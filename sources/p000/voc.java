package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: voc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voc {

    /* renamed from: a */
    public static final voc f49620a = new voc("general", vob.f49613a, new voa[]{vob.f49613a, vob.f49614b, vob.f49616d, vob.f49615c});

    /* renamed from: b */
    public static final voc f49621b = new voc("sharedWithMe", vob.f49617e, new voa[]{vob.f49613a, vob.f49617e});

    /* renamed from: c */
    public static final voc f49622c = new voc("recent", vob.f49616d, new voa[]{vob.f49614b, vob.f49616d, vob.f49615c});

    /* renamed from: d */
    public static final voc f49623d = new voc("starred", vob.f49614b, new voa[]{vob.f49613a, vob.f49614b, vob.f49616d, vob.f49615c});

    /* renamed from: e */
    public static final voc f49624e;

    /* renamed from: i */
    private static final voc[] f49625i;

    /* renamed from: j */
    private static final Map f49626j;

    /* renamed from: f */
    public final String f49627f;

    /* renamed from: g */
    public final voa f49628g;

    /* renamed from: h */
    public final voa[] f49629h;

    static {
        voc voc = new voc("search", vob.f49614b, new voa[]{vob.f49613a, vob.f49614b, vob.f49616d, vob.f49615c});
        f49624e = voc;
        f49625i = new voc[]{f49620a, f49621b, f49622c, f49623d, voc};
        HashMap hashMap = new HashMap();
        voc[] vocArr = f49625i;
        int length = vocArr.length;
        for (int i = 0; i < 5; i++) {
            voc voc2 = vocArr[i];
            if (((voc) hashMap.put(voc2.f49627f, voc2)) != null) {
                String str = voc2.f49627f;
                throw new IllegalStateException(str.length() == 0 ? new String("Duplicate SortType identifier: ") : "Duplicate SortType identifier: ".concat(str));
            }
        }
        f49626j = Collections.unmodifiableMap(hashMap);
    }

    private voc(String str, voa voa, voa[] voaArr) {
        sdo.m34959a((Object) str);
        this.f49627f = str;
        sdo.m34959a(voa);
        this.f49628g = voa;
        this.f49629h = (voa[]) sdo.m34959a(voaArr);
    }

    /* renamed from: a */
    public static voc m40914a(String str) {
        sdo.m34959a((Object) str);
        return (voc) f49626j.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return sdg.m34949a(this.f49627f, ((voc) obj).f49627f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49627f});
    }
}
