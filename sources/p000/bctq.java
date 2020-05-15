package p000;

import java.security.InvalidParameterException;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: bctq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctq extends Enum {

    /* renamed from: a */
    public static final bctq f104880a = new bctq("DEFAULT_RENDERING_TYPE", 0, 0);

    /* renamed from: b */
    public static final bctq f104881b = new bctq("TOMBSTONE", 1, 1);

    /* renamed from: c */
    public static final bctq f104882c = new bctq("OVERLAY", 2, 2);

    /* renamed from: d */
    public static final bctq f104883d;

    /* renamed from: e */
    public static final bctq[] f104884e;

    /* renamed from: f */
    public static final bctq[] f104885f;

    /* renamed from: g */
    public static final bctq[] f104886g;

    /* renamed from: i */
    private static final /* synthetic */ bctq[] f104887i;

    /* renamed from: h */
    public final int f104888h;

    static {
        bctq bctq = new bctq("INVALID", 3, 3);
        f104883d = bctq;
        bctq bctq2 = f104880a;
        bctq bctq3 = f104881b;
        bctq bctq4 = f104882c;
        f104887i = new bctq[]{bctq2, bctq3, bctq4, bctq};
        f104884e = new bctq[]{bctq2, bctq3, bctq4, bctq};
        f104885f = new bctq[]{bctq2, bctq4};
        f104886g = new bctq[]{bctq2, bctq3};
    }

    private bctq(String str, int i, int i2) {
        this.f104888h = i2;
    }

    /* renamed from: a */
    public static bctq m89952a(int i) {
        bctq bctq = (bctq) bnfi.m109237a(values()).mo67507c(new bctp(i)).mo66815c();
        if (bctq != null) {
            return bctq;
        }
        throw new InvalidParameterException("Invalid ElementType.");
    }

    public static bctq[] values() {
        return (bctq[]) f104887i.clone();
    }
}
