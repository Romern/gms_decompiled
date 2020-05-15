package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cihs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cihs {

    /* renamed from: a */
    public static final cipx f190364a = cipx.m150785a(":");

    /* renamed from: b */
    public static final cihp[] f190365b = {new cihp(cihp.f190347e, ""), new cihp(cihp.f190344b, "GET"), new cihp(cihp.f190344b, DataParser.CONNECT_TYPE_POST), new cihp(cihp.f190345c, "/"), new cihp(cihp.f190345c, "/index.html"), new cihp(cihp.f190346d, "http"), new cihp(cihp.f190346d, "https"), new cihp(cihp.f190343a, "200"), new cihp(cihp.f190343a, "204"), new cihp(cihp.f190343a, "206"), new cihp(cihp.f190343a, "304"), new cihp(cihp.f190343a, "400"), new cihp(cihp.f190343a, "404"), new cihp(cihp.f190343a, "500"), new cihp("accept-charset", ""), new cihp("accept-encoding", "gzip, deflate"), new cihp("accept-language", ""), new cihp("accept-ranges", ""), new cihp("accept", ""), new cihp("access-control-allow-origin", ""), new cihp("age", ""), new cihp("allow", ""), new cihp("authorization", ""), new cihp("cache-control", ""), new cihp("content-disposition", ""), new cihp("content-encoding", ""), new cihp("content-language", ""), new cihp(DataParser.CONTENT_LENGTH_KEY, ""), new cihp("content-location", ""), new cihp("content-range", ""), new cihp("content-type", ""), new cihp("cookie", ""), new cihp("date", ""), new cihp("etag", ""), new cihp("expect", ""), new cihp("expires", ""), new cihp("from", ""), new cihp("host", ""), new cihp("if-match", ""), new cihp("if-modified-since", ""), new cihp("if-none-match", ""), new cihp("if-range", ""), new cihp("if-unmodified-since", ""), new cihp("last-modified", ""), new cihp("link", ""), new cihp("location", ""), new cihp("max-forwards", ""), new cihp("proxy-authenticate", ""), new cihp("proxy-authorization", ""), new cihp("range", ""), new cihp("referer", ""), new cihp("refresh", ""), new cihp("retry-after", ""), new cihp("server", ""), new cihp("set-cookie", ""), new cihp("strict-transport-security", ""), new cihp("transfer-encoding", ""), new cihp(DataParser.USER_AGENT_KEY, ""), new cihp("vary", ""), new cihp("via", ""), new cihp("www-authenticate", "")};

    /* renamed from: c */
    public static final Map f190366c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f190365b.length);
        while (true) {
            cihp[] cihpArr = f190365b;
            if (i < cihpArr.length) {
                if (!linkedHashMap.containsKey(cihpArr[i].f190348f)) {
                    linkedHashMap.put(f190365b[i].f190348f, Integer.valueOf(i));
                }
                i++;
            } else {
                f190366c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m150339a(cipx cipx) {
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
