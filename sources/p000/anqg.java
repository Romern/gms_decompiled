package p000;

import com.google.android.gms.common.people.data.Audience;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: anqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anqg {

    /* renamed from: a */
    public Audience f77451a;

    /* renamed from: b */
    private final Set f77452b = new LinkedHashSet();

    public anqg(Audience audience) {
        sdo.checkIfNull(audience, "Audience must not be null.");
        this.f77451a = audience;
    }

    /* renamed from: a */
    public final void mo42123a(anqf anqf) {
        this.f77452b.add(anqf);
    }

    /* renamed from: b */
    public final void mo42125b(anqf anqf) {
        this.f77452b.remove(anqf);
    }

    /* renamed from: a */
    public final void mo42124a(Audience audience, Object obj) {
        sdo.checkIfNull(audience, "Audience must not be null.");
        this.f77451a = audience;
        for (anqf anqf : this.f77452b) {
            anqf.mo42031a(obj);
        }
    }
}
