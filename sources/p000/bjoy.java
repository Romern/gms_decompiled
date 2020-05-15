package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bjoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoy implements bjpb {

    /* renamed from: a */
    private final String f123062a;

    /* renamed from: b */
    private final boolean f123063b;

    /* renamed from: c */
    private final boolean f123064c;

    /* renamed from: d */
    private final ArrayList f123065d;

    /* renamed from: e */
    private CharSequence f123066e;

    /* renamed from: f */
    private CharSequence f123067f;

    /* renamed from: g */
    private boolean f123068g;

    public bjoy(bwum bwum) {
        this.f123063b = bwum.f161049c;
        this.f123064c = bwum.f161050d;
        int size = bwum.f161047a.size();
        char[] cArr = new char[size];
        char[] cArr2 = new char[size];
        for (int i = 0; i < size; i++) {
            bwul bwul = (bwul) bwum.f161047a.get(i);
            cArr[i] = bwul.f161042a.charAt(0);
            cArr2[i] = this.f123063b ? bwul.f161043b.charAt(0) : '~';
        }
        char[] charArray = bwum.f161048b.toCharArray();
        int length = charArray.length;
        this.f123065d = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                } else if (charArray[i2] == cArr[i3]) {
                    charArray[i2] = cArr2[i3];
                    this.f123065d.add(Integer.valueOf(i2));
                    break;
                } else {
                    i3++;
                }
            }
        }
        bmxy.m108589a(!this.f123065d.isEmpty(), "The template formatting scheme must contain at least one input character");
        this.f123062a = String.valueOf(charArray);
    }

    /* renamed from: a */
    public final int mo65420a() {
        return this.f123065d.size();
    }

    /* renamed from: a */
    public final void mo65421a(bjpc bjpc) {
        int i = bjpc.f123071b;
        int i2 = 0;
        if (!TextUtils.isEmpty(bjpc.f123070a)) {
            StringBuilder sb = new StringBuilder();
            while (i2 < bjpc.f123070a.length()) {
                char charAt = bjpc.f123070a.charAt(i2);
                if (charAt != this.f123062a.charAt(i2)) {
                    sb.append(charAt);
                } else if (bjpc.f123071b > i2) {
                    i--;
                }
                this.f123066e = sb;
                i2++;
            }
            i2 = i;
        } else {
            this.f123066e = "";
        }
        CharSequence charSequence = this.f123066e;
        bjpc.f123070a = charSequence;
        bjpc.f123071b = Math.min(charSequence.length(), i2);
    }

    /* renamed from: a */
    public final void mo65422a(bjpc bjpc, boolean z) {
        boolean z2;
        String str;
        int i = 0;
        if (!TextUtils.equals(this.f123066e, bjpc.f123070a) || this.f123068g != z) {
            this.f123066e = bjpc.f123070a;
            if (!this.f123064c) {
                z2 = false;
            } else {
                z2 = z;
            }
            this.f123068g = z2;
            if (TextUtils.isEmpty(this.f123066e) && !this.f123068g) {
                this.f123067f = "";
            } else {
                char[] charArray = this.f123062a.toCharArray();
                int size = this.f123065d.size();
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (i2 < this.f123066e.length()) {
                        if (charArray[((Integer) this.f123065d.get(i2)).intValue()] != this.f123066e.charAt(i2)) {
                            charArray[((Integer) this.f123065d.get(i2)).intValue()] = this.f123066e.charAt(i2);
                            z3 = true;
                        }
                        i2++;
                    } else if (!this.f123063b) {
                        charArray = Arrays.copyOf(charArray, ((Integer) this.f123065d.get(i2)).intValue());
                    }
                }
                if (!this.f123068g && !z3) {
                    str = null;
                } else {
                    str = String.valueOf(charArray);
                }
                this.f123067f = str;
            }
        }
        CharSequence charSequence = this.f123067f;
        bjpc.f123070a = charSequence;
        int i3 = bjpc.f123071b;
        if (!TextUtils.isEmpty(charSequence)) {
            i = i3 < this.f123065d.size() ? Math.min(((Integer) this.f123065d.get(i3)).intValue(), this.f123067f.length()) : Math.min(((Integer) bnjd.m109595d(this.f123065d)).intValue() + 1, this.f123067f.length());
        }
        bjpc.f123071b = i;
    }
}
