package p000;

/* renamed from: yoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yoj implements ygd {

    /* renamed from: a */
    final /* synthetic */ yok f54272a;

    public yoj(yok yok) {
        this.f54272a = yok;
    }

    /* renamed from: a */
    public final boolean mo30462a(yfr yfr) {
        yok yok = this.f54272a;
        String f = yfr.mo30427f();
        boolean contains = f.contains("group_");
        boolean a = yxy.m44965a(yfr.mo30422b().mo30409a());
        if (f.startsWith(yok.f54273a) || "default".equals(f)) {
            return false;
        }
        return (yok.f54274b || f.endsWith(".sample")) && yfr.mo30423c().equals("com.google.internal.goal") && a && !contains;
    }

    public final String toString() {
        return "IsIncluded";
    }
}
