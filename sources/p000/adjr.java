package p000;

import android.app.InstantAppResolverService;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.Collections;

/* renamed from: adjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjr extends InstantAppResolverService {

    /* renamed from: a */
    public final adjn f61941a;

    /* renamed from: b */
    private final adjy f61942b;

    /* renamed from: c */
    private final adko f61943c;

    /* renamed from: d */
    private final adkr f61944d;

    /* renamed from: e */
    private final adfd f61945e;

    /* renamed from: f */
    private Handler f61946f;

    /* renamed from: g */
    private HandlerThread f61947g;

    public adjr(adjn adjn, adjy adjy, adko adko, adkr adkr, adfd adfd) {
        this.f61941a = adjn;
        this.f61942b = adjy;
        this.f61943c = adko;
        this.f61944d = adkr;
        this.f61945e = adfd;
    }

    public final void onGetInstantAppIntentFilter(int[] iArr, String str, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        Log.e("InstantAppResolver", "2nd phase resolution not yet supported.");
        this.f61945e.mo33411a().mo33409a("InstantAppResolverService.secondPhaseAttempted");
        instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
    }

    public final void onGetInstantAppResolveInfo(int[] iArr, String str, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        if (!cepl.m137722c() || !this.f61943c.mo33605a()) {
            Log.w("InstantAppResolver", "Instant App routing requested but is disabled by flag.");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
            return;
        }
        adfb a = this.f61945e.mo33411a();
        if (!this.f61942b.mo33596a()) {
            a.mo33409a("InstantAppResolverService.cannotDownloadInstantApp");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
        } else if (this.f61944d.mo33606a() == 0 || this.f61944d.mo33606a() == 3) {
            a.mo33409a("InstantAppResolverService.notOptedInAndDontShowPrompt");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
        } else {
            if (this.f61946f == null) {
                HandlerThread handlerThread = new HandlerThread("resolverServiceThread");
                this.f61947g = handlerThread;
                handlerThread.start();
                this.f61946f = new adzt(this.f61947g.getLooper());
            }
            this.f61946f.post(new adjq(this, iArr, a, instantAppResolutionCallback));
        }
    }

    public final boolean onUnbind(Intent intent) {
        this.f61947g.quit();
        this.f61947g = null;
        this.f61946f = null;
        return adjr.super.onUnbind(intent);
    }
}
