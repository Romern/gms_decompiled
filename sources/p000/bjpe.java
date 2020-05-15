package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: bjpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpe extends bjon {

    /* renamed from: q */
    private bwuu f123073q;

    /* renamed from: r */
    private String f123074r;

    /* renamed from: s */
    private List f123075s;

    public bjpe(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo65414G() {
        bwuu bwuu = this.f123073q;
        return bwuu.f161069a == 3 ? (String) bwuu.f161070b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo65415H() {
        bwuu bwuu = this.f123073q;
        return bwuu.f161069a == 2 ? (String) bwuu.f161070b : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo65416I() {
        return this.f123073q.f161071c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final String mo65427J() {
        if (this.f123074r == null) {
            bwvd bwvd = this.f123073q.f161072d;
            if (bwvd == null) {
                bwvd = bwvd.f161102e;
            }
            this.f123074r = (bwvd.f161104a & 1) != 0 ? bwvd.f161106d : "/";
        }
        return this.f123074r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final List mo65428K() {
        if (this.f123075s == null) {
            bwvd bwvd = this.f123073q.f161072d;
            if (bwvd == null) {
                bwvd = bwvd.f161102e;
            }
            this.f123075s = new bxvv(bwvd.f161105b, bwvd.f161101c);
        }
        return this.f123075s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwuu.f161067g;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123073q = (bwuu) b;
        ArrayList arrayList = new ArrayList(this.f123073q.f161073e.size());
        bxwc bxwc = this.f123073q.f161073e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bwve bwve = (bwve) bxwc.get(i);
            bjpf bjpf = (bjpf) ((bjhy) this).f122754m;
            String str = bwve.f161110b;
            int i2 = bwve.f161111c;
            bwvf bwvf = bwve.f161109a;
            if (bwvf == null) {
                bwvf = bwvf.f161113d;
            }
            arrayList.add(new bjpk(bjpf, str, i2, bwvf, mo65428K()));
        }
        mo65107a(bngx.m109368a((Collection) arrayList));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjpf bjpf = (bjpf) ((bjhy) this).f122754m;
        return bjpf == null ? new bjpf() : bjpf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65119d() {
        super.mo65119d();
        this.f123074r = null;
        this.f123075s = null;
    }

    /* renamed from: h */
    public final String mo65122h() {
        bjpf bjpf = (bjpf) ((bjhy) this).f122754m;
        return bjpj.m104222a(mo65427J(), mo65428K(), bjpf.f123076d, bjpf.f123077e, bjpf.f123078f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo65126l() {
        return TextUtils.isEmpty(((bjpf) ((bjhy) this).f122754m).f123076d) || (bjpj.m104224a(mo65428K()) && TextUtils.isEmpty(((bjpf) ((bjhy) this).f122754m).f123077e)) || (bjpj.m104225b(mo65428K()) && TextUtils.isEmpty(((bjpf) ((bjhy) this).f122754m).f123078f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bxvj bxvj = bwuz.f161087e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwuz.f161087e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwuz bwuz = (bwuz) b;
            int a = bwuy.m122331a(bwuz.f161091c);
            if (a == 0 || a != 2) {
                Locale locale = Locale.US;
                int i = 1;
                Object[] objArr = new Object[1];
                int a2 = bwuy.m122331a(bwuz.f161091c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Unsupported DateInputResultingAction: %s", objArr));
            } else if (bwuz.f161089a != 2) {
                mo65114b("ResultingAction with type SetValue does not contain new value");
            } else {
                ((bjpf) ((bjhy) this).f122754m).mo65429a((blxc) bwuz.f161090b);
            }
        } else {
            super.mo65103a(bwoq);
        }
    }
}
