package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: abzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzq {

    /* renamed from: a */
    public final abyx f58824a;

    /* renamed from: b */
    public boolean f58825b;

    /* renamed from: c */
    public final abri f58826c;

    /* renamed from: d */
    private final Account[] f58827d;

    public abzq(abyx abyx, abri abri, Set set) {
        this(abyx, abri, (Account[]) set.toArray(new Account[set.size()]));
    }

    /* renamed from: a */
    private final abrl m48703a() {
        return this.f58824a.f58772a.f58771e;
    }

    /* renamed from: a */
    private static final void m48704a(abyv abyv) {
        if (abyv.mo32478g().mo32553a() == 2) {
            String valueOf = String.valueOf(abyv);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Clearing GSAI for ");
            sb.append(valueOf);
            sb.append("; no longer in resources");
            absg.m48201d(sb.toString());
            try {
                abyv.mo32463a(abzr.m48713b(null, 0));
            } catch (acaq e) {
                throw new acas("Could not clear GSAI");
            }
        }
    }

    public abzq(abyx abyx, abri abri, Account[] accountArr) {
        this.f58824a = abyx;
        this.f58826c = abri;
        this.f58827d = accountArr;
    }

    /* renamed from: a */
    private final void m48705a(abyv abyv, String str) {
        abri abri = this.f58826c;
        abrv abrv = abri.f58036a;
        if (!abrv.f58088x && abyv.f58761b.equals(abrv.f58066b.getPackageName())) {
            absg.m48205e("Skipping unregister from self resource");
            return;
        }
        abrv abrv2 = abri.f58036a;
        absg.m48203d("unregisterFromResources: %s corpus %s", abyv.f58761b, str);
        abrv2.f58067c.mo32992b(2);
        acak acak = new acak(abyv.f58761b, str);
        abzr c = abrv2.mo32298a().mo32540c(acak);
        if (c == null) {
            absg.m48193b("Request to unregister non-existent resources corpus %s from package %s", str, abyv.f58761b);
            return;
        }
        sdo.m34970a(c.mo32553a() == 2);
        if (!abrv2.mo32313a(acak, abyv)) {
            String valueOf = String.valueOf(abyv.f58761b);
            absg.m48191b(valueOf.length() == 0 ? new String("Failed to unregister corpus from client ") : "Failed to unregister corpus from client ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final abyu mo32548a(ApplicationInfo applicationInfo) {
        XmlResourceParser xmlResourceParser;
        if (applicationInfo.packageName != null) {
            Context context = this.f58824a.f58772a.f58768b;
            if ("com.google.android.gms".equals(applicationInfo.packageName)) {
                try {
                    xmlResourceParser = context.getResources().getXml(C0126R.xml.appdatasearch);
                } catch (Resources.NotFoundException e) {
                    absg.m48189a(e, "Failed to load resources for GmsCore");
                    return null;
                }
            } else {
                try {
                    context = context.createPackageContext(applicationInfo.packageName, 0);
                    XmlResourceParser loadXmlMetaData = applicationInfo.loadXmlMetaData(this.f58824a.f58772a.f58769c, "com.google.android.gms.appdatasearch");
                    if (loadXmlMetaData != null) {
                        xmlResourceParser = loadXmlMetaData;
                    } else {
                        absg.m48193b("Failed to read %s meta data from %s; could not create XML parser", "com.google.android.gms.appdatasearch", applicationInfo.packageName);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | SecurityException e2) {
                    absg.m48195b(e2, "Failed to get context for %s", applicationInfo.packageName);
                    return null;
                }
            }
            return new abyu(applicationInfo, context, xmlResourceParser);
        }
        absg.m48191b("null packageName in ApplicationInfo, bailing");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r6 = r12.f58826c;
        r7 = r12.f58824a.mo32498a(r13.applicationInfo);
        r8 = r13.lastUpdateTime;
        r10 = r6.f58036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0216, code lost:
        if (r10.f58088x != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0224, code lost:
        if (r7.f58780f.equals(r10.f58066b.getPackageName()) == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0226, code lost:
        p000.absg.m48205e("Skipping register from self resource");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022c, code lost:
        r6 = r6.f58036a;
        r10 = p000.absd.m48169a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0232, code lost:
        if (r10 != null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r6.mo32288a(r7, p000.abzr.m48713b(r5, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r7 = r7.f58780f;
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 41);
        r9.append("Failed to register corpus from ");
        r9.append(r7);
        r9.append(" resources");
        p000.absg.m48189a(r6, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026b, code lost:
        throw new p000.acaq(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b8, code lost:
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c0, code lost:
        if (r1.hasNext() == false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c2, code lost:
        m48705a(r0, (java.lang.String) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d4, code lost:
        if ("com.google.android.gms".equals(r0.f58761b) != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d6, code lost:
        r14 = r14.f58752b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d8, code lost:
        if (r14 == null) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02da, code lost:
        r1 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r14);
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 19) + java.lang.String.valueOf(r2).length());
        r4.append("Setting GSAI for ");
        r4.append(r1);
        r4.append(": ");
        r4.append(r2);
        p000.absg.m48201d(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r0.mo32463a(p000.abzr.m48713b(r14, r13.lastUpdateTime));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        m48704a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0327, code lost:
        r0.mo32485n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x032a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0347, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x034c, code lost:
        if (r13.getMessage() == null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034e, code lost:
        r13 = "Error parsing xml.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0351, code lost:
        r13 = r13.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0355, code lost:
        p000.absg.m48191b(r13);
        r0.mo32472b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        r3 = r0.f58763d;
        r4 = r0.f58761b;
        r5 = r3.f60625g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r7 = r3.mo33026d(r4);
        r6 = (p000.bxvd) r7.mo74142c(5);
        r6.mo73625a((p000.GeneratedMessageLite) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        if (r6.f164950c != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ff, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
        r7 = (p000.abul) r6.f164949b;
        r8 = p000.abul.f58412n;
        r7.f58414a &= -1025;
        r7.f58425l = false;
        r3.mo33020a(r4, (p000.abul) r6.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011b, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        r3 = r0.f58763d;
        r4 = r0.f58761b;
        r5 = r3.f60625g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r7 = r3.mo33026d(r4);
        r6 = (p000.bxvd) r7.mo74142c(5);
        r6.mo73625a((p000.GeneratedMessageLite) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0140, code lost:
        if (((p000.abul) r6.f164949b).f58425l == true) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        if (r6.f164950c != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        r6.mo74035c();
        r6.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014c, code lost:
        r7 = (p000.abul) r6.f164949b;
        r8 = p000.abul.f58412n;
        r7.f58414a |= 1024;
        r7.f58425l = true;
        r3.mo33020a(r4, (p000.abul) r6.mo74062i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0163, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01be, code lost:
        r4 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c6, code lost:
        if (r4.hasNext() == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c8, code lost:
        r5 = (com.google.android.gms.appdatasearch.RegisterCorpusInfo) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d2, code lost:
        if (p000.acaw.m48785b() != false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e9, code lost:
        if (p000.abzp.m48702a(r0.f58761b, r5, r0.mo32483l(), r12.f58824a.f58772a.f58768b.getResources()) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01eb, code lost:
        p000.absg.m48210f("Package %s Corpus %s Version %s failed appdatasearch-corpus-whitelist", r0.f58761b, r5.f9635a, r5.f9636b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0201, code lost:
        r3.remove(r5.f9635a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0347 A[ExcHandler: abyt (r13v5 'e' abyt A[CUSTOM_DECLARE]), Splitter:B:38:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo32549a(PackageInfo packageInfo, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        RegisterCorpusInfo registerCorpusInfo;
        if (packageInfo.applicationInfo.metaData == null || !packageInfo.applicationInfo.metaData.containsKey("com.google.android.gms.appdatasearch")) {
            z2 = false;
        } else {
            z2 = true;
        }
        abyv d = this.f58824a.mo32506d(packageInfo.packageName);
        if (d == null || d.mo32480i()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (((Boolean) acaw.f59386f.mo58455c()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (packageInfo.applicationInfo.targetSdkVersion > 27) {
                if (!sqc.m35963b(((String) abzt.f58974ci.mo58455c()).split(","), packageInfo.packageName)) {
                    z4 = true;
                    if (z2 || z3 || z4) {
                        if (z2) {
                            absg.m48202d("Package %s has no appdatasearch metadata", packageInfo.packageName);
                        } else if (!z3) {
                            absg.m48206e("Package %s targets Android P and isn't allowed to use AppDataSearch indexing API", packageInfo.packageName);
                        } else {
                            absg.m48202d("Package %s is not allowed to use icing", packageInfo.packageName);
                        }
                        if (d == null) {
                            d.mo32472b((String) null);
                            String valueOf = String.valueOf(d);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                            sb.append("updateResources: resources removed:");
                            sb.append(valueOf);
                            absg.m48184a(sb.toString());
                            m48704a(d);
                            for (String str : m48703a().mo32293a(this.f58824a.mo32498a(packageInfo.applicationInfo))) {
                                m48705a(d, str);
                            }
                            d.mo32485n();
                            return;
                        }
                        return;
                    }
                    abyv c = this.f58824a.mo32505c(packageInfo.packageName);
                    if (z || c.mo32486o() || c.f58761b.equals("com.google.android.gms") || (this.f58825b && c.mo32488q())) {
                        String valueOf2 = String.valueOf(c);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                        sb2.append("updateResources: need to parse ");
                        sb2.append(valueOf2);
                        absg.m48196c(sb2.toString());
                        abyu a = mo32548a(packageInfo.applicationInfo);
                        if (a != null) {
                            try {
                                c.mo32472b((String) null);
                                abyr a2 = a.mo32460a(c.f58761b);
                                int i2 = 0;
                                while (true) {
                                    abyq[] abyqArr = a2.f58751a;
                                    if (i2 >= abyqArr.length) {
                                        break;
                                    } else if (abyqArr[i2].f58750b) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                Set a3 = m48703a().mo32293a(this.f58824a.mo32498a(packageInfo.applicationInfo));
                                Account[] accountArr = this.f58827d;
                                ArrayList arrayList = new ArrayList();
                                int i3 = 0;
                                while (true) {
                                    abyq[] abyqArr2 = a2.f58751a;
                                    if (i3 >= abyqArr2.length) {
                                        break;
                                    }
                                    abyq abyq = abyqArr2[i3];
                                    if (!abyq.f58750b) {
                                        arrayList.add(abyq.f58749a);
                                    } else {
                                        String a4 = absd.m48169a(abyq.f58749a);
                                        if (a4 != null) {
                                            throw new acaq(a4);
                                        } else if (accountArr != null) {
                                            for (Account account : accountArr) {
                                                RegisterCorpusInfo a5 = abyq.f58749a.mo7214a(account);
                                                if (absd.m48169a(a5) != null) {
                                                    absg.m48191b("Account exceeds length limits");
                                                } else {
                                                    arrayList.add(a5);
                                                }
                                            }
                                        }
                                    }
                                    i3++;
                                }
                            } catch (acaq e) {
                                throw new acas("Could not set GSAI from resources");
                            } catch (abyt e2) {
                            } catch (acaq e3) {
                                String str2 = packageInfo.packageName;
                                String str3 = registerCorpusInfo.f9635a;
                                String message = e3.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 39 + String.valueOf(str3).length() + String.valueOf(message).length());
                                sb3.append("From ");
                                sb3.append(str2);
                                sb3.append(" resources: problem with corpus ");
                                sb3.append(str3);
                                sb3.append(": ");
                                sb3.append(message);
                                throw new acaq(sb3.toString());
                            } catch (acaq e4) {
                                String message2 = e4.getMessage() == null ? "Error from Icing client." : e4.getMessage();
                                absg.m48191b(message2);
                                c.mo32472b(message2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        String valueOf3 = String.valueOf(c);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
                        sb4.append("updateResources: up to date:");
                        sb4.append(valueOf3);
                        absg.m48201d(sb4.toString());
                        return;
                    }
                }
            }
        }
        z4 = false;
        if (z2) {
        }
        if (z2) {
        }
        if (d == null) {
        }
    }

    /* renamed from: a */
    public final void mo32550a(boolean z) {
        for (String str : this.f58824a.mo32501b()) {
            if (!mo32552a(str, z)) {
                absg.m48185a("Package %s no longer installed", str);
                this.f58826c.mo32292a(str);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abzq.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      abzq.a(abyv, java.lang.String):void
      abzq.a(android.content.pm.PackageInfo, boolean):void
      abzq.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    public final boolean mo32551a(String str) {
        return mo32552a(str, false);
    }

    /* renamed from: a */
    public final boolean mo32552a(String str, boolean z) {
        try {
            PackageInfo packageInfo = this.f58824a.f58772a.f58769c.getPackageInfo(str, 128);
            if (!packageInfo.applicationInfo.enabled) {
                absg.m48202d("Package %s is disabled", packageInfo.packageName);
                this.f58826c.mo32292a(packageInfo.packageName);
                return true;
            }
            mo32549a(packageInfo, z);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
