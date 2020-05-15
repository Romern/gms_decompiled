package p000;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: bepv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepv extends abh {

    /* renamed from: a */
    public final List f112016a = new ArrayList();

    /* renamed from: d */
    public int[] f112017d = {0};

    /* renamed from: e */
    private final SparseArray f112018e = new SparseArray();

    /* renamed from: f */
    private final List f112019f = new ArrayList();

    public bepv() {
        mo170a(true);
    }

    /* renamed from: f */
    private final int m95421f(int i) {
        boolean z = false;
        if (i >= 0 && i < mo161a()) {
            z = true;
        }
        bmxy.m108588a(z);
        int length = this.f112017d.length - 2;
        while (length > 0 && this.f112017d[length] > i) {
            length--;
        }
        return length;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        int f = m95421f(i);
        return (long) Objects.hash(Integer.valueOf(f), Long.valueOf(((abh) this.f112016a.get(f)).mo157L(i - this.f112017d[f])));
    }

    /* renamed from: a */
    public final int mo161a() {
        int[] iArr = this.f112017d;
        return iArr[iArr.length - 1];
    }

    /* renamed from: c */
    public final void mo60924c() {
        int size = this.f112016a.size();
        this.f112017d = new int[(size + 1)];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            this.f112017d[i2] = ((abh) this.f112016a.get(i)).mo161a() + this.f112017d[i];
            i = i2;
        }
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        int f = m95421f(i);
        bept bept = new bept(f, ((abh) this.f112016a.get(f)).mo162a(i - this.f112017d[f]));
        int hash = Objects.hash(Integer.valueOf(bept.f112012a), Integer.valueOf(bept.f112013b));
        this.f112018e.put(hash, bept);
        return hash;
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        bept bept = (bept) this.f112018e.get(i);
        bmxy.m108581a(bept);
        return ((abh) this.f112016a.get(bept.f112012a)).mo163a(viewGroup, bept.f112013b);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        int f = m95421f(i);
        ((abh) this.f112016a.get(f)).mo168a(acm, i - this.f112017d[f]);
    }

    /* renamed from: a */
    public final void mo169a(acm acm, int i, List list) {
        int f = m95421f(i);
        ((abh) this.f112016a.get(f)).mo169a(acm, i - this.f112017d[f], list);
    }

    /* renamed from: a */
    public final void mo60923a(List list) {
        for (int i = 0; i < this.f112016a.size(); i++) {
            ((abh) this.f112016a.get(i)).mo174b((abj) this.f112019f.get(i));
        }
        this.f112016a.clear();
        this.f112019f.clear();
        this.f112018e.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            abh abh = (abh) list.get(i2);
            bmxy.m108589a(abh.f103b, "Sub-adapters must have stable IDs");
            this.f112016a.add(abh);
            bepu bepu = new bepu(this, abh);
            this.f112019f.add(bepu);
            abh.mo166a(bepu);
        }
        mo60924c();
        mo171aJ();
    }
}
