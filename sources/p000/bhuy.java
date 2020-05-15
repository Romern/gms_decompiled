package p000;

/* renamed from: bhuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuy {

    /* renamed from: a */
    public final bics f119675a;

    public bhuy(bics bics) {
        this.f119675a = bics;
    }

    /* renamed from: a */
    public static bhul m101590a(int i, Boolean bool) {
        return new bhvq(new bhum(), new bhvq(new bhvm(0, bool), new bhvm(1, bool), true, 10), false, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhuy.a(int, java.lang.Boolean):bhul
     arg types: [int, int]
     candidates:
      bhuy.a(bxsz[], int):bhun
      bhuy.a(int, java.lang.Boolean):bhul */
    /* renamed from: a */
    public static final bhun m101591a(bxsz[] bxszArr, int i) {
        bhun bhun = new bhun(((bvpf[]) bxszArr)[0], 2, m101590a(i, (Boolean) false));
        bvpf bvpf = bhun.f119643b;
        if (bvpf != null && (bvpf.f157280a & 1) != 0 && !bhun.f119642a.isEmpty()) {
            return bhun;
        }
        bhuj.m101555a().mo64361c("Invalid model weights, returning null model weights container");
        return null;
    }
}
