package p000;

import com.google.android.gms.cast.discovery.gaia.GaiaDiscoveryStorage_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: pqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqc extends C0954ed {

    /* renamed from: b */
    final /* synthetic */ GaiaDiscoveryStorage_Impl f40054b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pqc(GaiaDiscoveryStorage_Impl gaiaDiscoveryStorage_Impl) {
        super(8);
        this.f40054b = gaiaDiscoveryStorage_Impl;
    }

    /* renamed from: a */
    public final void mo9980a(C0933dj djVar) {
        djVar.mo9115b("DROP TABLE IF EXISTS `gaia_device_link`");
        djVar.mo9115b("DROP TABLE IF EXISTS `gaia_info`");
        djVar.mo9115b("DROP TABLE IF EXISTS `cloud_device_info`");
    }

    /* renamed from: b */
    public final void mo9981b(C0933dj djVar) {
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `gaia_device_link` (`gaia_account_name` TEXT NOT NULL, `cloud_device_id` TEXT NOT NULL, PRIMARY KEY(`gaia_account_name`, `cloud_device_id`))");
        djVar.mo9115b("CREATE INDEX IF NOT EXISTS `index_gaia_device_link_gaia_account_name` ON `gaia_device_link` (`gaia_account_name`)");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `gaia_info` (`gaia_account_name` TEXT NOT NULL, `last_updated_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`gaia_account_name`))");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS `cloud_device_info` (`cloud_device_id` TEXT NOT NULL, `device_type` TEXT, `friendly_name` TEXT, `device_ssid_suffix` TEXT, `capabilities` BLOB NOT NULL, `truncated_lnid` TEXT, `last_updated_timestamp_ms` INTEGER NOT NULL, `ipv4_fragment` INTEGER NOT NULL, `is_last_seen_online` INTEGER NOT NULL, PRIMARY KEY(`cloud_device_id`))");
        djVar.mo9115b("CREATE INDEX IF NOT EXISTS `index_cloud_device_info_cloud_device_id` ON `cloud_device_info` (`cloud_device_id`)");
        djVar.mo9115b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        djVar.mo9115b("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8aec0f32c4d2d2b2037e0df9a7535ab3')");
    }

    /* renamed from: c */
    public final void mo9982c(C0933dj djVar) {
        this.f40054b.f14654d = djVar;
        this.f40054b.mo9940a(djVar);
    }

    /* renamed from: d */
    public final C0955ee mo9983d(C0933dj djVar) {
        C0933dj djVar2 = djVar;
        HashMap hashMap = new HashMap(2);
        hashMap.put("gaia_account_name", new C0965eo("gaia_account_name", "TEXT", true, 1, null, 1));
        hashMap.put("cloud_device_id", new C0965eo("cloud_device_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new C0968er("index_gaia_device_link_gaia_account_name", false, Arrays.asList("gaia_account_name")));
        C0969es esVar = new C0969es("gaia_device_link", hashMap, hashSet, hashSet2);
        C0969es a = C0969es.m11066a(djVar2, "gaia_device_link");
        if (!esVar.equals(a)) {
            String valueOf = String.valueOf(esVar);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97 + String.valueOf(valueOf2).length());
            sb.append("gaia_device_link(com.google.android.gms.cast.discovery.gaia.GaiaDeviceLink).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new C0955ee(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("gaia_account_name", new C0965eo("gaia_account_name", "TEXT", true, 1, null, 1));
        hashMap2.put("last_updated_timestamp_ms", new C0965eo("last_updated_timestamp_ms", "INTEGER", true, 0, null, 1));
        C0969es esVar2 = new C0969es("gaia_info", hashMap2, new HashSet(0), new HashSet(0));
        C0969es a2 = C0969es.m11066a(djVar2, "gaia_info");
        if (!esVar2.equals(a2)) {
            String valueOf3 = String.valueOf(esVar2);
            String valueOf4 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 84 + String.valueOf(valueOf4).length());
            sb2.append("gaia_info(com.google.android.gms.cast.discovery.gaia.GaiaInfo).\n Expected:\n");
            sb2.append(valueOf3);
            sb2.append("\n Found:\n");
            sb2.append(valueOf4);
            return new C0955ee(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(9);
        hashMap3.put("cloud_device_id", new C0965eo("cloud_device_id", "TEXT", true, 1, null, 1));
        hashMap3.put("device_type", new C0965eo("device_type", "TEXT", false, 0, null, 1));
        hashMap3.put("friendly_name", new C0965eo("friendly_name", "TEXT", false, 0, null, 1));
        hashMap3.put("device_ssid_suffix", new C0965eo("device_ssid_suffix", "TEXT", false, 0, null, 1));
        hashMap3.put("capabilities", new C0965eo("capabilities", "BLOB", true, 0, null, 1));
        hashMap3.put("truncated_lnid", new C0965eo("truncated_lnid", "TEXT", false, 0, null, 1));
        hashMap3.put("last_updated_timestamp_ms", new C0965eo("last_updated_timestamp_ms", "INTEGER", true, 0, null, 1));
        hashMap3.put("ipv4_fragment", new C0965eo("ipv4_fragment", "INTEGER", true, 0, null, 1));
        hashMap3.put("is_last_seen_online", new C0965eo("is_last_seen_online", "INTEGER", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new C0968er("index_cloud_device_info_cloud_device_id", false, Arrays.asList("cloud_device_id")));
        C0969es esVar3 = new C0969es("cloud_device_info", hashMap3, hashSet3, hashSet4);
        C0969es a3 = C0969es.m11066a(djVar2, "cloud_device_info");
        if (esVar3.equals(a3)) {
            return new C0955ee(true, null);
        }
        String valueOf5 = String.valueOf(esVar3);
        String valueOf6 = String.valueOf(a3);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 99 + String.valueOf(valueOf6).length());
        sb3.append("cloud_device_info(com.google.android.gms.cast.discovery.gaia.CloudDeviceInfo).\n Expected:\n");
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
