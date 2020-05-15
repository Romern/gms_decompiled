package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: apbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbo extends dcj implements apbq {
    public apbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.romanesco.internal.IRomanescoService");
    }

    /* renamed from: a */
    public final void mo47079a(apbn apbn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        mo8528b(2902, bj);
    }

    /* renamed from: a */
    public final void mo47083a(apbn apbn, String str, String str2, String str3, String[] strArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo47085b(apbn apbn, String str, String str2, String str3, String str4, String[] strArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeString(str4);
        bj.writeStringArray(strArr);
        mo8528b(2801, bj);
    }

    /* renamed from: a */
    public final void mo47080a(apbn apbn, String str, long j) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeLong(j);
        mo8528b(2701, bj);
    }

    /* renamed from: b */
    public final void mo47086b(apbn apbn, String str, String str2, String[] strArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeStringArray(strArr);
        mo8528b(2802, bj);
    }

    /* renamed from: a */
    public final void mo47081a(apbn apbn, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(1201, bj);
    }

    /* renamed from: a */
    public final void mo47082a(apbn apbn, String str, String str2, String str3, String str4, String[] strArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeString(str4);
        bj.writeStringArray(strArr);
        mo8528b(1401, bj);
    }

    /* renamed from: a */
    public final void mo47084a(apbn apbn, String str, String str2, String[] strArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, apbn);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeStringArray(strArr);
        mo8528b(1101, bj);
    }
}
