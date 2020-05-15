package p000;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: atxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxv {

    /* renamed from: b */
    private static atxv f91097b;

    /* renamed from: a */
    private final bnhe f91098a;

    private atxv() {
        bnha bnha = new bnha();
        atxt[] values = atxt.values();
        for (atxt atxt : values) {
            bnha.mo67695b(atxt, new atxs(atxt.f91092b));
        }
        this.f91098a = bnha.mo67618b();
    }

    /* renamed from: a */
    private final atxs m76522a(atxt atxt) {
        atxs atxs = (atxs) this.f91098a.get(atxt);
        sdo.m34959a(atxs);
        return atxs;
    }

    /* renamed from: a */
    public static synchronized atxv m76523a() {
        atxv atxv;
        synchronized (atxv.class) {
            if (f91097b == null) {
                f91097b = new atxv();
            }
            atxv = f91097b;
        }
        return atxv;
    }

    /* renamed from: a */
    public final synchronized String mo50308a(atxt atxt, long j, TimeUnit timeUnit) {
        int i = spn.f44932a;
        atxs a = m76522a(atxt);
        a.mo50307a();
        if (a.f91088a.tryAcquire(1, j, timeUnit)) {
            String uuid = UUID.randomUUID().toString();
            long currentTimeMillis = System.currentTimeMillis();
            atxt atxt2 = atxt.FELICA;
            a.f91089b.put(uuid, new atxu(currentTimeMillis + atxt.f91094d.toMillis(atxt.f91093c)));
            return uuid;
        }
        a.mo50307a();
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo50309a(atxt atxt, String str) {
        int i = spn.f44932a;
        atxs a = m76522a(atxt);
        if (((atxu) a.f91089b.remove(str)) != null) {
            a.f91088a.release();
        }
    }
}
