package p000;

/* renamed from: gdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdy {

    /* renamed from: a */
    private static boolean f17989a;

    /* renamed from: a */
    public static synchronized boolean m13001a() {
        boolean z;
        synchronized (gdy.class) {
            if (!f17989a) {
                try {
                    z = ssj.m36231b(rpr.m34216b(), "Whisper");
                    f17989a = z;
                } catch (UnsatisfiedLinkError e) {
                    bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("gdy", "a", 25, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unable to load libWhisper.so");
                    return false;
                }
            } else {
                z = true;
            }
        }
        return z;
    }
}
