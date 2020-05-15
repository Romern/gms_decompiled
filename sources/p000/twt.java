package p000;

import android.util.SparseArray;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: twt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class twt extends Enum {

    /* renamed from: a */
    public static final twt f46772a = new twt("FILE", 0, 1, "https://www.googleapis.com/auth/drive.file", false);

    /* renamed from: b */
    public static final twt f46773b = new twt("APPDATA", 1, 2, "https://www.googleapis.com/auth/drive.appdata", false);

    /* renamed from: c */
    public static final twt f46774c = new twt("FULL", 2, 3, "https://www.googleapis.com/auth/drive", true);

    /* renamed from: d */
    public static final twt f46775d;

    /* renamed from: e */
    public static final Set f46776e;

    /* renamed from: i */
    private static final SparseArray f46777i = new SparseArray();

    /* renamed from: j */
    private static final /* synthetic */ twt[] f46778j;

    /* renamed from: f */
    public final String f46779f;

    /* renamed from: g */
    public final int f46780g;

    /* renamed from: h */
    public final boolean f46781h;

    static {
        twt twt = new twt("APPS", 3, 4, "https://www.googleapis.com/auth/drive.apps", true);
        f46775d = twt;
        twt twt2 = f46773b;
        twt twt3 = f46774c;
        f46778j = new twt[]{f46772a, twt2, twt3, twt};
        f46776e = EnumSet.of(twt3, twt2, twt);
        twt[] values = values();
        for (twt twt4 : values) {
            f46777i.put(twt4.f46780g, twt4);
        }
    }

    private twt(String str, int i, int i2, String str2, boolean z) {
        this.f46780g = i2;
        this.f46779f = str2;
        this.f46781h = z;
    }

    /* renamed from: a */
    public static Set m37571a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hashSet.add(((twt) it.next()).f46779f);
        }
        return hashSet;
    }

    public static twt[] values() {
        return (twt[]) f46778j.clone();
    }

    /* renamed from: a */
    public static twt m37572a(int i) {
        return (twt) f46777i.get(i);
    }
}
