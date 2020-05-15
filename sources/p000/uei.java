package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;

/* renamed from: uei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uei {

    /* renamed from: a */
    public final uto f47353a;

    /* renamed from: b */
    public final vcy f47354b;

    public uei(uto uto, vcy vcy) {
        this.f47353a = uto;
        this.f47354b = vcy;
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
    /* renamed from: a */
    public final void mo27256a(boolean z, int i) {
        boolean z2;
        vdk vdk = (vdk) this.f47354b;
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125644b & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34971a(!z2, (Object) "Can't call setSyncMoreDetails twice");
        bxvd bxvd = vdk.f49080e;
        bxvd da = bkzj.f125600d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkzj bkzj = (bkzj) da.f164949b;
        int i2 = bkzj.f125602a | 2;
        bkzj.f125602a = i2;
        bkzj.f125604c = z;
        bkzj.f125602a = 1 | i2;
        bkzj.f125603b = i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzj bkzj2 = (bkzj) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzj2.getClass();
        bkzo.f125642J = bkzj2;
        bkzo.f125644b |= 2;
        try {
            this.f47353a.mo27950a(new OnSyncMoreResponse(z));
        } catch (RemoteException e) {
            uej.f47355f.mo25378c("SyncMoreOperation", "Unable to report sync more result.", e);
            vcv g = this.f47354b.mo28306g();
            g.mo28256b();
            g.mo28254a();
        }
        vcy vcy = this.f47354b;
        vcy.mo28307h();
        vcy.mo28274a();
    }
}
