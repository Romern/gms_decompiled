package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ancg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancg {

    /* renamed from: a */
    public final HashMap f76621a = new HashMap();

    /* renamed from: a */
    public final int mo41689a(int i) {
        Integer valueOf = Integer.valueOf(i);
        sdo.m34959a(valueOf);
        Object obj = this.f76621a.get(valueOf);
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof String)) {
            return ((ArrayList) obj).size();
        }
        return 1;
    }

    /* renamed from: a */
    public final String mo41690a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        sdo.m34959a(valueOf);
        if (i2 >= 0) {
            Object obj = this.f76621a.get(valueOf);
            if (obj == null) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Size=0, requested=");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!(obj instanceof String)) {
                ArrayList arrayList = (ArrayList) obj;
                if (i2 <= arrayList.size()) {
                    return (String) arrayList.get(i2);
                }
                int size = arrayList.size();
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Size=");
                sb2.append(size);
                sb2.append(", requested=");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 <= 0) {
                return (String) obj;
            } else {
                StringBuilder sb3 = new StringBuilder(29);
                sb3.append("Size=1, requested=");
                sb3.append(i2);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("Requested negative index: ");
            sb4.append(i2);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }
}
