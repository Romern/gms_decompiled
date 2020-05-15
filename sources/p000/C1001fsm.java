package p000;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1001fsm {

    /* renamed from: a */
    public final int f17193a;

    /* renamed from: b */
    public final /* synthetic */ SearchResults f17194b;

    /* renamed from: c */
    private final fsn f17195c;

    public C1001fsm(SearchResults searchResults, int i, fsn fsn) {
        this.f17194b = searchResults;
        this.f17195c = fsn;
        this.f17193a = i;
    }

    /* renamed from: a */
    public final fsl mo11251a(String str) {
        Map[] mapArr = this.f17195c.f17198c;
        int i = this.f17194b.f9671h[this.f17193a];
        Map map = mapArr[i];
        if (map == null) {
            map = new HashMap();
            mapArr[i] = map;
        }
        fsl fsl = (fsl) map.get(str);
        if (fsl != null) {
            return fsl;
        }
        SearchResults searchResults = this.f17194b;
        int[] intArray = searchResults.f9668e[searchResults.f9671h[this.f17193a]].getIntArray(str);
        SearchResults searchResults2 = this.f17194b;
        byte[] byteArray = searchResults2.f9669f[searchResults2.f9671h[this.f17193a]].getByteArray(str);
        if (intArray == null || byteArray == null) {
            return null;
        }
        fsl fsl2 = new fsl(intArray, byteArray);
        map.put(str, fsl2);
        return fsl2;
    }

    /* renamed from: b */
    public final String mo11253b(String str) {
        fsl a = mo11251a(str);
        if (a != null) {
            return a.mo11250b(this.f17193a);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo11252a() {
        byte[] bArr;
        fsn fsn = this.f17195c;
        if (fsn.f17197b == null) {
            SearchResults searchResults = this.f17194b;
            int[] iArr = searchResults.f9665b;
            if (iArr == null || (bArr = searchResults.f9666c) == null) {
                return null;
            }
            fsn.f17197b = new fsl(iArr, bArr);
        }
        return this.f17195c.f17197b.mo11250b(this.f17193a);
    }
}
