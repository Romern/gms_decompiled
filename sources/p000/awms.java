package p000;

import android.os.Message;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerInitializeRequest;

/* renamed from: awms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awms implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awmv f94634a;

    public awms(awmv awmv) {
        this.f94634a = awmv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public final void run() {
        awmv awmv = this.f94634a;
        awmv.mo52808n(false);
        awmv.f94648l = false;
        bxvd da = bmru.f130581d.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmru bmru = (bmru) da.f164949b;
        a.getClass();
        bmru.f130584b = a;
        bmru.f130583a |= 1;
        bxtx a2 = bxtx.m123261a(awmv.f94647k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmru bmru2 = (bmru) da.f164949b;
        a2.getClass();
        bmru2.f130583a |= 4;
        bmru2.f130585c = a2;
        bmru bmru3 = (bmru) da.mo74062i();
        awmv.mo52864a(bmru3, 2);
        awmv.mo52900j(2);
        awou awou = (awou) awmv.mo52839Y().f94357a;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!awou.mo52425a(bmru3)) {
            Message.obtain(awou.f94784u, 55, new InstrumentManagerInitializeRequest(awou.f94765b, bmru3)).sendToTarget();
        }
    }
}
