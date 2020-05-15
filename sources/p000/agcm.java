package p000;

import java.util.logging.Level;

/* renamed from: agcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcm {

    /* renamed from: a */
    public final Level f65217a;

    /* renamed from: b */
    public final srn f65218b;

    public agcm(String str) {
        this.f65217a = !cczc.m132254b() ? Level.FINE : Level.INFO;
        this.f65218b = srn.m36125a(str);
    }

    /* renamed from: a */
    public final void mo35221a(String str) {
        bnsl a = this.f65218b.mo26019b(this.f65217a);
        a.mo68432a("agcm", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a(str);
    }

    /* renamed from: a */
    public final void mo35222a(String str, Object obj) {
        bnsl a = this.f65218b.mo26019b(this.f65217a);
        a.mo68432a("agcm", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a(str, obj);
    }

    /* renamed from: a */
    public final void mo35223a(String str, Object obj, Object obj2) {
        bnsl a = this.f65218b.mo26019b(this.f65217a);
        a.mo68432a("agcm", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68424a(str, obj, obj2);
    }
}
