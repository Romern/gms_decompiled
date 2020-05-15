package p000;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: caxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxx {

    /* renamed from: a */
    static final String f176366a = "OkHttp";

    /* renamed from: b */
    public static final String f176367b = String.valueOf("OkHttp").concat("-Sent-Millis");

    /* renamed from: c */
    public static final String f176368c = String.valueOf(f176366a).concat("-Received-Millis");

    /* renamed from: d */
    public static final String f176369d = String.valueOf(f176366a).concat("-Selected-Protocol");

    /* renamed from: e */
    public static final String f176370e = String.valueOf(f176366a).concat("-Response-Source");

    /* renamed from: f */
    private static final Comparator f176371f = new caxw();

    static {
        cavh cavh = cavh.f176134a;
    }

    /* renamed from: a */
    public static long m127516a(cauc cauc) {
        String a = cauc.mo74873a("Content-Length");
        if (a == null) {
            return -1;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* renamed from: b */
    public static List m127522b(cauc cauc, String str) {
        ArrayList arrayList = new ArrayList();
        int a = cauc.mo74871a();
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(cauc.mo74872a(i))) {
                String b = cauc.mo74875b(i);
                int i2 = 0;
                while (i2 < b.length()) {
                    int a2 = caxg.m127460a(b, i2, " ");
                    String trim = b.substring(i2, a2).trim();
                    int a3 = caxg.m127459a(b, a2);
                    if (!b.regionMatches(true, a3, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = a3 + 7;
                    int a4 = caxg.m127460a(b, i3, "\"");
                    String substring = b.substring(i3, a4);
                    i2 = caxg.m127459a(b, caxg.m127460a(b, a4 + 1, ",") + 1);
                    arrayList.add(new catp(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static long m127517a(cauk cauk) {
        return m127516a(cauk.f176039c);
    }

    /* renamed from: a */
    public static long m127518a(caun caun) {
        return m127516a(caun.f176060f);
    }

    /* renamed from: a */
    public static cauk m127519a(caun caun, Proxy proxy) {
        PasswordAuthentication requestPasswordAuthentication;
        caun caun2 = caun;
        Proxy proxy2 = proxy;
        int i = 0;
        if (caun2.f176057c == 407) {
            List b = caun.mo74921b();
            cauk cauk = caun2.f176055a;
            caue caue = cauk.f176037a;
            int size = b.size();
            while (i < size) {
                catp catp = (catp) b.get(i);
                if ("Basic".equalsIgnoreCase(catp.f175855a)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    PasswordAuthentication requestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), caxc.m127458a(proxy2, caue), inetSocketAddress.getPort(), caue.f175990a, catp.f175856b, catp.f175855a, caue.mo74885a(), Authenticator.RequestorType.PROXY);
                    if (requestPasswordAuthentication2 != null) {
                        String a = catw.m127192a(requestPasswordAuthentication2.getUserName(), new String(requestPasswordAuthentication2.getPassword()));
                        cauj b2 = cauk.mo74912b();
                        b2.mo74909b("Proxy-Authorization", a);
                        return b2.mo74904a();
                    }
                }
                i++;
            }
            return null;
        }
        List b3 = caun.mo74921b();
        cauk cauk2 = caun2.f176055a;
        caue caue2 = cauk2.f176037a;
        int size2 = b3.size();
        while (i < size2) {
            catp catp2 = (catp) b3.get(i);
            if (!"Basic".equalsIgnoreCase(catp2.f175855a) || (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(caue2.f175991b, caxc.m127458a(proxy2, caue2), caue2.f175992c, caue2.f175990a, catp2.f175856b, catp2.f175855a, caue2.mo74885a(), Authenticator.RequestorType.SERVER)) == null) {
                i++;
            } else {
                String a2 = catw.m127192a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                cauj b4 = cauk2.mo74912b();
                b4.mo74909b("Authorization", a2);
                return b4.mo74904a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Map m127520a(cauc cauc, String str) {
        TreeMap treeMap = new TreeMap(f176371f);
        int a = cauc.mo74871a();
        for (int i = 0; i < a; i++) {
            String a2 = cauc.mo74872a(i);
            String b = cauc.mo74875b(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(a2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b);
            treeMap.put(a2, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* renamed from: a */
    public static void m127521a(cauj cauj, Map map) {
        String str;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (("Cookie".equalsIgnoreCase(str2) || "Cookie2".equalsIgnoreCase(str2)) && !((List) entry.getValue()).isEmpty()) {
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    str = (String) list.get(0);
                } else {
                    StringBuilder sb = new StringBuilder();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append((String) list.get(i));
                    }
                    str = sb.toString();
                }
                cauj.mo74908a(str2, str);
            }
        }
    }
}
