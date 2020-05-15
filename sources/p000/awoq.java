package p000;

import android.os.Message;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;

/* renamed from: awoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awoq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awot f94749a;

    public awoq(awot awot) {
        this.f94749a = awot;
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
        this.f94749a.mo52808n(false);
        this.f94749a.f94760i = false;
        bxvd da = bmrb.f130459e.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrb bmrb = (bmrb) da.f164949b;
        a.getClass();
        bmrb.f130464d = a;
        bmrb.f130461a |= 1;
        byte[] bArr = this.f94749a.f94762k;
        if (bArr != null) {
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmrb bmrb2 = (bmrb) da.f164949b;
            a2.getClass();
            bmrb2.f130462b = 3;
            bmrb2.f130463c = a2;
        }
        this.f94749a.mo52864a(da.mo74062i(), 2);
        this.f94749a.mo52900j(2);
        awou awou = (awou) this.f94749a.mo52839Y().f94357a;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        Message.obtain(awou.f94784u, 39, new GenericSelectorInitializeRequest(awou.f94765b, (bmrb) da.mo74062i())).sendToTarget();
    }
}
