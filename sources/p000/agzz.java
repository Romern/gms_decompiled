package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: agzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzz {

    /* renamed from: a */
    public final ClientContext f66921a;

    /* renamed from: b */
    public final Context f66922b;

    /* renamed from: c */
    public final String f66923c;

    public agzz(Context context, String str) {
        this.f66922b = context;
        this.f66923c = str;
        new Object[1][0] = Integer.valueOf(context.getApplicationInfo().uid);
        int i = eoa.f15378a;
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = context.getApplicationInfo().uid;
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30215e = "com.google.android.gms";
        this.f66921a = clientContext;
        Object[] objArr = {cfnj.m140615e(), Integer.valueOf((int) cfnj.m140616f()), str.substring(str.length() - 2)};
    }
}
