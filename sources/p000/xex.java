package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Date;

/* renamed from: xex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xex implements bqfp {

    /* renamed from: a */
    private final String f52100a;

    /* renamed from: b */
    private final Transport f52101b;

    /* renamed from: c */
    private final xfz f52102c;

    public xex(String str, Transport transport, xfz xfz) {
        this.f52100a = str;
        this.f52101b = transport;
        this.f52102c = xfz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv;
        AuthenticatorResponse a = ((PublicKeyCredential) obj).mo18710a();
        if (a instanceof AuthenticatorAttestationResponse) {
            bmxv = bmxv.m108566b(((AuthenticatorAttestationResponse) a).f31724a);
        } else {
            bmxv = a instanceof AuthenticatorAssertionResponse ? bmxv.m108566b(((AuthenticatorAssertionResponse) a).f31719a) : bmvz.f131120a;
        }
        if (bmxv.mo66813a()) {
            xfz xfz = this.f52102c;
            Date date = new Date(System.currentTimeMillis());
            String str = this.f52100a;
            Transport transport = this.f52101b;
            ContentValues contentValues = new ContentValues();
            contentValues.put("usage_timestamp", xfz.m42843b().format(date));
            contentValues.put("rp_id", str);
            contentValues.put("transport", transport.f31675g);
            contentValues.put("key_handle", boan.f132470d.mo68794a((byte[]) bmxv.mo66814b()));
            try {
                adbc.m50103a(xfz.f52157b, "fido_embedded_security_key.db", true).insert("successful_ceremony_metadata", null, contentValues);
            } catch (SQLiteException e) {
                adbd a2 = adbe.m50105a();
                a2.f61234c = 8;
                a2.f61233b = e;
                a2.f61232a = "Failed to open the database.";
                throw a2.mo33301a();
            } catch (adbe e2) {
                xfz.f52156c.mo25414c("saving successful ceremony metadata failed during database write.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
