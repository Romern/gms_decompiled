package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: aikw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikw extends airo {

    /* renamed from: a */
    public final aiqm f69069a;

    /* renamed from: b */
    private final Context f69070b;

    /* renamed from: c */
    private aiqb f69071c;

    public aikw(Context context, aiqm aiqm) {
        super(32);
        this.f69070b = context;
        this.f69069a = aiqm;
    }

    /* renamed from: a */
    public final void mo37566a() {
        aiqb aiqb = this.f69071c;
        if (aiqb != null) {
            try {
                aiqb.close();
                this.f69071c = null;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aikw", "a", 2356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to close the existing BLE server socket.");
                this.f69071c = null;
            } catch (Throwable th) {
                this.f69071c = null;
                aikx.m57353e();
                throw th;
            }
            aikx.m57353e();
            return;
        }
        srn srn = ailf.f69111a;
    }

    /* renamed from: b */
    public final int mo37568b() {
        aiqb a = aiqb.m57690a(this.f69070b);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aikw", "b", 2309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to create a BLE server socket.");
            return 4;
        }
        new aikv(this, a).start();
        this.f69071c = a;
        aikx.m57353e();
        return 2;
    }
}
