package p000;

import java.util.ArrayList;

/* renamed from: anch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anch {

    /* renamed from: a */
    private final ArrayList f76622a = new ArrayList();

    /* renamed from: b */
    private static IndexOutOfBoundsException m63982b(int i, int i2) {
        return new IndexOutOfBoundsException(String.format("Size=%d, requested=%d", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public final int mo41691a() {
        return this.f76622a.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mo41691a(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("[");
            int b = mo41695b(i);
            for (int i2 = 0; i2 < b; i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(mo41692a(i, i2));
            }
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo41692a(int i, int i2) {
        Object obj = this.f76622a.get(i);
        if (obj == null) {
            throw m63982b(0, i2);
        } else if (!(obj instanceof Integer)) {
            ArrayList arrayList = (ArrayList) obj;
            if (i2 <= arrayList.size()) {
                return ((Integer) arrayList.get(i2)).intValue();
            }
            throw m63982b(arrayList.size(), i2);
        } else if (i2 == 0) {
            return ((Integer) obj).intValue();
        } else {
            throw m63982b(1, i2);
        }
    }

    /* renamed from: b */
    public final int mo41695b(int i) {
        Object obj = this.f76622a.get(i);
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Integer)) {
            return ((ArrayList) obj).size();
        }
        return 1;
    }

    /* renamed from: b */
    public final void mo41696b() {
        this.f76622a.add(null);
    }

    /* renamed from: a */
    public final void mo41693a(int i) {
        this.f76622a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo41694a(ancu ancu, String str) {
        int a = ancu.mo41712a(str);
        if (a != 0) {
            if (a == 1) {
                this.f76622a.add(Integer.valueOf(ancu.mo41713a(str, 0)));
                return;
            }
            ArrayList arrayList = new ArrayList(a);
            for (int i = 0; i < a; i++) {
                arrayList.add(Integer.valueOf(ancu.mo41713a(str, i)));
            }
            this.f76622a.add(arrayList);
        }
    }
}
