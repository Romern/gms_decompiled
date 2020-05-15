package p000;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bqwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwx {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqwx.a(bobl, boolean):byte[]
     arg types: [bobl, int]
     candidates:
      bqwx.a(bobl, int):java.nio.ByteBuffer
      bqwx.a(bobl, boolean):byte[] */
    /* renamed from: a */
    public static bqwu m113581a(bobl bobl, bqwu bqwu, bqxe bqxe) {
        boolean z;
        boolean z2;
        int intValue;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        short readShort = bobl.readShort();
        int i = 0;
        boolean z7 = (readShort & 4096) != 0;
        short s = readShort & 4095;
        bqwt bqwt = (bqwt) bqwt.f141783r.get(Short.valueOf((short) s));
        bmxy.m108586a(bqwt, "Unknown chunk type: %s", s);
        int ordinal = bqwt.ordinal();
        if (ordinal == 1) {
            bmxy.m108600b(z7);
            bqxb bqxb = new bqxb(bobl, bqwu);
            int[] iArr = new int[bqxb.f141907e];
            bqxa bqxa = new bqxa(bobl, bqxb.mo69444d().f141882c);
            TreeSet<Integer> treeSet = new TreeSet();
            int nextSetBit = bqxe.f141801a.nextSetBit(0);
            while (nextSetBit >= 0) {
                treeSet.add(Integer.valueOf(nextSetBit));
                nextSetBit = bqxe.f141801a.nextSetBit(nextSetBit + 1);
            }
            int i2 = 0;
            for (Integer num : treeSet) {
                int intValue2 = num.intValue();
                bqxa.mo69405a(intValue2 - i2);
                while (i2 < intValue2) {
                    iArr[i2] = -1;
                    i2++;
                }
                if (i2 == intValue2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bmxy.m108600b(z3);
                List list = bqxb.f141909g;
                bqxa.mo69404a();
                short s2 = bqxa.f141797c.getShort();
                String str = new String(bqxa.f141797c.array(), bqxa.f141797c.position(), s2, bqxa.f141796b);
                ByteBuffer byteBuffer = bqxa.f141797c;
                byteBuffer.position(byteBuffer.position() + s2);
                list.add(str);
                iArr[i2] = bqxb.f141909g.size() - 1;
                i2++;
            }
            bqxa.mo69405a(bqxb.f141907e - i2);
            bmxy.m108600b(!bqxa.f141797c.hasRemaining());
            if (bqxa.f141795a.readInt() == 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            while (i2 < bqxb.f141907e) {
                iArr[i2] = -1;
                i2++;
            }
            byte[] bArr = new byte[bobl.readInt()];
            boav.m111017a(bobl, bArr);
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            int i3 = 0;
            while (it.hasNext() && (intValue = ((Integer) it.next()).intValue()) < bqxb.f141908f) {
                for (int i4 = intValue - i3; i4 > 0; i4--) {
                    bqxq.m113687a(order, bqxb);
                }
                arrayList.add(bqxq.m113687a(order, bqxb));
                i3 = intValue + 1;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                bqxq bqxq = (bqxq) arrayList.get(i5);
                ArrayList arrayList3 = new ArrayList(bqxq.mo69383a().size());
                for (bqxp bqxp : bqxq.mo69383a()) {
                    int i6 = iArr[bqxp.mo69377a()];
                    if (i6 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bmxy.m108588a(z2);
                    arrayList3.add(new bqwq(i6, bqxp.mo69378b(), bqxp.mo69379c(), bqxp.mo69380d()));
                }
                arrayList2.add(bqxq.m113688a(Collections.unmodifiableList(arrayList3)));
            }
            bqxb.f141910h = arrayList2;
            return bqxb;
        } else if (ordinal != 2) {
            switch (ordinal) {
                case 10:
                    bmxy.m108600b(z7);
                    bqwy bqwy = new bqwy(bobl, bqwu);
                    bobl.readInt();
                    bqwy.f141791f = m113585a(bobl, false);
                    bqwy.f141792g = m113585a(bobl, false);
                    List list2 = bqxe.f141802b;
                    int size2 = list2.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        int intValue3 = ((Integer) list2.get(i8)).intValue();
                        if (intValue3 >= i7) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bmxy.m108600b(z4);
                        int i9 = intValue3 - i7;
                        while (i9 > 0) {
                            i9 -= bobl.skipBytes(i9);
                        }
                        bqwu a = m113581a(bobl, bqwy, bqxe);
                        bqwy.f141790e.put(Integer.valueOf(bqwy.f141789d + bqwy.f141787b + intValue3), a);
                        i7 = a.f141788c + intValue3;
                    }
                    return bqwy;
                case 11:
                    if (z7) {
                        bqxc bqxc = new bqxc(bobl, bqwu);
                        byte[] bArr2 = new byte[(bqxc.f141788c - bqxc.f141787b)];
                        boav.m111017a(bobl, bArr2);
                        ByteBuffer order2 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                        int i10 = order2.getInt();
                        int a2 = btue.m117147a(order2);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < a2; i11++) {
                            arrayList4.add(Integer.valueOf(btue.m117147a(order2)));
                        }
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        while (i12 < arrayList4.size()) {
                            int intValue4 = ((Integer) arrayList4.get(i12)).intValue();
                            if (intValue4 == -3) {
                                i12++;
                                intValue4 = ((Integer) arrayList4.get(i12)).intValue();
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (intValue4 != 0) {
                                if (intValue4 == -2) {
                                    intValue4 = 0;
                                }
                                i12++;
                                if (i12 < arrayList4.size()) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                bmxy.m108600b(z6);
                                i14 += ((Integer) arrayList4.get(i12)).intValue();
                                bqxm d = bqxo.m113677d();
                                d.mo69435a(intValue4);
                                d.mo69437b(8);
                                d.mo69436a(!z5 ? bqxn.STRING : bqxn.REFERENCE);
                                bqxo a3 = d.mo69434a();
                                bqxs i15 = bqxt.m113705i();
                                i15.mo69446a(i10);
                                i15.mo69447b(8);
                                i15.mo69448c(i14);
                                i15.f141914c = bqxc;
                                i15.mo69450e(i13);
                                i15.f141912a = a3;
                                i15.mo69449d(0);
                                i15.f141913b = new LinkedHashMap();
                                bqxt a4 = i15.mo69445a();
                                Map map = bqxc.f141922g;
                                Integer valueOf = Integer.valueOf(i13);
                                bmxy.m108600b(!map.containsKey(valueOf));
                                bqxc.f141922g.put(valueOf, a4);
                            }
                            i13++;
                            i12++;
                        }
                        return bqxc;
                    }
                    ByteBuffer a5 = m113582a(bobl);
                    bqxu bqxu = new bqxu(a5, bqwu);
                    int i16 = bqxu.f141789d + bqxu.f141921f;
                    if (!bqxu.mo69454d()) {
                        while (i < bqxu.f141920e) {
                            int i17 = a5.getInt();
                            if (i17 != -1) {
                                bqxu.f141922g.put(Integer.valueOf(i), bqxt.m113704a(a5, i17 + i16, bqxu, i));
                            }
                            i++;
                        }
                        return bqxu;
                    }
                    while (i < bqxu.f141920e) {
                        char c = (char) a5.getShort();
                        bqxu.f141922g.put(Integer.valueOf(c), bqxt.m113704a(a5, (((char) a5.getShort()) * 4) + i16, bqxu, c));
                        i++;
                    }
                    return bqxu;
                case 12:
                    bmxy.m108600b(!z7);
                    return new bqxd(bobl, bqwu);
                default:
                    throw new IllegalStateException("We don't support compressed XML resources yet");
            }
        } else {
            bmxy.m108600b(z7);
            bqwz bqwz = new bqwz(bobl, bqwu);
            Map map2 = bqwz.f141790e;
            int readInt = bobl.readInt();
            while (i < readInt) {
                map2.put(Integer.valueOf(bqwz.f141789d + i), m113581a(bobl, bqwz, bqxe));
                i++;
            }
            bqwz.f141884g.clear();
            for (bqwu bqwu2 : bqwz.f141790e.values()) {
                if (bqwu2 instanceof bqxf) {
                    bqxf bqxf = (bqxf) bqwu2;
                    bqwz.f141884g.put(bqxf.f141806h, bqxf);
                } else if (bqwu2 instanceof bqxr) {
                    bqwz.f141883f = (bqxr) bqwu2;
                }
            }
            bmxy.m108582a(bqwz.f141883f, "ResourceTableChunk must have a string pool.");
            return bqwz;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.copyOf(byte[], int):byte[]}
     arg types: [byte[], short]
     candidates:
      ClspMth{java.util.Arrays.copyOf(float[], int):float[]}
      ClspMth{java.util.Arrays.copyOf(boolean[], int):boolean[]}
      ClspMth{java.util.Arrays.copyOf(long[], int):long[]}
      ClspMth{java.util.Arrays.copyOf(char[], int):char[]}
      ClspMth{java.util.Arrays.copyOf(short[], int):short[]}
      ClspMth{java.util.Arrays.copyOf(int[], int):int[]}
      MutableMD:<T>:(java.lang.Object[], int):java.lang.Object[]
      ClspMth{java.util.Arrays.copyOf(double[], int):double[]}
      ClspMth{java.util.Arrays.copyOf(byte[], int):byte[]} */
    /* renamed from: b */
    static ByteBuffer m113586b(bobl bobl) {
        byte[] bArr = new byte[6];
        boav.m111017a(bobl, bArr);
        short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
        byte[] copyOf = Arrays.copyOf(bArr, (int) s);
        boav.m111018a(bobl, copyOf, 6, s - 8);
        return ByteBuffer.wrap(copyOf).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqwx.a(bobl, boolean):byte[]
     arg types: [bobl, int]
     candidates:
      bqwx.a(bobl, int):java.nio.ByteBuffer
      bqwx.a(bobl, boolean):byte[] */
    /* renamed from: a */
    static ByteBuffer m113582a(bobl bobl) {
        return ByteBuffer.wrap(m113585a(bobl, true)).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    static ByteBuffer m113583a(bobl bobl, int i) {
        byte[] bArr = new byte[i];
        boav.m111017a(bobl, bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    static Map m113584a(DataOutput dataOutput, Collection collection, boolean z) {
        if (z) {
            dataOutput.writeInt(collection.size());
        }
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bqwu bqwu = (bqwu) it.next();
            byte[] c = bqwu.mo69399c();
            dataOutput.write(c);
            bqwu.m113573a(dataOutput, c.length);
            hashMap.put(bqwu, Integer.valueOf(i));
            i++;
        }
        return hashMap;
    }

    /* renamed from: a */
    static byte[] m113585a(bobl bobl, boolean z) {
        int i;
        if (!z) {
            i = 8;
        } else {
            i = 6;
        }
        byte[] bArr = new byte[i];
        boav.m111017a(bobl, bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i2 = 0; i2 < i - 4; i2++) {
            order.get();
        }
        int i3 = order.getInt();
        byte[] copyOf = Arrays.copyOf(bArr, z ? i3 - 2 : i3);
        boav.m111018a(bobl, copyOf, i, i3 - 8);
        return copyOf;
    }
}
