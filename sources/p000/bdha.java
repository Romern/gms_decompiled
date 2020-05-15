package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bdha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdha implements bdes, bdig {

    /* renamed from: a */
    public final List f105616a = new ArrayList();

    /* renamed from: b */
    public boolean f105617b;

    /* renamed from: c */
    private final bdfd f105618c;

    public bdha(bdfd bdfd) {
        this.f105618c = bdfd;
        bdfd.mo57955a(this);
    }

    /* renamed from: a */
    public final void mo57945a() {
        synchronized (this) {
            this.f105617b = true;
        }
        this.f105618c.mo57956b(this);
        List list = this.f105616a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bdhy) list.get(i)).mo58063a();
        }
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f105618c.mo57956b(this);
    }
}
