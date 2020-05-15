package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: moc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moc extends sbm {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreService");
        if (queryLocalInterface instanceof mos) {
            return (mos) queryLocalInterface;
        }
        return new moq(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.backup.GMS_MODULE_RESTORE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.backup.internal.IGmsRestoreService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 16200000;
    }

    public moc(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, sat, rjz, rka);
    }
}
