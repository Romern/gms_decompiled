package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bjqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqj extends bjhy {

    /* renamed from: p */
    public ArrayList f123138p;

    /* renamed from: q */
    private bwyn f123139q;

    public bjqj(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo65240a(bjgf bjgf) {
        ArrayList arrayList = this.f123138p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjqi) arrayList.get(i)).mo65380a(mo65120e(), ((bjql) ((bjhy) this).f122754m).f123141d);
            }
        }
        super.mo65240a(bjgf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjql bjql = (bjql) ((bjhy) this).f122754m;
        return bjql == null ? new bjql() : bjql;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public final void mo65201cC() {
        ArrayList arrayList = this.f123138p;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cF */
    public final Iterable mo65118cF() {
        bngx e = bngx.m109376e();
        bxwc bxwc = this.f123139q.f161502a;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bwyu bwyu = (bwyu) bxwc.get(i);
            i++;
            if (bwyu.f161530a == ((bjql) ((bjhy) this).f122754m).f123141d) {
                return bwyu.f161531b;
            }
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwyn.f161500c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123139q = (bwyn) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwyq bwyq;
        bxvj bxvj = bwyr.f161510e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwyr.f161510e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwyr bwyr = (bwyr) b;
            int a = bwyp.m122446a(bwyr.f161514c);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            int i3 = 0;
            if (i2 == 0) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwyp.m122446a(bwyr.f161514c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Unknown OneOfDataResultingAction type: %s", objArr));
            } else if (i2 != 1) {
                if (bwyr.f161512a == 3) {
                    bwyq = (bwyq) bwyr.f161513b;
                } else {
                    bwyq = bwyq.f161504d;
                }
                ((bjql) ((bjhy) this).f122754m).mo65453b(bwyq.f161507b);
                if ((bwyq.f161506a & 2) != 0) {
                    bwpd bwpd = bwyq.f161508c;
                    if (bwpd == null) {
                        bwpd = bwpd.f160521d;
                    }
                    mo65104a(bwpd);
                }
            } else {
                bjql bjql = (bjql) ((bjhy) this).f122754m;
                if (bwyr.f161512a == 2) {
                    i3 = ((Integer) bwyr.f161513b).intValue();
                }
                bjql.mo65453b(i3);
            }
        } else {
            super.mo65103a(bwoq);
        }
    }
}
