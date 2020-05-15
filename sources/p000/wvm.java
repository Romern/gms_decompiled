package p000;

import android.accounts.Account;
import android.app.ActivityManager;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvm {

    /* renamed from: a */
    ErrorReport f51422a;

    /* renamed from: b */
    public wvl f51423b;

    /* renamed from: c */
    public boolean f51424c;

    /* renamed from: d */
    public boolean f51425d;

    /* renamed from: e */
    private final Context f51426e;

    public wvm(Context context, ErrorReport errorReport, Screenshot screenshot) {
        this.f51426e = context;
        this.f51422a = errorReport;
        wvl wvl = new wvl();
        this.f51423b = wvl;
        if (screenshot != null) {
            wvl.f51418c = screenshot;
            Screenshot.m66506a(this.f51422a, (Screenshot) null);
        }
        m42345c();
    }

    /* renamed from: a */
    private static String m42342a(Pair pair) {
        if (pair == null) {
            return null;
        }
        String valueOf = String.valueOf(pair.first);
        String str = (String) pair.second;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(str).length());
        sb.append("VersionCode:");
        sb.append(valueOf);
        sb.append(";VersionName:");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    private final Pair m42344b(String str) {
        try {
            PackageInfo packageInfo = this.f51426e.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return Pair.create(Integer.valueOf(packageInfo.versionCode), packageInfo.versionName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x024f A[SYNTHETIC, Splitter:B:105:0x024f] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0259 A[SYNTHETIC, Splitter:B:112:0x0259] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019f A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ab A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf A[SYNTHETIC, Splitter:B:75:0x01bf] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ca A[SYNTHETIC, Splitter:B:81:0x01ca] */
    /* renamed from: c */
    private final void m42345c() {
        String g;
        String str;
        PackageInfo packageInfo;
        String str2;
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileReader fileReader;
        Throwable th2;
        Bundle bundle = this.f51422a.f31513D;
        if (bundle != null && bundle.size() > 0) {
            wvl wvl = this.f51423b;
            ErrorReport errorReport = this.f51422a;
            wvl.f51419d = errorReport.f31513D;
            errorReport.f31513D = null;
        }
        ErrorReport errorReport2 = this.f51422a;
        String[] strArr = errorReport2.f31531V;
        if (strArr != null && strArr.length > 0) {
            this.f51423b.f51420e = strArr;
            errorReport2.f31531V = null;
        }
        if (!errorReport2.f31536a.systemApp) {
            PackageManager packageManager = this.f51426e.getPackageManager();
            String str3 = this.f51422a.f31536a.packageName;
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str3, 0);
                ApplicationErrorReport applicationErrorReport = this.f51422a.f31536a;
                boolean z = true;
                if (applicationInfo == null || (applicationInfo.flags & 1) != 1) {
                    z = false;
                }
                applicationErrorReport.systemApp = z;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(str3);
                Log.e("gf_ErrorReportUtil", valueOf.length() == 0 ? new String("Error trying to get the application info for ") : "Error trying to get the application info for ".concat(valueOf));
            }
        }
        this.f51422a.f31536a.time = System.currentTimeMillis();
        this.f51422a.f31512C = aasw.m46952a();
        ErrorReport errorReport3 = this.f51422a;
        errorReport3.f31549e = Build.DEVICE;
        errorReport3.f31550f = Build.DISPLAY;
        errorReport3.f31551g = Build.TYPE;
        errorReport3.f31552h = Build.MODEL;
        errorReport3.f31553i = Build.PRODUCT;
        errorReport3.f31555k = Build.VERSION.SDK_INT;
        errorReport3.f31556l = Build.VERSION.RELEASE;
        errorReport3.f31557m = Build.VERSION.INCREMENTAL;
        errorReport3.f31558n = Build.VERSION.CODENAME;
        errorReport3.f31559o = Build.BOARD;
        errorReport3.f31560p = Build.BRAND;
        errorReport3.f31554j = Build.FINGERPRINT;
        Pair b = m42344b(errorReport3.f31536a.packageName);
        if (b != null) {
            errorReport3.f31547c = ((Integer) b.first).intValue();
            errorReport3.f31548d = (String) b.second;
        }
        m42343a(this.f51422a);
        ErrorReport errorReport4 = this.f51422a;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f51426e.getSystemService("activity")).getRunningAppProcesses();
        String[] strArr2 = new String[runningAppProcesses.size()];
        int i = 0;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            strArr2[i] = runningAppProcessInfo.processName;
            i++;
        }
        this.f51423b.f51416a = strArr2;
        if (errorReport4.f31536a.type == 2) {
            wvl wvl2 = this.f51423b;
            int i2 = Build.VERSION.SDK_INT;
            File[] listFiles = new File("/data/anr").listFiles(wvi.f51413a);
            String str4 = "";
            if (listFiles == null || listFiles.length == 0) {
                str2 = str4;
            } else {
                if (aaya.m47229b(cduj.f181774a.mo6606a().mo78347a())) {
                    Arrays.sort(listFiles, wvj.f51414a);
                } else {
                    Arrays.sort(listFiles, wvk.f51415a);
                }
                str2 = listFiles[0].getName();
            }
            if (!TextUtils.isEmpty(str2)) {
                File file = new File(str2);
                if (file.length() <= cdtr.m134947i()) {
                    try {
                        fileReader = new FileReader(str2);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append("\n");
                            }
                            str4 = sb.toString();
                            try {
                                fileReader.close();
                            } catch (IOException e2) {
                            }
                        } catch (IOException e3) {
                            try {
                                wyu.m42479a(this.f51426e, this.f51422a, 167, TextUtils.isEmpty(this.f51422a.f31511B) ? new Account(this.f51422a.f31511B, "com.google") : null, null, null, 0);
                                if (fileReader != null) {
                                    try {
                                        fileReader.close();
                                    } catch (IOException e4) {
                                    }
                                }
                                wvl2.f51417b = str4;
                                wvl wvl3 = this.f51423b;
                                g = cdtr.f181715a.mo6606a().mo78308g();
                                if (!TextUtils.isEmpty(g)) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (fileReader != null) {
                                    try {
                                        fileReader.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (fileReader != null) {
                            }
                            throw th2;
                        }
                    } catch (IOException e6) {
                        fileReader = null;
                        wyu.m42479a(this.f51426e, this.f51422a, 167, TextUtils.isEmpty(this.f51422a.f31511B) ? new Account(this.f51422a.f31511B, "com.google") : null, null, null, 0);
                        if (fileReader != null) {
                        }
                        wvl2.f51417b = str4;
                        wvl wvl32 = this.f51423b;
                        g = cdtr.f181715a.mo6606a().mo78308g();
                        if (!TextUtils.isEmpty(g)) {
                        }
                    } catch (Throwable th5) {
                        fileReader = null;
                        th2 = th5;
                        if (fileReader != null) {
                        }
                        throw th2;
                    }
                } else {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) this.f51426e.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    if (memoryInfo.availMem < cdtr.m134947i()) {
                        wyu.m42479a(this.f51426e, this.f51422a, 166, !TextUtils.isEmpty(this.f51422a.f31511B) ? new Account(this.f51422a.f31511B, "com.google") : null, null, null, 0);
                    } else {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                byte[] bArr = new byte[((int) cdtr.m134947i())];
                                randomAccessFile.seek((randomAccessFile.length() - ((long) ((int) cdtr.m134947i()))) - 1);
                                randomAccessFile.readFully(bArr);
                                str4 = new String(bArr, Charset.forName("UTF-8"));
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e7) {
                                }
                            } catch (IOException e8) {
                                if (randomAccessFile != null) {
                                }
                                str4 = null;
                                wvl2.f51417b = str4;
                                wvl wvl322 = this.f51423b;
                                g = cdtr.f181715a.mo6606a().mo78308g();
                                if (!TextUtils.isEmpty(g)) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                if (randomAccessFile != null) {
                                }
                                throw th;
                            }
                        } catch (IOException e9) {
                            randomAccessFile = null;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                    str4 = null;
                                } catch (IOException e10) {
                                    str4 = null;
                                    wvl2.f51417b = str4;
                                    wvl wvl3222 = this.f51423b;
                                    g = cdtr.f181715a.mo6606a().mo78308g();
                                    if (!TextUtils.isEmpty(g)) {
                                    }
                                }
                                wvl2.f51417b = str4;
                                wvl wvl32222 = this.f51423b;
                                g = cdtr.f181715a.mo6606a().mo78308g();
                                if (!TextUtils.isEmpty(g)) {
                                }
                            }
                            str4 = null;
                            wvl2.f51417b = str4;
                            wvl wvl322222 = this.f51423b;
                            g = cdtr.f181715a.mo6606a().mo78308g();
                            if (!TextUtils.isEmpty(g)) {
                            }
                        } catch (Throwable th7) {
                            randomAccessFile = null;
                            th = th7;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e11) {
                                }
                            }
                            throw th;
                        }
                    }
                }
            }
            wvl2.f51417b = str4;
        }
        wvl wvl3222222 = this.f51423b;
        g = cdtr.f181715a.mo6606a().mo78308g();
        if (!TextUtils.isEmpty(g)) {
            String[] a = aayh.m47256a(g);
            for (String str5 : a) {
                if (!TextUtils.isEmpty(str5)) {
                    if (wvl3222222.f51419d == null) {
                        wvl3222222.f51419d = new Bundle();
                    }
                    String a2 = m42342a(m42344b(str5));
                    if (!TextUtils.isEmpty(a2)) {
                        wvl3222222.f51419d.putCharSequence(str5, a2);
                    } else {
                        String valueOf2 = String.valueOf(str5);
                        Log.e("gf_ErrorReportUtil", valueOf2.length() == 0 ? new String("Error trying to add app version info for ") : "Error trying to add app version info for ".concat(valueOf2));
                    }
                    if (TextUtils.equals("com.google.android.webview", str5)) {
                        PackageManager packageManager2 = this.f51426e.getPackageManager();
                        int i3 = Build.VERSION.SDK_INT;
                        int i4 = Build.VERSION.SDK_INT;
                        try {
                            Class<?> cls = Class.forName("android.webkit.WebViewUpdateService");
                            str = (String) cls.getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(cls, new Object[0]);
                        } catch (Exception e12) {
                            str = null;
                        }
                        if (str != null) {
                            try {
                                packageInfo = packageManager2.getPackageInfo(str, 8192);
                            } catch (PackageManager.NameNotFoundException e13) {
                                packageInfo = null;
                            }
                        } else {
                            packageInfo = null;
                        }
                        if (packageInfo != null) {
                            String a3 = m42342a(Pair.create(Integer.valueOf(packageInfo.versionCode), packageInfo.versionName));
                            if (!TextUtils.isEmpty(a3)) {
                                wvl3222222.f51419d.putCharSequence("Effective WebView package name", packageInfo.packageName);
                                wvl3222222.f51419d.putCharSequence("Effective WebView package version", a3);
                            } else {
                                Log.e("gf_ErrorReportUtil", "Empty WebView package version when attempting to get effective WebView package info.");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m42343a(ErrorReport errorReport) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f51426e.getSystemService("phone");
        errorReport.f31569y = telephonyManager.getPhoneType();
        errorReport.f31510A = telephonyManager.getNetworkOperatorName();
        errorReport.f31570z = telephonyManager.getNetworkType();
        String networkOperator = telephonyManager.getNetworkOperator();
        try {
            if (!TextUtils.isEmpty(networkOperator)) {
                errorReport.f31515F = Integer.parseInt(networkOperator.substring(0, 3));
                errorReport.f31516G = Integer.parseInt(networkOperator.substring(3));
            }
        } catch (NumberFormatException e) {
        } catch (IndexOutOfBoundsException e2) {
        } catch (Exception e3) {
            String valueOf = String.valueOf(e3.getMessage());
            Log.e("gf_ErrorReportUtil", valueOf.length() == 0 ? new String("Exception while gathering network params: ") : "Exception while gathering network params: ".concat(valueOf));
        }
    }

    /* renamed from: b */
    public final ErrorReport mo29466b() {
        mo29463a();
        return this.f51422a;
    }

    public wvm(Context context, FeedbackOptions feedbackOptions) {
        this.f51426e = context;
        this.f51422a = new ErrorReport(feedbackOptions, context.getCacheDir());
        this.f51423b = new wvl();
        Bitmap bitmap = feedbackOptions.f31602m;
        if (bitmap != null) {
            this.f51423b.f51418c = Screenshot.m66502a(bitmap);
        }
        m42345c();
    }

    /* renamed from: a */
    public final List mo29462a(String str) {
        Context context = this.f51426e;
        String str2 = this.f51422a.f31536a.packageName;
        aney a = anef.m64089a(context);
        String valueOf = String.valueOf(str2);
        aucb a2 = a.mo41763b(valueOf.length() == 0 ? new String("app:") : "app:".concat(valueOf), str).mo50364a(wxw.f51555a);
        try {
            aucu.m76783a(a2, cdtx.f181756a.mo6606a().mo78334b(), TimeUnit.MILLISECONDS);
            return (List) a2.mo50386d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f51422a.f31545ai = 2;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb.append("Could not retrieve experiment tokens: ");
            sb.append(valueOf2);
            Log.e("gf_ErrorReportUtil", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo29463a() {
        String[] strArr;
        String[] strArr2;
        this.f51422a.f31531V = this.f51423b.mo29461b(true);
        this.f51422a.f31513D = this.f51423b.mo29460a(true);
        if (!this.f51424c) {
            ErrorReport errorReport = this.f51422a;
            wvl wvl = this.f51423b;
            errorReport.f31564t = wvl.f51417b;
            Map map = wvl.f51421f;
            if (map != null) {
                strArr = (String[]) map.get("system_log");
            } else {
                strArr = null;
            }
            errorReport.f31562r = strArr;
            ErrorReport errorReport2 = this.f51422a;
            Map map2 = this.f51423b.f51421f;
            if (map2 != null) {
                strArr2 = (String[]) map2.get("event_log");
            } else {
                strArr2 = null;
            }
            errorReport2.f31563s = strArr2;
            this.f51422a.f31561q = this.f51423b.f51416a;
        } else {
            ErrorReport errorReport3 = this.f51422a;
            errorReport3.f31564t = null;
            errorReport3.f31562r = null;
            errorReport3.f31563s = null;
            errorReport3.f31561q = null;
            if (!errorReport3.f31541ae) {
                errorReport3.f31531V = null;
                errorReport3.f31513D = null;
            }
        }
        if (!this.f51425d) {
            Screenshot.m66506a(this.f51422a, this.f51423b.f51418c);
        } else if (aaya.m47229b(cdud.f181765a.mo6606a().mo78341b())) {
            ErrorReport errorReport4 = this.f51422a;
            if (errorReport4 != null) {
                errorReport4.f31565u = null;
                errorReport4.f31566v = null;
                errorReport4.f31529T = null;
                BitmapTeleporter bitmapTeleporter = errorReport4.f31528S;
                if (bitmapTeleporter != null) {
                    if (!bitmapTeleporter.f30157d) {
                        try {
                            bitmapTeleporter.f30155b.close();
                        } catch (IOException e) {
                            Log.w("BitmapTeleporter", "Could not close PFD", e);
                        }
                    }
                    errorReport4.f31528S = null;
                }
                Bitmap bitmap = errorReport4.f31542af;
                if (bitmap != null) {
                    bitmap.recycle();
                    errorReport4.f31542af = null;
                }
                errorReport4.f31567w = 0;
                errorReport4.f31568x = 0;
            }
        } else {
            Screenshot.m66506a(this.f51422a, (Screenshot) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29464a(Bundle bundle) {
        if (bundle != null && bundle.size() != 0) {
            wvl wvl = this.f51423b;
            Bundle bundle2 = wvl.f51419d;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            } else {
                wvl.f51419d = bundle;
            }
            ErrorReport errorReport = this.f51422a;
            errorReport.f31513D = this.f51423b.mo29460a(!errorReport.f31532W);
        }
    }

    /* renamed from: a */
    public final void mo29465a(Map map) {
        LogOptions logOptions;
        if (map != null) {
            if (map.containsKey("radio_log") && ((String[]) map.get("radio_log")).length > 0 && (logOptions = this.f51422a.f31535Z) != null && logOptions.f31615b) {
                FileTeleporter fileTeleporter = new FileTeleporter(TextUtils.join("\n", (Object[]) map.get("radio_log")).getBytes(), "text/plain", this.f51426e.getString(C0126R.string.gf_radio_log));
                fileTeleporter.mo18618a(this.f51426e.getFilesDir());
                String a = aayh.m47238a(fileTeleporter, aayh.m47236a(this.f51426e.getFilesDir()));
                wvl wvl = this.f51423b;
                String[] strArr = wvl.f51420e;
                if (strArr != null) {
                    wvl.f51420e = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr, new String[]{a}});
                } else {
                    wvl.f51420e = new String[]{a};
                }
                map.remove("radio_log");
            }
            wvl wvl2 = this.f51423b;
            if (wvl2.f51421f == null) {
                wvl2.f51421f = new C1223np();
            }
            this.f51423b.f51421f.putAll(map);
        }
    }
}
