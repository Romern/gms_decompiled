package p000;

import android.content.ComponentName;
import android.content.Intent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acln */
public final /* synthetic */ class acln implements Runnable {

    /* renamed from: a */
    private final aclp f60096a;

    /* renamed from: b */
    private final Intent f60097b;

    public acln(aclp aclp, Intent intent) {
        this.f60096a = aclp;
        this.f60097b = intent;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileWriter.<init>(java.lang.String, boolean):void throws java.io.IOException}
      ClspMth{java.io.FileWriter.<init>(java.io.File, boolean):void throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017d A[SYNTHETIC, Splitter:B:74:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a8 A[SYNTHETIC, Splitter:B:88:0x01a8] */
    public final void run() {
        String str;
        char c;
        boolean z;
        boolean z2;
        PrintWriter printWriter;
        Throwable th;
        String str2;
        String str3;
        aclp aclp = this.f60096a;
        Intent intent = this.f60097b;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("AppsCorpus Got package manager broadcast: ");
        sb.append(valueOf);
        acnv.m49541a(sb.toString());
        String action = intent.getAction();
        if (intent.getData() != null) {
            str = intent.getData().getSchemeSpecificPart();
        } else {
            str = null;
        }
        switch (action.hashCode()) {
            case -810471698:
                if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -19011148:
                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 172491798:
                if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1544582882:
                if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            z2 = !intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            z = false;
        } else if (c == 1 || c == 2) {
            z2 = false;
            z = true;
        } else if (c == 3) {
            boolean a = C1599acls.m49402a(aclp.f60101a.getPackageManager(), str);
            z = a;
            z2 = !a;
        } else if (c == 4) {
            acnv.m49541a("AppsCorpus::handleLocaleChanged");
            if (!aclp.mo32846b()) {
                return;
            }
            aclp.mo32847c();
        } else {
            return;
        }
        if (z2) {
            List b = aclp.f60102b.mo32924b();
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str4);
                if (unflattenFromString == null) {
                    it.remove();
                } else if (str.equals(unflattenFromString.getPackageName())) {
                    arrayList.add(str4);
                    it.remove();
                }
            }
            long e = aclp.mo32849e();
            aclp.f60102b.mo32922a(arrayList, 3, e);
            aclp.f60102b.mo32921a((Iterable) b);
            aclp.mo32845a(e + ((long) arrayList.size()));
            acnv.m49543a("AppsCorpus::handlePackageRemoved: Removed package %s, number of removed components %d", str, Integer.valueOf(arrayList.size()));
        } else if (z) {
            bngx b2 = C1599acls.m49403b(aclp.f60101a.getPackageManager(), str);
            long e2 = aclp.mo32849e();
            aclp.f60102b.mo32922a(C1599acls.m49400a(b2), 2, e2);
            acnn acnn = aclp.f60102b;
            List<String> a2 = C1599acls.m49400a(b2);
            synchronized (acnn.f60254a) {
                try {
                    PrintWriter printWriter2 = new PrintWriter(new BufferedWriter(new FileWriter(acnn.f60256b.getFileStreamPath(acnn.f60258d), true)));
                    try {
                        for (String str5 : a2) {
                            printWriter2.println(str5);
                        }
                        try {
                            printWriter2.close();
                        } catch (RuntimeException e3) {
                            str3 = "Failed to close component name file %s";
                            str2 = acnn.f60258d;
                            acnv.m49542a(str3, str2);
                            aclp.mo32845a(e2 + ((long) b2.size()));
                            acnv.m49552c("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", str, Integer.valueOf(b2.size()));
                            aclp.mo32847c();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        printWriter = printWriter2;
                        try {
                            acnv.m49544a(e, "Failed to append to component name file.", new Object[0]);
                            if (printWriter != null) {
                            }
                            aclp.mo32845a(e2 + ((long) b2.size()));
                            acnv.m49552c("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", str, Integer.valueOf(b2.size()));
                            aclp.mo32847c();
                        } catch (Throwable th2) {
                            th = th2;
                            if (printWriter != null) {
                                try {
                                    printWriter.close();
                                } catch (RuntimeException e5) {
                                    acnv.m49542a("Failed to close component name file %s", acnn.f60258d);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        printWriter = printWriter2;
                        if (printWriter != null) {
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    printWriter = null;
                    acnv.m49544a(e, "Failed to append to component name file.", new Object[0]);
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (RuntimeException e7) {
                            str3 = "Failed to close component name file %s";
                            str2 = acnn.f60258d;
                            acnv.m49542a(str3, str2);
                            aclp.mo32845a(e2 + ((long) b2.size()));
                            acnv.m49552c("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", str, Integer.valueOf(b2.size()));
                            aclp.mo32847c();
                        }
                    }
                    aclp.mo32845a(e2 + ((long) b2.size()));
                    acnv.m49552c("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", str, Integer.valueOf(b2.size()));
                    aclp.mo32847c();
                } catch (Throwable th4) {
                    th = th4;
                    printWriter = null;
                    if (printWriter != null) {
                    }
                    throw th;
                }
            }
            aclp.mo32845a(e2 + ((long) b2.size()));
            acnv.m49552c("AppsCorpus::handlePackageAdded: Added package %s, number of added components %d", str, Integer.valueOf(b2.size()));
        } else {
            return;
        }
        aclp.mo32847c();
    }
}
