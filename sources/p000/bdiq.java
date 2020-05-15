package p000;

import android.content.Context;

/* renamed from: bdiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdiq {

    /* renamed from: a */
    public static final bnrt f105702a = bnrt.m110178a("bdiq");

    /* renamed from: b */
    public volatile boolean f105703b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58074a(Context context, String str, boolean z) {
        if (!this.f105703b) {
            try {
                return aymn.m84269a(context.getContentResolver(), str, z);
            } catch (SecurityException e) {
                this.f105703b = true;
                bnrq bnrq = (bnrq) f105702a.mo68388c();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdiq", "a", 27, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Failed to read GServices.");
            }
        }
        return z;
    }
}
