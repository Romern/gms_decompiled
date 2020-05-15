package p000;

import com.felicanetworks.mfc.FelicaException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: bhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhf {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final Object m3034a(String str) {
        bhh bhh;
        bhi bhi;
        boolean z;
        boolean z2;
        int i;
        int i2;
        char c;
        int i3;
        boolean z3;
        int read;
        StringReader stringReader = new StringReader(str);
        bhe bhe = new bhe();
        char c2 = 65535;
        try {
            bhh bhh2 = bhe.f3223a;
            bhh2.f3236g = stringReader;
            int i4 = 0;
            bhh2.f3245p = false;
            bhh2.f3242m = 0;
            bhh2.f3243n = 0;
            bhh2.f3240k = 0;
            bhh2.f3241l = 0;
            bhh2.f3244o = 0;
            bhh2.f3238i = 0;
            bhe.f3224b = null;
            bhe.f3225c = 0;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            while (true) {
                try {
                    bhh = bhe.f3223a;
                    int i5 = bhh.f3243n;
                    char[] cArr = bhh.f3239j;
                    char[] cArr2 = bhh.f3230b;
                    int[] iArr = bhh.f3233e;
                    int[] iArr2 = bhh.f3232d;
                    int[] iArr3 = bhh.f3234f;
                    while (true) {
                        int i6 = bhh.f3240k;
                        bhh.f3244o += i6 - bhh.f3242m;
                        bhh.f3242m = i6;
                        bhh.f3241l = i6;
                        bhh.f3237h = bhh.f3229a[bhh.f3238i];
                        int i7 = i6;
                        int i8 = -1;
                        while (true) {
                            if (i6 < i5) {
                                i3 = i6 + 1;
                                i2 = i7;
                                c = cArr[i6];
                                i = i5;
                            } else if (!bhh.f3245p) {
                                bhh.f3241l = i6;
                                bhh.f3240k = i7;
                                int i9 = bhh.f3242m;
                                if (i9 > 0) {
                                    char[] cArr3 = bhh.f3239j;
                                    System.arraycopy(cArr3, i9, cArr3, i4, bhh.f3243n - i9);
                                    int i10 = bhh.f3243n;
                                    int i11 = bhh.f3242m;
                                    bhh.f3243n = i10 - i11;
                                    i6 = bhh.f3241l - i11;
                                    bhh.f3241l = i6;
                                    bhh.f3240k -= i11;
                                    bhh.f3242m = i4;
                                }
                                char[] cArr4 = bhh.f3239j;
                                int length = cArr4.length;
                                if (i6 >= length) {
                                    char[] cArr5 = new char[(i6 + i6)];
                                    System.arraycopy(cArr4, i4, cArr5, i4, length);
                                    bhh.f3239j = cArr5;
                                }
                                Reader reader = bhh.f3236g;
                                char[] cArr6 = bhh.f3239j;
                                int i12 = bhh.f3243n;
                                int read2 = reader.read(cArr6, i12, cArr6.length - i12);
                                if (read2 > 0) {
                                    bhh.f3243n += read2;
                                    z3 = false;
                                } else if (read2 != 0 || (read = bhh.f3236g.read()) == c2) {
                                    z3 = true;
                                } else {
                                    char[] cArr7 = bhh.f3239j;
                                    int i13 = bhh.f3243n;
                                    bhh.f3243n = i13 + 1;
                                    cArr7[i13] = (char) read;
                                    z3 = false;
                                }
                                int i14 = bhh.f3241l;
                                i2 = bhh.f3240k;
                                cArr = bhh.f3239j;
                                i = bhh.f3243n;
                                if (z3) {
                                    i7 = i2;
                                    i5 = i;
                                } else {
                                    i3 = i14 + 1;
                                    c = cArr[i14];
                                }
                            }
                            int i15 = iArr[iArr2[bhh.f3237h] + cArr2[c]];
                            if (i15 == c2) {
                                c2 = c;
                                i7 = i2;
                                i5 = i;
                            } else {
                                bhh.f3237h = i15;
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
                        bhh.f3240k = i7;
                        if (i8 >= 0) {
                            i8 = bhh.f3231c[i8];
                        }
                        switch (i8) {
                            case 1:
                                throw new bhg(bhh.f3244o, 0, new Character(bhh.f3239j[bhh.f3242m]));
                            case 2:
                                bhi = new bhi(0, Long.valueOf(bhh.mo3126a()));
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
                                bhh.f3246q = null;
                                bhh.f3246q = new StringBuffer();
                                bhh.f3238i = 2;
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 5:
                                bhi = new bhi(1, null);
                                break;
                            case 6:
                                bhi = new bhi(2, null);
                                break;
                            case 7:
                                bhi = new bhi(3, null);
                                break;
                            case 8:
                                bhi = new bhi(4, null);
                                break;
                            case 9:
                                bhi = new bhi(5, null);
                                break;
                            case 10:
                                bhi = new bhi(6, null);
                                break;
                            case 11:
                                bhh.f3246q.append(bhh.mo3126a());
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 12:
                                bhh.f3246q.append('\\');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 13:
                                bhh.f3238i = 0;
                                bhi = new bhi(0, bhh.f3246q.toString());
                                break;
                            case 14:
                                bhh.f3246q.append('\"');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 15:
                                bhh.f3246q.append('/');
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 16:
                                bhh.f3246q.append(8);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 17:
                                bhh.f3246q.append(12);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 18:
                                bhh.f3246q.append(10);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 19:
                                bhh.f3246q.append(13);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 20:
                                bhh.f3246q.append(9);
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            case 21:
                                bhi = new bhi(0, Double.valueOf(bhh.mo3126a()));
                                break;
                            case 22:
                                bhi = new bhi(0, null);
                                break;
                            case 23:
                                bhi = new bhi(0, Boolean.valueOf(bhh.mo3126a()));
                                break;
                            case 24:
                                bhh.f3246q.append((char) Integer.parseInt(bhh.mo3126a().substring(2), 16));
                                z = false;
                                i4 = 0;
                                c2 = 65535;
                            default:
                                if (c2 == 65535 && bhh.f3242m == bhh.f3241l) {
                                    bhh.f3245p = true;
                                    bhi = null;
                                    break;
                                } else {
                                    z = false;
                                    bhh.m3036b();
                                    i4 = 0;
                                    c2 = 65535;
                                }
                                break;
                        }
                    }
                    bhe.f3224b = bhi;
                    if (bhe.f3224b == null) {
                        z2 = false;
                        bhe.f3224b = new bhi(-1, null);
                    } else {
                        z2 = false;
                    }
                    int i18 = bhe.f3225c;
                    if (i18 != -1) {
                        if (i18 == 0) {
                            int i19 = bhe.f3224b.f3247a;
                            if (i19 == 0) {
                                bhe.f3225c = 1;
                                linkedList.addFirst(1);
                                linkedList2.addFirst(bhe.f3224b.f3248b);
                            } else if (i19 == 1) {
                                bhe.f3225c = 2;
                                linkedList.addFirst(2);
                                linkedList2.addFirst(bhe.m3032c());
                            } else if (i19 != 3) {
                                bhe.f3225c = -1;
                            } else {
                                bhe.f3225c = 3;
                                linkedList.addFirst(3);
                                linkedList2.addFirst(bhe.m3031b());
                            }
                        } else if (i18 != 1) {
                            if (i18 == 2) {
                                bhi bhi2 = bhe.f3224b;
                                int i20 = bhi2.f3247a;
                                if (i20 == 0) {
                                    Object obj = bhi2.f3248b;
                                    if (obj instanceof String) {
                                        linkedList2.addFirst((String) obj);
                                        bhe.f3225c = 4;
                                        linkedList.addFirst(4);
                                    } else {
                                        bhe.f3225c = -1;
                                    }
                                } else if (i20 != 2) {
                                    if (i20 != 5) {
                                        bhe.f3225c = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    bhe.f3225c = bhe.m3027a(linkedList);
                                } else {
                                    bhe.f3225c = 1;
                                }
                            } else if (i18 == 3) {
                                int i21 = bhe.f3224b.f3247a;
                                if (i21 == 0) {
                                    ((List) linkedList2.getFirst()).add(bhe.f3224b.f3248b);
                                } else if (i21 == 1) {
                                    Map c3 = bhe.m3032c();
                                    ((List) linkedList2.getFirst()).add(c3);
                                    bhe.f3225c = 2;
                                    linkedList.addFirst(2);
                                    linkedList2.addFirst(c3);
                                } else if (i21 == 3) {
                                    List b = bhe.m3031b();
                                    ((List) linkedList2.getFirst()).add(b);
                                    bhe.f3225c = 3;
                                    linkedList.addFirst(3);
                                    linkedList2.addFirst(b);
                                } else if (i21 != 4) {
                                    if (i21 != 5) {
                                        bhe.f3225c = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    bhe.f3225c = bhe.m3027a(linkedList);
                                } else {
                                    bhe.f3225c = 1;
                                }
                            } else if (i18 == 4) {
                                int i22 = bhe.f3224b.f3247a;
                                if (i22 == 0) {
                                    linkedList.removeFirst();
                                    ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), bhe.f3224b.f3248b);
                                    bhe.f3225c = bhe.m3027a(linkedList);
                                } else if (i22 == 1) {
                                    linkedList.removeFirst();
                                    Map map = (Map) linkedList2.getFirst();
                                    Map c4 = bhe.m3032c();
                                    map.put((String) linkedList2.removeFirst(), c4);
                                    bhe.f3225c = 2;
                                    linkedList.addFirst(2);
                                    linkedList2.addFirst(c4);
                                } else if (i22 == 3) {
                                    linkedList.removeFirst();
                                    Map map2 = (Map) linkedList2.getFirst();
                                    List b2 = bhe.m3031b();
                                    map2.put((String) linkedList2.removeFirst(), b2);
                                    bhe.f3225c = 3;
                                    linkedList.addFirst(3);
                                    linkedList2.addFirst(b2);
                                } else if (i22 != 6) {
                                    bhe.f3225c = -1;
                                }
                            }
                        } else if (bhe.f3224b.f3247a == -1) {
                            return linkedList2.removeFirst();
                        } else {
                            throw new bhg(bhe.mo3124a(), 1, bhe.f3224b);
                        }
                        if (bhe.f3225c == -1) {
                            throw new bhg(bhe.mo3124a(), 1, bhe.f3224b);
                        } else if (bhe.f3224b.f3247a != -1) {
                            i4 = 0;
                            c2 = 65535;
                        } else {
                            throw new bhg(bhe.mo3124a(), 1, bhe.f3224b);
                        }
                    } else {
                        throw new bhg(bhe.mo3124a(), 1, bhe.f3224b);
                    }
                } catch (Exception e) {
                    throw new bhg(bhh.f3244o, 2, e);
                } catch (IOException e2) {
                    throw e2;
                }
            }
        } catch (IOException e3) {
            throw new bhg(-1, 2, e3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhe.a(java.util.Map, java.io.Writer):void
     arg types: [java.util.Map, java.io.StringWriter]
     candidates:
      bhe.a(java.lang.Object, java.io.Writer):void
      bhe.a(java.util.Map, java.io.Writer):void */
    /* renamed from: a */
    public static String m3035a(Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            bhe.m3030a(map, (Writer) stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
