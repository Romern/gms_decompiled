package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xxz();

    /* renamed from: a */
    public static final ChannelIdValue f31891a = new ChannelIdValue();

    /* renamed from: b */
    public final ChannelIdValueType f31892b;

    /* renamed from: c */
    public final String f31893c;

    /* renamed from: d */
    public final String f31894d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);
        
        public static final Parcelable.Creator CREATOR = new xxx();

        /* renamed from: d */
        public final int f31899d;

        private ChannelIdValueType(int i) {
            this.f31899d = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f31899d);
        }
    }

    static {
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.f31892b = ChannelIdValueType.ABSENT;
        this.f31894d = null;
        this.f31893c = null;
    }

    /* renamed from: a */
    public static ChannelIdValueType m23581a(int i) {
        ChannelIdValueType[] values = ChannelIdValueType.values();
        for (ChannelIdValueType channelIdValueType : values) {
            if (i == channelIdValueType.f31899d) {
                return channelIdValueType;
            }
        }
        throw new xxy(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelIdValue) {
            ChannelIdValue channelIdValue = (ChannelIdValue) obj;
            if (this.f31892b.equals(channelIdValue.f31892b)) {
                ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
                int ordinal = this.f31892b.ordinal();
                if (ordinal == 0) {
                    return true;
                }
                if (ordinal == 1) {
                    return this.f31893c.equals(channelIdValue.f31893c);
                }
                if (ordinal != 2) {
                    return false;
                }
                return this.f31894d.equals(channelIdValue.f31894d);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f31892b.hashCode() + 31;
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        int ordinal = this.f31892b.ordinal();
        if (ordinal == 1) {
            return (hashCode * 31) + this.f31893c.hashCode();
        }
        if (ordinal != 2) {
            return hashCode;
        }
        return (hashCode * 31) + this.f31894d.hashCode();
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        ChannelIdValueType channelIdValueType = this.f31892b;
        ChannelIdValueType channelIdValueType2 = ChannelIdValueType.ABSENT;
        see.m35063b(parcel, 2, channelIdValueType.f31899d);
        see.m35046a(parcel, 3, this.f31893c, false);
        see.m35046a(parcel, 4, this.f31894d, false);
        see.m35062b(parcel, a);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.f31892b = m23581a(i);
            this.f31893c = str;
            this.f31894d = str2;
        } catch (xxy e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        sdo.m34959a((Object) str);
        this.f31893c = str;
        this.f31892b = ChannelIdValueType.STRING;
        this.f31894d = null;
    }
}
