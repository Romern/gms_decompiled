package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: axpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpe extends adzt {

    /* renamed from: a */
    final /* synthetic */ axpp f96236a;

    /* renamed from: b */
    private boolean f96237b;

    /* renamed from: c */
    private final axpd f96238c = new axpd();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axpe(axpp axpp, Looper looper) {
        super(looper);
        this.f96236a = axpp;
    }

    /* renamed from: a */
    private final synchronized void m82858a() {
        if (!this.f96237b) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.f96236a.f96254b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("bindService: ");
                sb.append(valueOf);
                Log.v("WearableLS", sb.toString());
            }
            axpp axpp = this.f96236a;
            axpp.bindService(axpp.f96256d, this.f96238c, 1);
            this.f96237b = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6820a(Message message) {
        m82858a();
        try {
            super.mo6820a(message);
            if (!hasMessages(0)) {
                mo53356a("dispatch");
            }
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                mo53356a("dispatch");
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo53356a(String str) {
        if (this.f96237b) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.f96236a.f96254b);
                StringBuilder sb = new StringBuilder(str.length() + 17 + String.valueOf(valueOf).length());
                sb.append("unbindService: ");
                sb.append(str);
                sb.append(", ");
                sb.append(valueOf);
                Log.v("WearableLS", sb.toString());
            }
            try {
                this.f96236a.unbindService(this.f96238c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.f96237b = false;
        }
    }
}
