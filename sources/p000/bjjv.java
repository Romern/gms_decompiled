package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bjjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjv extends bjjp {
    public bjjv() {
        super(bwxj.f161360q);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxj bwxj = (bwxj) bxxc;
        switch (i) {
            case 1:
                return (bwxj.f161362a & 1) != 0;
            case 2:
                return (bwxj.f161362a & 2) != 0;
            case 3:
                return (bwxj.f161362a & 4) != 0;
            case 4:
                return (bwxj.f161362a & 8) != 0;
            case 5:
                return (bwxj.f161362a & 16) != 0;
            case 6:
                return (bwxj.f161362a & 32) != 0;
            case 7:
                return (bwxj.f161362a & 64) != 0;
            case 8:
                return (bwxj.f161362a & 128) != 0;
            case 9:
                return (bwxj.f161362a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
            case 10:
                return (bwxj.f161362a & 512) != 0;
            case 11:
                return (bwxj.f161362a & 1024) != 0;
            case 12:
                return bwxj.f161363b == 12;
            case 13:
                return bwxj.f161363b == 13;
            case 14:
                return bwxj.f161363b == 14;
            case 15:
                return bwxj.f161365d == 15;
            default:
                return super.mo65310a(bwxj, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] mo65313b() {
        return new int[]{1, 2, 12, 13, 14, 15};
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwxj bwxj = (bwxj) bxxc;
        switch (i) {
            case 3:
                bwxy bwxy = bwxj.f161369h;
                if (bwxy == null) {
                    return bwxy.f161427d;
                }
                return bwxy;
            case 4:
                bwya bwya = bwxj.f161370i;
                if (bwya == null) {
                    return bwya.f161433d;
                }
                return bwya;
            case 5:
                bwya bwya2 = bwxj.f161371j;
                if (bwya2 == null) {
                    return bwya.f161433d;
                }
                return bwya2;
            case 6:
                bwxy bwxy2 = bwxj.f161372k;
                if (bwxy2 == null) {
                    return bwxy.f161427d;
                }
                return bwxy2;
            case 7:
                bwya bwya3 = bwxj.f161373l;
                if (bwya3 == null) {
                    return bwya.f161433d;
                }
                return bwya3;
            case 8:
                bwya bwya4 = bwxj.f161374m;
                if (bwya4 == null) {
                    return bwya.f161433d;
                }
                return bwya4;
            case 9:
            default:
                return super.mo65315d(bwxj, i);
            case 10:
                bwwz bwwz = bwxj.f161376o;
                if (bwwz == null) {
                    return bwwz.f161308d;
                }
                return bwwz;
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo65316e(bxxc bxxc, int i) {
        bwxj bwxj = (bwxj) bxxc;
        if (i == 9) {
            bwxb a = bwxb.m122390a(bwxj.f161375n);
            if (a == null) {
                return bwxb.DIRECTION_UNKNOWN;
            }
            return a;
        } else if (i != 11) {
            return super.mo65316e(bwxj, i);
        } else {
            bwxi a2 = bwxi.m122399a(bwxj.f161377p);
            if (a2 == null) {
                return bwxi.JUSTIFICATION_UNKNOWN;
            }
            return a2;
        }
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ bxxc mo65317f(bxxc bxxc, int i) {
        bwxj bwxj = (bwxj) bxxc;
        if (i == 1) {
            bwxc bwxc = bwxj.f161367f;
            if (bwxc == null) {
                return bwxc.f161321f;
            }
            return bwxc;
        } else if (i != 2) {
            switch (i) {
                case 12:
                    if (bwxj.f161363b == 12) {
                        return (bwxd) bwxj.f161364c;
                    }
                    return bwxd.f161328f;
                case 13:
                    if (bwxj.f161363b == 13) {
                        return (bwxg) bwxj.f161364c;
                    }
                    return bwxg.f161345e;
                case 14:
                    if (bwxj.f161363b == 14) {
                        return (bwxk) bwxj.f161364c;
                    }
                    return bwxk.f161378d;
                case 15:
                    if (bwxj.f161365d == 15) {
                        return (bwxe) bwxj.f161366e;
                    }
                    return bwxe.f161335d;
                default:
                    return super.mo65317f(bwxj, i);
            }
        } else {
            bwxc bwxc2 = bwxj.f161368g;
            if (bwxc2 == null) {
                return bwxc.f161321f;
            }
            return bwxc2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{3, 5, 4, 6, 8, 7, 9, 10, 11};
    }
}
