package p000;

import android.os.Bundle;

/* renamed from: addu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class addu {

    /* renamed from: a */
    final int f61455a;

    /* renamed from: b */
    final aucf f61456b = new aucf();

    /* renamed from: c */
    final Bundle f61457c;

    public addu(int i, Bundle bundle) {
        this.f61455a = i;
        this.f61457c = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33368a(addv addv) {
        this.f61456b.mo50390a((Exception) addv);
    }

    public final String toString() {
        int i = this.f61455a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=1 id=");
        sb.append(i);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
