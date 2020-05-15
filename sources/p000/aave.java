package p000;

import android.view.MenuItem;
import java.util.List;

/* renamed from: aave */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aave {

    /* renamed from: a */
    private final List f56643a;

    /* renamed from: b */
    private final MenuItem f56644b;

    public aave(List list, MenuItem menuItem) {
        this.f56643a = list;
        this.f56644b = menuItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aatq) list.get(i)).mo31780a(this);
        }
    }

    /* renamed from: a */
    public final void mo31824a() {
        List list = this.f56643a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            aatq aatq = (aatq) list.get(i);
            if (aatq.mo31782b() && !aatq.mo31781a()) {
                break;
            }
            i++;
        }
        this.f56644b.setEnabled(z);
    }
}
