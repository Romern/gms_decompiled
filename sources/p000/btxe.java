package p000;

import java.util.LinkedList;
import java.util.List;

/* renamed from: btxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxe {

    /* renamed from: a */
    public final LinkedList f152793a = new LinkedList();

    /* renamed from: b */
    public final btwr f152794b = new btwr(btwy.m118969b());

    /* renamed from: a */
    public final void mo72470a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            btxc btxc = (btxc) list.get(i);
            long e = btxc.mo72465e();
            if (!this.f152793a.isEmpty() && e - ((btxc) this.f152793a.getFirst()).mo72465e() >= 900000) {
                this.f152793a.remove();
            }
            this.f152793a.add(btxc);
        }
    }
}
