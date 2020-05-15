package p000;

import java.util.Map;

/* renamed from: bnlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlz extends bndi {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f131835a;

    /* renamed from: b */
    final /* synthetic */ bnmk f131836b;

    public bnlz(Map.Entry entry, bnmk bnmk) {
        this.f131835a = entry;
        this.f131836b = bnmk;
    }

    public final Object getKey() {
        return this.f131835a.getKey();
    }

    public final Object getValue() {
        return this.f131836b.mo68026a(this.f131835a.getKey(), this.f131835a.getValue());
    }
}
