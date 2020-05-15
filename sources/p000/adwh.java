package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: adwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwh extends dcj implements IInterface {
    public adwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    /* renamed from: a */
    public final void mo33860a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo33862b(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo33861a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(2, bj);
    }
}
