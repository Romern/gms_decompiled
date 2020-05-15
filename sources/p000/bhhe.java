package p000;

import android.view.View;
import java.util.Iterator;

/* renamed from: bhhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhe implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhhh f118650a;

    public bhhe(bhhh bhhh) {
        this.f118650a = bhhh;
    }

    public void onClick(View view) {
        Iterator it = this.f118650a.f118654Z.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        this.f118650a.dismiss();
    }
}
