package p000;

import android.content.Context;

/* renamed from: esu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esu {

    /* renamed from: a */
    public final String f15646a;

    /* renamed from: b */
    public final int f15647b;

    /* renamed from: c */
    public final boolean f15648c;

    /* renamed from: d */
    public final bniq f15649d;

    public esu(String str, int i, boolean z, bniq bniq) {
        this.f15646a = str;
        this.f15648c = z;
        this.f15647b = i;
        this.f15649d = bniq;
    }

    /* renamed from: a */
    public final boolean mo10494a(Context context) {
        bnrd a = this.f15649d.iterator();
        while (a.hasNext()) {
            if (((est) a.next()).mo10492a(context)) {
                return true;
            }
        }
        return false;
    }
}
