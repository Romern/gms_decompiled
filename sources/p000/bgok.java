package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bgok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgok implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgol f116927a;

    /* renamed from: b */
    private final long f116928b;

    public bgok(bgol bgol, long j) {
        this.f116927a = bgol;
        this.f116928b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0 A[Catch:{ all -> 0x00b7 }] */
    public final void run() {
        FileOutputStream fileOutputStream;
        FileNotFoundException e;
        String valueOf;
        SecurityException e2;
        String valueOf2;
        String valueOf3;
        File file = new File(this.f116927a.f116934f.mo62789i(), "cp_state");
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                this.f116927a.mo63037a(this.f116928b, byteArrayOutputStream);
                byteArrayOutputStream.close();
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                bgol.m99519a(fileOutputStream);
            } catch (FileNotFoundException e3) {
                e = e3;
                try {
                    String valueOf4 = String.valueOf(e.getMessage());
                    valueOf = String.valueOf(file.toString());
                    if (valueOf.length() != 0) {
                    }
                    bgol.m99519a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    bgol.m99519a(fileOutputStream2);
                    throw th;
                }
            } catch (SecurityException e4) {
                e2 = e4;
                try {
                    String valueOf5 = String.valueOf(e2.getMessage());
                    valueOf2 = String.valueOf(file.toString());
                    if (valueOf2.length() != 0) {
                    }
                    bgol.m99519a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    bgol.m99519a(fileOutputStream2);
                    throw th;
                }
            } catch (IOException e5) {
                fileOutputStream2 = fileOutputStream;
                try {
                    valueOf3 = String.valueOf(file.toString());
                    if (valueOf3.length() != 0) {
                    }
                    bgol.m99519a(fileOutputStream2);
                } catch (Throwable th3) {
                    th = th3;
                    bgol.m99519a(fileOutputStream2);
                    throw th;
                }
            }
        } catch (FileNotFoundException e6) {
            fileOutputStream = null;
            e = e6;
            String valueOf42 = String.valueOf(e.getMessage());
            valueOf = String.valueOf(file.toString());
            if (valueOf.length() != 0) {
                new String(valueOf42);
            } else {
                valueOf42.concat(valueOf);
            }
            bgol.m99519a(fileOutputStream);
        } catch (SecurityException e7) {
            fileOutputStream = null;
            e2 = e7;
            String valueOf52 = String.valueOf(e2.getMessage());
            valueOf2 = String.valueOf(file.toString());
            if (valueOf2.length() != 0) {
                new String(valueOf52);
            } else {
                valueOf52.concat(valueOf2);
            }
            bgol.m99519a(fileOutputStream);
        } catch (IOException e8) {
            valueOf3 = String.valueOf(file.toString());
            if (valueOf3.length() != 0) {
                new String("Failed to save collection policy state.");
            } else {
                "Failed to save collection policy state.".concat(valueOf3);
            }
            bgol.m99519a(fileOutputStream2);
        } catch (Throwable th4) {
            th = th4;
            bgol.m99519a(fileOutputStream2);
            throw th;
        }
    }
}
