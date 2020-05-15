package p000;

import android.graphics.Bitmap;

/* renamed from: bdeb */
final /* synthetic */ class bdeb implements bdep {

    /* renamed from: a */
    private final bdeh f105393a;

    /* renamed from: b */
    private final String f105394b;

    /* renamed from: c */
    private final Object f105395c;

    /* renamed from: d */
    private final int f105396d;

    public bdeb(bdeh bdeh, String str, Object obj, int i) {
        this.f105393a = bdeh;
        this.f105394b = str;
        this.f105395c = obj;
        this.f105396d = i;
    }

    /* renamed from: a */
    public final void mo57931a(Bitmap bitmap) {
        bdeh bdeh = this.f105393a;
        String str = this.f105394b;
        Object obj = this.f105395c;
        int i = this.f105396d;
        if (bdeh.f105411d) {
            return;
        }
        if (bitmap == null) {
            bdeh.mo57939a(new bdee(bdeh, obj, i));
        } else {
            bdeh.mo57939a(new bded(bdeh, str, bitmap));
        }
    }
}
