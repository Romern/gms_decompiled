package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* renamed from: mio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mio {

    /* renamed from: a */
    public final lvn f33782a = new lvn("P2PRServiceConnector");

    /* renamed from: b */
    public final Context f33783b;

    /* renamed from: c */
    public final ServiceConnection f33784c;

    /* renamed from: d */
    public final Queue f33785d = new ArrayDeque();

    /* renamed from: e */
    public volatile boolean f33786e;

    /* renamed from: f */
    public volatile bnk f33787f;

    /* renamed from: g */
    private final ExecutorService f33788g;

    public mio(Context context, ExecutorService executorService) {
        bmxy.m108581a(context);
        this.f33783b = context;
        bmxy.m108581a(executorService);
        this.f33788g = executorService;
        this.f33784c = new mim(this);
    }

    /* renamed from: a */
    public final void mo20075a() {
        if (this.f33786e) {
            this.f33782a.mo25412b("#disconnect", new Object[0]);
            this.f33786e = false;
            this.f33783b.unbindService(this.f33784c);
        }
    }

    /* renamed from: b */
    public final void mo20076b() {
        while (!this.f33785d.isEmpty() && mo20077c()) {
            min min = (min) this.f33785d.poll();
            Bundle a = min.mo20064a();
            mhx b = min.mo20065b();
            if (a.getString("request_id").equals("p2pfindcompatiblepackages")) {
                this.f33788g.execute(new mil(this, a, b));
            } else {
                lvn lvn = this.f33782a;
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("Unhandled type");
                sb.append(valueOf);
                lvn.mo25418e(sb.toString(), new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo20077c() {
        return this.f33787f != null && this.f33786e;
    }
}
