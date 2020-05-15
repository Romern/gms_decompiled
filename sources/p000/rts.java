package p000;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: rts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rts extends rtm {

    /* renamed from: b */
    private static final String[] f43675b = {"data"};

    /* renamed from: c */
    private final Parcelable.Creator f43676c;

    public rts(DataHolder dataHolder, Parcelable.Creator creator) {
        super(dataHolder);
        this.f43676c = creator;
    }

    /* renamed from: a */
    public static void m34439a(rtu rtu, SafeParcelable safeParcelable) {
        Parcel obtain = Parcel.obtain();
        safeParcelable.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        rtu.mo25160a(contentValues);
        obtain.recycle();
    }

    /* renamed from: d */
    public static rtu m34440d() {
        return DataHolder.m22537a(f43675b);
    }

    /* renamed from: b */
    public SafeParcelable mo24661a(int i) {
        DataHolder dataHolder = this.f43665a;
        byte[] e = dataHolder.mo17772e("data", i, dataHolder.mo17762a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(e, 0, e.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) this.f43676c.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
