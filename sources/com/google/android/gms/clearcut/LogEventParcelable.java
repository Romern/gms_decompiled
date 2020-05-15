package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.GenericDimension;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxr();

    /* renamed from: a */
    public PlayLoggerContext f30030a;

    /* renamed from: b */
    public byte[] f30031b;

    /* renamed from: c */
    public int[] f30032c;

    /* renamed from: d */
    public String[] f30033d;

    /* renamed from: e */
    public int[] f30034e;

    /* renamed from: f */
    public byte[][] f30035f;

    /* renamed from: g */
    public ExperimentTokens[] f30036g;

    /* renamed from: h */
    public boolean f30037h;

    /* renamed from: i */
    public GenericDimension[] f30038i;

    /* renamed from: j */
    public cagi f30039j;

    /* renamed from: k */
    public final qwq f30040k;

    /* renamed from: l */
    public final qwq f30041l;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, cagi cagi, qwq qwq, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.f30030a = playLoggerContext;
        this.f30039j = cagi;
        this.f30040k = qwq;
        this.f30041l = null;
        this.f30032c = iArr;
        this.f30033d = strArr;
        this.f30034e = iArr2;
        this.f30035f = bArr;
        this.f30036g = null;
        this.f30037h = z;
        this.f30038i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (sdg.m34949a(this.f30030a, logEventParcelable.f30030a) && Arrays.equals(this.f30031b, logEventParcelable.f30031b) && Arrays.equals(this.f30032c, logEventParcelable.f30032c) && Arrays.equals(this.f30033d, logEventParcelable.f30033d) && sdg.m34949a(this.f30039j, logEventParcelable.f30039j) && sdg.m34949a(this.f30040k, logEventParcelable.f30040k)) {
                qwq qwq = logEventParcelable.f30041l;
                return sdg.m34949a(null, null) && Arrays.equals(this.f30034e, logEventParcelable.f30034e) && Arrays.deepEquals(this.f30035f, logEventParcelable.f30035f) && Arrays.equals(this.f30036g, logEventParcelable.f30036g) && this.f30037h == logEventParcelable.f30037h && Arrays.equals(this.f30038i, logEventParcelable.f30038i);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30030a, this.f30031b, this.f30032c, this.f30033d, this.f30039j, this.f30040k, null, this.f30034e, this.f30035f, this.f30036g, Boolean.valueOf(this.f30037h), this.f30038i});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f30030a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f30031b;
        if (bArr != null) {
            str = new String(bArr);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f30032c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f30033d));
        sb.append(", LogEvent: ");
        sb.append(this.f30039j);
        sb.append(", ExtensionProducer: ");
        sb.append(this.f30040k);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f30034e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f30035f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f30036g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f30037h);
        sb.append("GenericDimensions: ");
        sb.append(Arrays.toString(this.f30038i));
        sb.append("]");
        return sb.toString();
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, GenericDimension[] genericDimensionArr) {
        this.f30030a = playLoggerContext;
        this.f30031b = bArr;
        this.f30032c = iArr;
        this.f30033d = strArr;
        this.f30039j = null;
        this.f30040k = null;
        this.f30041l = null;
        this.f30034e = iArr2;
        this.f30035f = bArr2;
        this.f30036g = experimentTokensArr;
        this.f30037h = z;
        this.f30038i = genericDimensionArr;
    }

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f30030a, i, false);
        see.m35052a(parcel, 3, this.f30031b, false);
        see.m35055a(parcel, 4, this.f30032c, false);
        see.m35058a(parcel, 5, this.f30033d, false);
        see.m35055a(parcel, 6, this.f30034e, false);
        see.m35060a(parcel, 7, this.f30035f);
        see.m35051a(parcel, 8, this.f30037h);
        see.m35057a(parcel, 9, this.f30036g, i);
        see.m35057a(parcel, 10, this.f30038i, i);
        see.m35062b(parcel, a);
    }
}
