package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: abvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvs {

    /* renamed from: a */
    public final Context f58561a;

    /* renamed from: b */
    public final acrl f58562b;

    /* renamed from: c */
    public final abym f58563c;

    /* renamed from: d */
    private final abyp f58564d;

    public abvs(Context context, acrl acrl, abym abym, abyp abyp) {
        this.f58561a = context;
        this.f58562b = acrl;
        this.f58563c = abym;
        this.f58564d = abyp;
    }

    /* renamed from: a */
    private static Intent m48358a() {
        return new Intent().setAction("com.google.firebase.appindexing.UPDATE_INDEX");
    }

    /* renamed from: b */
    public static boolean m48363b(Context context, Intent intent) {
        return !m48360a(context.getPackageManager().queryBroadcastReceivers(intent, 0)).isEmpty();
    }

    /* renamed from: a */
    public static Intent m48359a(String str) {
        return m48358a().setPackage(str);
    }

    /* renamed from: a */
    private static List m48360a(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public static Set m48361a(Context context) {
        HashSet hashSet = new HashSet();
        Intent a = m48358a();
        for (ResolveInfo resolveInfo : m48360a(context.getPackageManager().queryIntentServices(a, 0))) {
            if (resolveInfo == null) {
                absg.m48205e("Missing resolveInfo");
            } else {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo == null) {
                    absg.m48205e("Missing serviceInfo");
                } else {
                    String str = serviceInfo.packageName;
                    if (str == null) {
                        absg.m48205e("Missing packageName");
                    } else {
                        hashSet.add(str);
                    }
                }
            }
        }
        for (ResolveInfo resolveInfo2 : m48360a(context.getPackageManager().queryBroadcastReceivers(a, 0))) {
            if (resolveInfo2 == null) {
                absg.m48205e("Missing resolveInfo");
            } else {
                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                if (activityInfo == null) {
                    absg.m48205e("Missing activityInfo");
                } else {
                    String str2 = activityInfo.packageName;
                    if (str2 == null) {
                        absg.m48205e("Missing packageName");
                    } else {
                        hashSet.add(str2);
                    }
                }
            }
        }
        if (((Boolean) abzt.f58871aL.mo58455c()).booleanValue()) {
            hashSet.add("com.google.android.gms");
        } else {
            hashSet.remove("com.google.android.gms");
        }
        return hashSet;
    }

    /* renamed from: a */
    public static boolean m48362a(Context context, Intent intent) {
        return !m48360a(context.getPackageManager().queryIntentServices(intent, 0)).isEmpty();
    }

    /* renamed from: a */
    public final boolean mo32366a(String str, long j, bpzu bpzu, boolean z) {
        bpzs bpzs;
        if (!((Boolean) abzt.f58870aK.mo58455c()).booleanValue()) {
            bpzs = bpzs.FLAG_DISABLED;
        } else {
            try {
                if (sqr.m36000c(this.f58561a, str)) {
                    bpzs = bpzs.PACKAGE_STOPPED;
                } else if (!this.f58561a.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled) {
                    bpzs = bpzs.PACKAGE_DISABLED;
                } else if (!abzt.m48729c(str)) {
                    bpzs = bpzs.FLAG_DISABLED;
                } else {
                    int i = (z || this.f58562b.mo33045p(str) == 0) ? 1 : 2;
                    Intent a = m48359a(str);
                    a.putExtra("com.google.firebase.appindexing.extra.REASON", i);
                    if (!"com.google.android.gms".equals(str)) {
                        if (m48363b(this.f58561a, a)) {
                            try {
                                this.f58561a.sendBroadcast(a);
                                bpzs = bpzs.BROADCAST_SENT;
                            } catch (RuntimeException e) {
                                this.f58564d.mo32456a("RebuildScheduler sendBroadcast", e, cema.m137239f());
                            }
                        }
                        if (cemw.f183016a.mo6606a().mo79372b()) {
                            int i2 = Build.VERSION.SDK_INT;
                            try {
                                if (this.f58561a.getPackageManager().getPackageInfo(str, 0).applicationInfo.targetSdkVersion >= 26) {
                                    bpzs = bpzs.NOT_ALLOWED;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                this.f58564d.mo32456a("RebuildScheduler start service", e2, cema.m137239f());
                                bpzs = bpzs.PACKAGE_MISSING;
                            }
                        }
                        try {
                            if (this.f58561a.startService(a) == null) {
                                bpzs = bpzs.START_SERVICE_FAILED;
                            }
                        } catch (SecurityException e3) {
                            bpzs = bpzs.NO_PERMISSION;
                        } catch (IllegalStateException e4) {
                            bpzs = bpzs.NOT_ALLOWED;
                        } catch (RuntimeException e5) {
                            this.f58564d.mo32456a("RebuildScheduler startService", e5, cema.m137239f());
                            bpzs = bpzs.START_SERVICE_UNKNOWN_ERROR;
                        }
                    } else if (((Boolean) abzt.f58871aL.mo58455c()).booleanValue()) {
                        try {
                            this.f58561a.sendBroadcast(a);
                        } catch (RuntimeException e6) {
                            this.f58564d.mo32456a("RebuildScheduler sendBroadcast to GMSCore", e6, cema.m137239f());
                        }
                    } else {
                        bpzs = bpzs.FLAG_DISABLED;
                    }
                    bpzs = bpzs.SERVICE_STARTED;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                bpzs = bpzs.PACKAGE_MISSING;
            }
        }
        absg.m48194b("Sending UPDATE_INDEX: package=%s source=%s result=%s", str, bpzu, bpzs);
        this.f58563c.mo32449a(str, bpzu, bpzs);
        if (bpzs != bpzs.SERVICE_STARTED && bpzs != bpzs.BROADCAST_SENT) {
            return false;
        }
        acrl acrl = this.f58562b;
        synchronized (acrl.f60625g) {
            abul d = acrl.mo33026d(str);
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            if (j != ((abul) bxvd.f164949b).f58426m) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul abul = (abul) bxvd.f164949b;
                abul abul2 = abul.f58412n;
                abul.f58414a |= 2048;
                abul.f58426m = j;
                acrl.mo33020a(str, (abul) bxvd.mo74062i());
            }
        }
        return true;
    }
}
