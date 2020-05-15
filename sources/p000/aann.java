package p000;

import android.content.Intent;
import java.util.List;

/* renamed from: aann */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aann extends aamb {

    /* renamed from: a */
    final /* synthetic */ List f28586a;

    /* renamed from: b */
    final /* synthetic */ aanr f28587b;

    public aann(aanr aanr, List list) {
        this.f28587b = aanr;
        this.f28586a = list;
    }

    /* renamed from: a */
    public final void mo16993a(long j, blmp blmp) {
        if (this.f28586a.contains(Long.toString(j))) {
            aajt aajt = this.f28587b.f28625r;
            Intent intent = new Intent(aajt.mo16915b());
            intent.setPackage(blmp.f126870e);
            intent.putExtra("event", "sent");
            intent.putExtra("message_type", "send_event");
            intent.putExtra("google.message_id", blmp.f126867b);
            aajt.mo16908a(intent, blmp, aaob.m21739a(blmp));
        }
    }
}
