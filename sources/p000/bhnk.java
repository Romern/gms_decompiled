package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: bhnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnk {

    /* renamed from: e */
    private static bhnk f119133e;

    /* renamed from: a */
    public final Object f119134a = new Object();

    /* renamed from: b */
    public final Handler f119135b = new Handler(Looper.getMainLooper(), new bhni(this));

    /* renamed from: c */
    public bhnj f119136c;

    /* renamed from: d */
    public bhnj f119137d;

    private bhnk() {
    }

    /* renamed from: a */
    public static bhnk m101210a() {
        if (f119133e == null) {
            f119133e = new bhnk();
        }
        return f119133e;
    }

    /* renamed from: b */
    public final void mo64040b() {
        bhnj bhnj = this.f119137d;
        if (bhnj != null) {
            this.f119136c = bhnj;
            this.f119137d = null;
            bhmt bhmt = (bhmt) bhnj.f119130a.get();
            if (bhmt != null) {
                bhnd.f119105a.sendMessage(bhnd.f119105a.obtainMessage(0, bhmt.f119090a));
            } else {
                this.f119136c = null;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo64042c(bhmt bhmt) {
        bhnj bhnj = this.f119136c;
        return bhnj != null && bhnj.mo64036a(bhmt);
    }

    /* renamed from: d */
    public final boolean mo64043d(bhmt bhmt) {
        bhnj bhnj = this.f119137d;
        return bhnj != null && bhnj.mo64036a(bhmt);
    }

    /* renamed from: a */
    public final void mo64037a(bhmt bhmt) {
        synchronized (this.f119134a) {
            if (mo64042c(bhmt)) {
                bhnj bhnj = this.f119136c;
                if (!bhnj.f119132c) {
                    bhnj.f119132c = true;
                    this.f119135b.removeCallbacksAndMessages(bhnj);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64041b(bhmt bhmt) {
        synchronized (this.f119134a) {
            if (mo64042c(bhmt)) {
                bhnj bhnj = this.f119136c;
                if (bhnj.f119132c) {
                    bhnj.f119132c = false;
                    mo64038a(bhnj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64038a(bhnj bhnj) {
        int i = bhnj.f119131b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f119135b.removeCallbacksAndMessages(bhnj);
            Handler handler = this.f119135b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bhnj), (long) i);
        }
    }

    /* renamed from: a */
    public final boolean mo64039a(bhnj bhnj, int i) {
        bhmt bhmt = (bhmt) bhnj.f119130a.get();
        if (bhmt == null) {
            return false;
        }
        this.f119135b.removeCallbacksAndMessages(bhnj);
        bhnd.f119105a.sendMessage(bhnd.f119105a.obtainMessage(1, i, 0, bhmt.f119090a));
        return true;
    }
}
