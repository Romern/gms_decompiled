package p000;

/* renamed from: baev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baev implements bqeh {

    /* renamed from: a */
    final /* synthetic */ baew f100574a;

    public baev(baew baew) {
        this.f100574a = baew;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        Exception exc = (Exception) obj;
        ((achw) this.f100574a.f100576b.mo16713a()).mo25418e("Sync execution exception", new Object[0]);
        babr n = this.f100574a.f100575a.mo32648n();
        if (n.mo32693o()) {
            throw baqe.m87387a(exc, n);
        }
        throw exc;
    }
}
