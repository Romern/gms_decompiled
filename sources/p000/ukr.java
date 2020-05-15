package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* JADX WARN: Init of enum j can be incorrect */
/* renamed from: ukr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ukr implements vpj {
    CONTENT_HASH(r1),
    LAST_ACCESSED(r1),
    SIZE_BYTES(r1),
    INTERNAL_FILE_NAME(r1),
    SHARED_FILE_NAME(r1),
    ENCRYPTION_KEY(r1),
    ENCRYPTION_ALGORITHM(r1),
    ENCRYPTION_ALGORITHM_PARAMETERS(r1),
    ENCRYPTION_ALGORITHM_IV(r1),
    REVISION_ID(r1);
    

    /* renamed from: k */
    public final unp f48050k;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("md5Hash", 2);
        unu.mo27740a(new unp[0]);
        unu.mo27741b();
        b.mo27747a(2, unu);
        b.mo27748b(4);
        unu unu2 = new unu("hash", 2);
        unu2.mo27740a(new unp[0]);
        unu2.mo27741b();
        b.mo27747a(4, unu2);
        b.mo27748b(126);
        unu unu3 = new unu("hash", 2);
        unu3.mo27742c();
        b.mo27747a(126, unu3);
        uoa b2 = uoa.m39042b();
        unu unu4 = new unu("lastAccessed", 1);
        unu4.mo27741b();
        unu4.mo27737a();
        b2.mo27747a(2, unu4);
        uoa b3 = uoa.m39042b();
        unu unu5 = new unu("size", 1);
        unu5.mo27737a();
        b3.mo27747a(2, unu5);
        uoa b4 = uoa.m39042b();
        unu unu6 = new unu("internalFileName", 2);
        unu6.mo27740a(new unp[0]);
        b4.mo27747a(2, unu6);
        uoa b5 = uoa.m39042b();
        unu unu7 = new unu("sharedFileName", 2);
        unu7.mo27740a(new unp[0]);
        b5.mo27747a(2, unu7);
        uoa b6 = uoa.m39042b();
        b6.mo27747a(2, new unu("encryptionKey", 3));
        uoa b7 = uoa.m39042b();
        b7.mo27747a(2, new unu("encryptionAlgorithm", 2));
        uoa b8 = uoa.m39042b();
        b8.mo27747a(172, new unu("encryptionAlgorithmParameters", 2));
        uoa b9 = uoa.m39042b();
        b9.mo27747a(172, new unu("encryptionAlgorithmIv", 3));
        uoa b10 = uoa.m39042b();
        b10.mo27747a(17, new unu("revisionId", 2));
        b10.mo27748b(39);
    }

    private ukr(uoa uoa) {
        this.f48050k = uoa.mo27745a(173, uks.f48051a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48050k;
    }
}
