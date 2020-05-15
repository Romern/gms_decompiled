package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: gcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gcs extends rjx {

    /* renamed from: a */
    public static final /* synthetic */ int f17888a = 0;

    /* renamed from: b */
    private static final rjo f17889b = new rjo("AudioModem.API", new C1013gcm(), new rje());

    public gcs(Context context) {
        super(context, f17889b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo11650a(ger ger) {
        rob rob = mo24714a(ger, ger.class.getName()).f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        return mo24698a(rob);
    }

    /* renamed from: a */
    public final aucb mo11651a(ger ger, TokenReceiver$Params tokenReceiver$Params) {
        rod a = mo24714a(ger, ger.class.getName());
        gfl gfl = new gfl(a);
        gch gch = new gch(gfl, tokenReceiver$Params);
        gci gci = new gci(gfl);
        rom a2 = ron.m34179a();
        a2.f43443a = gch;
        a2.f43444b = gci;
        a2.f43445c = a;
        return mo24700a(a2.mo24973a());
    }
}
