package p000;

/* renamed from: abql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abql implements bxvp {
    TOKENIZER_TEXT(0),
    TOKENIZER_HTML(1),
    TOKENIZER_RFC822_FORMATTED(2),
    TOKENIZER_URL(3),
    TOKENIZER_NONE(4),
    TOKENIZER_VERBATIM(5);
    

    /* renamed from: g */
    public final int f57967g;

    private abql(int i) {
        this.f57967g = i;
    }

    /* renamed from: a */
    public static abql m48076a(int i) {
        if (i == 0) {
            return TOKENIZER_TEXT;
        }
        if (i == 1) {
            return TOKENIZER_HTML;
        }
        if (i == 2) {
            return TOKENIZER_RFC822_FORMATTED;
        }
        if (i == 3) {
            return TOKENIZER_URL;
        }
        if (i == 4) {
            return TOKENIZER_NONE;
        }
        if (i != 5) {
            return null;
        }
        return TOKENIZER_VERBATIM;
    }

    /* renamed from: b */
    public static bxvr m48077b() {
        return abqk.f57959a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f57967g;
    }

    public final String toString() {
        return Integer.toString(this.f57967g);
    }
}
