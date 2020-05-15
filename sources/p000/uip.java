package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* renamed from: uip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uip implements vpj {
    DRIVE_APP_ID(r1),
    ACCOUNT_ID(r1),
    PACKAGING_ID(r1),
    EXPIRY_TIMESTAMP(r1),
    PACKAGE_NAME(r1),
    CERTIFICATE_HASH(r1),
    NETWORK_TYPE_PREFERENCE(r1),
    BATTERY_USAGE_PREFERENCE(r1),
    ROAMING_PREFERENCE(r1);
    

    /* renamed from: j */
    public final unp f47723j;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("driveAppId", 1);
        unu.mo27741b();
        unu.mo27738a((Object) 0);
        b.mo27747a(121, unu);
        b.mo27748b(122);
        unu unu2 = new unu("driveAppId", 1);
        unu2.mo27741b();
        unu2.mo27737a();
        unu2.mo27739a(ujo.f47807a.f48341a, unv.CASCADE);
        b.mo27747a(122, unu2);
        uoa b2 = uoa.m39042b();
        unu unu3 = new unu("accountId", 1);
        unu3.mo27741b();
        unu3.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        b2.mo27747a(1, unu3);
        b2.mo27748b(122);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("packagingId", 1);
        unu4.mo27741b();
        unu4.mo27737a();
        b3.mo27747a(1, unu4);
        b3.mo27748b(122);
        uoa b4 = uoa.m39042b();
        unu unu5 = new unu("expiryTimestamp", 1);
        unu5.mo27741b();
        b4.mo27747a(1, unu5);
        b4.mo27748b(122);
        uoa b5 = uoa.m39042b();
        unu unu6 = new unu("packageName", 2);
        unu6.mo27741b();
        unu6.mo27737a();
        b5.mo27747a(1, unu6);
        uoa b6 = uoa.m39042b();
        unu unu7 = new unu("certificateHash", 2);
        unu7.mo27741b();
        unu7.mo27737a();
        unu7.mo27740a(ACCOUNT_ID.f47723j, PACKAGE_NAME.f47723j);
        b6.mo27747a(1, unu7);
        b6.mo27748b(122);
        unu unu8 = new unu("certificateHash", 2);
        unu8.mo27741b();
        unu8.mo27737a();
        unu8.mo27740a(DRIVE_APP_ID.f47723j, PACKAGE_NAME.f47723j);
        b6.mo27747a(122, unu8);
        uoa b7 = uoa.m39042b();
        unu unu9 = new unu("networkTypePreference", 1);
        unu9.mo27741b();
        unu9.mo27738a((Object) 1);
        b7.mo27747a(127, unu9);
        uoa b8 = uoa.m39042b();
        unu unu10 = new unu("batteryUsagePreference", 1);
        unu10.mo27741b();
        unu10.mo27738a(Integer.valueOf((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        b8.mo27747a(127, unu10);
        uoa b9 = uoa.m39042b();
        unu unu11 = new unu("roamingAllowed", 1);
        unu11.mo27741b();
        unu11.mo27738a((Object) 1);
        b9.mo27747a(127, unu11);
    }

    private uip(uoa uoa) {
        this.f47723j = uoa.mo27745a(173, uiq.f47724a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47723j;
    }
}
