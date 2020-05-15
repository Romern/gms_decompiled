package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: koj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class koj {

    /* renamed from: a */
    public String f24576a;

    /* renamed from: b */
    public String f24577b;

    /* renamed from: c */
    public int f24578c;

    /* renamed from: d */
    public String f24579d;

    /* renamed from: e */
    public String f24580e;

    /* renamed from: f */
    public int f24581f;

    /* renamed from: g */
    public Object f24582g;

    /* renamed from: h */
    public int f24583h;

    /* renamed from: i */
    public int f24584i;

    /* renamed from: j */
    public int f24585j;

    /* renamed from: k */
    public int f24586k;

    /* renamed from: l */
    public int f24587l;

    /* renamed from: m */
    public int f24588m;

    /* renamed from: n */
    public int f24589n;

    /* renamed from: o */
    public int f24590o;

    /* renamed from: p */
    public String f24591p;

    /* renamed from: q */
    public boolean f24592q;

    /* renamed from: r */
    public boolean f24593r;

    /* renamed from: s */
    public String f24594s;

    /* renamed from: t */
    public kol f24595t;

    /* renamed from: u */
    public koq f24596u;

    /* renamed from: v */
    private CharSequence[] f24597v;

    /* renamed from: w */
    private bnic f24598w;

    /* renamed from: x */
    private bmxv f24599x = bmvz.f131120a;

    /* renamed from: y */
    private final List f24600y = new ArrayList();

    /* renamed from: a */
    public final kom mo14749a() {
        bngs b = bngx.m109371b(this.f24600y.size());
        List list = this.f24600y;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b.mo67668c(((koj) list.get(i)).mo14749a());
        }
        bngx a = b.mo67664a();
        kom kom = new kom(this.f24576a, this.f24577b, this.f24578c, this.f24579d, this.f24580e, this.f24581f, this.f24597v, this.f24582g, this.f24598w, this.f24583h, this.f24599x, this.f24584i, this.f24585j, this.f24586k, this.f24587l, this.f24588m, this.f24589n, this.f24590o, this.f24591p, this.f24592q, this.f24593r, this.f24594s, this.f24595t, this.f24596u, a);
        bnre i2 = a.listIterator();
        while (i2.hasNext()) {
            ((kom) i2.next()).f24625x = bmxv.m108567c(kom);
        }
        return kom;
    }

    /* renamed from: a */
    public final void mo14751a(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            charSequenceArr = new CharSequence[0];
        }
        this.f24597v = charSequenceArr;
    }

    /* renamed from: a */
    public final void mo14750a(int i) {
        this.f24599x = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo14752a(String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            bnia c = bnic.m109499c(length);
            for (String str : strArr) {
                if (!bmxx.m108577a(str)) {
                    c.mo67629b(str);
                }
            }
            this.f24598w = c.mo67751a();
        }
    }

    /* renamed from: a */
    public final void mo14753a(koj... kojArr) {
        Collections.addAll(this.f24600y, kojArr);
    }
}
