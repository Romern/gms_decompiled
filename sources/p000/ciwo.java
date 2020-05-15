package p000;

import java.util.LinkedList;

/* renamed from: ciwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwo {

    /* renamed from: a */
    public ciwq f191602a;

    /* renamed from: b */
    public LinkedList f191603b;

    /* renamed from: c */
    public boolean f191604c;

    public ciwo() {
        this.f191602a = new ciwq();
        this.f191603b = new LinkedList();
        this.f191604c = true;
    }

    /* renamed from: a */
    public final void mo86608a(ciwq ciwq) {
        this.f191603b.addFirst(this.f191602a);
        this.f191602a = ciwq;
        if (this.f191603b.size() > 40) {
            this.f191603b.removeLast();
        }
    }

    public ciwo(byte[] bArr) {
        this.f191602a = new ciwq();
        this.f191603b = new LinkedList();
        this.f191604c = false;
        ciwv ciwv = (ciwv) bxvk.m124014a(ciwv.f191616d, bArr);
        cixb cixb = ciwv.f191619b;
        this.f191602a = new ciwq(cixb == null ? cixb.f191646m : cixb);
        this.f191604c = false;
        bxwc bxwc = ciwv.f191620c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            this.f191603b.add(new ciwq((cixb) bxwc.get(i)));
        }
    }
}
