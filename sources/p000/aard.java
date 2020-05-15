package p000;

import android.util.Pair;
import java.util.List;

/* renamed from: aard */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aard {

    /* renamed from: a */
    final /* synthetic */ boolean f56362a;

    public aard() {
    }

    /* renamed from: a */
    public List mo31632a() {
        if (this.f56362a) {
            return sqw.m36033a(Pair.create("genie-eng:app_pkg_name", "com.google.android.settings.gphone"));
        }
        return sqw.m36033a(Pair.create("genie-eng:app_pkg_name", "com.android.settings"));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aard(boolean z) {
        this();
        this.f56362a = z;
    }
}
