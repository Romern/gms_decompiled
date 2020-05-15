package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: brtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brtm {
    public static final ThreadLocal UTF8_CHARSET = new brtk();

    /* renamed from: bb */
    public ByteBuffer f143329bb;
    public int bb_pos;
    brto utf8 = brto.m114641a();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    protected static int __indirect(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    protected static int __offset(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    protected static String __string(int i, ByteBuffer byteBuffer, brto brto) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i + byteBuffer.getInt(i);
        int i7 = i6 + 4;
        int i8 = byteBuffer.getInt(i6);
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + i7;
            int length = array.length;
            if ((arrayOffset | i8 | ((length - arrayOffset) - i8)) >= 0) {
                int i9 = arrayOffset + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i4 < i9) {
                    byte b = array[i4];
                    if (!brtn.m114636a(b)) {
                        break;
                    }
                    arrayOffset = i4 + 1;
                    brtn.m114635a(b, cArr, i5);
                    i10 = i5 + 1;
                }
                while (i4 < i9) {
                    int i11 = i4 + 1;
                    byte b2 = array[i4];
                    if (brtn.m114636a(b2)) {
                        brtn.m114635a(b2, cArr, i5);
                        i5++;
                        i4 = i11;
                        while (i4 < i9) {
                            byte b3 = array[i4];
                            if (!brtn.m114636a(b3)) {
                                break;
                            }
                            i4++;
                            brtn.m114635a(b3, cArr, i5);
                            i5++;
                        }
                    } else if (!brtn.m114637b(b2)) {
                        if (!brtn.m114638c(b2)) {
                            if (i11 < i9 - 2) {
                                int i12 = i11 + 1;
                                int i13 = i12 + 1;
                                brtn.m114632a(b2, array[i11], array[i12], array[i13], cArr, i5);
                                i5 += 2;
                                i4 = i13 + 1;
                            } else {
                                throw new IllegalArgumentException("Invalid UTF-8");
                            }
                        } else if (i11 < i9 - 1) {
                            int i14 = i11 + 1;
                            brtn.m114633a(b2, array[i11], array[i14], cArr, i5);
                            i4 = i14 + 1;
                            i5++;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (i11 < i9) {
                        i4 = i11 + 1;
                        brtn.m114634a(b2, array[i11], cArr, i5);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i8)));
        } else if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) >= 0) {
            int i15 = i7 + i8;
            char[] cArr2 = new char[i8];
            int i16 = 0;
            while (i2 < i15) {
                byte b4 = byteBuffer.get(i2);
                if (!brtn.m114636a(b4)) {
                    break;
                }
                i7 = i2 + 1;
                brtn.m114635a(b4, cArr2, i3);
                i16 = i3 + 1;
            }
            while (i2 < i15) {
                int i17 = i2 + 1;
                byte b5 = byteBuffer.get(i2);
                if (brtn.m114636a(b5)) {
                    brtn.m114635a(b5, cArr2, i3);
                    i3++;
                    i2 = i17;
                    while (i2 < i15) {
                        byte b6 = byteBuffer.get(i2);
                        if (!brtn.m114636a(b6)) {
                            break;
                        }
                        i2++;
                        brtn.m114635a(b6, cArr2, i3);
                        i3++;
                    }
                } else if (!brtn.m114637b(b5)) {
                    if (!brtn.m114638c(b5)) {
                        if (i17 < i15 - 2) {
                            int i18 = i17 + 1;
                            int i19 = i18 + 1;
                            brtn.m114632a(b5, byteBuffer.get(i17), byteBuffer.get(i18), byteBuffer.get(i19), cArr2, i3);
                            i3 += 2;
                            i2 = i19 + 1;
                        } else {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                    } else if (i17 < i15 - 1) {
                        int i20 = i17 + 1;
                        brtn.m114633a(b5, byteBuffer.get(i17), byteBuffer.get(i20), cArr2, i3);
                        i2 = i20 + 1;
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i17 < i15) {
                    i2 = i17 + 1;
                    brtn.m114634a(b5, byteBuffer.get(i17), cArr2, i3);
                    i3++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr2, 0, i3);
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    protected static brtm __union(brtm brtm, int i, ByteBuffer byteBuffer) {
        brtm.__reset(__indirect(i, byteBuffer), byteBuffer);
        return brtm;
    }

    /* renamed from: a */
    public static int m114589a(brtj brtj, int i, int i2) {
        brtj.mo69885d(2);
        brtj.mo69883c(1, i2);
        brtj.mo69879b(0, i, -1);
        return brtj.mo69886e();
    }

    /* renamed from: b */
    public static int m114592b(brtj brtj, int[] iArr) {
        int length = iArr.length;
        brtj.mo69870a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return brtj.mo69876b();
            }
            brtj.mo69877b(iArr[length]);
        }
    }

    /* renamed from: c */
    public static brtm m114593c(ByteBuffer byteBuffer) {
        brtm brtm = new brtm();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        brtm.__reset(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return brtm;
    }

    protected static int compareStrings(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* renamed from: A */
    public final String mo69892A() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: B */
    public final int mo69893B() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: C */
    public final String mo69894C() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: D */
    public final int mo69895D() {
        int __offset = __offset(24);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: E */
    public final String mo69896E() {
        int __offset = __offset(26);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: F */
    public final int mo69897F() {
        int __offset = __offset(30);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: G */
    public final int mo69898G() {
        int __offset = __offset(32);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: H */
    public final int mo69899H() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: I */
    public final int mo69900I() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: J */
    public final boolean mo69901J() {
        int __offset = __offset(10);
        return (__offset == 0 || this.f143329bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    /* renamed from: K */
    public final int mo69902K() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: L */
    public final int mo69903L() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: M */
    public final int mo69904M() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: N */
    public final brtm mo69905N() {
        brtm brtm = new brtm();
        int __offset = __offset(36);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__offset + this.bb_pos), this.f143329bb);
        return brtm;
    }

    /* renamed from: O */
    public final brtm mo69906O() {
        brtm brtm = new brtm();
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__offset + this.bb_pos), this.f143329bb);
        return brtm;
    }

    /* renamed from: P */
    public String mo9295P() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: Q */
    public int mo9168Q() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    /* renamed from: R */
    public int mo9183R() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return -1;
    }

    /* renamed from: S */
    public int mo9290S() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f143329bb.getInt(__offset + this.bb_pos);
        }
        return 0;
    }

    public void __reset() {
        __reset(0, null);
    }

    public int __vector(int i) {
        int i2 = i + this.bb_pos;
        return i2 + this.f143329bb.getInt(i2) + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.f143329bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i2));
        return order;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i2) {
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i2) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    public int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.f143329bb.getInt(i2 + this.f143329bb.getInt(i2));
    }

    /* renamed from: d */
    public final int mo69923d(int i) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f143329bb.getInt(__vector(__offset) + (i * 4));
        }
        return 0;
    }

    /* renamed from: e */
    public final brtm mo69925e(int i) {
        brtm brtm = new brtm();
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return brtm;
    }

    /* renamed from: f */
    public final brtm mo69927f(int i) {
        brtm brtm = new brtm();
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return brtm;
    }

    public ByteBuffer getByteBuffer() {
        return this.f143329bb;
    }

    /* access modifiers changed from: protected */
    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* renamed from: s */
    public final long mo69929s() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f143329bb.getLong(__offset + this.bb_pos);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new brtl(this, byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    /* renamed from: t */
    public final boolean mo69931t() {
        int __offset = __offset(8);
        return (__offset == 0 || this.f143329bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    /* renamed from: u */
    public final boolean mo69932u() {
        int __offset = __offset(10);
        return (__offset == 0 || this.f143329bb.get(__offset + this.bb_pos) == 0) ? false : true;
    }

    /* renamed from: v */
    public final int mo69933v() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    /* renamed from: w */
    public final djy mo69934w() {
        djy djy = new djy();
        int __offset = __offset(8);
        if (__offset == 0) {
            return null;
        }
        djy.__reset(__indirect(__offset + this.bb_pos), this.f143329bb);
        return djy;
    }

    /* renamed from: x */
    public final long mo69935x() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return this.f143329bb.getLong(__offset + this.bb_pos);
        }
        return -1;
    }

    /* renamed from: y */
    public final String mo69936y() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    /* renamed from: z */
    public final long mo69937z() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return this.f143329bb.getLong(__offset + this.bb_pos);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int __indirect(int i) {
        return i + this.f143329bb.getInt(i);
    }

    public int __offset(int i) {
        if (i < this.vtable_size) {
            return this.f143329bb.getShort(this.vtable_start + i);
        }
        return 0;
    }

    public void __reset(int i, ByteBuffer byteBuffer) {
        short s;
        this.f143329bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
            int i2 = i - byteBuffer.getInt(i);
            this.vtable_start = i2;
            s = this.f143329bb.getShort(i2);
        } else {
            s = 0;
            this.bb_pos = 0;
            this.vtable_start = 0;
        }
        this.vtable_size = s;
    }

    /* access modifiers changed from: protected */
    public brtm __union(brtm brtm, int i) {
        __union(brtm, i, this.f143329bb);
        return brtm;
    }

    /* renamed from: b */
    public final brtm mo69919b(brtm brtm, int i) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return brtm;
    }

    /* renamed from: d */
    public final dmy mo69924d(String str) {
        int __offset = __offset(28);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        ByteBuffer byteBuffer = this.f143329bb;
        byte[] bytes = str.getBytes((Charset) UTF8_CHARSET.get());
        int i = byteBuffer.getInt(__vector - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int __indirect = __indirect(((i2 + i3) * 4) + __vector, byteBuffer);
            int compareStrings = compareStrings(__offset(4, byteBuffer.capacity() - __indirect, byteBuffer), bytes, byteBuffer);
            if (compareStrings > 0) {
                i = i3;
            } else if (compareStrings < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                dmy dmy = new dmy();
                dmy.__reset(__indirect, byteBuffer);
                return dmy;
            }
        }
        return null;
    }

    protected static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    /* renamed from: b */
    public final dnf mo69920b(String str) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return dnf.m8867a(null, __vector(__offset), str, this.f143329bb);
        }
        return null;
    }

    /* renamed from: a */
    public static int m114590a(brtj brtj, int i, int i2, int i3, long j) {
        brtj.mo69885d(4);
        brtj.mo69871a(3, j, -1);
        brtj.mo69883c(2, i3);
        brtj.mo69883c(1, i2);
        brtj.mo69879b(0, i, 0);
        return brtj.mo69886e();
    }

    /* renamed from: c */
    public final brtm mo69921c(brtm brtm, int i) {
        int __offset = __offset(32);
        if (__offset == 0) {
            return null;
        }
        brtm.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return brtm;
    }

    /* renamed from: e */
    public final dng mo69926e(String str) {
        int __offset = __offset(34);
        if (__offset != 0) {
            return dng.m8869a(null, __vector(__offset), str, this.f143329bb);
        }
        return null;
    }

    /* renamed from: c */
    public final dmz mo69922c(String str) {
        int __offset = __offset(24);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        ByteBuffer byteBuffer = this.f143329bb;
        byte[] bytes = str.getBytes((Charset) UTF8_CHARSET.get());
        int i = byteBuffer.getInt(__vector - 4);
        int i2 = 0;
        while (i != 0) {
            int i3 = i / 2;
            int __indirect = __indirect(((i2 + i3) * 4) + __vector, byteBuffer);
            int compareStrings = compareStrings(__offset(4, byteBuffer.capacity() - __indirect, byteBuffer), bytes, byteBuffer);
            if (compareStrings > 0) {
                i = i3;
            } else if (compareStrings < 0) {
                int i4 = i3 + 1;
                i2 += i4;
                i -= i4;
            } else {
                dmz dmz = new dmz();
                dmz.__reset(__indirect, byteBuffer);
                return dmz;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m114591a(brtj brtj, int i) {
        brtj.mo69872a(i, "FTMR");
    }

    /* renamed from: a */
    public final dna mo69917a(dna dna, int i) {
        int __offset = __offset(30);
        if (__offset == 0) {
            return null;
        }
        dna.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        return dna;
    }

    /* renamed from: a */
    public final void mo69918a(dmz dmz, int i) {
        int __offset = __offset(24);
        if (__offset != 0) {
            dmz.__reset(__indirect(__vector(__offset) + (i * 4)), this.f143329bb);
        }
    }

    public String __string(int i) {
        return __string(i, this.f143329bb, this.utf8);
    }
}
