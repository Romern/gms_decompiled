package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahqy {

    /* renamed from: a */
    public final ahnq f67847a;

    /* renamed from: b */
    public final boolean f67848b;

    /* renamed from: c */
    public final AtomicBoolean f67849c = new AtomicBoolean(false);

    /* renamed from: d */
    private final Map f67850d = new C1223np();

    public ahqy(ahnq ahnq, List list, boolean z) {
        this.f67847a = ahnq;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            this.f67850d.put(str, new ahqx(str));
        }
        this.f67848b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo36978a() {
        return this.f67847a.mo36897a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo36983b() {
        return this.f67849c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized List mo36984c() {
        return bngx.m109368a(this.f67850d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36985d() {
        this.f67847a.mo36901c();
    }

    public final String toString() {
        return this.f67847a.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized ahqx mo36979a(String str) {
        return (ahqx) this.f67850d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36980a(String str, long j) {
        ahqx ahqx = (ahqx) this.f67850d.get(str);
        if (ahqx != null) {
            ahqx.f67846c = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36981a(String str, buun buun) {
        ahqw ahqw;
        ahqx ahqx = (ahqx) this.f67850d.get(str);
        if (ahqx != null) {
            buum a = buum.m120464a(buun.f154964b);
            if (a == null) {
                a = buum.UNKNOWN_EVENT_TYPE;
            }
            ahqw ahqw2 = ahqw.UNKNOWN;
            buup buup = buup.UNKNOWN_PACKET_TYPE;
            bvih bvih = bvih.UNKNOWN_PAYLOAD_STATUS;
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                ahqw = ahqw.ERROR;
            } else if (ordinal != 2) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Unknown EndpointInfo.Status for ControlMessage.EventType %s!", a);
                ahqw = ahqw.UNKNOWN;
            } else {
                ahqw = ahqw.CANCELED;
            }
            ahqx.f67845b = ahqw;
            srn srn = ahkm.f67363a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo36982a(List list) {
        this.f67850d.keySet().removeAll(list);
    }
}
