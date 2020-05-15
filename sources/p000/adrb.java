package p000;

/* renamed from: adrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adrb implements aubt {

    /* renamed from: a */
    final /* synthetic */ adqt f62536a;

    /* renamed from: b */
    final /* synthetic */ bqgy f62537b;

    public adrb(adqt adqt, bqgy bqgy) {
        this.f62536a = adqt;
        this.f62537b = bqgy;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f62536a.mo33731d();
        adnt.m50875c("icing.Indexer", exc, "Mediastore indexing task failed");
        this.f62537b.mo69138b((Object) false);
    }
}
