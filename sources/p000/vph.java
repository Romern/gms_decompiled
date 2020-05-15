package p000;

import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Date;
import java.util.List;

/* renamed from: vph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vph {

    /* renamed from: a */
    private static final sbw f49711a = new sbw("PermissionHelper", "");

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[RETURN] */
    /* renamed from: a */
    public static int m41008a(Permission permission) {
        char c;
        String str = permission.f31043h;
        int hashCode = str.hashCode();
        if (hashCode != -934979389) {
            if (hashCode != -779574157) {
                if (hashCode == 106164915 && str.equals("owner")) {
                    c = 0;
                    if (c != 0) {
                        return 3;
                    }
                    if (c == 1) {
                        return 2;
                    }
                    if (c != 2) {
                        f49711a.mo25375b("Unknown permission role received: %s", permission.f31043h);
                        return -1;
                    }
                    List list = permission.f31037b;
                    return (list == null || !list.contains("commenter")) ? 0 : 1;
                }
            } else if (str.equals("writer")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("reader")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static int m41013b(Permission permission) {
        char c;
        String str = permission.f31044i;
        switch (str.hashCode()) {
            case -1412637446:
                if (str.equals("anyone")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1326197564:
                if (str.equals("domain")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3599307:
                if (str.equals("user")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98629247:
                if (str.equals("group")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (c == 2) {
            return 257;
        }
        if (c == 3) {
            return 258;
        }
        f49711a.mo25375b("Unknown permission type received: %s", permission.f31044i);
        return -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public static String m41014c(Permission permission) {
        char c;
        String str = permission.f31044i;
        switch (str.hashCode()) {
            case -1412637446:
                if (str.equals("anyone")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1326197564:
                if (str.equals("domain")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3599307:
                if (str.equals("user")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98629247:
                if (str.equals("group")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return permission.f31039d;
        }
        if (c == 2) {
            return permission.f31038c;
        }
        if (c != 3) {
            f49711a.mo25375b("Unknown permission type received: %s", permission.f31044i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m41009a(uih uih, ujx ujx, String str, int i, int i2, int i3) {
        if (ujx.mo27573ai()) {
            throw new aaaj(10, "Cannot modify permissions of App Folder or files inside App Folder.");
        } else if (ujx.mo27621j() && uih.f47682a.equals(str)) {
            throw new aaaj(10, "Owner cannot modify their own permission.");
        } else if (ujx.mo27623k() && !ujx.mo27547Y()) {
            throw new aaaj(1509, "User is not authorized to modify permissions to the Drive resource.");
        } else if (!"reader".equals(ujx.f47825a.f47888Q)) {
            if (i == 3) {
                if (i3 != 256) {
                    throw new aaaj(10, "Only an account of type user can be set as an owner of Drive resource.");
                } else if (!ujx.mo27621j()) {
                    throw new aaaj(1509, "User is not authorized to set owner of the Drive resource.");
                }
            }
            if (i2 == 3) {
                throw new aaaj(10, "Permission of the owner cannot be modified.");
            }
        } else {
            throw new aaaj(1509, "User is not authorized to modify permissions to the Drive resource.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(ujx, ukt, boolean, long):void
     arg types: [ujx, ukt, int, long]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(uhn, uih, long, boolean):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void */
    /* renamed from: a */
    public static void m41010a(ujx ujx, ukt ukt, long j) {
        ula e = ukt.mo27665e();
        if (e.mo27683a()) {
            e.mo27680a(j);
        } else {
            e.mo27682a(ujx.mo27548Z(), j);
        }
        ujx.mo27619j("reader");
        vpb.m40990a(ujx, ukt, false, j);
    }

    /* renamed from: a */
    public static void m41011a(ujx ujx, ukt ukt, long j, String str) {
        ula e = ukt.mo27665e();
        if (e.mo27683a()) {
            e.mo27680a(j);
        } else {
            e.mo27682a(ujx.mo27548Z(), j);
        }
        ujx.mo27619j("writer");
        ula ula = ukt.f48056d;
        if (ula.mo27683a()) {
            ula.mo27680a(j);
        } else {
            ula.mo27682a(ujx.mo27544V(), j);
        }
        ujx.mo27590c(0);
        ula m = ukt.mo27673m();
        if (m.mo27683a()) {
            m.mo27680a(j);
        } else {
            m.mo27682a(ujx.mo27528F(), j);
        }
        ujx.mo27599d(new Date());
        ula ula2 = ukt.f48057e;
        if (ula2.mo27683a()) {
            ula2.mo27680a(j);
        } else {
            ula2.mo27682a(ujx.mo27541S(), j);
        }
        ujx.mo27554a(bngx.m109356a(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(uhn, uih, long, boolean):void
     arg types: [uhn, uih, long, int]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void
      vpb.a(uhn, uih, long, boolean):void */
    /* renamed from: a */
    public static void m41012a(vpu vpu, uih uih, ukk ukk, long j, String str, Permission permission) {
        uhn uhn = vpu.f49757d;
        sdo.m34970a(!uhn.mo27382b());
        uhn.mo27435d();
        try {
            ujx a = uhn.mo27402a(uey.m38255a(uih), ukk);
            ukc a2 = uhn.mo27403a(a, str);
            if (a2 == null) {
                f49711a.mo25374b("PermissionHelper", "Permission removed before actionId: %d was completed.", Long.valueOf(j));
            } else {
                if (permission == null) {
                    a2.mo27645a(uhn);
                    if (uih.f47682a.equals(str)) {
                        a.mo27534L();
                    }
                } else {
                    a2.mo27646a(uhn, permission);
                }
                uhn.mo27442f();
            }
        } catch (uaa e) {
        } catch (Throwable th) {
            uhn.mo27439e();
            throw th;
        }
        uhn.mo27439e();
        vpb.m40987a(uhn, uih, j, false);
    }
}
