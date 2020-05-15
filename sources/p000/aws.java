package p000;

import java.io.PushbackReader;
import java.io.Reader;

/* renamed from: aws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aws extends PushbackReader {

    /* renamed from: a */
    private int f2454a = 0;

    /* renamed from: b */
    private int f2455b = 0;

    /* renamed from: c */
    private int f2456c = 0;

    public aws(Reader reader) {
        super(reader, 8);
    }

    public final int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        int i3 = 1;
        int i4 = i;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        while (z && i5 < i2) {
            if (super.read(cArr2, i6, i3) == i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                char c = cArr2[i6];
                int i7 = this.f2454a;
                if (i7 != 0) {
                    if (i7 != i3) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    this.f2454a = 0;
                                    i3 = 1;
                                    i7 = 0;
                                } else if (c >= '0' && c <= '9') {
                                    this.f2455b = (this.f2455b * 10) + Character.digit(c, 10);
                                    int i8 = this.f2456c + 1;
                                    this.f2456c = i8;
                                    if (i8 <= 5) {
                                        this.f2454a = 4;
                                        i3 = 1;
                                        i7 = 4;
                                    } else {
                                        this.f2454a = 5;
                                        i3 = 1;
                                        i7 = 5;
                                    }
                                } else if (c != ';' || !awy.m2307a((char) this.f2455b)) {
                                    this.f2454a = 5;
                                    i3 = 1;
                                    i7 = 5;
                                } else {
                                    this.f2454a = 0;
                                    c = (char) this.f2455b;
                                    i3 = 1;
                                    i7 = 0;
                                }
                            } else if ((c >= '0' && c <= '9') || ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                                this.f2455b = (this.f2455b * 16) + Character.digit(c, 16);
                                int i9 = this.f2456c + 1;
                                this.f2456c = i9;
                                if (i9 <= 4) {
                                    this.f2454a = 3;
                                    i3 = 1;
                                    i7 = 3;
                                } else {
                                    this.f2454a = 5;
                                    i3 = 1;
                                    i7 = 5;
                                }
                            } else if (c == ';' && awy.m2307a((char) this.f2455b)) {
                                this.f2454a = 0;
                                c = (char) this.f2455b;
                                i3 = 1;
                                i7 = 0;
                            }
                        } else if (c == 'x') {
                            this.f2455b = 0;
                            this.f2456c = 0;
                            this.f2454a = 3;
                            i3 = 1;
                            i7 = 3;
                        } else if (c >= '0' && c <= '9') {
                            this.f2455b = Character.digit(c, 10);
                            this.f2456c = 1;
                            this.f2454a = 4;
                            i3 = 1;
                            i7 = 4;
                        }
                        this.f2454a = 5;
                        i3 = 1;
                        i7 = 5;
                    } else if (c == '#') {
                        this.f2454a = 2;
                        i3 = 1;
                        i7 = 2;
                    } else {
                        this.f2454a = 5;
                        i3 = 1;
                        i7 = 5;
                    }
                } else if (c == '&') {
                    i3 = 1;
                    this.f2454a = 1;
                    i7 = 1;
                } else {
                    i3 = 1;
                }
                if (i7 == 0) {
                    if (awy.m2307a(c)) {
                        c = ' ';
                    }
                    cArr[i4] = c;
                    i5++;
                    i4++;
                    i6 = 0;
                } else {
                    i6++;
                    if (i7 == 5) {
                        unread(cArr2, 0, i6);
                        i6 = 0;
                    }
                }
            } else if (i6 > 0) {
                unread(cArr2, 0, i6);
                this.f2454a = 5;
                z = true;
                i6 = 0;
            }
        }
        if (i5 > 0 || z) {
            return i5;
        }
        return -1;
    }
}
