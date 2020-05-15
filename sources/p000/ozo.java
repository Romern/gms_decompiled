package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.carsetup.BinderParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ozo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ozo implements ozl {

    /* renamed from: a */
    public static final bnsn f38665a = odk.m28481a("CAR.AUTH");

    /* renamed from: b */
    public final bmzi f38666b = bmzn.m108681a(ozm.f38662a);

    /* renamed from: a */
    public final void mo22806a(Intent intent) {
        intent.putExtra("service_handshake", new BinderParcel(new ouq()));
    }

    /* renamed from: a */
    public final boolean mo22807a(Context context, Intent intent) {
        our our;
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("service_handshake");
        if (binderParcel == null) {
            return false;
        }
        IBinder iBinder = binderParcel.f29535a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshake");
            our = queryLocalInterface instanceof our ? (our) queryLocalInterface : new oup(iBinder);
        } else {
            our = null;
        }
        if (our == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            our.mo22657a(new out(this, context, atomicBoolean));
            return atomicBoolean.get();
        } catch (RemoteException e) {
            bnsi b = f38665a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("ozo", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Not completing service handshake due to error.");
            return false;
        }
    }
}
