package p000;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: bjlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlm extends bjhy {

    /* renamed from: p */
    public bwnb f122936p;

    public bjlm(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwnb.f160339d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122936p = (bwnb) b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjln bjln = (bjln) ((bjhy) this).f122754m;
        return bjln == null ? new bjln() : bjln;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwng bwng;
        bwng bwng2;
        String str;
        bxvj bxvj = bwnj.f160361e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwnj.f160361e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwnj bwnj = (bwnj) b;
            int a = bwni.m122131a(bwnj.f160365c);
            int i = 1;
            if (a != 0 && a == 2) {
                if (bwnj.f160363a == 2) {
                    bwng = (bwng) bwnj.f160364b;
                } else {
                    bwng = bwng.f160355c;
                }
                if (bwng.f160357a == 1) {
                    bjln bjln = (bjln) ((bjhy) this).f122754m;
                    if (bwnj.f160363a == 2) {
                        bwng2 = (bwng) bwnj.f160364b;
                    } else {
                        bwng2 = bwng.f160355c;
                    }
                    if (bwng2.f160357a == 1) {
                        str = (String) bwng2.f160358b;
                    } else {
                        str = "";
                    }
                    bjln.mo65262a(str);
                    return;
                }
                mo65114b("ResultingAction with type NewValue does not contain new value");
                return;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwni.m122131a(bwnj.f160365c);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.toString(i - 1);
            mo65114b(String.format(locale, "Unsupported ResultingAction: %s", objArr));
            return;
        }
        super.mo65103a(bwoq);
    }
}
