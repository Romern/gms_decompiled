package p000;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mem {

    /* renamed from: b */
    private static final lvn f33516b = new lvn("D2dFileWriteTracker");

    /* renamed from: a */
    public final mcb f33517a;

    /* renamed from: c */
    private final Context f33518c;

    /* renamed from: d */
    private final Map f33519d = new HashMap();

    public mem(Context context) {
        mcb mcb = new mcb(context);
        this.f33518c = context;
        this.f33517a = mcb;
    }

    /* renamed from: a */
    private final synchronized void m24908a(String str, boolean z) {
        men men = (men) this.f33519d.remove(str);
        if (men == null) {
            String valueOf = String.valueOf(str);
            throw new mpz(valueOf.length() == 0 ? new String("Complete called on unexpected package: ") : "Complete called on unexpected package: ".concat(valueOf));
        }
        try {
            men.f33521b.join(5000);
            boolean a = men.f33521b.mo19882a();
            if (!z || !a) {
                throw new mpz(String.format("For package %s  localSuccess=%s  remoteSuccess=%s ; calling onFailure()", str, Boolean.valueOf(a), Boolean.valueOf(z)));
            }
            f33516b.mo25412b("Transfer success for package: %s; now renaming temp file", str);
            if (!men.f33520a.renameTo(this.f33517a.mo19847b(str))) {
                f33516b.mo25418e("Couldn't move temp file to restore dir %s for package %s", men.f33520a.getPath(), str);
                String valueOf2 = String.valueOf(str);
                throw new mpz(valueOf2.length() == 0 ? new String("Couldn't move temp file to restore directory, package: ") : "Couldn't move temp file to restore directory, package: ".concat(valueOf2));
            }
            men.mo19881a();
            men.f33520a.delete();
        } catch (InterruptedException e) {
            String valueOf3 = String.valueOf(str);
            throw new mpz(valueOf3.length() == 0 ? new String("Timeout while waiting for write thread to finish for package: ") : "Timeout while waiting for write thread to finish for package: ".concat(valueOf3), e);
        } catch (Throwable th) {
            men.mo19881a();
            men.f33520a.delete();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mem.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      mem.a(java.lang.String, java.io.InputStream):void
      mem.a(java.lang.String, boolean):void */
    /* renamed from: b */
    public final synchronized void mo19880b(String str) {
        m24908a(str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mem.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      mem.a(java.lang.String, java.io.InputStream):void
      mem.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final synchronized void mo19878a(String str) {
        m24908a(str, true);
    }

    /* renamed from: a */
    public final synchronized void mo19879a(String str, InputStream inputStream) {
        if (((men) this.f33519d.get(str)) != null) {
            String valueOf = String.valueOf(str);
            throw new mpz(valueOf.length() == 0 ? new String("Package already open for write: ") : "Package already open for write: ".concat(valueOf));
        }
        try {
            Context context = this.f33518c;
            String valueOf2 = String.valueOf(str);
            men men = new men(mce.m24857a(context, valueOf2.length() == 0 ? new String("backupdata_tmp.") : "backupdata_tmp.".concat(valueOf2)), inputStream);
            men.f33521b.start();
            this.f33519d.put(str, men);
        } catch (FileNotFoundException e) {
            String valueOf3 = String.valueOf(str);
            throw new mpz(valueOf3.length() == 0 ? new String("Unable to open d2d file for write: ") : "Unable to open d2d file for write: ".concat(valueOf3), e);
        }
    }
}
