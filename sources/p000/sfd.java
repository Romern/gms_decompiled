package p000;

import com.google.android.gms.common.people.data.Audience;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: sfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfd {

    /* renamed from: a */
    public static final Audience f44109a = new sfd().mo25465a();

    /* renamed from: b */
    public boolean f44110b;

    /* renamed from: c */
    private List f44111c;

    /* renamed from: d */
    private int f44112d;

    public sfd() {
        this.f44111c = Collections.emptyList();
        this.f44112d = 0;
        this.f44110b = false;
    }

    /* renamed from: a */
    public final Audience mo25465a() {
        return new Audience(this.f44111c, this.f44112d, this.f44110b);
    }

    /* renamed from: a */
    public final void mo25466a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f44112d = i;
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Unknown domain restriction setting: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public sfd(Audience audience) {
        sdo.m34966a(audience, "Audience must not be null.");
        this.f44111c = audience.f30287b;
        this.f44112d = audience.f30288c;
        this.f44110b = audience.f30290e;
    }

    /* renamed from: a */
    public final void mo25467a(Collection collection) {
        sdo.m34966a(collection, "Audience members must not be null.");
        this.f44111c = Collections.unmodifiableList(new ArrayList(collection));
    }
}
