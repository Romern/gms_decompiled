package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;

/* renamed from: arja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arja extends dcj implements arjc {
    public arja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
    }

    /* renamed from: a */
    public final void mo48590a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: b */
    public final void mo48596b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo48591a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo48592a(BootstrapCompletionResult bootstrapCompletionResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapCompletionResult);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo48593a(TargetConnectionArgs targetConnectionArgs) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, targetConnectionArgs);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo48594a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final boolean mo48595a(BootstrapProgressResult bootstrapProgressResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bootstrapProgressResult);
        Parcel a = mo8526a(3, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
