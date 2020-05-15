package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqn extends bjhy {

    /* renamed from: p */
    ArrayList f123142p;

    public bjqn(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bxvj bxvj = bwzr.f161635c;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwzr.f161635c;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            int a = bwzq.m122472a(((bwzr) b).f161637a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 0) {
                int i2 = 0;
                if (i == 1) {
                    ArrayList arrayList = this.f123142p;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (i2 < size) {
                            ((bjqm) arrayList.get(i2)).mo65454a();
                            i2++;
                        }
                    }
                } else if (i == 2) {
                    ArrayList arrayList2 = this.f123142p;
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            ((bjqm) arrayList2.get(i2)).mo65455b();
                            i2++;
                        }
                    }
                } else if (i != 3) {
                    ArrayList arrayList3 = this.f123142p;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i2 < size3) {
                            ((bjqm) arrayList3.get(i2)).mo65457d();
                            i2++;
                        }
                    }
                } else {
                    ArrayList arrayList4 = this.f123142p;
                    if (arrayList4 != null) {
                        int size4 = arrayList4.size();
                        while (i2 < size4) {
                            ((bjqm) arrayList4.get(i2)).mo65456c();
                            i2++;
                        }
                    }
                }
            } else {
                mo65114b("Unknown ScrollResultingAction");
            }
        } else {
            super.mo65103a(bwoq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjqo bjqo = (bjqo) ((bjhy) this).f122754m;
        return bjqo == null ? new bjqo() : bjqo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        int i;
        bxvj bxvj = bwzk.f161615e;
        bwoi.mo74135a(bxvj);
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return super.mo65110a(bwoi);
        }
        bxvj bxvj2 = bwzk.f161615e;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwzk bwzk = (bwzk) b;
        int a = bwzj.m122465a(bwzk.f161619c);
        int i2 = 1;
        if (a != 0 && a == 2) {
            int i3 = ((bjqo) ((bjhy) this).f122754m).f123143d;
            if (bwzk.f161617a != 2 || (i = bwzm.m122468a(((Integer) bwzk.f161618b).intValue())) == 0) {
                i = 1;
            }
            if (i3 != i) {
                return false;
            }
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int a2 = bwzj.m122465a(bwzk.f161619c);
        if (a2 != 0) {
            i2 = a2;
        }
        objArr[0] = Integer.toString(i2 - 1);
        mo65114b(String.format(locale, "Unknown ScrollingCondition type: %s", objArr));
        return false;
    }
}
