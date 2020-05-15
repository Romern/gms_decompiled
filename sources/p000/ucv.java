package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.ControlProgressRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucv extends uci {

    /* renamed from: f */
    private static final sbw f47277f = new sbw("ControlProgressOperatio", "");

    /* renamed from: g */
    private final ControlProgressRequest f47278g;

    public ucv(ubk ubk, ControlProgressRequest controlProgressRequest, uto uto) {
        super("ControlProgressOperatio", ubk, uto, (String) twy.f46796G.mo58455c(), 56);
        this.f47278g = controlProgressRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubk.b(com.google.android.gms.drive.DriveId, boolean):boolean
     arg types: [com.google.android.gms.drive.DriveId, int]
     candidates:
      ubk.b(uey, com.google.android.gms.drive.DriveId):ujx
      ubk.b(com.google.android.gms.drive.DriveId, boolean):boolean */
    /* renamed from: c */
    public final void mo27231c(Context context) {
        boolean z;
        int i;
        boolean z2;
        aaal.m21020a(this.f47278g, "Invalid control progress request: no request");
        DriveId driveId = this.f47278g.f30828c;
        aaal.m21020a(driveId, "Invalid control progress request: no driveId");
        vcy vcy = this.f47239c;
        ControlProgressRequest controlProgressRequest = this.f47278g;
        int i2 = controlProgressRequest.f30826a;
        int i3 = controlProgressRequest.f30827b;
        vdk vdk = (vdk) vcy;
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setControlProgressDetails() twice");
        bxvd da = bkyu.f125508d.mo74144da();
        int i4 = 3;
        if (i2 == 0) {
            i = 2;
        } else if (i2 != 1) {
            vdk.f49076a.mo25374b("ImpressionLogEvent", "Unknown progress controller type: %d", Integer.valueOf(i2));
            i = 1;
        } else {
            i = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkyu bkyu = (bkyu) da.f164949b;
        bkyu.f125511b = i - 1;
        bkyu.f125510a |= 1;
        if (i3 == 0) {
            i4 = 2;
        } else if (i3 != 1) {
            if (i3 != 2) {
                vdk.f49076a.mo25374b("ImpressionLogEvent", "Unknown progress method code: %d", Integer.valueOf(i3));
                i4 = 1;
            } else {
                i4 = 4;
            }
        }
        bxvd bxvd = vdk.f49080e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkyu bkyu2 = (bkyu) da.f164949b;
        bkyu2.f125512c = i4 - 1;
        bkyu2.f125510a |= 2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkyu bkyu3 = (bkyu) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkyu3.getClass();
        bkzo.f125639G = bkyu3;
        bkzo.f125643a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        this.f47237a.mo27085a(this.f47239c, driveId);
        if (driveId.f30731d == 0) {
            ControlProgressRequest controlProgressRequest2 = this.f47278g;
            int i5 = controlProgressRequest2.f30826a;
            if (i5 == 0) {
                DriveId driveId2 = controlProgressRequest2.f30828c;
                int i6 = controlProgressRequest2.f30827b;
                if (i6 == 0) {
                    ubk ubk = this.f47237a;
                    uey j = ubk.mo27103j();
                    ubk.mo27096f(driveId2);
                    z2 = ubk.f47146g.mo27000a().mo27040a(j.f47394a, driveId2);
                } else if (i6 == 1) {
                    ubk ubk2 = this.f47237a;
                    uey j2 = ubk2.mo27103j();
                    ubk2.mo27096f(driveId2);
                    z2 = ubk2.f47146g.mo27000a().mo27044b(j2.f47394a, driveId2);
                } else if (i6 == 2) {
                    ubk ubk3 = this.f47237a;
                    uey j3 = ubk3.mo27103j();
                    ubk3.mo27096f(driveId2);
                    z2 = ubk3.f47146g.mo27000a().mo27046c(j3.f47394a, driveId2);
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Unknown method code: ");
                    sb.append(i6);
                    throw new aaaj(8, sb.toString());
                }
            } else if (i5 == 1) {
                DriveId driveId3 = controlProgressRequest2.f30828c;
                int i7 = controlProgressRequest2.f30827b;
                if (i7 == 0) {
                    throw new UnsupportedOperationException("Not supported");
                } else if (i7 == 1) {
                    z2 = this.f47237a.mo27089b(driveId3, true);
                } else if (i7 == 2) {
                    z2 = this.f47237a.mo27089b(driveId3, false);
                } else {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown method code: ");
                    sb2.append(i7);
                    throw new aaaj(8, sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Unknown controller type : ");
                sb3.append(i5);
                throw new aaaj(8, sb3.toString());
            }
            if (!z2) {
                Object[] objArr = new Object[2];
                ControlProgressRequest controlProgressRequest3 = this.f47278g;
                int i8 = controlProgressRequest3.f30826a;
                String str = "UNKNOWN";
                objArr[0] = i8 != 0 ? i8 != 1 ? str : "PIN" : "UPLOAD";
                int i9 = controlProgressRequest3.f30827b;
                if (i9 == 0) {
                    str = "CANCEL";
                } else if (i9 == 1) {
                    str = "PAUSE";
                } else if (i9 == 2) {
                    str = "RESUME";
                }
                objArr[1] = str;
                throw new aaaj(1510, String.valueOf(String.format("%s %s operation", objArr)).concat(" not applicable"));
            }
            try {
                this.f47238b.mo27971a();
            } catch (RemoteException e) {
                f47277f.mo25373b("ControlProgressOperatio", "Failed to report success to client", e);
                vcv g = this.f47239c.mo28306g();
                g.mo28256b();
                g.mo28254a();
            }
        } else {
            throw new aaaj(10, "Operation supports files only");
        }
    }
}
