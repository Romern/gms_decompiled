package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: atn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atn extends atf {

    /* renamed from: u */
    int f2207u;

    /* renamed from: v */
    boolean f2208v;

    /* renamed from: w */
    private ArrayList f2209w;

    /* renamed from: x */
    private boolean f2210x;

    /* renamed from: y */
    private int f2211y;

    public atn() {
        this.f2209w = new ArrayList();
        this.f2210x = true;
        this.f2208v = false;
        this.f2211y = 0;
    }

    /* renamed from: b */
    private final void m2061b(atf atf) {
        this.f2209w.add(atf);
        atf.f2185m = this;
    }

    /* renamed from: a */
    public final atf mo2490a(int i) {
        if (i < 0 || i >= this.f2209w.size()) {
            return null;
        }
        return (atf) this.f2209w.get(i);
    }

    /* renamed from: b */
    public final void mo2493b(int i) {
        this.f2210x = i == 0;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2471b(long j) {
        this.f2173a = j;
    }

    /* renamed from: c */
    public final void mo2457a(long j) {
        ArrayList arrayList;
        this.f2174b = j;
        if (this.f2174b >= 0 && (arrayList = this.f2209w) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((atf) this.f2209w.get(i)).mo2457a(j);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo2477d() {
        if (!this.f2209w.isEmpty()) {
            atm atm = new atm(this);
            ArrayList arrayList = this.f2209w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((atf) arrayList.get(i)).mo2463a(atm);
            }
            this.f2207u = this.f2209w.size();
            if (this.f2210x) {
                ArrayList arrayList2 = this.f2209w;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((atf) arrayList2.get(i2)).mo2477d();
                }
                return;
            }
            for (int i3 = 1; i3 < this.f2209w.size(); i3++) {
                ((atf) this.f2209w.get(i3 - 1)).mo2463a(new atl((atf) this.f2209w.get(i3)));
            }
            atf atf = (atf) this.f2209w.get(0);
            if (atf != null) {
                atf.mo2477d();
                return;
            }
            return;
        }
        mo2479e();
        mo2481f();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo2480e(View view) {
        for (int i = 0; i < this.f2209w.size(); i++) {
            ((atf) this.f2209w.get(i)).mo2480e(view);
        }
        super.mo2480e(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo2482g() {
        super.mo2482g();
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2482g();
        }
    }

    /* renamed from: h */
    public final atf mo2483h() {
        atn atn = (atn) super.clone();
        atn.f2209w = new ArrayList();
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            atn.m2061b(((atf) this.f2209w.get(i)).clone());
        }
        return atn;
    }

    /* renamed from: b */
    public final int mo2492b() {
        return this.f2209w.size();
    }

    public atn(byte[] bArr) {
        this();
        mo2493b(1);
        mo2491a(new ask(2));
        mo2491a(new asd());
        mo2491a(new ask(1));
    }

    /* renamed from: a */
    public final String mo2456a(String str) {
        String a = super.mo2456a(str);
        for (int i = 0; i < this.f2209w.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(((atf) this.f2209w.get(i)).mo2456a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: c */
    public final void mo2474c(View view) {
        super.mo2474c(view);
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2474c(view);
        }
    }

    /* renamed from: b */
    public final void mo2458a(TimeInterpolator timeInterpolator) {
        this.f2211y |= 1;
        ArrayList arrayList = this.f2209w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((atf) this.f2209w.get(i)).mo2458a(timeInterpolator);
            }
        }
        this.f2175c = timeInterpolator;
    }

    /* renamed from: c */
    public final void mo2496c(ate ate) {
        super.mo2463a(ate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2459a(ViewGroup viewGroup, atr atr, atr atr2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f2173a;
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            atf atf = (atf) this.f2209w.get(i);
            if (j > 0 && (this.f2210x || i == 0)) {
                long j2 = atf.f2173a;
                if (j2 <= 0) {
                    atf.mo2471b(j);
                } else {
                    atf.mo2471b(j2 + j);
                }
            }
            atf.mo2459a(viewGroup, atr, atr2, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public final void mo2475c(atq atq) {
        super.mo2475c(atq);
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2475c(atq);
        }
    }

    /* renamed from: b */
    public final void mo2472b(View view) {
        super.mo2472b(view);
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2472b(view);
        }
    }

    /* renamed from: b */
    public final void mo2379b(atq atq) {
        if (mo2468a(atq.f2216b)) {
            ArrayList arrayList = this.f2209w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                atf atf = (atf) arrayList.get(i);
                if (atf.mo2468a(atq.f2216b)) {
                    atf.mo2379b(atq);
                    atq.f2217c.add(atf);
                }
            }
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2478d(View view) {
        for (int i = 0; i < this.f2209w.size(); i++) {
            ((atf) this.f2209w.get(i)).mo2478d(view);
        }
        super.mo2478d(view);
    }

    /* renamed from: a */
    public final void mo2461a(asv asv) {
        super.mo2461a(asv);
        this.f2211y |= 4;
        if (this.f2209w != null) {
            for (int i = 0; i < this.f2209w.size(); i++) {
                ((atf) this.f2209w.get(i)).mo2461a(asv);
            }
        }
    }

    /* renamed from: a */
    public final void mo2462a(atd atd) {
        this.f2191s = atd;
        this.f2211y |= 8;
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2462a(atd);
        }
    }

    /* renamed from: a */
    public final void mo2491a(atf atf) {
        m2061b(atf);
        long j = this.f2174b;
        if (j >= 0) {
            atf.mo2457a(j);
        }
        if ((this.f2211y & 1) != 0) {
            atf.mo2458a(this.f2175c);
        }
        if ((this.f2211y & 2) != 0) {
            atf.mo2464a(this.f2190r);
        }
        if ((this.f2211y & 4) != 0) {
            atf.mo2461a(this.f2192t);
        }
        if ((this.f2211y & 8) != 0) {
            atf.mo2462a(this.f2191s);
        }
    }

    /* renamed from: a */
    public final void mo2464a(atk atk) {
        this.f2190r = atk;
        this.f2211y |= 2;
        int size = this.f2209w.size();
        for (int i = 0; i < size; i++) {
            ((atf) this.f2209w.get(i)).mo2464a(atk);
        }
    }

    /* renamed from: a */
    public final void mo2377a(atq atq) {
        if (mo2468a(atq.f2216b)) {
            ArrayList arrayList = this.f2209w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                atf atf = (atf) arrayList.get(i);
                if (atf.mo2468a(atq.f2216b)) {
                    atf.mo2377a(atq);
                    atq.f2217c.add(atf);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2465a(Class cls) {
        for (int i = 0; i < this.f2209w.size(); i++) {
            ((atf) this.f2209w.get(i)).mo2465a(cls);
        }
        super.mo2465a(cls);
    }
}
