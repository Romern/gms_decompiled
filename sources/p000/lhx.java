package p000;

import android.content.SharedPreferences;
import com.google.android.gms.autofill.sharedpreferences.Change;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhx extends lhw implements lhu {

    /* renamed from: d */
    private final lht f26128d;

    /* renamed from: e */
    private final AtomicBoolean f26129e = new AtomicBoolean(false);

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public lhx(SharedPreferences sharedPreferences, lht lht) {
        super(sharedPreferences);
        this.f26128d = lht;
    }

    /* renamed from: a */
    private final void m19146a() {
        if (this.f26129e.compareAndSet(false, true)) {
            this.f26128d.mo15120a();
        }
    }

    /* renamed from: c */
    public final void mo15123c(Change change) {
        change.mo7989a(new lhv(this, this.f26125c.edit(), true));
    }

    public final boolean contains(String str) {
        m19146a();
        return super.contains(str);
    }

    public final Map getAll() {
        m19146a();
        return super.getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        m19146a();
        return super.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        m19146a();
        return super.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        m19146a();
        return super.getInt(str, i);
    }

    public final long getLong(String str, long j) {
        m19146a();
        return super.getLong(str, j);
    }

    public final String getString(String str, String str2) {
        m19146a();
        return super.getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        m19146a();
        return super.getStringSet(str, set);
    }

    /* renamed from: a */
    public final void mo15121a(Change change) {
        this.f26128d.mo15122b(change);
    }
}
