package p000;

import android.media.MediaRouter;
import android.view.Display;

/* renamed from: amf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amf extends aly {
    public amf(ane ane) {
        super(ane);
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        ane ane = (ane) this.f896a;
        int f = ane.mo1070f(routeInfo);
        if (f >= 0) {
            anb anb = (anb) ane.f974p.get(f);
            Display a = amh.m1080a(routeInfo);
            if (a != null) {
                i = a.getDisplayId();
            } else {
                i = -1;
            }
            if (i != anb.f962c.mo913r()) {
                akn akn = new akn(anb.f962c);
                akn.mo892e(i);
                anb.f962c = akn.mo880a();
                ane.mo1068d();
            }
        }
    }
}
