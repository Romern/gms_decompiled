package p000;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: bjlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjlr extends bjgd {

    /* renamed from: l */
    final ArrayList f122943l = new ArrayList();

    /* renamed from: m */
    public bwnq f122944m;

    /* renamed from: p */
    public boolean f122945p = false;

    public bjlr(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65371a(bjlp bjlp) {
        this.f122943l.remove(bjlp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        bxvj bxvj = bwnq.f160380c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122944m = (bwnq) b;
    }
}
