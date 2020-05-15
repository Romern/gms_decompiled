package p000;

import android.content.Intent;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: tox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tox {

    /* renamed from: a */
    public final qqa f46425a;

    /* renamed from: b */
    public final Intent f46426b;

    public tox(qqa qqa, String str) {
        this.f46425a = qqa;
        this.f46426b = new Intent().putExtra("component_name", "MultipassPasswordManager").setPackage(str);
    }

    /* renamed from: a */
    public final aucb mo26694a() {
        return mo26697a(new toq(this));
    }

    /* renamed from: b */
    public final aucb mo26698b(bxxc bxxc) {
        return mo26697a(new tou(this, bxxc));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, bngm], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final aucb mo26695a(bngm r5) {
        bngs j = bngx.m109377j();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            j.mo67668c(mo26698b((bxxc) r5.get(i)));
        }
        return aucu.m76779a((Collection) j.mo67664a());
    }

    /* renamed from: a */
    public final aucb mo26696a(bxxc bxxc) {
        return mo26697a(new tot(this, bxxc));
    }

    /* renamed from: a */
    public final aucb mo26697a(Callable callable) {
        try {
            return ((aucb) callable.call()).mo50382b(new tov(this, callable));
        } catch (Exception e) {
            return aucu.m76777a(e);
        }
    }
}
