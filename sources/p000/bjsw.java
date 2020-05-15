package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bjsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LogContext logContext;
        LogContext logContext2 = new LogContext(parcel);
        bjsz a = bjsz.m104546a();
        LogContext logContext3 = (LogContext) a.f123266a.get(logContext2.f151797e);
        if (logContext3 != null) {
            return logContext3;
        }
        a.mo65516a(logContext2.mo71783b().f151801a, logContext2);
        if (logContext2.f151798f || (logContext = logContext2.f151794b) == null) {
            return logContext2;
        }
        logContext.f151795c.add(logContext2);
        return logContext2;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogContext[i];
    }
}
