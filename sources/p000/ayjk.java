package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: ayjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjk {
    /* renamed from: a */
    public static ayjj m84108a(axos axos) {
        ArrayList arrayList = new ArrayList();
        bxvd da = ayjy.f97807b.mo74144da();
        TreeSet treeSet = new TreeSet(axos.mo53338c());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b = axos.mo53335b(str);
            bxvd da2 = ayjx.f97801d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayjx ayjx = (ayjx) da2.f164949b;
            str.getClass();
            ayjx.f97803a |= 1;
            ayjx.f97804b = str;
            ayjw a = m84109a(arrayList, b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayjx ayjx2 = (ayjx) da2.f164949b;
            a.getClass();
            ayjx2.f97805c = a;
            ayjx2.f97803a |= 2;
            arrayList2.add((ayjx) da2.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayjy ayjy = (ayjy) da.f164949b;
        if (!ayjy.f97809a.mo73666a()) {
            ayjy.f97809a = GeneratedMessageLite.m124021a(ayjy.f97809a);
        }
        bxsy.m123078a(arrayList2, ayjy.f97809a);
        return new ayjj((ayjy) da.mo74062i(), arrayList);
    }

    /* renamed from: a */
    private static ayjw m84109a(List list, Object obj) {
        int a;
        int a2;
        int a3;
        int a4;
        List list2 = list;
        Object obj2 = obj;
        bxvd da = ayjw.f97795d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayjw ayjw = (ayjw) da.f164949b;
        ayjw.f97798b = 1;
        int i = ayjw.f97797a | 1;
        ayjw.f97797a = i;
        if (obj2 != null) {
            bxvd da2 = ayjv.f97777p.mo74144da();
            if (obj2 instanceof String) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw2 = (ayjw) da.f164949b;
                ayjw2.f97798b = 2;
                ayjw2.f97797a = 1 | ayjw2.f97797a;
                String str = (String) obj2;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv = (ayjv) da2.f164949b;
                str.getClass();
                ayjv.f97779a |= 2;
                ayjv.f97781c = str;
            } else if (obj2 instanceof Integer) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw3 = (ayjw) da.f164949b;
                ayjw3.f97798b = 6;
                ayjw3.f97797a = 1 | ayjw3.f97797a;
                int intValue = ((Integer) obj2).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv2 = (ayjv) da2.f164949b;
                ayjv2.f97779a |= 32;
                ayjv2.f97785g = intValue;
            } else if (obj2 instanceof Long) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw4 = (ayjw) da.f164949b;
                ayjw4.f97798b = 5;
                ayjw4.f97797a = 1 | ayjw4.f97797a;
                long longValue = ((Long) obj2).longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv3 = (ayjv) da2.f164949b;
                ayjv3.f97779a |= 16;
                ayjv3.f97784f = longValue;
            } else if (obj2 instanceof Double) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw5 = (ayjw) da.f164949b;
                ayjw5.f97798b = 3;
                ayjw5.f97797a = 1 | ayjw5.f97797a;
                double doubleValue = ((Double) obj2).doubleValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv4 = (ayjv) da2.f164949b;
                ayjv4.f97779a |= 4;
                ayjv4.f97782d = doubleValue;
            } else if (obj2 instanceof Float) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw6 = (ayjw) da.f164949b;
                ayjw6.f97798b = 4;
                ayjw6.f97797a = 1 | ayjw6.f97797a;
                float floatValue = ((Float) obj2).floatValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv5 = (ayjv) da2.f164949b;
                ayjv5.f97779a |= 8;
                ayjv5.f97783e = floatValue;
            } else if (obj2 instanceof Boolean) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw7 = (ayjw) da.f164949b;
                ayjw7.f97798b = 8;
                ayjw7.f97797a = 1 | ayjw7.f97797a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv6 = (ayjv) da2.f164949b;
                ayjv6.f97779a |= 128;
                ayjv6.f97787i = booleanValue;
            } else if (obj2 instanceof Byte) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw8 = (ayjw) da.f164949b;
                ayjw8.f97798b = 7;
                ayjw8.f97797a = 1 | ayjw8.f97797a;
                byte byteValue = ((Byte) obj2).byteValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv7 = (ayjv) da2.f164949b;
                ayjv7.f97779a |= 64;
                ayjv7.f97786h = byteValue;
            } else if (obj2 instanceof byte[]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw9 = (ayjw) da.f164949b;
                ayjw9.f97798b = 1;
                ayjw9.f97797a |= 1;
                ByteString a5 = ByteString.m123261a((byte[]) obj2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv8 = (ayjv) da2.f164949b;
                a5.getClass();
                ayjv8.f97779a = 1 | ayjv8.f97779a;
                ayjv8.f97780b = a5;
            } else if (obj2 instanceof String[]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw10 = (ayjw) da.f164949b;
                ayjw10.f97798b = 11;
                ayjw10.f97797a = 1 | ayjw10.f97797a;
                List asList = Arrays.asList((String[]) obj2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv9 = (ayjv) da2.f164949b;
                if (!ayjv9.f97790l.mo73666a()) {
                    ayjv9.f97790l = GeneratedMessageLite.m124021a(ayjv9.f97790l);
                }
                bxsy.m123078a(asList, ayjv9.f97790l);
            } else if (obj2 instanceof long[]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw11 = (ayjw) da.f164949b;
                ayjw11.f97798b = 12;
                ayjw11.f97797a = 1 | ayjw11.f97797a;
                List b = bqcr.m112598b((long[]) obj2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv10 = (ayjv) da2.f164949b;
                if (!ayjv10.f97791m.mo73666a()) {
                    ayjv10.f97791m = GeneratedMessageLite.m124020a(ayjv10.f97791m);
                }
                bxsy.m123078a(b, ayjv10.f97791m);
            } else if (obj2 instanceof float[]) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw12 = (ayjw) da.f164949b;
                ayjw12.f97798b = 15;
                ayjw12.f97797a = 1 | ayjw12.f97797a;
                List a6 = bqcl.m112573a((float[]) obj2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv11 = (ayjv) da2.f164949b;
                if (!ayjv11.f97792n.mo73666a()) {
                    ayjv11.f97792n = GeneratedMessageLite.m124018a(ayjv11.f97792n);
                }
                bxsy.m123078a(a6, ayjv11.f97792n);
            } else if (obj2 instanceof Asset) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw13 = (ayjw) da.f164949b;
                ayjw13.f97798b = 13;
                ayjw13.f97797a = 1 | ayjw13.f97797a;
                list2.add((Asset) obj2);
                long size = (long) (list.size() - 1);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv12 = (ayjv) da2.f164949b;
                ayjv12.f97779a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                ayjv12.f97793o = size;
            } else if (obj2 instanceof axos) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw14 = (ayjw) da.f164949b;
                ayjw14.f97798b = 9;
                ayjw14.f97797a |= 1;
                axos axos = (axos) obj2;
                TreeSet treeSet = new TreeSet(axos.mo53338c());
                ayjx[] ayjxArr = new ayjx[treeSet.size()];
                Iterator it = treeSet.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    bxvd da3 = ayjx.f97801d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ayjx ayjx = (ayjx) da3.f164949b;
                    str2.getClass();
                    ayjx.f97803a |= 1;
                    ayjx.f97804b = str2;
                    ayjw a7 = m84109a(list2, axos.mo53335b(str2));
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    ayjx ayjx2 = (ayjx) da3.f164949b;
                    a7.getClass();
                    ayjx2.f97805c = a7;
                    ayjx2.f97803a |= 2;
                    ayjxArr[i2] = (ayjx) da3.mo74062i();
                    i2++;
                }
                List asList2 = Arrays.asList(ayjxArr);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayjv ayjv13 = (ayjv) da2.f164949b;
                if (!ayjv13.f97788j.mo73666a()) {
                    ayjv13.f97788j = GeneratedMessageLite.m124021a(ayjv13.f97788j);
                }
                bxsy.m123078a(asList2, ayjv13.f97788j);
            } else if (!(obj2 instanceof ArrayList)) {
                String valueOf = String.valueOf(obj.getClass().getSimpleName());
                throw new RuntimeException(valueOf.length() == 0 ? new String("newFieldValueFromValue: unexpected value ") : "newFieldValueFromValue: unexpected value ".concat(valueOf));
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ayjw ayjw15 = (ayjw) da.f164949b;
                ayjw15.f97798b = 10;
                ayjw15.f97797a |= 1;
                ArrayList arrayList = (ArrayList) obj2;
                int size2 = arrayList.size();
                Object obj3 = null;
                int i3 = 0;
                int i4 = 14;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    ayjw a8 = m84109a(list2, obj4);
                    int a9 = ayju.m84129a(a8.f97798b);
                    if ((a9 != 0 && a9 == 14) || (((a2 = ayju.m84129a(a8.f97798b)) != 0 && a2 == 2) || (((a3 = ayju.m84129a(a8.f97798b)) != 0 && a3 == 6) || ((a4 = ayju.m84129a(a8.f97798b)) != 0 && a4 == 9)))) {
                        if (i4 != 14 || ((a = ayju.m84129a(a8.f97798b)) != 0 && a == 14)) {
                            int a10 = ayju.m84129a(a8.f97798b);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            if (a10 != i4) {
                                String valueOf2 = String.valueOf(obj3.getClass());
                                String valueOf3 = String.valueOf(obj4.getClass());
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 80 + String.valueOf(valueOf3).length());
                                sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                                sb.append(valueOf2);
                                sb.append(" and a ");
                                sb.append(valueOf3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            int a11 = ayju.m84129a(a8.f97798b);
                            if (a11 != 0) {
                                i4 = a11;
                            } else {
                                i4 = 1;
                            }
                            obj3 = obj4;
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ayjv ayjv14 = (ayjv) da2.f164949b;
                        a8.getClass();
                        if (!ayjv14.f97789k.mo73666a()) {
                            ayjv14.f97789k = GeneratedMessageLite.m124021a(ayjv14.f97789k);
                        }
                        ayjv14.f97789k.add(a8);
                        i3++;
                    } else {
                        String valueOf4 = String.valueOf(obj4.getClass());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 130);
                        sb2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb2.append(valueOf4);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayjw ayjw16 = (ayjw) da.f164949b;
            ayjv ayjv15 = (ayjv) da2.mo74062i();
            ayjv15.getClass();
            ayjw16.f97799c = ayjv15;
            ayjw16.f97797a |= 2;
            return (ayjw) da.mo74062i();
        }
        ayjw.f97798b = 14;
        ayjw.f97797a = 1 | i;
        return (ayjw) da.mo74062i();
    }

    /* renamed from: a */
    public static void m84110a(List list, axos axos, String str, ayjw ayjw) {
        ayjw ayjw2;
        List list2 = list;
        axos axos2 = axos;
        String str2 = str;
        ayjw ayjw3 = ayjw;
        int a = ayju.m84129a(ayjw3.f97798b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        boolean z = false;
        int i2 = 14;
        if (a != 14) {
            ayjv ayjv = ayjw3.f97799c;
            if (ayjv == null) {
                ayjv = ayjv.f97777p;
            }
            if (a == 1) {
                axos2.mo53331a(str2, ayjv.f97780b.getKey());
                return;
            }
            if (a == 11) {
                axos2.f96223a.put(str2, (String[]) ayjv.f97790l.toArray(new String[0]));
            } else if (a == 12) {
                axos2.f96223a.put(str2, bqcr.m112597a(ayjv.f97791m));
            } else if (a == 15) {
                axos2.f96223a.put(str2, bqcl.m112574a(ayjv.f97792n));
            } else if (a == 2) {
                axos2.mo53328a(str2, ayjv.f97781c);
            } else if (a == 3) {
                axos2.mo53323a(str2, ayjv.f97782d);
            } else if (a == 4) {
                axos2.mo53324a(str2, ayjv.f97783e);
            } else if (a == 5) {
                axos2.mo53326a(str2, ayjv.f97784f);
            } else if (a == 6) {
                axos2.mo53325a(str2, ayjv.f97785g);
            } else if (a == 7) {
                axos2.f96223a.put(str2, Byte.valueOf((byte) ayjv.f97786h));
            } else if (a == 8) {
                axos2.mo53330a(str2, ayjv.f97787i);
            } else if (a == 13) {
                axos2.f96223a.put(str2, (Asset) list2.get((int) ayjv.f97793o));
            } else {
                int i3 = 9;
                if (a == 9) {
                    axos axos3 = new axos();
                    bxwc bxwc = ayjv.f97788j;
                    int size = bxwc.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ayjx ayjx = (ayjx) bxwc.get(i4);
                        String str3 = ayjx.f97804b;
                        ayjw ayjw4 = ayjx.f97805c;
                        if (ayjw4 == null) {
                            ayjw4 = ayjw.f97795d;
                        }
                        m84110a(list2, axos3, str3, ayjw4);
                    }
                    axos2.mo53327a(str2, axos3);
                } else if (a == 10) {
                    bxwc bxwc2 = ayjv.f97789k;
                    int size2 = bxwc2.size();
                    int i5 = 0;
                    int i6 = 14;
                    while (true) {
                        String str4 = "null";
                        if (i5 >= size2) {
                            ArrayList arrayList = new ArrayList(ayjv.f97789k.size());
                            bxwc bxwc3 = ayjv.f97789k;
                            int size3 = bxwc3.size();
                            int i7 = 0;
                            while (i7 < size3) {
                                ayjw ayjw5 = (ayjw) bxwc3.get(i7);
                                int a2 = ayju.m84129a(ayjw5.f97798b);
                                if (a2 != 0 && a2 == i2) {
                                    arrayList.add(z);
                                } else if (i6 == i3) {
                                    axos axos4 = new axos();
                                    ayjv ayjv2 = ayjw5.f97799c;
                                    if (ayjv2 == null) {
                                        ayjv2 = ayjv.f97777p;
                                    }
                                    bxwc bxwc4 = ayjv2.f97788j;
                                    int size4 = bxwc4.size();
                                    for (int i8 = 0; i8 < size4; i8++) {
                                        ayjx ayjx2 = (ayjx) bxwc4.get(i8);
                                        String str5 = ayjx2.f97804b;
                                        ayjw ayjw6 = ayjx2.f97805c;
                                        if (ayjw6 == null) {
                                            ayjw6 = ayjw.f97795d;
                                        }
                                        m84110a(list2, axos4, str5, ayjw6);
                                    }
                                    arrayList.add(axos4);
                                } else if (i6 == 2) {
                                    ayjv ayjv3 = ayjw5.f97799c;
                                    if (ayjv3 == null) {
                                        ayjv3 = ayjv.f97777p;
                                    }
                                    arrayList.add(ayjv3.f97781c);
                                } else if (i6 != 6) {
                                    if (i6 != 0) {
                                        str4 = Integer.toString(i6);
                                    }
                                    String valueOf = String.valueOf(str4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                    sb.append("Unexpected typeOfArrayList: ");
                                    sb.append(valueOf);
                                    throw new IllegalArgumentException(sb.toString());
                                } else {
                                    ayjv ayjv4 = ayjw5.f97799c;
                                    if (ayjv4 == null) {
                                        ayjv4 = ayjv.f97777p;
                                    }
                                    arrayList.add(Integer.valueOf(ayjv4.f97785g));
                                }
                                i7++;
                                z = false;
                                i2 = 14;
                                i3 = 9;
                            }
                            if (i6 == 14) {
                                axos2.mo53339c(str2, arrayList);
                                return;
                            } else if (i6 == 9) {
                                axos2.mo53329a(str2, arrayList);
                                return;
                            } else if (i6 == 2) {
                                axos2.mo53339c(str2, arrayList);
                                return;
                            } else if (i6 != 6) {
                                if (i6 != 0) {
                                    str4 = Integer.toString(i6);
                                }
                                String valueOf2 = String.valueOf(str4);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                sb2.append("Unexpected typeOfArrayList: ");
                                sb2.append(valueOf2);
                                throw new IllegalStateException(sb2.toString());
                            } else {
                                axos2.mo53336b(str2, arrayList);
                                return;
                            }
                        } else {
                            ayjw2 = (ayjw) bxwc2.get(i5);
                            if (i6 != 14) {
                                int a3 = ayju.m84129a(ayjw2.f97798b);
                                if (a3 == 0) {
                                    a3 = 1;
                                }
                                if (a3 != i6) {
                                    if (i6 != 0) {
                                        str4 = Integer.toString(i6);
                                    }
                                    String valueOf3 = String.valueOf(str4);
                                    int a4 = ayju.m84129a(ayjw2.f97798b);
                                    if (a4 != 0) {
                                        i = a4;
                                    }
                                    String valueOf4 = String.valueOf(Integer.toString(i));
                                    int length = String.valueOf(str).length();
                                    int length2 = String.valueOf(valueOf3).length();
                                    StringBuilder sb3 = new StringBuilder(length + ErrorInfo.TYPE_SDU_FAILED + length2 + String.valueOf(valueOf4).length());
                                    sb3.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                                    sb3.append(str2);
                                    sb3.append(" contains items of type ");
                                    sb3.append(valueOf3);
                                    sb3.append(" and ");
                                    sb3.append(valueOf4);
                                    throw new IllegalArgumentException(sb3.toString());
                                }
                            } else {
                                int a5 = ayju.m84129a(ayjw2.f97798b);
                                if (a5 == 0 || a5 != 9) {
                                    int a6 = ayju.m84129a(ayjw2.f97798b);
                                    if (a6 == 0 || a6 != 2) {
                                        int a7 = ayju.m84129a(ayjw2.f97798b);
                                        if (a7 != 0) {
                                            if (a7 == 6) {
                                            }
                                        }
                                        int a8 = ayju.m84129a(ayjw2.f97798b);
                                        if (a8 != 0 && a8 == 14) {
                                        }
                                    }
                                }
                                i6 = ayju.m84129a(ayjw2.f97798b);
                                if (i6 == 0) {
                                    i6 = 1;
                                }
                            }
                            i5++;
                            z = false;
                            i2 = 14;
                            i3 = 9;
                        }
                    }
                    int a9 = ayju.m84129a(ayjw2.f97798b);
                    if (a9 != 0) {
                        i = a9;
                    }
                    String valueOf5 = String.valueOf(Integer.toString(i));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 37 + String.valueOf(str).length());
                    sb4.append("Unexpected TypedValue type: ");
                    sb4.append(valueOf5);
                    sb4.append(" for key ");
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                } else {
                    String valueOf6 = String.valueOf(Integer.toString(a));
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 32);
                    sb5.append("populateBundle: unexpected type ");
                    sb5.append(valueOf6);
                    throw new RuntimeException(sb5.toString());
                }
            }
        } else {
            axos2.mo53328a(str2, (String) null);
        }
    }
}
