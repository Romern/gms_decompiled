package p000;

import android.os.Handler;
import java.util.Map;
import java.util.UUID;

/* renamed from: syn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syn extends tdl {

    /* renamed from: a */
    final UUID f45450a;

    /* renamed from: b */
    final tds f45451b;

    /* renamed from: c */
    final Logger f45452c;

    /* renamed from: d */
    final boolean f45453d;

    /* renamed from: f */
    private final int f45454f;

    public syn(tds tds, Logger Logger, UUID uuid, int i, Handler handler, boolean z) {
        super(handler);
        this.f45451b = tds;
        this.f45452c = Logger;
        this.f45454f = i;
        this.f45450a = uuid;
        this.f45453d = z;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        this.f45451b.mo26404a(this.f45450a, bqjr.m112931b(this.f45454f), tdw);
        this.f45452c.mo25417e("Couldn't sync with the server due to ", tdw, new Object[0]);
        if (this.f45453d) {
            syo.m36598a();
        }
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        this.f45451b.mo26405a(this.f45450a, bqjr.m112931b(this.f45454f), z);
        this.f45452c.mo25414c("Successfully completed sync", new Object[0]);
        if (this.f45453d) {
            syo.m36598a();
        }
    }
}
