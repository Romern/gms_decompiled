package p000;

import android.os.SystemClock;

/* renamed from: kf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1131kf extends C1144ks implements Runnable {

    /* renamed from: a */
    boolean f23964a;

    /* renamed from: b */
    final /* synthetic */ C1132kg f23965b;

    public C1131kf(C1132kg kgVar) {
        this.f23965b = kgVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo14437a() {
        try {
            return this.f23965b.onLoadInBackground();
        } catch (C1191mk e) {
            if (mo14854b()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14439b(Object obj) {
        this.f23965b.mo14458a(this, obj);
    }

    public final void run() {
        this.f23964a = false;
        this.f23965b.mo14457a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14438a(Object obj) {
        C1132kg kgVar = this.f23965b;
        if (kgVar.f24018a != this) {
            kgVar.mo14458a(this, obj);
        } else if (kgVar.isAbandoned()) {
            kgVar.onCanceled(obj);
        } else {
            kgVar.commitContentChanged();
            kgVar.f24019b = SystemClock.uptimeMillis();
            kgVar.f24018a = null;
            kgVar.deliverResult(obj);
        }
    }
}
