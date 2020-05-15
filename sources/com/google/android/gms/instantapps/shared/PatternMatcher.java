package com.google.android.gms.instantapps.shared;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PatternMatcher implements Parcelable {
    public static final Parcelable.Creator CREATOR = new adld();

    /* renamed from: d */
    private static final int[] f79233d = new int[2048];

    /* renamed from: a */
    private final String f79234a;

    /* renamed from: b */
    private final int f79235b;

    /* renamed from: c */
    private final int[] f79236c;

    public PatternMatcher(Parcel parcel) {
        this.f79234a = parcel.readString();
        this.f79235b = parcel.readInt();
        this.f79236c = parcel.createIntArray();
    }

    /* renamed from: a */
    private static boolean m66773a(int i) {
        return i == -8 || i == -7 || i == -6 || i == -5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e A[Catch:{ NumberFormatException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0181 A[Catch:{ NumberFormatException -> 0x0165 }] */
    /* renamed from: b */
    static synchronized int[] m66774b(String str) {
        int[] copyOf;
        boolean z;
        int i;
        int i2;
        synchronized (PatternMatcher.class) {
            int length = str.length();
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i3 < length) {
                if (i4 <= 2045) {
                    int charAt = str.charAt(i3);
                    if (charAt != 42) {
                        if (charAt != 43) {
                            if (charAt != 46) {
                                if (charAt != 123) {
                                    if (charAt != 125) {
                                        switch (charAt) {
                                            case 91:
                                                if (z2) {
                                                    z = true;
                                                    break;
                                                } else {
                                                    int i5 = i3 + 1;
                                                    if (str.charAt(i5) == '^') {
                                                        f79233d[i4] = -2;
                                                        i4++;
                                                        i3 = i5;
                                                    } else {
                                                        f79233d[i4] = -1;
                                                        i4++;
                                                    }
                                                    i3++;
                                                    z2 = true;
                                                    continue;
                                                }
                                            case 92:
                                                i3++;
                                                if (i3 < length) {
                                                    charAt = str.charAt(i3);
                                                    z = true;
                                                    break;
                                                } else {
                                                    throw new IllegalArgumentException("Escape found at end of pattern!");
                                                }
                                            case 93:
                                                if (z2) {
                                                    int i6 = f79233d[i4 - 1];
                                                    if (i6 != -1 && i6 != -2) {
                                                        f79233d[i4] = -3;
                                                        i4++;
                                                        z2 = false;
                                                        z4 = false;
                                                        break;
                                                    } else {
                                                        throw new IllegalArgumentException("You must define characters in a set.");
                                                    }
                                                } else {
                                                    z = true;
                                                    break;
                                                }
                                            default:
                                                z = true;
                                                break;
                                        }
                                        if (!z2) {
                                            if (z3) {
                                                int indexOf = str.indexOf(125, i3);
                                                if (indexOf >= 0) {
                                                    String substring = str.substring(i3, indexOf);
                                                    int indexOf2 = substring.indexOf(44);
                                                    if (indexOf2 < 0) {
                                                        try {
                                                            i2 = Integer.parseInt(substring);
                                                            i = i2;
                                                        } catch (NumberFormatException e) {
                                                            throw new IllegalArgumentException("Range number format incorrect", e);
                                                        }
                                                    } else {
                                                        int parseInt = Integer.parseInt(substring.substring(0, indexOf2));
                                                        if (indexOf2 != substring.length() - 1) {
                                                            i = Integer.parseInt(substring.substring(indexOf2 + 1));
                                                            i2 = parseInt;
                                                        } else {
                                                            i2 = parseInt;
                                                            i = Integer.MAX_VALUE;
                                                        }
                                                    }
                                                    if (i2 <= i) {
                                                        int i7 = i4 + 1;
                                                        f79233d[i4] = i2;
                                                        i4 = i7 + 1;
                                                        f79233d[i7] = i;
                                                        i3 = indexOf;
                                                    } else {
                                                        throw new IllegalArgumentException("Range quantifier minimum is greater than maximum");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Range not ended with '}'");
                                                }
                                            } else if (z) {
                                                f79233d[i4] = charAt;
                                                i4++;
                                            }
                                        } else if (z4) {
                                            f79233d[i4] = charAt;
                                            i4++;
                                            z4 = false;
                                        } else {
                                            int i8 = i3 + 2;
                                            if (i8 < length) {
                                                int i9 = i3 + 1;
                                                if (str.charAt(i9) == '-' && str.charAt(i8) != ']') {
                                                    f79233d[i4] = charAt;
                                                    i4++;
                                                    i3 = i9;
                                                    z4 = true;
                                                }
                                            }
                                            int i10 = i4 + 1;
                                            f79233d[i4] = charAt;
                                            i4 = i10 + 1;
                                            f79233d[i10] = charAt;
                                        }
                                        i3++;
                                    } else if (z3) {
                                        f79233d[i4] = -6;
                                        i4++;
                                        z3 = false;
                                    }
                                } else if (!z2) {
                                    if (i4 == 0 || m66773a(f79233d[i4 - 1])) {
                                        throw new IllegalArgumentException("Modifier must follow a token.");
                                    }
                                    f79233d[i4] = -5;
                                    i3++;
                                    i4++;
                                    z3 = true;
                                    z = false;
                                    if (!z2) {
                                    }
                                    i3++;
                                }
                                z = false;
                                if (!z2) {
                                }
                                i3++;
                            } else if (!z2) {
                                f79233d[i4] = -4;
                                i4++;
                            }
                        } else if (!z2) {
                            if (i4 == 0 || m66773a(f79233d[i4 - 1])) {
                                throw new IllegalArgumentException("Modifier must follow a token.");
                            }
                            f79233d[i4] = -8;
                            i4++;
                            z = false;
                            if (!z2) {
                            }
                            i3++;
                        }
                        z = false;
                        if (!z2) {
                        }
                        i3++;
                    } else if (!z2) {
                        if (i4 == 0 || m66773a(f79233d[i4 - 1])) {
                            throw new IllegalArgumentException("Modifier must follow a token.");
                        }
                        f79233d[i4] = -7;
                        i4++;
                        z = false;
                        if (!z2) {
                        }
                        i3++;
                    }
                    z = false;
                    if (!z2) {
                    }
                    i3++;
                } else {
                    throw new IllegalArgumentException("Pattern is too large!");
                }
            }
            if (!z2) {
                copyOf = Arrays.copyOf(f79233d, i4);
            } else {
                throw new IllegalArgumentException("Set was not terminated!");
            }
        }
        return copyOf;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.f79235b;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "? " : "ADVANCED: " : "GLOB: " : "PREFIX: " : "LITERAL: ";
        String str2 = this.f79234a;
        StringBuilder sb = new StringBuilder(str.length() + 16 + String.valueOf(str2).length());
        sb.append("PatternMatcher{");
        sb.append(str);
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79234a);
        parcel.writeInt(this.f79235b);
        parcel.writeIntArray(this.f79236c);
    }

    public PatternMatcher(String str, int i) {
        this.f79234a = str;
        this.f79235b = i;
        if (i == 3) {
            this.f79236c = m66774b(str);
        } else {
            this.f79236c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* renamed from: a */
    public final boolean mo43456a(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        char c2;
        String str2 = str;
        String str3 = this.f79234a;
        int[] iArr = this.f79236c;
        int i7 = this.f79235b;
        int i8 = 1;
        if (str2 == null) {
            return false;
        }
        if (i7 == 0) {
            return str3.equals(str2);
        }
        if (i7 == 1) {
            return str2.startsWith(str3);
        }
        int i9 = -2;
        int i10 = 2;
        if (i7 == 2) {
            int length = str3.length();
            if (length <= 0) {
                return str.length() <= 0;
            }
            int length2 = str.length();
            char charAt = str3.charAt(0);
            int i11 = 0;
            int i12 = 0;
            while (i11 < length && i12 < length2) {
                i11++;
                if (i11 < length) {
                    c = str3.charAt(i11);
                } else {
                    c = 0;
                }
                if (charAt != '\\') {
                    c2 = c;
                    c = charAt;
                } else {
                    i11++;
                    c2 = i11 < length ? str3.charAt(i11) : 0;
                }
                if (c2 != '*') {
                    if (c != '.' && str2.charAt(i12) != c) {
                        return false;
                    }
                    i12++;
                    charAt = c2;
                } else if (charAt == '\\' || c != '.') {
                    while (str2.charAt(i12) == c && (i12 = i12 + 1) < length2) {
                        while (str2.charAt(i12) == c) {
                            while (str2.charAt(i12) == c) {
                            }
                        }
                    }
                    i11++;
                    charAt = i11 < length ? str3.charAt(i11) : 0;
                } else if (i11 >= length - 1) {
                    return true;
                } else {
                    int i13 = i11 + 1;
                    char charAt2 = str3.charAt(i13);
                    if (charAt2 == '\\') {
                        i13++;
                        charAt2 = i13 < length ? str3.charAt(i13) : 0;
                    }
                    while (str2.charAt(i12) != charAt2 && (i12 = i12 + 1) < length2) {
                        while (str2.charAt(i12) != charAt2) {
                            while (str2.charAt(i12) != charAt2) {
                            }
                        }
                    }
                    if (i12 == length2) {
                        return false;
                    }
                    i11 = i13 + 1;
                    charAt = i11 < length ? str3.charAt(i11) : 0;
                    i12++;
                }
            }
            if (i11 >= length && i12 >= length2) {
                return true;
            }
            return i11 == length + -2 && str3.charAt(i11) == '.' && str3.charAt(i11 + 1) == '*';
        }
        if (i7 == 3) {
            int length3 = iArr.length;
            int length4 = str.length();
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i14 < length3) {
                int i18 = iArr[i14];
                if (i18 == -4) {
                    i = i17;
                    i2 = i16;
                    i3 = i14 + 1;
                    i4 = 1;
                } else if (i18 == i9 || i18 == -1) {
                    if (i18 == -1) {
                        i6 = 2;
                    } else {
                        i6 = 3;
                    }
                    i2 = i14 + 1;
                    do {
                        i14 += i8;
                        if (i14 >= length3) {
                            break;
                        }
                    } while (iArr[i14] != -3);
                    i = i14 - 1;
                    i3 = i14 + 1;
                    i4 = i6;
                } else {
                    i3 = i14 + 1;
                    i = i17;
                    i2 = i14;
                    i4 = 0;
                }
                int i19 = Integer.MAX_VALUE;
                if (i3 >= length3) {
                    i5 = 1;
                    i19 = 1;
                } else {
                    int i20 = iArr[i3];
                    if (i20 == -8) {
                        i3++;
                        i5 = 1;
                    } else if (i20 == -7) {
                        i3++;
                        i5 = 0;
                    } else if (i20 != -5) {
                        i5 = 1;
                        i19 = 1;
                    } else {
                        int i21 = i3 + 1;
                        i5 = iArr[i21];
                        int i22 = i21 + i8;
                        i19 = iArr[i22];
                        i3 = i22 + i10;
                    }
                }
                if (i5 > i19) {
                    return false;
                }
                int i23 = 0;
                while (i23 < i19) {
                    int i24 = i15 + i23;
                    if (i24 >= length4) {
                        break;
                    }
                    if (i4 == 0) {
                        if (str2.charAt(i24) != iArr[i2]) {
                            break;
                        }
                    } else if (i4 != i8) {
                        if (i4 == i10) {
                            int i25 = i2;
                            while (i25 < i) {
                                char charAt3 = str2.charAt(i24);
                                if (charAt3 < iArr[i25] || charAt3 > iArr[i25 + 1]) {
                                    i25 += 2;
                                }
                            }
                            break;
                        }
                        for (int i26 = i2; i26 < i; i26 += 2) {
                            char charAt4 = str2.charAt(i24);
                            if (charAt4 >= iArr[i26] && charAt4 <= iArr[i26 + 1]) {
                                break;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    i23++;
                    i8 = 1;
                    i10 = 2;
                }
                if (i23 < i5) {
                    i23 = -1;
                }
                if (i23 == -1) {
                    return false;
                }
                i15 += i23;
                i14 = i3;
                i16 = i2;
                i17 = i;
                i8 = 1;
                i9 = -2;
                i10 = 2;
            }
            if (i14 >= length3 && i15 >= length4) {
                return true;
            }
        }
        return false;
    }
}
