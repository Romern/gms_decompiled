package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: angk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angk extends dcj implements angm {
    public angk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    /* renamed from: a */
    public final void mo41798a(angj angj) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41799a(angj angj, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41803a(angj angj, String str, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41804a(angj angj, String str, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41805a(angj angj, String str, String str2, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41807a(angj angj, String str, String str2, String str3, int i, int i2, String str4) {
        throw null;
    }

    /* renamed from: a */
    public final void mo41811a(angj angj, byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo41813b(angj angj) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        mo8528b(22, bj);
    }

    /* renamed from: c */
    public final void mo41818c(angj angj, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        mo8528b(10, bj);
    }

    /* renamed from: c */
    public final void mo41819c(angj angj, String str, String str2, String str3) {
        throw null;
    }

    /* renamed from: b */
    public final void mo41814b(angj angj, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo41800a(angj angj, String str, int i, String[] strArr, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeStringArray(strArr);
        bj.writeByteArray(bArr);
        mo8528b(1, bj);
    }

    /* renamed from: b */
    public final void mo41815b(angj angj, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo41801a(angj angj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeStringArray(strArr);
        bj.writeByteArray(bArr);
        bj.writeString(str2);
        bj.writeString(null);
        mo8528b(13, bj);
    }

    /* renamed from: b */
    public final void mo41816b(angj angj, String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo41802a(angj angj, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeStringArray(strArr);
        bj.writeIntArray(iArr);
        bj.writeByteArray(null);
        mo8528b(2, bj);
    }

    /* renamed from: b */
    public final void mo41817b(angj angj, String str, String str2, String str3, String str4) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeString(str4);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo41806a(angj angj, String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo41808a(angj angj, String str, String str2, String str3, String str4) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeString(str4);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo41809a(angj angj, String str, String str2, Flag[] flagArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeTypedArray(flagArr, 0);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo41810a(angj angj, String str, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeString(str);
        bj.writeByteArray(bArr);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo41812a(angj angj, RegistrationInfo[] registrationInfoArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, angj);
        bj.writeTypedArray(registrationInfoArr, 0);
        mo8528b(19, bj);
    }
}
