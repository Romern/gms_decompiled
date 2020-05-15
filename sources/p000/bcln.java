package p000;

import android.content.Context;

/* renamed from: bcln */
final /* synthetic */ class bcln implements bmxj {

    /* renamed from: a */
    private final bcoh f104434a;

    /* renamed from: b */
    private final Context f104435b;

    /* renamed from: c */
    private final String f104436c;

    /* renamed from: d */
    private final bcnt f104437d;

    public bcln(bcoh bcoh, Context context, String str, bcnt bcnt) {
        this.f104434a = bcoh;
        this.f104435b = context;
        this.f104436c = str;
        this.f104437d = bcnt;
    }

    public final Object apply(Object obj) {
        bcoh bcoh = this.f104434a;
        String str = this.f104436c;
        bcnt bcnt = this.f104437d;
        cbgc cbgc = (cbgc) obj;
        bcua f = bcub.m89996f();
        f.mo57562a(cbgc.f177012a);
        cbgh cbgh = cbgc.f177013b;
        if (cbgh != null) {
            bcui a = bcui.m90016a(cbgh.f177034a);
            if (a.equals(bcui.UNKNOWN)) {
                bcnr q = bcns.m89409q();
                q.mo57011b(24);
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                q.mo57013b(str);
                q.mo57003a(114);
                bcnt.mo56753a(q.mo57002a());
            }
            f.mo57560a(a);
        }
        if (cbgc.f177014c.size() != 0) {
            f.mo57563b(bbow.m88301a(cbgc.f177014c, new bclq(bcoh, str, bcnt)));
        }
        if (cbgc.f177015d.size() != 0) {
            f.mo57561a(bbow.m88301a(cbgc.f177015d, new bclr(bcoh, str, bcnt)));
        }
        return f.mo57559a();
    }
}
