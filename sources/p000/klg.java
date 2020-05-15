package p000;

import java.util.logging.Level;

/* renamed from: klg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class klg implements kli {

    /* renamed from: a */
    private final srn f24422a;

    public klg(Class cls) {
        this.f24422a = srn.m36126a(cls.getName(), sgj.AUTOFILL);
    }

    /* renamed from: a */
    public final void mo14628a(String str, Object... objArr) {
        bnsl a = this.f24422a.mo26019b(Level.INFO);
        a.mo68432a("klg", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68436a(str, objArr);
    }

    /* renamed from: b */
    public final void mo14630b(String str, Object... objArr) {
        bnsl a = this.f24422a.mo26019b(Level.WARNING);
        a.mo68432a("klg", "b", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68436a(str, objArr);
    }

    /* renamed from: a */
    public final void mo14629a(Throwable th, String str, Object... objArr) {
        bnsl a = this.f24422a.mo26019b(Level.WARNING);
        a.mo68437a(th);
        a.mo68432a("klg", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68436a(str, objArr);
    }
}
