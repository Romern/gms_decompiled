package p000;

import java.util.ArrayList;

/* renamed from: ciao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciao {

    /* renamed from: a */
    private final ArrayList f189676a = new ArrayList();

    /* renamed from: a */
    public final void mo85875a(Object obj) {
        this.f189676a.add(obj);
    }

    public final String toString() {
        return this.f189676a.toString();
    }

    /* renamed from: a */
    public final void mo85876a(String str, Object obj) {
        ArrayList arrayList = this.f189676a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        arrayList.add(sb.toString());
    }
}
