package p000;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: addw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addw {

    /* renamed from: a */
    public final Context f61459a;

    /* renamed from: b */
    public final ScheduledExecutorService f61460b;

    /* renamed from: c */
    private adds f61461c = new adds(this);

    /* renamed from: d */
    private int f61462d = 1;

    public addw(Context context) {
        ScheduledExecutorService a = adzl.f62962b.mo25878a(new stz("MessengerIpcClient"), 2);
        this.f61459a = context.getApplicationContext();
        this.f61460b = a;
    }

    /* renamed from: a */
    public final synchronized int mo33370a() {
        int i;
        i = this.f61462d;
        this.f61462d = i + 1;
        return i;
    }

    /* renamed from: a */
    public final synchronized aucb mo33371a(addu addu) {
        if (!this.f61461c.mo33363a(addu)) {
            adds adds = new adds(this);
            this.f61461c = adds;
            adds.mo33363a(addu);
        }
        return addu.f61456b.f91388a;
    }
}
