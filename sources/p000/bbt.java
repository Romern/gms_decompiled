package p000;

/* renamed from: bbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbt implements bbo {

    /* renamed from: a */
    public final boolean f2877a;

    /* renamed from: b */
    public final int f2878b;

    public bbt(int i, boolean z) {
        this.f2878b = i;
        this.f2877a = z;
    }

    /* renamed from: a */
    public final azg mo2977a(ayo ayo, bcg bcg) {
        if (ayo.f2557h) {
            return new azp(this);
        }
        bek.m2805a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MergePaths{mode=");
        int i = this.f2878b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE"));
        sb.append('}');
        return sb.toString();
    }
}
