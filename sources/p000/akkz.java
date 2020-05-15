package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.netrec.module.NetRecChimeraGcmTaskService;
import com.google.android.gms.netrec.scoring.ConnectivityReport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: akkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akkz extends aaab {

    /* renamed from: a */
    private final rnt f72183a;

    /* renamed from: b */
    private final ConnectivityReport f72184b;

    public akkz(rnt rnt, ConnectivityReport connectivityReport) {
        super(137, "ReportConnectivity");
        this.f72183a = rnt;
        this.f72184b = connectivityReport;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        akmh akmh = new akmh(context);
        try {
            ConnectivityReport connectivityReport = this.f72184b;
            new Object[1][0] = connectivityReport;
            int i = eoa.f15378a;
            if (connectivityReport != null) {
                int i2 = spn.f44932a;
                if (!connectivityReport.f81182b) {
                    akmd akmd = akmh.f72257b;
                    String str = connectivityReport.f81181a.f81197a;
                    int i3 = connectivityReport.f81183c;
                    int i4 = connectivityReport.f81184d;
                    new Object[1][0] = eoa.m10821a(str, cfpd.m142365e());
                    if (!"<unknown ssid>".equals(str)) {
                        akmc akmc = akmd.f72242a;
                        String a = akmk.m60015a(str);
                        synchronized (akmc.f72240a) {
                            SharedPreferences a2 = akmc.f72241b.mo10354a();
                            SharedPreferences.Editor edit = a2.edit();
                            edit.putInt(a, a2.getInt(a, -1) + 1);
                            edit.commit();
                        }
                        if (i4 > 0) {
                            j = akmd.m59994a((long) i4, str);
                        } else {
                            if (i3 == 1) {
                                j = cfpd.f185332a.mo6606a().mo82441f();
                            } else if (i3 == 2) {
                                j = cfpd.f185332a.mo6606a().mo82442g();
                            } else if (i3 == 3) {
                                j = cfpd.f185332a.mo6606a().mo82439d();
                            } else if (i3 == 4) {
                                j = cfpd.f185332a.mo6606a().mo82438c();
                            } else if (i3 == 5) {
                                j = cfpd.f185332a.mo6606a().mo82440e();
                            } else if (cfpd.m142368h() > 0) {
                                j = TimeUnit.MINUTES.toSeconds(cfpd.m142368h());
                            } else {
                                j = -1;
                            }
                            if (j > 0) {
                                j = akmd.m59994a(j, str);
                            }
                        }
                        if (j > 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("ssid", str);
                            long seconds = TimeUnit.MINUTES.toSeconds(cfpd.f185332a.mo6606a().mo82428L());
                            aebi a3 = NetRecChimeraGcmTaskService.m67641a("ReinstateNetworkTask", bundle);
                            long j2 = seconds + j;
                            a3.mo34004a(j, j2);
                            a3.mo34023a(2);
                            a3.f63099k = Integer.toString(str.hashCode());
                            a3.f63102n = true;
                            a3.mo34027b(1);
                            aebj a4 = a3.mo33974b();
                            Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), eoa.m10821a(str, cfpd.m142365e())};
                            NetRecChimeraGcmTaskService.m67642a(aeat.m51532a(akmd.f72244b), a4);
                        }
                        if (i3 == 4) {
                            List<ScanResult> scanResults = ((WifiManager) akmd.f72244b.getSystemService("wifi")).getScanResults();
                            ArrayList arrayList = new ArrayList();
                            for (ScanResult scanResult : scanResults) {
                                if (str.equals(scanResult.SSID)) {
                                    arrayList.add(scanResult.BSSID);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                String[] strArr = new String[arrayList.size()];
                                arrayList.toArray(strArr);
                                akmd.mo39552a(str, strArr, false);
                            }
                        }
                        akmd.mo39552a(str, null, false);
                    } else {
                        new Object[1][0] = eoa.m10821a(str, cfpd.m142365e());
                    }
                } else if (connectivityReport.f81183c == 0) {
                    String str2 = connectivityReport.f81181a.f81197a;
                    akmc akmc2 = akmd.f72242a;
                    String a5 = akmk.m60015a(str2);
                    synchronized (akmc2.f72240a) {
                        SharedPreferences a6 = akmc2.f72241b.mo10354a();
                        SharedPreferences.Editor edit2 = a6.edit();
                        a6.getInt(a5, 0);
                        edit2.remove(a5);
                        edit2.commit();
                    }
                }
                this.f72183a.mo11797a(Status.f30107a);
                return;
            }
            this.f72183a.mo11797a(new Status(22000));
        } catch (RuntimeException e) {
            eoa.m10825a("NetRec", e, "Error executing ReportConnectivityOperation", new Object[0]);
            throw new aaaj(8, null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f72183a.mo11797a(status);
    }
}
