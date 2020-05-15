package p000;

import com.google.android.gms.mdns.MdnsSearchOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: agav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agav {

    /* renamed from: a */
    public boolean f65105a = true;

    /* renamed from: b */
    private final Set f65106b = new C1225nr();

    /* renamed from: a */
    public final MdnsSearchOptions mo35174a() {
        return new MdnsSearchOptions(new ArrayList(this.f65106b), this.f65105a);
    }

    /* renamed from: a */
    public final void mo35175a(Collection collection) {
        Set set = this.f65106b;
        sdo.m34959a(collection);
        set.addAll(collection);
    }
}
