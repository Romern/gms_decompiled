package p000;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: gdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdl {

    /* renamed from: a */
    public geo[] f17959a = new geo[2];

    /* renamed from: b */
    public Queue[] f17960b = new LinkedList[2];

    public gdl() {
        for (int i = 0; i < 2; i++) {
            this.f17960b[i] = new LinkedList();
        }
    }

    /* renamed from: a */
    public final int mo11685a(int i, geo geo) {
        if (this.f17960b[i].remove(geo)) {
            return 3;
        }
        geo geo2 = this.f17959a[i];
        if (geo2 == null || !geo2.equals(geo)) {
            return 2;
        }
        if (this.f17960b[i].isEmpty()) {
            this.f17959a[i] = null;
            return 0;
        }
        this.f17959a[i] = (geo) this.f17960b[i].remove();
        return 1;
    }

    /* renamed from: a */
    public final geo mo11686a(int i) {
        return this.f17959a[i];
    }
}
