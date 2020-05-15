package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: aexm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexm extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f63988a;

    /* renamed from: b */
    final /* synthetic */ String f63989b;

    /* renamed from: c */
    final /* synthetic */ aucf f63990c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aexm(Context context, String str, aucf aucf) {
        super(9);
        this.f63988a = context;
        this.f63989b = str;
        this.f63990c = aucf;
    }

    public final void run() {
        try {
            this.f63990c.mo50391a(gik.m13218f(this.f63988a, this.f63989b));
        } catch (gid | IOException e) {
            this.f63990c.mo50391a((Object) null);
        }
    }
}
