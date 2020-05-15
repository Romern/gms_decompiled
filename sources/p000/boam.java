package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: boam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class boam extends boan {

    /* renamed from: a */
    private transient boan f132466a;

    /* renamed from: b */
    public final boah f132467b;

    /* renamed from: c */
    public final Character f132468c;

    /* renamed from: g */
    private transient boan f132469g;

    public boam(boah boah, Character ch) {
        bmxy.m108581a(boah);
        this.f132467b = boah;
        boolean z = true;
        if (ch != null && boah.mo68774b(ch.charValue())) {
            z = false;
        }
        bmxy.m108596a(z, "Padding character %s was already in alphabet", ch);
        this.f132468c = ch;
    }

    /* renamed from: a */
    public final int mo68782a(int i) {
        boah boah = this.f132467b;
        return boah.f132458e * bqbr.m112522a(i, boah.f132459f, RoundingMode.CEILING);
    }

    /* renamed from: b */
    public final int mo68786b(int i) {
        return (int) (((((long) this.f132467b.f132457d) * ((long) i)) + 7) / 8);
    }

    /* renamed from: c */
    public final boan mo68788c() {
        boan boan = this.f132469g;
        if (boan == null) {
            boah boah = this.f132467b;
            if (boah.mo68773b()) {
                bmxy.m108601b(!boah.mo68772a(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = new char[boah.f132455b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = boah.f132455b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    char c = cArr2[i];
                    if (bmwb.m108446c(c)) {
                        c ^= ' ';
                    }
                    cArr[i] = (char) c;
                    i++;
                }
                boah = new boah(boah.f132454a.concat(".lowerCase()"), cArr);
            }
            boan = boah != this.f132467b ? mo68780a(boah, this.f132468c) : this;
            this.f132469g = boan;
        }
        return boan;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof boam) {
            boam boam = (boam) obj;
            return this.f132467b.equals(boam.f132467b) && bmxi.m108538a(this.f132468c, boam.f132468c);
        }
    }

    public final int hashCode() {
        return this.f132467b.hashCode() ^ Arrays.hashCode(new Object[]{this.f132468c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f132467b.f132454a);
        if (8 % this.f132467b.f132457d != 0) {
            if (this.f132468c != null) {
                sb.append(".withPadChar('");
                sb.append(this.f132468c);
                sb.append("')");
            } else {
                sb.append(".omitPadding()");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo68779a(byte[] bArr, CharSequence charSequence) {
        boah boah;
        bmxy.m108581a(bArr);
        CharSequence a = mo68785a(charSequence);
        if (this.f132467b.mo68775b(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i < a.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    boah = this.f132467b;
                    if (i3 >= boah.f132458e) {
                        break;
                    }
                    j <<= boah.f132457d;
                    if (i + i3 < a.length()) {
                        j |= (long) this.f132467b.mo68771a(a.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = boah.f132459f;
                int i6 = (i5 * 8) - (i4 * boah.f132457d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                    i7 -= 8;
                    i2++;
                }
                i += this.f132467b.f132458e;
            }
            return i2;
        }
        int length = a.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new boak(sb.toString());
    }

    /* renamed from: b */
    public final boan mo68787b() {
        boan boan = this.f132466a;
        if (boan == null) {
            boah boah = this.f132467b;
            if (boah.mo68772a()) {
                bmxy.m108601b(!boah.mo68773b(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = new char[boah.f132455b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = boah.f132455b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = bmwb.m108441a(cArr2[i]);
                    i++;
                }
                boah = new boah(boah.f132454a.concat(".upperCase()"), cArr);
            }
            boan = boah != this.f132467b ? mo68780a(boah, this.f132468c) : this;
            this.f132466a = boan;
        }
        return boan;
    }

    public boam(String str, String str2, Character ch) {
        this(new boah(str, str2.toCharArray()), ch);
    }

    /* renamed from: a */
    public final boan mo68783a() {
        return this.f132468c != null ? mo68780a(this.f132467b, (Character) null) : this;
    }

    /* renamed from: a */
    public boan mo68780a(boah boah, Character ch) {
        return new boam(boah, ch);
    }

    /* renamed from: a */
    public final boan mo68784a(String str, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            bmxy.m108596a(!this.f132467b.mo68774b(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
        }
        Character ch = this.f132468c;
        if (ch != null) {
            if (str.indexOf(ch.charValue()) < 0) {
                z = true;
            }
            bmxy.m108596a(z, "Separator (%s) cannot contain padding character", str);
        }
        return new boal(this, str, i);
    }

    /* renamed from: a */
    public final CharSequence mo68785a(CharSequence charSequence) {
        bmxy.m108581a(charSequence);
        Character ch = this.f132468c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: a */
    public void mo68781a(Appendable appendable, byte[] bArr, int i) {
        bmxy.m108581a(appendable);
        int i2 = 0;
        bmxy.m108585a(0, i, bArr.length);
        while (i2 < i) {
            mo68790a(appendable, bArr, i2, Math.min(this.f132467b.f132459f, i - i2));
            i2 += this.f132467b.f132459f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68790a(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        bmxy.m108581a(appendable);
        bmxy.m108585a(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.f132467b.f132459f) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.f132467b.f132457d;
        while (i3 < i2 * 8) {
            boah boah = this.f132467b;
            appendable.append(boah.mo68770a(((int) (j >>> (i5 - i3))) & boah.f132456c));
            i3 += this.f132467b.f132457d;
        }
        if (this.f132468c != null) {
            while (i3 < this.f132467b.f132459f * 8) {
                appendable.append(this.f132468c.charValue());
                i3 += this.f132467b.f132457d;
            }
        }
    }
}
