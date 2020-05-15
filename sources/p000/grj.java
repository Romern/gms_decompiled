package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: grj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grj extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        return new Feature[]{ghy.f18280f};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof gjc) {
            return (gjc) queryLocalInterface;
        }
        return new gja(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    public grj(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 120, sat, rjz, rka);
    }
}
