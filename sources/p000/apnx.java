package p000;

import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;

/* renamed from: apnx */
public final /* synthetic */ class apnx implements roo {

    /* renamed from: a */
    private final String f84753a;

    public apnx(String str) {
        this.f84753a = str;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f84753a;
        apno apno = new apno((aucf) obj2);
        ((apns) ((apoa) obj).mo25289B()).mo47446a(new ClearDebugUiCacheCall$Request(str), apno);
    }
}
