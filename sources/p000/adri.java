package p000;

import java.util.List;

/* renamed from: adri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adri implements aubt {

    /* renamed from: a */
    final /* synthetic */ boolean f62551a;

    /* renamed from: b */
    final /* synthetic */ String[] f62552b;

    /* renamed from: c */
    final /* synthetic */ List f62553c;

    /* renamed from: d */
    final /* synthetic */ bqgy f62554d;

    /* renamed from: e */
    final /* synthetic */ adrj f62555e;

    public adri(adrj adrj, boolean z, String[] strArr, List list, bqgy bqgy) {
        this.f62555e = adrj;
        this.f62551a = z;
        this.f62552b = strArr;
        this.f62553c = list;
        this.f62554d = bqgy;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f62555e.f62558c.mo33731d();
        adnt.m50873b(exc, "Mediastore delete Icing failed.", new Object[0]);
        if (this.f62551a) {
            this.f62554d.mo69137b(this.f62555e.mo33740a(this.f62555e.f62556a.mo32870a(this.f62552b), this.f62553c, this.f62552b, false));
            return;
        }
        this.f62554d.mo69138b((Object) false);
    }
}
