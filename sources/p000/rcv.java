package p000;

/* renamed from: rcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum rcv implements rdm {
    PLC_HASH_COLLISION("PlcHashCollision", rag.DROPS_BY_PLC_HASH_COLLISION),
    PLC_TO_BYTES_FAIL("PlcToByteFail", rag.DROPS_BY_PLC_TO_BYTES_FAIL),
    LOG_FILE_TOO_OLD("LogFileTooOld", rag.DROPS_BY_LOG_FILE_TOO_OLD),
    CORRUPTED_PLC_FILE("CorruptedPlcFile", rag.DROPS_BY_CORRUPTED_PLC_FILE),
    FAIL_TO_DELETE_PLC_DIR("FailedToDeletePlcDir", rag.DROPS_BY_FAIL_TO_DELETE_PLC_DIR),
    DIR_HAS_NO_PLC_FILE("DirHasNoPlcFile", rag.DROPS_BY_DIR_HAS_NO_PLC_FILE),
    CORRUPTED_LOG_FILE_NAME("CorruptedLogFileName", rag.DROPS_BY_CORRUPTED_LOG_FILE_NAME),
    CORRUPTED_LOG_FILE_CONTENTS("CorruptedLogFileContents", rag.DROPS_BY_CORRUPTED_LOG_FILE_CONTENTS),
    FAIL_TO_READ_PLC_FILE("FailedToReadPlcFile", rag.DROPS_BY_FAIL_TO_READ_PLC_FILE),
    FAIL_TO_PARSE_PLC_DIR_NAME("FailedToParsePlcDirName", rag.DROPS_BY_FAIL_TO_PARSE_PLC_DIR_NAME),
    PLC_HASH_MISMATCH("PlcHashMismatch", rag.DROPS_BY_PLC_HASH_MISMATCH),
    FAIL_TO_PARSE_PLC_PROTO("FailToParsePlcProto", rag.DROPS_BY_FAIL_TO_PARSE_PLC_PROTO),
    DIR_TRAVERSAL_ATTACK("DirTraversalAttack", rag.DROPS_BY_DIR_TRAVERSAL_ATTACK);
    

    /* renamed from: n */
    public final String f42673n;

    /* renamed from: o */
    public final rag f42674o;

    private rcv(String str, rag rag) {
        this.f42673n = str;
        this.f42674o = rag;
    }

    /* renamed from: a */
    public final rag mo24467a() {
        return this.f42674o;
    }

    public final String toString() {
        return this.f42673n;
    }

    /* renamed from: a */
    public final rcw mo24468a(Throwable th) {
        return new rcw(this, th);
    }
}
