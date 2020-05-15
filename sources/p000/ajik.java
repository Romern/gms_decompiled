package p000;

import com.google.android.gms.nearby.sharing.ContactFilter;

/* renamed from: ajik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajik {

    /* renamed from: a */
    public final ContactFilter f70715a;

    public ajik() {
        this.f70715a = new ContactFilter();
    }

    /* renamed from: a */
    public final void mo38678a(Boolean bool) {
        this.f70715a.f80853b = bool;
    }

    /* renamed from: b */
    public final void mo38679b(Boolean bool) {
        this.f70715a.f80852a = bool;
    }

    public ajik(ContactFilter contactFilter) {
        ContactFilter contactFilter2 = new ContactFilter();
        this.f70715a = contactFilter2;
        contactFilter2.f80852a = contactFilter.f80852a;
        contactFilter2.f80853b = contactFilter.f80853b;
        contactFilter2.f80854c = contactFilter.f80854c;
        contactFilter2.f80855d = contactFilter.f80855d;
    }
}
