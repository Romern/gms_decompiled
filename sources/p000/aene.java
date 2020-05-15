package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Locale;

/* renamed from: aene */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aene extends sbm {

    /* renamed from: a */
    public final PlacesParams f63536a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (queryLocalInterface instanceof aenl) {
            return (aenl) queryLocalInterface;
        }
        return new aenj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aene(Context context, Looper looper, sat sat, rjz rjz, rka rka, String str, aemi aemi) {
        super(context, looper, 65, sat, rjz, rka);
        String str2;
        aemi aemi2 = aemi;
        Locale locale = Locale.getDefault();
        String str3 = aemi2.f63522d;
        if (str3 != null) {
            str2 = str3;
        } else {
            Account account = sat.f43963a;
            str2 = account != null ? account.name : null;
        }
        this.f63536a = new PlacesParams(str, locale, str2, aemi2.f63520b, aemi2.f63521c);
    }
}
