package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: spy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class spy extends spx implements AppOpsManager.OnOpChangedListener {

    /* renamed from: b */
    protected final AppOpsManager f44956b;

    /* renamed from: c */
    private final AtomicReference f44957c = new AtomicReference();

    /* renamed from: a */
    public final int mo25952a(String str, int i, String str2) {
        return this.f44956b.startOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public final void mo25959b(String str, int i, String str2) {
        try {
            this.f44956b.finishOp(str, i, str2);
        } catch (IllegalStateException e) {
            Log.e("AppOpsCompat", String.format("Op %s finished but never started, %d:%s", str, Integer.valueOf(i), str2), e);
        }
    }

    /* renamed from: c */
    public final int mo25960c(String str, int i, String str2) {
        return this.f44956b.noteOpNoThrow(str, i, str2);
    }

    /* renamed from: d */
    public final int mo25962d(String str, int i, String str2) {
        return this.f44956b.checkOpNoThrow(str, i, str2);
    }

    public final void onOpChanged(String str, String str2) {
        spw spw = (spw) this.f44957c.get();
        if (spw != null) {
            spw.mo25951v(str2);
        }
    }

    public spy(Context context) {
        this.f44956b = (AppOpsManager) context.getSystemService("appops");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25964a(String str, int i, AppOpsManager.OnOpChangedListener onOpChangedListener) {
        this.f44956b.startWatchingMode(str, null, onOpChangedListener);
    }

    /* renamed from: a */
    public final void mo25955a(String str, int i, spw spw) {
        if (this.f44957c.compareAndSet(null, spw) || this.f44957c.get() == spw) {
            mo25964a(str, i, this);
            return;
        }
        throw new IllegalStateException("Can't register more than one op listener at a time.");
    }

    /* renamed from: a */
    public final void mo25956a(String str, spw spw) {
        mo25955a(str, 0, spw);
    }

    /* renamed from: a */
    public final void mo25957a(spw spw) {
        if (!this.f44957c.compareAndSet(spw, null)) {
            Log.e("AppOpsCompat", "Called stopWatchingMode without a balanced call to startWatchingMode");
        } else {
            this.f44956b.stopWatchingMode(this);
        }
    }
}
