package p000;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

/* renamed from: apku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apku implements Comparator {

    /* renamed from: a */
    private final apkm f84633a;

    /* renamed from: b */
    private final int f84634b;

    /* renamed from: c */
    private final apkg f84635c;

    /* renamed from: d */
    private final aphn f84636d;

    /* renamed from: e */
    private final aecm f84637e = new aecm(apks.f84631a);

    /* renamed from: f */
    private final aecm f84638f = new aecm(apkt.f84632a);

    /* renamed from: g */
    private int f84639g;

    /* renamed from: h */
    private Set f84640h = bnon.f131923a;

    /* renamed from: i */
    private long f84641i;

    public apku(apkm apkm, int i, apkg apkg, aphn aphn) {
        this.f84633a = apkm;
        this.f84634b = i;
        this.f84635c = apkg;
        this.f84636d = aphn;
    }

    /* renamed from: a */
    private final synchronized void m70556a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
            this.f84639g |= 1;
            if (networkCapabilities.hasCapability(11)) {
                this.f84639g |= 2;
            }
        }
    }

    /* renamed from: a */
    private final boolean m70557a(int i) {
        return (this.f84639g & i) == i;
    }

    /* renamed from: b */
    private final synchronized void m70558b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.f84639g |= 1;
            if (!C1185me.m19630a(connectivityManager)) {
                this.f84639g |= 2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r0 != 2) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e9, code lost:
        if (r0 == 2) goto L_0x00eb;
     */
    /* renamed from: c */
    private final boolean m70560c(apid apid) {
        int i;
        int i2;
        int i3;
        aapa aapa = apid.f84443m;
        int a = aaoz.m21776a(aapa.f28729e);
        if (a == 0) {
            a = 1;
        }
        int a2 = aaoz.m21776a(aapa.f28727c);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a == a2) {
            i = aaoz.m21776a(aapa.f28727c);
            if (i == 0) {
                i = 1;
            }
        } else if (!m70561d(apid)) {
            i = aaoz.m21776a(aapa.f28727c);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = aaoz.m21776a(aapa.f28729e);
            if (i == 0) {
                i = 1;
            }
        }
        if (i == 3) {
            if (!m70557a(1)) {
                apid.f84442l = 3;
                return false;
            }
        } else if (i == 4 && !m70557a(2)) {
            apid.f84442l = 7;
            return false;
        }
        aapa aapa2 = apid.f84443m;
        int a3 = aaov.m21772a(aapa2.f28730f);
        if (a3 == 0) {
            a3 = 1;
        }
        int a4 = aaov.m21772a(aapa2.f28728d);
        if (a4 == 0) {
            a4 = 1;
        }
        if (a3 != a4 ? m70561d(apid) ? (i3 = aaov.m21772a(aapa2.f28730f)) != 0 : (i3 = aaov.m21772a(aapa2.f28728d)) != 0 : (i3 = aaov.m21772a(aapa2.f28728d)) != 0) {
            if (i3 == 3 && !m70557a(4)) {
                apid.f84442l = 8;
                return false;
            }
        }
        if (apid.mo47278o() && !m70557a(64)) {
            aapa aapa3 = apid.f84443m;
            int a5 = aaox.m21774a(aapa3.f28732h);
            if (a5 == 0) {
                a5 = 1;
            }
            int a6 = aaox.m21774a(aapa3.f28731g);
            if (a6 == 0) {
                a6 = 1;
            }
            if (a5 == a6) {
                int a7 = aaox.m21774a(aapa3.f28731g);
                if (a7 != 0) {
                }
            } else if (!m70561d(apid)) {
            }
            i2 = 16;
            apid.f84442l = i2;
            return false;
        }
        if (cedu.m136333b()) {
            Set set = apid.f84444n.f63118k;
            if (!set.isEmpty() && !Collections.disjoint(set, this.f84640h)) {
                i2 = 15;
                apid.f84442l = i2;
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m70561d(apid apid) {
        if (cdny.m134338c() && !this.f84637e.mo6527a(apid.mo47281r())) {
            return false;
        }
        if ((!cdny.f181385a.mo6606a().mo78037h() || this.f84638f.mo6527a(apid.mo47281r())) && !apid.f84433c && this.f84641i <= apid.mo47270h() + ((cdnj.f181319a.mo6606a().mo77980C() * (apid.mo47272i() - apid.mo47270h())) / 100)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m70562e(apid apid) {
        return apid.f84434d <= this.f84641i;
    }

    /* renamed from: f */
    private final boolean m70563f(apid apid) {
        long j;
        if (apid.mo47280q()) {
            return !apid.mo47263b().isEmpty();
        }
        if (apid.f84433c) {
            return true;
        }
        if (this.f84634b == 1) {
            j = apid.mo47270h();
        } else {
            j = apid.mo47272i();
        }
        return j <= this.f84641i;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        apid apid = (apid) obj;
        apid apid2 = (apid) obj2;
        if (this.f84634b == 1) {
            return bqcr.m112591a(apid.mo47270h(), apid2.mo47270h());
        }
        return bqcr.m112591a(apid.mo47272i(), apid2.mo47272i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return false;
     */
    /* renamed from: b */
    private final synchronized boolean m70559b(apid apid) {
        if (!apid.mo47278o() || (!m70557a(4) && !cdnv.f181381a.mo6606a().mo78024a())) {
            return ceea.f182428a.mo6606a().mo78918c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (p000.cedr.f182397a.mo6606a().mo78901n() == false) goto L_0x0067;
     */
    /* renamed from: a */
    public final synchronized int mo47375a(Context context) {
        aech aech = new aech("nts:standalone:refreshDeviceState");
        try {
            this.f84641i = SystemClock.elapsedRealtime();
            this.f84639g = 0;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                int i = Build.VERSION.SDK_INT;
                if (!cdnj.f181319a.mo6606a().mo78012p()) {
                    m70558b(connectivityManager);
                } else {
                    m70556a(connectivityManager);
                }
            }
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                int intExtra2 = registerReceiver.getIntExtra("plugged", 0);
                if (intExtra != 2) {
                    if (intExtra != 5) {
                        if (intExtra2 != 0) {
                        }
                    }
                }
                this.f84639g |= 4;
            }
            if (cedu.m136333b()) {
                this.f84640h = this.f84635c.mo47357a();
            }
            aphn aphn = this.f84636d;
            int i2 = Build.VERSION.SDK_INT;
            PowerManager powerManager = aphn.f84393a;
            if (powerManager != null) {
                if (powerManager.isPowerSaveMode()) {
                    this.f84639g |= 8;
                }
            }
            if (this.f84636d.mo47221a()) {
                this.f84639g |= 16;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (apht.m70315a().f84405e.f107332a.mo47211a()) {
                this.f84639g |= 64;
            }
            if (aajg.m21346e()) {
                this.f84639g |= 32;
            }
            apkm apkm = this.f84633a;
            apkm.f84616c.clear();
            apkm.f84615b.clear();
            aech.close();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return this.f84639g;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e8 A[Catch:{ all -> 0x01ee, all -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ all -> 0x01ee, all -> 0x01f3 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0033=Splitter:B:7:0x0033, B:23:0x005e=Splitter:B:23:0x005e} */
    /* renamed from: a */
    public final synchronized int mo47376a(apid apid) {
        PackageManager packageManager;
        aech aech = new aech("nts:standalone:checkTaskEligibility");
        try {
            if (!aphm.m70305b(apid)) {
                String valueOf = String.valueOf(apid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("Running in whitelist mode. Ignoring task: ");
                sb.append(valueOf);
                Log.w("ExecutionCriteria", sb.toString());
            } else {
                int i = 0;
                if (m70557a(8)) {
                    if (m70559b(apid)) {
                        aphn aphn = this.f84636d;
                        String str = apid.f84431a.f28806b;
                        int i2 = Build.VERSION.SDK_INT;
                        PowerManager powerManager = aphn.f84393a;
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(str)) {
                            apid.f84442l = 9;
                        }
                    }
                    if (m70557a(16)) {
                    }
                } else if (m70557a(16)) {
                    if (!m70557a(32)) {
                        if (apid.mo47280q() || apid.mo47279p()) {
                            boolean h = cdnj.f181319a.mo6606a().mo78004h();
                            if (!h || (m70562e(apid) && m70563f(apid) && m70560c(apid))) {
                                apkm apkm = this.f84633a;
                                aapm aapm = apid.f84431a;
                                String str2 = aapm.f28806b;
                                int i3 = (int) aapm.f28809e;
                                SparseIntArray sparseIntArray = (SparseIntArray) apkm.f84616c.get(str2);
                                if (sparseIntArray == null) {
                                    sparseIntArray = new SparseIntArray(1);
                                    apkm.f84616c.put(str2, sparseIntArray);
                                }
                                int i4 = sparseIntArray.get(i3, 0);
                                if (i4 == 0) {
                                    int i5 = (int) apid.f84431a.f28809e;
                                    int i6 = apkm.f84615b.get(i5, 0);
                                    if (i6 == 0) {
                                        if (!aajg.m21345d(i5)) {
                                            if (!aajg.m21339a() || !aajg.f28258a) {
                                                if (i5 == 0) {
                                                    i6 = 2;
                                                }
                                            } else if (aajg.m21331a(i5) >= 0) {
                                                i6 = 2;
                                            }
                                            i6 = 3;
                                        } else {
                                            i6 = 1;
                                        }
                                        apkm.f84615b.put(i5, i6);
                                        if (i6 != 1) {
                                            apkm.f84614a.mo17011a(i5);
                                        }
                                    }
                                    i4 = 6;
                                    if (i6 == 2) {
                                        i4 = 2;
                                    } else if (i6 != 3) {
                                        try {
                                            Context b = apkm.f84614a.mo17012b((int) apid.f84431a.f28809e);
                                            if (!(b == null || (packageManager = b.getPackageManager()) == null)) {
                                                if ((packageManager.getApplicationInfo(apid.f84431a.f28806b, 0).flags & 2097152) != 2097152) {
                                                    int i7 = Build.VERSION.SDK_INT;
                                                    UsageStatsManager usageStatsManager = (UsageStatsManager) b.getSystemService(UsageStatsManager.class);
                                                    i4 = usageStatsManager != null ? !usageStatsManager.isAppInactive(apid.f84431a.f28806b) ? 1 : 7 : 1;
                                                } else {
                                                    i4 = 5;
                                                }
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            i4 = 4;
                                        }
                                    } else {
                                        i4 = 3;
                                    }
                                    sparseIntArray.put(i3, i4);
                                }
                                switch (i4) {
                                    case 1:
                                        if (!h) {
                                            if (m70562e(apid) && m70563f(apid) && m70560c(apid)) {
                                                i = 1;
                                                break;
                                            }
                                        } else {
                                            aech.close();
                                            return 1;
                                        }
                                    case 2:
                                        apid.f84442l = 5;
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        String valueOf2 = String.valueOf(apid);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                                        sb2.append("Package unavailable for task: ");
                                        sb2.append(valueOf2);
                                        Log.e("ExecutionCriteria", sb2.toString());
                                        break;
                                    case 5:
                                        apid.f84442l = 10;
                                        break;
                                    case 6:
                                        StringBuilder sb3 = new StringBuilder(48);
                                        sb3.append("PackageManager unavailable for user #");
                                        sb3.append((int) apid.f84431a.f28809e);
                                        Log.e("ExecutionCriteria", sb3.toString());
                                        break;
                                    case 7:
                                        apid.f84442l = 12;
                                        break;
                                    default:
                                        StringBuilder sb4 = new StringBuilder(36);
                                        sb4.append("Unexpected state result: ");
                                        sb4.append(i4);
                                        Log.w("ExecutionCriteria", sb4.toString());
                                        break;
                                }
                            }
                        }
                    } else {
                        apid.f84442l = 13;
                    }
                } else {
                    apid.f84442l = 11;
                }
                aech.close();
                return i;
            }
            aech.close();
            return 2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
