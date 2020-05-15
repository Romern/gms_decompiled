package p000;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: aarc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarc {

    /* renamed from: a */
    private List f28972a = bngx.m109376e();

    /* renamed from: b */
    private final aarb f28973b;

    public aarc(Context context) {
        this.f28973b = new aarb(context);
    }

    /* renamed from: a */
    public final synchronized List mo17203a() {
        return cecz.f182285a.mo6606a().mo78819ak() ? this.f28973b.mo17202a() : this.f28972a;
    }

    /* renamed from: b */
    public final synchronized void mo17205b() {
        this.f28972a = bngx.m109376e();
    }

    /* renamed from: a */
    public final synchronized void mo17204a(List list) {
        this.f28972a = bngx.m109368a((Collection) list);
    }
}
