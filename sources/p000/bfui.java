package p000;

import android.location.Location;

/* renamed from: bfui */
final /* synthetic */ class bfui implements aubw {

    /* renamed from: a */
    private final bfuk f115332a;

    public bfui(bfuk bfuk) {
        this.f115332a = bfuk;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bfuk bfuk = this.f115332a;
        bfuk.f115335a.post(new bfuj(bfuk, (Location) obj));
    }
}
