package p000;

import java.util.List;

/* renamed from: cify */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cify extends ciaj {

    /* renamed from: v */
    public static final /* synthetic */ int f190054v = 0;

    /* renamed from: a */
    public final Object f190055a;

    /* renamed from: b */
    public List f190056b;

    /* renamed from: c */
    public final cipu f190057c = new cipu();

    /* renamed from: d */
    public boolean f190058d = false;

    /* renamed from: e */
    public boolean f190059e = false;

    /* renamed from: f */
    public boolean f190060f = false;

    /* renamed from: g */
    public final cifq f190061g;

    /* renamed from: h */
    public final cigt f190062h;

    /* renamed from: i */
    public final cigh f190063i;

    /* renamed from: t */
    public boolean f190064t = true;

    /* renamed from: u */
    final /* synthetic */ cifz f190065u;

    /* renamed from: w */
    private final int f190066w;

    /* renamed from: x */
    private int f190067x;

    /* renamed from: y */
    private int f190068y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cify(cifz cifz, int i, ciez ciez, Object obj, cifq cifq, cigt cigt, cigh cigh, int i2) {
        super(i, ciez, cifz.f189385r);
        this.f190065u = cifz;
        bmxy.m108582a(obj, "lock");
        this.f190055a = obj;
        this.f190061g = cifq;
        this.f190062h = cigt;
        this.f190063i = cigh;
        this.f190067x = i2;
        this.f190068y = i2;
        this.f190066w = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85731a() {
        super.mo85731a();
        cifh cifh = this.f189416l;
        cifh.f190001c++;
        cifh.f190000b.mo86026a();
    }

    /* renamed from: c */
    public final void mo86049c(chuv chuv, boolean z, chtr chtr) {
        if (!this.f190060f) {
            this.f190060f = true;
            if (this.f190064t) {
                cigh cigh = this.f190063i;
                cifz cifz = this.f190065u;
                cigh.f190127v.remove(cifz);
                cigh.mo86061b(cifz);
                this.f190056b = null;
                this.f190057c.mo86328n();
                this.f190064t = false;
                if (chtr == null) {
                    chtr = new chtr();
                }
                mo85777b(chuv, true, chtr);
                return;
            }
            this.f190063i.mo86055a(this.f190065u.f190075g, chuv, chxt.PROCESSED, z, cihm.CANCEL, chtr);
        }
    }

    /* renamed from: a */
    public final void mo85732a(int i) {
        int i2 = this.f190068y - i;
        this.f190068y = i2;
        int i3 = this.f190066w;
        if (((float) i2) <= ((float) i3) * 0.5f) {
            int i4 = i3 - i2;
            this.f190067x += i4;
            this.f190068y = i2 + i4;
            this.f190061g.mo86033a(this.f190065u.f190075g, (long) i4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85733a(chuv chuv, boolean z, chtr chtr) {
        mo86049c(chuv, false, chtr);
    }

    /* renamed from: a */
    public final void mo86048a(cipu cipu, boolean z) {
        int i = this.f190067x - ((int) cipu.f191213b);
        this.f190067x = i;
        if (i < 0) {
            this.f190061g.mo86034a(this.f190065u.f190075g, cihm.FLOW_CONTROL_ERROR);
            this.f190063i.mo86055a(this.f190065u.f190075g, chuv.f189228o.mo85687a("Received data size exceeded our receiving window size"), chxt.PROCESSED, false, null, null);
            return;
        }
        super.mo85867a(new cign(cipu), z);
    }

    /* renamed from: a */
    public final void mo85734a(Throwable th) {
        mo86049c(chuv.m149608a(th), true, new chtr());
    }

    /* renamed from: a */
    public final void mo85775a(boolean z) {
        if (!this.f189422r) {
            this.f190063i.mo86055a(this.f190065u.f190075g, null, chxt.PROCESSED, false, cihm.CANCEL, null);
        } else {
            this.f190063i.mo86055a(this.f190065u.f190075g, null, chxt.PROCESSED, false, null, null);
        }
        super.mo85775a(z);
    }
}
