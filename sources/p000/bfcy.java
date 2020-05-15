package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bfcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcy implements bhba {

    /* renamed from: a */
    public final bfcw f113449a;

    /* renamed from: b */
    public final bgmk f113450b;

    /* renamed from: c */
    public final bfnl f113451c;

    /* renamed from: d */
    private final bfcz f113452d;

    public bfcy(bgmk bgmk, bgmm bgmm, bgml bgml) {
        File file;
        if (bgmm.mo62779a() != null) {
            file = new File(bgmm.mo62779a(), "nlp_devices");
        } else {
            file = null;
        }
        this.f113450b = bgmk;
        this.f113451c = new bfnl(2, bgml.mo63005a(), 3, bgml.mo63006b(), bgox.f117080bT, file, bfcv.f113443a);
        this.f113452d = new bfcz();
        this.f113449a = new bfcw(this.f113452d);
    }

    /* renamed from: a */
    public final bfcx mo61432a(long j, long j2) {
        bfcx a = this.f113449a.mo61429a(j);
        if (a == null) {
            a = new bfcx(j);
            this.f113449a.mo61430a(a);
            this.f113452d.mo61439c();
        }
        a.f113447b = bfcx.m96402a(j2);
        return a;
    }

    /* renamed from: b */
    public final void mo61433b() {
        long c = this.f113450b.mo62776c() - 604800000;
        Iterator c2 = mo61434c();
        while (c2.hasNext()) {
            bfcx bfcx = (bfcx) c2.next();
            short s = bfcx.f113447b;
            if (s == Short.MAX_VALUE) {
                c2.remove();
            } else if (((long) s) * 86400000 < c) {
                c2.remove();
                this.f113452d.mo61438b();
                Locale locale = Locale.US;
                new Object[1][0] = Long.valueOf(bfcx.f113446a);
            }
        }
    }

    /* renamed from: c */
    public final Iterator mo61434c() {
        return this.f113449a.f113444a.values().iterator();
    }

    /* renamed from: a */
    public final void mo61420a() {
        this.f113452d.mo61440d();
    }

    /* renamed from: a */
    public final void mo61425a(bsax bsax, long j) {
        bsax.mo70118b(11, this.f113452d.mo61435a(1000, this.f113449a.mo61428a()));
    }

    /* renamed from: a */
    public final void mo61426a(bxvd bxvd, long j) {
        bums b = this.f113452d.mo61437b(1000, this.f113449a.mo61428a());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        buna buna = (buna) bxvd.f164949b;
        buna buna2 = buna.f154289i;
        b.getClass();
        buna.f154294d = b;
        buna.f154291a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }
}
