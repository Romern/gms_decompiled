package p000;

/* renamed from: boaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boaj extends boam {
    private boaj(boah boah, Character ch) {
        super(boah, ch);
        boolean z;
        if (boah.f132455b.length == 64) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
    }

    /* renamed from: a */
    public final int mo68779a(byte[] bArr, CharSequence charSequence) {
        bmxy.m108581a(bArr);
        CharSequence a = mo68785a(charSequence);
        if (this.f132467b.mo68775b(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i < a.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int a2 = (this.f132467b.mo68771a(a.charAt(i)) << 18) | (this.f132467b.mo68771a(a.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (a2 >>> 16);
                if (i4 < a.length()) {
                    int i6 = i4 + 1;
                    int a3 = a2 | (this.f132467b.mo68771a(a.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((a3 >>> 8) & 255);
                    if (i6 < a.length()) {
                        bArr[i7] = (byte) ((a3 | this.f132467b.mo68771a(a.charAt(i6))) & 255);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        int length = a.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new boak(sb.toString());
    }

    public boaj(String str, String str2, Character ch) {
        this(new boah(str, str2.toCharArray()), ch);
    }

    /* renamed from: a */
    public final boan mo68780a(boah boah, Character ch) {
        return new boaj(boah, ch);
    }

    /* renamed from: a */
    public final void mo68781a(Appendable appendable, byte[] bArr, int i) {
        bmxy.m108581a(appendable);
        int i2 = 0;
        bmxy.m108585a(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.f132467b.mo68770a(b >>> 18));
            appendable.append(this.f132467b.mo68770a((b >>> 12) & 63));
            appendable.append(this.f132467b.mo68770a((b >>> 6) & 63));
            appendable.append(this.f132467b.mo68770a(b & 63));
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            mo68790a(appendable, bArr, i2, i - i2);
        }
    }
}
