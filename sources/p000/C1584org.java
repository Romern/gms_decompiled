package p000;

import android.view.View;
import com.google.android.gms.carsetup.CarErrorDisplayActivityImpl;

/* renamed from: org */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1584org implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CarErrorDisplayActivityImpl f38274a;

    public C1584org(CarErrorDisplayActivityImpl carErrorDisplayActivityImpl) {
        this.f38274a = carErrorDisplayActivityImpl;
    }

    public void onClick(View view) {
        if (!this.f38274a.isFinishing()) {
            this.f38274a.finish();
        }
    }
}
