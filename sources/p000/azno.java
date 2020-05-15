package p000;

import android.graphics.Bitmap;

/* renamed from: azno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azno implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bitmap f99740a;

    /* renamed from: b */
    final /* synthetic */ aznq f99741b;

    public azno(aznq aznq, Bitmap bitmap) {
        this.f99741b = aznq;
        this.f99740a = bitmap;
    }

    public final void run() {
        aznq aznq = this.f99741b;
        Bitmap bitmap = this.f99740a;
        aznq.f99744b.f99732b.setVisibility(8);
        aznn aznn = aznq.f99744b;
        int i = aznn.f99737g;
        int i2 = aznq.f99743a;
        if (i == i2 && bitmap != null && aznn.f99738h != i2) {
            Object[] objArr = {aznq.f99748i, Integer.valueOf(i2)};
            aznq.f99744b.f99731a.setImageDrawable(azog.m85914a(aznq.f99745c, bitmap));
            aznq.f99744b.f99736f.setVisibility(8);
            aznq.f99744b.f99731a.setOnClickListener(new aznp(aznq));
            aznq.f99744b.f99738h = aznq.f99743a;
        } else if (i == i2 && aznn.f99738h != i2 && aznq.f99749j == 2 && aznq.f99748i != null) {
            aznn.f99733c.setVisibility(8);
            aznq.f99744b.f99734d.setVisibility(8);
            aznq.f99744b.f99735e.setVisibility(0);
            aznn aznn2 = aznq.f99744b;
            aznn2.f99738h = aznq.f99743a;
            aznn2.f99731a.setOnClickListener(null);
        } else {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(aznq.f99744b.f99737g), aznq.f99748i};
        }
    }
}
