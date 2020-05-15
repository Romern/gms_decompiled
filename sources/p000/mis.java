package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: mis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mis {

    /* renamed from: a */
    private Map f33794a;

    /* renamed from: a */
    public final synchronized bnhe mo20079a() {
        Map map = this.f33794a;
        if (map == null) {
            return bnoj.f131912b;
        }
        return bnhe.m109413a(map);
    }

    /* renamed from: a */
    public final synchronized void mo20080a(bngx bngx) {
        HashMap hashMap = new HashMap();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            mih mih = (mih) i.next();
            hashMap.put(mir.m25185a(mih.mo20048a(), mih.mo20049b().mo20059a()), mih.mo20049b().mo20060b());
            bngx c = mih.mo20050c();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                mii mii = (mii) c.get(i2);
                hashMap.put(mir.m25185a(mih.mo20048a(), mii.mo20054a()), mii.mo20055b());
            }
        }
        this.f33794a = hashMap;
    }
}
