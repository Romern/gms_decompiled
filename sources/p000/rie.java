package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rie {

    /* renamed from: a */
    private static int f43030a;

    /* renamed from: b */
    private static List f43031b;

    /* renamed from: c */
    private static final Object f43032c = new Object();

    /* renamed from: a */
    private static void m33631a(List list, String str) {
        if (Uri.parse(str).getPath().contains("/")) {
            list.add(str);
        }
    }

    /* renamed from: a */
    public static final boolean m33632a(String str) {
        List list;
        ArrayList arrayList;
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.toString()) || TextUtils.isEmpty(parse.getHost())) {
            return false;
        }
        String str2 = (String) rsv.f43632u.mo25081c();
        if (f43030a == str2.hashCode()) {
            list = f43031b;
        } else {
            synchronized (f43032c) {
                f43030a = str2.hashCode();
                String[] split = str2.split(",");
                int length = split.length;
                arrayList = new ArrayList(length + length);
                for (String str3 : split) {
                    if (!str3.contains("://")) {
                        String valueOf = String.valueOf(str3);
                        m33631a(arrayList, valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf));
                        String valueOf2 = String.valueOf(str3);
                        m33631a(arrayList, valueOf2.length() == 0 ? new String("http://") : "http://".concat(valueOf2));
                    } else {
                        m33631a(arrayList, str3);
                    }
                }
                f43031b = arrayList;
            }
            list = arrayList;
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (str.startsWith((String) list.get(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
