package p000;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayxs {

    /* renamed from: a */
    public final bptv f98695a = ayvj.m84936a();

    /* renamed from: b */
    public final List f98696b = new ArrayList();

    /* renamed from: c */
    public final List f98697c;

    /* renamed from: d */
    public final SparseIntArray f98698d;

    /* renamed from: e */
    public final List f98699e;

    /* renamed from: f */
    public final SparseIntArray f98700f;

    /* renamed from: g */
    private final int f98701g;

    public ayxs(int i, int i2) {
        this.f98701g = i;
        this.f98697c = new ArrayList(i2);
        this.f98698d = new SparseIntArray(i2);
        this.f98699e = new ArrayList();
        this.f98700f = new SparseIntArray();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aywu mo54519a(aywp aywp, int i) {
        aywp.f98638c = this.f98701g;
        int size = this.f98697c.size();
        bxvf bxvf = aywp.f98639e;
        bptu bptu = ((aywu) bxvf.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        bxvd bxvd = (bxvd) bptu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bptu);
        bptv bptv = this.f98695a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bptu bptu2 = (bptu) bxvd.f164949b;
        bptv.getClass();
        bptu2.f139184d = bptv;
        int i2 = bptu2.f139181a | 2048;
        bptu2.f139181a = i2;
        bptu2.f139181a = i2 | 1;
        bptu2.f139182b = size;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu = (aywu) bxvf.f164949b;
        bptu bptu3 = (bptu) bxvd.mo74062i();
        aywu aywu2 = aywu.f98650f;
        bptu3.getClass();
        aywu.f98654c = bptu3;
        aywu.f98652a |= 1;
        int d = aywp.mo54487d();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        aywu aywu3 = (aywu) bxvf.f164949b;
        int i3 = d - 1;
        if (d != 0) {
            aywu3.f98655d = i3;
            aywu3.f98652a |= 2;
            aywu a = aywp.mo54483a();
            this.f98697c.add(a);
            this.f98698d.append(size, i);
            return a;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54520a(ayye ayye) {
        boolean z = true;
        if (ayye.f98733b == 1) {
            if (this.f98698d.valueAt(ayye.mo54527c()) != -1) {
                z = false;
            }
            bmxy.m108588a(z);
        }
        this.f98696b.add(ayye);
    }
}
