package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: far */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class far extends dny {

    /* renamed from: b */
    final /* synthetic */ fas f16169b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public far(fas fas, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f16169b = fas;
    }

    /* renamed from: a */
    public final int mo2709a() {
        return this.f16169b.f16175f.size();
    }

    /* renamed from: c */
    public final CharSequence mo2719c(int i) {
        return ((fes) this.f16169b.f16175f.get(i)).mo10709a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Fragment mo9326a(int i) {
        return eyl.m11293a(fcz.m11498a(((fes) this.f16169b.f16175f.get(i)).mo10711c()));
    }
}
