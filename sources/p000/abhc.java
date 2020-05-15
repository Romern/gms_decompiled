package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: abhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abhc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ abhd f57469a;

    public abhc(abhd abhd) {
        this.f57469a = abhd;
    }

    public final void run() {
        aasm a;
        abhd abhd = this.f57469a;
        aasf aasf = abhd.f57470a;
        aasf.mo18630k();
        if (!ssk.m36238b(((Context) aasf).getApplicationContext())) {
            for (aasm aasm : abhd.f57473d) {
                if ((TextUtils.isEmpty(aasm.f56492b) || aasm.mo31720e() || aasm.mo31728k()) && !aasm.f56509s && (a = abfn.m47620a(abhd.f57470a, aasm, false, abhd.f57472c)) != null) {
                    if (!a.mo31726i()) {
                        abhd.f57471b.mo31887a(a, abhd.f57470a.mo18626g().f78827b);
                        aasm.f56504n = a.f56504n;
                        abhd.f57471b.mo31891b(aasm, abhd.f57470a.mo18626g().f78827b);
                    }
                    aasm.f56509s = true;
                }
            }
        }
    }
}
