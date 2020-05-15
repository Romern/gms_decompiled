package p000;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: ppe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ppe extends C0942ds {
    public ppe(C0953ec ecVar) {
        super(ecVar);
    }

    /* renamed from: a */
    public final String mo10122a() {
        return "INSERT OR REPLACE INTO `cloud_device_info` (`cloud_device_id`,`device_type`,`friendly_name`,`device_ssid_suffix`,`capabilities`,`truncated_lnid`,`last_updated_timestamp_ms`,`ipv4_fragment`,`is_last_seen_online`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9522a(C0939dp dpVar, Object obj) {
        ppc ppc = (ppc) obj;
        String str = ppc.f40006b;
        if (str == null) {
            dpVar.mo8917a(1);
        } else {
            dpVar.mo8919a(1, str);
        }
        String str2 = ppc.f40007c;
        if (str2 == null) {
            dpVar.mo8917a(2);
        } else {
            dpVar.mo8919a(2, str2);
        }
        String str3 = ppc.f40008d;
        if (str3 == null) {
            dpVar.mo8917a(3);
        } else {
            dpVar.mo8919a(3, str3);
        }
        String str4 = ppc.f40009e;
        if (str4 == null) {
            dpVar.mo8917a(4);
        } else {
            dpVar.mo8919a(4, str4);
        }
        EnumSet enumSet = ppc.f40010f;
        Iterator it = enumSet.iterator();
        int i = -1;
        while (it.hasNext()) {
            i = ((Enum) it.next()).ordinal();
        }
        byte[] bArr = new byte[((i >> 3) + 1)];
        Iterator it2 = enumSet.iterator();
        while (it2.hasNext()) {
            int ordinal = ((Enum) it2.next()).ordinal();
            int a = qax.m31775a(ordinal);
            bArr[a] = (byte) (((byte) (1 << qax.m31776b(ordinal))) | bArr[a]);
        }
        dpVar.mo8920a(5, bArr);
        String str5 = ppc.f40011g;
        if (str5 == null) {
            dpVar.mo8917a(6);
        } else {
            dpVar.mo8919a(6, str5);
        }
        dpVar.mo8918a(7, ppc.f40012h);
        dpVar.mo8918a(8, (long) ppc.f40013i);
        dpVar.mo8918a(9, ppc.f40014j ? 1 : 0);
    }
}
