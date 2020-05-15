package p000;

import android.content.ComponentCallbacks2;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdej implements bddy, bddw {

    /* renamed from: a */
    public static final C1245ok f105415a = new C1245ok();

    /* renamed from: b */
    public static final AtomicBoolean f105416b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final ComponentCallbacks2 f105417c = new bdea();

    /* renamed from: d */
    public final bdei f105418d = new bdei();

    /* renamed from: e */
    public final Executor f105419e;

    public bdej(Executor executor) {
        bmxy.m108581a(executor);
        this.f105419e = executor;
    }

    /* renamed from: a */
    public static String m90636a(bdeo bdeo, bden bden, bdek bdek, int i) {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        Locale locale2 = Locale.ROOT;
        Object[] objArr2 = new Object[3];
        objArr2[0] = bdeo.mo57922a().getName();
        objArr2[1] = bdeo.mo57923b();
        bdcr d = bden.mo57917d();
        Object obj = ((bddt) bdek).f105384b;
        bdci bdci = d.f105341a;
        if (obj != null) {
            str = bdci.mo12343a(obj);
        } else {
            str = "null";
        }
        objArr2[2] = str;
        objArr[0] = String.format(locale2, "%s:%s:%s", objArr2);
        objArr[1] = Integer.valueOf(i);
        return String.format(locale, "%s:%s", objArr);
    }

    /* renamed from: a */
    public static void m90637a(ImageView imageView, bdeh bdeh) {
        beel.m91855b();
        bdeh bdeh2 = (bdeh) imageView.getTag(C0126R.C0129id.tag_account_image_request);
        if (bdeh2 != null) {
            bdeh2.f105411d = true;
        }
        imageView.setTag(C0126R.C0129id.tag_account_image_request, bdeh);
    }
}
