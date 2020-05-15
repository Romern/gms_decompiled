package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: bchl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bchl {

    /* renamed from: a */
    private bngx f104165a;

    /* renamed from: a */
    public final bchm mo56887a() {
        String str = this.f104165a == null ? " contactIds" : "";
        if (str.isEmpty()) {
            return new bcgu(this.f104165a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo56888a(List list) {
        this.f104165a = bngx.m109368a((Collection) list);
    }
}
