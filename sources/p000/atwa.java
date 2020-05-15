package p000;

import android.net.Uri;

/* renamed from: atwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atwa {

    /* renamed from: a */
    public final bzva f91034a;

    public atwa(bzva bzva) {
        this.f91034a = bzva;
    }

    /* renamed from: a */
    public final boolean mo50263a() {
        char c;
        bxwc bxwc = this.f91034a.f171497g;
        int size = bxwc.size();
        int i = 0;
        while (true) {
            c = 2;
            if (i >= size) {
                break;
            }
            bzvc bzvc = (bzvc) bxwc.get(i);
            bzts bzts = bzvc.f171509a;
            if (bzts == null) {
                bzts = bzts.f171367b;
            }
            i++;
            if (bzts.f171369a != null) {
                bzts bzts2 = bzvc.f171509a;
                if (bzts2 == null) {
                    bzts2 = bzts.f171367b;
                }
                bztt bztt = bzts2.f171369a;
                if (bztt == null) {
                    bztt = bztt.f171370b;
                }
                switch (bztt.f171372a) {
                    case 0:
                        break;
                    case 1:
                        c = 3;
                        break;
                    case 2:
                        c = 4;
                        break;
                    case 3:
                        c = 5;
                        break;
                    case 4:
                        c = 6;
                        break;
                    case 5:
                        c = 7;
                        break;
                    case 6:
                        c = 8;
                        break;
                    case 7:
                        c = 9;
                        break;
                    default:
                        c = 0;
                        break;
                }
                if (c == 0) {
                    c = 1;
                }
            }
        }
        return c == 6 || c == 8 || c == 7;
    }

    /* renamed from: b */
    public final Uri mo50264b() {
        bzuu bzuu;
        bzuu bzuu2;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        if (bzuu.f171470c.isEmpty()) {
            return null;
        }
        bzva bzva2 = this.f91034a;
        if (bzva2.f171491a == 7) {
            bzuu2 = (bzuu) bzva2.f171492b;
        } else {
            bzuu2 = bzuu.f171466d;
        }
        return Uri.parse(bzuu2.f171470c);
    }

    /* renamed from: c */
    public final boolean mo50265c() {
        bzuu bzuu;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        return bzuu.f171468a != null;
    }

    /* renamed from: d */
    public final boolean mo50266d() {
        bzuu bzuu;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        bzuv bzuv = bzuu.f171468a;
        if (bzuv == null) {
            bzuv = bzuv.f171471h;
        }
        return bzuv.f171479g;
    }

    /* renamed from: e */
    public final String mo50267e() {
        bzuu bzuu;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        bzuv bzuv = bzuu.f171468a;
        if (bzuv == null) {
            bzuv = bzuv.f171471h;
        }
        return bzuv.f171473a;
    }

    /* renamed from: f */
    public final String mo50268f() {
        bzuu bzuu;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        bzuv bzuv = bzuu.f171468a;
        if (bzuv == null) {
            bzuv = bzuv.f171471h;
        }
        return bzuv.f171475c;
    }

    /* renamed from: g */
    public final String mo50269g() {
        bzuu bzuu;
        bzva bzva = this.f91034a;
        if (bzva.f171491a == 7) {
            bzuu = (bzuu) bzva.f171492b;
        } else {
            bzuu = bzuu.f171466d;
        }
        bzuv bzuv = bzuu.f171468a;
        if (bzuv == null) {
            bzuv = bzuv.f171471h;
        }
        return bzuv.f171476d;
    }

    /* renamed from: h */
    public final bzti mo50270h() {
        bzva bzva = this.f91034a;
        int i = bzva.f171491a;
        if (i == 8) {
            bzti bzti = ((bzut) bzva.f171492b).f171465a;
            return bzti == null ? bzti.f171329e : bzti;
        } else if (i != 7) {
            return bzti.f171329e;
        } else {
            bzuv bzuv = ((bzuu) bzva.f171492b).f171468a;
            if (bzuv == null) {
                bzuv = bzuv.f171471h;
            }
            bzti bzti2 = bzuv.f171478f;
            if (bzti2 == null) {
                return bzti.f171329e;
            }
            return bzti2;
        }
    }

    /* renamed from: i */
    public final int mo50271i() {
        int i;
        switch (this.f91034a.f171498h) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
