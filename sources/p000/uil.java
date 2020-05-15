package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

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
/* JADX WARN: Init of enum k can be incorrect */
/* renamed from: uil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uil implements vpj {
    ACCOUNT_HOLDER_NAME(r1),
    FORCE_FULL_SYNC(r1),
    LAST_CONTENT_SYNC_TIME(r1),
    LAST_SYNC_TIME(r1),
    FOLDER_SYNC_CLIP_TIME(r1),
    DOCUMENT_SYNC_CLIP_TIME(r1),
    LAST_SYNC_CHANGE_STAMP(r1),
    LAST_SYNC_SEQUENCE_NUMBER(r1),
    MINIMUM_CHANGE_SEQUENCE_NUMBER(r1),
    MAX_UPLOAD_SIZE(r1),
    FORCE_FULL_SYNC_LEVEL(r1);
    

    /* renamed from: l */
    public final unp f47705l;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("accountHolderName", 2);
        unu.mo27740a(new unp[0]);
        unu.mo27741b();
        b.mo27747a(1, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("forceFullSync", 1);
        unu2.mo27741b();
        unu2.mo27738a((Object) 0);
        b2.mo27747a(1, unu2);
        b2.mo27748b(10);
        unu unu3 = new unu("forceFullSync", 1);
        unu3.mo27741b();
        unu3.mo27738a((Object) 1);
        b2.mo27747a(11, unu3);
        b2.mo27748b(23);
        unu unu4 = new unu("forceFullSync", 1);
        unu4.mo27741b();
        unu4.mo27738a((Object) 1);
        b2.mo27747a(24, unu4);
        b2.mo27748b(63);
        unu unu5 = new unu("forceFullSync", 1);
        unu5.mo27741b();
        unu5.mo27738a((Object) 1);
        b2.mo27747a(64, unu5);
        b2.mo27748b(75);
        unu unu6 = new unu("forceFullSync", 1);
        unu6.mo27741b();
        unu6.mo27738a((Object) 1);
        b2.mo27747a(76, unu6);
        b2.mo27748b(86);
        unu unu7 = new unu("forceFullSync", 1);
        unu7.mo27741b();
        unu7.mo27738a((Object) 1);
        b2.mo27747a(87, unu7);
        b2.mo27748b(142);
        unu unu8 = new unu("forceFullSync", 1);
        unu8.mo27741b();
        unu8.mo27738a((Object) 1);
        b2.mo27747a(143, unu8);
        b2.mo27748b(MfiClientException.TYPE_MFICLIENT_STARTED);
        unu unu9 = new unu("forceFullSync", 1);
        unu9.mo27741b();
        unu9.mo27738a((Object) 1);
        b2.mo27747a((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, unu9);
        uoa b3 = uoa.m39042b();
        unu unu10 = new unu("lastContentSyncTime", 1);
        unu10.mo27741b();
        unu10.mo27738a((Object) 0);
        b3.mo27747a(1, unu10);
        b3.mo27748b(101);
        uoa b4 = uoa.m39042b();
        unu unu11 = new unu("lastSyncTime", 1);
        unu11.mo27741b();
        unu11.mo27738a((Object) 0);
        b4.mo27747a(1, unu11);
        b4.mo27748b(MfiClientException.TYPE_MFICLIENT_STARTED);
        uoa b5 = uoa.m39042b();
        b5.mo27747a(1, new unu("folderSyncClipTime", 1));
        b5.mo27748b(MfiClientException.TYPE_MFICLIENT_STARTED);
        uoa b6 = uoa.m39042b();
        b6.mo27747a(1, new unu("documentSyncClipTime", 1));
        b6.mo27748b(MfiClientException.TYPE_MFICLIENT_STARTED);
        uoa b7 = uoa.m39042b();
        unu unu12 = new unu("lastSyncChangeStamp", 1);
        unu12.mo27741b();
        unu12.mo27738a((Object) 0);
        b7.mo27747a(1, unu12);
        uoa b8 = uoa.m39042b();
        unu unu13 = new unu("lastSyncSequenceNumber", 1);
        unu13.mo27741b();
        unu13.mo27738a((Object) 0L);
        b8.mo27747a(1, unu13);
        uoa b9 = uoa.m39042b();
        unu unu14 = new unu("minimumChangeSequenceNumber", 1);
        unu14.mo27741b();
        unu14.mo27738a((Object) 0L);
        b9.mo27747a(53, unu14);
        uoa b10 = uoa.m39042b();
        unu unu15 = new unu("maxUploadSize", 1);
        unu15.mo27741b();
        unu15.mo27738a((Object) 5242880000000L);
        b10.mo27747a(66, unu15);
        uoa b11 = uoa.m39042b();
        unu unu16 = new unu("forceFullSyncLevel", 1);
        unu16.mo27741b();
        unu16.mo27738a((Object) 0);
        b11.mo27747a(141, unu16);
    }

    private uil(uoa uoa) {
        this.f47705l = uoa.mo27745a(173, uim.f47706a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47705l;
    }
}
