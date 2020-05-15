package p000;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: bluk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bluk {

    /* renamed from: a */
    final /* synthetic */ blul f127814a;

    /* renamed from: b */
    private final Queue f127815b = new LinkedList();

    /* renamed from: c */
    private final Queue f127816c = new LinkedList();

    /* renamed from: d */
    private blva f127817d;

    public bluk(blul blul) {
        this.f127814a = blul;
    }

    /* renamed from: a */
    public final synchronized bluv mo66693a(bluq bluq) {
        bluz bluz;
        bluz = new bluz(bluq);
        this.f127815b.add(bluz);
        mo66695a();
        return bluz.f127838a;
    }

    /* renamed from: b */
    public final void mo66697b() {
        blva blva = (blva) this.f127816c.peek();
        if (blva != null && blva.mo66735a()) {
            blva.mo66737c();
        }
    }

    /* renamed from: a */
    public final synchronized bluv mo66694a(byte[] bArr) {
        bluy bluy;
        bluy = new bluy(bArr);
        this.f127816c.add(bluy);
        mo66695a();
        return bluy.f127836a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo66695a() {
        if (this.f127817d == null) {
            blva blva = (blva) this.f127815b.peek();
            if (blva != null || !this.f127814a.f127821d) {
                mo66697b();
            } else {
                blva = (blva) this.f127816c.peek();
            }
            if (blva != null) {
                if (!blva.mo66736b()) {
                    this.f127817d = blva;
                    bluq a = blva.mo66734a(this.f127814a.f127822e);
                    int a2 = this.f127814a.f127820c.mo66720a();
                    if (a2 < 0 || a2 > 7) {
                        throw new IllegalArgumentException("packet counter must be between 0 and 7");
                    }
                    byte[] bArr = a.f127827a;
                    bArr[0] = (byte) (((a2 << 4) & 112) | bArr[0]);
                    this.f127814a.f127818a.mo66714b(bArr);
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo66696a(bluu bluu) {
        blva blva = this.f127817d;
        if (blva != null) {
            if (blva.mo66736b()) {
                bluv d = this.f127817d.mo66738d();
                if (d.f127834b == null) {
                    d.f127834b = bluu;
                    d.f127833a.countDown();
                    d.mo66726a();
                    if (this.f127817d == this.f127815b.peek()) {
                        this.f127815b.poll();
                    } else if (this.f127817d == this.f127816c.peek()) {
                        this.f127816c.poll();
                    }
                } else {
                    throw new IllegalStateException("setResult() called twice");
                }
            }
            this.f127817d = null;
            mo66695a();
        } else {
            throw new IllegalStateException("result received but no current write");
        }
    }
}
