package p000;

import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.ExecutorDelivery;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: rpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpw extends RequestQueue {

    /* renamed from: d */
    public static final ThreadLocal f43505d = new ThreadLocal();

    /* renamed from: c */
    public final Map f43506c = new WeakHashMap(8, 4.0f);

    /* renamed from: e */
    public final bmzi f43507e = bmzn.m108681a(rpt.f43501a);

    /* renamed from: f */
    private final bmzi f43508f = bmzn.m108681a(rps.f43500a);

    public rpw(Cache cache, Network network, adzt adzt) {
        super(cache, network, 4, new ExecutorDelivery(adzt));
        if (((Boolean) this.f43508f.mo6606a()).booleanValue()) {
            addRequestEventListener(new rpu(this));
        }
    }

    public final Request add(Request request) {
        rpv rpv;
        if (((Boolean) this.f43508f.mo6606a()).booleanValue()) {
            synchronized (this) {
                blka a = blka.m107273a();
                if (!((Boolean) this.f43507e.mo6606a()).booleanValue()) {
                    rpv = new rpv(a);
                } else {
                    bljb a2 = blkh.m107281a("Volley");
                    try {
                        aabt aabt = aabs.f27896b;
                        bqgy c = bqgy.m112818c();
                        aabt.mo16702a(a2, c);
                        rpv rpv2 = new rpv(a, c);
                        if (a2 != null) {
                            a2.close();
                        }
                        rpv = rpv2;
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                this.f43506c.put(request, rpv);
            }
        }
        super.add(request);
        return request;
        throw th;
    }

    public final void stop() {
        Log.e("GmsRequestQueue", "Tried to stop global GMSCore RequestQueue. This is likely unintended, so ignoring.");
    }
}
