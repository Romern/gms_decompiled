package p000;

import com.google.android.places.service.PlaceDetectionAsyncChimeraService;

/* renamed from: bidl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PlaceDetectionAsyncChimeraService f120311a;

    public bidl(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService) {
        this.f120311a = placeDetectionAsyncChimeraService;
    }

    public final void run() {
        bidv bidv = this.f120311a.f151368a;
        bigx bigx = bidv.f120333h;
        bigx.f120561k.mo24801e();
        bigx.f120557g.mo34501a();
        bigx.f120556f.f120521n = bigx.f120575y;
        bigb bigb = bigx.f120559i;
        if (!bigb.f120494d) {
            bigb.f120494d = true;
            bigb.f120491a.mo24801e();
        }
        bigx.mo64604b();
        bhpw bhpw = bidv.f120331f.f119380b;
        bhxl bhxl = bhpw.f119279a;
        bhyd bhyd = bhxl.f119823b;
        bhyd.f119877h = true;
        bhyd.f119879j.f119893a.mo64426a();
        bhxl.f119825d = true;
        bicz bicz = bhpw.f119280b;
        bicz.f120270c.mo64603a(bicz);
    }
}
