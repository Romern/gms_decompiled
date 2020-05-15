package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: abky */
public final /* synthetic */ class abky implements bqeh {

    /* renamed from: a */
    private final abla f57651a;

    /* renamed from: b */
    private final Context f57652b;

    /* renamed from: c */
    private final abij f57653c;

    public abky(abla abla, Context context, abij abij) {
        this.f57651a = abla;
        this.f57652b = context;
        this.f57653c = abij;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        abla abla = this.f57651a;
        Context context = this.f57652b;
        abij abij = this.f57653c;
        byte[] bArr = (byte[]) obj;
        try {
            Parcelable.Creator creator = Intent.CREATOR;
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Object createFromParcel = creator.createFromParcel(obtain);
            obtain.recycle();
            abla.mo32198b(context, (Intent) createFromParcel, abij);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) abla.f57655a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abla", "a", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("failed to re-create the notification intent. This is expected in case of an OS update for example.");
        }
        return bqga.m112775a((Object) null);
    }
}
