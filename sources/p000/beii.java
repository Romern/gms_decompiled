package p000;

import android.net.Uri;

/* renamed from: beii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beii {
    /* renamed from: a */
    public static Uri m95136a(Uri uri, bznx bznx) {
        bngs j = bngx.m109377j();
        bngx a = behf.m95041a(uri);
        String a2 = beij.m95137a(bznx);
        String a3 = behf.m95042a(a2);
        bnre i = a.listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            if (!behf.m95042a(str).equals(a3)) {
                j.mo67668c(str);
            }
        }
        j.mo67668c(a2);
        return uri.buildUpon().encodedFragment(behf.m95043a(j.mo67664a())).build();
    }
}
