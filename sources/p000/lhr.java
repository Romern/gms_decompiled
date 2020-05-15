package p000;

import android.content.SharedPreferences;
import com.google.android.gms.autofill.sharedpreferences.Change;

/* renamed from: lhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhr extends lhw implements lht {

    /* renamed from: d */
    private final lhu f26115d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public lhr(SharedPreferences sharedPreferences, lhu lhu) {
        super(sharedPreferences);
        this.f26115d = lhu;
    }

    /* renamed from: a */
    public final void mo15120a() {
        this.f26115d.mo15123c(Change.m7175a(mo15135b()));
    }

    /* renamed from: b */
    public final void mo15122b(Change change) {
        change.mo7989a(edit());
        this.f26115d.mo15123c(Change.m7175a(mo15135b()));
    }

    /* renamed from: a */
    public final void mo15121a(Change change) {
        this.f26115d.mo15123c(change);
    }
}
