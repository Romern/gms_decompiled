package p000;

import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.List;

/* renamed from: bkdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkdt implements Runnable {

    /* renamed from: a */
    final List f124064a;

    /* renamed from: b */
    final /* synthetic */ FormEditText f124065b;

    public bkdt(FormEditText formEditText, List list) {
        this.f124065b = formEditText;
        this.f124064a = list;
    }

    public final void run() {
        this.f124065b.setAdapter(new bkeh(this.f124065b.getContext(), this.f124064a));
    }
}
