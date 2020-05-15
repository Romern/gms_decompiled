package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: iei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iei {

    /* renamed from: a */
    public final Context f20795a;

    public iei(Context context) {
        this.f20795a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m15319a(Context context) {
        try {
            rfy.m33555l(context);
        } catch (rfw e) {
            throw new gid(e);
        } catch (rfv e2) {
            throw new gid(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r9 = new p000.iej(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r9 = (p000.iel) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r12 = r12.mo12950a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r7.mo25352a("com.google.android.gms.auth.APP_CERT", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        android.os.Binder.restoreCallingIdentity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r8 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r9 = r8.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ((r9 instanceof p000.iel) != false) goto L_0x0031;
     */
    /* renamed from: a */
    public final Object mo12951a(ieh ieh) {
        rex rex;
        sbq a;
        char c = 1;
        while (true) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                rex = new rex();
                a = sbq.m34856a(this.f20795a);
                if (a.mo25356a("com.google.android.gms.auth.APP_CERT", rex, "AppCertServiceClient")) {
                    IBinder a2 = rex.mo24567a();
                    break;
                }
                throw new IOException("Could not bind to service with the given context.");
            } catch (InterruptedException e) {
                if (c < 2) {
                    a.mo25352a("com.google.android.gms.auth.APP_CERT", rex);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    c = 2;
                } else {
                    Thread.currentThread().interrupt();
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Interrupted when getting service: ");
                    sb.append(valueOf);
                    Log.w("AppCertServiceClient", sb.toString());
                    throw new gid("Interrupted");
                }
            } catch (RemoteException e2) {
                Log.w("AppCertServiceClient", "RemoteException when executing call!", e2);
                throw new IOException("remote exception");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        }
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
    public final String mo12952a(String str) {
        sdo.m34973b("Calling this from your main thread can crash your app");
        sdo.m34966a((Object) str, (Object) "Package name cannot be null!");
        m15319a(this.f20795a);
        return (String) mo12951a(new ieg(str));
    }
}
