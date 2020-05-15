package p000;

import android.content.ContentValues;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvk extends saf {

    /* renamed from: a */
    public final ConnectionResult f77771a;

    /* renamed from: b */
    public final ansz f77772b;

    public anvk(anwj anwj, aoae aoae, ConnectionResult connectionResult, ansz ansz) {
        super(anwj, aoae);
        this.f77771a = connectionResult;
        this.f77772b = ansz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        aoae aoae = (aoae) obj;
        ConnectionResult connectionResult = this.f77771a;
        ansz ansz = this.f77772b;
        aoae.f78007a.f78020k = false;
        if (connectionResult.mo17671b() && ansz != null) {
            aoae.f78007a.f78016g = ansz;
        } else {
            Activity activity = aoae.f78007a.getActivity();
            if (activity != null) {
                shz.m35339a(activity, aoae.f78007a.f78013d, (String) null, anlp.f77075h, anlq.f77076a, aoae.f78007a.f78012c);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", aoae.f78007a.f78011b);
            contentValues.put("url", aoae.f78007a.f78011b);
            contentValues.put("type", "article");
            aoae.f78007a.f78016g = new ansz(contentValues);
        }
        aoah aoah = aoae.f78007a;
        aoah.mo42513a(aoah.f78016g);
        aoah aoah2 = aoae.f78007a;
        aoah2.mo42512a(aoah2.f78022m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
