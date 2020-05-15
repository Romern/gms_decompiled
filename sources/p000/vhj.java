package p000;

import android.content.Context;
import java.io.File;

/* renamed from: vhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhj {
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
    public static final File m40438a(Context context) {
        File file = new File(context.getDatabasePath("ignored").getParentFile(), "realtime");
        if (!file.exists()) {
            sdo.m34971a(file.mkdirs(), (Object) "Unable to create Realtime database directory.");
        }
        return file;
    }
}
