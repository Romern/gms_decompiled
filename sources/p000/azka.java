package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azka implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azdd f99545a;

    /* renamed from: b */
    final /* synthetic */ azkb f99546b;

    public azka(azkb azkb, azdd azdd) {
        this.f99546b = azkb;
        this.f99545a = azdd;
    }

    public final void run() {
        CardChimeraActivity cardChimeraActivity = this.f99546b.f99547a;
        int i = CardChimeraActivity.f111167L;
        if (TextUtils.isEmpty(cardChimeraActivity.f111228l.getText())) {
            this.f99546b.f99547a.f111228l.append(azpi.m86083c(azpi.m86066a(this.f99545a.mo54712a())));
            CardChimeraActivity cardChimeraActivity2 = this.f99546b.f99547a;
            String str = cardChimeraActivity2.f111219c.f99774a;
            Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.DELETE_DRAFT");
            intent.putExtra("conversation_id", str);
            MessagingService.m94556a(intent, cardChimeraActivity2);
        }
    }
}
