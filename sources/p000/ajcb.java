package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import java.util.List;

/* renamed from: ajcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajcb extends dcj implements ajcd {
    public ajcb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    /* renamed from: a */
    public final void mo38478a(MessageWrapper messageWrapper) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, messageWrapper);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo38480b(MessageWrapper messageWrapper) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, messageWrapper);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo38479a(List list) {
        Parcel bj = mo8529bj();
        bj.writeTypedList(list);
        mo8530c(4, bj);
    }
}
