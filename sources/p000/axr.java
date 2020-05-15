package p000;

/* renamed from: axr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axr implements ayq {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2853a(Object obj) {
        Throwable th = (Throwable) obj;
        if (ben.m2839a(th)) {
            bek.m2806a("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
