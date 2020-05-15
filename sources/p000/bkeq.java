package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: bkeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkeq implements InputFilter {

    /* renamed from: a */
    public bmnl f124099a;

    /* renamed from: b */
    public Pattern f124100b;

    /* renamed from: c */
    public Character f124101c;

    public bkeq(bmnl bmnl) {
        String[] strArr = {bmnl.f130123e, bmnl.f130121c, bmnl.f130124f};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < 3; i2++) {
                    if (i != i2 && !TextUtils.isEmpty(strArr[i2]) && str.contains(strArr[i2])) {
                        throw new IllegalArgumentException(String.format("Symbols for units, decimal, and groups should be distinguishable: %s", bmnl));
                    }
                }
                continue;
            }
        }
        if (m105449b(bmnl.f130123e) || m105449b(bmnl.f130121c) || m105449b(bmnl.f130124f)) {
            throw new IllegalArgumentException(String.format("Symbols for units, decimal, and groups can't contain digits: %s", bmnl));
        } else if (bmnl.f130120b > 0 && bmnl.f130123e.isEmpty()) {
            throw new IllegalArgumentException("Decimal symbol must be provided if max precision is greater than 0");
        } else if (!bmnl.f130123e.isEmpty() && bmnl.f130123e.length() > 1) {
            throw new IllegalArgumentException("Decimal symbol should only be a single character or user cannot enter it.");
        } else if (bmnl.f130119a <= 0 && bmnl.f130120b <= 0) {
            throw new IllegalArgumentException("No value can be collected if both maxMagnitude or maxPrecision <= 0");
        } else {
            bxvt bxvt = bmnl.f130125g;
            int size = bxvt.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                if (((Integer) bxvt.get(i3)).intValue() > 0) {
                    i3 = i4;
                } else {
                    throw new IllegalArgumentException("Group lengths must be positive/non-zero.");
                }
            }
            if (bmnl.f130125g.size() <= 0 || !bmnl.f130124f.isEmpty()) {
                this.f124099a = bmnl;
                if (!bmnl.f130123e.isEmpty()) {
                    this.f124101c = Character.valueOf(bmnl.f130123e.charAt(0));
                    this.f124100b = Pattern.compile(Pattern.quote(bmnl.f130123e));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Group separator symbol must be provided if group lengths are specified");
        }
    }

    /* renamed from: b */
    private static boolean m105449b(CharSequence charSequence) {
        return !TextUtils.isEmpty(bjyz.m104951a(charSequence));
    }

    /* renamed from: a */
    public final String mo65914a(CharSequence charSequence) {
        String str;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        String[] a = bjyz.m104955a(charSequence, this.f124100b);
        int i = 0;
        String str2 = a[0];
        bmnl bmnl = this.f124099a;
        String a2 = bjyz.m104952a(str2, bmnl.f130121c, bmnl.f130122d);
        String str3 = a[1];
        String a3 = bjyz.m104953a(a2, this.f124099a.f130119a);
        if (this.f124099a.f130125g.size() > 0) {
            bmnl bmnl2 = this.f124099a;
            str = bjyz.m104954a(a3, bmnl2.f130125g, 0, bmnl2.f130124f);
        } else {
            str = a3;
        }
        StringBuilder sb = new StringBuilder(str);
        if (this.f124099a.f130120b > 0 && str3 != null) {
            if (TextUtils.isEmpty(a3)) {
                sb.append('0');
            }
            bmnl bmnl3 = this.f124099a;
            String str4 = bmnl3.f130123e;
            int i2 = bmnl3.f130120b;
            String valueOf = String.valueOf(str4);
            String valueOf2 = String.valueOf(bjyz.m104953a(str3, i2));
            sb.append(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        }
        if (sb.length() > 0) {
            if (!this.f124099a.f130122d) {
                i = sb.length();
            }
            sb.insert(i, this.f124099a.f130121c);
        }
        return sb.toString();
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i2 - i != 1) {
            return null;
        }
        Character valueOf = Character.valueOf(charSequence.charAt(i));
        if (!mo65915a(valueOf)) {
            return "";
        }
        CharSequence subSequence = spanned.subSequence(0, i3);
        if (this.f124101c != null) {
            String charSequence2 = subSequence.toString();
            int indexOf = charSequence2.indexOf(this.f124101c.charValue());
            if (!valueOf.equals(this.f124101c)) {
                if (indexOf >= 0) {
                    if (bjyz.m104951a(charSequence2.substring(indexOf)).length() >= this.f124099a.f130120b) {
                        return "";
                    }
                    return null;
                }
            } else if (indexOf >= 0) {
                return "";
            } else {
                return null;
            }
        }
        if (bjyz.m104951a(subSequence).length() >= this.f124099a.f130119a) {
            return "";
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo65915a(Character ch) {
        return ch.equals(this.f124101c) || Character.isDigit(ch.charValue());
    }
}
