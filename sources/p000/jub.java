package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.util.List;
import java.util.Random;

/* renamed from: jub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jub implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f23221a;

    /* renamed from: b */
    final /* synthetic */ String f23222b;

    /* renamed from: c */
    final /* synthetic */ SourceChimeraActivity f23223c;

    public jub(SourceChimeraActivity sourceChimeraActivity, List list, String str) {
        this.f23223c = sourceChimeraActivity;
        this.f23221a = list;
        this.f23222b = str;
    }

    public final void run() {
        SourceChimeraActivity sourceChimeraActivity = this.f23223c;
        List list = this.f23221a;
        String str = this.f23222b;
        String string = sourceChimeraActivity.getString(C0126R.string.auth_d2d_source_notification_title);
        CharSequence expandTemplate = TextUtils.expandTemplate(sourceChimeraActivity.getResources().getQuantityString(C0126R.plurals.auth_d2d_source_notification_text, list.size()), str);
        kag.m17570a(sex.m35104a(sourceChimeraActivity), sourceChimeraActivity, "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        juw juw = new juw(sourceChimeraActivity);
        juw.mo14125a(1800000L);
        juw.mo14127a(expandTemplate);
        juw.mo14134c(expandTemplate);
        juw.mo14135d(string);
        juw.mo14126a(Uri.parse(gnv.m13579x()));
        juw.mo14132b(true);
        juw.mo14124a(17301642);
        juw.mo14136e(string);
        juw.mo14131b("com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        juv juv = new juv(sex.m35104a(sourceChimeraActivity), new skc(sourceChimeraActivity));
        int nextInt = new Random().nextInt();
        if (juw.mo14133c() <= 86400000) {
            juw a = juw.m17368a(rpr.m34216b(), juw);
            if (a.mo14133c() <= 0) {
                a.mo14125a(300000L);
                a.mo14128a(true);
            }
            a.mo14130b(System.currentTimeMillis());
            juv.mo14122a("d2d", nextInt, a);
            return;
        }
        throw new IllegalArgumentException("Notification cannot have max duration exceeding 1 day.");
    }
}
