package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: ancv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancv {

    /* renamed from: a */
    public final HashMap f76647a = new HashMap();

    /* renamed from: a */
    public final int mo41714a(String str) {
        sdo.m34959a((Object) str);
        Object obj = this.f76647a.get(str);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof ArrayList) {
            return ((ArrayList) obj).size();
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = (String[]) new ArrayList(this.f76647a.keySet()).toArray(ancm.f76631b);
        Arrays.sort(strArr);
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
            sb.append("=");
            int a = mo41714a(str);
            for (int i = 0; i < a; i++) {
                if (i > 0) {
                    sb.append(".");
                }
                sb.append(mo41715a(str, i));
            }
            sb.append("");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo41715a(String str, int i) {
        sdo.m34959a((Object) str);
        if (i >= 0) {
            Object obj = this.f76647a.get(str);
            if (obj == null) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Size=0, requested=");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (i <= arrayList.size()) {
                    return arrayList.get(i);
                }
                int size = arrayList.size();
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Size=");
                sb2.append(size);
                sb2.append(", requested=");
                sb2.append(i);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i <= 0) {
                return obj;
            } else {
                StringBuilder sb3 = new StringBuilder(29);
                sb3.append("Size=1, requested=");
                sb3.append(i);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("Requested negative index: ");
            sb4.append(i);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }
}
