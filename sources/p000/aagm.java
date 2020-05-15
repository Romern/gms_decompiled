package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: aagm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagm implements sac, sad {

    /* renamed from: a */
    protected final aaht f28072a;

    /* renamed from: b */
    public final LinkedBlockingQueue f28073b;

    /* renamed from: c */
    public final long f28074c;

    /* renamed from: d */
    private final String f28075d;

    /* renamed from: e */
    private final String f28076e;

    /* renamed from: f */
    private final dcg f28077f;

    /* renamed from: g */
    private final int f28078g = 1;

    /* renamed from: h */
    private final HandlerThread f28079h;

    /* renamed from: i */
    private final aagb f28080i;

    public aagm(Context context, dcg dcg, String str, String str2, aagb aagb) {
        this.f28075d = str;
        this.f28077f = dcg;
        this.f28076e = str2;
        this.f28080i = aagb;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f28079h = handlerThread;
        handlerThread.start();
        this.f28074c = System.currentTimeMillis();
        this.f28072a = new aaht(context, this.f28079h.getLooper(), this, this, 19621000);
        this.f28073b = new LinkedBlockingQueue();
        this.f28072a.mo25308x();
    }

    /* renamed from: c */
    public static ProgramResponse m21221c() {
        return new ProgramResponse(null, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aahy mo16862a() {
        try {
            return this.f28072a.mo16878n();
        } catch (DeadObjectException | IllegalStateException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo16865b() {
        aaht aaht = this.f28072a;
        if (aaht == null) {
            return;
        }
        if (aaht.mo25301p() || this.f28072a.mo25302q()) {
            this.f28072a.mo14032j();
        }
    }

    /* renamed from: a */
    public final void mo6635a(int i) {
        try {
            mo16863a(4011, this.f28074c);
            this.f28073b.put(m21221c());
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public final void mo16863a(int i, long j) {
        mo16864a(i, j, null);
    }

    /* renamed from: a */
    public final void mo16864a(int i, long j, Exception exc) {
        aagb aagb = this.f28080i;
        if (aagb != null) {
            aagb.mo16843a(i, System.currentTimeMillis() - j, exc);
        }
    }

    /* renamed from: a */
    public final void mo6636a(Bundle bundle) {
        aahy a = mo16862a();
        if (a != null) {
            try {
                int i = this.f28078g;
                dcg dcg = this.f28077f;
                ProgramResponse a2 = a.mo16884a(new ProgramRequest(1, i, dcg.f12804f, this.f28075d, this.f28076e));
                mo16863a(5011, this.f28074c);
                this.f28073b.put(a2);
            } catch (Throwable th) {
                mo16865b();
                this.f28079h.quit();
                throw th;
            }
            mo16865b();
            this.f28079h.quit();
        }
    }

    /* renamed from: a */
    public final void mo6637a(ConnectionResult connectionResult) {
        try {
            mo16863a(4012, this.f28074c);
            this.f28073b.put(m21221c());
        } catch (InterruptedException e) {
        }
    }
}
