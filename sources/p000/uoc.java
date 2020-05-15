package p000;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: uoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uoc {

    /* renamed from: a */
    public final HashMap f48380a = new LinkedHashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f48380a.entrySet()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String str = (String) entry.getValue();
            String str2 = (String) entry.getKey();
            sb.append(str);
            if (!str.equals(str2)) {
                sb.append(" AS '");
                sb.append(str2);
                sb.append("'");
            }
        }
        return sb.toString();
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
    public final void mo27755a(String str, String str2) {
        boolean z;
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        if (this.f48380a.containsKey(str2)) {
            z = ((String) this.f48380a.get(str2)).equals(str);
        } else {
            z = true;
        }
        sdo.m34971a(z, (Object) String.format("Invalid duplicate alias %s", str2));
        this.f48380a.put(str2, str);
    }

    /* renamed from: a */
    public final void mo27756a(vpj vpj, String str) {
        mo27755a(((unm) vpj).f48329f.mo27700a(), str);
    }

    /* renamed from: a */
    public final void mo27757a(vpj vpj, uvy uvy) {
        mo27755a(((ukm) vpj).f48022aB.mo27700a(), uvy.mo28084a());
    }
}
