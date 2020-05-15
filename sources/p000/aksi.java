package p000;

import android.os.Looper;
import com.google.android.chimera.Activity;

/* renamed from: aksi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aksi implements cijl {

    /* renamed from: a */
    final /* synthetic */ Activity f72627a;

    /* renamed from: b */
    final /* synthetic */ aksj f72628b;

    public aksi(aksj aksj, Activity activity) {
        this.f72628b = aksj;
        this.f72627a = activity;
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
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "TextRecognizer can't be loaded on the main thread.");
        avzv a = new avzu(this.f72627a).mo51763a();
        if (a.mo51712b()) {
            this.f72628b.f72429h.mo39797z();
        }
        return a;
    }
}
