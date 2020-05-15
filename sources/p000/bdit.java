package p000;

import android.content.Context;

/* renamed from: bdit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdit implements bmzi {

    /* renamed from: a */
    private final Context f105708a;

    /* renamed from: b */
    private final bdiq f105709b = new bdiq();

    public bdit(Context context) {
        this.f105708a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        bdiq bdiq = this.f105709b;
        Context context = this.f105708a;
        boolean z = false;
        if (!bdiq.f105703b) {
            try {
                z = aymn.m84269a(context.getContentResolver(), "primes:shutdown_primes", false);
            } catch (SecurityException e) {
                bdiq.f105703b = true;
                bnrq bnrq = (bnrq) bdiq.f105702a.mo68388c();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdiq", "a", 27, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Failed to read GServices.");
            }
        }
        return Boolean.valueOf(z);
    }
}
