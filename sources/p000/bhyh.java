package p000;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bhyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyh implements bhyu {

    /* renamed from: a */
    final /* synthetic */ bhyi f119888a;

    /* renamed from: b */
    private final PlacesParams f119889b;

    /* renamed from: c */
    private final Map f119890c;

    /* renamed from: d */
    private final Collection f119891d;

    /* renamed from: e */
    private final bhyf f119892e;

    public bhyh(bhyi bhyi, PlacesParams placesParams, Map map, Collection collection, bhyf bhyf) {
        this.f119888a = bhyi;
        this.f119889b = placesParams;
        this.f119890c = map;
        this.f119891d = collection;
        this.f119892e = bhyf;
    }

    /* renamed from: a */
    public final void mo64417a(Map map, Collection collection) {
        if (!collection.isEmpty()) {
            if (Log.isLoggable("Places", 5)) {
                int size = collection.size();
                StringBuilder sb = new StringBuilder(80);
                sb.append(size);
                sb.append(" cache miss in L2. It isn't supposed to happen. Need to debug further");
                Log.w("Places", sb.toString());
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                for (Map.Entry entry : this.f119890c.entrySet()) {
                    if (((List) entry.getValue()).contains(str)) {
                        this.f119891d.add((bhyw) entry.getKey());
                        this.f119890c.remove((bhyw) entry.getKey());
                    }
                }
            }
        }
        if (!this.f119891d.isEmpty()) {
            bias bias = new bias(this.f119888a, this.f119890c, this.f119891d, map, this.f119892e);
            Collection<bhyw> collection2 = this.f119891d;
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (bhyw bhyw : collection2) {
                String str2 = bhyw.f119920b;
                long j = bhyw.f119921c;
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str2)).add(Long.valueOf(j));
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                bxvd da = bvll.f156559d.mo74144da();
                String str3 = (String) entry2.getKey();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvll bvll = (bvll) da.f164949b;
                str3.getClass();
                bvll.f156561a |= 1;
                bvll.f156563c = str3;
                Iterable iterable = (Iterable) entry2.getValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvll bvll2 = (bvll) da.f164949b;
                if (!bvll2.f156562b.mo73666a()) {
                    bvll2.f156562b = bxvk.m124020a(bvll2.f156562b);
                }
                bxsy.m123078a(iterable, bvll2.f156562b);
                arrayList.add((bvll) da.mo74062i());
            }
            this.f119888a.f119895c.mo64490a(new biay(this.f119888a.f119894b, this.f119889b, arrayList, (int) cgfr.m145053h()), bias);
            return;
        }
        this.f119892e.mo64403a(-1, biag.m101851a(this.f119890c, map));
    }
}
