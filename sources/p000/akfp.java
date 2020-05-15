package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akfp */
final /* synthetic */ class akfp implements Runnable {

    /* renamed from: a */
    private final akgy f71821a;

    /* renamed from: b */
    private final byte[] f71822b;

    /* renamed from: c */
    private final akdd f71823c;

    /* renamed from: d */
    private final String f71824d;

    public akfp(akgy akgy, byte[] bArr, akdd akdd, String str) {
        this.f71821a = akgy;
        this.f71822b = bArr;
        this.f71823c = akdd;
        this.f71824d = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget
     arg types: [akce, int]
     candidates:
      akgy.a(java.lang.String, java.util.concurrent.Callable):int
      akgy.a(akdd, ajnv):ajnw
      akgy.a(ajnm, byte[]):akgr
      akgy.a(android.content.Intent, com.google.android.gms.nearby.sharing.FileAttachment):android.content.Intent
      akgy.a(long, akdd):void
      akgy.a(akdd, ajne):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, int):void
      akgy.a(java.util.List, long):boolean
      akgy.a(byte, byte[]):byte[]
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud):ajud
      akgy.a(java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(java.lang.Runnable, long):java.util.concurrent.ScheduledFuture
      akgy.a(ajsn, akbz):void
      akgy.a(ajud, com.google.android.gms.nearby.sharing.ShareTarget):void
      akgy.a(com.google.android.gms.nearby.sharing.Attachment, long):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, java.lang.String):void
      akgy.a(java.lang.String, int):void
      akgy.a(java.lang.String, java.lang.Exception):void
      akgy.a(java.lang.String, byte[]):void
      akcd.a(ajsn, akbz):void
      akdr.a(java.lang.String, int):void
      akdr.a(java.lang.String, byte[]):void
      akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget */
    public final void run() {
        String str;
        akgy akgy = this.f71821a;
        byte[] bArr = this.f71822b;
        akdd akdd = this.f71823c;
        String str2 = this.f71824d;
        akgy.f71954u = (long) ajvg.m59094a();
        akgy.f71945l.clear();
        ajud ajud = akgy.f71942i;
        if (ajud == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 531, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring incoming connection from endpoint %s because we're no longer advertising. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        akce a = akce.m59343a(bArr);
        if (a == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akgy", "a", 541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse incoming connection from endpoint %s. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        ShareTarget a2 = akgy.mo39374a(a, true);
        if (a2 == null) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akgy", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to convert advertisement %s to share target from incoming connection. Disconnecting.", akid.m59793b(bArr));
            akdd.mo39253b();
            return;
        }
        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl4.mo68432a("akgy", "a", 560, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68420a("Received incoming connection from %s", a2);
        akgy.mo39410h(a2).f71892c = akdd;
        ajud a3 = akgy.mo39370a(ajud);
        akgy.mo39410h(a2).f71893d = a3;
        akgy.mo39410h(a2).f71890a = str2;
        akdd.mo39250a(new akfu(akgy, a2));
        byte[] d = akgy.f71940g.mo39300d(str2);
        if (d != null) {
            str = akid.m59794c(d);
        } else {
            str = null;
        }
        ajnv ajnv = ajnv.UNKNOWN_FRAME_TYPE;
        ajnz ajnz = ajnz.UNKNOWN_SECURITY_TYPE;
        akgr akgr = akgr.SUCCESS;
        int ordinal = akgy.mo39406f(a2).ordinal();
        if (ordinal == 0) {
            bnsl bnsl5 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl5.mo68432a("akgy", "a", 586, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Paired key handshake succeeded when receiving connection from %s.", a2);
            akgy.f71940g.mo39303f(str2);
            akgy.mo39384a(a2, (String) null);
            if (akgy.f71940g.mo39302e(str2)) {
                akgy.mo39404e(a2);
            }
        } else if (ordinal == 1) {
            bnsl bnsl6 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl6.mo68432a("akgy", "a", 578, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Paired key handshake failed when receiving connection from %s. Disconnecting.", a2);
            akdd.mo39253b();
            return;
        } else if (ordinal == 2) {
            bnsl bnsl7 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl7.mo68432a("akgy", "a", 602, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68420a("Unable to verify paired key encryption when receiving connection from %s. Verify tokens on devices.", a2);
            if (akgy.f71940g.mo39302e(str2)) {
                akgy.f71940g.mo39303f(str2);
                akgy.mo39384a(a2, (String) null);
            } else {
                akgy.mo39410h(a2).f71894f = str;
                akgy.mo39384a(a2, str);
            }
        }
        akdd.mo39250a(new akfv(akgy, a3, a2));
    }
}
