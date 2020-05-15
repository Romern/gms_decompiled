package p000;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: bjrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjrn extends bjhy implements bjgg {

    /* renamed from: p */
    private bxas f123187p;

    public bjrn(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final String m104453G() {
        int size = this.f123187p.f161741a.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = this.f122639a.f122693b.mo65130a(this.f123187p.f161741a.mo74160a(i)).mo65122h();
        }
        return String.format(this.f123187p.f161742b, strArr);
    }

    /* renamed from: a */
    public final void mo65141a() {
        ((bjro) ((bjhy) this).f122754m).mo65262a(m104453G());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjro bjro = (bjro) ((bjhy) this).f122754m;
        return bjro == null ? new bjro() : bjro;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        int size = this.f123187p.f161741a.size();
        for (int i = 0; i < size; i++) {
            bjgd a = this.f122639a.f122693b.mo65130a(this.f123187p.f161741a.mo74160a(i));
            if (a.f122641c == null) {
                a.f122641c = new ArrayList(1);
            }
            a.f122641c.add(this);
        }
        ((bjro) ((bjhy) this).f122754m).mo65262a(m104453G());
    }

    /* renamed from: cC */
    public final void mo65201cC() {
        bxvw bxvw = this.f123187p.f161741a;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = this.f122639a.f122693b.mo65130a(((Long) bxvw.get(i)).longValue()).f122641c;
            if (arrayList != null) {
                arrayList.remove(this);
            }
        }
    }

    /* renamed from: h */
    public final String mo65122h() {
        return ((bjro) ((bjhy) this).f122754m).f122753d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bxas.f161739d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123187p = (bxas) b;
    }
}
