package p000;

/* renamed from: bcui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bcui {
    UNKNOWN(0),
    TITLE(1),
    SUBTITLE(2),
    BODY_TEXT(3),
    CAPTION_TEXT(4),
    LABEL_TEXT(5);
    

    /* renamed from: g */
    public final int f104926g;

    private bcui(int i) {
        this.f104926g = i;
    }

    /* renamed from: a */
    public static bcui m90016a(int i) {
        return (bcui) bnfi.m109237a(values()).mo67507c(new bcuh(i)).mo66812a(UNKNOWN);
    }
}
