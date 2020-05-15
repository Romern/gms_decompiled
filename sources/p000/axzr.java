package p000;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: axzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzr implements axui, ayjm {

    /* renamed from: a */
    public final Context f96855a;

    /* renamed from: b */
    private final File f96856b;

    public axzr(Context context) {
        this.f96855a = context;
        File file = new File(new File(this.f96855a.getFilesDir(), "assets"), "streamtmp");
        this.f96856b = file;
        file.mkdirs();
        for (File file2 : this.f96856b.listFiles()) {
            file2.delete();
        }
    }

    /* renamed from: a */
    public static void m83641a(File file) {
        if (!file.delete()) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Fail to delete file: ");
            sb.append(valueOf);
            Log.w("assets", sb.toString());
        }
    }

    /* renamed from: b */
    public static MessageDigest m83642b() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("proper crypto support not installed", e);
        }
    }

    /* renamed from: c */
    public static String m83644c(String str) {
        return String.valueOf(str).concat(".asset");
    }

    /* renamed from: a */
    public final File mo53578a(String str) {
        if (Log.isLoggable("assets", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("assets", valueOf.length() == 0 ? new String("Get Asset FD: digest=") : "Get Asset FD: digest=".concat(valueOf));
        }
        File b = mo53806b(str);
        if (b.exists()) {
            return b;
        }
        if (Log.isLoggable("assets", 3)) {
            String valueOf2 = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 22);
            sb.append("Unable to load asset: ");
            sb.append(valueOf2);
            Log.d("assets", sb.toString());
        }
        return null;
    }

    /* renamed from: b */
    private final void m83643b(File file) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (!file2.getName().equals(".") && !file2.getName().equals("..")) {
                if (file2.isFile()) {
                    if (Log.isLoggable("assets", 2)) {
                        String valueOf = String.valueOf(file2.getPath());
                        Log.v("assets", valueOf.length() == 0 ? new String("recursivelyDelete: deleting file ") : "recursivelyDelete: deleting file ".concat(valueOf));
                    }
                    if (!file2.delete()) {
                        String valueOf2 = String.valueOf(file2.getName());
                        Log.e("assets", valueOf2.length() == 0 ? new String("recursivelyDelete: failed to delete ") : "recursivelyDelete: failed to delete ".concat(valueOf2));
                    }
                } else if (file2.isDirectory()) {
                    if (Log.isLoggable("assets", 2)) {
                        String valueOf3 = String.valueOf(file2.getPath());
                        Log.v("assets", valueOf3.length() == 0 ? new String("recursivelyDelete: recursing into subdir ") : "recursivelyDelete: recursing into subdir ".concat(valueOf3));
                    }
                    m83643b(file2);
                    if (Log.isLoggable("assets", 2)) {
                        String valueOf4 = String.valueOf(file2.getPath());
                        Log.v("assets", valueOf4.length() == 0 ? new String("recursivelyDelete: returned from subdir ") : "recursivelyDelete: returned from subdir ".concat(valueOf4));
                    }
                }
            }
        }
        if (Log.isLoggable("assets", 2)) {
            String valueOf5 = String.valueOf(file.getPath());
            Log.v("assets", valueOf5.length() == 0 ? new String("recursivelyDelete: deleting dir that should be empty: ") : "recursivelyDelete: deleting dir that should be empty: ".concat(valueOf5));
        }
        file.delete();
    }

    /* renamed from: a */
    public final String mo53579a(InputStream inputStream, AtomicLong atomicLong) {
        this.f96856b.mkdirs();
        File createTempFile = File.createTempFile("asset", ".tmp", this.f96856b);
        MessageDigest d = axxv.m83507d();
        bobb a = bobb.m111033a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            a.mo68842a(fileOutputStream);
            byte[] bArr = new byte[10240];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    boax.m111029a(inputStream);
                    a.close();
                    Pair create = Pair.create(axxv.m83503b(d.digest()), createTempFile);
                    mo53581a((String) create.first, (File) create.second);
                    return (String) create.first;
                }
                d.update(bArr, 0, read);
                fileOutputStream.write(bArr, 0, read);
                if (atomicLong != null) {
                    atomicLong.addAndGet((long) read);
                }
            }
        } catch (Exception e) {
            throw a.mo68841a(e);
        } catch (Throwable th) {
            boax.m111029a(inputStream);
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final File mo53806b(String str) {
        File file = new File(new File(this.f96855a.getFilesDir(), "assets"), str.substring(str.length() - 2, str.length()));
        if (!file.mkdirs() && Log.isLoggable("assets", 3)) {
            Log.d("assets", String.format("%s already existed", file));
        }
        return new File(file, m83644c(str));
    }

    /* renamed from: a */
    public final void mo53580a() {
        m83643b(new File(this.f96855a.getFilesDir(), "assets"));
    }

    /* renamed from: a */
    public final void mo53581a(String str, File file) {
        File b = mo53806b(str);
        if (b.exists()) {
            if (Log.isLoggable("assets", 3)) {
                String valueOf = String.valueOf(m83644c(str));
                Log.d("assets", valueOf.length() == 0 ? new String("Skipping write: asset file already exists: ") : "Skipping write: asset file already exists: ".concat(valueOf));
            }
            file.delete();
        } else if (!file.renameTo(b)) {
            String valueOf2 = String.valueOf(file);
            String valueOf3 = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 41 + String.valueOf(valueOf3).length());
            sb.append("Fail to move input file: ");
            sb.append(valueOf2);
            sb.append(" to asset file: ");
            sb.append(valueOf3);
            Log.e("assets", sb.toString());
            file.delete();
            throw new IOException("error renaming file");
        } else if (Log.isLoggable("assets", 3)) {
            String valueOf4 = String.valueOf(m83644c(str));
            Log.d("assets", valueOf4.length() == 0 ? new String("Wrote asset file: ") : "Wrote asset file: ".concat(valueOf4));
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        File[] listFiles;
        File[] listFiles2 = new File(this.f96855a.getFilesDir(), "assets").listFiles();
        if (listFiles2 != null) {
            StringBuilder sb = new StringBuilder();
            long j = 0;
            int i = 0;
            for (File file : listFiles2) {
                if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            String name = file2.getName();
                            if (name.endsWith(".asset")) {
                                sb.append(name.substring(0, name.length() - 6));
                                sb.append(" length ");
                                sb.append(file2.length());
                                sb.append("\n");
                                j += file2.length();
                                i++;
                            }
                        }
                    }
                }
            }
            ssb.mo26034a();
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append(j);
            sb2.append(" bytes in ");
            sb2.append(i);
            sb2.append(" files");
            ssb.println(sb2.toString());
            ssb.mo26034a();
            ssb.print(sb.toString());
            ssb.mo26035b();
            ssb.mo26035b();
        }
    }
}
