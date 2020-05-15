package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bjne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjne extends bjhy implements bjqi, bjgi {

    /* renamed from: p */
    private bwru f122997p;

    /* renamed from: q */
    private List f122998q;

    /* renamed from: r */
    private boolean f122999r;

    public bjne(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m104022G() {
        ArrayList arrayList;
        List list = this.f122998q;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bjqj bjqj = (bjqj) this.f122639a.f122693b.mo65131a(((Long) list.get(i)).longValue(), bjqj.class);
                if (!(bjqj == null || (arrayList = bjqj.f123138p) == null)) {
                    arrayList.remove(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65144a() {
        bjnf bjnf = (bjnf) ((bjhy) this).f122754m;
        int b = bjnf.f123000d.mo15537b();
        if (b > 0) {
            bxvd da = bwrw.f160811b.mo74144da();
            boolean z = false;
            int i = 0;
            while (i < b) {
                long a = bjnf.f123000d.mo15533a(i);
                int intValue = ((Integer) bjnf.f123000d.mo15538b(i)).intValue();
                bxvd da2 = bwrv.f160805e.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                bwrv bwrv = (bwrv) da2.f164949b;
                int i2 = bwrv.f160807a | 1;
                bwrv.f160807a = i2;
                bwrv.f160808b = a;
                bwrv.f160807a = i2 | 4;
                bwrv.f160810d = intValue;
                for (int i3 = bjnf.f123002f; i3 >= 0; i3--) {
                    bxwc bxwc = ((bwrw) bjnf.f123001e.get(i3)).f160813a;
                    int size = bxwc.size();
                    int i4 = 0;
                    while (i4 < size) {
                        bwrv bwrv2 = (bwrv) bxwc.get(i4);
                        i4++;
                        int i5 = i;
                        if (bwrv2.f160808b == a) {
                            int i6 = bwrv2.f160810d;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bwrv bwrv3 = (bwrv) da2.f164949b;
                            bwrv3.f160807a |= 2;
                            bwrv3.f160809c = i6;
                            bwrv bwrv4 = (bwrv) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwrw bwrw = (bwrw) da.f164949b;
                            bwrv4.getClass();
                            if (!bwrw.f160813a.mo73666a()) {
                                bwrw.f160813a = bxvk.m124021a(bwrw.f160813a);
                            }
                            bwrw.f160813a.add(bwrv4);
                            i = i5 + 1;
                            z = false;
                        } else {
                            i = i5;
                        }
                    }
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Failed to find activeOptionId for dataReference: %d", Long.valueOf(a)));
            }
            ArrayList arrayList = bjnf.f123001e;
            arrayList.subList(bjnf.f123002f + 1, arrayList.size()).clear();
            bjnf.f123001e.add((bwrw) da.mo74062i());
            bjnf.f123002f++;
            bjnf.f123000d.mo15542c();
            bjnf.mo65244a((bjgf) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjnf bjnf = (bjnf) ((bjhy) this).f122754m;
        return bjnf == null ? new bjnf() : bjnf;
    }

    /* renamed from: b */
    public final void mo65145b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        m104022G();
        bxvw bxvw = this.f122997p.f160804a;
        this.f122998q = bxvw;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            bjqj bjqj = (bjqj) this.f122639a.f122693b.mo65131a(((Long) bxvw.get(i)).longValue(), bjqj.class);
            if (bjqj != null) {
                if (bjqj.f123138p == null) {
                    bjqj.f123138p = new ArrayList(1);
                }
                bjqj.f123138p.add(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public final void mo65201cC() {
        this.f122639a.f122695d.f122663f.remove(this);
        m104022G();
    }

    /* renamed from: a */
    public final void mo65380a(long j, int i) {
        if (!this.f122999r) {
            ((bjnf) ((bjhy) this).f122754m).f123000d.mo15540b(j, Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        this.f122639a.f122695d.f122663f.add(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwru.f160802c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122997p = (bwru) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bxvj bxvj = bwsa.f160822c;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwsa.f160822c;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            int a = bwrz.m122252a(((bwsa) b).f160824a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0) {
                mo65114b("Unsupported resulting action type");
            } else if (i != 1) {
                bjnf bjnf = (bjnf) ((bjhy) this).f122754m;
                if (bjnf.mo65381e()) {
                    this.f122999r = true;
                    bjnf.f123002f++;
                    bjnf.mo65244a((bjgf) null);
                    bxwc bxwc = ((bwrw) bjnf.f123001e.get(bjnf.f123002f)).f160813a;
                    int size = bxwc.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        bwrv bwrv = (bwrv) bxwc.get(i2);
                        ((bjql) ((bjhy) ((bjqj) this.f122639a.f122693b.mo65131a(bwrv.f160808b, bjqj.class))).f122754m).mo65453b(bwrv.f160810d);
                    }
                    this.f122999r = false;
                }
            } else {
                bjnf bjnf2 = (bjnf) ((bjhy) this).f122754m;
                if (bjnf2.mo65382f()) {
                    this.f122999r = true;
                    bjnf2.f123002f--;
                    bjnf2.mo65244a((bjgf) null);
                    bxwc bxwc2 = ((bwrw) bjnf2.f123001e.get(bjnf2.f123002f)).f160813a;
                    int size2 = bxwc2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        bwrv bwrv2 = (bwrv) bxwc2.get(i3);
                        ((bjql) ((bjhy) ((bjqj) this.f122639a.f122693b.mo65131a(bwrv2.f160808b, bjqj.class))).f122754m).mo65453b(bwrv2.f160809c);
                    }
                    this.f122999r = false;
                }
            }
        } else {
            super.mo65103a(bwoq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        bxvj bxvj = bwrt.f160797c;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return super.mo65110a(bwoi);
        }
        bxvj bxvj2 = bwrt.f160797c;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        int a = bwrs.m122245a(((bwrt) b).f160799a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0) {
            mo65114b("Unknown condition type.");
            return true;
        } else if (i == 1) {
            return ((bjnf) ((bjhy) this).f122754m).mo65382f();
        } else {
            if (i == 2) {
                return ((bjnf) ((bjhy) this).f122754m).mo65381e();
            }
            if (i != 3) {
                if (((bjnf) ((bjhy) this).f122754m).mo65381e()) {
                    return false;
                }
                return true;
            } else if (((bjnf) ((bjhy) this).f122754m).mo65382f()) {
                return false;
            } else {
                return true;
            }
        }
    }
}
