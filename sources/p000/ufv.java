package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ufv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ufv implements ufx {

    /* renamed from: a */
    private int f47481a = 0;

    /* renamed from: b */
    private long f47482b;

    /* renamed from: c */
    private long f47483c = -1;

    /* renamed from: d */
    private final List f47484d;

    public ufv(ufx ufx) {
        ArrayList arrayList = new ArrayList();
        this.f47484d = arrayList;
        if (ufx != null) {
            arrayList.add(ufx);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27242a(int i) {
        if (i != this.f47481a) {
            this.f47481a = i;
            List list = this.f47484d;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ufx) list.get(i2)).mo27242a(this.f47481a);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo27243a(long j, long j2) {
        this.f47482b = j;
        this.f47483c = j2;
        List list = this.f47484d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ufx) list.get(i)).mo27243a(j, j2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27304a(ufx ufx) {
        ufx.mo27243a(this.f47482b, this.f47483c);
        ufx.mo27242a(this.f47481a);
        this.f47484d.add(ufx);
    }
}
