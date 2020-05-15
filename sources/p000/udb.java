package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udb extends ucg {

    /* renamed from: f */
    private final ubn f47288f;

    public udb(ubk ubk, uto uto, ubn ubn) {
        super("DisconnectOperation", ubk, uto);
        this.f47288f = ubn;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.allOf(twt.class);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        this.f47237a.f47156q.mo28311b();
        this.f47288f.mo27148a(true);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f47237a.f47156q.mo28311b();
        super.mo6503a(status);
    }
}
