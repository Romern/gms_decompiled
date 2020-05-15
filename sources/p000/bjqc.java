package p000;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: bjqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqc extends bjon {

    /* renamed from: q */
    public bwwc f123134q;

    public bjqc(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo65414G() {
        bwwc bwwc = this.f123134q;
        return bwwc.f161214a == 3 ? (String) bwwc.f161215b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo65415H() {
        bwwc bwwc = this.f123134q;
        return bwwc.f161214a == 1 ? (String) bwwc.f161215b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo65416I() {
        return this.f123134q.f161216c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj b = bxvk.m124025b(bwwc.f161212g);
        bwny2.mo74135a(b);
        Object b2 = bwny2.f164952m.mo73913b(b.f164958d);
        if (b2 == null) {
            b2 = b.f164956b;
        } else {
            b.mo74139a(b2);
        }
        bwwc bwwc = (bwwc) b2;
        this.f123134q = bwwc;
        mo65107a(bjoo.m104169a(bwwc.f161217d, (bjhw) ((bjhy) this).f122754m));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bwog bwog = bwny.f160417b;
        if (bwog == null) {
            bwog = bwog.f160437f;
        }
        bjhw bjhw = (bjhw) ((bjhy) this).f122754m;
        if (bjhw != null) {
            bxvj bxvj = (bxvj) bjhw.f122744a;
            bwog.mo74135a(bxvj);
            if (bwog.f164952m.mo73911a(bxvj.f164958d)) {
                return bjhw;
            }
        }
        bxvj bxvj2 = bwwd.f161221e;
        bwog.mo74135a(bxvj2);
        if (bwog.f164952m.mo73911a(bxvj2.f164958d)) {
            return new bjqd();
        }
        bxvj bxvj3 = bwwo.f161270e;
        bwog.mo74135a(bxvj3);
        if (bwog.f164952m.mo73911a(bxvj3.f164958d)) {
            return new bjqg();
        }
        bxvj bxvj4 = bwwj.f161252e;
        bwog.mo74135a(bxvj4);
        if (bwog.f164952m.mo73911a(bxvj4.f164958d)) {
            return new bjqe();
        }
        bxvj bxvj5 = bwwp.f161276e;
        bwog.mo74135a(bxvj5);
        if (bwog.f164952m.mo73911a(bxvj5.f164958d)) {
            return new bjqh();
        }
        mo65114b("Unexpected DataValue extension");
        return null;
    }

    /* renamed from: h */
    public final String mo65122h() {
        return ((bjhw) ((bjhy) this).f122754m).f122753d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwwk bwwk;
        bwwk bwwk2;
        String str;
        bxvj bxvj = bwwn.f161263e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwwn.f161263e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwwn bwwn = (bwwn) b;
            int a = bwwm.m122373a(bwwn.f161267c);
            int i = 1;
            if (a != 0 && a == 2) {
                if (bwwn.f161265a == 2) {
                    bwwk = (bwwk) bwwn.f161266b;
                } else {
                    bwwk = bwwk.f161257c;
                }
                if (bwwk.f161259a == 1) {
                    bjhw bjhw = (bjhw) ((bjhy) this).f122754m;
                    if (bwwn.f161265a == 2) {
                        bwwk2 = (bwwk) bwwn.f161266b;
                    } else {
                        bwwk2 = bwwk.f161257c;
                    }
                    if (bwwk2.f161259a == 1) {
                        str = (String) bwwk2.f161260b;
                    } else {
                        str = "";
                    }
                    bjhw.mo65262a(str);
                    return;
                }
                mo65114b("ResultingAction with type NewValue does not contain new value");
                return;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwwm.m122373a(bwwn.f161267c);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            mo65114b(String.format(locale, "Unsupported ResultingAction: %s", objArr));
            return;
        }
        super.mo65103a(bwoq);
    }
}
