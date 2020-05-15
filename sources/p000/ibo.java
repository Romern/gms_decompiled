package p000;

import android.os.Bundle;
import android.util.Patterns;

/* renamed from: ibo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibo {

    /* renamed from: a */
    public String f20686a;

    /* renamed from: b */
    public int f20687b = 0;

    /* renamed from: c */
    public byte[] f20688c = null;

    /* renamed from: d */
    public final Bundle f20689d = new Bundle();

    public ibo(String str) {
        sdo.m34977c(str);
        if (Patterns.WEB_URL.matcher(str).matches()) {
            this.f20686a = str;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("The supplied url [ ");
        sb.append(str);
        sb.append("] is not match Patterns.WEB_URL!");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo12893a(String str, String str2) {
        sdo.m34969a(str, (Object) "Header name cannot be null or empty!");
        Bundle bundle = this.f20689d;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(str, str2);
    }
}
