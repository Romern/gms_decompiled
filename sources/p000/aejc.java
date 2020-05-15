package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: aejc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aejc extends sbm {

    /* renamed from: a */
    protected final aejb f63443a = new aejb(this);

    /* renamed from: b */
    private final String f63444b;

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return aegm.f63358e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof aekb) {
            return (aekb) queryLocalInterface;
        }
        return new aejz(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f63444b);
        return bundle;
    }

    public aejc(Context context, Looper looper, rjz rjz, rka rka, String str, sat sat) {
        super(context, looper, 23, sat, rjz, rka);
        this.f63444b = str;
    }
}
