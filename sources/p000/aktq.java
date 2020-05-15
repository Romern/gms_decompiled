package p000;

import android.os.Looper;
import com.google.android.chimera.Activity;

/* renamed from: aktq */
final /* synthetic */ class aktq implements cijl {

    /* renamed from: a */
    private final Activity f72775a;

    public aktq(Activity activity) {
        this.f72775a = activity;
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
    public final Object mo6445a() {
        boolean z;
        Activity activity = this.f72775a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "TextRecognizer can't be loaded on the main thread.");
        return new avzu(activity).mo51763a();
    }
}
