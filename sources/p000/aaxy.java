package p000;

import android.util.Log;
import java.io.File;

/* renamed from: aaxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaxy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aaxz f56808a;

    public aaxy(aaxz aaxz) {
        this.f56808a = aaxz;
    }

    public final void run() {
        File[] listFiles;
        aaxz aaxz = this.f56808a;
        try {
            long nanoTime = System.nanoTime();
            File[] listFiles2 = aaxz.f56809a.getDir("gH_async_psd", 0).listFiles();
            if (listFiles2 != null) {
                aaxz.m47226a(listFiles2, nanoTime);
            }
            File file = new File(aaxz.f56809a.getFilesDir(), "gH_async_psd");
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                aaxz.m47226a(listFiles, nanoTime);
            }
        } catch (RuntimeException e) {
            Log.w("gH_AsyncPsdFileRemover", "Failed to delete old async psd files.");
        }
    }
}
