package com.google.android.contextmanager.sync;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextManagerTaskChimeraService extends aeah {
    /* renamed from: a */
    private final boolean m4890a(String[] strArr) {
        if (strArr.length >= 2) {
            return true;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("com.google.android.contextmanager.sync.ContextManagerTaskChimeraService", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[ContextManagerTaskChimeraService] operation %s requires account", strArr[0]);
        return false;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r3.equals("RefreshStateOperation") != false) goto L_0x0070;
     */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        efo efo;
        String[] split = aecc.f63128a.split(":", 2);
        char c = 3;
        Object[] objArr = new Object[3];
        objArr[0] = aecc.f63128a;
        objArr[1] = split[0];
        objArr[2] = split.length >= 2 ? split[1] : "<>";
        String str = split[0];
        switch (str.hashCode()) {
            case -2075121709:
                if (str.equals("DailyCheckinOperation")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -532243723:
                if (str.equals("ReadServerFenceUpdatesOperation")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 563246221:
                if (str.equals("SyncServerInterestRecordsOperation")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 973696324:
                if (str.equals("DownloadSyncOperation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1152043244:
                if (str.equals("SyncOperation")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2065618801:
                break;
            case 2117277066:
                if (str.equals("DeviceRegistrationSync")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                efo = new efg().mo9446a();
                break;
            case 1:
                efo = new efv().mo9446a();
                break;
            case 2:
                efo = new efm().mo9446a();
                break;
            case 3:
                efo = new efq().mo9446a();
                break;
            case 4:
                efo = dwq.m9682z().f14824b.mo9446a();
                break;
            case 5:
                if (m4890a(split)) {
                    efo = new ecw(new doh(split[1])).mo9446a();
                    break;
                } else {
                    return 2;
                }
            case 6:
                if (m4890a(split)) {
                    efo efo2 = new efo(new doh(split[1]));
                    efo2.mo9446a();
                    efo = efo2;
                    break;
                } else {
                    return 2;
                }
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("com.google.android.contextmanager.sync.ContextManagerTaskChimeraService", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ContextManagerTaskChimeraService] invalid sync operation %s", aecc.f63128a);
                return 2;
        }
        try {
            if (((Boolean) efo.get()).booleanValue()) {
                return 0;
            }
            return 1;
        } catch (Exception e) {
        }
    }
}
