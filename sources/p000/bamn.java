package p000;

import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bamn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamn implements banf {

    /* renamed from: a */
    public static final ByteString f101273a = ByteString.f164797b;

    /* renamed from: e */
    private static final AtomicLong f101274e = new AtomicLong(0);

    /* renamed from: b */
    public final cayo f101275b;

    /* renamed from: c */
    public final bxxk f101276c;

    /* renamed from: d */
    public final bamq f101277d;

    /* renamed from: f */
    private final int f101278f;

    /* renamed from: g */
    private final babr f101279g;

    public bamn(cayo cayo, int i, bxxk bxxk, bamq bamq, babr babr) {
        this.f101275b = cayo;
        this.f101278f = i;
        this.f101276c = bxxk;
        this.f101277d = bamq;
        this.f101279g = babr;
    }

    /* renamed from: a */
    static ByteString m87110a(ByteString bxtx) {
        ByteBuffer allocate = ByteBuffer.allocate(bxtx.mo73744a() + 1);
        bxtx.mo73758a(allocate);
        allocate.put((byte) 0);
        allocate.flip();
        return bxtx.m123263b(allocate);
    }

    /* renamed from: b */
    public final bamm mo55764b(banx banx) {
        return mo55761a(banx, Long.MAX_VALUE);
    }

    public final void close() {
        this.f101277d.close();
    }

    /* renamed from: a */
    public final bamm mo55761a(banx banx, long j) {
        bamm bamm;
        ByteString bxtx;
        if (this.f101279g.mo32671C()) {
            baml baml = new baml(this, j);
            this.f101277d.mo55769a(banx, f101273a, baml);
            bngx a = baml.f101265a.mo67664a();
            ByteString bxtx2 = baml.f101266b;
            bamm = new bamm(this, a, bxtx2 != null ? m87110a(bxtx2) : f101273a);
        } else {
            Collection b = this.f101277d.mo55775b(banx, f101273a);
            bngs j2 = bngx.m109377j();
            Iterator it = b.iterator();
            ByteString bxtx3 = null;
            long j3 = j;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                try {
                    bxxc bxxc = (bxxc) this.f101276c.mo73653a((ByteString) pair.second);
                    if (j3 < ((long) bxxc.mo74145db())) {
                        ((achw) this.f101275b.mo16713a()).mo25414c("Size limit(%d) exceeded, stopping adding rest of changes.", Long.valueOf(j));
                        break;
                    }
                    j3 -= (long) bxxc.mo74145db();
                    bxtx3 = (ByteString) pair.first;
                    j2.mo67668c(bxxc);
                } catch (bxwf e) {
                    ((achw) this.f101275b.mo16713a()).mo25418e("Skipping unparsable Change proto:", new Object[0]);
                    bxtx3 = (ByteString) pair.first;
                }
            }
            bngx a2 = j2.mo67664a();
            if (bxtx3 != null) {
                bxtx = m87110a(bxtx3);
            } else {
                bxtx = f101273a;
            }
            bamm = new bamm(this, a2, bxtx);
        }
        return bamm;
    }

    /* renamed from: a */
    public final void mo55762a(bany bany, bxxc bxxc) {
        bmxy.m108581a(bxxc);
        int i = Build.VERSION.SDK_INT;
        this.f101277d.mo55771a(bany, ByteString.m123261a(ByteBuffer.allocate(24).putLong((long) this.f101278f).putLong(SystemClock.elapsedRealtimeNanos()).putLong(f101274e.getAndIncrement()).array()), bxxc.mo73639aL());
    }

    /* renamed from: a */
    public final boolean mo55763a(banx banx) {
        return this.f101277d.mo55773a(banx);
    }
}
