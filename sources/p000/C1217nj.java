package p000;

/* renamed from: nj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C1217nj implements C1213nf {

    /* renamed from: a */
    private final C1216ni f26741a;

    public C1217nj(C1216ni niVar) {
        this.f26741a = niVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo15495a();

    /* renamed from: a */
    public final boolean mo15493a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1216ni niVar = this.f26741a;
        if (niVar == null) {
            return mo15495a();
        }
        int a = niVar.mo15494a(charSequence, i);
        if (a == 0) {
            return true;
        }
        if (a != 1) {
            return mo15495a();
        }
        return false;
    }
}
