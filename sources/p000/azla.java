package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azla implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azlb f99574a;

    public azla(azlb azlb) {
        this.f99574a = azlb;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void
     arg types: [android.widget.ImageButton, int]
     candidates:
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, android.graphics.Bitmap):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(boolean, java.lang.String):boolean
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(java.lang.String, java.lang.String):void
      azmy.a(java.lang.String, java.lang.String):void
      azdo.a(int, boolean):void
      com.google.android.libraries.matchstick.ui.CardChimeraActivity.a(android.view.View, boolean):void */
    public final void run() {
        azlb azlb = this.f99574a;
        if (!azlb.f99576b && !TextUtils.isEmpty(azlb.f99579h)) {
            CardChimeraActivity cardChimeraActivity = azlb.f99580i;
            int i = CardChimeraActivity.f111167L;
            cardChimeraActivity.f111224h.setText(azlb.f99579h);
        }
        Bitmap bitmap = azlb.f99577c;
        if (bitmap != null) {
            CardChimeraActivity cardChimeraActivity2 = azlb.f99580i;
            int i2 = CardChimeraActivity.f111167L;
            cardChimeraActivity2.f111226j.setImageBitmap(bitmap);
            if (azlb.f99575a.mo55105c()) {
                CardChimeraActivity cardChimeraActivity3 = azlb.f99580i;
                if (cardChimeraActivity3.f111178J == null) {
                    cardChimeraActivity3.f111178J = azcj.m85279a(cardChimeraActivity3.getApplicationContext());
                }
                azlb.f99580i.f111178J.mo54629a((LocalEntityId) azlb.f99578d.get(0), azlb.f99577c, true, false);
            }
        }
        if (azlb.f99580i.mo55080r()) {
            CardChimeraActivity cardChimeraActivity4 = azlb.f99580i;
            ImageButton imageButton = cardChimeraActivity4.f111230n;
            int i3 = CardChimeraActivity.f111167L;
            cardChimeraActivity4.mo60405a((View) imageButton, false);
            azlb.f99580i.f111228l.setText("");
            String c = azlb.f99580i.mo60412c(11);
            if (!TextUtils.isEmpty(c)) {
                if (!cfdk.m138732b()) {
                    azlb.f99580i.f111228l.setHint(c);
                } else {
                    azlb.f99580i.f111229m.setText(c);
                }
            }
            azlb.f99580i.f111228l.setEnabled(false);
        }
    }
}
