package p000;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bfgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgo {

    /* renamed from: a */
    public static final bfgo f113789a = new bfgo();

    /* renamed from: b */
    private static final Logger f113790b = Logger.getLogger(bfgo.class.getSimpleName());

    /* renamed from: c */
    private final Set f113791c = new HashSet();

    private bfgo() {
    }

    /* renamed from: a */
    public final synchronized void mo61662a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File file2 = new File(canonicalPath, ".lck");
            if (file2.exists()) {
                file2.delete();
            }
            this.f113791c.remove(canonicalPath);
        } catch (IOException e) {
            Logger logger = f113790b;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file.getAbsolutePath());
            logger.logp(level, "com.google.android.location.collectionlib.ScanResultOutputLock", "unlockDirectory", valueOf.length() == 0 ? new String("Failed to unlock directory ") : "Failed to unlock directory ".concat(valueOf));
        }
    }

    /* renamed from: b */
    public final synchronized void mo61666b(String str) {
        mo61662a(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    public final synchronized boolean mo61667b(File file) {
        String canonicalPath = file.getCanonicalPath();
        File file2 = new File(canonicalPath, ".lck");
        if (!this.f113791c.contains(canonicalPath)) {
            if (file2.exists() && file2.isFile()) {
                if (file2.lastModified() < System.currentTimeMillis()) {
                    mo61662a(file);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[Catch:{ IOException -> 0x0033 }] */
    /* renamed from: a */
    public final synchronized boolean mo61663a(File file, long j) {
        boolean z;
        String canonicalPath = file.getCanonicalPath();
        File file2 = new File(canonicalPath, ".lck");
        if (file2.exists()) {
            if (file2.isFile()) {
                z = true;
                if (z) {
                    file2.setLastModified(System.currentTimeMillis() + j);
                    this.f113791c.add(canonicalPath);
                }
            }
        }
        z = file2.createNewFile();
        if (z) {
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo61664a(String str) {
        return mo61663a(new File(str), 7200000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo61665a(String str, long j) {
        return mo61663a(new File(str), j);
    }
}
