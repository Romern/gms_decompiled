package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: udh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udh extends uch {

    /* renamed from: f */
    private final GetDriveIdFromUniqueIdentifierRequest f47295f;

    public udh(ubk ubk, GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, uto uto) {
        super("GetDriveIdFromUniqueIdentifierOperation", ubk, uto, 9);
        this.f47295f = getDriveIdFromUniqueIdentifierRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhl.a(uey, java.lang.String, java.lang.String, boolean):java.util.List
     arg types: [uey, java.lang.String, java.lang.String, int]
     candidates:
      uhn.a(java.lang.String, java.lang.String, long, ukk):ulz
      uhn.a(uih, txr, long, long):void
      uhl.a(uey, java.lang.String, java.lang.String, boolean):java.util.List */
    /* renamed from: d */
    public final void mo27234d(Context context) {
        aaal.m21020a(this.f47295f, "Invalid request.");
        String str = this.f47295f.f30855a;
        if (str == null || str.isEmpty()) {
            throw new aaaj(10, "uniqueIdentifier cannot be null or empty.");
        }
        GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest = this.f47295f;
        if (getDriveIdFromUniqueIdentifierRequest.f30856b) {
            ubk ubk = this.f47237a;
            String str2 = getDriveIdFromUniqueIdentifierRequest.f30855a;
            if (ubk.f47143d.f47398e.contains(twt.f46773b)) {
                uhn uhn = ubk.f47144e;
                uey uey = ubk.f47143d;
                List a = uhn.mo27357a(uey, str2, uey.f47395b, true);
                DriveId driveId = null;
                if (!a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ubk.f47137a.mo25371b("Drive item not found, or you are not authorized to access it.");
                            break;
                        }
                        ujx ujx = (ujx) it.next();
                        if (!ujx.mo27523A()) {
                            driveId = ujx.mo27610g();
                            break;
                        }
                    }
                } else {
                    try {
                        ubk.f47147h.mo28208a(ubk.f47143d, str2, true, vks.f49399a);
                        uhn uhn2 = ubk.f47144e;
                        uey uey2 = ubk.f47143d;
                        ujx b = uhn2.mo27420b(uey2, str2, uey2.f47395b, true);
                        if (b != null) {
                            driveId = b.mo27610g();
                        } else {
                            ubk.f47137a.mo25371b("Drive item not found, or you are not authorized to access it.");
                        }
                    } catch (VolleyError e) {
                    } catch (gid e2) {
                        throw ubk.mo27106n();
                    }
                }
                if (driveId == null) {
                    this.f47238b.mo27107a(new Status(1502));
                } else {
                    this.f47238b.mo27945a(new OnDriveIdResponse(driveId));
                }
            } else {
                throw new aaaj(10, "The current scope of your application does not allow use of the App Folder");
            }
        } else {
            throw new aaaj(10, "Singletons are only supported in appFolder.");
        }
    }
}
