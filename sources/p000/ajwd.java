package p000;

import com.google.android.gms.nearby.sharing.ContactFilter;

/* renamed from: ajwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwd extends C0084cm {

    /* renamed from: e */
    public static final C0913cs f71398e;

    /* renamed from: f */
    public final ajty f71399f;

    /* renamed from: g */
    public final ajwc f71400g;

    /* renamed from: h */
    public final ContactFilter f71401h;

    static {
        C0912cr crVar = new C0912cr();
        int i = crVar.f11873a;
        if (i < 0) {
            crVar.f11873a = 15;
            i = 15;
        }
        f71398e = new C0913cs(i);
    }

    public ajwd(ajty ajty, ContactFilter contactFilter, ajwc ajwc) {
        this.f71399f = ajty;
        this.f71401h = contactFilter;
        this.f71400g = ajwc;
    }

    /* renamed from: a */
    public final void mo3968a(C0082ck ckVar, C0081cj cjVar) {
        ajik ajik;
        ContactFilter contactFilter = this.f71401h;
        if (contactFilter == null) {
            ajik = new ajik();
        } else {
            ajik = new ajik(contactFilter);
        }
        ajik.f70715a.f80854c = true;
        this.f71399f.mo38895a(0, (int) cfov.f185185a.mo6606a().mo82339av(), ajik.f70715a).mo50373a(new ajvz(this, ckVar, cjVar));
    }

    /* renamed from: a */
    public final void mo3969a(C0083cl clVar, C0080ci ciVar) {
        this.f71399f.mo38895a(((Integer) clVar.f6997a).intValue(), 5, this.f71401h).mo50373a(new ajwb(this, ciVar, clVar));
    }
}
