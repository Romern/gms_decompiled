package p000;

import java.util.Set;

/* renamed from: apjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjp {

    /* renamed from: a */
    private final Set f84543a = new C1225nr();

    /* renamed from: b */
    private int f84544b;

    public apjp() {
        sdo.m34974b(true);
        sdo.m34974b(true);
        this.f84544b = 1000;
    }

    /* renamed from: a */
    public final synchronized int mo47344a() {
        int i;
        if (((C1225nr) this.f84543a).f26758b < 2147482647) {
            i = this.f84544b;
            this.f84544b = i + 1;
            while (!this.f84543a.add(Integer.valueOf(i))) {
                i = this.f84544b;
                int i2 = i + 1;
                this.f84544b = i2;
                if (i2 >= Integer.MAX_VALUE) {
                    this.f84544b = 1000;
                }
            }
        } else {
            throw new apjo("No JobIDs are available");
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized void mo47346b(int i) {
        this.f84543a.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized boolean mo47345a(int i) {
        return this.f84543a.add(Integer.valueOf(i));
    }
}
