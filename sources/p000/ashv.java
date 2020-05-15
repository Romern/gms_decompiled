package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ashv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashv {

    /* renamed from: a */
    final Context f88996a;

    public ashv(Context context) {
        this.f88996a = context;
    }

    /* renamed from: a */
    private final void m74151a(int i, ashu ashu) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.f88996a.getResources().openRawResource(i)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    ashu.mo49164a(Base64.decode(readLine, 0));
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("gsf.res", e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: a */
    private static final void m74152a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        try {
            fileOutputStream.write(bArr);
        } finally {
            fileOutputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b7 A[Catch:{ NameNotFoundException | NotFoundException | IOException -> 0x01cd }] */
    /* renamed from: a */
    public final void mo49165a() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (cgvf.f187805a.mo6606a().mo84531a() > 0) {
            try {
                File file = new File(this.f88996a.createPackageContext("com.google.android.gsf", 0).getFilesDir(), "signatures");
                file.mkdirs();
                boolean b = cgvf.f187805a.mo6606a().mo84532b();
                boolean g = rfy.m33550g(this.f88996a);
                ashu ashu = new ashu();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m74151a((int) C0126R.raw.gsf_release_certs, ashu);
                if (g) {
                    m74151a((int) C0126R.raw.gsf_debug_certs, ashu);
                }
                if (!b) {
                    rfz a = rfz.m33557a(this.f88996a);
                    List<PackageInfo> installedPackages = this.f88996a.getPackageManager().getInstalledPackages(64);
                    if (installedPackages == null) {
                        Log.e("SubscribedFeeds", "null getInstallPackages");
                    } else {
                        Iterator<T> it = installedPackages.iterator();
                        while (it.hasNext()) {
                            T t = (PackageInfo) it.next();
                            if (t.signatures.length == 1) {
                                byte[] byteArray = t.signatures[0].toByteArray();
                                byte[] bArr = (byte[]) ashu.f88995a.get(ashu.m74148b(byteArray));
                                if ((bArr == null || !Arrays.equals(byteArray, bArr)) && a.mo24606a((PackageInfo) t)) {
                                    ashu.mo49164a(byteArray);
                                }
                            }
                        }
                    }
                }
                Log.i("SubscribedFeeds", String.format("Collected %d certs in %dms", Integer.valueOf(ashu.f88995a.values().size()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)));
                try {
                    int i3 = 0;
                    for (Map.Entry entry : ashu.mo49163a().entrySet()) {
                        try {
                            byte[] bArr2 = (byte[]) entry.getValue();
                            File file2 = new File(file, (String) entry.getKey());
                            if (!file2.createNewFile()) {
                                ashu ashu2 = ashu;
                                if (file2.length() != ((long) bArr2.length)) {
                                    String valueOf = String.valueOf(file2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                    sb.append("Signature file has wrong size, overwriting: ");
                                    sb.append(valueOf);
                                    Log.i("SubscribedFeeds", sb.toString());
                                    m74152a(file2, bArr2);
                                }
                                ashu = ashu2;
                            } else {
                                ashu ashu3 = ashu;
                                m74152a(file2, bArr2);
                                i3++;
                                ashu = ashu3;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i3;
                            if (i > 0) {
                                StringBuilder sb2 = new StringBuilder(32);
                                sb2.append("Wrote ");
                                sb2.append(i);
                                sb2.append(" new signatures");
                                Log.i("SubscribedFeeds", sb2.toString());
                            }
                            throw th;
                        }
                    }
                    ashu ashu4 = ashu;
                    if (i3 > 0) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("Wrote ");
                        sb3.append(i3);
                        sb3.append(" new signatures");
                        Log.i("SubscribedFeeds", sb3.toString());
                    }
                    Map a2 = ashu4.mo49163a();
                    File[] listFiles = file.listFiles();
                    for (File file3 : listFiles) {
                        String name = file3.getName();
                        if (!a2.containsKey(name)) {
                            if (name.startsWith("sig")) {
                                if (!file3.delete()) {
                                    String valueOf2 = String.valueOf(file3);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
                                    sb4.append("Cannot delete: ");
                                    sb4.append(valueOf2);
                                    Log.e("SubscribedFeeds", sb4.toString());
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                    if (i > 0) {
                    }
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | IOException e) {
                Log.w("SubscribedFeeds", "Failed to write GSF signatures to disk!", e);
            }
        }
    }
}
