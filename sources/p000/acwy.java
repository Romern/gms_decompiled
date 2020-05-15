package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: acwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acwy implements Comparable {

    /* renamed from: a */
    public String f60993a;

    /* renamed from: b */
    public String f60994b;

    /* renamed from: c */
    public Long f60995c;

    /* renamed from: d */
    public String f60996d = "";

    public acwy(Context context, String str, String str2, Long l) {
        try {
            String concat = String.valueOf(new File(String.valueOf(context.getFilesDir().getPath()).concat("/..")).getCanonicalPath()).concat("/");
            this.f60996d = concat;
            this.f60993a = str.split(concat)[1];
            this.f60994b = str2;
            this.f60995c = l;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            absg.m48191b(valueOf.length() == 0 ? new String("Error getting path of package directory: ") : "Error getting path of package directory: ".concat(valueOf));
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        acwy acwy = (acwy) obj;
        if (Long.valueOf(this.f60995c.longValue()).compareTo(Long.valueOf(acwy.f60995c.longValue())) == 0) {
            return this.f60993a.compareTo(acwy.f60993a);
        }
        return -Long.valueOf(this.f60995c.longValue()).compareTo(Long.valueOf(acwy.f60995c.longValue()));
    }

    public final String toString() {
        return String.format(Locale.US, " %10d bytes | %4s | %s", this.f60995c, this.f60994b, this.f60993a);
    }
}
