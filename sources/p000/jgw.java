package p000;

import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.p029ui.ManagingAppInstallBroadcastReceiver;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: jgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgw extends Loader implements jgv {

    /* renamed from: a */
    public static final Logger f22448a = ght.m13171a("AuthManaged", "ManagingAppInstallLoader");

    /* renamed from: b */
    public Intent f22449b;

    /* renamed from: c */
    private final camd f22450c;

    /* renamed from: d */
    private final ManagingAppInstallBroadcastReceiver f22451d = new ManagingAppInstallBroadcastReceiver(rpr.m34216b(), this, this.f22450c);

    /* renamed from: e */
    private final long f22452e;

    /* renamed from: f */
    private Integer f22453f;

    /* renamed from: g */
    private Integer f22454g;

    /* renamed from: h */
    private boolean f22455h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgw(Context context, long j, camd camd) {
        super(context);
        jhl.m16704a();
        this.f22452e = j;
        this.f22450c = camd;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo13720a(Intent intent) {
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        getContext().startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.f22454g = null;
        if (this.f22455h) {
            this.f22451d.mo7767b();
            if (this.f22453f != null) {
                Context context = getContext();
                int intValue = this.f22453f.intValue();
                int i = Build.VERSION.SDK_INT;
                try {
                    context.getPackageManager().getPackageInstaller().abandonSession(intValue);
                } catch (SecurityException e) {
                }
                this.f22453f = null;
            }
            this.f22455h = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cb, code lost:
        r2 = null;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        r3 = null;
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        r2 = r4;
        r4 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 10  PHI: (r4v10 android.content.pm.PackageInstaller$Session) = (r4v14 android.content.pm.PackageInstaller$Session), (r4v20 android.content.pm.PackageInstaller$Session), (r4v21 android.content.pm.PackageInstaller$Session) binds: [B:18:0x00bf, B:12:0x0049, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
    public final void onStartLoading() {
        PackageInstaller.Session session;
        int i;
        jhj jhj;
        PackageInstaller.Session session2;
        f22448a.mo25414c("onStartLoading", new Object[0]);
        Integer num = this.f22454g;
        ParcelFileDescriptor parcelFileDescriptor = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        PackageInstaller.Session session3 = null;
        r4 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        if (num == null) {
            Intent intent = this.f22449b;
            if (intent != null) {
                mo13720a(intent);
                this.f22449b = null;
            }
        } else {
            deliverResult(num);
        }
        if (!this.f22455h) {
            this.f22455h = true;
            this.f22451d.mo7766a();
            Context context = getContext();
            long j = this.f22452e;
            camd camd = this.f22450c;
            int i2 = Build.VERSION.SDK_INT;
            sdo.m34959a(camd);
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            Status status = Status.f30107a;
            try {
                ParcelFileDescriptor openDownloadedFile = downloadManager.openDownloadedFile(j);
                if (openDownloadedFile != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(openDownloadedFile.getFileDescriptor());
                        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
                        sessionParams.setAppLabel(camd.f175249c);
                        sessionParams.setAppPackageName(camd.f175248b);
                        sessionParams.setSize(camd.f175251e);
                        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
                        i = packageInstaller.createSession(sessionParams);
                        session3 = packageInstaller.openSession(i);
                        MessageDigest b = spn.m35868b("SHA1");
                        DigestOutputStream digestOutputStream = new DigestOutputStream(session3.openWrite(camd.f175248b, 0, camd.f175251e), b);
                        srz.m36172a(fileInputStream, digestOutputStream);
                        digestOutputStream.close();
                        if (Base64.encodeToString(b.digest(), 11).equals(camd.f175250d)) {
                            session3.commit(PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.gms.auth.DM_PACKAGE_INSTALLED"), 134217728).getIntentSender());
                        } else {
                            status = new Status(21515, "Package signature mismatch.");
                            i = -1;
                        }
                    } catch (FileNotFoundException e) {
                        session2 = session3;
                        parcelFileDescriptor = openDownloadedFile;
                        i = -1;
                        try {
                            status = new Status(21513, "Cannot find download file.");
                            srz.m36170a(parcelFileDescriptor2);
                            srz.m36171a(session2);
                            jhj = new jhj(status, i);
                            if (Status.f30107a.equals(jhj.f22490a)) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            session = session2;
                            srz.m36170a(parcelFileDescriptor2);
                            srz.m36171a(session);
                            throw th;
                        }
                    } catch (IOException e2) {
                        session = session3;
                        parcelFileDescriptor2 = openDownloadedFile;
                        i = -1;
                        try {
                            status = new Status(21516, "IOException during installation.");
                            srz.m36170a(parcelFileDescriptor2);
                            srz.m36171a(session);
                            jhj = new jhj(status, i);
                            if (Status.f30107a.equals(jhj.f22490a)) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            srz.m36170a(parcelFileDescriptor2);
                            srz.m36171a(session);
                            throw th;
                        }
                    } catch (Throwable th3) {
                    }
                } else {
                    status = new Status(21513, "Cannot find download file.");
                    i = -1;
                }
                srz.m36170a(openDownloadedFile);
                srz.m36171a(session3);
            } catch (FileNotFoundException e3) {
                session2 = null;
                i = -1;
                status = new Status(21513, "Cannot find download file.");
                srz.m36170a(parcelFileDescriptor2);
                srz.m36171a(session2);
                jhj = new jhj(status, i);
                if (Status.f30107a.equals(jhj.f22490a)) {
                }
            } catch (IOException e4) {
                session = null;
                i = -1;
                status = new Status(21516, "IOException during installation.");
                srz.m36170a(parcelFileDescriptor2);
                srz.m36171a(session);
                jhj = new jhj(status, i);
                if (Status.f30107a.equals(jhj.f22490a)) {
                }
            } catch (Throwable th4) {
                th = th4;
                session = null;
                srz.m36170a(parcelFileDescriptor2);
                srz.m36171a(session);
                throw th;
            }
            jhj = new jhj(status, i);
            if (Status.f30107a.equals(jhj.f22490a)) {
                this.f22453f = Integer.valueOf(jhj.f22491b);
            } else {
                deliverResult((Integer) -1);
            }
        }
    }

    /* renamed from: a */
    public final void deliverResult(Integer num) {
        this.f22454g = num;
        super.deliverResult(num);
    }
}
