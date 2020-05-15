package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.whispersystems.curve25519.Curve25519;

/* renamed from: acwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwz {
    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acom.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      acom.a(android.content.Context, ftw):acom
      acom.a(java.util.List, java.lang.String):int
      acom.a(java.lang.String, java.util.Iterator):acol
      ftv.a(java.lang.String, java.lang.String):java.lang.String
      ftv.a(android.database.sqlite.SQLiteDatabase, ftz):void
      ftv.a(ftz, long):boolean
      acom.a(java.lang.String, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0bdf  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0be5  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0c11  */
    /* renamed from: a */
    public static void m49916a(Context context, PrintWriter printWriter, String[] strArr, abrv abrv) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        Context context2;
        int i2;
        double d;
        boolean z4;
        long j;
        int i3;
        abta abta;
        long j2;
        int i4;
        absq absq;
        String str;
        int i5;
        String str2;
        acqm acqm;
        long j3;
        long j4;
        Iterator it;
        bxwc bxwc;
        String str3;
        String str4;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        abrv abrv2 = abrv;
        if (cemq.f183002a.mo6606a().mo79364f() && abrv2 != null) {
            if (strArr2 != null) {
                z2 = false;
                z = false;
                i = 0;
                for (String str5 : strArr2) {
                    if (str5.equals(Curve25519.NATIVE)) {
                        z2 = true;
                    } else if (str5.equals("gmsfiles")) {
                        z = true;
                    } else if (str5.equals("verbose")) {
                        i++;
                    }
                }
            } else {
                z2 = false;
                z = false;
                i = 0;
            }
            printWriter2.format("Icing on the Cake with module_version %d\n", Integer.valueOf(abym.m48547a(context)));
            try {
                abrv.mo32322e();
            } catch (acas e) {
                absg.m48191b("Error initializing IndexManager for dump.");
            }
            if (!abrv.mo32320d()) {
                printWriter2.println("Init failed");
                z3 = z;
            } else {
                try {
                    PackageInfo packageInfo = abrv2.f58066b.getPackageManager().getPackageInfo(abrv2.f58066b.getPackageName(), 0);
                    printWriter2.format("Apk version code: %d\n", Integer.valueOf(packageInfo.versionCode));
                    printWriter2.format("Apk version name: %s\n", packageInfo.versionName);
                } catch (PackageManager.NameNotFoundException e2) {
                }
                printWriter2.format("Version: %d\n", Integer.valueOf(abrv2.f58071g.mo33022b()));
                abvc abvc = abrv2.f58073i;
                double g = abrv2.f58078n.mo43412g();
                printWriter2.format("Storage state: %s\n", abvc.m48307a(abvc.mo32350a(g)));
                long c = abvc.mo32353c();
                long d2 = abvc.mo32354d();
                Object[] objArr = new Object[4];
                objArr[0] = acky.m49361a(c);
                objArr[1] = acky.m49361a(d2);
                if (c <= d2) {
                    double d3 = (double) d2;
                    double d4 = (double) c;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    Double.isNaN(d3);
                    d = ((d3 - d4) / d3) * 100.0d;
                } else {
                    d = 0.0d;
                }
                objArr[2] = Double.valueOf(d);
                objArr[3] = Double.valueOf(g * 100.0d);
                printWriter2.format("Disk usage %s budget %s free frac %.3f%% index free frac %.3f%%\n", objArr);
                boml d5 = abrv2.f58078n.mo43408d();
                abzo a = abrv.mo32298a();
                synchronized (((abzm) a).mo32525a()) {
                    try {
                        z4 = z2;
                        j = ((acan) ((abzm) a).f58813b).f59109a.getLong("created", 0);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Date date = new Date(j);
                NativeIndex nativeIndex = abrv2.f58078n;
                abta a2 = nativeIndex.mo43392a(NativeIndex.nativeGetStatus(nativeIndex.f79071b, false));
                NativeIndex nativeIndex2 = abrv2.f58078n;
                abta a3 = nativeIndex2.mo43392a(NativeIndex.nativeGetStatus(nativeIndex2.f79071b, true));
                Date date2 = new Date(a3.f58191a * 1000);
                Date date3 = new Date(abrv2.f58071g.mo33024c());
                Date date4 = new Date(a3.f58191a * 1000);
                boolean z5 = z;
                Date date5 = new Date(d5.f133670a * 1000);
                DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance(2, 2, Locale.US);
                printWriter2.format("Created \"%s\"\n", dateTimeInstance.format(date));
                printWriter2.format("Committed \"%s\"\n", dateTimeInstance.format(date2));
                printWriter2.format("Maintained \"%s\"\n", dateTimeInstance.format(date3));
                printWriter2.format("Flushed \"%s\" num docs %d\n", dateTimeInstance.format(date4), Integer.valueOf(a3.f58193c));
                DateFormat dateFormat = dateTimeInstance;
                printWriter2.format("Compacted \"%s\" num docs %d err %d\n", dateTimeInstance.format(date5), Integer.valueOf(d5.f133671b), Integer.valueOf(d5.f133672c));
                Object[] objArr2 = new Object[3];
                objArr2[0] = Boolean.valueOf(abrv2.f58071g.mo33029e());
                acrl acrl = abrv2.f58071g;
                synchronized (acrl.f60625g) {
                    try {
                        i3 = i;
                        abta = a2;
                        j2 = acrl.f60620b.getLong("app-params-last-update", 0);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
                objArr2[1] = dateFormat.format(new Date(j2));
                acrl acrl2 = abrv2.f58071g;
                synchronized (acrl2.f60625g) {
                    try {
                        i4 = acrl2.f60624f;
                    } catch (Throwable th3) {
                        while (true) {
                            throw th3;
                        }
                    }
                }
                objArr2[2] = Integer.valueOf(i4);
                printWriter2.format("App params: %s lu: %s ttl: %d\n", objArr2);
                acrl acrl3 = abrv2.f58071g;
                synchronized (acrl3.f60625g) {
                    try {
                        absq = (absq) acky.m49358a(acrl3.f60620b.getString("app-history-upload-status", null), (bxxk) absq.f58129c.mo74142c(7));
                    } catch (Throwable th4) {
                        while (true) {
                            throw th4;
                        }
                    }
                }
                Object[] objArr3 = new Object[4];
                if (!((Boolean) abzt.f58847O.mo58455c()).booleanValue()) {
                    str = "DISABLED ";
                } else {
                    str = "";
                }
                objArr3[0] = str;
                objArr3[1] = Boolean.valueOf(abrv2.f58071g.mo33031f());
                objArr3[2] = Long.valueOf(absq.f58131a);
                objArr3[3] = Long.valueOf(absq.f58132b);
                printWriter2.format("App history upl %sp: %s ls: %d/%d\n", objArr3);
                printWriter2.println("\nCorpora:");
                abzo a4 = abrv.mo32298a();
                bxwc bxwc2 = abta.f58192b;
                bxwc bxwc3 = a3.f58192b;
                synchronized (((abzm) a4).mo32525a()) {
                    try {
                        if (((abzm) a4).f58817f.size() == 0) {
                            printWriter2.append((CharSequence) "No corpora\n");
                            z3 = z5;
                            i5 = i3;
                        } else {
                            ArrayList arrayList = new ArrayList(((abzm) a4).f58817f.entrySet());
                            Collections.sort(arrayList, new abzd());
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                absr absr = ((abss) entry.getValue()).f58157b;
                                if (absr == null) {
                                    absr = absr.f58134s;
                                }
                                int i6 = absr.f58137b;
                                long j5 = i6 < bxwc2.size() ? ((absz) bxwc2.get(i6)).f58187a : 0;
                                if (i6 < bxwc3.size()) {
                                    j3 = j5;
                                    j4 = ((absz) bxwc3.get(i6)).f58187a;
                                } else {
                                    j3 = j5;
                                    j4 = 0;
                                }
                                Object[] objArr4 = new Object[2];
                                objArr4[0] = ((acak) entry.getKey()).mo32583a();
                                abss abss = (abss) entry.getValue();
                                StringBuilder sb = new StringBuilder();
                                absr absr2 = abss.f58157b;
                                if (absr2 == null) {
                                    absr2 = absr.f58134s;
                                }
                                Iterator it3 = absr2.f58145j.iterator();
                                bxwc bxwc4 = bxwc3;
                                int i7 = 0;
                                while (true) {
                                    it = it2;
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    bxwc bxwc5 = bxwc2;
                                    boolean z6 = z5;
                                    int i8 = i3;
                                    abqo abqo = (abqo) it3.next();
                                    int i9 = i7 + 1;
                                    sb.append("    ");
                                    sb.append(i7);
                                    sb.append(' ');
                                    sb.append(abqo.f57978b);
                                    if (!abqo.f57979c) {
                                        sb.append("(noindex)");
                                    }
                                    abqn abqn = abqn.VARIANT_NICKNAME;
                                    abql abql = abql.TOKENIZER_TEXT;
                                    abql a5 = abql.m48076a(abqo.f57980d);
                                    if (a5 == null) {
                                        a5 = abql.TOKENIZER_TEXT;
                                    }
                                    int ordinal = a5.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal == 1) {
                                            sb.append("(html)");
                                        } else if (ordinal == 2) {
                                            sb.append("(rfc822)");
                                        } else if (ordinal == 3) {
                                            sb.append("(url)");
                                        } else if (ordinal != 4) {
                                            sb.append("(unknown: ");
                                            abql a6 = abql.m48076a(abqo.f57980d);
                                            if (a6 == null) {
                                                a6 = abql.TOKENIZER_TEXT;
                                            }
                                            sb.append(a6.f57967g);
                                            sb.append(')');
                                        } else {
                                            sb.append("(none)");
                                        }
                                    }
                                    if (abqo.f57981e != 1) {
                                        sb.append(" w:");
                                        sb.append(abqo.f57981e);
                                    }
                                    if (!new bxvv(abqo.f57984h, abqo.f57974i).isEmpty()) {
                                        sb.append(" (variants");
                                        for (abqn abqn2 : new bxvv(abqo.f57984h, abqo.f57974i)) {
                                            String str6 = "unknown";
                                            int ordinal2 = abqn2.ordinal();
                                            if (ordinal2 == 0) {
                                                str6 = "nick";
                                            } else if (ordinal2 == 2) {
                                                str6 = "annotation";
                                            }
                                            sb.append(' ');
                                            sb.append(str6);
                                        }
                                        sb.append(')');
                                    }
                                    int a7 = abqh.m48072a(abqo.f57990o);
                                    if (a7 != 0) {
                                        if (a7 != 1) {
                                            sb.append(" (omni ");
                                            int a8 = abqh.m48072a(abqo.f57990o);
                                            if (a8 == 0) {
                                                a8 = 1;
                                            }
                                            int i10 = a8 - 1;
                                            if (i10 == 1) {
                                                sb.append("url)");
                                            } else if (i10 != 2) {
                                                sb.append("?)");
                                            } else {
                                                sb.append("title)");
                                            }
                                        }
                                    }
                                    if (!abqo.f57988m.isEmpty()) {
                                        sb.append(" p:");
                                        sb.append(abqo.f57988m);
                                    }
                                    sb.append(10);
                                    i7 = i9;
                                    it2 = it;
                                    i3 = i8;
                                    z5 = z6;
                                    bxwc2 = bxwc5;
                                }
                                sb.append("Global Search Sections: ");
                                absr absr3 = abss.f58157b;
                                if (absr3 == null) {
                                    absr3 = absr.f58134s;
                                }
                                sb.append(absr3.f58146k.size());
                                sb.append("\n");
                                absr absr4 = abss.f58157b;
                                if (absr4 == null) {
                                    absr4 = absr.f58134s;
                                }
                                Iterator it4 = absr4.f58146k.iterator();
                                while (it4.hasNext()) {
                                    abut abut = (abut) it4.next();
                                    sb.append("    ");
                                    sb.append(fro.m12230a(abut.f58466b));
                                    sb.append(": 0x");
                                    String valueOf = String.valueOf(Integer.toHexString(abut.f58468d));
                                    Iterator it5 = it4;
                                    String str7 = abut.f58468d != 0 ? "" : " (template literal)";
                                    sb.append(str7.length() == 0 ? new String(valueOf) : valueOf.concat(str7));
                                    sb.append(" parts: \"");
                                    abus abus = abut.f58467c;
                                    if (abus == null) {
                                        abus = abus.f58460b;
                                    }
                                    Iterator it6 = abus.f58462a.iterator();
                                    while (it6.hasNext()) {
                                        abur abur = (abur) it6.next();
                                        int i11 = abur.f58455a;
                                        if ((i11 & 4) != 0) {
                                            sb.append("%$bestMatch");
                                        } else if ((i11 & 2) != 0) {
                                            abup abup = abur.f58457c;
                                            if (abup == null) {
                                                abup = abup.f58444f;
                                            }
                                            int i12 = abup.f58447b;
                                            Iterator it7 = it6;
                                            absr absr5 = abss.f58157b;
                                            if (absr5 == null) {
                                                absr5 = absr.f58134s;
                                            }
                                            if (i12 >= absr5.f58145j.size()) {
                                                sb.append("[?invalid section ID:");
                                                abup abup2 = abur.f58457c;
                                                if (abup2 == null) {
                                                    abup2 = abup.f58444f;
                                                }
                                                sb.append(abup2.f58447b);
                                                sb.append(" (total:");
                                                absr absr6 = abss.f58157b;
                                                if (absr6 == null) {
                                                    absr6 = absr.f58134s;
                                                }
                                                sb.append(absr6.f58145j.size());
                                                sb.append(")]");
                                                it6 = it7;
                                            } else {
                                                sb.append("$");
                                                absr absr7 = abss.f58157b;
                                                if (absr7 == null) {
                                                    absr7 = absr.f58134s;
                                                }
                                                abup abup3 = abur.f58457c;
                                                if (abup3 == null) {
                                                    abup3 = abup.f58444f;
                                                }
                                                sb.append(((abqo) absr7.f58145j.get(abup3.f58447b)).f57978b);
                                                it6 = it7;
                                            }
                                        } else if (!abur.f58456b.isEmpty()) {
                                            sb.append(abur.f58456b);
                                        } else if ((abur.f58455a & 8) != 0) {
                                            sb.append("%$uri");
                                        } else {
                                            sb.append("[?unknown template part]");
                                        }
                                    }
                                    sb.append("\"\n");
                                    it4 = it5;
                                }
                                String str8 = "";
                                absr absr8 = abss.f58157b;
                                if (absr8 == null) {
                                    absr8 = absr.f58134s;
                                }
                                if (absr8.f58151p.isEmpty()) {
                                    bxwc = bxwc2;
                                } else if (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug")) {
                                    absr absr9 = abss.f58157b;
                                    if (absr9 == null) {
                                        absr9 = absr.f58134s;
                                    }
                                    String str9 = absr9.f58151p;
                                    absr absr10 = abss.f58157b;
                                    if (absr10 == null) {
                                        absr10 = absr.f58134s;
                                    }
                                    String str10 = absr10.f58150o;
                                    bxwc = bxwc2;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 13 + String.valueOf(str10).length());
                                    sb2.append("  account:");
                                    sb2.append(str9);
                                    sb2.append("(");
                                    sb2.append(str10);
                                    sb2.append(")\n");
                                    str8 = sb2.toString();
                                } else {
                                    str8 = "  account:<redacted>\n";
                                    bxwc = bxwc2;
                                }
                                StringBuilder sb3 = new StringBuilder();
                                absy absy = abss.f58158c;
                                if (absy == null) {
                                    absy = absy.f58176h;
                                }
                                for (Iterator it8 = absy.f58179b.iterator(); it8.hasNext(); it8 = it8) {
                                    absu absu = (absu) it8.next();
                                    sb3.append("    ");
                                    sb3.append(absu.f58168b);
                                    sb3.append(": ");
                                    sb3.append(absu.f58169c);
                                    sb3.append(10);
                                }
                                abqn abqn3 = abqn.VARIANT_NICKNAME;
                                abql abql2 = abql.TOKENIZER_TEXT;
                                absy absy2 = abss.f58158c;
                                if (absy2 == null) {
                                    absy2 = absy.f58176h;
                                }
                                int a9 = absx.m48236a(absy2.f58180c);
                                if (a9 == 0) {
                                    a9 = 1;
                                }
                                int i13 = a9 - 1;
                                if (i13 == 0) {
                                    str3 = "active";
                                } else if (i13 != 1) {
                                    str3 = "DELETED";
                                } else {
                                    str3 = "LIMBO";
                                }
                                Locale locale = Locale.US;
                                int i14 = i3;
                                Object[] objArr5 = new Object[17];
                                boolean z7 = z5;
                                absr absr11 = abss.f58157b;
                                if (absr11 == null) {
                                    absr11 = absr.f58134s;
                                }
                                objArr5[0] = Integer.valueOf(absr11.f58137b);
                                absr absr12 = abss.f58157b;
                                if (absr12 == null) {
                                    absr12 = absr.f58134s;
                                }
                                objArr5[1] = absr12.f58138c;
                                absr absr13 = abss.f58157b;
                                if (absr13 == null) {
                                    absr13 = absr.f58134s;
                                }
                                objArr5[2] = absr13.f58139d;
                                absr absr14 = abss.f58157b;
                                if (absr14 == null) {
                                    absr14 = absr.f58134s;
                                }
                                objArr5[3] = absr14.f58140e;
                                absr absr15 = abss.f58157b;
                                if (absr15 == null) {
                                    absr15 = absr.f58134s;
                                }
                                if (!absr15.f58141f.isEmpty()) {
                                    absr absr16 = abss.f58157b;
                                    if (absr16 == null) {
                                        absr16 = absr.f58134s;
                                    }
                                    str4 = absr16.f58141f;
                                } else {
                                    str4 = "(push)";
                                }
                                objArr5[4] = str4;
                                absr absr17 = abss.f58157b;
                                if (absr17 == null) {
                                    absr17 = absr.f58134s;
                                }
                                objArr5[5] = Boolean.valueOf(absr17.f58142g);
                                objArr5[6] = str3;
                                objArr5[7] = Long.valueOf(j3);
                                objArr5[8] = Long.valueOf(j4);
                                absr absr18 = abss.f58157b;
                                if (absr18 == null) {
                                    absr18 = absr.f58134s;
                                }
                                objArr5[9] = abzr.m48714b(absr18.f58147l);
                                DateFormat instance = DateFormat.getInstance();
                                absr absr19 = abss.f58157b;
                                if (absr19 == null) {
                                    absr19 = absr.f58134s;
                                }
                                objArr5[10] = instance.format(Long.valueOf(absr19.f58149n));
                                absr absr20 = abss.f58157b;
                                if (absr20 == null) {
                                    absr20 = absr.f58134s;
                                }
                                objArr5[11] = Long.valueOf(absr20.f58144i);
                                abss abss2 = abss;
                                absy absy3 = abss2.f58158c;
                                if (absy3 == null) {
                                    absy3 = absy.f58176h;
                                }
                                objArr5[12] = absy3.f58184g;
                                absr absr21 = abss2.f58157b;
                                if (absr21 == null) {
                                    absr21 = absr.f58134s;
                                }
                                objArr5[13] = absr21.f58152q;
                                objArr5[14] = str8;
                                objArr5[15] = sb.toString();
                                objArr5[16] = sb3.toString();
                                objArr4[1] = String.format(locale, "  id:%d\n  name:%s\n  version:\"%s\"\n  package:%s\n  uri:%s\n  trimmable:%s\n  state:%s\n  last indexed/committed:%d/%d\n  source:%s\n  sourcedTime:%s\n  usageReportId:%d\n  content incarnation:[%s]\n  type:%s\n  %s  sections:\n%s  counters:\n%s", objArr5);
                                printWriter2.format("%s:\n%s\n", objArr4);
                                bxwc3 = bxwc4;
                                it2 = it;
                                i3 = i14;
                                z5 = z7;
                                bxwc2 = bxwc;
                            }
                            z3 = z5;
                            i5 = i3;
                        }
                    } catch (Throwable th5) {
                        while (true) {
                            throw th5;
                        }
                    }
                }
                printWriter2.println("\nInternal Corpora:");
                Context context3 = abrv2.f58066b;
                printWriter2.println("Gservices flags:");
                printWriter2.format("  disableSMS: %b disableApps: %b disableContacts: %b clearInternalCorporaOnContentIncarnationMismatch: %b\n", Boolean.valueOf(cemq.m137365b()), abzt.f58886aa.mo58455c(), abzt.f58890ae.mo58455c(), abzt.f58872aM.mo58455c());
                printWriter2.format("  Min AGSA version: %d\n", abzt.f58887ab.mo58455c());
                acok c2 = acok.m49603c(context3);
                if (c2 != null) {
                    acom a10 = c2.mo32950a();
                    printWriter2.println("SMS:");
                    printWriter2.format("  Db version: %d\n", 4);
                    printWriter2.format("  total: %d Unread SMS: %d (lastDate: %d)\n", Integer.valueOf(a10.mo32955a("sms", false)), Integer.valueOf(a10.mo32955a("sms", true)), Long.valueOf(c2.mo32953b()));
                    printWriter2.format("  SMS CP stats: total: %d unread: %d lastId: %d\n", Integer.valueOf(c2.f60344f.mo32961a(acok.f60336a, false)), Integer.valueOf(c2.f60344f.mo32961a(acok.f60336a, true)), Integer.valueOf(c2.f60344f.mo32964b(acok.f60336a)));
                    printWriter2.format("  total: %d Unread MMS: %d (lastDate: %d)\n", Integer.valueOf(a10.mo32955a("mms", false)), Integer.valueOf(a10.mo32955a("mms", true)), Long.valueOf(c2.mo32954c()));
                    printWriter2.format("  MMS CP stats: total: %d unread: %d lastId: %d\n", Integer.valueOf(c2.f60344f.mo32961a(acok.f60337b, false)), Integer.valueOf(c2.f60344f.mo32961a(acok.f60337b, true)), Integer.valueOf(c2.f60344f.mo32964b(acok.f60337b)));
                }
                aclp a11 = aclp.m49388a(context3);
                if (a11 != null) {
                    printWriter2.println("Apps:");
                    printWriter2.format("  File version: %d\n", 4);
                    printWriter2.format("  Last seqno: %d\n", Long.valueOf(a11.mo32849e()));
                    acnn acnn = a11.f60102b;
                    synchronized (acnn.f60254a) {
                        try {
                            printWriter2.format("  Size of journal: %d bytes\n", Long.valueOf(acnn.f60256b.getFileStreamPath(acnn.f60257c).length()));
                            printWriter2.format("  Number of component names: %d\n", Integer.valueOf(acnn.mo32924b().size()));
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                printWriter2.println("\nClientInfo:");
                abyx abyx = abrv2.f58077m;
                synchronized (abyx.f58773b) {
                    try {
                        printWriter2.write("\nRegistered client info:");
                        for (abyv abyv : abyx.f58774c.values()) {
                            synchronized (abyv.f58763d.f60625g) {
                                try {
                                    printWriter2.format("\nInfo for package %s", abyv.f58761b);
                                    C1240of n = abyv.f58763d.mo33043n(abyv.f58761b);
                                    printWriter2.format("\n  version code: %d cert: %s", n.f26798a, n.f26799b);
                                    printWriter2.format("\n  version name: %s", abyv.f58762c.f58769c.getPackageInfo(abyv.f58761b, 0).versionName);
                                } catch (PackageManager.NameNotFoundException e3) {
                                    printWriter2.print("\n  failed to get package info for this client.");
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                                printWriter2.format("\n  fingerprint: %s", abyv.f58763d.mo33028e(abyv.f58761b));
                                printWriter2.format("\n  resource fingerprint: %s", abyv.f58763d.mo33030f(abyv.f58761b));
                                printWriter2.format("\n  blocked: %s", Boolean.valueOf(abyv.f58763d.mo33035h(abyv.f58761b)));
                                acrl acrl4 = abyv.f58763d;
                                String str11 = abyv.f58761b;
                                synchronized (acrl4.f60625g) {
                                    acqm = (acqm) acrl4.f60623e.get(str11);
                                }
                                if (acqm != null) {
                                    if (acqm.f60499b) {
                                        printWriter2.format("\n  ***blacklisted***", new Object[0]);
                                    }
                                }
                                if (abyv.mo32488q()) {
                                    printWriter2.format("\n  per-acct-template", new Object[0]);
                                }
                                printWriter2.print("\n  global search info:");
                                printWriter2.format("\n    sourced at %d %s", Long.valueOf(abyv.f58763d.mo33040k(abyv.f58761b)), abzr.m48714b(abyv.f58763d.mo33038j(abyv.f58761b)));
                                if (!"com.google.android.gms".equals(abyv.f58761b)) {
                                    printWriter2.format("\n    %s (%s)", abyv.f58763d.mo33036i(abyv.f58761b), abyv.f58763d.mo33041l(abyv.f58761b));
                                } else {
                                    for (GlobalSearchApplicationInfo globalSearchApplicationInfo : abyv.f58763d.mo33037i()) {
                                        printWriter2.format("\n    %s (%s)", globalSearchApplicationInfo, abyv.f58763d.mo33042m(globalSearchApplicationInfo.f9563b));
                                    }
                                }
                            }
                        }
                    } finally {
                        while (true) {
                            Throwable th8 = th7;
                        }
                    }
                }
                printWriter2.println("\nCorpus Usage Stats:");
                abuw h = abrv2.f58078n.mo43413h();
                if (h != null) {
                    bxwc bxwc6 = h.f58493a;
                    int size = bxwc6.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        abuv abuv = (abuv) bxwc6.get(i15);
                        printWriter2.format("id: %d\n", Integer.valueOf(abuv.f58485a));
                        printWriter2.format("docs: %d\n", Integer.valueOf(abuv.f58486b));
                        printWriter2.format("size: %s\n", acky.m49361a(abuv.f58488d));
                        printWriter2.format("deleted docs: %d\n", Integer.valueOf(abuv.f58487c));
                        printWriter2.format("deleted size: %d\n", Long.valueOf(abuv.f58489e));
                        printWriter.println();
                    }
                } else {
                    printWriter2.println("\nError getting usage stats");
                }
                if (z4) {
                    printWriter2.println("\nNative Index:");
                    try {
                        str2 = new String(NativeIndex.nativeGetDebugInfo(abrv2.f58078n.f79071b, i5), "UTF-8");
                    } catch (UnsupportedEncodingException e4) {
                        absg.m48189a(e4, "Can't convert byte array to String");
                        str2 = "";
                    }
                    printWriter2.println(str2);
                }
                acxk acxk = abrv2.f58090z;
                synchronized (acxk.f61016a) {
                    try {
                        printWriter2.format("QueryRecorder recording mode: %s\n", Boolean.valueOf(acxk.f61017b));
                        printWriter2.format("Records file path %s\n", acxk.f61018c.getAbsolutePath());
                    } catch (Throwable th9) {
                        while (true) {
                            throw th9;
                        }
                    }
                }
                List b = acxk.mo33200b();
                if (b != null) {
                    Iterator it9 = b.iterator();
                    while (it9.hasNext()) {
                        printWriter2.format("record: {\n%s\n}\n", ((abtt) it9.next()).toString());
                    }
                }
            }
            acpv.m49685a(printWriter);
            if (z3) {
                try {
                    String canonicalPath = new File(String.valueOf(context.getFilesDir().getPath()).concat("/..")).getCanonicalPath();
                    printWriter2.format("\nGoogle Play Services Files (in %s):\n", canonicalPath);
                    ArrayList arrayList2 = new ArrayList();
                    context2 = context;
                    try {
                        m49917a(context2, arrayList2, canonicalPath);
                        Collections.sort(arrayList2);
                        Iterator it10 = arrayList2.iterator();
                        while (it10.hasNext()) {
                            printWriter2.println((acwy) it10.next());
                        }
                        i2 = 0;
                    } catch (IOException e5) {
                        e = e5;
                        String valueOf2 = String.valueOf(e.getMessage());
                        i2 = 0;
                        printWriter2.format(valueOf2.length() != 0 ? new String("\nError getting path of package directory: ") : "\nError getting path of package directory: ".concat(valueOf2), new Object[0]);
                        abvo.m48344a(printWriter2, context2);
                        printWriter2.format("\n\nFeatures:\n", new Object[i2]);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        Method[] declaredMethods = acaw.class.getDeclaredMethods();
                        while (r6 < r5) {
                        }
                        printWriter2.format("Enabled: %s\n\n", arrayList3);
                        printWriter2.format("Disabled: %s\n\n", arrayList4);
                    }
                } catch (IOException e6) {
                    e = e6;
                    context2 = context;
                    String valueOf22 = String.valueOf(e.getMessage());
                    i2 = 0;
                    printWriter2.format(valueOf22.length() != 0 ? new String("\nError getting path of package directory: ") : "\nError getting path of package directory: ".concat(valueOf22), new Object[0]);
                    abvo.m48344a(printWriter2, context2);
                    printWriter2.format("\n\nFeatures:\n", new Object[i2]);
                    ArrayList arrayList32 = new ArrayList();
                    ArrayList arrayList42 = new ArrayList();
                    Method[] declaredMethods2 = acaw.class.getDeclaredMethods();
                    while (r6 < r5) {
                    }
                    printWriter2.format("Enabled: %s\n\n", arrayList32);
                    printWriter2.format("Disabled: %s\n\n", arrayList42);
                }
            } else {
                context2 = context;
                i2 = 0;
            }
            abvo.m48344a(printWriter2, context2);
            printWriter2.format("\n\nFeatures:\n", new Object[i2]);
            ArrayList arrayList322 = new ArrayList();
            ArrayList arrayList422 = new ArrayList();
            Method[] declaredMethods22 = acaw.class.getDeclaredMethods();
            for (Method method : declaredMethods22) {
                method.setAccessible(true);
                try {
                    try {
                        Object invoke = method.invoke(null, new Object[0]);
                        if (invoke instanceof Boolean) {
                            if (!((Boolean) invoke).booleanValue()) {
                                arrayList422.add(method.getName());
                            } else {
                                arrayList322.add(method.getName());
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        String name = method.getName();
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 24 + String.valueOf(message).length());
                        sb4.append("Error accessing method ");
                        sb4.append(name);
                        sb4.append(".");
                        sb4.append(message);
                        absg.m48191b(sb4.toString());
                    }
                } catch (Exception e8) {
                    e = e8;
                    String name2 = method.getName();
                    String message2 = e.getMessage();
                    StringBuilder sb42 = new StringBuilder(String.valueOf(name2).length() + 24 + String.valueOf(message2).length());
                    sb42.append("Error accessing method ");
                    sb42.append(name2);
                    sb42.append(".");
                    sb42.append(message2);
                    absg.m48191b(sb42.toString());
                }
            }
            printWriter2.format("Enabled: %s\n\n", arrayList322);
            printWriter2.format("Disabled: %s\n\n", arrayList422);
        }
    }

    /* renamed from: a */
    private static void m49917a(Context context, ArrayList arrayList, String str) {
        String[] list = new File(str).list();
        if (list != null) {
            for (String str2 : list) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb.append(str);
                sb.append("/");
                sb.append(str2);
                String sb2 = sb.toString();
                File file = new File(sb2);
                if (file.isFile()) {
                    arrayList.add(new acwy(context, sb2, "FILE", Long.valueOf(file.length())));
                } else if (file.isDirectory()) {
                    arrayList.add(new acwy(context, sb2, "DIR", Long.valueOf(file.length())));
                    m49917a(context, arrayList, sb2);
                } else {
                    String valueOf = String.valueOf(sb2);
                    absg.m48184a(valueOf.length() == 0 ? new String("Unknown type of file: ") : "Unknown type of file: ".concat(valueOf));
                }
            }
        }
    }
}
