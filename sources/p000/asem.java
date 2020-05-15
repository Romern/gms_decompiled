package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.location.reporting.ReportingState;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asem {

    /* renamed from: e */
    public static final Charset f88778e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final String f88779a;

    /* renamed from: b */
    public final String f88780b;

    /* renamed from: c */
    public final boolean f88781c;

    /* renamed from: d */
    public final boolean f88782d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public asem(String str, String str2, boolean z) {
        this(str, str2, z, false);
        cagz cagz = cagz.DEFAULT;
    }

    /* renamed from: a */
    public int mo49089a() {
        return (int) cguz.m147111b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract calx mo49092b(Context context, long j, long j2, qxq qxq);

    /* renamed from: b */
    public abstract boolean mo49093b();

    /* renamed from: c */
    public abstract long mo49094c();

    /* renamed from: d */
    public abstract long mo49095d();

    /* renamed from: e */
    public boolean mo49096e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo49097f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo49098g() {
        return true;
    }

    public asem(String str, String str2, boolean z, boolean z2) {
        this.f88779a = str;
        this.f88780b = str2;
        this.f88781c = z;
        this.f88782d = z2;
        rjo rjo = aeqc.f63620a;
    }

    /* renamed from: a */
    public final calx mo49090a(Context context, long j, long j2, qxq qxq) {
        int i;
        boolean z;
        calx b = mo49092b(context, j, j2, qxq);
        List list = null;
        if (b == null) {
            return null;
        }
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((bxvk) b);
        calu calu = (calu) bxvd;
        int i2 = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager != null) {
            i = userManager.getUserCount();
        } else {
            i = 1;
        }
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx = (calx) calu.f164949b;
        int i3 = calx.f175203a | 32;
        calx.f175203a = i3;
        calx.f175212j = i;
        boolean z2 = this.f88782d;
        calx.f175203a = i3 | 2097152;
        calx.f175218p = z2;
        calx.f175219q = bxvk.m124028dc();
        ArrayList arrayList = new ArrayList();
        int i4 = Build.VERSION.SDK_INT;
        UserManager userManager2 = (UserManager) context.getSystemService("user");
        if (userManager2 != null) {
            for (UserHandle userHandle : userManager2.getUserProfiles()) {
                int identifier = userHandle.getIdentifier();
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            }
        }
        List b2 = bqcn.m112586b(sqc.m35960a(arrayList));
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx2 = (calx) calu.f164949b;
        if (!calx2.f175219q.mo73666a()) {
            calx2.f175219q = bxvk.m124019a(calx2.f175219q);
        }
        bxsy.m123078a(b2, calx2.f175219q);
        String str = this.f88779a;
        int i5 = Build.VERSION.SDK_INT;
        Collections.emptyList();
        try {
            list = soz.m35801d(context, context.getPackageName());
        } catch (Exception e) {
            Log.w(str, "Failed to get google accounts,", e);
        }
        if (list != null) {
            int size = list.size();
            if (calu.f164950c) {
                calu.mo74035c();
                calu.f164950c = false;
            }
            calx calx3 = (calx) calu.f164949b;
            calx3.f175203a |= 64;
            calx3.f175213k = size;
            if (cguz.f187794a.mo6606a().mo84523b()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    try {
                        ReportingState reportingState = (ReportingState) aucu.m76783a(aeqc.m52384a(context).mo24736c((Account) it.next()), cgrz.m146802b(), TimeUnit.SECONDS);
                        if (reportingState != null && reportingState.f79601b) {
                            z = true;
                            break;
                        }
                    } catch (ExecutionException | TimeoutException e2) {
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (calu.f164950c) {
                    calu.mo74035c();
                    calu.f164950c = false;
                }
                calx calx4 = (calx) calu.f164949b;
                calx4.f175203a |= 4194304;
                calx4.f175220r = z;
            }
        }
        if (this.f88781c) {
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(8192);
            ArrayList arrayList2 = new ArrayList();
            for (PackageInfo packageInfo : installedPackages) {
                if (packageInfo != null) {
                    bxvd da = calw.f175191i.mo74144da();
                    if (packageInfo.packageName != null) {
                        String str2 = packageInfo.packageName;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        calw calw = (calw) da.f164949b;
                        str2.getClass();
                        calw.f175193a |= 1;
                        calw.f175194b = str2;
                        try {
                            String installerPackageName = packageManager.getInstallerPackageName(packageInfo.packageName);
                            if (installerPackageName != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                calw calw2 = (calw) da.f164949b;
                                installerPackageName.getClass();
                                calw2.f175193a |= 16;
                                calw2.f175198f = installerPackageName;
                            }
                        } catch (IllegalArgumentException e4) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            calw calw3 = (calw) da.f164949b;
                            "<UNKNOWN>".getClass();
                            calw3.f175193a |= 16;
                            calw3.f175198f = "<UNKNOWN>";
                        }
                    }
                    int i6 = packageInfo.versionCode;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    calw calw4 = (calw) da.f164949b;
                    calw4.f175193a |= 2;
                    calw4.f175195c = i6;
                    if (packageInfo.versionName != null) {
                        String str3 = packageInfo.versionName;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        calw calw5 = (calw) da.f164949b;
                        str3.getClass();
                        calw5.f175193a |= 4;
                        calw5.f175196d = str3;
                    }
                    if (packageInfo.applicationInfo != null) {
                        long j3 = (long) packageInfo.applicationInfo.uid;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        calw calw6 = (calw) da.f164949b;
                        calw6.f175193a |= 8;
                        calw6.f175197e = j3;
                    }
                    long j4 = packageInfo.lastUpdateTime;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    calw calw7 = (calw) da.f164949b;
                    calw7.f175193a |= 32;
                    calw7.f175199g = j4;
                    long j5 = packageInfo.firstInstallTime;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    calw calw8 = (calw) da.f164949b;
                    calw8.f175193a |= 64;
                    calw8.f175200h = j5;
                    arrayList2.add((calw) da.mo74062i());
                }
            }
            if (calu.f164950c) {
                calu.mo74035c();
                calu.f164950c = false;
            }
            ((calx) calu.f164949b).f175210h = bxvk.m124030de();
            if (calu.f164950c) {
                calu.mo74035c();
                calu.f164950c = false;
            }
            calx calx5 = (calx) calu.f164949b;
            if (!calx5.f175210h.mo73666a()) {
                calx5.f175210h = bxvk.m124021a(calx5.f175210h);
            }
            bxsy.m123078a(arrayList2, calx5.f175210h);
        }
        return (calx) calu.mo74062i();
    }

    /* renamed from: a */
    public void mo49091a(rjx rjx, qws qws, qxq qxq, calu calu, boolean z, List list, boolean z2, boolean z3, boolean z4) {
        calu calu2 = calu;
        if (stm.m36302d(((calx) calu2.f164949b).f175209g)) {
            calx calx = (calx) calu2.f164949b;
            if ((calx.f175203a & 16777216) == 0 || calx.f175222t.mo73744a() == 0) {
                qxq.mo24383c(String.valueOf(this.f88779a).concat("EmptyDumpsysOutput")).mo24359a();
                if (!cguz.f187794a.mo6606a().mo84522a()) {
                    qxq.mo24388e();
                    return;
                }
            }
        }
        ashd.m74117a(rjx, qws, qxq, calu, z, list, z2, z3, z4, this.f88779a, this.f88780b, mo49089a());
    }
}
