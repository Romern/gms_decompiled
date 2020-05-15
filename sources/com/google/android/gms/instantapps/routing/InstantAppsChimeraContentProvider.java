package com.google.android.gms.instantapps.routing;

import android.content.ContentValues;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantAppsChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final adfs f79225a = new adfs("IAContentProvider");

    /* renamed from: f */
    private static int f79226f = spn.f44932a;

    /* renamed from: b */
    Map f79227b;

    /* renamed from: c */
    public adfd f79228c;

    /* renamed from: d */
    adfq f79229d;

    /* renamed from: e */
    public adje f79230e;

    /* renamed from: g */
    private adfm f79231g;

    /* renamed from: h */
    private adhk f79232h;

    /* renamed from: a */
    private final adfi m66769a() {
        PackageInfo packageInfo;
        int callingUid = Binder.getCallingUid();
        String str = (String) ((adhl) this.f79232h).f61715b.f61813a.get(Integer.valueOf(callingUid));
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                packageInfo = this.f79232h.mo33520a(str, 0);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Unable to load package for uid ");
                sb.append(callingUid);
                throw new SecurityException(sb.toString());
            }
        } else {
            packageInfo = null;
        }
        if (packageInfo == null) {
            try {
                packageInfo = getContext().getPackageManager().getPackageInfo(getCallingPackage(), 0);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new SecurityException();
            }
        } else {
            z = true;
        }
        return new adfi(callingUid, packageInfo, z);
    }

    /* renamed from: b */
    private final void m66770b() {
        boolean z;
        if (this.f79227b == null) {
            adfv a = adfv.m50332a(getContext());
            ArrayList arrayList = new ArrayList();
            sqv sqv = a.f61577b;
            adjv adjv = new adjv(a.f61584i, a.f61585j, a.f61586k, adfk.m50305a());
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(new adjt(adjv));
            arrayList2.add(new adju(adjv));
            arrayList.addAll(arrayList2);
            adhu adhu = new adhu(getContext(), a.f61583h, a.f61587l, a.f61590o, a.f61596u);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new adfj());
            arrayList3.add(new adfj((byte[]) null));
            arrayList3.add(new adfj((char[]) null));
            arrayList3.add(new adfj((boolean[]) null));
            arrayList3.add(new adhp());
            arrayList3.add(new adhr(adhu));
            arrayList3.add(new adht());
            arrayList3.add(new adht((char[]) null));
            arrayList3.add(new adht((byte[]) null));
            arrayList3.add(new adht((short[]) null));
            arrayList3.add(new adfj((int[]) null));
            arrayList3.add(new adfj((float[]) null));
            arrayList3.add(new adfj((short[]) null));
            arrayList3.add(new adfj((char[][]) null));
            arrayList3.add(new adfj((int[][]) null));
            arrayList3.add(new adfj((short[][]) null));
            arrayList3.add(new adhm());
            arrayList3.add(new adhq(adhu));
            arrayList3.add(new adhs(adhu));
            arrayList3.add(new adhn(adhu));
            arrayList3.add(new adho(adhu));
            arrayList3.add(new adfj((byte[][]) null));
            arrayList.addAll(arrayList3);
            arrayList.add(new adjs(this));
            C1223np npVar = new C1223np(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                adfj adfj = (adfj) arrayList.get(i);
                if (((adfj) npVar.put(adfj.f61558a, adfj)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                String str = adfj.f61558a;
                sdo.m34975b(z, str.length() == 0 ? new String("Multiple provider methods found for ") : "Multiple provider methods found for ".concat(str));
            }
            this.f79227b = npVar;
            this.f79228c = a.f61586k;
            this.f79231g = a.f61591p;
            this.f79232h = a.f61583h;
            this.f79230e = a.f61582g;
            this.f79229d = a.f61590o;
        }
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (adfv.m50332a(getContext()).f61593r.mo33605a()) {
                m66770b();
                adfj adfj = (adfj) this.f79227b.get(str);
                if (adfj != null) {
                    adfi a = m66769a();
                    PackageInfo packageInfo = a.f61556b;
                    this.f79228c.mo33414a(packageInfo.packageName, packageInfo.versionCode);
                    adfb a2 = this.f79228c.mo33411a();
                    Bundle a3 = adfj.mo33418a(a, str2, bundle);
                    String valueOf = String.valueOf(str);
                    a2.mo33409a(valueOf.length() == 0 ? new String("IAContentProvider.") : "IAContentProvider.".concat(valueOf));
                    return a3;
                }
                f79225a.mo33426b("Unrecognized method: %s", str);
            }
            return null;
        } catch (RuntimeException e) {
            f79225a.mo33424a(e);
            adfd adfd = this.f79228c;
            if (adfd != null) {
                adfb a4 = adfd.mo33411a();
                String valueOf2 = String.valueOf(str);
                a4.mo33409a(valueOf2.length() == 0 ? new String("IAContentProvider.Failure.") : "IAContentProvider.Failure.".concat(valueOf2));
            }
            if (!(e instanceof SecurityException)) {
                adfu.m50331a(getContext(), e.getMessage(), e, f79225a);
                return null;
            }
            throw e;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        adgy a;
        adfv a2 = adfv.m50332a(getContext());
        if (!a2.f61593r.mo33605a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(aykr.m84203a()));
        printWriter.printf("Accounts: %s\n", Arrays.toString(a2.f61578c.mo33604d()));
        printWriter.printf("Opt-in account: %s\n", a2.f61578c.mo33600a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a2.f61579d.mo33606a()));
        printWriter.println("Event Log:");
        ListIterator b = this.f79231g.iterator();
        while (b.hasNext()) {
            printWriter.println((String) b.next());
        }
        a2.f61582g.mo33562a(printWriter);
        adik adik = a2.f61587l;
        printWriter.println("\n=== AppOverrides dump ===");
        try {
            adik.mo33534b();
            try {
                adgz b2 = adik.f61808c.mo33515b();
                try {
                    a = adik.f61808c.mo33509a(b2);
                    a.mo33504c();
                    while (a.mo33507e()) {
                        String a3 = adik.mo33529a(a.mo33502a());
                        if (a3 != null) {
                            byte[] b3 = a.mo33503b();
                            bxus b4 = bxus.m123743b();
                            long currentTimeMillis = System.currentTimeMillis();
                            adia adia = ((adhw) GeneratedMessageLite.m124016a(adhw.f61742b, b3, b4)).f61744a;
                            if (adia == null) {
                                adia = adia.f61759b;
                            }
                            long j = adia.f61761a;
                            long j2 = j - currentTimeMillis;
                            long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                            printWriter.printf("Package: %s\n", a3);
                            printWriter.printf("\tExpiration (millis): %d\n", Long.valueOf(j));
                            printWriter.printf("\tSnooze remaining: %dm%ds\n", Long.valueOf(minutes), Long.valueOf(seconds % 60));
                            if (j == Long.MAX_VALUE) {
                                printWriter.printf("\tThis package is permanently snoozed\n", new Object[0]);
                            }
                        }
                        a.mo33506d();
                    }
                    a.close();
                    b2.close();
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            } catch (bxwf e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("AppOverrides dump exception: ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            printWriter.println("=== End of AppOverrides dump ===");
            return;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("AppOverrides dump exception: ");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
            return;
        }
        throw th;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        if (!adfv.m50332a(getContext()).f61593r.mo33605a()) {
            return false;
        }
        m66770b();
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        adgy a;
        try {
            if (adfv.m50332a(getContext()).f61593r.mo33605a()) {
                m66770b();
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1) {
                    f79225a.mo33426b("Invalid URI for query: %s", uri);
                    return null;
                }
                String str3 = pathSegments.get(0);
                if (!"snoozedApps".equals(str3)) {
                    f79225a.mo33426b("Unrecognized query path: %s", uri);
                    return null;
                }
                adfi a2 = m66769a();
                if (mo43455a(a2.f61555a)) {
                    PackageInfo packageInfo = a2.f61556b;
                    this.f79228c.mo33414a(packageInfo.packageName, packageInfo.versionCode);
                    adfb a3 = this.f79228c.mo33411a();
                    adik adik = ((adhl) this.f79232h).f61714a;
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"packageName", "appOverrides"});
                    try {
                        adik.mo33534b();
                        adgz b = adik.f61808c.mo33515b();
                        try {
                            a = adik.f61808c.mo33509a(b);
                            a.mo33504c();
                            while (a.mo33507e()) {
                                String a4 = adik.mo33529a(a.mo33502a());
                                if (a4 != null) {
                                    matrixCursor.newRow().add("packageName", a4).add("appOverrides", a.mo33503b());
                                }
                                a.mo33506d();
                            }
                            a.close();
                            b.close();
                        } catch (Throwable th) {
                            b.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        adik.f61806a.mo33425a(e, "QuerySnoozedApps exception while accessing levelDb", new Object[0]);
                    }
                    String valueOf = String.valueOf(str3);
                    a3.mo33409a(valueOf.length() == 0 ? new String("IAContentProvider.") : "IAContentProvider.".concat(valueOf));
                    return matrixCursor;
                }
            }
            return null;
            throw th;
        } catch (RuntimeException e2) {
            f79225a.mo33424a(e2);
            adfd adfd = this.f79228c;
            if (adfd != null) {
                adfb a5 = adfd.mo33411a();
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb.append("IAContentProvider.Failure.");
                sb.append(valueOf2);
                a5.mo33409a(sb.toString());
            }
            if (!(e2 instanceof SecurityException)) {
                adfu.m50331a(getContext(), e2.getMessage(), e2, f79225a);
                return null;
            }
            throw e2;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo43455a(int i) {
        return i == f79226f || this.f79229d.mo33422b(i) || this.f79229d.mo33421a(i);
    }
}
