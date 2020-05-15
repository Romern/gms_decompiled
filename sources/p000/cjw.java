package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: cjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cjw implements cjq {

    /* renamed from: a */
    private final List f6962a;

    /* renamed from: b */
    private final C1241og f6963b;

    public cjw(List list, C1241og ogVar) {
        this.f6962a = list;
        this.f6963b = ogVar;
    }

    /* renamed from: a */
    public final cjp mo3930a(Object obj, int i, int i2, cdk cdk) {
        cjp a;
        int size = this.f6962a.size();
        ArrayList arrayList = new ArrayList(size);
        cdg cdg = null;
        for (int i3 = 0; i3 < size; i3++) {
            cjq cjq = (cjq) this.f6962a.get(i3);
            if (cjq.mo3931a(obj) && (a = cjq.mo3930a(obj, i, i2, cdk)) != null) {
                cdg = a.f6948a;
                arrayList.add(a.f6950c);
            }
        }
        if (arrayList.isEmpty() || cdg == null) {
            return null;
        }
        return new cjp(cdg, new cjv(arrayList, this.f6963b));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f6962a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo3931a(Object obj) {
        List list = this.f6962a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((cjq) list.get(i)).mo3931a(obj)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
