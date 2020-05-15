package p000;

import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.cmnctrl.net.DataParser;

/* renamed from: caxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxu {
    /* renamed from: a */
    public static boolean m127506a(String str) {
        return str.equals(DataParser.CONNECT_TYPE_POST) || str.equals("PUT") || str.equals(HttpClientStack.HttpPatch.METHOD_NAME) || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* renamed from: b */
    public static boolean m127507b(String str) {
        return m127506a(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }
}
