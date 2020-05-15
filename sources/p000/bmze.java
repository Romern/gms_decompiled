package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bmze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmze {

    /* renamed from: a */
    final Set f131258a = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bmzf mo66936a() {
        return new bmzf(this.f131258a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66937a(int i) {
        this.f131258a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66938a(int i, int i2) {
        while (i <= i2) {
            this.f131258a.add(Integer.valueOf(i));
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66939a(bmzf bmzf) {
        for (Integer num : bmzf.f131260b) {
            this.f131258a.add(Integer.valueOf(num.intValue()));
        }
    }
}
