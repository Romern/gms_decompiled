package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: cawb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawb extends cavc implements cavm {

    /* renamed from: b */
    final cavn f176193b;

    /* renamed from: c */
    final /* synthetic */ cawc f176194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cawb(cawc cawc, cavn cavn) {
        super("OkHttp %s", cawc.f176199e);
        this.f176194c = cawc;
        this.f176193b = cavn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74949a() {
        cavl cavl = cavl.INTERNAL_ERROR;
        cavl cavl2 = cavl.INTERNAL_ERROR;
        try {
            if (!this.f176194c.f176197c) {
                this.f176193b.mo74971a();
            }
            do {
            } while (this.f176193b.mo74972a(this));
            cavl = cavl.NO_ERROR;
            try {
                try {
                    this.f176194c.mo74989a(cavl, cavl.CANCEL);
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                try {
                    cavl = cavl.PROTOCOL_ERROR;
                    try {
                        this.f176194c.mo74989a(cavl, cavl.PROTOCOL_ERROR);
                    } catch (IOException e3) {
                    }
                    cavk.m127310a(this.f176193b);
                } catch (Throwable th) {
                    th = th;
                    try {
                        this.f176194c.mo74989a(cavl, cavl2);
                    } catch (IOException e4) {
                    }
                    cavk.m127310a(this.f176193b);
                    throw th;
                }
            }
        } catch (IOException e5) {
            cavl = cavl.PROTOCOL_ERROR;
            this.f176194c.mo74989a(cavl, cavl.PROTOCOL_ERROR);
            cavk.m127310a(this.f176193b);
        } catch (Throwable th2) {
            th = th2;
            this.f176194c.mo74989a(cavl, cavl2);
            cavk.m127310a(this.f176193b);
            throw th;
        }
        cavk.m127310a(this.f176193b);
    }

    /* renamed from: a */
    public final void mo74964a(int i, long j) {
        if (i != 0) {
            cawg a = this.f176194c.mo74985a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo75001a(j);
                }
                return;
            }
            return;
        }
        synchronized (this.f176194c) {
            cawc cawc = this.f176194c;
            cawc.f176205k += j;
            cawc.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo74965a(int i, cavl cavl) {
        if (!this.f176194c.mo74993c(i)) {
            cawg b = this.f176194c.mo74990b(i);
            if (b != null) {
                b.mo75007c(cavl);
                return;
            }
            return;
        }
        cawc cawc = this.f176194c;
        cawc.f176203i.execute(new cavv(cawc, "OkHttp %s Push Reset[%s]", new Object[]{cawc.f176199e, Integer.valueOf(i)}, i));
    }

    /* renamed from: a */
    public final void mo74966a(int i, cipx cipx) {
        cawg[] cawgArr;
        cipx.mo86345e();
        synchronized (this.f176194c) {
            cawgArr = (cawg[]) this.f176194c.f176198d.values().toArray(new cawg[this.f176194c.f176198d.size()]);
            this.f176194c.f176202h = true;
        }
        for (cawg cawg : cawgArr) {
            if (cawg.f176228c > i && cawg.mo75005b()) {
                cawg.mo75007c(cavl.REFUSED_STREAM);
                this.f176194c.mo74990b(cawg.f176228c);
            }
        }
    }

    /* renamed from: a */
    public final void mo74967a(boolean z, int i, int i2) {
        if (!z) {
            cawc cawc = this.f176194c;
            cawc.f176195a.execute(new cavr(cawc, "OkHttp %s ping %08x%08x", new Object[]{cawc.f176199e, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r11 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r0.mo75009e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo74968a(boolean z, int i, cipw cipw, int i2) {
        boolean z2;
        long j;
        long j2;
        if (!this.f176194c.mo74993c(i)) {
            cawg a = this.f176194c.mo74985a(i);
            if (a != null) {
                cawe cawe = a.f176231f;
                long j3 = (long) i2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    synchronized (cawe.f176224f) {
                        z2 = cawe.f176223e;
                        j = cawe.f176220b.f191213b + j3;
                        j2 = cawe.f176221c;
                    }
                    if (j <= j2) {
                        if (z2) {
                            cipw.mo86317h(j3);
                            break;
                        }
                        long c = cipw.mo74995c(cawe.f176219a, j3);
                        if (c != -1) {
                            j3 -= c;
                            synchronized (cawe.f176224f) {
                                cipu cipu = cawe.f176220b;
                                long j4 = cipu.f191213b;
                                cipu.mo86286a(cawe.f176219a);
                                if (j4 == 0) {
                                    cawe.f176224f.notifyAll();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        cipw.mo86317h(j3);
                        cawe.f176224f.mo75004b(cavl.FLOW_CONTROL_ERROR);
                        break;
                    }
                }
                while (true) {
                }
            }
            this.f176194c.mo74987a(i, cavl.INVALID_STREAM);
            cipw.mo86317h((long) i2);
            return;
        }
        cawc cawc = this.f176194c;
        cipu cipu2 = new cipu();
        long j5 = (long) i2;
        cipw.mo86285a(j5);
        cipw.mo74995c(cipu2, j5);
        long j6 = cipu2.f191213b;
        if (j6 == j5) {
            cawc.f176203i.execute(new cavu(cawc, "OkHttp %s Push Data[%s]", new Object[]{cawc.f176199e, Integer.valueOf(i)}, i, cipu2, i2));
            return;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append(j6);
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final void mo74969a(boolean z, cawx cawx) {
        int i;
        cawg[] cawgArr;
        long j;
        synchronized (this.f176194c) {
            int c = this.f176194c.f176207m.mo75036c();
            if (z) {
                cawx cawx2 = this.f176194c.f176207m;
                cawx2.f176292c = 0;
                cawx2.f176291b = 0;
                cawx2.f176290a = 0;
                Arrays.fill(cawx2.f176293d, 0);
            }
            cawx cawx3 = this.f176194c.f176207m;
            for (int i2 = 0; i2 < 10; i2++) {
                if (cawx.mo75033a(i2)) {
                    cawx3.mo75032a(i2, cawx.mo75037c(i2), cawx.mo75035b(i2));
                }
            }
            if (this.f176194c.f176196b == caui.HTTP_2) {
                cawc.f176195a.execute(new cawa(this, "OkHttp %s ACK Settings", new Object[]{this.f176194c.f176199e}, cawx));
            }
            int c2 = this.f176194c.f176207m.mo75036c();
            cawgArr = null;
            if (c2 == -1) {
                j = 0;
            } else if (c2 != c) {
                j = (long) (c2 - c);
                cawc cawc = this.f176194c;
                if (!cawc.f176208n) {
                    cawc.f176205k += j;
                    if (j > 0) {
                        cawc.notifyAll();
                    }
                    this.f176194c.f176208n = true;
                }
                if (!this.f176194c.f176198d.isEmpty()) {
                    cawgArr = (cawg[]) this.f176194c.f176198d.values().toArray(new cawg[this.f176194c.f176198d.size()]);
                }
            } else {
                j = 0;
            }
            cawc.f176195a.execute(new cavz("OkHttp %s settings", this.f176194c.f176199e));
        }
        if (cawgArr != null && j != 0) {
            for (cawg cawg : cawgArr) {
                synchronized (cawg) {
                    cawg.mo75001a(j);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r11 == 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r4.f176230e != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r11 == 3) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r4.f176230e = r10;
        r3 = r4.mo75003a();
        r4.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r9 = p000.cavl.PROTOCOL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r11 == 2) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r7 = new java.util.ArrayList();
        r7.addAll(r4.f176230e);
        r7.addAll(r10);
        r4.f176230e = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r9 = p000.cavl.STREAM_IN_USE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r9 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r4.mo75004b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r3 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r4.f176229d.mo74990b(r4.f176228c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r4.mo75009e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r4.mo75004b(p000.cavl.PROTOCOL_ERROR);
        r6.f176194c.mo74990b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo74970a(boolean z, boolean z2, int i, List list, int i2) {
        boolean z3 = true;
        if (this.f176194c.mo74993c(i)) {
            cawc cawc = this.f176194c;
            cawc.f176203i.execute(new cavt(cawc, "OkHttp %s Push Headers[%s]", new Object[]{cawc.f176199e, Integer.valueOf(i)}, i));
            return;
        }
        synchronized (this.f176194c) {
            cawc cawc2 = this.f176194c;
            if (!cawc2.f176202h) {
                cawg a = cawc2.mo74985a(i);
                if (a == null) {
                    if (i2 == 2 || i2 == 3) {
                        this.f176194c.mo74987a(i, cavl.INVALID_STREAM);
                        return;
                    }
                    cawc cawc3 = this.f176194c;
                    if (i <= cawc3.f176200f) {
                        return;
                    }
                    if ((i & 1) != cawc3.f176201g % 2) {
                        cawg cawg = new cawg(i, cawc3, z, z2);
                        cawc cawc4 = this.f176194c;
                        cawc4.f176200f = i;
                        Map map = cawc4.f176198d;
                        Integer valueOf = Integer.valueOf(i);
                        map.put(valueOf, cawg);
                        cawc.f176195a.execute(new cavy(this, "OkHttp %s stream %d", new Object[]{this.f176194c.f176199e, valueOf}, cawg));
                    }
                }
            }
        }
    }
}
