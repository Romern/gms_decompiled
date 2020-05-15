package p000;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.Collection;

/* renamed from: edp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class edp implements Iterable {

    /* renamed from: a */
    public boolean f14745a;

    /* renamed from: b */
    private boolean f14746b = false;

    /* renamed from: c */
    private long f14747c = 0;

    public edp(boolean z) {
        this.f14745a = z;
    }

    /* renamed from: a */
    public abstract Collection mo10006a();

    /* renamed from: a */
    public abstract void mo10007a(ContextDataFilterImpl contextDataFilterImpl, boolean z);

    /* renamed from: a */
    public void mo10008a(edr edr) {
        if (this.f14745a) {
            this.f14746b = true;
        }
        int a = edr.f14749a.mo18022j().mo26615a();
        if (a == 1 || a == 2) {
            this.f14747c = Math.max(this.f14747c, edr.f14749a.mo18022j().mo18096c());
        } else if (a == 3) {
            this.f14747c = Math.max(this.f14747c, edr.f14749a.mo18022j().mo18097d());
        }
    }

    /* renamed from: b */
    public boolean mo10011b(boolean z) {
        return false;
    }

    /* renamed from: a */
    public final void mo10009a(boolean z) {
        this.f14745a = z;
        if (!z && this.f14746b) {
            this.f14746b = false;
            this.f14747c = Math.max(this.f14747c, dwq.m9665i().mo20505a());
        }
    }

    /* renamed from: a */
    public boolean mo10010a(long j) {
        Object[] objArr = {Boolean.valueOf(this.f14745a), Boolean.valueOf(this.f14746b)};
        Object[] objArr2 = {Long.valueOf(this.f14747c), Long.valueOf(j)};
        return (this.f14745a && this.f14746b) || dwq.m9665i().mo20505a() - this.f14747c <= j;
    }
}
