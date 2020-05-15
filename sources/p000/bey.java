package p000;

import android.util.Log;

/* renamed from: bey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bey extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        bgb bgb;
        bgr bgr = bgs.f3191a;
        bfr bfr = new bfr();
        int i = 0;
        try {
            bfz bfz = new bfz((byte[]) bgr.mo3119a("COMMAND_APDU_BYTES", false), bfr);
            bfr.f3127b = 28160;
            bgb[] values = bgb.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    bgb = null;
                    break;
                }
                bgb = values[i];
                if (bfz.f3145a == bgb.f3162f) {
                    bfr.f3127b = 27904;
                    if (bfz.f3146b == bgb.f3163g) {
                        bfr.f3127b = -28672;
                        break;
                    }
                }
                i++;
            }
            if (bgb != null) {
                new bfr().f3127b = 28416;
                bgb.f3164h.f3155a = bet.m2847a();
                bfr a = bgb.f3164h.mo3097a(bfz);
                bgb.f3164h.mo3098a();
                bfr = a;
            }
        } catch (Exception e) {
            try {
                Log.e("core-hceclient", "::TokenAPDUDelegate::catch::", e);
                if (bfr.f3127b != 26368) {
                    bfr.f3127b = 28416;
                }
            } catch (Throwable th) {
                bgr.mo3121a("RESPONSE_APDU", bfr);
                throw th;
            }
        } catch (Throwable th2) {
            bgb.f3164h.mo3098a();
            throw th2;
        }
        bgr.mo3121a("RESPONSE_APDU", bfr);
    }
}
