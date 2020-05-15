package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: boai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boai extends boam {

    /* renamed from: a */
    final char[] f132462a = new char[512];

    public boai(boah boah) {
        super(boah, null);
        boolean z;
        if (boah.f132455b.length == 16) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        for (int i = 0; i < 256; i++) {
            this.f132462a[i] = boah.mo68770a(i >>> 4);
            this.f132462a[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = boah.mo68770a(i & 15);
        }
    }

    /* renamed from: a */
    public final int mo68779a(byte[] bArr, CharSequence charSequence) {
        bmxy.m108581a(bArr);
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f132467b.mo68771a(charSequence.charAt(i)) << 4) | this.f132467b.mo68771a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new boak(sb.toString());
    }

    /* renamed from: a */
    public final boan mo68780a(boah boah, Character ch) {
        return new boai(boah);
    }

    /* renamed from: a */
    public final void mo68781a(Appendable appendable, byte[] bArr, int i) {
        bmxy.m108581a(appendable);
        bmxy.m108585a(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            appendable.append(this.f132462a[b]);
            appendable.append(this.f132462a[b | 256]);
        }
    }
}
