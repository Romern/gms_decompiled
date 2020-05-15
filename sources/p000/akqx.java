package p000;

import android.hardware.Camera;

/* renamed from: akqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqx implements ssx {

    /* renamed from: a */
    final /* synthetic */ akrj f72472a;

    public akqx(akrj akrj) {
        this.f72472a = akrj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6692a(Object obj) {
        Camera.Size size = (Camera.Size) obj;
        akpo a = this.f72472a.f72491g.mo39852b().mo39670a();
        return size.width <= a.f72392a && size.height <= a.f72393b;
    }
}
