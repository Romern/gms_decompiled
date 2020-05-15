package p000;

/* renamed from: bqaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqaw implements bxvp {
    OK(0),
    DOCUMENT_TRIMMED(1),
    INDEX_TOKENS_CLIPPED(2),
    URI_REPLACED(3),
    DOCUMENT_THING_MODIFIED(4),
    PROTO_PARSE_ERROR(10),
    ERROR_URI_NOT_FOUND(20),
    ERROR_DOCSTORE(21),
    ERROR_TAG_CAP_EXCEEDED(22),
    ERROR_INVALID_SEQNO(23),
    ERROR_IDC_TOO_MANY_RECURSIONS_DEPTH(24),
    ERROR_UPDATING_DELETED_DOC(25),
    ERROR_INDEX_LEXICON_FULL(30),
    ERROR_INDEXING_EMBEDDINGS(31),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f140195p;

    private bqaw(int i) {
        this.f140195p = i;
    }

    /* renamed from: a */
    public static bqaw m112488a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 1) {
            return DOCUMENT_TRIMMED;
        }
        if (i == 2) {
            return INDEX_TOKENS_CLIPPED;
        }
        if (i == 3) {
            return URI_REPLACED;
        }
        if (i == 4) {
            return DOCUMENT_THING_MODIFIED;
        }
        if (i == 10) {
            return PROTO_PARSE_ERROR;
        }
        if (i == 30) {
            return ERROR_INDEX_LEXICON_FULL;
        }
        if (i == 31) {
            return ERROR_INDEXING_EMBEDDINGS;
        }
        switch (i) {
            case 20:
                return ERROR_URI_NOT_FOUND;
            case 21:
                return ERROR_DOCSTORE;
            case 22:
                return ERROR_TAG_CAP_EXCEEDED;
            case 23:
                return ERROR_INVALID_SEQNO;
            case 24:
                return ERROR_IDC_TOO_MANY_RECURSIONS_DEPTH;
            case 25:
                return ERROR_UPDATING_DELETED_DOC;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112489b() {
        return bqav.f140178a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140195p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
