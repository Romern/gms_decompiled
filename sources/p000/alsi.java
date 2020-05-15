package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsi {

    /* renamed from: c */
    private static final Map f74195c = new HashMap();

    /* renamed from: d */
    private static final Map f74196d = new HashMap();

    /* renamed from: a */
    public final String f74197a;

    /* renamed from: b */
    public final int f74198b;

    static {
        m61650a("get", f74195c, "people/${gaia_id}?includeProfilesWithState=disabled&includeViewCount=true&onBehalfOf=${on_behalf_of}", 2);
        m61650a("list", f74196d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary)", 4);
        m61650a("list_by_email", f74196d, "people/lookup?id=${email}&onBehalfOf=${on_behalf_of}&type=email&matchType=lenient", 4);
        m61650a("list_by_phone", f74196d, "people/lookup?id=${phone}&onBehalfOf=${on_behalf_of}&type=phone&matchType=lenient", 4);
        m61650a("list_by_focus_id", f74196d, "people/lookup?id=${contact}&onBehalfOf=${on_behalf_of}&type=contact&matchType=lenient", 4);
        m61650a("list_by_email_and_phone", f74196d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary,emails(value,metadata/primary),phoneNumbers(value,metadata/primary))", 4);
    }

    public alsi(String str, String str2, int i) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("gms.people.endpoint.");
        } else {
            "gms.people.endpoint.".concat(valueOf);
        }
        this.f74197a = str2;
        this.f74198b = i;
    }

    /* renamed from: a */
    public static synchronized alsi m61648a(String str) {
        alsi a;
        synchronized (alsi.class) {
            if (TextUtils.isEmpty(str)) {
                str = "list";
            }
            a = m61649a(str, f74196d, "people/me/people/all?onBehalfOf=${on_behalf_of}&fields=items(id,names/displayName,names/metadata/primary,images/url,images/metadata/primary)");
        }
        return a;
    }

    /* renamed from: a */
    private static synchronized alsi m61649a(String str, Map map, String str2) {
        synchronized (alsi.class) {
            alsi alsi = (alsi) map.get(str);
            if (alsi != null) {
                return alsi;
            }
            alsi a = m61650a(str, map, str2, 4);
            return a;
        }
    }

    /* renamed from: a */
    private static synchronized alsi m61650a(String str, Map map, String str2, int i) {
        alsi alsi;
        synchronized (alsi.class) {
            alsi = new alsi(str, str2, i);
            map.put(str, alsi);
        }
        return alsi;
    }
}
