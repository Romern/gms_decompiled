package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fqw();

    /* renamed from: a */
    public final DocumentSection[] f9530a;

    /* renamed from: b */
    public final String f9531b;

    /* renamed from: c */
    public final boolean f9532c;

    /* renamed from: d */
    public final Account f9533d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DocumentContents(Account account, DocumentSection... documentSectionArr) {
        this(documentSectionArr, null, false, account);
        if (documentSectionArr != null) {
            BitSet bitSet = new BitSet(fro.m12228a());
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.f9545e;
                if (i != -1) {
                    if (!bitSet.get(i)) {
                        bitSet.set(i);
                    } else {
                        String valueOf = String.valueOf(fro.m12230a(i));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Duplicate global search section type ") : "Duplicate global search section type ".concat(valueOf));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final DocumentSection mo7167a(String str) {
        sdo.m34977c(str);
        DocumentSection[] documentSectionArr = this.f9530a;
        if (documentSectionArr != null) {
            for (DocumentSection documentSection : documentSectionArr) {
                if (str.equals(documentSection.f9544d.f9646a)) {
                    return documentSection;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            return sdg.m34949a(this.f9531b, documentContents.f9531b) && sdg.m34949a(Boolean.valueOf(this.f9532c), Boolean.valueOf(documentContents.f9532c)) && sdg.m34949a(this.f9533d, documentContents.f9533d) && Arrays.equals(this.f9530a, documentContents.f9530a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9531b, Boolean.valueOf(this.f9532c), this.f9533d, Integer.valueOf(Arrays.hashCode(this.f9530a))});
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
        see.m35057a(parcel, 1, this.f9530a, i);
        see.m35046a(parcel, 2, this.f9531b, false);
        see.m35051a(parcel, 3, this.f9532c);
        see.m35040a(parcel, 4, this.f9533d, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final String mo7168a() {
        DocumentSection a = mo7167a("web_url");
        if (a != null) {
            return a.f9543c;
        }
        return null;
    }

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.f9530a = documentSectionArr;
        this.f9531b = str;
        this.f9532c = z;
        this.f9533d = account;
    }
}
