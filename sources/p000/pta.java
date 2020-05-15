package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class pta extends ptb {

    /* renamed from: g */
    public final List f40172g = Collections.synchronizedList(new ArrayList());

    public pta(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23627a(pug pug) {
        this.f40172g.add(pug);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23628b() {
        synchronized (this.f40172g) {
            for (pug pug : this.f40172g) {
                pug.mo23688a(2002);
            }
        }
    }

    /* renamed from: l */
    public void mo23629l() {
        mo23628b();
    }
}
