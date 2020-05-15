package p000;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: cars */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cars {

    /* renamed from: a */
    static caof f175697a = null;

    /* renamed from: a */
    public static synchronized carr m127065a(carp carp, caof caof) {
        int i;
        byte[] bArr;
        int i2;
        carp carp2 = carp;
        synchronized (cars.class) {
            f175697a = caof;
            if (caof != null) {
                if (!(carp2.f175689a == 0 || carp.mo74794a() == null || !carp.mo74794a().mo74839a())) {
                    byte[] bArr2 = new byte[4];
                    catg.m127157a(bArr2, carp2.f175689a);
                    int i3 = carp2.f175690b;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    } else if (i4 != 0) {
                        f175697a.mo74721b();
                        carr carr = new carr(4, null);
                        return carr;
                    } else {
                        caro caro = r12;
                        caro caro2 = new caro(new byte[6], new byte[6], new byte[2], new byte[5], new byte[2], new byte[3], new byte[]{0}, bArr2);
                        caru a = f175697a.mo74717a(caro);
                        if (a == null) {
                            i = 3;
                        } else if (a.f175704g.f175623d != Byte.MIN_VALUE) {
                            i = 5;
                        } else if (a.f175700c[0] <= 9) {
                            byte[] bArr3 = a.f175702e;
                            byte b = bArr3[0];
                            byte b2 = bArr3[1];
                            byte b3 = bArr3[2];
                            i = !new cate(((((b & 240) >> 4) * 10) + (b & 15)) + 2000, (((b2 & 240) >> 4) * 10) + (b2 & 15), (((b3 & 240) >> 4) * 10) + (b3 & 15)).mo74839a() ? 4 : 1;
                        } else {
                            i = 4;
                        }
                        if (i == 1) {
                            String replaceAll = catg.m127164b(a.f175699b).replaceAll("F", "");
                            catg.m127164b(a.f175698a).replaceAll("F", "");
                            if (carp2.f175690b != 1) {
                                LinkedList linkedList = new LinkedList();
                                byte[] bArr4 = a.f175703f ? new byte[]{1, 0, 2} : new byte[]{63, 0, 2};
                                linkedList.add(cath.m127170a(new byte[]{-97, 38}, a.f175704g.f175622c));
                                linkedList.add(cath.m127170a(new byte[]{-97, 16}, a.f175704g.f175621b));
                                linkedList.add(cath.m127170a(new byte[]{-97, 54}, a.f175704g.f175620a));
                                linkedList.add(cath.m127170a(new byte[]{-107}, caro.f175683d));
                                linkedList.add(cath.m127170a(new byte[]{-97, 39}, new byte[]{a.f175704g.f175623d}));
                                linkedList.add(cath.m127170a(new byte[]{-97, 52}, bArr4));
                                linkedList.add(cath.m127170a(new byte[]{-97, 55}, caro.f175687h));
                                linkedList.add(cath.m127170a(new byte[]{-97, 2}, caro.f175680a));
                                linkedList.add(cath.m127170a(new byte[]{-97, 3}, caro.f175681b));
                                linkedList.add(cath.m127170a(new byte[]{95, 42}, caro.f175684e));
                                linkedList.add(cath.m127170a(new byte[]{-102}, caro.f175685f));
                                linkedList.add(cath.m127170a(new byte[]{-100}, caro.f175686g));
                                linkedList.add(cath.m127170a(new byte[]{90}, a.f175699b));
                                linkedList.add(cath.m127170a(new byte[]{95, 52}, a.f175700c));
                                linkedList.add(cath.m127170a(new byte[]{95, 36}, a.f175702e));
                                linkedList.add(cath.m127170a(new byte[]{-97, 26}, caro.f175682c));
                                linkedList.add(cath.m127170a(new byte[]{-126}, a.f175701d));
                                bArr = catg.m127161a(linkedList);
                            } else {
                                byte b4 = a.f175700c[0];
                                caqv caqv = a.f175704g;
                                byte[] bArr5 = new byte[4];
                                catg.m127157a(bArr5, carp2.f175689a);
                                byte[] copyOfRange = Arrays.copyOfRange(caqv.f175621b, 0, 2);
                                LinkedList linkedList2 = new LinkedList();
                                linkedList2.add(new byte[]{(byte) (b4 & 15)});
                                linkedList2.add(Arrays.copyOfRange(caqv.f175621b, 11, 15));
                                linkedList2.add(Arrays.copyOfRange(caqv.f175622c, 4, 8));
                                linkedList2.add(Arrays.copyOfRange(caqv.f175620a, 0, 2));
                                linkedList2.add(bArr5);
                                linkedList2.add(a.f175701d);
                                linkedList2.add(copyOfRange);
                                byte[] a2 = catg.m127161a(linkedList2);
                                String str = new String(boan.f132470d.mo68794a(a2));
                                catg.m127165b(linkedList2);
                                catg.m127166c(a2);
                                bArr = str.getBytes();
                            }
                            byte[] bArr6 = a.f175704g.f175620a;
                            int length = bArr6.length;
                            if (length < 4) {
                                byte[] bArr7 = {0, 0, 0, 0};
                                System.arraycopy(bArr6, 0, bArr7, 4 - length, length);
                                bArr6 = bArr7;
                            }
                            byte b5 = bArr6[0];
                            byte b6 = bArr6[1];
                            byte b7 = bArr6[2];
                            byte b8 = bArr6[3];
                            byte b9 = a.f175700c[0];
                            byte[] bArr8 = a.f175702e;
                            int b10 = catg.m127163b(bArr8[0]);
                            int b11 = catg.m127163b(bArr8[1]);
                            if (bArr8.length == 3) {
                                i2 = catg.m127163b(bArr8[2]);
                            } else {
                                i2 = 1;
                            }
                            carr carr2 = new carr(1, new carq(replaceAll, new cate(b10, b11, i2), bArr));
                            return carr2;
                        }
                        carr carr3 = new carr(i, null);
                        return carr3;
                    }
                }
            }
            f175697a.mo74721b();
            carr carr4 = new carr(4, null);
            return carr4;
        }
    }
}
