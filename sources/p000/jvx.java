package p000;

import android.os.AsyncTask;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;

/* renamed from: jvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jvx extends AsyncTask {

    /* renamed from: a */
    private static final Logger f23380a = ght.m13171a("FrpUnlockTask");

    /* renamed from: b */
    private final jvg f23381b;

    /* renamed from: c */
    private final ixl f23382c;

    /* renamed from: d */
    private final jds f23383d;

    /* renamed from: e */
    private final String f23384e;

    public jvx(jvg jvg, jds jds, ixl ixl, String str) {
        this.f23381b = jvg;
        this.f23383d = jds;
        this.f23382c = ixl;
        this.f23384e = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!this.f23383d.mo13606a()) {
            f23380a.mo25416d("FRP not required. Device was not locked.", new Object[0]);
            return new jvw(1, 0);
        }
        CheckFactoryResetPolicyComplianceResponse a = this.f23382c.mo13424a(CheckFactoryResetPolicyComplianceRequest.m6563a(this.f23384e));
        int i = a.f10601c;
        if (i != 1) {
            return new jvw(0, i);
        }
        this.f23382c.mo13428a();
        this.f23382c.mo13429b();
        return new jvw(2, a.f10601c);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        jvw jvw = (jvw) obj;
        jvg jvg = this.f23381b;
        int i = jvw.f23378a;
        if (i == 1) {
            ((jvf) jvg).mo14146a();
        } else if (i == 2) {
            ((jvf) jvg).deliverResult(new jvh(3, null, null, null, false, null, jvw.f23379b));
        } else {
            ((jvf) jvg).deliverResult(new jvh(2, null, null, null, false, null, jvw.f23379b));
        }
    }
}
