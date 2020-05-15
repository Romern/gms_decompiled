package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: aagk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aagk implements sac, sad {

    /* renamed from: a */
    protected final aaht f28067a;

    /* renamed from: b */
    public final LinkedBlockingQueue f28068b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final String f28069c;

    /* renamed from: d */
    private final String f28070d;

    /* renamed from: e */
    private final HandlerThread f28071e;

    public aagk(Context context, String str, String str2) {
        this.f28069c = str;
        this.f28070d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f28071e = handlerThread;
        handlerThread.start();
        this.f28067a = new aaht(context, this.f28071e.getLooper(), this, this, 9200000);
        this.f28067a.mo25308x();
    }

    /* renamed from: c */
    static C0152c m21214c() {
        bxvd da = C0152c.f7500Q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        C0152c cVar = (C0152c) da.f164949b;
        cVar.f7518a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        cVar.f7529l = 32768;
        return (C0152c) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aahy mo16860a() {
        try {
            return this.f28067a.mo16878n();
        } catch (DeadObjectException | IllegalStateException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo16861b() {
        aaht aaht = this.f28067a;
        if (aaht == null) {
            return;
        }
        if (aaht.mo25301p() || this.f28067a.mo25302q()) {
            this.f28067a.mo14032j();
        }
    }

    /* renamed from: a */
    public final void mo6635a(int i) {
        try {
            this.f28068b.put(m21214c());
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final void mo6636a(Bundle bundle) {
        aahy a = mo16860a();
        if (a != null) {
            try {
                GassResponseParcel a2 = a.mo16883a(new GassRequestParcel(1, this.f28069c, this.f28070d));
                if (a2.f32758b == null) {
                    a2.f32758b = (C0152c) GeneratedMessageLite.m124016a(C0152c.f7500Q, a2.f32759c, bxus.m123744c());
                    a2.f32759c = null;
                }
                a2.mo19548a();
                this.f28068b.put(a2.f32758b);
            } catch (bxwf e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                try {
                    this.f28068b.put(m21214c());
                } catch (InterruptedException e2) {
                } catch (Throwable th2) {
                    mo16861b();
                    this.f28071e.quit();
                    throw th2;
                }
            }
            mo16861b();
            this.f28071e.quit();
        }
    }

    /* renamed from: a */
    public final void mo6637a(ConnectionResult connectionResult) {
        try {
            this.f28068b.put(m21214c());
        } catch (InterruptedException e) {
        }
    }
}
