package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new anea();

    /* renamed from: j */
    public static final Comparator f82097j = new andz();

    /* renamed from: k */
    private static final List f82098k = Arrays.asList(2, 8, 9);

    /* renamed from: a */
    public final String f82099a;

    /* renamed from: b */
    final long f82100b;

    /* renamed from: c */
    final boolean f82101c;

    /* renamed from: d */
    final double f82102d;

    /* renamed from: e */
    final String f82103e;

    /* renamed from: f */
    final byte[] f82104f;

    /* renamed from: g */
    public final int f82105g;

    /* renamed from: h */
    public final int f82106h;

    /* renamed from: i */
    final Set f82107i;

    public Flag(String str, String str2, int i, int i2) {
        this.f82099a = str;
        this.f82105g = i;
        this.f82106h = i2;
        HashSet hashSet = new HashSet(f82098k);
        this.f82107i = hashSet;
        if (i == 1) {
            this.f82100b = Long.parseLong(str2);
            this.f82101c = false;
            this.f82102d = 0.0d;
            this.f82103e = "";
            this.f82104f = new byte[0];
            this.f82107i.add(3);
        } else if (i == 2) {
            if (str2.equalsIgnoreCase("true")) {
                this.f82101c = true;
            } else if (!str2.equalsIgnoreCase("false")) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unrecognized boolean value: ") : "Unrecognized boolean value: ".concat(valueOf));
            } else {
                this.f82101c = false;
            }
            this.f82100b = 0;
            this.f82102d = 0.0d;
            this.f82103e = "";
            this.f82104f = new byte[0];
            this.f82107i.add(4);
        } else if (i == 3) {
            this.f82102d = Double.parseDouble(str2);
            this.f82100b = 0;
            this.f82101c = false;
            this.f82103e = "";
            this.f82104f = new byte[0];
            this.f82107i.add(5);
        } else if (i == 4) {
            this.f82103e = str2;
            this.f82100b = 0;
            this.f82101c = false;
            this.f82102d = 0.0d;
            this.f82104f = new byte[0];
            hashSet.add(6);
        } else if (i == 5) {
            this.f82104f = Base64.decode(str2, 3);
            this.f82100b = 0;
            this.f82101c = false;
            this.f82102d = 0.0d;
            this.f82103e = "";
            this.f82107i.add(7);
        } else {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unrecognized flag type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static int m68235a(int i, int i2) {
        if (i >= i2) {
            return i != i2 ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo46499b() {
        if (this.f82105g == 2) {
            return this.f82101c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    /* renamed from: c */
    public final double mo46500c() {
        if (this.f82105g == 3) {
            return this.f82102d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Flag flag = (Flag) obj;
        int compareTo = this.f82099a.compareTo(flag.f82099a);
        if (compareTo != 0) {
            return compareTo;
        }
        int a = m68235a(this.f82105g, flag.f82105g);
        if (a != 0) {
            return a;
        }
        int i = this.f82105g;
        if (i == 1) {
            long j = this.f82100b;
            long j2 = flag.f82100b;
            if (j < j2) {
                return -1;
            }
            if (j == j2) {
                return 0;
            }
            return 1;
        } else if (i == 2) {
            boolean z = this.f82101c;
            if (z == flag.f82101c) {
                return 0;
            }
            if (z) {
                return 1;
            }
            return -1;
        } else if (i == 3) {
            return Double.compare(this.f82102d, flag.f82102d);
        } else {
            if (i == 4) {
                String str = this.f82103e;
                String str2 = flag.f82103e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i == 5) {
                byte[] bArr = this.f82104f;
                byte[] bArr2 = flag.f82104f;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i2 = 0; i2 < Math.min(this.f82104f.length, flag.f82104f.length); i2++) {
                    int i3 = this.f82104f[i2] - flag.f82104f[i2];
                    if (i3 != 0) {
                        return i3;
                    }
                }
                return m68235a(this.f82104f.length, flag.f82104f.length);
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
            }
        }
    }

    /* renamed from: d */
    public final String mo46502d() {
        if (this.f82105g == 4) {
            return this.f82103e;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    /* renamed from: e */
    public final byte[] mo46503e() {
        if (this.f82105g == 5) {
            return this.f82104f;
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        if (!anez.m64128a(this.f82099a, flag.f82099a) || (i = this.f82105g) != flag.f82105g || this.f82106h != flag.f82106h) {
            return false;
        }
        if (i == 1) {
            return this.f82100b == flag.f82100b;
        }
        if (i == 2) {
            return this.f82101c == flag.f82101c;
        }
        if (i == 3) {
            return this.f82102d == flag.f82102d;
        }
        if (i == 4) {
            return anez.m64128a(this.f82103e, flag.f82103e);
        }
        if (i == 5) {
            return Arrays.equals(this.f82104f, flag.f82104f);
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Invalid enum value: ");
        sb.append(i);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: f */
    public final String mo46505f() {
        int i = this.f82105g;
        if (i == 1) {
            return Long.toString(this.f82100b);
        }
        if (i == 2) {
            return !this.f82101c ? "false" : "true";
        }
        if (i == 3) {
            return Double.toString(this.f82102d);
        }
        if (i == 4) {
            return this.f82103e;
        }
        if (i == 5) {
            return Base64.encodeToString(this.f82104f, 3);
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Invalid enum value: ");
        sb.append(i);
        throw new AssertionError(sb.toString());
    }

    public final String toString() {
        return mo46498a(new StringBuilder());
    }

    /* renamed from: a */
    public final long mo46497a() {
        if (this.f82105g == 1) {
            return this.f82100b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f82107i;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82099a, true);
        }
        if (set.contains(3)) {
            see.m35036a(parcel, 3, this.f82100b);
        }
        if (set.contains(4)) {
            see.m35051a(parcel, 4, this.f82101c);
        }
        if (set.contains(5)) {
            see.m35033a(parcel, 5, this.f82102d);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82103e, true);
        }
        if (set.contains(7)) {
            see.m35052a(parcel, 7, this.f82104f, true);
        }
        if (set.contains(8)) {
            see.m35063b(parcel, 8, this.f82105g);
        }
        if (set.contains(9)) {
            see.m35063b(parcel, 9, this.f82106h);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final String mo46498a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.f82099a);
        sb.append(", ");
        int i = this.f82105g;
        if (i == 1) {
            sb.append(this.f82100b);
        } else if (i == 2) {
            sb.append(this.f82101c);
        } else if (i == 3) {
            sb.append(this.f82102d);
        } else if (i == 4) {
            sb.append("'");
            sb.append(this.f82103e);
            sb.append("'");
        } else if (i != 5) {
            String str = this.f82099a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("Invalid type: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(i);
            throw new AssertionError(sb2.toString());
        } else if (this.f82104f != null) {
            sb.append("'");
            sb.append(Base64.encodeToString(this.f82104f, 3));
            sb.append("'");
        } else {
            sb.append("null");
        }
        sb.append(", ");
        sb.append(this.f82105g);
        sb.append(", ");
        sb.append(this.f82106h);
        sb.append(")");
        return sb.toString();
    }

    public Flag(String str, byte[] bArr, int i) {
        this(new HashSet(), str, 0, false, 0.0d, "", bArr, 5, i);
    }

    public Flag(Set set, String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f82107i = set;
        this.f82099a = str;
        this.f82100b = j;
        this.f82101c = z;
        this.f82102d = d;
        this.f82103e = str2;
        this.f82104f = bArr;
        this.f82105g = i;
        this.f82106h = i2;
        set.addAll(f82098k);
        if (i == 1) {
            set.add(3);
        } else if (i == 2) {
            set.add(4);
        } else if (i == 3) {
            set.add(5);
        } else if (i == 4) {
            set.add(6);
        } else if (i == 5) {
            set.add(7);
        }
    }
}
