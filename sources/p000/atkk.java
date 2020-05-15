package p000;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: atkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class atkk extends aaab {

    /* renamed from: a */
    private static final srn f90412a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    protected final String f90413c;

    /* renamed from: d */
    protected final aswm f90414d;

    public atkk(String str, String str2, aswm aswm) {
        super(79, str);
        this.f90413c = str2;
        this.f90414d = aswm;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            aswf.m74926a(context);
            mo50005b(context);
        } catch (asks | RuntimeException e) {
            bnsl bnsl = (bnsl) f90412a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atkk", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unparameterized operation failed");
            throw new aaaj(8, "Internal error", null, e);
        }
    }

    /* renamed from: b */
    public abstract void mo50005b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ExecutorService mo16649j() {
        return null;
    }
}
