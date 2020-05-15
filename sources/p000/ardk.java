package p000;

import android.accounts.Account;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ardk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardk {

    /* renamed from: a */
    public boolean f87426a = false;

    /* renamed from: b */
    public boolean f87427b = false;

    /* renamed from: c */
    private final argz f87428c;

    /* renamed from: d */
    private final Runnable f87429d;

    /* renamed from: e */
    private boolean f87430e = false;

    /* renamed from: f */
    private boolean f87431f;

    public ardk(argz argz, List list, Runnable runnable) {
        boolean z;
        sdo.m34959a(argz);
        this.f87428c = argz;
        sdo.m34959a(runnable);
        this.f87429d = runnable;
        sdo.m34959a(list);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BootstrapAccount bootstrapAccount = (BootstrapAccount) list.get(i);
            arrayList.add(new Account(bootstrapAccount.f107799b, bootstrapAccount.f107800c));
        }
        if (cgpa.m146403d()) {
            this.f87428c.mo48531b(arrayList);
            z = false;
        } else {
            z = this.f87428c.mo48529a(arrayList);
        }
        ardn.f87438h.mo25409a("AuthZen re-enrollment forced: %s", Boolean.toString(z));
    }

    /* renamed from: a */
    public final void mo48429a() {
        ardn.f87438h.mo25409a("User confirmed transfer.", new Object[0]);
        this.f87430e = true;
        mo48430b();
    }

    /* renamed from: b */
    public final synchronized void mo48430b() {
        if (!this.f87431f && this.f87430e && this.f87426a && this.f87427b) {
            this.f87431f = true;
            this.f87428c.mo48528a();
            ardn.f87438h.mo25409a("Running success runnable.", new Object[0]);
            this.f87429d.run();
        }
    }
}
