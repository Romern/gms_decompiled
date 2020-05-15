package p000;

import android.content.Context;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: avgg */
final /* synthetic */ class avgg implements bmxj {

    /* renamed from: a */
    private final Context f93123a;

    public avgg(Context context) {
        this.f93123a = context;
    }

    public final Object apply(Object obj) {
        Context context = this.f93123a;
        bqbu bqbu = (bqbu) obj;
        String str = bqbu.f140431a;
        bmxy.m108600b(bqbu.mo69009a());
        return new adym(new shl(context, str, bqbu.f140432b, context.getApplicationInfo().uid, FragmentTransaction.TRANSIT_FRAGMENT_OPEN));
    }
}
