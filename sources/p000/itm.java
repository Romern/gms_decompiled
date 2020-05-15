package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: itm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itm {

    /* renamed from: c */
    private static final sek f21692c = new sek(new String[]{"TrustAgentHelper"}, (byte[]) null);

    /* renamed from: a */
    rjx f21693a;

    /* renamed from: b */
    private final Context f21694b;

    public itm(Context context) {
        this.f21694b = context;
    }

    /* renamed from: a */
    public final itl mo13339a() {
        if (this.f21693a == null) {
            this.f21693a = aula.m77249a(this.f21694b);
        }
        if (!rjx.m33698c(this.f21694b)) {
            return new itl(false, false);
        }
        try {
            return new itl(true, ((aups) aucu.m76783a(this.f21693a.mo24669A(), 10, TimeUnit.SECONDS)).f92289b);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f21692c.mo25417e("Exception fetching truststate", e, new Object[0]);
            return new itl(true, false);
        }
    }
}
