package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Locale;

/* renamed from: aeoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoa extends sbm {

    /* renamed from: a */
    public final PlacesParams f63545a;

    /* renamed from: b */
    private final Locale f63546b = Locale.getDefault();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (queryLocalInterface instanceof aeni) {
            return (aeni) queryLocalInterface;
        }
        return new aeng(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    public aeoa(Context context, Looper looper, sat sat, rjz rjz, rka rka, String str, aemi aemi) {
        super(context, looper, 67, sat, rjz, rka);
        String str2;
        String str3 = aemi.f63522d;
        if (str3 != null) {
            str2 = str3;
        } else {
            Account account = sat.f43963a;
            str2 = account != null ? account.name : null;
        }
        this.f63545a = new PlacesParams(str, this.f63546b, str2, aemi.f63520b, aemi.f63521c);
    }
}
