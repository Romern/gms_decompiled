package p000;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnn {

    /* renamed from: a */
    public final Map f5194a = new HashMap();

    /* renamed from: b */
    public final CacheDispatcher f5195b;

    public bnn(CacheDispatcher cacheDispatcher) {
        this.f5195b = cacheDispatcher;
    }

    /* renamed from: a */
    public final synchronized void mo3301a(Request request) {
        String cacheKey = request.getCacheKey();
        List list = (List) this.f5194a.remove(cacheKey);
        if (list != null && !list.isEmpty()) {
            if (VolleyLog.DEBUG) {
                VolleyLog.m4767v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
            }
            Request request2 = (Request) list.remove(0);
            this.f5194a.put(cacheKey, list);
            request2.mo4166a(this);
            try {
                this.f5195b.f7262a.put(request2);
            } catch (InterruptedException e) {
                VolleyLog.m4765e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f5195b.quit();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    public final synchronized boolean mo3302b(Request request) {
        String cacheKey = request.getCacheKey();
        if (this.f5194a.containsKey(cacheKey)) {
            List list = (List) this.f5194a.get(cacheKey);
            if (list == null) {
                list = new ArrayList();
            }
            request.addMarker("waiting-for-response");
            list.add(request);
            this.f5194a.put(cacheKey, list);
            if (VolleyLog.DEBUG) {
                VolleyLog.m4764d("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
        } else {
            this.f5194a.put(cacheKey, null);
            request.mo4166a(this);
            if (VolleyLog.DEBUG) {
                VolleyLog.m4764d("new request, sending to network %s", cacheKey);
            }
        }
    }
}
