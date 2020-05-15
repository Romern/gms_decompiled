package p000;

import android.os.Bundle;
import java.util.Collection;
import java.util.Locale;

/* renamed from: bjon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjon extends bjhy {

    /* renamed from: p */
    public String f123053p;

    public bjon(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract String mo65414G();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract String mo65415H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract String mo65416I();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65103a(bwoq bwoq) {
        bwuc bwuc;
        bwud bwud;
        bxvj bxvj = bwub.f161009e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwub.f161009e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwub bwub = (bwub) b;
            int a = bwua.m122307a(bwub.f161013c);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                mo65125k();
            } else if (i2 == 2) {
                bjhs bjhs = ((bjhy) this).f122754m;
                if (bwub.f161011a == 3) {
                    bwuc = (bwuc) bwub.f161012b;
                } else {
                    bwuc = bwuc.f161016b;
                }
                bjhs.mo65247a((Collection) bwuc.f161018a);
                mo65125k();
            } else if (i2 != 3) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwua.m122307a(bwub.f161013c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Unsupported ResultingAction: %s", objArr));
            } else {
                if (bwub.f161011a == 4) {
                    bwud = (bwud) bwub.f161012b;
                } else {
                    bwud = bwud.f161019b;
                }
                String str = bwud.f161021a;
                this.f122647i.f122656c = true;
                mo65106a(str);
            }
        } else {
            super.mo65103a(bwoq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo65119d() {
        this.f123053p = null;
    }
}
