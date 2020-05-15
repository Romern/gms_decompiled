package p000;

import android.accounts.Account;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.google.android.chimera.AsyncTaskLoader;
import java.io.IOException;

/* renamed from: bjeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjeu extends AsyncTaskLoader {

    /* renamed from: a */
    public final Account f122584a;

    /* renamed from: b */
    public final blxi f122585b;

    /* renamed from: c */
    public final String f122586c;

    /* renamed from: d */
    boolean f122587d = false;

    public bjeu(Context context, Account account, blxi blxi, String str) {
        super(context);
        this.f122584a = account;
        this.f122585b = blxi;
        this.f122586c = str;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (!this.f122587d) {
            forceLoad();
        }
    }

    /* renamed from: a */
    private static void m103272a(DownloadManager downloadManager, blxi blxi, bjev bjev) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(blxi.f128070a));
        blxh blxh = blxi.f128071b;
        if (blxh == null) {
            blxh = blxh.f128058h;
        }
        request.setNotificationVisibility(blxh.f128064e);
        int i = Build.VERSION.SDK_INT;
        blxh blxh2 = blxi.f128071b;
        if (blxh2 == null) {
            blxh2 = blxh.f128058h;
        }
        request.setAllowedOverMetered(blxh2.f128063d);
        blxh blxh3 = blxi.f128071b;
        if (blxh3 == null) {
            blxh3 = blxh.f128058h;
        }
        if (!blxh3.f128060a.isEmpty()) {
            blxh blxh4 = blxi.f128071b;
            if (blxh4 == null) {
                blxh4 = blxh.f128058h;
            }
            request.setTitle(blxh4.f128060a);
        }
        blxh blxh5 = blxi.f128071b;
        if (blxh5 == null) {
            blxh5 = blxh.f128058h;
        }
        if (!blxh5.f128061b.isEmpty()) {
            blxh blxh6 = blxi.f128071b;
            if (blxh6 == null) {
                blxh6 = blxh.f128058h;
            }
            request.setDescription(blxh6.f128061b);
        }
        blxh blxh7 = blxi.f128071b;
        if (blxh7 == null) {
            blxh7 = blxh.f128058h;
        }
        if (!blxh7.f128062c.isEmpty()) {
            String str = Environment.DIRECTORY_DOWNLOADS;
            blxh blxh8 = blxi.f128071b;
            if (blxh8 == null) {
                blxh8 = blxh.f128058h;
            }
            request.setDestinationInExternalPublicDir(str, blxh8.f128062c);
        }
        blxh blxh9 = blxi.f128071b;
        if (blxh9 == null) {
            blxh9 = blxh.f128058h;
        }
        if (blxh9.f128065f) {
            request.addRequestHeader("Authorization", bjev.mo65066a());
        }
        downloadManager.enqueue(request);
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        DownloadManager downloadManager = (DownloadManager) getContext().getSystemService("download");
        blxh blxh = this.f122585b.f128071b;
        if (blxh == null) {
            blxh = blxh.f128058h;
        }
        if (!blxh.f128065f) {
            m103272a(downloadManager, this.f122585b, null);
            this.f122587d = true;
            return null;
        }
        try {
            String str = this.f122586c;
            blxh blxh2 = this.f122585b.f128071b;
            if (blxh2 == null) {
                blxh2 = blxh.f128058h;
            }
            if (!blxh2.f128066g.isEmpty()) {
                blxh blxh3 = this.f122585b.f128071b;
                if (blxh3 == null) {
                    blxh3 = blxh.f128058h;
                }
                str = blxh3.f128066g;
            }
            m103272a(downloadManager, this.f122585b, new bjev(str, gie.m13187a(getContext(), this.f122584a, str)));
            this.f122587d = true;
            return null;
        } catch (gid | IOException e) {
            Throwable th = e;
            Log.e("DownloadSpecAsyncTaskLo", "Exception getting an auth token", th);
            return th;
        }
    }
}
