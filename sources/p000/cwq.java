package p000;

import java.util.HashMap;
import java.util.List;

/* renamed from: cwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cwq extends cwr {

    /* renamed from: a */
    private final List f12269a;

    public cwq(List list) {
        this.f12269a = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe A[LOOP:1: B:21:0x0090->B:60:0x00fe, LOOP_END] */
    /* renamed from: a */
    public final cwu mo8369a(cvt cvt) {
        byte[] bArr;
        cww cww;
        String str;
        cvt cvt2 = cvt;
        HashMap hashMap = new HashMap();
        int i = 0;
        int i2 = 0;
        byte b = 0;
        int i3 = 0;
        while (i2 < this.f12269a.size() && i2 >= 0) {
            cwy cwy = (cwy) this.f12269a.get(i2);
            cwv cwv = cwy.f12299a;
            int i4 = cwy.f12300b;
            byte[] bArr2 = cwy.f12301c;
            int ordinal = cwv.ordinal();
            int i5 = 1;
            if (ordinal == 0) {
                bArr = cvz.m7713a(((cyq) cvt2).f12404g.f12054c, cvz.m7718b(bArr2) + 2, i4);
            } else if (ordinal == 1) {
                bArr = cvt2.mo8341a(cvz.m7718b(bArr2));
                int length = bArr.length;
                if (length != i4) {
                    if (length < i4) {
                        byte[] bArr3 = new byte[i4];
                        System.arraycopy(bArr, i, bArr3, i4 - length, i4);
                        bArr = bArr3;
                    } else {
                        bArr = cvz.m7713a(bArr, i, i4);
                    }
                }
            } else if (ordinal == 2) {
                int[] iArr = new int[1];
                iArr[i] = ((cyp) cvt2).f12398a.f12203d;
                bArr = cvz.m7713a(cvz.m7714a(iArr), 4 - i4, i4);
            } else if (ordinal == 3) {
                bArr = cwv.m7795a(i4);
            } else if (ordinal == 4) {
                bArr = cwv.m7795a(i4);
            } else {
                throw null;
            }
            List list = cwy.f12304f;
            int size = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    cww = cwy.f12306h;
                    break;
                }
                cwx cwx = cwy.f12302d;
                byte[] a = cwy.m7799a(bArr, cwy.f12303e);
                byte[] a2 = cwy.m7799a((byte[]) list.get(i6), cwy.f12303e);
                int ordinal2 = cwx.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != i5) {
                        if (ordinal2 == 2) {
                            int i7 = 0;
                            while (true) {
                                if (i7 < a.length) {
                                    if (a[i7] != a2[i7]) {
                                        i5 = 1;
                                        break;
                                    }
                                    i7++;
                                } else {
                                    i5 = 0;
                                    break;
                                }
                            }
                        } else if (ordinal2 == 3) {
                            int i8 = 0;
                            while (true) {
                                if (i8 < a.length) {
                                    byte b2 = a[i8] & 255;
                                    byte b3 = a2[i8] & 255;
                                    if (b2 >= b3) {
                                        if (b2 > b3) {
                                            break;
                                        }
                                        i8++;
                                    } else {
                                        i5 = 0;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i5 = 1;
                        } else if (ordinal2 != 4) {
                            throw null;
                        }
                    } else {
                        int i9 = 0;
                        while (true) {
                            if (i9 < a.length) {
                                if (a[i9] != a2[i9]) {
                                    break;
                                }
                                i9++;
                            } else {
                                i5 = 1;
                                break;
                            }
                        }
                    }
                    i6++;
                    if (i5 == 0) {
                        cww = cwy.f12305g;
                        break;
                    }
                    i5 = 1;
                }
                i5 = 0;
                i6++;
                if (i5 == 0) {
                }
            }
            if (cww.f12289b) {
                b = cww.f12288a;
                i3 = i2 + 1;
            }
            int i10 = cww.f12291d;
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == 0) {
                    i2++;
                } else if (i11 == 1) {
                    i2 = -1;
                } else if (i11 != 2) {
                    if (i10 != 1) {
                        str = i10 != 2 ? "JUMP" : "EXIT";
                    } else {
                        str = "CONTINUE";
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 45);
                    sb.append("unknown PDOL check match result state change ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i2 = cww.f12290c;
                }
                Integer valueOf = Integer.valueOf(i2);
                Integer num = (Integer) hashMap.get(valueOf);
                if (num == null) {
                    hashMap.put(valueOf, 1);
                } else if (num.intValue() >= 100) {
                    return cwu.m7793a((byte) 0, 0);
                } else {
                    hashMap.put(valueOf, Integer.valueOf(num.intValue() + 1));
                }
                i = 0;
            } else {
                throw null;
            }
        }
        return cwu.m7793a(b, i3);
    }

    /* renamed from: a */
    public final boolean mo8370a() {
        return true;
    }
}
