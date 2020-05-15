package com.google.android.libraries.matchstick.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocalEntityId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azcp();

    /* renamed from: a */
    public final String f111074a;

    /* renamed from: b */
    public final int f111075b;

    /* renamed from: c */
    public final String f111076c;

    public LocalEntityId(Parcel parcel) {
        this.f111074a = parcel.readString();
        this.f111075b = parcel.readInt();
        this.f111076c = parcel.readString();
    }

    /* renamed from: a */
    public static int m94546a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return i;
            default:
                azoj.m85932b("EntityId", "Unknown profile type %s", Integer.valueOf(i));
                return 0;
        }
    }

    /* renamed from: b */
    public static int m94550b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 7) {
            return i != 8 ? 2 : 15;
        }
        return 18;
    }

    /* renamed from: c */
    public final boolean mo60372c() {
        return this.f111075b != 0 && !TextUtils.isEmpty(this.f111074a) && !TextUtils.isEmpty(this.f111076c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocalEntityId)) {
            return super.equals(obj);
        }
        LocalEntityId localEntityId = (LocalEntityId) obj;
        return TextUtils.equals(localEntityId.f111076c, this.f111076c) && localEntityId.f111075b == this.f111075b && TextUtils.equals(localEntityId.f111074a, this.f111074a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111074a, Integer.valueOf(this.f111075b), this.f111076c});
    }

    public final String toString() {
        return String.format("%s:%s:%s", this.f111076c, Integer.valueOf(this.f111075b), this.f111074a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111074a);
        parcel.writeInt(this.f111075b);
        parcel.writeString(this.f111076c);
    }

    public LocalEntityId(String str, int i, String str2) {
        this.f111074a = str;
        this.f111075b = i;
        this.f111076c = str2;
    }

    /* renamed from: a */
    public static int m94547a(cbma cbma) {
        int b = cipg.m150691b(cbma.f177593a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    if (i2 != 13) {
                        return i2 != 16 ? 0 : 7;
                    }
                    return 8;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public static LocalEntityId m94551b(cbma cbma) {
        if (m94547a(cbma) != 8) {
            return new LocalEntityId(cbma.f177594b, m94547a(cbma), cbma.f177595c);
        }
        return azcv.f99014b;
    }

    /* renamed from: a */
    public static cbhu m94548a(String str, int i, String str2) {
        bxvd da = cbhu.f177185d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbhu cbhu = (cbhu) da.f164949b;
        str2.getClass();
        cbhu.f177189c = str2;
        if (i == 1) {
            str.getClass();
            cbhu.f177187a = 2;
            cbhu.f177188b = str;
        } else if (i == 2) {
            str.getClass();
            cbhu.f177187a = 5;
            cbhu.f177188b = str;
        } else if (i == 3) {
            str.getClass();
            cbhu.f177187a = 4;
            cbhu.f177188b = str;
        } else if (i == 4) {
            str.getClass();
            cbhu.f177187a = 3;
            cbhu.f177188b = str;
        } else if (i != 7) {
            azoj.m85933c("DB", "unsupported entity tpe: %s", Integer.valueOf(i));
        } else {
            str.getClass();
            cbhu.f177187a = 6;
            cbhu.f177188b = str;
        }
        return (cbhu) da.mo74062i();
    }

    /* renamed from: b */
    public final cbma mo60371b() {
        int b = m94550b(this.f111075b);
        if (b == 2) {
            azoj.m85933c("DB", "toTachyonId not supported for: %s", this);
            return null;
        }
        bxvd da = cbma.f177591f.mo74144da();
        String str = this.f111076c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbma cbma = (cbma) da.f164949b;
        str.getClass();
        cbma.f177595c = str;
        cbma.f177593a = cipg.m150690a(b);
        String str2 = this.f111074a;
        if (str2 != null && !"anonymous".equals(str2)) {
            String str3 = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str3.getClass();
            ((cbma) da.f164949b).f177594b = str3;
        }
        return (cbma) da.mo74062i();
    }

    /* renamed from: a */
    public static LocalEntityId m94549a(cbhu cbhu) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        new Object[1][0] = cbhu;
        String str6 = "";
        if (cbhu.f177187a == 2) {
            str = (String) cbhu.f177188b;
        } else {
            str = str6;
        }
        if (!TextUtils.isEmpty(str)) {
            if (cbhu.f177187a == 2) {
                str6 = (String) cbhu.f177188b;
            }
            return new LocalEntityId(str6, 1, cbhu.f177189c);
        }
        if (cbhu.f177187a == 5) {
            str2 = (String) cbhu.f177188b;
        } else {
            str2 = str6;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (cbhu.f177187a == 5) {
                str6 = (String) cbhu.f177188b;
            }
            return new LocalEntityId(str6, 2, cbhu.f177189c);
        }
        if (cbhu.f177187a == 4) {
            str3 = (String) cbhu.f177188b;
        } else {
            str3 = str6;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (cbhu.f177187a == 4) {
                str6 = (String) cbhu.f177188b;
            }
            return new LocalEntityId(str6, 3, cbhu.f177189c);
        }
        if (cbhu.f177187a == 6) {
            str4 = (String) cbhu.f177188b;
        } else {
            str4 = str6;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (cbhu.f177187a == 6) {
                str6 = (String) cbhu.f177188b;
            }
            return new LocalEntityId(str6, 7, cbhu.f177189c);
        }
        if (cbhu.f177187a == 3) {
            str5 = (String) cbhu.f177188b;
        } else {
            str5 = str6;
        }
        if (TextUtils.isEmpty(str5)) {
            return null;
        }
        if (cbhu.f177187a == 3) {
            str6 = (String) cbhu.f177188b;
        }
        return new LocalEntityId(str6, 4, cbhu.f177189c);
    }

    /* renamed from: a */
    public final cbhu mo60370a() {
        bxvd da = cbhu.f177185d.mo74144da();
        int i = this.f111075b;
        if (i == 1) {
            String str = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu = (cbhu) da.f164949b;
            str.getClass();
            cbhu.f177187a = 2;
            cbhu.f177188b = str;
        } else if (i == 2) {
            String str2 = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu2 = (cbhu) da.f164949b;
            str2.getClass();
            cbhu2.f177187a = 5;
            cbhu2.f177188b = str2;
        } else if (i == 3) {
            String str3 = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu3 = (cbhu) da.f164949b;
            str3.getClass();
            cbhu3.f177187a = 4;
            cbhu3.f177188b = str3;
        } else if (i == 4) {
            String str4 = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu4 = (cbhu) da.f164949b;
            str4.getClass();
            cbhu4.f177187a = 3;
            cbhu4.f177188b = str4;
        } else if (i == 7) {
            String str5 = this.f111074a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbhu cbhu5 = (cbhu) da.f164949b;
            str5.getClass();
            cbhu5.f177187a = 6;
            cbhu5.f177188b = str5;
        } else if (i == 8) {
            return null;
        } else {
            azoj.m85933c("EntityId", "toMatchstickId not supported for: %s", this);
            return null;
        }
        String str6 = this.f111076c;
        str6.getClass();
        ((cbhu) da.f164949b).f177189c = str6;
        return (cbhu) da.mo74062i();
    }
}
