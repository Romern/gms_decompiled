package p000;

import com.felicanetworks.mfc.FelicaException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: bjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjk {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final Object m3215a(String str) {
        bjm bjm;
        bjn bjn;
        boolean z;
        boolean z2;
        int i;
        int i2;
        char c;
        int i3;
        boolean z3;
        int read;
        StringReader stringReader = new StringReader(str);
        bjj bjj = new bjj();
        char c2 = 65535;
        try {
            bjm bjm2 = bjj.f3366a;
            bjm2.f3379g = stringReader;
            int i4 = 0;
            bjm2.f3388p = false;
            bjm2.f3385m = 0;
            bjm2.f3386n = 0;
            bjm2.f3383k = 0;
            bjm2.f3384l = 0;
            bjm2.f3387o = 0;
            bjm2.f3381i = 0;
            bjj.f3367b = null;
            bjj.f3368c = 0;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            while (true) {
                try {
                    bjm = bjj.f3366a;
                    int i5 = bjm.f3386n;
                    char[] cArr = bjm.f3382j;
                    char[] cArr2 = bjm.f3373b;
                    int[] iArr = bjm.f3376e;
                    int[] iArr2 = bjm.f3375d;
                    int[] iArr3 = bjm.f3377f;
                    while (true) {
                        int i6 = bjm.f3383k;
                        bjm.f3387o += i6 - bjm.f3385m;
                        bjm.f3385m = i6;
                        bjm.f3384l = i6;
                        bjm.f3380h = bjm.f3372a[bjm.f3381i];
                        int i7 = i6;
                        int i8 = -1;
                        while (true) {
                            if (i6 < i5) {
                                i3 = i6 + 1;
                                i2 = i7;
                                c = cArr[i6];
                                i = i5;
                            } else if (!bjm.f3388p) {
                                bjm.f3384l = i6;
                                bjm.f3383k = i7;
                                int i9 = bjm.f3385m;
                                if (i9 > 0) {
                                    char[] cArr3 = bjm.f3382j;
                                    System.arraycopy(cArr3, i9, cArr3, i4, bjm.f3386n - i9);
                                    int i10 = bjm.f3386n;
                                    int i11 = bjm.f3385m;
                                    bjm.f3386n = i10 - i11;
                                    i6 = bjm.f3384l - i11;
                                    bjm.f3384l = i6;
                                    bjm.f3383k -= i11;
                                    bjm.f3385m = i4;
                                }
                                char[] cArr4 = bjm.f3382j;
                                int length = cArr4.length;
                                if (i6 >= length) {
                                    char[] cArr5 = new char[(i6 + i6)];
                                    System.arraycopy(cArr4, i4, cArr5, i4, length);
                                    bjm.f3382j = cArr5;
                                }
                                Reader reader = bjm.f3379g;
                                char[] cArr6 = bjm.f3382j;
                                int i12 = bjm.f3386n;
                                int read2 = reader.read(cArr6, i12, cArr6.length - i12);
                                if (read2 > 0) {
                                    bjm.f3386n += read2;
                                    z3 = false;
                                } else if (read2 != 0 || (read = bjm.f3379g.read()) == c2) {
                                    z3 = true;
                                } else {
                                    char[] cArr7 = bjm.f3382j;
                                    int i13 = bjm.f3386n;
                                    bjm.f3386n = i13 + 1;
                                    cArr7[i13] = (char) read;
                                    z3 = false;
                                }
                                int i14 = bjm.f3384l;
                                i2 = bjm.f3383k;
                                cArr = bjm.f3382j;
                                i = bjm.f3386n;
                                if (z3) {
                                    i7 = i2;
                                    i5 = i;
                                } else {
                                    i3 = i14 + 1;
                                    c = cArr[i14];
                                }
                            }
                            int i15 = iArr[iArr2[bjm.f3380h] + cArr2[c]];
                            if (i15 == c2) {
                                c2 = c;
                                i7 = i2;
                                i5 = i;
                            } else {
                                bjm.f3380h = i15;
                                int i16 = iArr3[i15];
                                int i17 = i15;
                                if ((i16 & 1) != 1) {
                                    i7 = i2;
                                    i17 = i8;
                                } else if ((i16 & 8) == 8) {
                                    c2 = c;
                                    i5 = i;
                                    i8 = i17;
                                    i7 = i3;
                                } else {
                                    i7 = i3;
                                }
                                i5 = i;
                                i8 = i17;
                                i4 = 0;
                                c2 = 65535;
                                i6 = i3;
                            }
                        }
                        bjm.f3383k = i7;
                        if (i8 >= 0) {
                            i8 = bjm.f3374c[i8];
                        }
                        switch (i8) {
                            case 1:
                                throw new bjl(bjm.f3387o, 0, new Character(bjm.f3382j[bjm.f3385m]));
                            case 2:
                                bjn = new bjn(0, Long.valueOf(bjm.mo3194a()));
                                break;
                            case 3:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case FelicaException.TYPE_NOT_CLOSED /*37*/:
                            case FelicaException.TYPE_ILLEGAL_METHOD_CALL /*38*/:
                            case FelicaException.TYPE_USED_BY_OTHER_APP /*39*/:
                            case FelicaException.TYPE_PUSH_FAILED /*40*/:
                            case 41:
                            case FelicaException.TYPE_ALREADY_ACTIVATED /*42*/:
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED /*43*/:
                            case FelicaException.TYPE_RESET_FAILED /*44*/:
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED /*45*/:
                            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED /*46*/:
                            case 47:
                            case 48:
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 4:
                                bjm.f3389q = null;
                                bjm.f3389q = new StringBuffer();
                                bjm.f3381i = 2;
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 5:
                                bjn = new bjn(1, null);
                                break;
                            case 6:
                                bjn = new bjn(2, null);
                                break;
                            case 7:
                                bjn = new bjn(3, null);
                                break;
                            case 8:
                                bjn = new bjn(4, null);
                                break;
                            case 9:
                                bjn = new bjn(5, null);
                                break;
                            case 10:
                                bjn = new bjn(6, null);
                                break;
                            case 11:
                                bjm.f3389q.append(bjm.mo3194a());
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 12:
                                bjm.f3389q.append('\\');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 13:
                                bjm.f3381i = 0;
                                bjn = new bjn(0, bjm.f3389q.toString());
                                break;
                            case 14:
                                bjm.f3389q.append('\"');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 15:
                                bjm.f3389q.append('/');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 16:
                                bjm.f3389q.append(8);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 17:
                                bjm.f3389q.append(12);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 18:
                                bjm.f3389q.append(10);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 19:
                                bjm.f3389q.append(13);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 20:
                                bjm.f3389q.append(9);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 21:
                                bjn = new bjn(0, Double.valueOf(bjm.mo3194a()));
                                break;
                            case 22:
                                bjn = new bjn(0, null);
                                break;
                            case 23:
                                bjn = new bjn(0, Boolean.valueOf(bjm.mo3194a()));
                                break;
                            case 24:
                                bjm.f3389q.append((char) Integer.parseInt(bjm.mo3194a().substring(2), 16));
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            default:
                                if (c2 == 65535 && bjm.f3385m == bjm.f3384l) {
                                    bjm.f3388p = true;
                                    bjn = null;
                                    break;
                                } else {
                                    z = false;
                                    bjm.m3216b();
                                    i4 = 0;
                                    c2 = 65535;
                                }
                                break;
                        }
                    }
                    bjj.f3367b = bjn;
                    if (bjj.f3367b == null) {
                        z2 = false;
                        bjj.f3367b = new bjn(-1, null);
                    } else {
                        z2 = false;
                    }
                    int i18 = bjj.f3368c;
                    if (i18 != -1) {
                        if (i18 == 0) {
                            int i19 = bjj.f3367b.f3390a;
                            if (i19 == 0) {
                                bjj.f3368c = 1;
                                linkedList.addFirst(1);
                                linkedList2.addFirst(bjj.f3367b.f3391b);
                            } else if (i19 == 1) {
                                bjj.f3368c = 2;
                                linkedList.addFirst(2);
                                linkedList2.addFirst(bjj.m3213c());
                            } else if (i19 != 3) {
                                bjj.f3368c = -1;
                            } else {
                                bjj.f3368c = 3;
                                linkedList.addFirst(3);
                                linkedList2.addFirst(bjj.m3212b());
                            }
                        } else if (i18 != 1) {
                            if (i18 == 2) {
                                bjn bjn2 = bjj.f3367b;
                                int i20 = bjn2.f3390a;
                                if (i20 == 0) {
                                    Object obj = bjn2.f3391b;
                                    if (obj instanceof String) {
                                        linkedList2.addFirst((String) obj);
                                        bjj.f3368c = 4;
                                        linkedList.addFirst(4);
                                    } else {
                                        bjj.f3368c = -1;
                                    }
                                } else if (i20 != 2) {
                                    if (i20 != 5) {
                                        bjj.f3368c = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    bjj.f3368c = bjj.m3211a(linkedList);
                                } else {
                                    bjj.f3368c = 1;
                                }
                            } else if (i18 == 3) {
                                int i21 = bjj.f3367b.f3390a;
                                if (i21 == 0) {
                                    ((List) linkedList2.getFirst()).add(bjj.f3367b.f3391b);
                                } else if (i21 == 1) {
                                    Map c3 = bjj.m3213c();
                                    ((List) linkedList2.getFirst()).add(c3);
                                    bjj.f3368c = 2;
                                    linkedList.addFirst(2);
                                    linkedList2.addFirst(c3);
                                } else if (i21 == 3) {
                                    List b = bjj.m3212b();
                                    ((List) linkedList2.getFirst()).add(b);
                                    bjj.f3368c = 3;
                                    linkedList.addFirst(3);
                                    linkedList2.addFirst(b);
                                } else if (i21 != 4) {
                                    if (i21 != 5) {
                                        bjj.f3368c = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    bjj.f3368c = bjj.m3211a(linkedList);
                                } else {
                                    bjj.f3368c = 1;
                                }
                            } else if (i18 == 4) {
                                int i22 = bjj.f3367b.f3390a;
                                if (i22 == 0) {
                                    linkedList.removeFirst();
                                    ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), bjj.f3367b.f3391b);
                                    bjj.f3368c = bjj.m3211a(linkedList);
                                } else if (i22 == 1) {
                                    linkedList.removeFirst();
                                    Map map = (Map) linkedList2.getFirst();
                                    Map c4 = bjj.m3213c();
                                    map.put((String) linkedList2.removeFirst(), c4);
                                    bjj.f3368c = 2;
                                    linkedList.addFirst(2);
                                    linkedList2.addFirst(c4);
                                } else if (i22 == 3) {
                                    linkedList.removeFirst();
                                    Map map2 = (Map) linkedList2.getFirst();
                                    List b2 = bjj.m3212b();
                                    map2.put((String) linkedList2.removeFirst(), b2);
                                    bjj.f3368c = 3;
                                    linkedList.addFirst(3);
                                    linkedList2.addFirst(b2);
                                } else if (i22 != 6) {
                                    bjj.f3368c = -1;
                                }
                            }
                        } else if (bjj.f3367b.f3390a == -1) {
                            return linkedList2.removeFirst();
                        } else {
                            throw new bjl(bjj.mo3192a(), 1, bjj.f3367b);
                        }
                        if (bjj.f3368c == -1) {
                            throw new bjl(bjj.mo3192a(), 1, bjj.f3367b);
                        } else if (bjj.f3367b.f3390a != -1) {
                            i4 = 0;
                            c2 = 65535;
                        } else {
                            throw new bjl(bjj.mo3192a(), 1, bjj.f3367b);
                        }
                    } else {
                        throw new bjl(bjj.mo3192a(), 1, bjj.f3367b);
                    }
                } catch (Exception e) {
                    throw new bjl(bjm.f3387o, 2, e);
                } catch (IOException e2) {
                    throw e2;
                }
            }
        } catch (IOException e3) {
            throw new bjl(-1, 2, e3);
        }
    }
}
