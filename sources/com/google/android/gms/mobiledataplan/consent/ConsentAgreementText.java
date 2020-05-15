package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqi();

    /* renamed from: a */
    public SafeHtml f80262a;

    /* renamed from: b */
    public SafeHtml[] f80263b;

    /* renamed from: c */
    public SafeHtml[] f80264c;

    /* renamed from: d */
    public String f80265d;

    /* renamed from: e */
    public String f80266e;

    /* renamed from: f */
    public String f80267f;

    /* renamed from: g */
    public int f80268g;

    /* renamed from: h */
    public String f80269h;

    public ConsentAgreementText() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAgreementText) {
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) obj;
            return sdg.m34949a(this.f80262a, consentAgreementText.f80262a) && Arrays.equals(this.f80263b, consentAgreementText.f80263b) && Arrays.equals(this.f80264c, consentAgreementText.f80264c) && sdg.m34949a(this.f80265d, consentAgreementText.f80265d) && sdg.m34949a(this.f80266e, consentAgreementText.f80266e) && sdg.m34949a(this.f80267f, consentAgreementText.f80267f) && sdg.m34949a(Integer.valueOf(this.f80268g), Integer.valueOf(consentAgreementText.f80268g)) && sdg.m34949a(this.f80269h, consentAgreementText.f80269h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f80262a, Integer.valueOf(Arrays.hashCode(this.f80263b)), Integer.valueOf(Arrays.hashCode(this.f80264c)), this.f80265d, this.f80266e, this.f80267f, Integer.valueOf(this.f80268g)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("Title", this.f80262a);
        a.mo25396a("DescriptionParagraphs", Arrays.toString(this.f80263b));
        a.mo25396a("AdditionalInfoParagraphs", Arrays.toString(this.f80264c));
        a.mo25396a("PositiveButtonCaption", this.f80265d);
        a.mo25396a("NegativeButtonCaption", this.f80266e);
        a.mo25396a("ContinueButtonCaption", this.f80267f);
        a.mo25396a("Version", Integer.valueOf(this.f80268g));
        a.mo25396a("TextId", this.f80269h);
        return a.toString();
    }

    public ConsentAgreementText(SafeHtml safeHtml, SafeHtml[] safeHtmlArr, SafeHtml[] safeHtmlArr2, String str, String str2, String str3, int i, String str4) {
        this.f80262a = safeHtml;
        this.f80263b = safeHtmlArr;
        this.f80264c = safeHtmlArr2;
        this.f80265d = str;
        this.f80266e = str2;
        this.f80267f = str3;
        this.f80268g = i;
        this.f80269h = str4;
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
        see.m35040a(parcel, 1, this.f80262a, i, false);
        see.m35057a(parcel, 2, this.f80263b, i);
        see.m35057a(parcel, 3, this.f80264c, i);
        see.m35046a(parcel, 4, this.f80265d, false);
        see.m35046a(parcel, 5, this.f80266e, false);
        see.m35046a(parcel, 6, this.f80267f, false);
        see.m35063b(parcel, 7, this.f80268g);
        see.m35046a(parcel, 8, this.f80269h, false);
        see.m35062b(parcel, a);
    }
}
