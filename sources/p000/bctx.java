package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bctx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctx {

    /* renamed from: a */
    private Long f104902a;

    /* renamed from: b */
    private bngx f104903b;

    /* renamed from: a */
    public final bcty mo57554a() {
        String str = this.f104902a == null ? " lastCapabilitiesReportTimeMs" : "";
        if (this.f104903b == null) {
            str = str.concat(" lastReportedCapabilities");
        }
        if (str.isEmpty()) {
            return new bcry(this.f104902a, this.f104903b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57555a(Long l) {
        if (l != null) {
            this.f104902a = l;
            return;
        }
        throw new NullPointerException("Null lastCapabilitiesReportTimeMs");
    }

    /* renamed from: a */
    public final void mo57556a(List list) {
        this.f104903b = bngx.m109368a((Collection) list);
    }
}
