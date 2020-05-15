package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: akvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvk {

    /* renamed from: a */
    private volatile boolean f72961a = false;

    /* renamed from: b */
    private final Context f72962b;

    /* renamed from: c */
    private final String f72963c;

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
    public final void mo39895a() {
        boolean z;
        if (!this.f72961a) {
            synchronized (this) {
                if (!this.f72961a) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34971a(z, (Object) "Should not load library on main thread");
                    ssj.m36231b(this.f72962b, this.f72963c);
                    this.f72961a = true;
                }
            }
        }
    }

    public akvk(Context context) {
        this.f72962b = context;
        this.f72963c = "google-ocrclient-v3";
    }
}
