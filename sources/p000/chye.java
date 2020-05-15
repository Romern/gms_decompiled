package p000;

import java.util.ArrayList;

/* renamed from: chye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chye {

    /* renamed from: a */
    private ArrayList f189509a = new ArrayList();

    /* renamed from: b */
    private volatile chrg f189510b = chrg.IDLE;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85813a(chrg chrg) {
        bmxy.m108582a(chrg, "newState");
        if (this.f189510b != chrg && this.f189510b != chrg.SHUTDOWN) {
            this.f189510b = chrg;
            if (!this.f189509a.isEmpty()) {
                ArrayList arrayList = this.f189509a;
                this.f189509a = new ArrayList();
                if (arrayList.size() > 0) {
                    chyd chyd = (chyd) arrayList.get(0);
                    throw null;
                }
            }
        }
    }
}
