package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: brtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtj {

    /* renamed from: a */
    public ByteBuffer f143315a;

    /* renamed from: b */
    public int f143316b;

    /* renamed from: c */
    int f143317c;

    /* renamed from: d */
    int[] f143318d;

    /* renamed from: e */
    int f143319e;

    /* renamed from: f */
    boolean f143320f;

    /* renamed from: g */
    boolean f143321g;

    /* renamed from: h */
    int f143322h;

    /* renamed from: i */
    int[] f143323i;

    /* renamed from: j */
    int f143324j;

    /* renamed from: k */
    int f143325k;

    /* renamed from: l */
    brth f143326l;

    public brtj() {
        this(1024);
    }

    /* renamed from: a */
    public final int mo69861a() {
        return this.f143315a.capacity() - this.f143316b;
    }

    /* renamed from: b */
    public final int mo69876b() {
        if (this.f143320f) {
            this.f143320f = false;
            mo69867a(this.f143325k);
            return mo69861a();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: c */
    public final void mo69881c() {
        if (!this.f143321g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: d */
    public final void mo69884d() {
        if (this.f143320f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: e */
    public final int mo69886e() {
        int i;
        if (this.f143318d == null || !this.f143320f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        mo69877b(0);
        int a = mo69861a();
        int i2 = this.f143319e - 1;
        while (i2 >= 0 && this.f143318d[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f143318d[i3];
            mo69875a((short) (i4 != 0 ? a - i4 : 0));
        }
        mo69875a((short) (a - this.f143322h));
        int i5 = i2 + 3;
        mo69875a((short) (i5 + i5));
        int i6 = 0;
        loop2:
        while (true) {
            if (i6 >= this.f143324j) {
                i = 0;
                break;
            }
            int capacity = this.f143315a.capacity() - this.f143323i[i6];
            int i7 = this.f143316b;
            short s = this.f143315a.getShort(capacity);
            if (s == this.f143315a.getShort(i7)) {
                int i8 = 2;
                while (i8 < s) {
                    if (this.f143315a.getShort(capacity + i8) == this.f143315a.getShort(i7 + i8)) {
                        i8 += 2;
                    }
                }
                i = this.f143323i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.f143315a.capacity() - a;
            this.f143316b = capacity2;
            this.f143315a.putInt(capacity2, i - a);
        } else {
            int i9 = this.f143324j;
            int[] iArr = this.f143323i;
            if (i9 == iArr.length) {
                this.f143323i = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.f143323i;
            int i10 = this.f143324j;
            this.f143324j = i10 + 1;
            iArr2[i10] = mo69861a();
            ByteBuffer byteBuffer = this.f143315a;
            byteBuffer.putInt(byteBuffer.capacity() - a, mo69861a() - a);
        }
        this.f143320f = false;
        return a;
    }

    /* renamed from: f */
    public final ByteBuffer mo69888f() {
        mo69881c();
        return this.f143315a;
    }

    public brtj(int i) {
        brti brti = brti.f143314a;
        brto.m114641a();
        this.f143317c = 1;
        this.f143318d = null;
        this.f143319e = 0;
        this.f143320f = false;
        this.f143321g = false;
        this.f143323i = new int[16];
        this.f143324j = 0;
        this.f143325k = 0;
        i = i <= 0 ? 1 : i;
        this.f143326l = brti;
        ByteBuffer a = brti.mo69860a(i);
        this.f143315a = a;
        this.f143316b = a.capacity();
    }

    /* renamed from: c */
    public final void mo69882c(int i) {
        mo69869a(4, 0);
        mo69867a((mo69861a() - i) + 4);
    }

    /* renamed from: d */
    public final void mo69885d(int i) {
        mo69884d();
        int[] iArr = this.f143318d;
        if (iArr == null || iArr.length < i) {
            this.f143318d = new int[i];
        }
        this.f143319e = i;
        Arrays.fill(this.f143318d, 0, i, 0);
        this.f143320f = true;
        this.f143322h = mo69861a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brtj.a(int, boolean):void
     arg types: [int, int]
     candidates:
      brtj.a(int, double):void
      brtj.a(int, int):void
      brtj.a(int, java.lang.String):void
      brtj.a(int, short):void
      brtj.a(int, boolean):void */
    /* renamed from: f */
    public final void mo69889f(int i) {
        mo69874a(i, false);
    }

    /* renamed from: a */
    public final int mo69862a(CharSequence charSequence) {
        char c;
        int i;
        int i2;
        char charAt;
        CharSequence charSequence2 = charSequence;
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && charSequence2.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            c = 2048;
            if (i4 >= length) {
                break;
            }
            char charAt2 = charSequence2.charAt(i4);
            if (charAt2 < 2048) {
                i5 += (127 - charAt2) >>> 31;
                i4++;
            } else {
                int length2 = charSequence.length();
                int i6 = 0;
                while (i4 < length2) {
                    char charAt3 = charSequence2.charAt(i4);
                    if (charAt3 < 2048) {
                        i6 += (127 - charAt3) >>> 31;
                    } else {
                        i6 += 2;
                        if (charAt3 >= 55296 && charAt3 <= 57343) {
                            if (Character.codePointAt(charSequence2, i4) >= 65536) {
                                i4++;
                            } else {
                                throw new brtp(i4, length2);
                            }
                        }
                    }
                    i4++;
                }
                i5 += i6;
            }
        }
        if (i5 >= length) {
            mo69865a((byte) 0);
            mo69870a(1, i5, 1);
            ByteBuffer byteBuffer = this.f143315a;
            int i7 = this.f143316b - i5;
            this.f143316b = i7;
            byteBuffer.position(i7);
            ByteBuffer byteBuffer2 = this.f143315a;
            if (byteBuffer2.hasArray()) {
                int arrayOffset = byteBuffer2.arrayOffset();
                byte[] array = byteBuffer2.array();
                int position = byteBuffer2.position() + arrayOffset;
                int remaining = byteBuffer2.remaining();
                int length3 = charSequence.length();
                int i8 = remaining + position;
                while (i3 < length3) {
                    int i9 = i3 + position;
                    if (i9 >= i8 || (charAt = charSequence2.charAt(i3)) >= 128) {
                        break;
                    }
                    array[i9] = (byte) charAt;
                    i3++;
                }
                if (i3 != length3) {
                    i = position + i3;
                    while (i3 < length3) {
                        char charAt4 = charSequence2.charAt(i3);
                        if (charAt4 < 128 && i < i8) {
                            array[i] = (byte) charAt4;
                            i++;
                        } else if (charAt4 < c && i <= i8 - 2) {
                            int i10 = i + 1;
                            array[i] = (byte) ((charAt4 >>> 6) | 960);
                            array[i10] = (byte) ((charAt4 & '?') | 128);
                            i = i10 + 1;
                        } else if ((charAt4 < 55296 || charAt4 > 57343) && i <= i8 - 3) {
                            int i11 = i + 1;
                            array[i] = (byte) ((charAt4 >>> 12) | 480);
                            int i12 = i11 + 1;
                            array[i11] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            array[i12] = (byte) ((charAt4 & '?') | 128);
                            i = i12 + 1;
                        } else if (i <= i8 - 4) {
                            int i13 = i3 + 1;
                            if (i13 != charSequence.length()) {
                                char charAt5 = charSequence2.charAt(i13);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint = Character.toCodePoint(charAt4, charAt5);
                                    int i14 = i + 1;
                                    array[i] = (byte) ((codePoint >>> 18) | 240);
                                    int i15 = i14 + 1;
                                    array[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i16 = i15 + 1;
                                    array[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i = i16 + 1;
                                    array[i16] = (byte) ((codePoint & 63) | 128);
                                    i3 = i13;
                                } else {
                                    i3 = i13;
                                }
                            }
                            throw new brtp(i3 - 1, length3);
                        } else if (charAt4 < 55296 || charAt4 > 57343 || ((i2 = i3 + 1) != charSequence.length() && Character.isSurrogatePair(charAt4, charSequence2.charAt(i2)))) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(charAt4);
                            sb.append(" at index ");
                            sb.append(i);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        } else {
                            throw new brtp(i3, length3);
                        }
                        i3++;
                        c = 2048;
                    }
                } else {
                    i = position + length3;
                }
                byteBuffer2.position(i - arrayOffset);
            } else {
                brto.m114642a(charSequence2, byteBuffer2);
            }
            return mo69876b();
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i5) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public final void mo69877b(int i) {
        mo69869a(4, 0);
        mo69867a(i);
    }

    /* renamed from: b */
    public final void mo69878b(int i, int i2) {
        int capacity = this.f143315a.capacity() - i;
        if (this.f143315a.getShort((capacity - this.f143315a.getInt(capacity)) + i2) == 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("FlatBuffers: field ");
            sb.append(i2);
            sb.append(" must be set");
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo69883c(int i, int i2) {
        if (i2 != 0) {
            mo69882c(i2);
            mo69887e(i);
        }
    }

    /* renamed from: b */
    public final void mo69879b(int i, int i2, int i3) {
        if (i2 != i3) {
            mo69877b(i2);
            mo69887e(i);
        }
    }

    /* renamed from: b */
    public final void mo69880b(int i, boolean z) {
        if (z) {
            mo69869a(1, 0);
            ByteBuffer byteBuffer = this.f143315a;
            int i2 = this.f143316b - 1;
            this.f143316b = i2;
            byteBuffer.put(i2, (byte) 1);
            mo69887e(i);
        }
    }

    /* renamed from: e */
    public final void mo69887e(int i) {
        this.f143318d[i] = mo69861a();
    }

    /* renamed from: a */
    public final int mo69863a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo69865a((byte) 0);
        mo69870a(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f143315a;
        int i = this.f143316b - remaining;
        this.f143316b = i;
        byteBuffer2.position(i);
        this.f143315a.put(byteBuffer);
        return mo69876b();
    }

    /* renamed from: a */
    public final int mo69864a(byte[] bArr) {
        int length = bArr.length;
        mo69870a(1, length, 1);
        ByteBuffer byteBuffer = this.f143315a;
        int i = this.f143316b - length;
        this.f143316b = i;
        byteBuffer.position(i);
        this.f143315a.put(bArr);
        return mo69876b();
    }

    /* renamed from: a */
    public final void mo69865a(byte b) {
        mo69869a(1, 0);
        ByteBuffer byteBuffer = this.f143315a;
        int i = this.f143316b - 1;
        this.f143316b = i;
        byteBuffer.put(i, b);
    }

    /* renamed from: a */
    public final void mo69866a(float f) {
        mo69869a(4, 0);
        ByteBuffer byteBuffer = this.f143315a;
        int i = this.f143316b - 4;
        this.f143316b = i;
        byteBuffer.putFloat(i, f);
    }

    /* renamed from: a */
    public final void mo69867a(int i) {
        ByteBuffer byteBuffer = this.f143315a;
        int i2 = this.f143316b - 4;
        this.f143316b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* renamed from: a */
    public final void mo69868a(int i, double d) {
        if (d != 0.0d) {
            mo69869a(8, 0);
            ByteBuffer byteBuffer = this.f143315a;
            int i2 = this.f143316b - 8;
            this.f143316b = i2;
            byteBuffer.putDouble(i2, d);
            mo69887e(i);
        }
    }

    /* renamed from: a */
    public final void mo69869a(int i, int i2) {
        int i3;
        if (i > this.f143317c) {
            this.f143317c = i;
        }
        int capacity = ((((this.f143315a.capacity() - this.f143316b) + i2) ^ -1) + 1) & (i - 1);
        while (this.f143316b < capacity + i + i2) {
            int capacity2 = this.f143315a.capacity();
            ByteBuffer byteBuffer = this.f143315a;
            brth brth = this.f143326l;
            int capacity3 = byteBuffer.capacity();
            if ((-1073741824 & capacity3) == 0) {
                if (capacity3 != 0) {
                    i3 = capacity3 + capacity3;
                } else {
                    i3 = 1;
                }
                byteBuffer.position(0);
                ByteBuffer a = brth.mo69860a(i3);
                a.position(a.clear().capacity() - capacity3);
                a.put(byteBuffer);
                this.f143315a = a;
                this.f143316b += a.capacity() - capacity2;
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        for (int i4 = 0; i4 < capacity; i4++) {
            ByteBuffer byteBuffer2 = this.f143315a;
            int i5 = this.f143316b - 1;
            this.f143316b = i5;
            byteBuffer2.put(i5, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo69870a(int i, int i2, int i3) {
        mo69884d();
        this.f143325k = i2;
        int i4 = i * i2;
        mo69869a(4, i4);
        mo69869a(i3, i4);
        this.f143320f = true;
    }

    /* renamed from: a */
    public final void mo69871a(int i, long j, long j2) {
        if (j != j2) {
            mo69869a(8, 0);
            ByteBuffer byteBuffer = this.f143315a;
            int i2 = this.f143316b - 8;
            this.f143316b = i2;
            byteBuffer.putLong(i2, j);
            mo69887e(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: brtj.a(int, boolean):void
     arg types: [int, int]
     candidates:
      brtj.a(int, double):void
      brtj.a(int, int):void
      brtj.a(int, java.lang.String):void
      brtj.a(int, short):void
      brtj.a(int, boolean):void */
    /* renamed from: a */
    public final void mo69872a(int i, String str) {
        mo69869a(this.f143317c, 8);
        if (str.length() == 4) {
            for (int i2 = 3; i2 >= 0; i2--) {
                mo69865a((byte) str.charAt(i2));
            }
            mo69874a(i, false);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* renamed from: a */
    public final void mo69873a(int i, short s) {
        if (s != 0) {
            mo69875a(s);
            mo69887e(i);
        }
    }

    /* renamed from: a */
    public final void mo69874a(int i, boolean z) {
        int i2;
        int i3 = this.f143317c;
        if (!z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        mo69869a(i3, i2 + 4);
        mo69882c(i);
        if (z) {
            mo69877b(this.f143315a.capacity() - this.f143316b);
        }
        this.f143315a.position(this.f143316b);
        this.f143321g = true;
    }

    /* renamed from: a */
    public final void mo69875a(short s) {
        mo69869a(2, 0);
        ByteBuffer byteBuffer = this.f143315a;
        int i = this.f143316b - 2;
        this.f143316b = i;
        byteBuffer.putShort(i, s);
    }
}
