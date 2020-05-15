package p000;

import android.util.Log;

/* renamed from: amss */
final /* synthetic */ class amss implements aubq {

    /* renamed from: a */
    private final String f75875a;

    /* renamed from: b */
    private final bsqv f75876b;

    public amss(String str, bsqv bsqv) {
        this.f75875a = str;
        this.f75876b = bsqv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        String str = this.f75875a;
        bsqv bsqv = this.f75876b;
        if (aucb.mo50384b()) {
            Object[] objArr = {str, bsqv.mo74062i()};
        } else {
            Log.e("CoreUiAuditRecordUtil", "Error logging the audit record", aucb.mo50387e());
        }
    }
}
