package p000;

/* renamed from: qve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qve {
    /* renamed from: a */
    public static chus m32935a(chuw chuw) {
        chus chus = chuw.f189236a.f189233s;
        chus chus2 = chus.OK;
        int ordinal = chus.ordinal();
        if (ordinal == 8) {
            throw new qrp(258, m32936b(chuw), chuw);
        } else if (ordinal != 14) {
            return chus;
        } else {
            throw new qrp(513, m32936b(chuw), chuw);
        }
    }

    /* renamed from: b */
    public static String m32936b(chuw chuw) {
        return String.format("Error when calling the server (message: %s).", chuw.f189236a.f189234t);
    }
}
