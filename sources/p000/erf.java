package p000;

import com.google.android.gms.accountsettings.p007mg.poc.model.repository.RepositoryDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: erf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class erf extends C0954ed {

    /* renamed from: b */
    final /* synthetic */ RepositoryDatabase_Impl f15562b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public erf(RepositoryDatabase_Impl repositoryDatabase_Impl) {
        super(10);
        this.f15562b = repositoryDatabase_Impl;
    }

    /* renamed from: a */
    public final void mo9980a(C0933dj djVar) {
        djVar.mo9115b("DROP TABLE IF EXISTS `resource_info`");
        djVar.mo9115b("DROP TABLE IF EXISTS `dismissed_prompt_item`");
        djVar.mo9115b("DROP TABLE IF EXISTS `per_device_dismissed_onboarding_flow`");
    }

    /* renamed from: b */
    public final void mo9981b(C0933dj djVar) {
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `resource_info` (`accountName` TEXT NOT NULL, `language` TEXT NOT NULL, `resourceKey` BLOB NOT NULL, `darkModeEnabled` INTEGER NOT NULL, `callingAndroidApp` TEXT NOT NULL, `resource` BLOB, `lastUpdatedMs` INTEGER, PRIMARY KEY(`accountName`, `language`, `resourceKey`, `darkModeEnabled`, `callingAndroidApp`))");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `dismissed_prompt_item` (`accountName` TEXT NOT NULL, `promptItemId` INTEGER NOT NULL, PRIMARY KEY(`accountName`, `promptItemId`))");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `per_device_dismissed_onboarding_flow` (`dismissalId` INTEGER NOT NULL, PRIMARY KEY(`dismissalId`))");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        djVar.mo9115b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '670f3d20202cb8e1b2a07d18cf889162')");
    }

    /* renamed from: c */
    public final void mo9982c(C0933dj djVar) {
        this.f15562b.f14654d = djVar;
        this.f15562b.mo9940a(djVar);
    }

    /* renamed from: d */
    public final C0955ee mo9983d(C0933dj djVar) {
        C0933dj djVar2 = djVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("accountName", new C0965eo("accountName", "TEXT", true, 1, null, 1));
        hashMap.put("language", new C0965eo("language", "TEXT", true, 2, null, 1));
        hashMap.put("resourceKey", new C0965eo("resourceKey", "BLOB", true, 3, null, 1));
        hashMap.put("darkModeEnabled", new C0965eo("darkModeEnabled", "INTEGER", true, 4, null, 1));
        hashMap.put("callingAndroidApp", new C0965eo("callingAndroidApp", "TEXT", true, 5, null, 1));
        hashMap.put("resource", new C0965eo("resource", "BLOB", false, 0, null, 1));
        hashMap.put("lastUpdatedMs", new C0965eo("lastUpdatedMs", "INTEGER", false, 0, null, 1));
        C0969es esVar = new C0969es("resource_info", hashMap, new HashSet(0), new HashSet(0));
        C0969es a = C0969es.m11066a(djVar2, "resource_info");
        if (!esVar.equals(a)) {
            String valueOf = String.valueOf(esVar);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
            sb.append("resource_info(com.google.android.gms.accountsettings.mg.poc.model.repository.ResourceInfoEntity).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new C0955ee(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("accountName", new C0965eo("accountName", "TEXT", true, 1, null, 1));
        hashMap2.put("promptItemId", new C0965eo("promptItemId", "INTEGER", true, 2, null, 1));
        C0969es esVar2 = new C0969es("dismissed_prompt_item", hashMap2, new HashSet(0), new HashSet(0));
        C0969es a2 = C0969es.m11066a(djVar2, "dismissed_prompt_item");
        if (!esVar2.equals(a2)) {
            String valueOf3 = String.valueOf(esVar2);
            String valueOf4 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 133 + String.valueOf(valueOf4).length());
            sb2.append("dismissed_prompt_item(com.google.android.gms.accountsettings.mg.poc.model.repository.DismissedPromptItemEntity).\n Expected:\n");
            sb2.append(valueOf3);
            sb2.append("\n Found:\n");
            sb2.append(valueOf4);
            return new C0955ee(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(1);
        hashMap3.put("dismissalId", new C0965eo("dismissalId", "INTEGER", true, 1, null, 1));
        C0969es esVar3 = new C0969es("per_device_dismissed_onboarding_flow", hashMap3, new HashSet(0), new HashSet(0));
        C0969es a3 = C0969es.m11066a(djVar2, "per_device_dismissed_onboarding_flow");
        if (esVar3.equals(a3)) {
            return new C0955ee(true, null);
        }
        String valueOf5 = String.valueOf(esVar3);
        String valueOf6 = String.valueOf(a3);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 161 + String.valueOf(valueOf6).length());
        sb3.append("per_device_dismissed_onboarding_flow(com.google.android.gms.accountsettings.mg.poc.model.repository.PerDeviceDismissedOnboardingFlowEntity).\n Expected:\n");
        sb3.append(valueOf5);
        sb3.append("\n Found:\n");
        sb3.append(valueOf6);
        return new C0955ee(false, sb3.toString());
    }

    /* renamed from: e */
    public final void mo9984e(C0933dj djVar) {
        C0963em.m10654a(djVar);
    }
}
