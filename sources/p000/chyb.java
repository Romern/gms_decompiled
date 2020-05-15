package p000;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: chyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chyb extends chwq {

    /* renamed from: a */
    public int f189507a;

    /* renamed from: b */
    private final Queue f189508b = new ArrayDeque();

    /* renamed from: a */
    private final void m149794a(chya chya, int i) {
        mo85770a(i);
        if (!this.f189508b.isEmpty()) {
            m149795c();
        }
        while (i > 0 && !this.f189508b.isEmpty()) {
            cidy cidy = (cidy) this.f189508b.peek();
            int min = Math.min(i, cidy.mo85807a());
            try {
                chya.f189505d = chya.mo85806a(cidy, min);
            } catch (IOException e) {
                chya.f189506e = e;
            }
            if (chya.f189506e == null) {
                i -= min;
                this.f189507a -= min;
                m149795c();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    /* renamed from: c */
    private final void m149795c() {
        if (((cidy) this.f189508b.peek()).mo85807a() == 0) {
            ((cidy) this.f189508b.remove()).close();
        }
    }

    /* renamed from: a */
    public final int mo85807a() {
        return this.f189507a;
    }

    /* renamed from: b */
    public final int mo85810b() {
        chxy chxy = new chxy();
        m149794a(chxy, 1);
        return chxy.f189505d;
    }

    public final void close() {
        while (!this.f189508b.isEmpty()) {
            ((cidy) this.f189508b.remove()).close();
        }
    }

    /* renamed from: b */
    public final chyb mo85812c(int i) {
        mo85770a(i);
        this.f189507a -= i;
        chyb chyb = new chyb();
        while (i > 0) {
            cidy cidy = (cidy) this.f189508b.peek();
            if (cidy.mo85807a() > i) {
                chyb.mo85808a(cidy.mo85812c(i));
                i = 0;
            } else {
                chyb.mo85808a((cidy) this.f189508b.poll());
                i -= cidy.mo85807a();
            }
        }
        return chyb;
    }

    /* renamed from: a */
    public final void mo85808a(cidy cidy) {
        if (!(cidy instanceof chyb)) {
            this.f189508b.add(cidy);
            this.f189507a += cidy.mo85807a();
            return;
        }
        chyb chyb = (chyb) cidy;
        while (!chyb.f189508b.isEmpty()) {
            this.f189508b.add((cidy) chyb.f189508b.remove());
        }
        this.f189507a += chyb.f189507a;
        chyb.f189507a = 0;
        chyb.close();
    }

    /* renamed from: a */
    public final void mo85809a(byte[] bArr, int i, int i2) {
        m149794a(new chxz(i, bArr), i2);
    }
}
