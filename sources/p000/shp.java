package p000;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;
import com.google.android.gms.common.server.NetworkCallbacks;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import java.util.Map;

/* renamed from: shp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shp extends BasicNetwork {
    public shp(HttpStack httpStack) {
        super(httpStack);
    }

    /* renamed from: a */
    private static final void m35305a(long j, long j2, int i, boolean z) {
        int i2;
        int i3;
        if (cdna.m134121b()) {
            rpr b = rpr.m34216b();
            NetworkInfo d = ssk.m36240d(b);
            if (d != null) {
                i2 = d.getType();
            } else {
                i2 = -1;
            }
            if (shq.m35308b(i)) {
                i3 = shq.m35309c(i);
            } else {
                i3 = i;
            }
            int a = srf.m36091a(b);
            b.getNetworkLatencyLogger().logAsync(new NetworkLatencyEvent(j, j2 - j, i2, i3, a == -1 ? 7 : a, z));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    public final NetworkResponse performRequest(Request request) {
        NetworkCallbacks networkCallbacks;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if (request instanceof NetworkCallbacks) {
            networkCallbacks = (NetworkCallbacks) request;
        } else {
            networkCallbacks = null;
        }
        if (networkCallbacks != null) {
            networkCallbacks.onPreNetworkDispatch();
            i = TrafficStats.getThreadStatsTag();
        } else {
            i = request.getTrafficStatsTag();
        }
        if (cdna.m134125f() && !shq.m35308b(i)) {
            rpr b = rpr.m34216b();
            NetworkInfo d = ssk.m36240d(b);
            if (d != null) {
                i4 = d.getType();
            } else {
                i4 = -1;
            }
            boolean e = ssk.m36241e(b);
            int a = srf.m36091a(b);
            if (a != -1) {
                i5 = a;
            } else {
                i5 = 7;
            }
            b.getNetworkActivityLogger().logAsync(new NetworkActivityEvent(System.currentTimeMillis(), i4, i, i5, e));
        }
        bdnd bdnd = new bdnd(request.getUrl());
        bdnd.mo58201a();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            NetworkResponse performRequest = super.performRequest(request);
            if (performRequest != null) {
                Map map = performRequest.headers;
                if (map != null) {
                    bdnd.mo58204a((String) map.get("Content-Type"));
                }
                byte[] bArr = performRequest.data;
                if (bArr != null) {
                    i2 = bArr.length;
                } else {
                    i2 = 0;
                }
                if (request.getBody() != null) {
                    i3 = request.getBody().length;
                } else {
                    i3 = 0;
                }
                bdnd.mo58203a(i2, i3);
                bdnd.mo58202a(performRequest.statusCode);
                if (performRequest.statusCode < 400) {
                    z = true;
                    m35305a(currentTimeMillis, System.currentTimeMillis(), i, z);
                    if (networkCallbacks != null) {
                        networkCallbacks.onPostNetworkDispatch();
                    }
                    bdgs.m90764a().mo58026a(bdnd);
                    return performRequest;
                }
            }
            z = false;
            m35305a(currentTimeMillis, System.currentTimeMillis(), i, z);
            if (networkCallbacks != null) {
            }
            bdgs.m90764a().mo58026a(bdnd);
            return performRequest;
        } catch (VolleyError e2) {
            NetworkResponse networkResponse = e2.networkResponse;
            if (networkResponse != null) {
                bdnd.mo58202a(networkResponse.statusCode);
            }
            throw e2;
        } catch (Throwable th) {
            m35305a(currentTimeMillis, System.currentTimeMillis(), i, false);
            if (networkCallbacks != null) {
                networkCallbacks.onPostNetworkDispatch();
            }
            bdgs.m90764a().mo58026a(bdnd);
            throw th;
        }
    }
}
