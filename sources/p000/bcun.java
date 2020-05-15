package p000;

/* renamed from: bcun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bcun {
    UNKNOWN(0),
    PLATFORM_DEFAULT_LIGHT(1),
    PLATFORM_DEFAULT_REGULAR(2),
    PLATFORM_DEFAULT_MEDIUM(3),
    PLATFORM_DEFAULT_BOLD(4),
    GOOGLE_SANS_REGULAR(5),
    GOOGLE_SANS_MEDIUM(6),
    GOOGLE_SANS_BOLD(7),
    ROBOTO_REGULAR(8);
    

    /* renamed from: j */
    public final int f104953j;

    private bcun(int i) {
        this.f104953j = i;
    }

    /* renamed from: a */
    public static bcun m90040a(int i) {
        return (bcun) bnfi.m109237a(values()).mo67507c(new bcum(i)).mo66812a(UNKNOWN);
    }
}
