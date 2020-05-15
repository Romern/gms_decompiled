package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: caxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxp implements caxv {

    /* renamed from: b */
    private static final cipx f176331b = cipx.m150785a("connection");

    /* renamed from: c */
    private static final cipx f176332c = cipx.m150785a("host");

    /* renamed from: d */
    private static final cipx f176333d = cipx.m150785a("keep-alive");

    /* renamed from: e */
    private static final cipx f176334e = cipx.m150785a("proxy-connection");

    /* renamed from: f */
    private static final cipx f176335f = cipx.m150785a("transfer-encoding");

    /* renamed from: g */
    private static final cipx f176336g = cipx.m150785a("te");

    /* renamed from: h */
    private static final cipx f176337h = cipx.m150785a("encoding");

    /* renamed from: i */
    private static final cipx f176338i = cipx.m150785a("upgrade");

    /* renamed from: j */
    private static final List f176339j = cavk.m127307a(f176331b, f176332c, f176333d, f176334e, f176335f, cawh.f176237b, cawh.f176238c, cawh.f176239d, cawh.f176240e, cawh.f176241f, cawh.f176242g);

    /* renamed from: k */
    private static final List f176340k = cavk.m127307a(f176331b, f176332c, f176333d, f176334e, f176335f);

    /* renamed from: l */
    private static final List f176341l = cavk.m127307a(f176331b, f176332c, f176333d, f176334e, f176336g, f176335f, f176337h, f176338i, cawh.f176237b, cawh.f176238c, cawh.f176239d, cawh.f176240e, cawh.f176241f, cawh.f176242g);

    /* renamed from: m */
    private static final List f176342m = cavk.m127307a(f176331b, f176332c, f176333d, f176334e, f176336g, f176335f, f176337h, f176338i);

    /* renamed from: a */
    public final cayf f176343a;

    /* renamed from: n */
    private final cawc f176344n;

    /* renamed from: o */
    private caxt f176345o;

    /* renamed from: p */
    private cawg f176346p;

    public caxp(cayf cayf, cawc cawc) {
        this.f176343a = cayf;
        this.f176344n = cawc;
    }

    /* renamed from: a */
    public final cauo mo75042a(caun caun) {
        return new caxy(ciqh.m150828a(new caxo(this, this.f176346p.f176231f)));
    }

    /* renamed from: a */
    public final void mo75048a(caxt caxt) {
        this.f176345o = caxt;
    }

    /* renamed from: b */
    public final caum mo75050b() {
        String str = null;
        if (this.f176344n.f176196b == caui.HTTP_2) {
            List c = this.f176346p.mo75006c();
            caub caub = new caub();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                cipx cipx = ((cawh) c.get(i)).f176243h;
                String a = ((cawh) c.get(i)).f176244i.mo86336a();
                if (cipx.equals(cawh.f176236a)) {
                    str = a;
                } else if (!f176342m.contains(cipx)) {
                    caub.mo74870c(cipx.mo86336a(), a);
                }
            }
            if (str != null) {
                String valueOf = String.valueOf(str);
                caye a2 = caye.m127534a(valueOf.length() == 0 ? new String("HTTP/1.1 ") : "HTTP/1.1 ".concat(valueOf));
                caum caum = new caum();
                caum.f176046b = caui.HTTP_2;
                caum.f176047c = a2.f176388b;
                caum.f176048d = a2.f176389c;
                caum.mo74916a(caub.mo74866a());
                return caum;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        List c2 = this.f176346p.mo75006c();
        caub caub2 = new caub();
        int size2 = c2.size();
        String str2 = "HTTP/1.1";
        for (int i2 = 0; i2 < size2; i2++) {
            cipx cipx2 = ((cawh) c2.get(i2)).f176243h;
            String a3 = ((cawh) c2.get(i2)).f176244i.mo86336a();
            int i3 = 0;
            while (i3 < a3.length()) {
                int indexOf = a3.indexOf(0, i3);
                if (indexOf == -1) {
                    indexOf = a3.length();
                }
                String substring = a3.substring(i3, indexOf);
                if (cipx2.equals(cawh.f176236a)) {
                    str = substring;
                } else if (cipx2.equals(cawh.f176242g)) {
                    str2 = substring;
                } else if (!f176340k.contains(cipx2)) {
                    caub2.mo74870c(cipx2.mo86336a(), substring);
                }
                i3 = indexOf + 1;
            }
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            caye a4 = caye.m127534a(sb.toString());
            caum caum2 = new caum();
            caum2.f176046b = caui.SPDY_3;
            caum2.f176047c = a4.f176388b;
            caum2.f176048d = a4.f176389c;
            caum2.mo74916a(caub2.mo74866a());
            return caum2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: c */
    public final void mo75051c() {
        this.f176346p.mo75008d().close();
    }

    /* renamed from: a */
    public final ciqq mo75043a(cauk cauk, long j) {
        return this.f176346p.mo75008d();
    }

    /* renamed from: a */
    public final void mo75045a() {
        cawg cawg = this.f176346p;
        if (cawg != null) {
            cawg.mo75004b(cavl.CANCEL);
        }
    }

    /* renamed from: a */
    public final void mo75047a(cauk cauk) {
        ArrayList arrayList;
        int i;
        cawg cawg;
        if (this.f176346p == null) {
            this.f176345o.mo75055a();
            boolean a = this.f176345o.mo75058a(cauk);
            if (this.f176344n.f176196b != caui.HTTP_2) {
                cauc cauc = cauk.f176039c;
                arrayList = new ArrayList(cauc.mo74871a() + 5);
                arrayList.add(new cawh(cawh.f176237b, cauk.f176038b));
                arrayList.add(new cawh(cawh.f176238c, caya.m127524a(cauk.f176037a)));
                arrayList.add(new cawh(cawh.f176242g, "HTTP/1.1"));
                arrayList.add(new cawh(cawh.f176241f, cavk.m127304a(cauk.f176037a)));
                arrayList.add(new cawh(cawh.f176239d, cauk.f176037a.f175990a));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int a2 = cauc.mo74871a();
                for (int i2 = 0; i2 < a2; i2++) {
                    cipx a3 = cipx.m150785a(cauc.mo74872a(i2).toLowerCase(Locale.US));
                    if (!f176339j.contains(a3)) {
                        String b = cauc.mo74875b(i2);
                        if (linkedHashSet.add(a3)) {
                            arrayList.add(new cawh(a3, b));
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= arrayList.size()) {
                                    break;
                                } else if (((cawh) arrayList.get(i3)).f176243h.equals(a3)) {
                                    arrayList.set(i3, new cawh(a3, ((cawh) arrayList.get(i3)).f176244i.mo86336a() + 0 + b));
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            } else {
                cauc cauc2 = cauk.f176039c;
                arrayList = new ArrayList(cauc2.mo74871a() + 4);
                arrayList.add(new cawh(cawh.f176237b, cauk.f176038b));
                arrayList.add(new cawh(cawh.f176238c, caya.m127524a(cauk.f176037a)));
                arrayList.add(new cawh(cawh.f176240e, cavk.m127304a(cauk.f176037a)));
                arrayList.add(new cawh(cawh.f176239d, cauk.f176037a.f175990a));
                int a4 = cauc2.mo74871a();
                for (int i4 = 0; i4 < a4; i4++) {
                    cipx a5 = cipx.m150785a(cauc2.mo74872a(i4).toLowerCase(Locale.US));
                    if (!f176341l.contains(a5)) {
                        arrayList.add(new cawh(a5, cauc2.mo74875b(i4)));
                    }
                }
            }
            cawc cawc = this.f176344n;
            boolean z = !a;
            synchronized (cawc.f176211q) {
                synchronized (cawc) {
                    if (!cawc.f176202h) {
                        i = cawc.f176201g;
                        cawc.f176201g = i + 2;
                        cawg = new cawg(i, cawc, z, false);
                        if (cawg.mo75003a()) {
                            cawc.f176198d.put(Integer.valueOf(i), cawg);
                            cawc.m127360a(false);
                        }
                    } else {
                        throw new IOException("shutdown");
                    }
                }
                cawc.f176211q.mo74980a(z, i, arrayList);
            }
            if (!a) {
                cawc.f176211q.mo74981b();
            }
            this.f176346p = cawg;
            cawg.f176233h.mo86354a((long) this.f176345o.f176351b.f176016r, TimeUnit.MILLISECONDS);
            this.f176346p.f176234i.mo86354a((long) this.f176345o.f176351b.f176017s, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo75049a(cayb cayb) {
        cayb.mo75067a(this.f176346p.mo75008d());
    }
}
