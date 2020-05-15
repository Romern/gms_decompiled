package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: amsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amsr extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f75872a;

    /* renamed from: b */
    final /* synthetic */ String f75873b;

    /* renamed from: c */
    final /* synthetic */ aucf f75874c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amsr(Context context, String str, aucf aucf) {
        super(9);
        this.f75872a = context;
        this.f75873b = str;
        this.f75874c = aucf;
    }

    public final void run() {
        try {
            this.f75874c.mo50391a(gik.m13218f(this.f75872a, this.f75873b));
        } catch (gid | IOException e) {
            this.f75874c.mo50391a((Object) null);
        }
    }
}
