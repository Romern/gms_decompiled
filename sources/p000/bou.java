package p000;

/* renamed from: bou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bou {
    UNEXPECTED_END_OF_FILE(1),
    INVALID_NUMBER_OF_BLOCKS(2),
    INVALID_BLOCK_LENGTH(3),
    INVALID_ENTRY_STRUCTURE(4),
    INVALID_CHECK_TYPE(5),
    INVALID_ENTRY_LENGTH(6);
    

    /* renamed from: g */
    private final int f5292g;

    private bou(int i) {
        this.f5292g = i;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{code=" + this.f5292g + "name=" + name() + '}';
    }
}
