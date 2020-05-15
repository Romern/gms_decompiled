package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bfcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfcd implements Iterator {

    /* renamed from: a */
    final /* synthetic */ bfce f113368a;

    /* renamed from: b */
    private final int f113369b;

    /* renamed from: c */
    private final int f113370c;

    /* renamed from: d */
    private final int f113371d;

    /* renamed from: e */
    private final int f113372e;

    /* renamed from: f */
    private int f113373f = 0;

    /* renamed from: g */
    private int f113374g = 0;

    /* renamed from: h */
    private int f113375h = 0;

    /* renamed from: i */
    private int f113376i = 0;

    /* renamed from: j */
    private int f113377j = 0;

    public bfcd(bfce bfce, bnvk bnvk) {
        this.f113368a = bfce;
        this.f113369b = Math.max((int) Math.floor((bnvk.mo68528b().f132224a - bfce.mo61380a()) / bfce.f113378a.mo61294a()), 0);
        this.f113371d = Math.min((int) Math.ceil((bnvk.mo68529c().f132224a - bfce.mo61380a()) / bfce.f113378a.mo61294a()), bfce.f113378a.f113157c);
        this.f113370c = Math.max((int) Math.floor((bnvk.mo68528b().f132225b - bfce.mo61382b()) / bfce.f113378a.mo61294a()), 0);
        this.f113372e = Math.min((int) Math.ceil((bnvk.mo68529c().f132225b - bfce.mo61382b()) / bfce.f113378a.mo61294a()), bfce.f113378a.f113157c);
        m96329a(this.f113369b, this.f113370c);
    }

    /* renamed from: a */
    private final void m96329a(int i, int i2) {
        while (true) {
            int i3 = this.f113374g;
            if ((i3 < i2 || this.f113373f < i) && i3 < this.f113372e) {
                bznr bznr = (bznr) bznt.f170756d.mo14948a(Integer.valueOf(this.f113368a.f113379b.f170761c.mo74151b(this.f113375h)));
                this.f113377j += bfce.m96331b(bznr);
                if (bfce.m96330a(bznr)) {
                    this.f113376i++;
                }
                int i4 = this.f113373f + 1;
                this.f113373f = i4;
                int i5 = this.f113368a.f113378a.f113157c;
                if (i4 >= i5) {
                    this.f113373f = 0;
                    this.f113374g++;
                    i4 = 0;
                }
                this.f113375h = (this.f113374g * i5) + i4;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return this.f113373f < this.f113371d && this.f113374g < this.f113372e;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        float f;
        if (hasNext()) {
            bznt bznt = this.f113368a.f113379b;
            bznr bznr = (bznr) bznt.f170756d.mo14948a(Integer.valueOf(bznt.f170761c.mo74151b(this.f113375h)));
            if (bfce.m96330a(bznr)) {
                bznt bznt2 = this.f113368a.f113379b;
                f = bznt2.f170760b.mo73923b(this.f113376i);
            } else {
                f = 0.0f;
            }
            if (bfce.m96331b(bznr) == 1) {
                bznt bznt3 = this.f113368a.f113379b;
                bznt3.f170762e.mo73923b(this.f113377j);
            } else if (bfce.m96331b(bznr) == 2) {
                bznt bznt4 = this.f113368a.f113379b;
                bznt4.f170762e.mo73923b(this.f113377j);
                this.f113368a.f113379b.f170762e.mo73923b(this.f113377j + 1);
            }
            int i = this.f113373f;
            int i2 = this.f113374g;
            double a = this.f113368a.mo61380a();
            double d = (double) i;
            double a2 = this.f113368a.f113378a.mo61294a();
            Double.isNaN(d);
            double d2 = a + (d * a2);
            double b = this.f113368a.mo61382b();
            double d3 = (double) i2;
            double a3 = this.f113368a.f113378a.mo61294a();
            Double.isNaN(d3);
            bnvl bnvl = new bnvl(d2, b + (d3 * a3));
            bznt bznt5 = this.f113368a.f113379b;
            bfcc bfcc = new bfcc(bnvl, f, bznt5.f170759a.mo73923b(this.f113375h), bznr);
            int i3 = this.f113373f + 1;
            int i4 = this.f113374g;
            if (i3 >= this.f113371d) {
                i3 = this.f113369b;
                i4++;
            }
            m96329a(i3, i4);
            return bfcc;
        }
        throw new NoSuchElementException("No more valid points for this tile.");
    }
}
