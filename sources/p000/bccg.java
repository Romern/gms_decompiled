package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: bccg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bccg {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static ContentValues m88798a(bcoh bcoh, bcoz bcoz) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tachyon_app_name", bcoh.mo57061e());
        contentValues.put("server_registration_id", bcoh.mo57059c().getKey());
        contentValues.put("server_registration_status", Integer.valueOf(bcoh.mo57060d().f104618c));
        contentValues.put("tachyon_auth_token", bqce.m112561a(bcoz.mo57131a()));
        contentValues.put("auth_token_expire_at_timestamp_ms", bcoz.mo57132b());
        contentValues.put("auth_token_refreshed_at_timestamp_ms", bcoz.mo57133c());
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int h = bcoz.mo57137h();
        int i = h - 1;
        if (h != 0) {
            if (i == 0) {
                contentValues.put("identity_key_type", (Integer) 0);
            } else if (i == 1) {
                contentValues.put("identity_key_type", (Integer) 1);
                contentValues.put("identity_key_private", bcoz.mo57134d().getPrivate().getEncoded());
                contentValues.put("identity_key_public", bcoz.mo57134d().getPublic().getEncoded());
            } else if (i == 2) {
                contentValues.put("identity_key_type", (Integer) 2);
                contentValues.put("identity_key_private", (byte[]) bcoz.mo57135e().first);
                contentValues.put("identity_key_public", (byte[]) bcoz.mo57135e().second);
            }
            return contentValues;
        }
        throw null;
    }

    /* renamed from: a */
    public static bmxv m88799a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bmvz.f131120a;
        }
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            return bmxv.m108566b(new KeyPair(instance.generatePublic(new X509EncodedKeySpec(bArr)), instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2))));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            return bmvz.f131120a;
        }
    }
}
