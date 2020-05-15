package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: hzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hzk {

    /* renamed from: a */
    public final /* synthetic */ hzm f20592a;

    public hzk(hzm hzm) {
        this.f20592a = hzm;
    }

    /* renamed from: a */
    public final void mo12830a(ibf ibf) {
        hzu hzu = this.f20592a.f20600g;
        synchronized (hzv.class) {
            Context context = (Context) hzu.f20607a.f20611c.get();
            if (context != null) {
                hzu.f20607a.f20610b.mo12886a(context, ibf);
            }
        }
    }

    /* renamed from: a */
    public final void mo12831a(ibg ibg) {
        hzu hzu = this.f20592a.f20600g;
        synchronized (hzv.class) {
            Context context = (Context) hzu.f20607a.f20611c.get();
            if (context != null) {
                hzu.f20607a.f20610b.mo12887a(context, ibg);
            }
        }
    }

    /* renamed from: a */
    public final void mo12832a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f20592a.f20600g.mo12842a(hxw.m14998a((String) it.next(), Status.f30110d).putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", ""));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo12833a(String str, int i) {
        bmxy.m108581a(str);
        bmxy.m108589a(true, (Object) "statusCode must be a failure code.");
        this.f20592a.f20600g.mo12842a(hxv.m14997a(str, new Status(i)));
    }

    /* renamed from: a */
    public final void mo12834a(String str, String str2) {
        bmxy.m108581a(str);
        bmxy.m108581a(str2);
        this.f20592a.f20600g.mo12842a(hxv.m14997a(str, Status.f30107a).putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE", str2));
    }
}
