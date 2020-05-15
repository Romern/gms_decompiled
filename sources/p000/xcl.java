package p000;

import android.database.Cursor;
import android.util.Pair;
import java.security.KeyPair;

/* renamed from: xcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcl {

    /* renamed from: a */
    public final String f51929a;

    /* renamed from: b */
    public final long f51930b;

    /* renamed from: c */
    public final KeyPair f51931c;

    /* renamed from: d */
    public byte[] f51932d;

    /* renamed from: e */
    public byte[] f51933e;

    public xcl(Cursor cursor) {
        KeyPair keyPair;
        Pair pair;
        bypx bypx;
        this.f51929a = cursor.getString(cursor.getColumnIndex("id"));
        xcm.m42657a().parse(cursor.getString(cursor.getColumnIndex("registration_time")));
        this.f51930b = cursor.getLong(cursor.getColumnIndex("counter"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("key_data"));
        byte[] bArr = null;
        if (Character.getNumericValue(this.f51929a.charAt(0)) != xmq.SOFTWARE.f52779d) {
            keyPair = null;
        } else {
            keyPair = blob != null ? xcm.m42656a(blob) : null;
        }
        this.f51931c = keyPair;
        String str = this.f51929a;
        if (blob != null) {
            try {
                if (Character.getNumericValue(str.charAt(0)) == xmq.SOFTWARE.f52779d) {
                    bnim bnim = bypx.m125087b(blob).mo74447f().f167361a;
                    byps a = bypx.m125083a(3);
                    if (bnim.containsKey(a)) {
                        bypx = (bypx) bnim.get(a);
                    } else {
                        pair = null;
                    }
                } else {
                    bypx = bypx.m125087b(blob);
                }
                try {
                    bnim bnim2 = bypx.mo74447f().f167361a;
                    if (bnim2.containsKey(xcm.f51934a)) {
                        if (((bypx) bnim2.get(xcm.f51934a)).mo74446e().f167358a == 1) {
                            if (bnim2.containsKey(xcm.f51935b) && bnim2.containsKey(xcm.f51936c)) {
                                pair = Pair.create(((bypx) bnim2.get(xcm.f51935b)).mo74445d().f167357a.getKey(), ((bypx) bnim2.get(xcm.f51936c)).mo74445d().f167357a.getKey());
                            } else {
                                xcm.f51938e.mo25418e("Missing key material in cable keys decoding", new Object[0]);
                                pair = null;
                            }
                        }
                    }
                    xcm.f51938e.mo25418e("Missing or unknown version cable keys decoding", new Object[0]);
                    pair = null;
                } catch (bypw e) {
                    xcm.f51938e.mo25417e("Unable to deserialize object.", e, new Object[0]);
                    pair = null;
                }
            } catch (bypq | bypw e2) {
                adbd a2 = adbe.m50105a();
                a2.f61234c = 8;
                a2.f61233b = e2;
                a2.f61232a = "Unable to get cable key material.";
                throw a2.mo33301a();
            }
        } else {
            pair = null;
        }
        this.f51932d = pair != null ? (byte[]) pair.first : null;
        this.f51933e = pair != null ? (byte[]) pair.second : bArr;
    }
}
