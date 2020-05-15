package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.OfflineReportSendTaskChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: wyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyb extends Thread {

    /* renamed from: a */
    private final Context f51558a;

    /* renamed from: b */
    private final ErrorReport f51559b;

    public wyb(Context context, ErrorReport errorReport) {
        this.f51558a = context;
        this.f51559b = errorReport;
    }

    /* renamed from: a */
    public static File m42456a(Context context, bylq bylq) {
        File file = new File(context.getFilesDir(), "reports");
        if (file.exists() || file.mkdirs()) {
            m42460a(file, ((int) cdtr.f181715a.mo6606a().mo78321t()) - 1);
            long currentTimeMillis = System.currentTimeMillis();
            int i = bylq.f164758ag;
            if (i == 0) {
                i = bxxm.f165037a.mo74228a(bylq).mo74216a(bylq);
                bylq.f164758ag = i;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append(currentTimeMillis);
            sb.append(".");
            sb.append(i);
            String sb2 = sb.toString();
            File file2 = new File(file, String.valueOf(sb2).concat(".tmp"));
            File file3 = new File(file, String.valueOf(sb2).concat(".proto.gz"));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
                bylq.mo73638a(gZIPOutputStream);
                gZIPOutputStream.close();
                if (file2.renameTo(file3)) {
                    return file3;
                }
                throw new IOException("failed to rename temporary file");
            } finally {
                file2.delete();
            }
        } else {
            throw new IOException("failed to create reports directory");
        }
    }

    /* renamed from: b */
    public static bylq m42461b(ErrorReport errorReport, Context context) {
        bxvd da = bylq.f166910e.mo74144da();
        byll c = m42462c(errorReport, context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bylq bylq = (bylq) da.f164949b;
        c.getClass();
        bylq.f166913b = c;
        bylq.f166912a |= 1;
        bxvd da2 = bylr.f166917p.mo74144da();
        bxvd da3 = bylk.f166853n.mo74144da();
        String a = m42457a(errorReport.f31549e);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk = (bylk) da3.f164949b;
        a.getClass();
        bylk.f166855a |= 1;
        bylk.f166856b = a;
        String a2 = m42457a(errorReport.f31550f);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk2 = (bylk) da3.f164949b;
        a2.getClass();
        bylk2.f166855a |= 2;
        bylk2.f166857c = a2;
        String a3 = m42457a(errorReport.f31551g);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk3 = (bylk) da3.f164949b;
        a3.getClass();
        bylk3.f166855a |= 4;
        bylk3.f166858d = a3;
        String a4 = m42457a(errorReport.f31552h);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk4 = (bylk) da3.f164949b;
        a4.getClass();
        bylk4.f166855a |= 8;
        bylk4.f166859e = a4;
        String a5 = m42457a(errorReport.f31553i);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk5 = (bylk) da3.f164949b;
        a5.getClass();
        int i = bylk5.f166855a | 16;
        bylk5.f166855a = i;
        bylk5.f166860f = a5;
        int i2 = errorReport.f31555k;
        bylk5.f166855a = i | 32;
        bylk5.f166861g = i2;
        String a6 = m42457a(errorReport.f31556l);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk6 = (bylk) da3.f164949b;
        a6.getClass();
        bylk6.f166855a |= 64;
        bylk6.f166862h = a6;
        String a7 = m42457a(errorReport.f31557m);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk7 = (bylk) da3.f164949b;
        a7.getClass();
        bylk7.f166855a |= 128;
        bylk7.f166863i = a7;
        String a8 = m42457a(errorReport.f31558n);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk8 = (bylk) da3.f164949b;
        a8.getClass();
        bylk8.f166855a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bylk8.f166864j = a8;
        String a9 = m42457a(errorReport.f31559o);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk9 = (bylk) da3.f164949b;
        a9.getClass();
        bylk9.f166855a |= 512;
        bylk9.f166865k = a9;
        String a10 = m42457a(errorReport.f31560p);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk10 = (bylk) da3.f164949b;
        a10.getClass();
        bylk10.f166855a |= 1024;
        bylk10.f166866l = a10;
        String a11 = m42457a(errorReport.f31554j);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bylk bylk11 = (bylk) da3.f164949b;
        a11.getClass();
        bylk11.f166855a |= 2048;
        bylk11.f166867m = a11;
        bylk bylk12 = (bylk) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bylr bylr = (bylr) da2.f164949b;
        bylk12.getClass();
        bylr.f166922d = bylk12;
        bylr.f166919a |= 4;
        if (errorReport.f31536a.packageName != null) {
            bxvd da4 = byls.f166935i.mo74144da();
            String str = errorReport.f31536a.packageName;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls = (byls) da4.f164949b;
            str.getClass();
            byls.f166937a |= 1;
            byls.f166938b = str;
            String a12 = m42458a(errorReport.f31536a.processName, "unknown");
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls2 = (byls) da4.f164949b;
            a12.getClass();
            int i3 = byls2.f166937a | 4;
            byls2.f166937a = i3;
            byls2.f166940d = a12;
            int i4 = errorReport.f31547c;
            byls2.f166937a = i3 | 8;
            byls2.f166941e = i4;
            String a13 = m42458a(errorReport.f31548d, "unknown");
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls3 = (byls) da4.f164949b;
            a13.getClass();
            byls3.f166937a |= 16;
            byls3.f166942f = a13;
            boolean z = errorReport.f31536a.systemApp;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls4 = (byls) da4.f164949b;
            byls4.f166937a |= 32;
            byls4.f166943g = z;
            String a14 = m42458a(errorReport.f31536a.installerPackageName, "unknown");
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls5 = (byls) da4.f164949b;
            a14.getClass();
            byls5.f166937a |= 2;
            byls5.f166939c = a14;
            String a15 = m42457a(errorReport.f31527R);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            byls byls6 = (byls) da4.f164949b;
            a15.getClass();
            byls6.f166937a |= 64;
            byls6.f166944h = a15;
            byls byls7 = (byls) da4.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bylr bylr2 = (bylr) da2.f164949b;
            byls7.getClass();
            bylr2.f166921c = byls7;
            bylr2.f166919a |= 2;
            bxvd da5 = byma.f166976j.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            byma byma = (byma) da5.f164949b;
            byma.f166978a |= 1;
            byma.f166979b = 0;
            if (cdto.f181712a.mo6606a().mo78292a()) {
                sre.m36087g(context);
            }
            String[] strArr = errorReport.f31563s;
            if (strArr != null) {
                String join = TextUtils.join("\n", strArr);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byma byma2 = (byma) da5.f164949b;
                join.getClass();
                byma2.f166978a |= 4;
                byma2.f166981d = join;
            }
            String[] strArr2 = errorReport.f31562r;
            if (strArr2 != null) {
                String join2 = TextUtils.join("\n", strArr2);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byma byma3 = (byma) da5.f164949b;
                join2.getClass();
                byma3.f166978a |= 2;
                byma3.f166980c = join2;
            }
            long currentTimeMillis = errorReport.f31536a.time == 0 ? System.currentTimeMillis() : errorReport.f31536a.time;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            byma byma4 = (byma) da5.f164949b;
            byma4.f166978a |= 1;
            byma4.f166979b = currentTimeMillis;
            String[] strArr3 = errorReport.f31561q;
            if (strArr3 != null) {
                List asList = Arrays.asList(strArr3);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byma byma5 = (byma) da5.f164949b;
                if (!byma5.f166982e.mo73666a()) {
                    byma5.f166982e = GeneratedMessageLite.m124021a(byma5.f166982e);
                }
                bxsy.m123078a(asList, byma5.f166982e);
            }
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            byma byma6 = (byma) da5.f164949b;
            byma6.f166978a |= 16;
            byma6.f166984g = 201515033;
            try {
                String str2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byma byma7 = (byma) da5.f164949b;
                str2.getClass();
                byma7.f166978a |= 32;
                byma7.f166985h = str2;
            } catch (PackageManager.NameNotFoundException e) {
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                byma byma8 = (byma) da5.f164949b;
                "20.15.15 (120300-{{cl}})".getClass();
                byma8.f166978a |= 32;
                byma8.f166985h = "20.15.15 (120300-{{cl}})";
                Log.e("gF_SaveReportThread", "Unable to get the version name from the package manager for GPS.", e);
            }
            bxvd da6 = bymb.f166988g.mo74144da();
            int i5 = errorReport.f31569y;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bymb bymb = (bymb) da6.f164949b;
            int i6 = bymb.f166990a | 1;
            bymb.f166990a = i6;
            bymb.f166991b = i5;
            int i7 = errorReport.f31570z;
            bymb.f166990a = i6 | 4;
            bymb.f166993d = i7;
            String a16 = m42457a(errorReport.f31510A);
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bymb bymb2 = (bymb) da6.f164949b;
            a16.getClass();
            int i8 = bymb2.f166990a | 2;
            bymb2.f166990a = i8;
            bymb2.f166992c = a16;
            int i9 = errorReport.f31515F;
            int i10 = i8 | 8;
            bymb2.f166990a = i10;
            bymb2.f166994e = i9;
            int i11 = errorReport.f31516G;
            bymb2.f166990a = i10 | 16;
            bymb2.f166995f = i11;
            bymb bymb3 = (bymb) da6.mo74062i();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            byma byma9 = (byma) da5.f164949b;
            bymb3.getClass();
            byma9.f166983f = bymb3;
            byma9.f166978a |= 8;
            boju b = sqq.m35992b(ModuleManager.get(context));
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            byma byma10 = (byma) da5.f164949b;
            b.getClass();
            byma10.f166986i = b;
            byma10.f166978a |= 64;
            byma byma11 = (byma) da5.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bylr bylr3 = (bylr) da2.f164949b;
            byma11.getClass();
            bylr3.f166920b = byma11;
            bylr3.f166919a |= 1;
            if (errorReport.f31536a.crashInfo != null) {
                bxvd da7 = bylm.f166879i.mo74144da();
                String a17 = m42457a(errorReport.f31536a.crashInfo.exceptionClassName);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm = (bylm) da7.f164949b;
                a17.getClass();
                bylm.f166881a |= 1;
                bylm.f166882b = a17;
                String a18 = m42457a(errorReport.f31536a.crashInfo.throwClassName);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm2 = (bylm) da7.f164949b;
                a18.getClass();
                bylm2.f166881a |= 16;
                bylm2.f166886f = a18;
                String a19 = m42457a(errorReport.f31536a.crashInfo.throwMethodName);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm3 = (bylm) da7.f164949b;
                a19.getClass();
                bylm3.f166881a |= 32;
                bylm3.f166887g = a19;
                String a20 = m42457a(errorReport.f31536a.crashInfo.stackTrace);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm4 = (bylm) da7.f164949b;
                a20.getClass();
                bylm4.f166881a |= 64;
                bylm4.f166888h = a20;
                int i12 = errorReport.f31536a.crashInfo.throwLineNumber;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm5 = (bylm) da7.f164949b;
                bylm5.f166881a |= 8;
                bylm5.f166885e = i12;
                String a21 = m42458a(errorReport.f31536a.crashInfo.throwFileName, "unknown");
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm6 = (bylm) da7.f164949b;
                a21.getClass();
                bylm6.f166881a |= 4;
                bylm6.f166884d = a21;
                String a22 = m42457a(errorReport.f31536a.crashInfo.exceptionMessage);
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bylm bylm7 = (bylm) da7.f164949b;
                a22.getClass();
                bylm7.f166881a |= 2;
                bylm7.f166883c = a22;
                bylm bylm8 = (bylm) da7.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr4 = (bylr) da2.f164949b;
                bylm8.getClass();
                bylr4.f166923e = bylm8;
                bylr4.f166919a |= 8;
            } else if (errorReport.f31536a.anrInfo != null) {
                bxvd da8 = byli.f166837f.mo74144da();
                String a23 = m42457a(errorReport.f31536a.anrInfo.cause);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                byli byli = (byli) da8.f164949b;
                a23.getClass();
                byli.f166839a |= 2;
                byli.f166841c = a23;
                String a24 = m42457a(errorReport.f31536a.anrInfo.info);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                byli byli2 = (byli) da8.f164949b;
                a24.getClass();
                byli2.f166839a |= 4;
                byli2.f166842d = a24;
                if (errorReport.f31536a.anrInfo.activity != null) {
                    String str3 = errorReport.f31536a.anrInfo.activity;
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    byli byli3 = (byli) da8.f164949b;
                    str3.getClass();
                    byli3.f166839a |= 1;
                    byli3.f166840b = str3;
                }
                String str4 = errorReport.f31564t;
                if (str4 != null) {
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    byli byli4 = (byli) da8.f164949b;
                    str4.getClass();
                    byli4.f166839a |= 8;
                    byli4.f166843e = str4;
                }
                byli byli5 = (byli) da8.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr5 = (bylr) da2.f164949b;
                byli5.getClass();
                bylr5.f166924f = byli5;
                bylr5.f166919a |= 16;
            } else if (errorReport.f31536a.batteryInfo != null) {
                bxvd da9 = bylj.f166845f.mo74144da();
                int i13 = errorReport.f31536a.batteryInfo.usagePercent;
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bylj bylj = (bylj) da9.f164949b;
                bylj.f166847a |= 1;
                bylj.f166848b = i13;
                long j = errorReport.f31536a.batteryInfo.durationMicros;
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bylj bylj2 = (bylj) da9.f164949b;
                bylj2.f166847a |= 2;
                bylj2.f166849c = j;
                String a25 = m42458a(errorReport.f31536a.batteryInfo.usageDetails, "unknown");
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bylj bylj3 = (bylj) da9.f164949b;
                a25.getClass();
                bylj3.f166847a |= 4;
                bylj3.f166850d = a25;
                String a26 = m42458a(errorReport.f31536a.batteryInfo.checkinDetails, "unknown");
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bylj bylj4 = (bylj) da9.f164949b;
                a26.getClass();
                bylj4.f166847a |= 8;
                bylj4.f166851e = a26;
                bylj bylj5 = (bylj) da9.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr6 = (bylr) da2.f164949b;
                bylj5.getClass();
                bylr6.f166925g = bylj5;
                bylr6.f166919a |= 32;
            } else if (errorReport.f31536a.runningServiceInfo != null) {
                bxvd da10 = byly.f166965d.mo74144da();
                long j2 = errorReport.f31536a.runningServiceInfo.durationMillis;
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byly byly = (byly) da10.f164949b;
                byly.f166967a |= 1;
                byly.f166968b = j2;
                String a27 = m42458a(errorReport.f31536a.runningServiceInfo.serviceDetails, "unknown");
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                byly byly2 = (byly) da10.f164949b;
                a27.getClass();
                byly2.f166967a |= 2;
                byly2.f166969c = a27;
                byly byly3 = (byly) da10.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr7 = (bylr) da2.f164949b;
                byly3.getClass();
                bylr7.f166926h = byly3;
                bylr7.f166919a |= 64;
            }
            if (errorReport.f31536a.type == 11 || !TextUtils.isEmpty(errorReport.f31525P)) {
                bxvd da11 = bymc.f166997e.mo74144da();
                if (errorReport.f31565u != null) {
                    bxvd da12 = bylp.f166903e.mo74144da();
                    if (da12.f164950c) {
                        da12.mo74035c();
                        da12.f164950c = false;
                    }
                    bylp bylp = (bylp) da12.f164949b;
                    "image/jpeg".getClass();
                    int i14 = bylp.f166905a | 1;
                    bylp.f166905a = i14;
                    bylp.f166906b = "image/jpeg";
                    String str5 = errorReport.f31565u;
                    str5.getClass();
                    bylp.f166905a = i14 | 2;
                    bylp.f166907c = str5;
                    bxvd da13 = byln.f166890d.mo74144da();
                    float f = (float) errorReport.f31567w;
                    if (da13.f164950c) {
                        da13.mo74035c();
                        da13.f164950c = false;
                    }
                    byln byln = (byln) da13.f164949b;
                    int i15 = byln.f166892a | 2;
                    byln.f166892a = i15;
                    byln.f166894c = f;
                    int i16 = errorReport.f31568x;
                    byln.f166892a = i15 | 1;
                    byln.f166893b = (float) i16;
                    if (da12.f164950c) {
                        da12.mo74035c();
                        da12.f164950c = false;
                    }
                    bylp bylp2 = (bylp) da12.f164949b;
                    byln byln2 = (byln) da13.mo74062i();
                    byln2.getClass();
                    bylp2.f166908d = byln2;
                    bylp2.f166905a |= 4;
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    bymc bymc = (bymc) da11.f164949b;
                    bylp bylp3 = (bylp) da12.mo74062i();
                    bylp3.getClass();
                    bymc.f167000b = bylp3;
                    bymc.f166999a |= 4;
                    List list = errorReport.f31540ad;
                    if (list != null && list.size() > 0) {
                        RectF[] rectFArr = (RectF[]) errorReport.f31540ad.toArray(new RectF[errorReport.f31540ad.size()]);
                        for (RectF rectF : rectFArr) {
                            bxvd da14 = bylo.f166896f.mo74144da();
                            float f2 = rectF.top;
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bylo bylo = (bylo) da14.f164949b;
                            bylo.f166898a |= 8;
                            bylo.f166902e = f2;
                            float f3 = rectF.left;
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bylo bylo2 = (bylo) da14.f164949b;
                            bylo2.f166898a |= 2;
                            bylo2.f166900c = f3;
                            float f4 = rectF.right;
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bylo bylo3 = (bylo) da14.f164949b;
                            bylo3.f166898a |= 4;
                            bylo3.f166901d = f4;
                            float f5 = rectF.bottom;
                            if (da14.f164950c) {
                                da14.mo74035c();
                                da14.f164950c = false;
                            }
                            bylo bylo4 = (bylo) da14.f164949b;
                            bylo4.f166898a |= 1;
                            bylo4.f166899b = f5;
                            if (da11.f164950c) {
                                da11.mo74035c();
                                da11.f164950c = false;
                            }
                            bymc bymc2 = (bymc) da11.f164949b;
                            bylo bylo5 = (bylo) da14.mo74062i();
                            bylo5.getClass();
                            if (!bymc2.f167002d.mo73666a()) {
                                bymc2.f167002d = GeneratedMessageLite.m124021a(bymc2.f167002d);
                            }
                            bymc2.f167002d.add(bylo5);
                        }
                    }
                }
                if (!TextUtils.isEmpty(errorReport.f31525P)) {
                    String str6 = errorReport.f31525P;
                    if (da11.f164950c) {
                        da11.mo74035c();
                        da11.f164950c = false;
                    }
                    bymc bymc3 = (bymc) da11.f164949b;
                    str6.getClass();
                    bymc3.f166999a |= 16;
                    bymc3.f167001c = str6;
                }
                bymc bymc4 = (bymc) da11.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr8 = (bylr) da2.f164949b;
                bymc4.getClass();
                bylr8.f166927i = bymc4;
                bylr8.f166919a |= 128;
            }
            boolean z2 = errorReport.f31514E;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bylr bylr9 = (bylr) da2.f164949b;
            int i17 = bylr9.f166919a | 1024;
            bylr9.f166919a = i17;
            bylr9.f166928j = z2;
            boolean z3 = errorReport.f31517H;
            int i18 = i17 | 2048;
            bylr9.f166919a = i18;
            bylr9.f166929k = z3;
            boolean z4 = errorReport.f31538ab;
            bylr9.f166919a = i18 | 8192;
            bylr9.f166931m = z4;
            if (!TextUtils.isEmpty(errorReport.f31543ag)) {
                String str7 = errorReport.f31543ag;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr10 = (bylr) da2.f164949b;
                str7.getClass();
                bylr10.f166919a |= 4096;
                bylr10.f166930l = str7;
            }
            Bundle bundle = errorReport.f31539ac;
            if (bundle != null && bundle.size() > 0) {
                String[] strArr4 = (String[]) errorReport.f31539ac.keySet().toArray(new String[errorReport.f31539ac.size()]);
                for (String str8 : strArr4) {
                    bxvd da15 = bylz.f166971d.mo74144da();
                    if (da15.f164950c) {
                        da15.mo74035c();
                        da15.f164950c = false;
                    }
                    bylz bylz = (bylz) da15.f164949b;
                    str8.getClass();
                    bylz.f166973a |= 1;
                    bylz.f166974b = str8;
                    long j3 = errorReport.f31539ac.getLong(str8);
                    if (da15.f164950c) {
                        da15.mo74035c();
                        da15.f164950c = false;
                    }
                    bylz bylz2 = (bylz) da15.f164949b;
                    bylz2.f166973a |= 4;
                    bylz2.f166975c = j3;
                    bylz bylz3 = (bylz) da15.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bylr bylr11 = (bylr) da2.f164949b;
                    bylz3.getClass();
                    if (!bylr11.f166932n.mo73666a()) {
                        bylr11.f166932n = GeneratedMessageLite.m124021a(bylr11.f166932n);
                    }
                    bylr11.f166932n.add(bylz3);
                }
            }
            if (aaya.m47228a(cdtx.m135029b()) && !(errorReport.f31544ah == null && errorReport.f31545ai == 0)) {
                bxvd da16 = bylv.f166947d.mo74144da();
                List list2 = errorReport.f31544ah;
                if (list2 == null) {
                    int i19 = errorReport.f31545ai;
                    if (i19 != 0) {
                        int a28 = bylu.m124940a(i19);
                        if (da16.f164950c) {
                            da16.mo74035c();
                            da16.f164950c = false;
                        }
                        bylv bylv = (bylv) da16.f164949b;
                        int i20 = a28 - 1;
                        if (a28 != 0) {
                            bylv.f166951c = i20;
                            bylv.f166949a |= 1;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    if (da16.f164950c) {
                        da16.mo74035c();
                        da16.f164950c = false;
                    }
                    bylv bylv2 = (bylv) da16.f164949b;
                    if (!bylv2.f166950b.mo73666a()) {
                        bylv2.f166950b = GeneratedMessageLite.m124021a(bylv2.f166950b);
                    }
                    bxsy.m123078a(list2, bylv2.f166950b);
                }
                bylv bylv3 = (bylv) da16.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylr bylr12 = (bylr) da2.f164949b;
                bylv3.getClass();
                bylr12.f166933o = bylv3;
                bylr12.f166919a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            }
            bylr bylr13 = (bylr) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bylq bylq2 = (bylq) da.f164949b;
            bylr13.getClass();
            bylq2.f166914c = bylr13;
            bylq2.f166912a |= 2;
            int i21 = errorReport.f31536a.type;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bylq bylq3 = (bylq) da.f164949b;
            bylq3.f166912a |= 4;
            bylq3.f166915d = i21;
            bylq bylq4 = (bylq) da.mo74062i();
            if (!TextUtils.isEmpty(errorReport.f31529T) && !"GoogleHelp".equals(errorReport.f31533X)) {
                aayh.m47252a(context.getFilesDir(), errorReport.f31529T, ".bmp");
            }
            return bylq4;
        }
        throw new wxv(errorReport.f31553i, errorReport.f31546b);
    }

    /* renamed from: c */
    static byll m42462c(ErrorReport errorReport, Context context) {
        bxvd da = byll.f166869h.mo74144da();
        String trim = m42457a(errorReport.f31512C).trim();
        if (!trim.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byll byll = (byll) da.f164949b;
            trim.getClass();
            byll.f166871a |= 2;
            byll.f166873c = trim;
        }
        String trim2 = m42457a(errorReport.f31546b).trim();
        if (!trim2.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byll byll2 = (byll) da.f164949b;
            trim2.getClass();
            byll2.f166871a |= 1;
            byll2.f166872b = trim2;
        }
        if (!TextUtils.isEmpty(errorReport.f31543ag)) {
            String str = errorReport.f31543ag;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byll byll3 = (byll) da.f164949b;
            str.getClass();
            byll3.f166871a |= 16;
            byll3.f166877g = str;
        }
        if (!TextUtils.isEmpty(errorReport.f31511B)) {
            String str2 = errorReport.f31511B;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byll byll4 = (byll) da.f164949b;
            str2.getClass();
            byll4.f166871a |= 4;
            byll4.f166874d = str2;
        }
        Bundle bundle = errorReport.f31513D;
        if (bundle != null && bundle.size() > 0) {
            String[] strArr = (String[]) errorReport.f31513D.keySet().toArray(new String[errorReport.f31513D.size()]);
            for (String str3 : strArr) {
                bxvd da2 = bylx.f166959d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylx bylx = (bylx) da2.f164949b;
                str3.getClass();
                bylx.f166961a |= 1;
                bylx.f166962b = str3;
                String a = m42457a(errorReport.f31513D.getString(str3));
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bylx bylx2 = (bylx) da2.f164949b;
                a.getClass();
                bylx2.f166961a |= 2;
                bylx2.f166963c = a;
                bylx bylx3 = (bylx) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byll byll5 = (byll) da.f164949b;
                bylx3.getClass();
                if (!byll5.f166876f.mo73666a()) {
                    byll5.f166876f = GeneratedMessageLite.m124021a(byll5.f166876f);
                }
                byll5.f166876f.add(bylx3);
            }
        }
        String[] strArr2 = errorReport.f31531V;
        if (strArr2 != null && strArr2.length > 0) {
            boolean z = !"GoogleHelp".equals(errorReport.f31533X);
            String[] strArr3 = errorReport.f31531V;
            for (String str4 : strArr3) {
                try {
                    File file = new File(new File(context.getFilesDir().getPath(), "reports"), String.valueOf(str4).concat(".txt"));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    srz.m36168a(new FileInputStream(file), new GZIPOutputStream(byteArrayOutputStream), true);
                    if (z) {
                        file.delete();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String concat = String.valueOf(str4).concat(".gz");
                    bxvd da3 = bylw.f166952e.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bylw bylw = (bylw) da3.f164949b;
                    concat.getClass();
                    int i = bylw.f166954a | 1;
                    bylw.f166954a = i;
                    bylw.f166955b = concat;
                    "application/gzip".getClass();
                    bylw.f166954a = i | 2;
                    bylw.f166956c = "application/gzip";
                    ByteString a2 = ByteString.m123261a(byteArray);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bylw bylw2 = (bylw) da3.f164949b;
                    a2.getClass();
                    bylw2.f166954a |= 4;
                    bylw2.f166957d = a2;
                    bylw bylw3 = (bylw) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byll byll6 = (byll) da.f164949b;
                    bylw3.getClass();
                    if (!byll6.f166875e.mo73666a()) {
                        byll6.f166875e = GeneratedMessageLite.m124021a(byll6.f166875e);
                    }
                    byll6.f166875e.add(bylw3);
                } catch (Exception e) {
                    String valueOf = String.valueOf(str4);
                    Log.w("gF_SaveReportThread", valueOf.length() == 0 ? new String("Could not read file at ") : "Could not read file at ".concat(valueOf));
                    bqye.m113758a(e);
                }
            }
        }
        return (byll) da.mo74062i();
    }

    public final void run() {
        try {
            m42456a(this.f51558a, m42461b(this.f51559b, this.f51558a));
            OfflineReportSendTaskChimeraService.m23397a(this.f51558a);
        } catch (IOException e) {
            Log.w("gF_SaveReportThread", "failed to write bug report", e);
        } catch (IllegalArgumentException | wxv e2) {
            Log.e("gF_SaveReportThread", "invalid report", e2);
        }
    }

    /* renamed from: a */
    private static String m42457a(String str) {
        return m42458a(str, "");
    }

    /* renamed from: a */
    static String m42458a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2) ? "" : str2;
        }
        return str;
    }

    /* renamed from: a */
    public static void m42459a(ErrorReport errorReport, Context context) {
        if (errorReport != null && !errorReport.f31514E && !errorReport.f31538ab) {
            stq.m36309a(new wxz(context));
        }
    }

    /* renamed from: a */
    static synchronized void m42460a(File file, int i) {
        int length;
        synchronized (wyb.class) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && (length = listFiles.length - i) > 0) {
                Arrays.sort(listFiles);
                for (int i2 = 0; i2 < length; i2++) {
                    listFiles[i2].delete();
                }
            }
        }
    }
}
