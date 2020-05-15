package p000;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bijr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijr implements afcs {

    /* renamed from: a */
    final /* synthetic */ LatLngBounds f120731a;

    /* renamed from: b */
    final /* synthetic */ LatLng f120732b;

    /* renamed from: c */
    final /* synthetic */ CharSequence f120733c;

    /* renamed from: d */
    final /* synthetic */ Bitmap f120734d;

    /* renamed from: e */
    final /* synthetic */ float f120735e;

    /* renamed from: f */
    final /* synthetic */ float f120736f;

    /* renamed from: g */
    final /* synthetic */ bijw f120737g;

    public bijr(bijw bijw, LatLngBounds latLngBounds, LatLng latLng, CharSequence charSequence, Bitmap bitmap, float f, float f2) {
        this.f120737g = bijw;
        this.f120731a = latLngBounds;
        this.f120732b = latLng;
        this.f120733c = charSequence;
        this.f120734d = bitmap;
        this.f120735e = f;
        this.f120736f = f2;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        afch afch;
        if (this.f120737g.f120746c.getWidth() > 0) {
            afch = afci.m52840a(this.f120731a, this.f120737g.f120746c.getWidth(), this.f120737g.f120746c.getHeight());
        } else {
            try {
                afch = new afch(afci.m52841a().mo34782a(this.f120732b));
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        }
        this.f120737g.mo64690a(this.f120733c, this.f120732b, this.f120734d, this.f120735e, this.f120736f, afch, afcn);
    }
}
