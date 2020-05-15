package p000;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: bjlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlp extends bjhy {

    /* renamed from: p */
    long f122940p;

    /* renamed from: q */
    private bwnk f122941q;

    public bjlp(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final bjlr m103859G() {
        if (this.f122639a.f122693b.mo65133b(this.f122940p)) {
            return (bjlr) this.f122639a.f122693b.mo65131a(this.f122940p, bjlr.class);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo65240a(bjgf bjgf) {
        bjlr G = m103859G();
        if (G != null) {
            int i = ((bjlq) ((bjhy) this).f122754m).f122942d;
            if (!G.f122945p) {
                G.f122945p = true;
                int a = bwnp.m122138a(G.f122944m.f160382a);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    ArrayList arrayList = G.f122943l;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        bjlp bjlp = (bjlp) arrayList.get(i3);
                        if (bjlp != this) {
                            ((bjlq) ((bjhy) bjlp).f122754m).mo65370b(i);
                        }
                    }
                } else if (i2 == 2 && i == 2) {
                    ArrayList arrayList2 = G.f122943l;
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        bjlp bjlp2 = (bjlp) arrayList2.get(i4);
                        if (bjlp2 != this && ((bjlq) ((bjhy) bjlp2).f122754m).f122942d == 2 && bjlp2.mo65125k()) {
                            ((bjlq) ((bjhy) bjlp2).f122754m).mo65370b(3);
                        }
                    }
                }
                G.f122945p = false;
            }
        }
        super.mo65240a(bjgf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjlq bjlq = (bjlq) ((bjhy) this).f122754m;
        return bjlq == null ? new bjlq() : bjlq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        long j;
        bjlr G = m103859G();
        if (G != null) {
            G.mo65371a(this);
        }
        bwnk bwnk = this.f122941q;
        if ((bwnk.f160370a & 1) != 0) {
            j = bwnk.f160371b;
        } else {
            j = -1;
        }
        this.f122940p = j;
        bjlr G2 = m103859G();
        if (G2 != null) {
            G2.f122943l.add(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public final void mo65201cC() {
        bjlr G = m103859G();
        if (G != null) {
            G.mo65371a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        this.f122940p = -1;
        super.mo65099a(bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwnk.f160368d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122941q = (bwnk) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwnu bwnu;
        bxvj bxvj = bwnv.f160398e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwnv.f160398e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwnv bwnv = (bwnv) b;
            int a = bwnt.m122142a(bwnv.f160402c);
            if (a != 0 && a == 3) {
                if (bwnv.f160400a == 3) {
                    bwnu = (bwnu) bwnv.f160401b;
                } else {
                    bwnu = bwnu.f160392d;
                }
                bjlq bjlq = (bjlq) ((bjhy) this).f122754m;
                int a2 = bwnm.m122135a(bwnu.f160395b);
                if (a2 == 0) {
                    a2 = 1;
                }
                bjlq.mo65370b(a2);
                if ((bwnu.f160394a & 2) != 0) {
                    bwpd bwpd = bwnu.f160396c;
                    if (bwpd == null) {
                        bwpd = bwpd.f160521d;
                    }
                    mo65104a(bwpd);
                    return;
                }
                return;
            }
            return;
        }
        super.mo65103a(bwoq);
    }
}
