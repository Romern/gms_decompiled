package p000;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: bjog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjog extends bjhy {

    /* renamed from: p */
    public bwto f123047p;

    public bjog(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwto.f160977d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123047p = (bwto) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjoh bjoh = (bjoh) ((bjhy) this).f122754m;
        return bjoh == null ? new bjoh() : bjoh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        int a;
        bxvj bxvj = bwtw.f161000e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwtw.f161000e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwtw bwtw = (bwtw) b;
            int a2 = bwtv.m122302a(bwtw.f161004c);
            int i = 1;
            if (a2 != 0 && a2 == 2) {
                bjoh bjoh = (bjoh) ((bjhy) this).f122754m;
                if (bwtw.f161002a == 2 && (a = bwty.m122305a(((Integer) bwtw.f161003b).intValue())) != 0) {
                    i = a;
                }
                bjoh.mo65409b(i);
                return;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a3 = bwtv.m122302a(bwtw.f161004c);
            if (a3 != 0) {
                i = a3;
            }
            objArr[0] = Integer.valueOf(i - 1);
            mo65114b(String.format(locale, "Unsupported ResultingAction: %s", objArr));
            return;
        }
        super.mo65103a(bwoq);
    }
}
