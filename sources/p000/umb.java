package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

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
/* renamed from: umb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum umb implements vpj {
    CONTENT_HASH(r1),
    ENTRY_ID(r1),
    CREATOR_IDENTITY(r1),
    WRITE_OPEN_TIME(r1),
    BYTES_SENT(r1),
    UPLOAD_URI(r1),
    PREV_CONTENT_HASH(r1),
    BASE_CONTENT_HASH(r1),
    BASE_CONTENT_REVISION_ID(r1),
    ACTION_ID(r1);
    

    /* renamed from: k */
    public final unp f48190k;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("contentHash", 2);
        unu.mo27741b();
        unu.mo27739a(ukr.CONTENT_HASH.f48050k, unv.CASCADE);
        unu.mo27737a();
        b.mo27747a(2, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("entryId", 1);
        unu2.mo27737a();
        unu2.mo27741b();
        unu2.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b2.mo27747a(2, unu2);
        b2.mo27748b(132);
        unu unu3 = new unu("entryId", 1);
        unu3.mo27737a();
        unu3.mo27741b();
        unu3.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        b2.mo27747a(132, unu3);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("creatorIdentity", 2);
        unu4.mo27741b();
        b3.mo27747a(2, unu4);
        b3.mo27748b(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
        uoa b4 = uoa.m39042b();
        unu unu5 = new unu("writeOpenTime", 1);
        unu5.mo27741b();
        b4.mo27747a(2, unu5);
        b4.mo27748b(44);
        uoa b5 = uoa.m39042b();
        b5.mo27747a(2, new unu("bytesSent", 1));
        b5.mo27748b(5);
        uoa b6 = uoa.m39042b();
        b6.mo27747a(2, new unu("uploadUri", 2));
        uoa b7 = uoa.m39042b();
        unu unu6 = new unu("prevContentHash", 2);
        unu6.mo27739a(ukr.CONTENT_HASH.f48050k, unv.CASCADE);
        unu6.mo27737a();
        b7.mo27747a(20, unu6);
        b7.mo27748b(39);
        uoa b8 = uoa.m39042b();
        unu unu7 = new unu("baseContentHash", 2);
        unu7.mo27739a(ukr.CONTENT_HASH.f48050k, unv.CASCADE);
        unu7.mo27737a();
        b8.mo27747a(38, unu7);
        uoa b9 = uoa.m39042b();
        b9.mo27747a(38, new unu("baseContentRevisionId", 2));
        b9.mo27748b(107);
        uoa b10 = uoa.m39042b();
        unu unu8 = new unu("actionId", 1);
        unu8.mo27739a(ulq.f48148a.f48341a, unv.CASCADE);
        b10.mo27747a(60, unu8);
    }

    private umb(uoa uoa) {
        this.f48190k = uoa.mo27745a(173, umc.f48191a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48190k;
    }
}
