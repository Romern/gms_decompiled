package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: alzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alzn extends dcj implements alzp {
    public alzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    /* renamed from: a */
    public final Bundle mo40540a(alzm alzm, boolean z, String str, String str2, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8166a(bj, z);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeInt(i);
        Parcel a = mo8526a(11, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final Bundle mo40541a(String str, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final Bundle mo40542a(String str, String str2, long j) {
        throw null;
    }

    /* renamed from: a */
    public final Bundle mo40543a(String str, String str2, long j, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final sce mo40548a(alzm alzm, String str, int i) {
        throw null;
    }

    /* renamed from: a */
    public final sce mo40549a(alzm alzm, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40551a(alzm alzm, Account account, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40552a(alzm alzm, Uri uri) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40553a(alzm alzm, Uri uri, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40554a(alzm alzm, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40557a(alzm alzm, String str, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40558a(alzm alzm, String str, String str2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40559a(alzm alzm, String str, String str2, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40560a(alzm alzm, String str, String str2, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40561a(alzm alzm, String str, String str2, Uri uri) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40564a(alzm alzm, String str, String str2, String str3, int i, String str4) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40566a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40567a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40570a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40571a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40572a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40575a(alzm alzm, String str, String str2, String str3, boolean z, int i) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40576a(alzm alzm, String str, String str2, String str3, boolean z, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40577a(alzm alzm, String str, String str2, String[] strArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40578a(alzm alzm, boolean z, boolean z2, String str, String str2) {
        throw null;
    }

    /* renamed from: b */
    public final Bundle mo40580b(String str, String str2) {
        throw null;
    }

    /* renamed from: b */
    public final void mo40583b() {
        throw null;
    }

    /* renamed from: b */
    public final void mo40584b(alzm alzm, Account account, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo40585b(alzm alzm, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo40587b(alzm alzm, String str, String str2, int i) {
        throw null;
    }

    /* renamed from: c */
    public final sce mo40589c(alzm alzm, String str, String str2, int i) {
        throw null;
    }

    /* renamed from: c */
    public final void mo40590c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo40593d(alzm alzm, Account account, String str) {
        throw null;
    }

    /* renamed from: d */
    public final void mo40594d(alzm alzm, String str, String str2) {
        throw null;
    }

    /* renamed from: e */
    public final sce mo40595e(alzm alzm, String str, String str2) {
        throw null;
    }

    /* renamed from: b */
    public final sce mo40581b(alzm alzm, String str, int i, int i2) {
        sce sce;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(502, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            sce = queryLocalInterface instanceof sce ? (sce) queryLocalInterface : new scc(readStrongBinder);
        } else {
            sce = null;
        }
        a.recycle();
        return sce;
    }

    /* renamed from: c */
    public final void mo40591c(alzm alzm, Account account, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8165a(bj, account);
        bj.writeString(str);
        mo8528b(2101, bj);
    }

    /* renamed from: c */
    public final void mo40592c(alzm alzm, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(102, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final Bundle mo40544a(String str, String str2, long j, boolean z, boolean z2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeLong(j);
        dcl.m8166a(bj, z);
        dcl.m8166a(bj, false);
        Parcel a = mo8526a(205, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final sce mo40545a(alzm alzm, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        sce sce;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8165a(bj, accountToken);
        dcl.m8165a(bj, parcelableListOptions);
        Parcel a = mo8526a(601, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            sce = queryLocalInterface instanceof sce ? (sce) queryLocalInterface : new scc(readStrongBinder);
        } else {
            sce = null;
        }
        a.recycle();
        return sce;
    }

    /* renamed from: b */
    public final sce mo40582b(alzm alzm, String str, String str2, int i, int i2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        sce sce = null;
        bj.writeString(null);
        bj.writeInt(i);
        bj.writeInt(i2);
        Parcel a = mo8526a(505, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof sce) {
                sce = (sce) queryLocalInterface;
            } else {
                sce = new scc(readStrongBinder);
            }
        }
        a.recycle();
        return sce;
    }

    /* renamed from: a */
    public final sce mo40546a(alzm alzm, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        sce sce;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8165a(bj, avatarReference);
        dcl.m8165a(bj, parcelableLoadImageOptions);
        Parcel a = mo8526a(508, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            sce = queryLocalInterface instanceof sce ? (sce) queryLocalInterface : new scc(readStrongBinder);
        } else {
            sce = null;
        }
        a.recycle();
        return sce;
    }

    /* renamed from: b */
    public final void mo40586b(alzm alzm, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(101, bj);
    }

    /* renamed from: a */
    public final sce mo40547a(alzm alzm, String str) {
        sce sce;
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        Parcel a = mo8526a(504, bj);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            sce = queryLocalInterface instanceof sce ? (sce) queryLocalInterface : new scc(readStrongBinder);
        } else {
            sce = null;
        }
        a.recycle();
        return sce;
    }

    /* renamed from: b */
    public final void mo40588b(alzm alzm, String str, String str2, String str3, int i, String str4) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeInt(i);
        bj.writeString(str4);
        mo8528b(22, bj);
    }

    /* renamed from: a */
    public final void mo40555a(alzm alzm, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8165a(bj, bundle);
        mo8528b(304, bj);
    }

    /* renamed from: a */
    public final void mo40556a(alzm alzm, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8165a(bj, accountToken);
        bj.writeStringList(list);
        dcl.m8165a(bj, parcelableGetOptions);
        mo8528b(501, bj);
    }

    /* renamed from: a */
    public final void mo40562a(alzm alzm, String str, String str2, Uri uri, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8165a(bj, uri);
        dcl.m8166a(bj, z);
        mo8528b(18, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo40563a(alzm alzm, String str, String str2, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeString(null);
        dcl.m8166a(bj, true);
        mo8528b(701, bj);
    }

    /* renamed from: a */
    public final void mo40565a(alzm alzm, String str, String str2, String str3, int i, String str4, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(null);
        bj.writeInt(i);
        bj.writeString(str4);
        dcl.m8166a(bj, z);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo40568a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(null);
        bj.writeInt(7);
        dcl.m8166a(bj, z);
        bj.writeInt(i2);
        bj.writeInt(0);
        bj.writeString(null);
        dcl.m8166a(bj, z2);
        bj.writeInt(i4);
        bj.writeInt(3);
        mo8528b((int) ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED, bj);
    }

    /* renamed from: a */
    public final void mo40569a(alzm alzm, String str, String str2, String str3, List list) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeStringList(list);
        mo8528b(28, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo40573a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(null);
        bj.writeStringList(list);
        bj.writeInt(2097151);
        dcl.m8166a(bj, false);
        bj.writeLong(0);
        bj.writeString(str4);
        bj.writeInt(7);
        bj.writeInt(0);
        bj.writeInt(0);
        mo8528b(404, bj);
    }

    /* renamed from: a */
    public final void mo40574a(alzm alzm, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        bj.writeStringList(list);
        bj.writeStringList(list2);
        dcl.m8165a(bj, favaDiagnosticsEntity);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo40579a(alzm alzm, boolean z, boolean z2, String str, String str2, int i) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, alzm);
        dcl.m8166a(bj, z);
        dcl.m8166a(bj, z2);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeInt(i);
        mo8528b(305, bj);
    }
}
