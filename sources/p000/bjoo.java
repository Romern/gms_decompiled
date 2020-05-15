package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bjoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoo {
    /* renamed from: a */
    public static List m104169a(List list, bjhw bjhw) {
        Object obj;
        int i;
        int i2;
        String str;
        bwuq bwuq;
        String str2;
        int i3;
        ArrayList arrayList = new ArrayList(list.size());
        if (!list.isEmpty()) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                bwur bwur = (bwur) list.get(i4);
                String str3 = bwur.f161062c;
                int i5 = bwur.f161063d;
                bmxy.m108591a(i5 > 0, "ValidationId from server should always be positive. Received validation id: %s", i5);
                int a = bwup.m122322a(bwur.f161060a);
                int i6 = a - 1;
                if (a != 0) {
                    if (i6 == 0) {
                        if (bwur.f161060a == 1) {
                            i = ((Integer) bwur.f161061b).intValue();
                        } else {
                            i = 0;
                        }
                        obj = new bjot(bjhw, str3, i, i5);
                    } else if (i6 == 1) {
                        if (bwur.f161060a == 2) {
                            i2 = ((Integer) bwur.f161061b).intValue();
                        } else {
                            i2 = 0;
                        }
                        obj = new bjos(bjhw, str3, i2, i5);
                    } else if (i6 == 2) {
                        if (bwur.f161060a == 3) {
                            str = (String) bwur.f161061b;
                        } else {
                            str = "";
                        }
                        obj = new bjow(bjhw, str3, str, i5);
                    } else if (i6 == 3) {
                        if (bwur.f161060a == 7) {
                            bwuq = (bwuq) bwur.f161061b;
                        } else {
                            bwuq = bwuq.f161053c;
                        }
                        obj = new bjow(bjhw, str3, bwuq, i5);
                    } else if (i6 != 4) {
                        Object[] objArr = new Object[1];
                        switch (bwup.m122322a(bwur.f161060a)) {
                            case 1:
                                str2 = "MIN_LENGTH";
                                break;
                            case 2:
                                str2 = "MAX_LENGTH";
                                break;
                            case 3:
                                str2 = "REGEX";
                                break;
                            case 4:
                                str2 = "REGEX_CONDITION";
                                break;
                            case 5:
                                str2 = "CHECKSUM_TYPE";
                                break;
                            case 6:
                                str2 = "EQUALITY_DATA_REFERENCE";
                                break;
                            case 7:
                                str2 = "CONDITION_NOT_SET";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        objArr[0] = str2;
                        throw new UnsupportedOperationException(String.format("Validation condition not supported: %s", objArr));
                    } else {
                        if (bwur.f161060a != 4 || (i3 = bwuo.m122321a(((Integer) bwur.f161061b).intValue())) == 0) {
                            i3 = 1;
                        }
                        int i7 = i3 - 1;
                        if (i3 != 0) {
                            switch (i7) {
                                case 1:
                                    obj = new bjom(bjhw, str3, i5);
                                    continue;
                                case 2:
                                    obj = new bjoj(bjhw, str3, i5);
                                    continue;
                                case 3:
                                    obj = new bjol(bjhw, str3, i5);
                                    continue;
                                case 4:
                                    obj = new bjox(bjhw, str3, i5);
                                    continue;
                                case 5:
                                    obj = new bjok(bjhw, str3, i5);
                                    continue;
                                case 6:
                                    obj = new bjou(bjhw, str3, i5);
                                    continue;
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 26:
                                    obj = new bjpd(bjhw, str3, i3, i5);
                                    continue;
                                case 25:
                                default:
                                    throw new IllegalArgumentException(String.format("ChecksumType not supported: %s", Integer.valueOf(i7)));
                                case 27:
                                    obj = new bjor(bjhw, str3, i5);
                                    continue;
                            }
                        } else {
                            throw null;
                        }
                    }
                    arrayList.add(obj);
                    i4++;
                } else {
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
