package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.events.TransferStateEvent;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: uov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uov implements uqr {

    /* renamed from: a */
    public final ums f48438a;

    /* renamed from: b */
    public volatile boolean f48439b = false;

    /* renamed from: c */
    private final Set f48440c;

    /* renamed from: d */
    private final uqt f48441d;

    public uov(ums ums, uqt uqt) {
        sdo.m34959a(ums);
        this.f48438a = ums;
        sdo.m34959a(uqt);
        this.f48441d = uqt;
        JSONObject jSONObject = new JSONObject(ums.f48256e);
        uqq.m39260a(jSONObject);
        this.f48440c = uqq.m39262b(jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27793a() {
        this.f48439b = true;
    }

    /* renamed from: b */
    public final ums mo27791b() {
        return this.f48438a;
    }

    /* renamed from: c */
    public final long mo27796c() {
        return this.f48438a.f48253b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27794a(List list) {
        TransferStateEvent transferStateEvent = new TransferStateEvent(list);
        uqt uqt = this.f48441d;
        try {
            uqt.f48559b.f48562c.mo27884a(uqt.f48558a, transferStateEvent);
            uqu.f48560a.mo25369a("Raised transfer state event to subscription: %s", transferStateEvent);
        } catch (Exception e) {
            uqu.f48560a.mo25378c("SubscriptionStore", String.format("Error delivering transfer state event to subscription: %s", uqt.f48558a), e);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo27795a(ujx ujx) {
        return !Collections.disjoint(this.f48440c, ujx.mo27574aj());
    }
}
