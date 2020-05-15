package p000;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avkk extends dcj implements avkm {
    public avkk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.IUpdateFromSdCardService");
    }

    /* renamed from: a */
    public final int mo51333a() {
        Parcel a = mo8526a(2, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final void mo51335b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(4, bj);
    }

    /* renamed from: c */
    public final void mo51336c() {
        mo8528b(5, mo8529bj());
    }

    /* renamed from: d */
    public final void mo51337d() {
        mo8528b(6, mo8529bj());
    }

    /* renamed from: a */
    public final List mo51334a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(3, bj);
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }
}
