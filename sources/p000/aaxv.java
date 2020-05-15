package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aaxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxv implements Runnable {

    /* renamed from: a */
    private final abdx f56794a;

    /* renamed from: b */
    private final aarp f56795b;

    /* renamed from: c */
    private final Context f56796c;

    /* renamed from: d */
    private final HelpConfig f56797d;

    /* renamed from: e */
    private final bqgj f56798e;

    /* renamed from: f */
    private final abcr f56799f;

    public aaxv(abdx abdx, aarp aarp, Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        this.f56794a = abdx;
        this.f56795b = aarp;
        this.f56796c = context;
        this.f56797d = helpConfig;
        this.f56798e = bqgj;
        this.f56799f = abcr;
    }

    public final void run() {
        if (ssk.m36235a(this.f56796c) && aaxu.m47193a(this.f56794a, this.f56795b, this.f56796c, this.f56797d, this.f56798e, this.f56799f) == null) {
            String a = aawg.m47095a(this.f56797d, this.f56795b);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 77);
            sb.append("Got null response when trying to send typing status update for conversation ");
            sb.append(a);
            sb.append(".");
            Log.w("gH_UpdateTypStatRun", sb.toString());
        }
    }
}
