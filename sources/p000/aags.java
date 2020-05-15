package p000;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.google.ads.afma.proto2api.C0152c;
import com.google.ads.afma.proto2api.C0157h;
import com.google.android.gms.gass.SchedulePeriodicTasksServiceImpl;

/* renamed from: aags */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aags {
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03f0  */
    /* renamed from: a */
    public static C0152c m21239a(Context context, String str, String str2) {
        String str3;
        String str4;
        Long l;
        long j;
        Context context2 = context;
        int callingUid = Binder.getCallingUid();
        bxvd da = C0152c.f7500Q.mo74144da();
        if (cebp.f182229a.mo6606a().mo78738a()) {
            PackageManager packageManager = rpr.m34216b().getPackageManager();
            if (Process.myUid() != callingUid) {
                String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
                int length = packagesForUid.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        str3 = str;
                        if (packagesForUid[i].equals(str3)) {
                            if (packagesForUid.length == 1) {
                                j = 1;
                            } else {
                                j = 2;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            C0152c cVar = (C0152c) da.f164949b;
                            cVar.f7519b |= 536870912;
                            cVar.f7510I = j;
                        } else {
                            i++;
                        }
                    } else {
                        str3 = str;
                        if (packagesForUid.length == 1) {
                            String str5 = packagesForUid[0];
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            C0152c cVar2 = (C0152c) da.f164949b;
                            str5.getClass();
                            cVar2.f7519b |= 128;
                            cVar2.f7540w = str5;
                            try {
                                l = Long.valueOf((long) packageManager.getPackageInfo(str5, 0).versionCode);
                            } catch (PackageManager.NameNotFoundException e) {
                                l = -1L;
                            }
                            long longValue = l.longValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            C0152c cVar3 = (C0152c) da.f164949b;
                            cVar3.f7518a |= 536870912;
                            cVar3.f7538u = longValue;
                            cVar3.f7519b |= 536870912;
                            cVar3.f7510I = 3;
                            String str6 = cVar3.f7540w;
                            str4 = Long.toString(longValue);
                            str3 = str6;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            C0152c cVar4 = (C0152c) da.f164949b;
                            cVar4.f7519b |= 536870912;
                            cVar4.f7510I = 4;
                        }
                    }
                }
            } else {
                str3 = str;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0152c cVar5 = (C0152c) da.f164949b;
                cVar5.f7519b |= 536870912;
                cVar5.f7510I = 127;
            }
        } else {
            str3 = str;
        }
        str4 = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0152c cVar6 = (C0152c) da.f164949b;
        cVar6.f7519b |= 1048576;
        cVar6.f7505D = 201515033;
        aago aago = null;
        r8 = null;
        aaim aaim = null;
        try {
            aago a = aago.m21234a(context);
            try {
                aaim b = a.f28087a.mo16852b(str3, str4);
                if (b != null) {
                    Object[] objArr = {str3, str4, b.f28206e};
                    aaim = b;
                }
            } catch (aagp e2) {
                Object[] objArr2 = {str3, str4};
            } catch (Throwable th) {
                th = th;
                aago = a;
                if (aago != null) {
                    aago.mo16867a();
                }
                throw th;
            }
            if (aaim == null) {
                Object[] objArr3 = {str3, str4};
                bxvd da2 = aaiq.f28214c.mo74144da();
                if (str3 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    aaiq aaiq = (aaiq) da2.f164949b;
                    str3.getClass();
                    aaiq.f28216a |= 1;
                    aaiq.f28217b = str3;
                }
                aagu.m21242a(context2, aagu.m21240a(2, ((aaiq) da2.mo74062i()).mo73642k()));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0152c cVar7 = (C0152c) da.f164949b;
                "0000000000000000000000000000000000000000000000000000000000000000".getClass();
                cVar7.f7518a = 4194304 | cVar7.f7518a;
                cVar7.f7532o = "0000000000000000000000000000000000000000000000000000000000000000";
            } else {
                if (!aaim.f28206e.isEmpty()) {
                    String str7 = aaim.f28206e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0152c cVar8 = (C0152c) da.f164949b;
                    str7.getClass();
                    cVar8.f7518a = 4194304 | cVar8.f7518a;
                    cVar8.f7532o = str7;
                }
                if (ceba.m135893b() && !aaim.f28207f.isEmpty()) {
                    String str8 = aaim.f28207f;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0152c cVar9 = (C0152c) da.f164949b;
                    str8.getClass();
                    cVar9.f7518a |= 16777216;
                    cVar9.f7533p = str8;
                }
                if (cebd.f182201a.mo6606a().mo78714a()) {
                    aagt aagt = new aagt(context2, str3);
                    int i2 = Build.VERSION.SDK_INT;
                    if (aagt.f28092c != null) {
                        UsageStatsManager usageStatsManager = (UsageStatsManager) aagt.f28091b.getSystemService("usagestats");
                        long currentTimeMillis = System.currentTimeMillis();
                        long h = cebd.f182201a.mo6606a().mo78721h();
                        long j2 = aagt.f28090a;
                        Long.signum(h);
                        long j3 = currentTimeMillis - (h * j2);
                        UsageEvents queryEvents = usageStatsManager.queryEvents(j3, currentTimeMillis);
                        UsageEvents.Event event = new UsageEvents.Event();
                        long j4 = -1;
                        long j5 = -1;
                        while (queryEvents.getNextEvent(event)) {
                            if (event.getPackageName().equals(aagt.f28092c)) {
                                if (event.getEventType() == 1 && event.getTimeStamp() > j5) {
                                    j5 = event.getTimeStamp();
                                } else if (event.getEventType() == 2 && event.getTimeStamp() > j4) {
                                    j4 = event.getTimeStamp();
                                }
                            }
                        }
                        if (j4 < j5) {
                            j4 = currentTimeMillis;
                        }
                        long j6 = 0;
                        j6 = 0;
                        if (j4 != -1 && j5 != -1) {
                            j6 = j4 - j5;
                        } else if (j4 == -1 && j5 != -1) {
                            j6 = currentTimeMillis - j5;
                        } else if (j4 != -1 && j5 == -1) {
                            j6 = j4 - j3;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        C0152c cVar10 = (C0152c) da.f164949b;
                        cVar10.f7519b |= 16777216;
                        cVar10.f7509H = j6;
                    }
                }
            }
            long j7 = -2;
            try {
                aail a2 = a.f28088b.mo16839a(Long.valueOf(aagu.m21241a().longValue() - (ceax.f182191a.mo6606a().mo78710e() * 1000)));
                if (a2 != null) {
                    bxvd da3 = C0157h.f7558e.mo74144da();
                    long j8 = a2.f28196b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    C0157h hVar = (C0157h) da3.f164949b;
                    int i3 = hVar.f7560a | 1;
                    hVar.f7560a = i3;
                    hVar.f7561b = j8;
                    String str9 = a2.f28198d;
                    str9.getClass();
                    int i4 = 2 | i3;
                    hVar.f7560a = i4;
                    hVar.f7562c = str9;
                    bxtx bxtx = a2.f28199e;
                    bxtx.getClass();
                    hVar.f7560a = i4 | 4;
                    hVar.f7563d = bxtx;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0152c cVar11 = (C0152c) da.f164949b;
                    C0157h hVar2 = (C0157h) da3.mo74062i();
                    hVar2.getClass();
                    cVar11.f7517P = hVar2;
                    cVar11.f7520c |= 4096;
                    Object[] objArr4 = new Object[1];
                    C0157h hVar3 = ((C0152c) da.f164949b).f7517P;
                    if (hVar3 == null) {
                        hVar3 = C0157h.f7558e;
                    }
                    objArr4[0] = hVar3;
                } else {
                    bxvd da4 = C0157h.f7558e.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    C0157h hVar4 = (C0157h) da4.f164949b;
                    hVar4.f7560a |= 1;
                    hVar4.f7561b = -2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    C0152c cVar12 = (C0152c) da.f164949b;
                    C0157h hVar5 = (C0157h) da4.mo74062i();
                    hVar5.getClass();
                    cVar12.f7517P = hVar5;
                    cVar12.f7520c |= 4096;
                    SchedulePeriodicTasksServiceImpl.m24289a(context);
                }
            } catch (aagp e3) {
                bxvd da5 = C0157h.f7558e.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                C0157h hVar6 = (C0157h) da5.f164949b;
                hVar6.f7560a = 1 | hVar6.f7560a;
                hVar6.f7561b = -1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0152c cVar13 = (C0152c) da.f164949b;
                C0157h hVar7 = (C0157h) da5.mo74062i();
                hVar7.getClass();
                cVar13.f7517P = hVar7;
                cVar13.f7520c |= 4096;
            }
            if (a != null) {
                a.mo16867a();
            }
            if (cebs.f182232a.mo6606a().mo78740a()) {
                try {
                    j7 = ((System.currentTimeMillis() - context.getPackageManager().getPackageInfo(str3, 0).firstInstallTime) / 60) / 1000;
                } catch (Exception e4) {
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                C0152c cVar14 = (C0152c) da.f164949b;
                cVar14.f7519b |= 512;
                cVar14.f7542y = j7;
            }
            return (C0152c) da.mo74062i();
        } catch (Throwable th2) {
            th = th2;
            if (aago != null) {
            }
            throw th;
        }
    }
}
