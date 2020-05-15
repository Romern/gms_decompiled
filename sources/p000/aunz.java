package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: aunz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunz extends dcj implements auob {
    public aunz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.trustagent.common.service.IPreferenceService");
    }

    /* renamed from: a */
    public final Bundle mo50713a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(1, bj);
        Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final void mo50719b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo50714a(String str, int i) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeInt(i);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo50715a(String str, long j) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeLong(j);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo50716a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo50717a(String str, List list) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeStringList(list);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo50718a(String str, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8166a(bj, z);
        mo8528b(2, bj);
    }
}
