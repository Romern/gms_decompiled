package p000;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: apfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfa {

    /* renamed from: a */
    public static final apfa f84284a = new apfa();

    /* renamed from: b */
    public final LruCache f84285b = new LruCache(3);

    private apfa() {
    }

    /* renamed from: a */
    public final bmxv mo47145a(String str, String str2, String[] strArr) {
        btem a = mo47146a(str, str2);
        if (a == null) {
            return bmvz.f131120a;
        }
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        btel btel = (btel) bxvd;
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableList(((btem) btel.f164949b).f148534a).iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            btfi btfi = (btfi) it.next();
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (btfi.f148664g.equals(strArr[i])) {
                    arrayList.add(btfi);
                    break;
                }
                i++;
            }
        }
        if (btel.f164950c) {
            btel.mo74035c();
            btel.f164950c = false;
        }
        ((btem) btel.f164949b).f148534a = bxvk.m124030de();
        btel.mo70754a(arrayList);
        return bmxv.m108566b((btem) btel.mo74062i());
    }

    /* renamed from: a */
    public final btem mo47146a(String str, String str2) {
        return (btem) this.f84285b.get(new apez(str, str2));
    }
}
