package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* renamed from: ulp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ulp implements vpj {
    ACCOUNT_ID(r1),
    PAYLOAD(r1),
    ATTEMPT_COUNT(r1),
    REQUIRED_ENTRY_ID(r1),
    APPLY_LOCALLY_TIMESTAMP(r1),
    IS_PAUSED(r1),
    TRANSFER_PREFERENCES_OVERRIDE(r1);
    

    /* renamed from: h */
    public final unp f48147h;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("accountId", 1);
        unu.mo27741b();
        unu.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        unu.mo27737a();
        b.mo27747a(1, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("payload", 2);
        unu2.mo27737a();
        unu2.mo27741b();
        b2.mo27747a(1, unu2);
        uoa b3 = uoa.m39042b();
        unu unu3 = new unu("retryCount", 1);
        unu3.mo27741b();
        b3.mo27747a(1, unu3);
        b3.mo27749c(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, "attemptCount");
        uoa b4 = uoa.m39042b();
        unu unu4 = new unu("requiredEntryId", 1);
        unu4.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        unu4.mo27737a();
        b4.mo27747a(2, unu4);
        b4.mo27748b(59);
        unu unu5 = new unu("requiredEntryId", 1);
        unu5.mo27737a();
        b4.mo27747a(59, unu5);
        uoa b5 = uoa.m39042b();
        b5.mo27747a(80, new unu("applyLocallyTimestamp", 1));
        uoa b6 = uoa.m39042b();
        unu unu6 = new unu("isPaused", 1);
        unu6.mo27741b();
        unu6.mo27738a((Object) 0);
        b6.mo27747a(161, unu6);
        uoa b7 = uoa.m39042b();
        b7.mo27747a(163, new unu("transferPreferencesOverride", 2));
    }

    private ulp(uoa uoa) {
        this.f48147h = uoa.mo27745a(173, ulq.f48148a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48147h;
    }
}
