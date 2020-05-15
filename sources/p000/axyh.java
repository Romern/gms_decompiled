package p000;

/* renamed from: axyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axyh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axyi f96763a;

    public axyh(axyi axyi) {
        this.f96763a = axyi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public final void run() {
        boolean z;
        axyi axyi = this.f96763a;
        synchronized (axyi.f96770g) {
            z = true;
            if (!axyi.f96769f) {
                int i = axyi.f96768e;
                if (i != 0) {
                    axyi.f96768e = i - 1;
                    aybf aybf = axyi.f96771h.f96774b;
                    Object obj = axyi.f96764a;
                    ayai ayai = aybf.f97023a;
                    axvz axvz = ((aybg) obj).f97024a;
                    axue axue = axvz.f96540b;
                    String str = axvz.f96539a;
                    ayen ayen = ((aybg) obj).f97025b;
                    sdo.checkIfNull(axue, "appKey was null");
                    sdo.checkIfNull((Object) str, (Object) "target was null");
                    sdo.checkIfNull(ayen, "channelRequest was null");
                    ayai.mo53831a(axue, str, false, "", null, ayen);
                    axyi.f96771h.f96773a.mo53762a(axyi.f96766c, axyi.f96765b);
                    z = false;
                } else {
                    axyi.f96769f = true;
                    axyi.f96764a = null;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                axyi.f96767d.mo53611a(axyi);
            } finally {
                axyi.f96771h.f96775c.mo54000a();
            }
        }
    }
}
