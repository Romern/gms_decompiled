package p000;

import java.util.Set;

/* renamed from: belp */
final /* synthetic */ class belp implements Runnable {

    /* renamed from: a */
    private final bels f111781a;

    /* renamed from: b */
    private final int f111782b;

    /* renamed from: c */
    private final Set f111783c;

    /* renamed from: d */
    private final int f111784d;

    /* renamed from: e */
    private final int f111785e;

    /* renamed from: f */
    private final int f111786f;

    public belp(bels bels, int i, Set set, int i2, int i3, int i4) {
        this.f111781a = bels;
        this.f111782b = i;
        this.f111783c = set;
        this.f111784d = i2;
        this.f111785e = i3;
        this.f111786f = i4;
    }

    public final void run() {
        bels bels = this.f111781a;
        int i = this.f111782b;
        Set set = this.f111783c;
        int i2 = this.f111784d;
        int i3 = this.f111785e;
        int i4 = this.f111786f;
        bxvd da = bpyn.f139894f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyn bpyn = (bpyn) da.f164949b;
        bpyn.f139896a |= 1;
        bpyn.f139897b = i;
        if (!bpyn.f139898c.mo73666a()) {
            bpyn.f139898c = GeneratedMessageLite.m124021a(bpyn.f139898c);
        }
        bxsy.m123078a(set, bpyn.f139898c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpyn bpyn2 = (bpyn) da.f164949b;
        int i5 = bpyn2.f139896a | 2;
        bpyn2.f139896a = i5;
        bpyn2.f139899d = i2;
        bpyn2.f139896a = i5 | 4;
        bpyn2.f139900e = i3;
        bpyn bpyn3 = (bpyn) da.mo74062i();
        bxvd da2 = bpyq.f139912g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpyq bpyq = (bpyq) da2.f164949b;
        bpyn3.getClass();
        bpyq.f139919f = bpyn3;
        bpyq.f139914a |= 16;
        bels.mo60785a((bpyq) da2.mo74062i(), i4);
    }
}
