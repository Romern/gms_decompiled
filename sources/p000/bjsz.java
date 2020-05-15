package p000;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bjsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsz {

    /* renamed from: b */
    private static final ThreadLocal f123265b = new bjsy();

    /* renamed from: a */
    final SparseArray f123266a = new SparseArray();

    /* renamed from: c */
    private String f123267c;

    /* renamed from: a */
    public static bjsz m104546a() {
        return (bjsz) f123265b.get();
    }

    /* renamed from: a */
    public final void mo65516a(String str, LogContext logContext) {
        if (!TextUtils.equals(str, this.f123267c)) {
            this.f123267c = str;
            this.f123266a.clear();
        }
        this.f123266a.put(logContext.f151797e, logContext);
    }
}
