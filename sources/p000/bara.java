package p000;

/* renamed from: bara */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bara {

    /* renamed from: a */
    private final Object f101586a = new Object();

    /* renamed from: b */
    private long f101587b;

    /* renamed from: c */
    private long f101588c;

    /* renamed from: d */
    private long f101589d;

    /* renamed from: e */
    private long f101590e;

    /* renamed from: f */
    private long f101591f;

    /* renamed from: g */
    private boolean f101592g;

    /* renamed from: a */
    public final bpyg mo55895a() {
        bpyg bpyg;
        synchronized (this.f101586a) {
            bxvd da = bpyg.f139837g.mo74144da();
            long j = (this.f101588c - this.f101587b) / 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyg bpyg2 = (bpyg) da.f164949b;
            int i = bpyg2.f139839a | 4;
            bpyg2.f139839a = i;
            bpyg2.f139840b = j;
            long j2 = this.f101589d;
            int i2 = i | 8;
            bpyg2.f139839a = i2;
            bpyg2.f139841c = j2;
            long j3 = this.f101590e;
            int i3 = i2 | 64;
            bpyg2.f139839a = i3;
            bpyg2.f139843e = j3;
            long j4 = this.f101591f;
            int i4 = i3 | 16;
            bpyg2.f139839a = i4;
            bpyg2.f139842d = j4;
            boolean z = this.f101592g;
            bpyg2.f139839a = i4 | 128;
            bpyg2.f139844f = z;
            bpyg = (bpyg) da.mo74062i();
        }
        return bpyg;
    }

    /* renamed from: b */
    public final bpyh mo55898b() {
        bpyh bpyh;
        synchronized (this.f101586a) {
            bxvd da = bpyh.f139845f.mo74144da();
            long j = (this.f101588c - this.f101587b) / 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyh bpyh2 = (bpyh) da.f164949b;
            int i = bpyh2.f139847a | 4;
            bpyh2.f139847a = i;
            bpyh2.f139848b = j;
            long j2 = this.f101589d;
            int i2 = i | 8;
            bpyh2.f139847a = i2;
            bpyh2.f139849c = j2;
            long j3 = this.f101590e;
            int i3 = i2 | 64;
            bpyh2.f139847a = i3;
            bpyh2.f139851e = j3;
            long j4 = this.f101591f;
            bpyh2.f139847a = i3 | 16;
            bpyh2.f139850d = j4;
            bpyh = (bpyh) da.mo74062i();
        }
        return bpyh;
    }

    /* renamed from: c */
    public final void mo55900c() {
        synchronized (this.f101586a) {
            this.f101592g = true;
        }
    }

    /* renamed from: c */
    public final void mo55901c(long j) {
        synchronized (this.f101586a) {
            this.f101587b = j;
        }
    }

    /* renamed from: a */
    public final void mo55896a(long j) {
        synchronized (this.f101586a) {
            this.f101588c = j;
        }
    }

    /* renamed from: b */
    public final void mo55899b(long j) {
        synchronized (this.f101586a) {
            this.f101591f = j;
        }
    }

    /* renamed from: a */
    public final void mo55897a(long j, long j2) {
        synchronized (this.f101586a) {
            this.f101589d = j;
            this.f101590e = j2;
        }
    }
}
