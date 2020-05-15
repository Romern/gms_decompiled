package p000;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: muh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class muh {

    /* renamed from: a */
    private static final lvn f34767a = new lvn("BackUpNowHelper");

    /* renamed from: b */
    private final Map f34768b = new HashMap();

    /* renamed from: c */
    private int f34769c;

    /* renamed from: a */
    public final synchronized void mo20250a() {
        this.f34769c++;
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
    /* renamed from: b */
    public final synchronized void mo20255b() {
        sdo.m34971a(this.f34769c > 0, (Object) "Attempted to remove an operation, but no operation is running.");
        this.f34769c--;
    }

    /* renamed from: c */
    public final synchronized int mo20256c() {
        return this.f34769c;
    }

    /* renamed from: a */
    public final synchronized void mo20251a(int i) {
        for (lud lud : this.f34768b.values()) {
            try {
                lud.mo19602a(i);
            } catch (RemoteException e) {
                f34767a.mo25415d("Remote exception while calling callbacks", e, new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo20252a(int i, int i2) {
        for (lud lud : this.f34768b.values()) {
            try {
                lud.mo19603a(i, i2);
            } catch (RemoteException e) {
                f34767a.mo25415d("Remote exception while calling callbacks", e, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20253a(String str) {
        f34767a.logVerbose("Removing callbacks, id = %s", str);
        this.f34768b.remove(str);
    }

    /* renamed from: a */
    public final synchronized void mo20254a(String str, lud lud) {
        f34767a.logVerbose("Registering callbacks, id = %s", str);
        this.f34768b.put(str, lud);
    }
}
