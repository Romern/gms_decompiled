package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.OpenChannelResponse;

/* renamed from: ayif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayif extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97653c;

    /* renamed from: d */
    final /* synthetic */ String f97654d;

    /* renamed from: e */
    final /* synthetic */ axrs f97655e;

    /* renamed from: f */
    final /* synthetic */ ayja f97656f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayif(ayja ayja, String str, String str2, String str3, axrs axrs) {
        super(str);
        this.f97656f = ayja;
        this.f97653c = str2;
        this.f97654d = str3;
        this.f97655e = axrs;
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
    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97656f;
            axvr axvr = ayja.f97731j;
            axue axue = ayja.f97726e;
            String str = this.f97653c;
            String str2 = this.f97654d;
            ayig ayig = new ayig(this.f97655e);
            ayem ayem = ayem.ORIGIN_CHANNEL_API;
            if (Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", String.format("Posting createChannel(%s, %s, %s, callbacks)", axue.f96377a, str, str2));
            }
            sdo.checkIfNull(axue, "appKey");
            sdo.checkIfNull((Object) str, (Object) "nodeId");
            sdo.checkIfNull((Object) str2, (Object) "path");
            sdo.checkIfNull(ayig, "callback");
            axvr.mo53625a(new axuz(axvr, axue, str, str2, ayig, ayem));
        } catch (RuntimeException e) {
            Log.w("WearableService", "openChannel: exception during processing", e);
            this.f97655e.mo53457a(new OpenChannelResponse(8, null));
        }
    }
}
