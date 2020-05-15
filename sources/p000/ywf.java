package p000;

import android.text.TextUtils;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: ywf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywf {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static bngx m44940a(Collection r4) {
        bngs b = bngx.m109371b(r4.size());
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            b.mo67668c(m44942a((cadz) r4.get(i)));
        }
        return b.mo67664a();
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
    public static cadz m44941a(Session session) {
        long j;
        String str = null;
        if (session == null) {
            return null;
        }
        bxvd da = cadz.f172773j.mo74144da();
        String str2 = session.f32169d;
        bmxy.m108587a(str2, "session require identifier: %s", session);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz = (cadz) da.f164949b;
        str2.getClass();
        boolean z = true;
        cadz.f172775a |= 1;
        cadz.f172776b = str2;
        String b = bmxx.m108578b(session.f32168c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz2 = (cadz) da.f164949b;
        b.getClass();
        cadz2.f172775a |= 2;
        cadz2.f172777c = b;
        String b2 = bmxx.m108578b(session.f32170e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz3 = (cadz) da.f164949b;
        b2.getClass();
        cadz3.f172775a |= 4;
        cadz3.f172778d = b2;
        long a = session.mo18972a(TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz4 = (cadz) da.f164949b;
        cadz4.f172775a |= 8;
        cadz4.f172779e = a;
        long convert = TimeUnit.MILLISECONDS.convert(session.f32167b, TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz5 = (cadz) da.f164949b;
        int i = cadz5.f172775a | 16;
        cadz5.f172775a = i;
        cadz5.f172780f = convert;
        int i2 = session.f32171f;
        cadz5.f172775a = i | 128;
        cadz5.f172782h = i2;
        Application application = session.f32172g;
        if (application != null) {
            str = application.f31980b;
        }
        if (str != null) {
            bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
            if (bzzy.f164950c) {
                bzzy.mo74035c();
                bzzy.f164950c = false;
            }
            bzzz bzzz = (bzzz) bzzy.f164949b;
            str.getClass();
            bzzz.f172300a |= 1;
            bzzz.f172301b = str;
            bzzz bzzz2 = (bzzz) bzzy.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cadz cadz6 = (cadz) da.f164949b;
            bzzz2.getClass();
            cadz6.f172781g = bzzz2;
            cadz6.f172775a |= 64;
        }
        if (session.f32173h != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (session.f32173h == null) {
                z = false;
            }
            sdo.m34971a(z, (Object) "Active time is not set");
            j = timeUnit.convert(session.f32173h.longValue(), TimeUnit.MILLISECONDS);
        } else {
            j = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cadz cadz7 = (cadz) da.f164949b;
        cadz7.f172775a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cadz7.f172783i = j;
        return (cadz) da.mo74062i();
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
    public static Session m44942a(cadz cadz) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if ((cadz.f172775a & 64) == 0) {
            str = "unknown";
        } else {
            bzzz bzzz = cadz.f172781g;
            if (bzzz == null) {
                bzzz = bzzz.f172298f;
            }
            str = bzzz.f172301b;
        }
        yxo yxo = new yxo();
        boolean z5 = true;
        if (!cadz.f172776b.isEmpty()) {
            String str2 = cadz.f172776b;
            if (str2 == null || TextUtils.getTrimmedLength(str2) <= 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            sdo.m34974b(z4);
            yxo.f54778d = str2;
        }
        if (!cadz.f172777c.isEmpty()) {
            String str3 = cadz.f172777c;
            sdo.m34976b(str3.length() <= 100, "Session name cannot exceed %d characters", 100);
            yxo.f54777c = str3;
        }
        if (!cadz.f172778d.isEmpty()) {
            String str4 = cadz.f172778d;
            if (str4.length() <= 1000) {
                z3 = true;
            } else {
                z3 = false;
            }
            sdo.m34976b(z3, "Session description cannot exceed %d characters", 1000);
            yxo.f54779e = str4;
        }
        long j = cadz.f172779e;
        if (j > 0) {
            if (j > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            sdo.m34971a(z2, (Object) "Start time should be positive.");
            yxo.f54775a = timeUnit.toMillis(j);
        }
        long j2 = cadz.f172780f;
        if (j2 > 0) {
            if (j2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            sdo.m34971a(z, (Object) "End time should be positive.");
            yxo.f54776b = timeUnit2.toMillis(j2);
        }
        long j3 = cadz.f172783i;
        if (j3 > 0) {
            yxo.f54782h = Long.valueOf(TimeUnit.MILLISECONDS.toMillis(j3));
        }
        int i = cadz.f172782h;
        if (i != 4) {
            yxo.f54780f = i;
        }
        yxo.f54781g = Application.m23661a(str);
        sdo.m34971a(yxo.f54775a > 0, (Object) "Start time should be specified.");
        long j4 = yxo.f54776b;
        if (j4 != 0 && j4 <= yxo.f54775a) {
            z5 = false;
        }
        sdo.m34971a(z5, (Object) "End time should be later than start time.");
        if (yxo.f54778d == null) {
            String str5 = yxo.f54777c;
            if (str5 == null) {
                str5 = "";
            }
            long j5 = yxo.f54775a;
            StringBuilder sb = new StringBuilder(str5.length() + 20);
            sb.append(str5);
            sb.append(j5);
            yxo.f54778d = sb.toString();
        }
        return new Session(yxo.f54775a, yxo.f54776b, yxo.f54777c, yxo.f54778d, yxo.f54779e, yxo.f54780f, yxo.f54781g, yxo.f54782h);
    }
}
