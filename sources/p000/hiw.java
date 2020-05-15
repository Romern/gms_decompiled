package p000;

import com.google.android.chimera.Fragment;

/* renamed from: hiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hiw {

    /* renamed from: a */
    private final hiv f19838a;

    /* renamed from: b */
    private final String f19839b;

    public hiw(Fragment fragment, String str) {
        sdo.m34975b(fragment instanceof C0013ak, "Fragment must implement LifecycleOwner");
        sdo.m34959a((Object) str);
        this.f19839b = str;
        this.f19838a = (hiv) adcj.m50161a(fragment.getActivity()).mo3444a(hiv.class);
        ((C0013ak) fragment).getLifecycle().mo557a(new hiu(this.f19838a, str));
    }

    /* renamed from: a */
    public final boolean mo12511a() {
        return this.f19838a.f19837a.containsKey(this.f19839b);
    }

    /* renamed from: b */
    public final long mo12512b() {
        sdo.m34975b(mo12511a(), "Page not started yet");
        long currentTimeMillis = System.currentTimeMillis();
        sdo.m34975b(mo12511a(), "Page not started yet");
        return currentTimeMillis - ((Long) this.f19838a.f19837a.get(this.f19839b)).longValue();
    }
}
