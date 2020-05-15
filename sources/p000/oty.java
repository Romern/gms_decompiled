package p000;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;

/* renamed from: oty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oty extends dck implements otz {

    /* renamed from: a */
    private final Context f38455a;

    /* renamed from: b */
    private int f38456b;

    /* renamed from: c */
    private volatile pbp f38457c;

    /* renamed from: d */
    private final npd f38458d;

    public oty() {
        super("com.google.android.gms.carsetup.ICarData");
    }

    /* renamed from: a */
    public final synchronized void mo22642a() {
        if (this.f38456b == 0) {
            this.f38457c = new pbp(this.f38455a);
        }
        this.f38456b++;
    }

    /* renamed from: c */
    public final synchronized void mo22647c() {
        int i = this.f38456b - 1;
        this.f38456b = i;
        if (i == 0) {
            this.f38457c.close();
            this.f38457c = null;
        }
    }

    /* renamed from: d */
    public final List mo22648d() {
        return this.f38457c.mo22881a();
    }

    /* renamed from: e */
    public final List mo22649e() {
        pbp pbp = this.f38457c;
        return pbp.mo22882a("rejectedcars", pbp.getReadableDatabase());
    }

    /* renamed from: f */
    public final void mo22650f() {
        this.f38457c.mo22887b();
    }

    /* renamed from: a */
    public final void mo22643a(CarInfoInternal carInfoInternal) {
        pbp pbp = this.f38457c;
        CarInfo carInfo = carInfoInternal.f29539a;
        String str = carInfo.f29335d;
        if (str == null) {
            bnsi c = pbp.f38794a.mo68388c();
            c.mo68432a("pbp", "c", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("vehicleId for client is null!");
            return;
        }
        String[] strArr = {str, carInfo.f29332a};
        ContentValues contentValues = new ContentValues();
        contentValues.put("bluetoothaddress", carInfoInternal.f29544f);
        contentValues.put("wifissid", carInfoInternal.f29545g);
        contentValues.put("wifibssid", carInfoInternal.f29546h);
        contentValues.put("wifipassword", carInfoInternal.f29547i);
        contentValues.put("wifisecurity", Integer.valueOf(carInfoInternal.f29548j));
        try {
            pbp.getWritableDatabase().update("allowedcars", contentValues, "vehicleidclient = ? AND manufacturer = ?", strArr);
        } catch (Exception e) {
            bnsi b = pbp.f38794a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbp", "c", 842, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error updating car wifi info");
        }
    }

    public oty(Context context, npd npd) {
        super("com.google.android.gms.carsetup.ICarData");
        this.f38456b = 0;
        this.f38455a = context;
        this.f38458d = npd;
    }

    /* renamed from: a */
    public final void mo22644a(String str, String str2) {
        pbp pbp = this.f38457c;
        pbp.mo22883a(str, str2, "allowedcars");
        pbp.mo22883a(str, str2, "rejectedcars");
    }

    /* renamed from: a */
    public final void mo22645a(String str, String str2, String str3) {
        pbp pbp = this.f38457c;
        pbp.mo22884a(str, str2, str3, "allowedcars");
        pbp.mo22884a(str, str2, str3, "rejectedcars");
    }

    /* renamed from: a */
    public final void mo22646a(boolean z) {
        this.f38458d.mo21383a(z);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo22642a();
                parcel2.writeNoException();
                return true;
            case 2:
                mo22647c();
                parcel2.writeNoException();
                return true;
            case 3:
                List d = mo22648d();
                parcel2.writeNoException();
                parcel2.writeTypedList(d);
                return true;
            case 4:
                List e = mo22649e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e);
                return true;
            case 5:
                mo22645a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo22644a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 7:
                mo22650f();
                parcel2.writeNoException();
                return true;
            case 8:
                mo22643a((CarInfoInternal) dcl.m8163a(parcel, CarInfoInternal.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                mo22646a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 10:
            default:
                return false;
            case 11:
                CarInfo carInfo = (CarInfo) dcl.m8163a(parcel, CarInfo.CREATOR);
                pbp pbp = this.f38457c;
                CarInfoInternal a = pbp.mo22879a(carInfo, "allowedcars");
                if (a == null) {
                    a = pbp.mo22879a(carInfo, "rejectedcars");
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
        }
    }
}
