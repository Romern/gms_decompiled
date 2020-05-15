package p000;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fir {

    /* renamed from: a */
    Map f16676a;

    /* renamed from: b */
    List f16677b;

    /* renamed from: c */
    List f16678c;

    /* renamed from: d */
    private Map f16679d;

    protected fir() {
        this.f16679d = new HashMap();
        this.f16676a = new HashMap();
        this.f16677b = new ArrayList();
        this.f16678c = new ArrayList();
    }

    /* renamed from: b */
    private final void m11773b(String str, String str2) {
        if (str2 != null) {
            this.f16679d.put(str, str2);
        }
    }

    /* renamed from: a */
    public final Map mo10861a() {
        HashMap hashMap = new HashMap(this.f16679d);
        List list = this.f16677b;
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            fjz fjz = (fjz) list.get(i2);
            fio.m11764a("&promo", i);
            hashMap.putAll(fjz.m11836a());
            i++;
        }
        List list2 = this.f16678c;
        int size2 = list2.size();
        int i3 = 1;
        for (int i4 = 0; i4 < size2; i4++) {
            fjy fjy = (fjy) list2.get(i4);
            fio.m11764a("&pr", i3);
            hashMap.putAll(fjy.m11835a());
            i3++;
        }
        int i5 = 1;
        for (Map.Entry entry : this.f16676a.entrySet()) {
            String a = fio.m11764a("&il", i5);
            int i6 = 1;
            for (fjy fjy2 : (List) entry.getValue()) {
                String valueOf = String.valueOf(a);
                String valueOf2 = String.valueOf(fio.m11763a(i6));
                if (valueOf2.length() == 0) {
                    new String(valueOf);
                } else {
                    valueOf.concat(valueOf2);
                }
                hashMap.putAll(fjy.m11835a());
                i6++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(String.valueOf(a).concat("nm"), (String) entry.getKey());
            }
            i5++;
        }
        return hashMap;
    }

    /* renamed from: c */
    public void mo10865c(String str) {
        mo10863a("&ea", str);
    }

    /* renamed from: d */
    public void mo10866d(String str) {
        mo10863a("&ec", str);
    }

    /* renamed from: e */
    public void mo10867e(String str) {
        mo10863a("&el", str);
    }

    public fir(String str, String str2) {
        this((char[]) null);
        mo10866d(str);
        mo10865c(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public void mo10864b(String str) {
        String str2;
        Object obj;
        String str3;
        String str4 = str;
        String str5 = "aclid";
        if (!TextUtils.isEmpty(str)) {
            if (str4.contains("?")) {
                String[] split = str4.split("[\\?]");
                if (split.length > 1) {
                    str4 = split[1];
                }
            }
            if (str4.contains("%3D")) {
                try {
                    str4 = URLDecoder.decode(str4, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                }
            } else if (!str4.contains("=")) {
                obj = "gmob_t";
                str2 = str5;
                str3 = null;
                if (!TextUtils.isEmpty(str3)) {
                    Map a = fog.m12074a(str3);
                    m11773b("&cc", (String) a.get("utm_content"));
                    m11773b("&cm", (String) a.get("utm_medium"));
                    m11773b("&cn", (String) a.get("utm_campaign"));
                    m11773b("&cs", (String) a.get("utm_source"));
                    m11773b("&ck", (String) a.get("utm_term"));
                    m11773b("&ci", (String) a.get("utm_id"));
                    m11773b("&anid", (String) a.get("anid"));
                    m11773b("&gclid", (String) a.get("gclid"));
                    m11773b("&dclid", (String) a.get("dclid"));
                    m11773b("&aclid", (String) a.get(str2));
                    m11773b("&gmob_t", (String) a.get(obj));
                    return;
                }
                return;
            }
            Map a2 = fog.m12074a(str4);
            String[] strArr = {"dclid", "utm_source", "gclid", str5, "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
            StringBuilder sb = new StringBuilder();
            obj = "gmob_t";
            int i = 0;
            while (true) {
                str2 = str5;
                if (i >= 11) {
                    break;
                }
                if (!TextUtils.isEmpty((CharSequence) a2.get(strArr[i]))) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(strArr[i]);
                    sb.append("=");
                    sb.append((String) a2.get(strArr[i]));
                }
                i++;
                str5 = str2;
            }
            str3 = sb.toString();
            if (!TextUtils.isEmpty(str3)) {
            }
        }
        obj = "gmob_t";
        str2 = str5;
        str3 = null;
        if (!TextUtils.isEmpty(str3)) {
        }
    }

    public fir(byte[] bArr) {
        this();
        mo10863a("&t", "screenview");
    }

    public fir(char[] cArr) {
        this();
        mo10863a("&t", "event");
    }

    /* renamed from: a */
    public void mo10858a(int i, String str) {
        mo10863a(fio.m11764a("&cd", i), str);
    }

    /* renamed from: a */
    public void mo10862a(long j) {
        mo10863a("&ev", Long.toString(j));
    }

    /* renamed from: a */
    public final void mo10863a(String str, String str2) {
        if (str != null) {
            this.f16679d.put(str, str2);
        } else {
            fnq.m12019b("HitBuilder.set() called with a null paramName.");
        }
    }
}
