package p000;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnl {

    /* renamed from: a */
    public final Map f16956a;

    /* renamed from: b */
    public final List f16957b;

    /* renamed from: c */
    public final long f16958c;

    /* renamed from: d */
    public final long f16959d;

    /* renamed from: e */
    public final int f16960e;

    /* renamed from: f */
    public final boolean f16961f;

    /* renamed from: g */
    public final String f16962g;

    public fnl(fki fki, Map map, long j, boolean z) {
        this(fki, map, j, z, 0, 0, null);
    }

    /* renamed from: a */
    private static String m12008a(fki fki, Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = obj2.substring(0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                fki.mo10932c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m12010b(fki fki, Object obj) {
        String str;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "";
        }
        int length = str.length();
        if (length <= 8192) {
            return str;
        }
        String substring = str.substring(0, 8192);
        fki.mo10932c("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f16959d);
        if (this.f16958c != 0) {
            sb.append(", dbId=");
            sb.append(this.f16958c);
        }
        if (this.f16960e != 0) {
            sb.append(", appUID=");
            sb.append(this.f16960e);
        }
        ArrayList arrayList = new ArrayList(this.f16956a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.f16956a.get(str));
        }
        return sb.toString();
    }

    public fnl(fki fki, Map map, long j, boolean z, long j2, int i, List list) {
        List list2;
        String str;
        String a;
        String a2;
        sdo.m34959a(fki);
        sdo.m34959a(map);
        this.f16959d = j;
        this.f16961f = z;
        this.f16958c = j2;
        this.f16960e = i;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.f16957b = list2;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Command command = (Command) it.next();
                if ("appendVersion".equals(command.f9487a)) {
                    str = command.f9488b;
                    break;
                }
            }
        }
        str = null;
        this.f16962g = !TextUtils.isEmpty(str) ? str : str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (m12009a(entry.getKey()) && (a2 = m12008a(fki, entry.getKey())) != null) {
                hashMap.put(a2, m12010b(fki, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!m12009a(entry2.getKey()) && (a = m12008a(fki, entry2.getKey())) != null) {
                hashMap.put(a, m12010b(fki, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.f16962g)) {
            fog.m12075a(hashMap, "_v", this.f16962g);
            if (this.f16962g.equals("ma4.0.0") || this.f16962g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f16956a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m12009a(Object obj) {
        if (obj != null) {
            return obj.toString().startsWith("&");
        }
        return false;
    }

    /* renamed from: a */
    public final String mo11022a(String str, String str2) {
        sdo.m34977c(str);
        sdo.m34975b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f16956a.get(str);
        return str3 != null ? str3 : str2;
    }
}
