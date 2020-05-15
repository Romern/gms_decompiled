package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: acxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxd {

    /* renamed from: a */
    private final Map f61003a = new HashMap();

    /* renamed from: a */
    public final List mo33186a(List list) {
        if (this.f61003a.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            absu absu = (absu) it.next();
            bxvd bxvd = (bxvd) absu.mo74142c(5);
            bxvd.mo73625a((bxvk) absu);
            int[] iArr = (int[]) this.f61003a.get(absu.f58168b);
            if (iArr != null) {
                int i = absu.f58169c + iArr[0];
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                absu absu2 = (absu) bxvd.f164949b;
                absu absu3 = absu.f58165d;
                absu2.f58167a |= 2;
                absu2.f58169c = i;
                this.f61003a.remove(absu.f58168b);
            }
            arrayList.add((absu) bxvd.mo74062i());
        }
        for (Map.Entry entry : this.f61003a.entrySet()) {
            bxvd da = absu.f58165d.mo74144da();
            String str = (String) entry.getKey();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absu absu4 = (absu) da.f164949b;
            str.getClass();
            absu4.f58167a |= 1;
            absu4.f58168b = str;
            int i2 = ((int[]) entry.getValue())[0];
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            absu absu5 = (absu) da.f164949b;
            absu5.f58167a |= 2;
            absu5.f58169c = i2;
            arrayList.add((absu) da.mo74062i());
        }
        this.f61003a.clear();
        Collections.sort(arrayList, acxc.f61002a);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo33187a(String str) {
        int[] iArr = (int[]) this.f61003a.get(str);
        if (iArr == null) {
            this.f61003a.put(str, new int[]{1});
            return;
        }
        iArr[0] = iArr[0] + 1;
    }

    /* renamed from: a */
    public final boolean mo33188a() {
        return !this.f61003a.isEmpty();
    }
}
