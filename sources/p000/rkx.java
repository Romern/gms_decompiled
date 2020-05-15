package p000;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: rkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rkx {

    /* renamed from: c */
    public final int f43199c;

    public rkx(int i) {
        this.f43199c = i;
    }

    /* renamed from: a */
    public static Status m33899a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo24834a(Status status);

    /* renamed from: a */
    public abstract void mo24835a(Exception exc);

    /* renamed from: a */
    public abstract void mo24836a(rmc rmc, boolean z);

    /* renamed from: b */
    public abstract void mo24837b(rni rni);
}
