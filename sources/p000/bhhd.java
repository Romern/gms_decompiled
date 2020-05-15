package p000;

import android.view.View;
import java.util.Iterator;

/* renamed from: bhhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhd implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhhh f118649a;

    public bhhd(bhhh bhhh) {
        this.f118649a = bhhh;
    }

    public void onClick(View view) {
        Iterator it = this.f118649a.f118653Y.iterator();
        while (it.hasNext()) {
            this.f118649a.f118655aa.mo71131a();
            ((bhhi) it.next()).mo63760a();
        }
        this.f118649a.dismiss();
    }
}
