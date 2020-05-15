package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnFetchThumbnailResponse;
import java.io.IOException;

/* renamed from: udc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1595udc implements ufx {

    /* renamed from: a */
    final /* synthetic */ udd f47289a;

    public C1595udc(udd udd) {
        this.f47289a = udd;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhn.a(ujx, boolean):java.lang.String
     arg types: [ujx, int]
     candidates:
      uhn.a(uih, com.google.android.gms.drive.DriveId):java.lang.String
      uhn.a(uih, uzz):java.util.List
      uhn.a(long, java.lang.String):uey
      uhn.a(uih, long):uig
      uhn.a(uey, com.google.android.gms.drive.DriveId):ujx
      uhn.a(uey, java.lang.String):ujx
      uhn.a(uey, ukk):ujx
      uhn.a(ujx, java.lang.String):ukc
      uhl.a(uey, ujx):java.util.Set
      uhl.a(uih, java.lang.String):ujp
      uhl.a(ujx, long):void
      uhl.a(ujx, java.util.Set):void
      uhl.a(ukg, boolean):void
      uhl.a(ukk, long):void
      uhl.a(uey, uif):boolean
      uhn.a(ujx, boolean):java.lang.String */
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
    public final void mo27242a(int i) {
        boolean z;
        if (ufy.m38299a(i)) {
            String str = null;
            if (ufy.m38300b(i)) {
                udd udd = this.f47289a;
                boolean c = ufy.m38301c(i);
                try {
                    ubk ubk = udd.f47237a;
                    ujx a = ubk.mo27078a(ubk.f47143d, udd.f47291f.f30847a);
                    if (a != null) {
                        str = ubk.f47144e.mo27390a(a, true);
                    }
                    if (str != null) {
                        ParcelFileDescriptor a2 = udd.f47237a.f47142c.f49764k.mo27279a(str);
                        if (a2 == null) {
                            udd.mo27244b(new Status(8, "Failed to open downloaded thumbnail"));
                        } else {
                            vcy vcy = udd.f47239c;
                            int statSize = (int) a2.getStatSize();
                            ((vdk) vcy).mo28330k();
                            if ((((bkzo) ((vdk) vcy).f49080e.f164949b).f125643a & 2097152) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sdo.m34971a(!z, (Object) "Can't call setFetchThumbnailDetails() twice");
                            bxvd bxvd = ((vdk) vcy).f49080e;
                            bxvd da = bkyz.f125536d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bkyz bkyz = (bkyz) da.f164949b;
                            int i2 = 1 | bkyz.f125538a;
                            bkyz.f125538a = i2;
                            bkyz.f125539b = statSize;
                            bkyz.f125538a = i2 | 2;
                            bkyz.f125540c = c;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bkzo bkzo = (bkzo) bxvd.f164949b;
                            bkyz bkyz2 = (bkyz) da.mo74062i();
                            bkzo bkzo2 = bkzo.f125631K;
                            bkyz2.getClass();
                            bkzo.f125666x = bkyz2;
                            bkzo.f125643a |= 2097152;
                            try {
                                udd.f47238b.mo27977a(new OnFetchThumbnailResponse(a2));
                            } catch (RemoteException e) {
                                vcv g = udd.f47239c.mo28306g();
                                g.mo28256b();
                                g.mo28254a();
                            }
                        }
                    } else {
                        throw new aaaj(1502, "Thumbnail not found, or you are not authorized to access it.");
                    }
                } catch (IOException e2) {
                    udd.mo27244b(new Status(8, "Failed to open downloaded thumbnail"));
                } catch (aaaj e3) {
                    udd.mo27244b(e3.f27843a);
                }
            } else {
                this.f47289a.mo27244b(new Status(ufy.m38302d(i), "Error downloading thumbnail", null));
            }
            vcy vcy2 = this.f47289a.f47239c;
            vcy2.mo28307h();
            vcy2.mo28274a();
        }
    }

    /* renamed from: a */
    public final void mo27243a(long j, long j2) {
    }
}
