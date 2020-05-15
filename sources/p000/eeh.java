package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.List;

/* renamed from: eeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eeh implements egg {

    /* renamed from: a */
    private final List f14773a;

    /* renamed from: b */
    private final ContextManagerClientInfo f14774b;

    public eeh(List list, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14773a = list;
        this.f14774b = contextManagerClientInfo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9567a(Object obj) {
        eei eei = (eei) obj;
        for (ContextData contextData : this.f14773a) {
            eei.mo9388a(contextData, this.f14774b);
        }
    }
}
