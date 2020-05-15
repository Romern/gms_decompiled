package p000;

import android.content.ContentValues;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbzv */
final /* synthetic */ class bbzv implements Runnable {

    /* renamed from: a */
    private final bcas f103841a;

    /* renamed from: b */
    private final boolean f103842b;

    /* renamed from: c */
    private final bdbe f103843c;

    public bbzv(bcas bcas, boolean z, bdbe bdbe) {
        this.f103841a = bcas;
        this.f103842b = z;
        this.f103843c = bdbe;
    }

    public final void run() {
        bcas bcas = this.f103841a;
        boolean z = this.f103842b;
        bdbe bdbe = this.f103843c;
        if (!z) {
            Pair c = bcas.m88656c(bdbe);
            if (bcas.f103908c.mo54675a(bcas.mo56655d("blocks"), (String) c.first, (String[]) c.second) > 0) {
                bcas.mo56644b(bdbe);
                return;
            }
            return;
        }
        bdae bdae = bcas.f103908c;
        Uri d = bcas.mo56655d("blocks");
        ContentValues contentValues = new ContentValues();
        if (bdbe.mo57837b() == ConversationId.IdType.ONE_TO_ONE) {
            bcbr bcbr = (bcbr) bcbs.f103946a.mo66855c(bdbe.mo57841c().mo60494c());
            contentValues.put("lighter_id_id", bdbe.mo57841c().mo60492a());
            contentValues.put("lighter_id_normalized_id", bcbr == bcbr.EMAIL ? bboo.m88285a(bdbe.mo57841c().mo60492a()) : bdbe.mo57841c().mo60492a());
            contentValues.put("lighter_id_type", Integer.valueOf(bcbr.f103945g));
            contentValues.put("lighter_handler_id", (String) bdbe.mo57841c().mo60495d().mo66812a(""));
            contentValues.put("lighter_id_app_name", bdbe.mo57841c().mo60493b());
        } else {
            contentValues.put("lighter_id_type", Integer.toString(bcbr.GROUP.f103945g));
            contentValues.put("lighter_id_id", bdbe.mo57836a().mo60503a());
            contentValues.put("lighter_id_normalized_id", bdbe.mo57836a().mo60503a());
            contentValues.put("lighter_id_app_name", bdbe.mo57836a().mo60504b());
            contentValues.put("lighter_handler_id", "");
        }
        if (bdae.mo54676a(d, contentValues, 5) > 0) {
            bcas.mo56644b(bdbe);
        }
    }
}
