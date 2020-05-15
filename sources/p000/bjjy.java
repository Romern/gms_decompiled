package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bjjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjy extends bjjp {
    public bjjy() {
        super(bwym.f161484n);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        switch (i) {
            case 1:
                return (bwym.f161486a & 1) != 0;
            case 2:
                return (bwym.f161486a & 4) != 0;
            case 3:
                return (bwym.f161486a & 8) != 0;
            case 4:
                return (bwym.f161486a & 16) != 0;
            case 5:
                return (bwym.f161486a & 32) != 0;
            case 6:
                return (bwym.f161486a & 64) != 0;
            case 7:
            default:
                return super.mo65310a(bwym, i);
            case 8:
                return (bwym.f161486a & 128) != 0;
            case 9:
                return (bwym.f161486a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
            case 10:
                return (bwym.f161486a & 512) != 0;
            case 11:
                return (bwym.f161486a & 1024) != 0;
            case 12:
                return (bwym.f161486a & 2048) != 0;
            case 13:
                return (bwym.f161486a & 4096) != 0;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ float mo65312b(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        return i == 6 ? bwym.f161492g : super.mo65312b(bwym, i);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo65314c(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        if (i == 1) {
            return bwym.f161487b;
        }
        if (i != 3) {
            return i != 12 ? super.mo65314c(bwym, i) : bwym.f161497l;
        }
        return bwym.f161489d;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        if (i == 2) {
            bwya bwya = bwym.f161488c;
            if (bwya == null) {
                return bwya.f161433d;
            }
            return bwya;
        } else if (i != 5) {
            return super.mo65315d(bwym, i);
        } else {
            bwya bwya2 = bwym.f161491f;
            if (bwya2 == null) {
                return bwya.f161433d;
            }
            return bwya2;
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo65316e(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        if (i == 4) {
            bwyc a = bwyc.m122423a(bwym.f161490e);
            if (a == null) {
                return bwyc.BORDER_STYLE_UNKNOWN;
            }
            return a;
        } else if (i != 13) {
            return super.mo65316e(bwym, i);
        } else {
            bwyl a2 = bwyl.m122440a(bwym.f161498m);
            if (a2 == null) {
                return bwyl.MATERIAL_ELEVATION_UNKNOWN;
            }
            return a2;
        }
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ bxxc mo65317f(bxxc bxxc, int i) {
        bwym bwym = (bwym) bxxc;
        switch (i) {
            case 8:
                bwyj bwyj = bwym.f161493h;
                if (bwyj == null) {
                    return bwyj.f161464j;
                }
                return bwyj;
            case 9:
                bwyj bwyj2 = bwym.f161494i;
                if (bwyj2 == null) {
                    return bwyj.f161464j;
                }
                return bwyj2;
            case 10:
                bwyj bwyj3 = bwym.f161495j;
                if (bwyj3 == null) {
                    return bwyj.f161464j;
                }
                return bwyj3;
            case 11:
                bwyj bwyj4 = bwym.f161496k;
                if (bwyj4 == null) {
                    return bwyj.f161464j;
                }
                return bwyj4;
            default:
                return super.mo65317f(bwym, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2, 3, 4, 5, 6, 12, 13};
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] mo65313b() {
        return new int[]{8, 9, 10, 11};
    }
}
