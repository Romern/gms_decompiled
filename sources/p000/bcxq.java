package p000;

import android.content.Context;

/* renamed from: bcxq */
final /* synthetic */ class bcxq implements bmxj {

    /* renamed from: a */
    private final Context f105108a;

    /* renamed from: b */
    private final String f105109b;

    public bcxq(Context context, String str) {
        this.f105108a = context;
        this.f105109b = str;
    }

    public final Object apply(Object obj) {
        Context context = this.f105108a;
        String str = this.f105109b;
        cbga cbga = (cbga) obj;
        bczb e = bczc.m90312e();
        e.mo57777a(cbga.f177005b.getKey());
        e.mo57776a(cbga.f177004a);
        cbdj cbdj = cbga.f177006c;
        if (cbdj == null) {
            cbdj = cbdj.f176740j;
        }
        e.mo57774a((bcov) bclb.m89215a(context, cbdj, bmxv.m108566b(str), bmxv.m108566b(str)).mo66814b());
        cbdr cbdr = cbga.f177007d;
        if (cbdr == null) {
            cbdr = cbdr.f176775f;
        }
        e.mo57775a(bclj.m89242a(cbdr));
        return e.mo57773a();
    }
}
