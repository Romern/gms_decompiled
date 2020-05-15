package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bias */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bias implements bial {

    /* renamed from: a */
    final /* synthetic */ bhyi f120066a;

    /* renamed from: b */
    private final Map f120067b;

    /* renamed from: c */
    private final Collection f120068c;

    /* renamed from: d */
    private final Map f120069d;

    /* renamed from: e */
    private final bhyf f120070e;

    public bias() {
    }

    /* renamed from: a */
    public final void mo64498a(int i, Map map, Map map2) {
        if (i == 0) {
            Collection<bhyw> collection = this.f120068c;
            HashMap hashMap = new HashMap();
            for (bhyw bhyw : collection) {
                hashMap.put(bhyw, new ArrayList());
            }
            for (Map.Entry entry : map.entrySet()) {
                bhyw bhyw2 = (bhyw) entry.getKey();
                if (bhyw2.f119921c != 0) {
                    hashMap.put(bhyw2, (List) entry.getValue());
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                bhzl bhzl = (bhzl) entry2.getValue();
                if (bhzl.f119959a != 0.0d || bhzl.f119960b != 0.0d) {
                    hashMap2.put((String) entry2.getKey(), (bhzl) entry2.getValue());
                }
            }
            this.f120066a.f119893a.mo64429a(hashMap);
            this.f120066a.f119893a.mo64431b(hashMap2);
            this.f120067b.putAll(map);
            this.f120069d.putAll(map2);
            this.f120070e.mo64403a(0, biag.m101851a(this.f120067b, this.f120069d));
            return;
        }
        this.f120070e.mo64403a(i, Collections.emptyMap());
    }

    public bias(bhyi bhyi, Map map, Collection collection, Map map2, bhyf bhyf) {
        this.f120066a = bhyi;
        this.f120067b = map;
        this.f120068c = collection;
        this.f120069d = map2;
        this.f120070e = bhyf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        bibb bibb = (bibb) obj;
        mo64498a(0, bibb.f120098a, bibb.f120099b);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            sil.m35353a(volleyError, "Places");
            i = biam.m101858a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
        }
        mo64498a(i, Collections.emptyMap(), Collections.emptyMap());
    }
}
