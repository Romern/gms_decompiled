package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChangeSequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new twf();

    /* renamed from: a */
    public final long f30716a;

    /* renamed from: b */
    public final long f30717b;

    /* renamed from: c */
    public final long f30718c;

    /* renamed from: d */
    private volatile String f30719d = null;

    public ChangeSequenceNumber(long j, long j2, long j3) {
        boolean z = true;
        sdo.m34974b(j != -1);
        sdo.m34974b(j2 != -1);
        sdo.m34974b(j3 == -1 ? false : z);
        this.f30716a = j;
        this.f30717b = j2;
        this.f30718c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ChangeSequenceNumber.class) {
            ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
            if (changeSequenceNumber.f30717b == this.f30717b && changeSequenceNumber.f30718c == this.f30718c && changeSequenceNumber.f30716a == this.f30716a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f30716a);
        String valueOf2 = String.valueOf(this.f30717b);
        String valueOf3 = String.valueOf(this.f30718c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append(valueOf3);
        return sb.toString().hashCode();
    }

    public final String toString() {
        if (this.f30719d == null) {
            bxvd da = utv.f48635f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            utv utv = (utv) da.f164949b;
            int i = utv.f48637a | 1;
            utv.f48637a = i;
            utv.f48638b = 1;
            long j = this.f30716a;
            int i2 = i | 2;
            utv.f48637a = i2;
            utv.f48639c = j;
            long j2 = this.f30717b;
            int i3 = i2 | 4;
            utv.f48637a = i3;
            utv.f48640d = j2;
            long j3 = this.f30718c;
            utv.f48637a = i3 | 8;
            utv.f48641e = j3;
            String valueOf = String.valueOf(Base64.encodeToString(((utv) da.mo74062i()).mo73642k(), 10));
            this.f30719d = valueOf.length() == 0 ? new String("ChangeSequenceNumber:") : "ChangeSequenceNumber:".concat(valueOf);
        }
        return this.f30719d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 2, this.f30716a);
        see.m35036a(parcel, 3, this.f30717b);
        see.m35036a(parcel, 4, this.f30718c);
        see.m35062b(parcel, a);
    }
}
