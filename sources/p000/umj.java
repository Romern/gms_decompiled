package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* renamed from: umj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum umj implements vpj {
    ENTRY_ID(r1),
    ANDROID_APP_ID(r1),
    SERIALIZED_EVENT(r1),
    NEXT_NOTIFICATION_TIME(r1),
    ATTEMPT_COUNT(r1),
    SNOOZE_COUNT(r1);
    

    /* renamed from: g */
    public final unp f48214g;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("entryId", 1);
        unu.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b.mo27747a(31, unu);
        b.mo27748b(132);
        unu unu2 = new unu("entryId", 1);
        unu2.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        b.mo27747a(132, unu2);
        uoa b2 = uoa.m39042b();
        unu unu3 = new unu("appAuthMetadataId", 1);
        unu3.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        unu3.mo27741b();
        b2.mo27747a(31, unu3);
        b2.mo27749c(131, "androidAppId");
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("serializedEvent", 2);
        unu4.mo27741b();
        b3.mo27747a(31, unu4);
        uoa b4 = uoa.m39042b();
        unu unu5 = new unu("lastNotificationTime", 1);
        unu5.mo27741b();
        unu5.mo27738a((Object) 0);
        b4.mo27747a(31, unu5);
        b4.mo27749c(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, "nextNotificationTime");
        uoa b5 = uoa.m39042b();
        unu unu6 = new unu("retryCount", 1);
        unu6.mo27741b();
        b5.mo27747a(31, unu6);
        b5.mo27749c(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, "attemptCount");
        uoa b6 = uoa.m39042b();
        unu unu7 = new unu("snoozeCount", 1);
        unu7.mo27741b();
        unu7.mo27738a((Object) 0);
        b6.mo27747a(41, unu7);
    }

    private umj(uoa uoa) {
        this.f48214g = uoa.mo27745a(173, umk.f48215a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48214g;
    }
}
