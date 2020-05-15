package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;
import java.util.ArrayList;

/* renamed from: aptw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptw extends bjdm {

    /* renamed from: a */
    public static final String[] f84885a;

    /* renamed from: b */
    public boolean f84886b = false;

    /* renamed from: c */
    public final aptv f84887c = new aptv(this);

    /* renamed from: d */
    private final Context f84888d;

    /* renamed from: e */
    private final apga f84889e;

    static {
        aptw.class.getSimpleName();
        String[] strArr = new String[22];
        f84885a = strArr;
        strArr[0] = "unknown";
        strArr[1] = "ransomware";
        strArr[2] = "phishing";
        strArr[3] = "trojan";
        strArr[4] = "uncommon";
        strArr[5] = "sms_fraud";
        strArr[6] = "toll_fraud";
        strArr[7] = "wap_fraud";
        strArr[8] = "call_fraud";
        strArr[9] = "backdoor";
        strArr[10] = "spyware";
        strArr[11] = "generic_malware";
        strArr[12] = "harmful_site";
        strArr[13] = "windows_malware";
        strArr[14] = "hostile_downloader";
        strArr[15] = "non_android_threat";
        strArr[16] = "rooting";
        strArr[17] = "privilege_escalation";
        strArr[18] = "commercial_spyware";
        strArr[19] = "spam";
        strArr[20] = "ddos";
        strArr[21] = "data_collection";
    }

    public aptw(Context context, apga apga) {
        this.f84888d = context;
        this.f84889e = apga;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static int m70995a(String str) {
        char c;
        String str2 = str;
        if (str2 == null) {
            return 11;
        }
        switch (str.hashCode()) {
            case -2055109037:
                if (str2.equals("data_collection")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1989406151:
                if (str2.equals("spyware")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1447167332:
                if (str2.equals("phishing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1017676355:
                if (str2.equals("harmful_site")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -956146080:
                if (str2.equals("toll_fraud")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -865292602:
                if (str2.equals("trojan")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -751650404:
                if (str2.equals("non_android_threat")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -593393084:
                if (str2.equals("commercial_spyware")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -468311612:
                if (str2.equals("uncommon")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -409221222:
                if (str2.equals("hostile_downloader")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case 3078756:
                if (str2.equals("ddos")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 3536713:
                if (str2.equals("spam")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 348820427:
                if (str2.equals("wap_fraud")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 544331407:
                if (str2.equals("ransomware")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1090102270:
                if (str2.equals("sms_fraud")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1230603862:
                if (str2.equals("rooting_malware")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1380111296:
                if (str2.equals("rooting")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1559814681:
                if (str2.equals("windows_malware")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 1574942061:
                if (str2.equals("generic_malware")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 1919142211:
                if (str2.equals("call_fraud")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1984028899:
                if (str2.equals("privilege_escalation")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2121424149:
                if (str2.equals("backdoor")) {
                    c = 8;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
            default:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47610a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        apga apga = this.f84889e;
        if (apga != null && !this.f84886b) {
            try {
                apga.mo47169a(status, harmfulAppsInfo);
                SafetyNetClientChimeraService.m92417a(harmfulAppsInfo);
            } catch (RemoteException e) {
            } finally {
                this.f84886b = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        p000.skh.m35531a().mo25689a(r11.f84888d, r11.f84887c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0005, B:5:0x0010] */
    /* renamed from: a */
    public final void mo47611a(boolean z, byte[] bArr) {
        int i;
        if (!z) {
            mo47610a(new Status(12004), (HarmfulAppsInfo) null);
        } else {
            aptu aptu = (aptu) bxvk.m124014a(aptu.f84877e, bArr);
            ArrayList arrayList = new ArrayList();
            for (aptt aptt : aptu.f84879a) {
                arrayList.add(new HarmfulAppsData(aptt.f84873a, aptt.f84874b.mo73780k(), m70995a(aptt.f84875c)));
            }
            long j = aptu.f84880b;
            HarmfulAppsData[] harmfulAppsDataArr = (HarmfulAppsData[]) arrayList.toArray(new HarmfulAppsData[0]);
            boolean z2 = aptu.f84881c;
            if (z2) {
                i = aptu.f84882d;
            } else {
                i = -1;
            }
            HarmfulAppsInfo harmfulAppsInfo = new HarmfulAppsInfo(j, harmfulAppsDataArr, i, z2);
            if (harmfulAppsInfo != null) {
                mo47610a(new Status(0), harmfulAppsInfo);
            } else {
                mo47610a(new Status(12004), (HarmfulAppsInfo) null);
            }
        }
        skh.m35531a().mo25689a(this.f84888d, this.f84887c);
    }
}
