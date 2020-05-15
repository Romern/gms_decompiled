package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity;
import java.util.ArrayList;

/* renamed from: atqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqp implements atfd {

    /* renamed from: a */
    final /* synthetic */ boolean f90679a;

    /* renamed from: b */
    final /* synthetic */ SelectUntokenizedCardChimeraActivity f90680b;

    public atqp(SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity, boolean z) {
        this.f90680b = selectUntokenizedCardChimeraActivity;
        this.f90679a = z;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.f90680b.mo59455e();
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        btjg btjg = (btjg) obj;
        this.f90680b.f108838g = btjg.f149112b.mo73780k();
        this.f90680b.f108839h = new ArrayList(btjg.f149111a);
        SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity = this.f90680b;
        selectUntokenizedCardChimeraActivity.f108840i = btjg.f149113c;
        selectUntokenizedCardChimeraActivity.f108841j = btjg.f149114d.mo73780k();
        if (!this.f90679a) {
            SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity2 = this.f90680b;
            byte[] bArr = selectUntokenizedCardChimeraActivity2.f108838g;
            if (bArr == null || bArr.length == 0) {
                selectUntokenizedCardChimeraActivity2.mo59455e();
                return;
            }
            byte[] bArr2 = selectUntokenizedCardChimeraActivity2.f108841j;
            if (bArr2 == null || bArr2.length == 0) {
                selectUntokenizedCardChimeraActivity2.mo59455e();
            } else {
                selectUntokenizedCardChimeraActivity2.mo59456g();
            }
        } else {
            this.f90680b.mo59453a(-1, (btjq) null);
        }
    }
}
