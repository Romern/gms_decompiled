package p000;

import java.util.Arrays;

/* renamed from: bhue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhue {

    /* renamed from: a */
    public final C1245ok f119618a = new C1245ok();

    /* renamed from: a */
    public final int mo64305a() {
        return this.f119618a.f26809h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhue) {
            return this.f119618a.equals(((bhue) obj).f119618a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119618a});
    }

    /* renamed from: a */
    public final void mo64306a(Integer num, Float f) {
        this.f119618a.put(num, f);
    }
}
