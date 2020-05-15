package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* renamed from: cite */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cite extends UrlResponseInfo {

    /* renamed from: a */
    private final List f191399a;

    /* renamed from: b */
    private final int f191400b;

    /* renamed from: c */
    private final String f191401c;

    /* renamed from: d */
    private final String f191402d;

    /* renamed from: e */
    private final String f191403e;

    /* renamed from: f */
    private final AtomicLong f191404f = new AtomicLong(0);

    /* renamed from: g */
    private final citd f191405g;

    public cite(List list, int i, String str, List list2, String str2, String str3) {
        this.f191399a = Collections.unmodifiableList(list);
        this.f191400b = i;
        this.f191401c = str;
        this.f191405g = new citd(Collections.unmodifiableList(list2));
        this.f191402d = str2;
        this.f191403e = str3;
    }

    public final Map getAllHeaders() {
        citd citd = this.f191405g;
        Map map = citd.f191398b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : citd.f191397a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        citd.f191398b = Collections.unmodifiableMap(treeMap);
        return citd.f191398b;
    }

    public final List getAllHeadersAsList() {
        return this.f191405g.f191397a;
    }

    public final int getHttpStatusCode() {
        return this.f191400b;
    }

    public final String getHttpStatusText() {
        return this.f191401c;
    }

    public final String getNegotiatedProtocol() {
        return this.f191402d;
    }

    public final String getProxyServer() {
        return this.f191403e;
    }

    public final long getReceivedByteCount() {
        return this.f191404f.get();
    }

    public final String getUrl() {
        List list = this.f191399a;
        return (String) list.get(list.size() - 1);
    }

    public final List getUrlChain() {
        return this.f191399a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List list = this.f191399a;
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), (String) list.get(list.size() - 1), this.f191399a.toString(), Integer.valueOf(this.f191400b), this.f191401c, getAllHeadersAsList().toString(), false, this.f191402d, this.f191403e, Long.valueOf(this.f191404f.get()));
    }

    public final boolean wasCached() {
        return false;
    }
}
