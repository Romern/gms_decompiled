package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: avlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlp {

    /* renamed from: a */
    public static final Logger f93322a = new Logger("SystemUpdate", "Backend", "ConfigDeliveryServiceGrpcWrapper");

    /* renamed from: b */
    public final avlo f93323b;

    /* renamed from: c */
    public final ClientContext f93324c;

    public avlp(Context context, String str, int i) {
        this.f93323b = new avlo(new shl(context, str, i, context.getApplicationInfo().uid, 1033));
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = context.getPackageName();
        clientContext.f30216f = context.getPackageName();
        this.f93324c = clientContext;
    }

    /* renamed from: a */
    public final void mo51357a() {
        this.f93323b.f93321a.mo25561g();
    }
}
