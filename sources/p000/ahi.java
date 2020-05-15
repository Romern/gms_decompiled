package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: ahi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahi {

    /* renamed from: a */
    public final C0995fp f541a;

    /* renamed from: b */
    private final ComponentName f542b;

    public ahi(C0995fp fpVar, ComponentName componentName) {
        this.f541a = fpVar;
        this.f542b = componentName;
    }

    /* renamed from: a */
    public static boolean m752a(Context context, String str, ahl ahl) {
        ahl.f546a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ahl, 33);
    }

    /* renamed from: a */
    public final ahm mo702a(ahc ahc) {
        Parcel obtain;
        Parcel obtain2;
        C0993fn fnVar = new C0993fn(ahc);
        try {
            C0995fp fpVar = this.f541a;
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(fnVar);
            fpVar.f17053a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            if (readInt != 0) {
                return new ahm(fnVar, this.f542b);
            }
            return null;
        } catch (RemoteException e) {
            return null;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
