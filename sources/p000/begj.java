package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: begj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begj {

    /* renamed from: a */
    public final String f111536a;

    /* renamed from: b */
    private final List f111537b = new ArrayList();

    public begj(String str, List list) {
        this.f111536a = str;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo60689a((begl) list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final begk mo60688a() {
        return new begk(this.f111536a, this.f111537b);
    }

    /* renamed from: a */
    public final void mo60689a(begl begl) {
        int i = 0;
        while (i < this.f111537b.size()) {
            if (!((begl) this.f111537b.get(i)).f111540a.equals(begl.f111540a)) {
                i++;
            } else {
                this.f111537b.set(i, begl);
                return;
            }
        }
        this.f111537b.add(begl);
    }

    /* renamed from: a */
    public final void mo60690a(String str, String str2) {
        mo60689a(new begl(str, str2));
    }
}
