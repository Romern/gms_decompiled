package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: blbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbl {

    /* renamed from: a */
    long f125832a = 0;

    /* renamed from: b */
    private final blbi f125833b = new blbi();

    /* renamed from: c */
    private final int f125834c;

    /* renamed from: d */
    private final blbo f125835d;

    public blbl(blbo blbo) {
        this.f125835d = blbo;
        this.f125834c = blbo.mo66458a();
    }

    /* renamed from: a */
    public final blbn mo66452a() {
        blbh blbh;
        Integer num;
        int i = (int) (this.f125832a % ((long) this.f125834c));
        if (i > 0) {
            num = Integer.valueOf(this.f125835d.mo66459a(i));
            blbh = new blbh(this.f125832a - ((long) i), this.f125835d.mo66461b(i));
        } else {
            num = null;
            blbh = null;
        }
        return new blbn(this.f125833b, this.f125834c, i, num, blbh);
    }

    /* renamed from: a */
    public final void mo66453a(byte b) {
        this.f125835d.mo66460a(b);
        long j = this.f125832a + 1;
        this.f125832a = j;
        if (j % ((long) this.f125835d.mo66458a()) == 0) {
            int d = this.f125835d.mo66464d();
            blbh blbh = new blbh(this.f125832a - ((long) this.f125834c), this.f125835d.mo66465e());
            blbi blbi = this.f125833b;
            Integer valueOf = Integer.valueOf(d);
            List<blbh> list = (List) blbi.f125827b.mo15646f(valueOf.intValue());
            if (list == null) {
                list = new ArrayList();
                blbi.f125827b.mo15637a(valueOf.intValue(), list);
            }
            if (!list.isEmpty()) {
                for (blbh blbh2 : list) {
                    if (blbh2.f125825b.equals(blbh.f125825b)) {
                        return;
                    }
                }
            }
            blbi.f125826a++;
            list.add(blbh);
        }
    }

    /* renamed from: a */
    public final void mo66454a(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            mo66453a(bArr[i3]);
        }
    }
}
