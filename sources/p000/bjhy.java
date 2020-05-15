package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bjhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjhy extends bjhu implements bjhr {

    /* renamed from: m */
    public bjhs f122754m;

    /* renamed from: p */
    private boolean f122755p;

    protected bjhy(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final Object mo65096a(int i) {
        return this.f122754m.mo65241a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bjhs mo65264b(bwny bwny);

    /* renamed from: b */
    public final bxvf mo65111b(boolean z) {
        bxvf b = super.mo65111b(z);
        if (z && !this.f122754m.mo65251d()) {
            return b;
        }
        bjhs bjhs = this.f122754m;
        b.mo74125a(bjhs.f122744a, bjhs.mo65248b());
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List mo65123i() {
        List<Integer> a = this.f122754m.mo65242a();
        if (a.isEmpty()) {
            return super.mo65123i();
        }
        ArrayList arrayList = new ArrayList(a.size());
        for (Integer num : a) {
            bjgb bjgb = (bjgb) this.f122646h.get(Integer.valueOf(num.intValue()));
            if (bjgb != null) {
                arrayList.add(bjgb);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo65126l() {
        return this.f122754m.mo65250c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        this.f122754m.mo65243a(bundle);
    }

    /* renamed from: a */
    public void mo65240a(bjgf bjgf) {
        mo65125k();
        mo65113b(bjgf);
        mo65121g();
        mo65105a(bwov.f160500b, 0);
        if (this.f122755p) {
            bxvd da = bpsk.f138966h.mo74144da();
            long j = this.f122639a.f122692a.f122725b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk = (bpsk) da.f164949b;
            bpsk.f138968a |= 1;
            bpsk.f138971d = j;
            bpsg bpsg = bpsg.EVENT_TYPE_DATA_VALUE_CHANGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk2 = (bpsk) da.f164949b;
            bpsk2.f138972e = bpsg.f138957l;
            bpsk2.f138968a |= 2;
            long e = mo65120e();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk3 = (bpsk) da.f164949b;
            bpsk3.f138968a |= 8;
            bpsk3.f138973f = e;
            bxvd da2 = bpsj.f138964a.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsk bpsk4 = (bpsk) da.f164949b;
            bpsj bpsj = (bpsj) da2.mo74062i();
            bpsj.getClass();
            bpsk4.f138970c = bpsj;
            bpsk4.f138969b = 6;
            bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122639a.f122692a.f122724a.mo71762a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65099a(bwny bwny, Bundle bundle) {
        mo65097a(new bjhx(this.f122639a));
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122754m.mo65249b(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        this.f122754m = mo65264b(bwny2);
        this.f122755p = mo65109a(bpsg.EVENT_TYPE_DATA_VALUE_CHANGE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65102a(bwog bwog, bwog bwog2) {
        bxxc bxxc;
        super.mo65102a(bwog, bwog2);
        bjhs bjhs = this.f122754m;
        bxuq bxuq = bjhs.f122744a;
        Map map = GeneratedMessageLite.f164959aj;
        bxvj bxvj = (bxvj) bxuq;
        bwog2.mo74135a(bxvj);
        if (!bwog2.f164952m.mo73911a(bxvj.f164958d)) {
            bxxc = (bxxc) ((bxvj) bjhs.f122744a).f164956b;
        } else {
            bxvj bxvj2 = (bxvj) bjhs.f122744a;
            bwog2.mo74135a(bxvj2);
            Object b = bwog2.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bxxc = (bxxc) b;
        }
        bjhs.f122746c = false;
        bjhs.mo65245a(bxxc);
        bjhs.f122746c = true;
        this.f122754m.f122745b = this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65103a(bwoq bwoq) {
        bxvj bxvj = bwoo.f160469e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwoo.f160469e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwoo bwoo = (bwoo) b;
            int a = bwon.m122162a(bwoo.f160473c);
            if (a == 0 || a != 5) {
                super.mo65103a(bwoq);
            } else if (bwoo.f160471a == 4) {
                bwop bwop = (bwop) bwoo.f160472b;
                if ((bwop.f160477a & 1) != 0) {
                    long j = bwop.f160478b;
                    if (this.f122639a.f122693b.mo65133b(j)) {
                        this.f122754m.mo65246a(this.f122639a.f122693b.mo65130a(j).mo65096a(bwop.f160479c));
                        return;
                    }
                    mo65114b(String.format(Locale.US, "Cannot get component with data reference: %s.", Long.valueOf(bwop.f160478b)));
                    return;
                }
                mo65114b("SetValueByReference does not contain data reference.");
            } else {
                mo65114b("ResultingAction with type SET_VALUE_BY_REFERENCE does not contain setValueByReference data");
            }
        }
    }
}
