package p000;

/* renamed from: bcul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bcul {
    UNKNOWN(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(3),
    STRIKETHROUGH(4),
    SUPERSCRIPT(5),
    SUBSCRIPT(6),
    COLOR(7),
    BACKGROUND_COLOR(8),
    SIZE(9),
    TYPEFACE_LIST(10),
    HORIZONTAL_ALIGNMENT(11);
    

    /* renamed from: m */
    public final int f104941m;

    private bcul(int i) {
        this.f104941m = i;
    }

    /* renamed from: a */
    public static bcul m90038a(int i) {
        return (bcul) bnfi.m109237a(values()).mo67507c(new bcuk(i)).mo66812a(UNKNOWN);
    }
}
