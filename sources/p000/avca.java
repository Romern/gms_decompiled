package p000;

import android.content.Context;
import java.io.IOException;
import java.util.List;

/* renamed from: avca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avca {

    /* renamed from: a */
    public static final srn f92939a = srn.m36124a();

    /* renamed from: b */
    public final avce f92940b;

    /* renamed from: c */
    public final Context f92941c;

    public avca(Context context) {
        this.f92941c = context;
        this.f92940b = avce.m78238a(context);
    }

    /* renamed from: a */
    public final List mo51136a(String str) {
        int i;
        try {
            avce avce = this.f92940b;
            synchronized (avce.f92955b) {
                avce.mo51150c();
                i = avce.f92955b.getInt(avce.m78239a(str), 0);
            }
            return gik.m13213b(this.f92941c, i, str);
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) f92939a.mo68387b();
            bnsl.mo68432a("avca", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error getting account change events.");
            return null;
        }
    }
}
