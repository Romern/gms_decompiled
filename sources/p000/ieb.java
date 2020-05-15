package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: ieb */
final /* synthetic */ class ieb implements bmxj {

    /* renamed from: a */
    static final bmxj f20786a = new ieb();

    private ieb() {
    }

    public final Object apply(Object obj) {
        Integer num = (Integer) ied.f20788a.get(Integer.valueOf(((rjp) obj).mo24655a()));
        if (num == null) {
            num = 8;
        }
        throw idw.m15304a(new rjp(new Status(num.intValue())));
    }
}
