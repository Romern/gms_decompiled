package p000;

import java.util.Arrays;

/* renamed from: bjxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxf {

    /* renamed from: a */
    public static final byte[] f123563a = {9, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f123564b = {6, 12};

    /* renamed from: c */
    public final byte[] f123565c;

    /* renamed from: d */
    public final byte f123566d;

    /* renamed from: e */
    public final byte f123567e;

    public bjxf(byte[] bArr) {
        int length = bArr.length;
        int i = length - 2;
        this.f123565c = Arrays.copyOfRange(bArr, 0, i);
        this.f123566d = bArr[i];
        this.f123567e = bArr[length - 1];
    }
}
