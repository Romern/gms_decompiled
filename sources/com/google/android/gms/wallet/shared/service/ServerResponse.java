package com.google.android.gms.wallet.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ServerResponse extends AbstractSafeParcelable implements ReflectedParcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awyh();

    /* renamed from: a */
    public static final ServerResponse f110423a;

    /* renamed from: b */
    public static final ServerResponse f110424b;

    /* renamed from: c */
    public static final ServerResponse f110425c;

    /* renamed from: d */
    public static final ServerResponse f110426d;

    /* renamed from: e */
    public static final ServerResponse f110427e;

    /* renamed from: f */
    int f110428f;

    /* renamed from: g */
    byte[] f110429g;

    /* renamed from: h */
    String f110430h;

    /* renamed from: i */
    private bxxc f110431i;

    static {
        bxxc bxxc = null;
        f110423a = new ServerResponse(6, bxxc);
        f110424b = new ServerResponse(5, bxxc);
        f110425c = new ServerResponse(22, bxxc);
        f110426d = new ServerResponse(1, bxxc);
        new ServerResponse(40, bxxc);
        f110427e = new ServerResponse(39, bxxc);
    }

    ServerResponse() {
        this.f110428f = 1;
    }

    /* renamed from: a */
    public static boolean m94179a(int i) {
        if (i == 17 || i == 30) {
            return true;
        }
        switch (i) {
            case 33:
            case 34:
            case 35:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return true;
            default:
                switch (i) {
                    case 41:
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    case FelicaException.TYPE_RESET_FAILED:
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    case 47:
                    case 48:
                        return true;
                    default:
                        switch (i) {
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case FelicaException.TYPE_ACTIVATE_FAILED:
                            case 57:
                            case FelicaException.TYPE_OFFLINE_CANCELED:
                            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                            case FelicaException.TYPE_MFC_NOT_FOUND:
                            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            case 62:
                            case 63:
                            case 64:
                            case KeyInformation.AES128_DES56:
                            case 66:
                            case KeyInformation.AES128_DES112:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    /* renamed from: b */
    public static boolean m94180b(int i) {
        if (i == 17 || i == 30) {
            return true;
        }
        switch (i) {
            case 33:
            case 34:
            case 35:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return true;
            default:
                switch (i) {
                    case 41:
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    case FelicaException.TYPE_RESET_FAILED:
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    case 47:
                    case 48:
                        return true;
                    default:
                        switch (i) {
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case FelicaException.TYPE_ACTIVATE_FAILED:
                            case 57:
                            case FelicaException.TYPE_OFFLINE_CANCELED:
                            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                            case FelicaException.TYPE_MFC_NOT_FOUND:
                            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            case 62:
                            case 63:
                            case 64:
                            case KeyInformation.AES128_DES56:
                            case 66:
                            case KeyInformation.AES128_DES112:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    /* renamed from: f */
    private final void m94181f() {
        bxxk bxxk;
        byte[] bArr;
        if (this.f110431i == null && m94179a(this.f110428f)) {
            int i = this.f110428f;
            if (i == 17) {
                bxxk = (bxxk) bltt.f127736d.mo74142c(7);
            } else if (i != 30) {
                switch (i) {
                    case 33:
                        bxxk = (bxxk) blxx.f128159j.mo74142c(7);
                        break;
                    case 34:
                        bxxk = (bxxk) blyr.f128298p.mo74142c(7);
                        break;
                    case 35:
                        bxxk = (bxxk) blyp.f128283f.mo74142c(7);
                        break;
                    case 36:
                        bxxk = (bxxk) bmsc.f130646l.mo74142c(7);
                        break;
                    case FelicaException.TYPE_NOT_CLOSED:
                        bxxk = (bxxk) bmsa.f130632f.mo74142c(7);
                        break;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        bxxk = (bxxk) blxz.f128176e.mo74142c(7);
                        break;
                    default:
                        switch (i) {
                            case 41:
                                bxxk = (bxxk) bwkb.f159934k.mo74142c(7);
                                break;
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                                bxxk = (bxxk) bwgn.f159218h.mo74142c(7);
                                break;
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                bxxk = (bxxk) bwgr.f159249e.mo74142c(7);
                                break;
                            case FelicaException.TYPE_RESET_FAILED:
                                bxxk = (bxxk) bmrk.f130509i.mo74142c(7);
                                break;
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                bxxk = (bxxk) bmrr.f130565j.mo74142c(7);
                                break;
                            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                bxxk = (bxxk) bmrp.f130557a.mo74142c(7);
                                break;
                            case 47:
                                bxxk = (bxxk) bmsj.f130686f.mo74142c(7);
                                break;
                            case 48:
                                bxxk = (bxxk) bmso.f130719g.mo74142c(7);
                                break;
                            default:
                                switch (i) {
                                    case 51:
                                        bxxk = (bxxk) bwjx.f159888j.mo74142c(7);
                                        break;
                                    case 52:
                                        bxxk = (bxxk) bmrc.f130465f.mo74142c(7);
                                        break;
                                    case 53:
                                        bxxk = (bxxk) bmqv.f130437d.mo74142c(7);
                                        break;
                                    case 54:
                                        bxxk = (bxxk) blxn.f128087f.mo74142c(7);
                                        break;
                                    case 55:
                                        bxxk = (bxxk) blxr.f128121g.mo74142c(7);
                                        break;
                                    case FelicaException.TYPE_ACTIVATE_FAILED:
                                        bxxk = (bxxk) bwjl.f159802g.mo74142c(7);
                                        break;
                                    case 57:
                                        bxxk = (bxxk) bwjp.f159843g.mo74142c(7);
                                        break;
                                    case FelicaException.TYPE_OFFLINE_CANCELED:
                                        bxxk = (bxxk) blwb.f127916a.mo74142c(7);
                                        break;
                                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                        bxxk = (bxxk) blwd.f127922a.mo74142c(7);
                                        break;
                                    case FelicaException.TYPE_MFC_NOT_FOUND:
                                        bxxk = (bxxk) bwiz.f159705g.mo74142c(7);
                                        break;
                                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                        bxxk = (bxxk) bwjd.f159739g.mo74142c(7);
                                        break;
                                    case 62:
                                        bxxk = (bxxk) bwkq.f160000g.mo74142c(7);
                                        break;
                                    case 63:
                                        bxxk = (bxxk) bwku.f160040h.mo74142c(7);
                                        break;
                                    case 64:
                                        bxxk = (bxxk) bwjf.f159753g.mo74142c(7);
                                        break;
                                    case KeyInformation.AES128_DES56:
                                        bxxk = (bxxk) bwjj.f159787g.mo74142c(7);
                                        break;
                                    case 66:
                                        bxxk = (bxxk) bwle.f160097g.mo74142c(7);
                                        break;
                                    case KeyInformation.AES128_DES112:
                                        bxxk = (bxxk) bwli.f160128g.mo74142c(7);
                                        break;
                                    case 68:
                                        bxxk = (bxxk) bmrv.f130586g.mo74142c(7);
                                        break;
                                    case 69:
                                        bxxk = (bxxk) bwjr.f159857f.mo74142c(7);
                                        break;
                                    case 70:
                                        bxxk = (bxxk) bwju.f159870f.mo74142c(7);
                                        break;
                                    case 71:
                                        bxxk = (bxxk) bwkm.f159987a.mo74142c(7);
                                        break;
                                    case 72:
                                        bxxk = (bxxk) bwko.f159993a.mo74142c(7);
                                        break;
                                    case 73:
                                        bxxk = (bxxk) bwlk.f160142f.mo74142c(7);
                                        break;
                                    case 74:
                                        bxxk = (bxxk) bwky.f160063f.mo74142c(7);
                                        break;
                                    case 75:
                                        bxxk = (bxxk) bwla.f160076c.mo74142c(7);
                                        break;
                                    case 76:
                                        bxxk = (bxxk) bwki.f159970e.mo74142c(7);
                                        break;
                                    case 77:
                                        bxxk = (bxxk) bmri.f130495g.mo74142c(7);
                                        break;
                                    default:
                                        bxxk = null;
                                        break;
                                }
                        }
                }
            } else {
                bxxk = (bxxk) btrp.f150133a.mo74142c(7);
            }
            if (bxxk == null || (bArr = this.f110429g) == null) {
                this.f110428f = 1;
                StringBuilder sb = new StringBuilder(53);
                sb.append("Unknown proto class type for responseType=1");
                Log.e("ServerResponse", sb.toString());
                return;
            }
            try {
                this.f110431i = (bxxc) bxxk.mo73657a(bArr);
            } catch (bxwf e) {
                this.f110428f = 1;
                Log.e("ServerResponse", "Failed to parse parcelable proto", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return this.f110428f == 22;
    }

    /* renamed from: c */
    public final int mo60050c() {
        m94181f();
        return this.f110428f;
    }

    /* renamed from: d */
    public final boolean mo60051d() {
        m94181f();
        return m94179a(this.f110428f);
    }

    /* renamed from: e */
    public final bxxc mo60052e() {
        m94181f();
        return this.f110431i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        bxxc bxxc;
        this.f110429g = mo60049b();
        if (this.f110430h == null && (bxxc = this.f110431i) != null) {
            this.f110430h = bxxc.getClass().getName();
        }
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f110428f);
        see.m35052a(parcel, 3, this.f110429g, false);
        see.m35046a(parcel, 4, this.f110430h, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: b */
    public final byte[] mo60049b() {
        byte[] bArr = this.f110429g;
        bxxc bxxc = this.f110431i;
        return bxxc != null ? bxxc.mo73642k() : bArr;
    }

    public ServerResponse(int i, bxxc bxxc) {
        this.f110428f = i;
        this.f110431i = bxxc;
    }

    public ServerResponse(int i, byte[] bArr) {
        this.f110428f = i;
        this.f110429g = bArr;
    }

    public ServerResponse(int i, byte[] bArr, String str) {
        this.f110428f = i;
        this.f110429g = bArr;
        this.f110430h = str;
    }
}
