package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import java.util.List;

/* renamed from: iqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqw extends dcj implements iqy {
    public iqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
    }

    /* renamed from: a */
    public final void mo13268a(irb irb, String str, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irb);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo13285a(isl isl, String str, Account account, Payload payload) {
        throw null;
    }

    /* renamed from: a */
    public final void mo13269a(irb irb, String str, Account account, ClientPublicKey clientPublicKey) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irb);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        dcl.m8165a(bj, clientPublicKey);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo13270a(ire ire, String str, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ire);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo13271a(ire ire, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ire);
        bj.writeByteArray(bArr);
        mo8528b(21, bj);
    }

    /* renamed from: a */
    public final void mo13272a(irh irh, Account account, String str, String str2, byte[] bArr, byte[] bArr2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irh);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeByteArray(bArr);
        bj.writeByteArray(bArr2);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo13273a(irk irk, Account account, String str, String str2, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irk);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeByteArray(bArr);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo13274a(irn irn, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irn);
        bj.writeByteArray(bArr);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo13275a(irq irq, String str, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irq);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        mo8528b(22, bj);
    }

    /* renamed from: a */
    public final void mo13276a(irt irt, int i, String str, Account account, List list) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irt);
        bj.writeInt(i);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeList(list);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo13277a(irw irw, int i, String str, Account account, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irw);
        bj.writeInt(i);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeByteArray(bArr);
        bj.writeByteArray(bArr2);
        bj.writeByteArray(bArr3);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo13278a(irw irw, int i, List list, String str, Account account, List list2, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irw);
        bj.writeInt(i);
        bj.writeStringList(list);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeList(null);
        bj.writeByteArray(bArr);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo13279a(irz irz, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irz);
        bj.writeString(str);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo13280a(irz irz, String str, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, irz);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo13281a(isc isc, String str, Account account) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, isc);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo13282a(isf isf, String str, String str2, Account account, Payload payload) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, isf);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, account);
        dcl.m8165a(bj, payload);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo13283a(isi isi, String str, Account account, Payload payload) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, isi);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        dcl.m8165a(bj, payload);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo13284a(isi isi, byte[] bArr, String str, byte[] bArr2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, isi);
        bj.writeByteArray(bArr);
        bj.writeString(str);
        bj.writeByteArray(bArr2);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo13286a(isl isl, String str, byte[] bArr, Payload payload) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, isl);
        bj.writeString(str);
        bj.writeByteArray(bArr);
        dcl.m8165a(bj, payload);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo13287a(rnt rnt, String str, Account account, int i, List list) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeList(list);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo13288a(rnt rnt, String str, Account account, int i, byte[] bArr, List list) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        dcl.m8165a(bj, account);
        bj.writeInt(i);
        bj.writeByteArray(bArr);
        bj.writeStringList(list);
        mo8528b(16, bj);
    }
}
