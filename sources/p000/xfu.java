package p000;

/* renamed from: xfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfu {
    /* renamed from: a */
    public static xft m42833a(xwj xwj, xjb xjb, xws xws) {
        if (xjb instanceof xjg) {
            return new xfk(xwj, (xjg) xjb, xws);
        }
        if (xjb instanceof xlc) {
            return new xfl(xwj, (xlc) xjb, xws);
        }
        if (xjb instanceof xlm) {
            return new xfw(xwj, (xlm) xjb, xws);
        }
        throw new IllegalStateException("Unrecognized Channel");
    }
}
