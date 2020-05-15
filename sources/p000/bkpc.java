package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bkpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpc {

    /* renamed from: a */
    public final bkpb f125052a;

    /* renamed from: b */
    public final String f125053b;

    /* renamed from: c */
    public final Map f125054c;

    /* renamed from: d */
    public final String f125055d;

    public bkpc(bkpa bkpa) {
        bkpb bkpb;
        this.f125052a = bkpa.f125044a;
        this.f125053b = bkpa.f125045b;
        this.f125054c = bkpa.f125046c;
        String str = bkpa.f125047d;
        this.f125055d = str;
        if (this.f125053b == null || (bkpb = this.f125052a) == null || !(str == null || bkpb == bkpb.f125049b)) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static bkpc m106264a(bkoj bkoj, String str, Map map, bkpb bkpb, String str2) {
        String str3 = bkoj.f125006a;
        String valueOf = String.valueOf(str);
        String str4 = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap(bkoj.f125007b);
        for (bkoi bkoi : bkoj.f125010e) {
            bkoi.mo66124a(hashMap2);
        }
        hashMap.putAll(hashMap2);
        hashMap.putAll(map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (sb.length() == 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(bkph.m106270a((String) entry.getKey()));
            sb.append("=");
            sb.append(bkph.m106270a((String) entry.getValue()));
        }
        bkpa bkpa = new bkpa();
        if (bkpb != null) {
            bkpa.f125044a = bkpb;
            String valueOf2 = String.valueOf(str4);
            String valueOf3 = String.valueOf(sb.toString());
            String str5 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            if (str5 != null) {
                bkpa.f125045b = str5;
                bkpa.f125047d = str2;
                HashMap hashMap3 = new HashMap(bkoj.f125008c);
                for (bkoi bkoi2 : bkoj.f125010e) {
                }
                bkpa.f125046c.putAll(hashMap3);
                if (str2 != null) {
                    bkpa.f125046c.put("Content-Type", "text/plain;charset=UTF-8");
                }
                return new bkpc(bkpa);
            }
            throw null;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkpc)) {
            bkpc bkpc = (bkpc) obj;
            if (this.f125054c.equals(bkpc.f125054c) && this.f125052a == bkpc.f125052a) {
                String str = this.f125055d;
                if (str != null) {
                    if (!str.equals(bkpc.f125055d)) {
                        return false;
                    }
                } else if (bkpc.f125055d != null) {
                    return false;
                }
                String str2 = this.f125053b;
                if (str2 != null) {
                    if (!str2.equals(bkpc.f125053b)) {
                        return false;
                    }
                } else if (bkpc.f125053b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f125054c.hashCode() + 31) * 31;
        bkpb bkpb = this.f125052a;
        int i = 0;
        int hashCode2 = (hashCode + (bkpb != null ? bkpb.hashCode() : 0)) * 31;
        String str = this.f125055d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f125053b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125052a);
        String str = this.f125053b;
        String valueOf2 = String.valueOf(this.f125054c);
        String str2 = this.f125055d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("HttpRequestParams [method=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(str);
        sb.append(", headers=");
        sb.append(valueOf2);
        sb.append(", postdata=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
