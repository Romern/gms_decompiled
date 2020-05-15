package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgr {

    /* renamed from: a */
    private final Map f3190a = new HashMap();

    /* renamed from: a */
    public final Object mo3119a(String str, boolean z) {
        if (!z) {
            return this.f3190a.get(str);
        }
        return this.f3190a.remove(str);
    }

    /* renamed from: b */
    public final void mo3122b() {
        this.f3190a.size();
        this.f3190a.clear();
    }

    /* renamed from: a */
    public final void mo3120a() {
        this.f3190a.remove("COMMAND_APDU_BYTES");
        this.f3190a.remove("COMMAND_APDU");
        this.f3190a.remove("RESPONSE_APDU");
        this.f3190a.remove("STATUS_WORD");
        this.f3190a.remove("VALIDATION_CONTEXT");
    }

    /* renamed from: a */
    public final void mo3121a(String str, Object obj) {
        if (this.f3190a.get(str) == null) {
            this.f3190a.put(str, obj);
        }
    }
}
