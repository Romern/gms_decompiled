package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: aqjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjf extends aqjp {

    /* renamed from: a */
    public final aqkf f86196a;

    /* renamed from: b */
    public final boolean f86197b;

    public aqjf(Context context, aqkf aqkf, boolean z) {
        super(context, true);
        this.f86196a = aqkf;
        this.f86197b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        Settings.Secure.putInt(this.f86226g.getContentResolver(), "automatic_storage_manager_enabled", z ? 1 : 0);
    }
}
