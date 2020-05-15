package p000;

import java.util.ArrayList;

/* renamed from: bksu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bksu extends bkse {

    /* renamed from: e */
    private final bksl f125244e;

    public bksu(bksl bksl) {
        super(new bksp((bksp) bksl).f125231b, null, bkqw.f125126d, true);
        this.f125244e = bksl;
    }

    /* renamed from: a */
    public final bkqi mo66314a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66316a(bkqo bkqo) {
    }

    /* renamed from: a */
    public final void mo66317a(String str, bksd bksd) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo66319b(blhg blhg) {
    }

    /* renamed from: b */
    public final boolean mo66320b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo66322c(blhg blhg) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo66326f(blhg blhg) {
        String str = blhg.f126523c;
        bksb a = this.f125203a.mo66331a(str, true);
        if (a != null) {
            a.mo66295a(blhg, this.f125205c, this.f125206d);
            mo66318a(str, blhg);
            return;
        }
        String valueOf = String.valueOf(blhg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("No object with ID ");
        sb.append(str);
        sb.append(" when applying: ");
        sb.append(valueOf);
        throw new bkrh(sb.toString());
    }

    /* renamed from: a */
    public final bkqi mo66315a(blhg blhg) {
        mo66324d(blhg);
        ArrayList arrayList = new ArrayList(this.f125206d.mo66308a().size());
        for (bkrn bkrn : this.f125206d.mo66308a()) {
            arrayList.add(bkrn.mo66284a(this.f125244e.mo66329b(bkrn.f125156a.mo66247d())));
        }
        return new bkqi(arrayList, null, null, null, null, null, null);
    }
}
