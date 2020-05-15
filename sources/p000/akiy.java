package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import java.util.List;

/* renamed from: akiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akiy extends soa {

    /* renamed from: a */
    private final Context f72066a;

    /* renamed from: b */
    private final akix f72067b;

    /* renamed from: c */
    private final Intent f72068c;

    public akiy(Context context, akix akix, Intent intent) {
        super(9);
        this.f72066a = context;
        this.f72067b = akix;
        this.f72068c = intent;
    }

    public final void run() {
        List b = akhv.m59744b(this.f72066a, this.f72068c);
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = b;
        this.f72067b.sendMessage(obtain);
    }
}
