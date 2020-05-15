package p000;

import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;

/* renamed from: apfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apfg {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static int m70150a(String str) {
        char c;
        switch (str.hashCode()) {
            case -790991584:
                if (str.equals("contacts_restore_settings")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -151171484:
                if (str.equals("SUW_Restore")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 883869909:
                if (str.equals("CONTACTS_APP_NOTIFICATION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1200407144:
                if (str.equals("Google-Guide")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 4;
        }
        if (c == 1) {
            return 6;
        }
        if (c != 2) {
            return c != 3 ? 2 : 8;
        }
        return 7;
    }

    /* renamed from: a */
    static void m70151a(int i, apfb apfb) {
        aoyj.m69819a().mo46991a(i, apfb.mo47147a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aozc.a(btem, java.lang.String, boolean):void
     arg types: [btem, java.lang.String, int]
     candidates:
      aozc.a(btem, java.lang.String, apfc):void
      aozc.a(btem, java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* renamed from: a */
    static boolean m70152a(apfc apfc, Context context, aoyo aoyo, btem btem, String str, String str2, String str3, aoyh aoyh) {
        boolean z = true;
        try {
            aozc a = aozd.m69896a(context, m70150a(str));
            if (apfc == null) {
                a.mo47033a(btem, str2, false);
            } else {
                a.mo47032a(btem, str2, apfc);
            }
            try {
                apet.m70119a(context, str3, System.currentTimeMillis());
            } catch (RemoteException e) {
                e = e;
            } catch (OperationApplicationException e2) {
                e = e2;
                aoyo.mo47009a(e, cgjy.m145765l());
                aoyh.mo46980a(e, "Failed to write contacts to CP2.");
                aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
                return z;
            } catch (RuntimeException e3) {
                e = e3;
                aoyo.mo47009a(e, cgjy.m145766m());
                aoyh.mo46980a(e, "Failed to restore contacts due to runtime exception.");
                aoyj a2 = aoyj.m69819a();
                String valueOf = String.valueOf(e.getMessage());
                a2.mo46996a(valueOf.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf));
                return z;
            }
        } catch (RemoteException e4) {
            e = e4;
            z = false;
            aoyo.mo47009a(e, cgjy.m145765l());
            aoyh.mo46980a(e, "Contacts write failed during the execution of a remote method.");
            aoyj.m69819a().mo46996a("restore_error:cp2_remote_exception");
            return z;
        } catch (OperationApplicationException e5) {
            e = e5;
            z = false;
            aoyo.mo47009a(e, cgjy.m145765l());
            aoyh.mo46980a(e, "Failed to write contacts to CP2.");
            aoyj.m69819a().mo46996a("restore_error:cp2_operation_exception");
            return z;
        } catch (RuntimeException e6) {
            e = e6;
            z = false;
            aoyo.mo47009a(e, cgjy.m145766m());
            aoyh.mo46980a(e, "Failed to restore contacts due to runtime exception.");
            aoyj a22 = aoyj.m69819a();
            String valueOf2 = String.valueOf(e.getMessage());
            a22.mo46996a(valueOf2.length() != 0 ? new String("restore_error:runtime_error:") : "restore_error:runtime_error:".concat(valueOf2));
            return z;
        }
        return z;
    }
}
