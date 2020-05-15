package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cawk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawk {

    /* renamed from: a */
    public static final cawh[] f176255a = {new cawh(cawh.f176240e, ""), new cawh(cawh.f176237b, "GET"), new cawh(cawh.f176237b, DataParser.CONNECT_TYPE_POST), new cawh(cawh.f176238c, "/"), new cawh(cawh.f176238c, "/index.html"), new cawh(cawh.f176239d, "http"), new cawh(cawh.f176239d, "https"), new cawh(cawh.f176236a, "200"), new cawh(cawh.f176236a, "204"), new cawh(cawh.f176236a, "206"), new cawh(cawh.f176236a, "304"), new cawh(cawh.f176236a, "400"), new cawh(cawh.f176236a, "404"), new cawh(cawh.f176236a, "500"), new cawh("accept-charset", ""), new cawh("accept-encoding", "gzip, deflate"), new cawh("accept-language", ""), new cawh("accept-ranges", ""), new cawh("accept", ""), new cawh("access-control-allow-origin", ""), new cawh("age", ""), new cawh("allow", ""), new cawh("authorization", ""), new cawh("cache-control", ""), new cawh("content-disposition", ""), new cawh("content-encoding", ""), new cawh("content-language", ""), new cawh(DataParser.CONTENT_LENGTH_KEY, ""), new cawh("content-location", ""), new cawh("content-range", ""), new cawh("content-type", ""), new cawh("cookie", ""), new cawh("date", ""), new cawh("etag", ""), new cawh("expect", ""), new cawh("expires", ""), new cawh("from", ""), new cawh("host", ""), new cawh("if-match", ""), new cawh("if-modified-since", ""), new cawh("if-none-match", ""), new cawh("if-range", ""), new cawh("if-unmodified-since", ""), new cawh("last-modified", ""), new cawh("link", ""), new cawh("location", ""), new cawh("max-forwards", ""), new cawh("proxy-authenticate", ""), new cawh("proxy-authorization", ""), new cawh("range", ""), new cawh("referer", ""), new cawh("refresh", ""), new cawh("retry-after", ""), new cawh("server", ""), new cawh("set-cookie", ""), new cawh("strict-transport-security", ""), new cawh("transfer-encoding", ""), new cawh(DataParser.USER_AGENT_KEY, ""), new cawh("vary", ""), new cawh("via", ""), new cawh("www-authenticate", "")};

    /* renamed from: b */
    public static final Map f176256b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f176255a.length);
        while (true) {
            cawh[] cawhArr = f176255a;
            if (i < cawhArr.length) {
                if (!linkedHashMap.containsKey(cawhArr[i].f176243h)) {
                    linkedHashMap.put(f176255a[i].f176243h, Integer.valueOf(i));
                }
                i++;
            } else {
                f176256b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m127404a(cipx cipx) {
        int e = cipx.mo86345e();
        for (int i = 0; i < e; i++) {
            byte a = cipx.mo86335a(i);
            if (a >= 65 && a <= 90) {
                String valueOf = String.valueOf(cipx.mo86336a());
                throw new IOException(valueOf.length() == 0 ? new String("PROTOCOL_ERROR response malformed: mixed case name: ") : "PROTOCOL_ERROR response malformed: mixed case name: ".concat(valueOf));
            }
        }
    }
}
