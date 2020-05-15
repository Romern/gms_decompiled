package p000;

import com.google.android.chimera.Fragment;

/* renamed from: hiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hiu implements C1504y {

    /* renamed from: a */
    private final hiv f19835a;

    /* renamed from: b */
    private final String f19836b;

    public hiu(hiv hiv, String str) {
        this.f19835a = hiv;
        this.f19836b = str;
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: b */
    public final void mo4b() {
    }

    /* renamed from: c */
    public final void mo5c() {
        if (!this.f19835a.f19837a.containsKey(this.f19836b)) {
            this.f19835a.f19837a.put(this.f19836b, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
        Fragment fragment = (Fragment) akVar;
        if (!fragment.getActivity().isChangingConfigurations() && fragment.isRemoving()) {
            this.f19835a.f19837a.remove(this.f19836b);
        }
    }
}
