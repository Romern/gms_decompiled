package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xpn();

    /* renamed from: a */
    public xos f31736a;

    public COSEAlgorithmIdentifier(xos xos) {
        sdo.m34959a(xos);
        this.f31736a = xos;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:21:0x0034 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: xpr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: xqi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: xqi[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: xpr[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: xpr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xqi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: xpr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: xpr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static COSEAlgorithmIdentifier m23472a(int i) {
        xpr xpr;
        if (i != xqi.LEGACY_RS1.f52922i) {
            xqi[] values = xqi.values();
            int length = values.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    xqi xqi = values[i3];
                    if (xqi.f52922i == i) {
                        xpr = xqi;
                        break;
                    }
                    i3++;
                } else {
                    xpr[] values2 = xpr.values();
                    int length2 = values2.length;
                    while (i2 < length2) {
                        xpr = values2[i2];
                        if (xpr.f52878f != i) {
                            i2++;
                        }
                    }
                    throw new xpo(i);
                }
            }
        } else {
            xpr = xqi.RS1;
        }
        return new COSEAlgorithmIdentifier(xpr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.f31736a.mo29977a() != ((COSEAlgorithmIdentifier) obj).f31736a.mo29977a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31736a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31736a.mo29977a());
    }
}
