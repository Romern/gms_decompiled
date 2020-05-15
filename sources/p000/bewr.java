package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.List;

/* renamed from: bewr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewr {

    /* renamed from: a */
    public static final Object f112850a = new Object();

    /* renamed from: b */
    public static bewr f112851b;

    /* renamed from: c */
    public final qws f112852c;

    public bewr(Context context) {
        Account e = soz.m35804e(context);
        if (e == null) {
            List d = soz.m35801d(context, context.getPackageName());
            if (!d.isEmpty()) {
                e = (Account) d.get(0);
            }
        }
        this.f112852c = new qws(context, "ACTIVITY_RECOGNITION", e != null ? e.name : null);
    }
}
