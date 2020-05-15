package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aakr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakr {

    /* renamed from: a */
    private final Map f28381a = new C1223np();

    /* renamed from: a */
    public final void mo16943a() {
        mo16948b(2);
    }

    /* renamed from: b */
    public final void mo16947b() {
        mo16948b(3);
    }

    /* renamed from: a */
    public final synchronized void mo16944a(int i) {
        for (Map.Entry entry : this.f28381a.entrySet()) {
            ((Executor) entry.getValue()).execute(new aako((aakq) entry.getKey(), i));
        }
    }

    /* renamed from: b */
    public final synchronized void mo16948b(int i) {
        for (Map.Entry entry : this.f28381a.entrySet()) {
            ((Executor) entry.getValue()).execute(new aakp((aakq) entry.getKey(), i));
        }
    }

    /* renamed from: a */
    public final void mo16945a(aakq aakq, Executor executor) {
        Map map = this.f28381a;
        sdo.m34959a(aakq);
        sdo.m34959a(executor);
        map.put(aakq, executor);
    }

    /* renamed from: a */
    public final synchronized void mo16946a(aamh aamh) {
        for (Map.Entry entry : this.f28381a.entrySet()) {
            ((Executor) entry.getValue()).execute(new aakm((aakq) entry.getKey(), aamh));
        }
    }

    /* renamed from: b */
    public final synchronized void mo16949b(aamh aamh) {
        for (Map.Entry entry : this.f28381a.entrySet()) {
            ((Executor) entry.getValue()).execute(new aakn((aakq) entry.getKey(), aamh));
        }
    }
}
